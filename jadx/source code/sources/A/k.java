package A;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.studiothinkers.lightstick.idlev3.BluetoothLeService;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class k extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16b;

    public /* synthetic */ k(int i, Object obj) {
        this.f15a = i;
        this.f16b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BluetoothGatt bluetoothGatt;
        BluetoothGattCharacteristic characteristic;
        UUID uuid;
        BluetoothGattService service;
        int i = this.f15a;
        Object obj = this.f16b;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj;
                String action = intent.getAction();
                if (action != null) {
                    if (!"com.studiothinkers.lightstick.idlev3.ACTION_GATT_CONNECTED".equals(action)) {
                        int i2 = 0;
                        if ("com.studiothinkers.lightstick.idlev3.ACTION_GATT_DISCONNECTED".equals(action)) {
                            UUID uuid2 = MainActivity.N;
                            mainActivity.f445n.getClass();
                            BluetoothLeService.c();
                            mainActivity.f443A = false;
                            mainActivity.q();
                        } else if ("com.studiothinkers.lightstick.idlev3.ACTION_GATT_SERVICES_DISCOVERED".equals(action)) {
                            mainActivity.f443A = true;
                            mainActivity.f445n.getClass();
                            BluetoothGatt bluetoothGatt2 = BluetoothLeService.f436g;
                            if (bluetoothGatt2 == null || (service = bluetoothGatt2.getService((uuid = BluetoothLeService.i))) == null) {
                                characteristic = null;
                            } else {
                                characteristic = service.getCharacteristic(uuid);
                                characteristic.setWriteType(2);
                            }
                            if ((characteristic.getProperties() | 32) > 0) {
                                if (mainActivity.f445n.f439c == null || BluetoothLeService.f436g == null) {
                                    Log.w("BluetoothLeService", "BluetoothAdapter not initialized");
                                } else {
                                    UUID uuid3 = BluetoothLeService.f437h;
                                    if (characteristic.getDescriptor(uuid3) != null) {
                                        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(uuid3);
                                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                                        BluetoothLeService.f436g.writeDescriptor(descriptor);
                                    }
                                    BluetoothLeService.f436g.setCharacteristicNotification(characteristic, true);
                                }
                            }
                            mainActivity.H.sendEmptyMessageDelayed(999, 300L);
                        } else if ("com.studiothinkers.lightstick.idlev3.ACTION_DATA_AVAILABLE".equals(action)) {
                            mainActivity.f449s.post(new j(this, intent.getStringExtra("com.studiothinkers.lightstick.idlev3.EXTRA_DATA"), i2));
                        }
                    }
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        if (MainActivity.O.getState() != 13) {
                            if (MainActivity.O.getState() == 10) {
                                mainActivity.f445n.getClass();
                                BluetoothLeService.c();
                                mainActivity.q();
                            }
                        } else if (mainActivity.f445n.f439c == null || (bluetoothGatt = BluetoothLeService.f436g) == null) {
                            Log.w("BluetoothLeService", "BluetoothAdapter not initialized");
                        } else {
                            bluetoothGatt.disconnect();
                        }
                    }
                    break;
                }
                break;
            default:
                q.g gVar = (q.g) obj;
                boolean zE = ((e.c) gVar.f718b).e();
                if (zE != gVar.f717a) {
                    gVar.f717a = zE;
                    ((t.n) gVar.f721e).a();
                }
                break;
        }
    }
}
