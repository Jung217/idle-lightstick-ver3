package A;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.util.Log;
import com.studiothinkers.lightstick.idlev3.BluetoothLeService;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothLeService f0a;

    public a(BluetoothLeService bluetoothLeService) {
        this.f0a = bluetoothLeService;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothLeService.a(this.f0a, bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (i == 0) {
            BluetoothLeService.a(this.f0a, bluetoothGattCharacteristic);
        } else if (i == 5 || i == 15) {
            BluetoothLeService.b();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothLeService bluetoothLeService = this.f0a;
        if (i2 != 2) {
            if (i2 == 0) {
                BluetoothGatt bluetoothGatt2 = BluetoothLeService.f436g;
                Log.i("BluetoothLeService", "Disconnected from GATT server.");
                bluetoothLeService.sendBroadcast(new Intent("com.studiothinkers.lightstick.idlev3.ACTION_GATT_DISCONNECTED"));
                return;
            }
            return;
        }
        BluetoothGatt bluetoothGatt3 = BluetoothLeService.f436g;
        bluetoothLeService.sendBroadcast(new Intent("com.studiothinkers.lightstick.idlev3.ACTION_GATT_CONNECTED"));
        Log.i("BluetoothLeService", "Connected to GATT server.");
        Log.i("BluetoothLeService", "Attempting to start service discovery:" + BluetoothLeService.f436g.discoverServices());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothLeService bluetoothLeService = this.f0a;
        if (i == 0) {
            BluetoothGatt bluetoothGatt2 = BluetoothLeService.f436g;
            bluetoothLeService.sendBroadcast(new Intent("com.studiothinkers.lightstick.idlev3.ACTION_GATT_SERVICES_DISCOVERED"));
        } else if (i == 5 || i == 15) {
            BluetoothLeService.b();
            bluetoothLeService.sendBroadcast(new Intent("com.studiothinkers.lightstick.idlev3.ACTION_GATT_SERVICE_DISCOVERY_UNSUCCESSFUL"));
        } else {
            BluetoothGatt bluetoothGatt3 = BluetoothLeService.f436g;
            Log.w("BluetoothLeService", "onServicesDiscovered received: " + i);
        }
    }
}
