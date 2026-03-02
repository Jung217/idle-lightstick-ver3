package A;

import android.graphics.Typeface;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import y.B;
import y.M;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14d;

    public /* synthetic */ j(Object obj, Object obj2, int i) {
        this.f12b = i;
        this.f14d = obj;
        this.f13c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12b) {
            case 0:
                ((MainActivity) ((k) this.f14d).f16b).f449s.evaluateJavascript("javascript:window.NativeInterface.bleGetUpdateStatus('" + ((String) this.f13c) + "')", null);
                break;
            case 1:
                MainActivity mainActivity = ((o) this.f14d).f20a;
                mainActivity.F.shutdownNow();
                mainActivity.f454x = ((String) this.f13c).split(",");
                mainActivity.f453w = 0;
                mainActivity.F = Executors.newSingleThreadScheduledExecutor();
                mainActivity.F.scheduleAtFixedRate(mainActivity.G, 0L, 70L, TimeUnit.MILLISECONDS);
                break;
            case 2:
                B b2 = (B) this.f14d;
                Typeface typeface = (Typeface) this.f13c;
                M m2 = (M) b2.f1136c;
                WeakReference weakReference = (WeakReference) b2.f1135b;
                if (m2.f1213k) {
                    m2.f1212j = typeface;
                    TextView textView = (TextView) weakReference.get();
                    if (textView != null) {
                        textView.setTypeface(typeface, m2.i);
                    }
                }
                break;
            default:
                ((n.h) this.f14d).f663d.a(this.f13c);
                break;
        }
    }
}
