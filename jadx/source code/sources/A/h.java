package A;

import android.bluetooth.BluetoothGatt;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.studiothinkers.lightstick.idlev3.BluetoothLeService;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10b;

    public /* synthetic */ h() {
        this.f9a = 2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BluetoothGatt bluetoothGatt;
        switch (this.f9a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f10b;
                int i = message.what;
                if (i == 0) {
                    mainActivity.f451u.setVisibility(8);
                    mainActivity.f450t.setVisibility(0);
                    break;
                } else if (i == 101) {
                    mainActivity.t(true);
                    break;
                } else if (i == 109) {
                    if (mainActivity.f445n.f439c == null || (bluetoothGatt = BluetoothLeService.f436g) == null) {
                        Log.w("BluetoothLeService", "BluetoothAdapter not initialized");
                    } else {
                        bluetoothGatt.disconnect();
                    }
                    break;
                } else if (i == 999) {
                    mainActivity.f449s.post(new g(0, this));
                    break;
                }
                break;
            case 1:
                android.arch.lifecycle.i iVar = ((t.f) this.f10b).f806d;
                if (message.what == 2) {
                    android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
                    kVar.f108l = false;
                    kVar.f109m = false;
                    kVar.d(4);
                    ((android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d).f();
                } else {
                    super.handleMessage(message);
                }
                break;
            default:
                int i2 = message.what;
                if (i2 == -3 || i2 == -2 || i2 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f10b).get(), message.what);
                    break;
                } else if (i2 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(t.f fVar, int i) {
        this.f9a = i;
        this.f10b = fVar;
    }
}
