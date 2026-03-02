package A;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.studiothinkers.lightstick.idlev3.BluetoothLeService;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6c;

    public /* synthetic */ f(MainActivity mainActivity, int i) {
        this.f5b = i;
        this.f6c = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zWriteCharacteristic;
        UUID uuid;
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        switch (this.f5b) {
            case 0:
                MainActivity mainActivity = this.f6c;
                if (mainActivity.f454x[mainActivity.f453w].charAt(0) == '-') {
                    mainActivity.F.shutdownNow();
                } else {
                    if (mainActivity.f454x[mainActivity.f453w].charAt(0) != '+') {
                        BluetoothLeService bluetoothLeService = mainActivity.f445n;
                        String strConcat = mainActivity.f454x[mainActivity.f453w];
                        if (strConcat.length() % 2 != 0) {
                            strConcat = "0".concat(strConcat);
                        }
                        int length = strConcat.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i = 0; i < length; i++) {
                            int i2 = i * 2;
                            bArr[i] = (byte) Integer.parseInt(strConcat.substring(i2, i2 + 2), 16);
                        }
                        bluetoothLeService.getClass();
                        BluetoothGatt bluetoothGatt = BluetoothLeService.f436g;
                        if (bluetoothGatt == null || (service = bluetoothGatt.getService((uuid = BluetoothLeService.i))) == null || (characteristic = service.getCharacteristic(uuid)) == null) {
                            zWriteCharacteristic = true;
                        } else {
                            characteristic.setWriteType(2);
                            characteristic.setValue(bArr);
                            zWriteCharacteristic = BluetoothLeService.f436g.writeCharacteristic(characteristic);
                        }
                    } else {
                        zWriteCharacteristic = false;
                    }
                    if (zWriteCharacteristic) {
                        mainActivity.f453w++;
                    }
                    if (mainActivity.f453w >= mainActivity.f454x.length) {
                        mainActivity.f453w = 0;
                    }
                }
                break;
            default:
                this.f6c.f449s.evaluateJavascript("javascript:window.NativeInterface.bleDisconnected()", null);
                break;
        }
    }
}
