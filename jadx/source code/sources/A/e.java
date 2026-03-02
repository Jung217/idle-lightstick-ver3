package A;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.util.Log;
import com.studiothinkers.lightstick.idlev3.BluetoothLeService;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4a;

    public e(MainActivity mainActivity) {
        this.f4a = mainActivity;
    }

    public final void a(ScanResult scanResult) {
        String str;
        BluetoothDevice device = scanResult.getDevice();
        MainActivity mainActivity = this.f4a;
        if (device != null) {
            String address = device.getAddress();
            String name = device.getName();
            if (address == null || name == null || !name.startsWith(mainActivity.f456z)) {
                return;
            }
            if (scanResult.getRssi() > mainActivity.E && !address.isEmpty()) {
                mainActivity.E = scanResult.getRssi();
                mainActivity.C = address;
                mainActivity.D = name;
            }
        }
        if (System.currentTimeMillis() - mainActivity.B < 1000 || (str = mainActivity.C) == null || str.isEmpty()) {
            return;
        }
        mainActivity.t(false);
        mainActivity.f455y = mainActivity.D;
        BluetoothLeService bluetoothLeService = mainActivity.f445n;
        if (bluetoothLeService != null) {
            String str2 = mainActivity.C;
            if (bluetoothLeService.f439c == null || str2 == null) {
                Log.w("BluetoothLeService", "BluetoothAdapter not initialized or unspecified address.");
                return;
            }
            String str3 = bluetoothLeService.f440d;
            if (str3 == null || !str2.equals(str3) || BluetoothLeService.f436g == null) {
                BluetoothDevice remoteDevice = bluetoothLeService.f439c.getRemoteDevice(str2);
                if (remoteDevice == null) {
                    Log.w("BluetoothLeService", "Device not found.  Unable to connect.");
                    return;
                }
                BluetoothLeService.f436g = remoteDevice.connectGatt(bluetoothLeService, true, bluetoothLeService.f441e);
                Log.d("BluetoothLeService", "Trying to create a new connection.");
                bluetoothLeService.f440d = str2;
                return;
            }
            Log.d("BluetoothLeService", "Trying to use an existing mBluetoothGatt for connection.");
            if (BluetoothLeService.f436g.connect()) {
                BluetoothGatt bluetoothGatt = BluetoothLeService.f436g;
                try {
                    Object objInvoke = bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null);
                    if (objInvoke instanceof Boolean) {
                        ((Boolean) objInvoke).getClass();
                    }
                } catch (NoSuchMethodException unused) {
                    Log.w("BluetoothLeService", "refresh() method not available on this device.");
                } catch (Exception e2) {
                    Log.w("BluetoothLeService", "Exception while invoking refresh()", e2);
                }
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            if (MainActivity.p(this.f4a, scanResult)) {
                a(scanResult);
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        if (MainActivity.p(this.f4a, scanResult)) {
            a(scanResult);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
    }
}
