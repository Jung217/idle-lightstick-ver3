package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.pairip.licensecheck.ILicenseV2ResultListener;
import com.pairip.licensecheck.LicenseActivity;
import com.pairip.licensecheck.LicenseClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LicenseClient implements ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    private static final Handler handler;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr96ZKpBW7kta0BmS4nLRdqjWvMHmq+eB0Lj27I22+G4HSqaOXLwx8TKm90ARkOf26kFXMpHEhi2umH9MSO5SYZ267aRuW/zgMAz3BtOezHZeYhtWJ3c0QeoMZgdtB0xtZBUgrbQFINTeaguVqLMKrP/LoRVR3p80TMuHety9p6Kp7jPwdJDKBwDK1pgCBK7wmCObLyRtHMi6XA7ICq5po7OQrglkBZtssAQGrBwR7ULsM5ADyRU89AAH8p4W+Hs1TipvFxyanI3lHiQxBKPOE3AqM++MZUDo8zEk60EoHmijEE2OmWx87AMuy76+CFReys+uTDciq7SHgSKOia2cYQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static ImmediateTaskExecutor mainThreadRunner = null;
    protected static String packageName = "com.studiothinkers.lightstick.idlev3";
    protected static boolean repeatedCheckEnabled = true;
    private static Bundle responsePayload;
    private final Context context;
    protected DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutorImpl();
    private int retryNum = 0;
    private boolean waitingForRepeatedCheck = false;
    protected static Runnable exitAction = new Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    };
    protected static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static ImmediateTaskExecutor backgroundRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(Runnable runnable) {
            new Thread(runnable).start();
        }
    };

    public interface DelayedTaskExecutor {
        void schedule(Runnable task, long delayMillis);
    }

    public interface ImmediateTaskExecutor {
        void run(Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    static {
        final Handler handler2 = new Handler(Looper.getMainLooper());
        handler = handler2;
        Objects.requireNonNull(handler2);
        mainThreadRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(Runnable runnable) {
                handler2.post(runnable);
            }
        };
    }

    public LicenseClient(Context context) {
        this.context = context;
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    public void initializeLicenseCheck() {
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal == 0) {
            if (localCheckEnabled) {
                backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$initializeLicenseCheck$0();
                    }
                });
                return;
            } else {
                connectToLicensingService();
                return;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 4) {
                return;
            }
            connectToLicensingService();
        } else {
            try {
                LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (LicenseCheckException e2) {
                handleError(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean zPerformLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$initializeLicenseCheck$1(zPerformLocalInstallerCheck);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z2) {
        if (z2) {
            licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
        }
        connectToLicensingService();
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.flags;
                if ((i & 1) == 0 && (i & 128) == 0) {
                    InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                    if (installSourceInfo == null) {
                        Log.i(TAG, "Local install check bypassed due to install source info not found.");
                        return false;
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null && installingPackageName.equals(SERVICE_PACKAGE)) {
                        return true;
                    }
                    Log.i(TAG, "Local install check failed due to wrong installer.");
                    return false;
                }
                Log.i(TAG, "Local install check passed due to system app.");
                return true;
            }
            Log.i(TAG, "Local install check bypassed due to app package info not found.");
            return false;
        } catch (Exception e2) {
            Log.w(TAG, "Could not obtain package info for local installer check.", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectToLicensingService() {
        Log.d(TAG, "Connecting to the licensing service...");
        try {
            if (this.context.bindService(new Intent(SERVICE_INTERFACE_CLASS_NAME).setPackage(SERVICE_PACKAGE).setAction(SERVICE_INTERFACE_CLASS_NAME), this, 1)) {
                return;
            }
            retryOrThrow(new LicenseCheckException("Could not bind with the licensing service."));
        } catch (SecurityException e2) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service.", e2));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder licensingServiceBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        int iOrdinal = licenseCheckState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$onServiceConnected$1(licensingServiceBinder);
                    }
                });
                return;
            } else if (iOrdinal != 4) {
                return;
            }
        }
        backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceConnected$0(licensingServiceBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (Exception e2) {
            Log.e(TAG, "Error while reporting license check: " + Log.getStackTraceString(e2));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (licenseCheckState.equals(LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
        } else {
            Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
            retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
        }
    }

    private void checkLicenseInternal(IBinder licensingServiceBinder) throws LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        Log.d(TAG, "Sending request to licensing service...");
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                populateInputDataForLicenseCheckV2(parcelObtain, licensingServiceBinder);
                if (!licensingServiceBinder.transact(2, parcelObtain, parcelObtain2, 0)) {
                    handleError(new LicenseCheckException("Licensing service could not process request."));
                }
            } catch (DeadObjectException e2) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e2));
            } catch (RemoteException e3) {
                handleError(new LicenseCheckException("Error when calling licensing service.", e3));
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(IBinder licensingServiceBinder) throws LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."), true);
            return;
        }
        Log.d(TAG, "Sending request to license reporting service...");
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                populateInputDataForReportAutoVerifiedLicense(parcelObtain, licensingServiceBinder);
                boolean zTransact = licensingServiceBinder.transact(3, parcelObtain, parcelObtain2, 0);
                if (!zTransact) {
                    Log.e(TAG, "Error sending request to license reporting service.");
                }
                if (zTransact) {
                    mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            LicenseClient.licenseCheckState = LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED;
                        }
                    });
                }
            } catch (DeadObjectException e2) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e2), true);
            } catch (RemoteException e3) {
                Log.e(TAG, "Error when calling licensing service." + String.valueOf(e3));
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            Log.d(TAG, "Request to licensing reporting service sent.");
        }
    }

    private void populateInputDataForLicenseCheckV2(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        inputData.writeInt(0);
    }

    private void populateInputDataForReportAutoVerifiedLicense(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient client) {
        return new ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, Bundle responsePayload2) {
                LicenseClient.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(LicenseCheckException error) {
        retryOrThrow(error, false);
    }

    private void retryOrThrow(LicenseCheckException error, boolean ignoreErrorOnFinalFailure) {
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.connectToLicensingService();
                }
            }, 1000L);
            Log.d(TAG, String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", Integer.valueOf(this.retryNum), error == null ? "null" : error.getMessage(), 1L));
        } else {
            if (ignoreErrorOnFinalFailure) {
                Log.e(TAG, "Retry limit reached for: " + String.valueOf(error));
                return;
            }
            handleError(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, final Bundle responsePayload2) {
        try {
            if (responseCode == 3) {
                throw new LicenseCheckException("Request package name invalid.");
            }
            if (responseCode != 0) {
                if (responseCode == 2) {
                    startPaywallActivity((PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
                    return;
                }
                throw new LicenseCheckException(String.format("Unexpected response code %d received.", Integer.valueOf(responseCode)));
            }
            LicenseResponseHelper.validateResponse(responsePayload2, packageName);
            Log.i(TAG, "License check succeeded.");
            final RepeatedCheckMetadata repeatedCheckMetadata = repeatedCheckEnabled ? LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null;
            mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$processResponse$0(repeatedCheckMetadata, responsePayload2);
                }
            });
        } catch (LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processResponse$0(RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = LicenseCheckState.REPEATED_CHECK_REQUIRED;
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(RepeatedCheckMetadata repeatedCheckMetadata) {
        long jMin = Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis()));
        this.waitingForRepeatedCheck = true;
        try {
            this.context.unbindService(this);
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to unbind service for repeated license check.", e2);
        }
        this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleRepeatedLicenseCheck$0();
            }
        }, jMin);
        Log.d(TAG, String.format("Repeated license check is scheduled in %d ms...", Long.valueOf(jMin)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0() {
        this.waitingForRepeatedCheck = false;
        connectToLicensingService();
    }

    private void handleError(LicenseCheckException ex) {
        Log.e(TAG, "Error while checking license: " + Log.getStackTraceString(ex));
        if (licenseCheckState.equals(LicenseCheckState.FULL_CHECK_OK)) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(PendingIntent paywallIntent) {
        Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.PAYWALL_INTENT_ARG_NAME, paywallIntent);
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.PAYWALL);
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        Intent intentCreateCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        intentCreateCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.ERROR_DIALOG);
        this.context.startActivity(intentCreateCloseAppIntentOrExitIfAppInBackground);
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, (Class<?>) LicenseActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    private static class DelayedTaskExecutorImpl implements DelayedTaskExecutor {
        private final Handler handler;

        private DelayedTaskExecutorImpl() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}
