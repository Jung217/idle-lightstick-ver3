package A;

import android.os.SystemClock;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.studiothinkers.lightstick.idlev3.MainActivity;
import java.util.WeakHashMap;
import y.B;
import y.C0030k;
import y.V;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8c;

    public /* synthetic */ g(int i, Object obj) {
        this.f7b = i;
        this.f8c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0030k c0030k;
        int i = this.f7b;
        Object obj = this.f8c;
        switch (i) {
            case 0:
                h hVar = (h) obj;
                ((MainActivity) hVar.f10b).f449s.evaluateJavascript("javascript:window.NativeInterface.gotoPage('/pairing3/" + ((MainActivity) hVar.f10b).f455y + "')", null);
                return;
            case 1:
                ((android.support.v4.app.k) obj).f();
                return;
            case 2:
                ((B) obj).getClass();
                return;
            case 3:
                s.g gVar = (s.g) obj;
                V v2 = gVar.f757c;
                s.a aVar = gVar.f755a;
                if (gVar.f768o) {
                    if (gVar.f766m) {
                        gVar.f766m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f739e = jCurrentAnimationTimeMillis;
                        aVar.f741g = -1L;
                        aVar.f740f = jCurrentAnimationTimeMillis;
                        aVar.f742h = 0.5f;
                    }
                    if ((aVar.f741g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f741g + ((long) aVar.i)) || !gVar.e()) {
                        gVar.f768o = false;
                        return;
                    }
                    if (gVar.f767n) {
                        gVar.f767n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        v2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f740f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f740f;
                    aVar.f740f = jCurrentAnimationTimeMillis2;
                    gVar.f770q.scrollListBy((int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f738d));
                    WeakHashMap weakHashMap = q.l.f728a;
                    v2.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                V v3 = (V) obj;
                v3.f1243n = null;
                v3.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) obj).f279b;
                if (actionMenuView == null || (c0030k = actionMenuView.f248u) == null) {
                    return;
                }
                c0030k.l();
                return;
        }
    }

    public g(B b2, int i) {
        this.f7b = 2;
        this.f8c = b2;
    }
}
