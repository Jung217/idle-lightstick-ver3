package com.studiothinkers.lightstick.idlev3;

import A.d;
import A.e;
import A.h;
import A.i;
import A.k;
import A.l;
import A.n;
import A.o;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import t.f;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends f {
    public static final UUID N = UUID.fromString("00000000-0000-1000-8000-00805f9b34fb");
    public static BluetoothAdapter O = null;
    public static BluetoothLeScanner P = null;
    public ScheduledExecutorService F;
    public final h H;
    public final k J;
    public Toast L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f444m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WebView f449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f452v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String[] f454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f455y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f456z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BluetoothLeService f445n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f446o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f447p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f448q = {"android.permission.ACCESS_FINE_LOCATION"};
    public final String[] r = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f453w = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f443A = false;
    public long B = 0;
    public String C = null;
    public String D = null;
    public int E = Integer.MIN_VALUE;
    public final A.f G = new A.f(this, 0);
    public final i I = new i(this);
    public long K = 0;
    public final e M = new e(this);

    public MainActivity() {
        int i = 0;
        this.H = new h(this, i);
        this.J = new k(i, this);
    }

    public static boolean p(MainActivity mainActivity, ScanResult scanResult) {
        List<ParcelUuid> serviceUuids = scanResult.getScanRecord().getServiceUuids();
        if (serviceUuids != null) {
            for (int i = 0; i < serviceUuids.size(); i++) {
                if (serviceUuids.get(i).getUuid().equals(N)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static IntentFilter s() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.studiothinkers.lightstick.idlev3.ACTION_GATT_CONNECTED");
        intentFilter.addAction("com.studiothinkers.lightstick.idlev3.ACTION_GATT_DISCONNECTED");
        intentFilter.addAction("com.studiothinkers.lightstick.idlev3.ACTION_GATT_SERVICES_DISCOVERED");
        intentFilter.addAction("com.studiothinkers.lightstick.idlev3.ACTION_DATA_AVAILABLE");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        return intentFilter;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (System.currentTimeMillis() > this.K + 2000) {
            this.K = System.currentTimeMillis();
            Toast toastMakeText = Toast.makeText(this, "Tap back again to exit.", 0);
            this.L = toastMakeText;
            toastMakeText.show();
            return;
        }
        if (System.currentTimeMillis() <= this.K + 2000) {
            finish();
            this.L.cancel();
        }
    }

    @Override // t.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(4098);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(128);
        this.f449s = (WebView) findViewById(R.id.webView);
        this.f452v = (ImageView) findViewById(R.id.netErr);
        this.f451u = (LinearLayout) findViewById(R.id.intro);
        this.f450t = (FrameLayout) findViewById(R.id.webview_frame);
        int i = Build.VERSION.SDK_INT;
        r();
        bindService(new Intent(this, (Class<?>) BluetoothLeService.class), this.I, 1);
        WebSettings settings = this.f449s.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " CalvinLab");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setCacheMode(-1);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.f449s.clearCache(true);
        this.f449s.clearHistory();
        this.f449s.addJavascriptInterface(new o(this), "bridge");
        if (!getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            Toast.makeText(this, R.string.error_ble_not_supported, 1).show();
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        O = defaultAdapter;
        if (defaultAdapter == null) {
            Toast.makeText(this, R.string.error_bluetooth_not_supported, 1).show();
        } else if (!defaultAdapter.isEnabled()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 5);
        }
        if (i < 31) {
            LocationManager locationManager = (LocationManager) getSystemService("location");
            try {
                zIsProviderEnabled = locationManager.isProviderEnabled("gps");
            } catch (Exception e2) {
                e2.printStackTrace();
                zIsProviderEnabled = false;
            }
            try {
                zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            } catch (Exception e3) {
                e3.printStackTrace();
                zIsProviderEnabled2 = false;
            }
            if (!zIsProviderEnabled && !zIsProviderEnabled2) {
                new AlertDialog.Builder(this).setMessage("BLE enabling requests Location Service").setCancelable(false).setPositiveButton("Settings", new d(this, 3)).setNegativeButton("Cancel", new l()).show();
            }
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.F = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(this.G, 0L, 70L, TimeUnit.MILLISECONDS);
        this.F.shutdownNow();
        P = O.getBluetoothLeScanner();
        this.H.sendEmptyMessageDelayed(0, 2000L);
        if (((ConnectivityManager) getSystemService("connectivity")).getActiveNetwork() != null) {
            this.f449s.loadUrl("https://idle.studiothinkers.com");
        } else {
            this.f452v.setVisibility(0);
            this.f447p = true;
        }
    }

    @Override // t.f, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t(false);
        unbindService(this.I);
        BluetoothLeService bluetoothLeService = this.f445n;
        if (bluetoothLeService != null) {
            bluetoothLeService.stopSelf();
        }
        this.f445n = null;
    }

    @Override // t.f, android.app.Activity
    public final void onPause() {
        n nVar;
        super.onPause();
        if (this.f445n != null) {
            BluetoothLeService.c();
        }
        this.f443A = false;
        q();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager != null && (nVar = this.f444m) != null) {
            connectivityManager.unregisterNetworkCallback(nVar);
        }
        k kVar = this.J;
        if (kVar != null) {
            unregisterReceiver(kVar);
        }
        WebView webView = this.f449s;
        if (webView != null) {
            webView.onPause();
            this.f449s.pauseTimers();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 124) {
            HashMap map = new HashMap();
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 == -1) {
                    map.put(strArr[i3], Integer.valueOf(i4));
                    i2++;
                }
            }
            if (i2 != 0) {
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    ((Integer) entry.getValue()).getClass();
                    if (!shouldShowRequestPermissionRationale(str)) {
                        d dVar = new d(this, 1);
                        d dVar2 = new d(this, 2);
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("");
                        builder.setCancelable(false);
                        builder.setMessage("You have denied some permissions. Allow all permissions at [Setting] > [Permissions]");
                        builder.setPositiveButton("Go to Settings", dVar);
                        builder.setNegativeButton("Exit", dVar2);
                        builder.create().show();
                        return;
                    }
                    StringBuilder sb = new StringBuilder("This app needs ");
                    sb.append(Build.VERSION.SDK_INT >= 31 ? "Bluetooth Scan & Connect" : "Location");
                    sb.append(" permissions to work without and problems.");
                    String string = sb.toString();
                    d dVar3 = new d(this, 4);
                    d dVar4 = new d(this, 0);
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                    builder2.setTitle("");
                    builder2.setCancelable(false);
                    builder2.setMessage(string);
                    builder2.setPositiveButton("Yes", dVar3);
                    builder2.setNegativeButton("Exit", dVar4);
                    builder2.create().show();
                }
            }
        }
    }

    @Override // t.f, android.app.Activity
    public final void onResume() {
        super.onResume();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        this.f444m = new n(this);
        connectivityManager.registerNetworkCallback(builder.build(), this.f444m);
        this.f449s.onResume();
        this.f449s.resumeTimers();
        int i = Build.VERSION.SDK_INT;
        k kVar = this.J;
        if (i >= 26) {
            registerReceiver(kVar, s(), 2);
        } else {
            registerReceiver(kVar, s());
        }
    }

    public final void q() {
        WebView webView = this.f449s;
        if (webView != null) {
            webView.post(new A.f(this, 1));
        }
    }

    public final void r() {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        for (String str : i >= 31 ? this.r : this.f448q) {
            if (checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 124);
    }

    public final void t(boolean z2) {
        e eVar = this.M;
        if (!z2) {
            if (this.f446o) {
                this.f446o = false;
                P.stopScan(eVar);
                return;
            }
            return;
        }
        if (this.f446o) {
            return;
        }
        this.f446o = true;
        this.C = null;
        this.D = null;
        this.E = Integer.MIN_VALUE;
        this.B = System.currentTimeMillis();
        P.startScan(eVar);
    }
}
