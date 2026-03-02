package A;

import android.net.ConnectivityManager;
import android.net.Network;
import com.studiothinkers.lightstick.idlev3.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f19a;

    public n(MainActivity mainActivity) {
        this.f19a = mainActivity;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f19a.runOnUiThread(new m(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f19a.runOnUiThread(new m(this, 1));
    }
}
