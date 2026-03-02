package com.studiothinkers.lightstick.idlev3;

import A.a;
import A.b;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class BluetoothLeService extends Service {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static BluetoothGatt f436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final UUID f437h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID i = UUID.fromString("00000000-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothManager f438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothAdapter f439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f441e = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f442f = new b(this);

    public static void a(BluetoothLeService bluetoothLeService, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Intent intent = new Intent("com.studiothinkers.lightstick.idlev3.ACTION_DATA_AVAILABLE");
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value != null && value.length > 0) {
            StringBuilder sb = new StringBuilder(value.length);
            for (byte b2 : value) {
                sb.append(String.format("0x%02X ", Byte.valueOf(b2)));
            }
            intent.putExtra("com.studiothinkers.lightstick.idlev3.EXTRA_DATA", sb.toString());
        }
        bluetoothLeService.sendBroadcast(intent);
    }

    public static void b() {
        try {
            Log.e("BluetoothLeService", "Pair initiates status --> " + ((Boolean) Class.forName("android.bluetooth.BluetoothDevice").getMethod("createBond", null).invoke(f436g.getDevice(), null)));
        } catch (Exception e2) {
            Log.e("BluetoothLeService", "Exception Pair: " + e2.getMessage());
        }
    }

    public static void c() {
        BluetoothGatt bluetoothGatt = f436g;
        if (bluetoothGatt == null) {
            return;
        }
        bluetoothGatt.disconnect();
        f436g.close();
        f436g = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f442f;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        return super.onUnbind(intent);
    }
}
