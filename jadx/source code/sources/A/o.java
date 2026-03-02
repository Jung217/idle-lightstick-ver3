package A;

import android.util.Log;
import android.webkit.JavascriptInterface;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f20a;

    public o(MainActivity mainActivity) {
        this.f20a = mainActivity;
    }

    @JavascriptInterface
    public void DebugMsg(String str) {
        UUID uuid = MainActivity.N;
        Log.d("MainActivity", "From WebView: " + str);
    }

    @JavascriptInterface
    public void bleDisconnect(String str) {
        this.f20a.H.sendEmptyMessage(109);
    }

    @JavascriptInterface
    public void blePairingStart(String str) {
        MainActivity mainActivity = this.f20a;
        h hVar = mainActivity.H;
        if (!MainActivity.O.isEnabled()) {
            mainActivity.q();
        } else if (mainActivity.f443A) {
            hVar.sendEmptyMessage(999);
        } else {
            mainActivity.f456z = str;
            hVar.sendEmptyMessage(101);
        }
    }

    @JavascriptInterface
    public void bleSendCmdList(String str) {
        this.f20a.H.post(new j(this, str, 1));
    }
}
