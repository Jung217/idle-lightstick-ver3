package A;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.studiothinkers.lightstick.idlev3.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f11a;

    public i(MainActivity mainActivity) {
        this.f11a = mainActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            A.b r4 = (A.b) r4
            com.studiothinkers.lightstick.idlev3.BluetoothLeService r3 = r4.f1a
            com.studiothinkers.lightstick.idlev3.MainActivity r4 = r2.f11a
            r4.f445n = r3
            android.bluetooth.BluetoothManager r0 = r3.f438b
            java.lang.String r1 = "BluetoothLeService"
            if (r0 != 0) goto L20
            java.lang.String r0 = "bluetooth"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            r3.f438b = r0
            if (r0 != 0) goto L20
            java.lang.String r3 = "Unable to initialize BluetoothManager."
            android.util.Log.e(r1, r3)
            goto L2f
        L20:
            android.bluetooth.BluetoothManager r0 = r3.f438b
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            r3.f439c = r0
            if (r0 != 0) goto L3b
            java.lang.String r3 = "Unable to obtain a BluetoothAdapter."
            android.util.Log.e(r1, r3)
        L2f:
            java.util.UUID r3 = com.studiothinkers.lightstick.idlev3.MainActivity.N
            java.lang.String r3 = "MainActivity"
            java.lang.String r0 = "Unable to initialize Bluetooth"
            android.util.Log.e(r3, r0)
            r4.finish()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11a.f445n = null;
    }
}
