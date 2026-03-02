package x;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.C0027i0;
import y.K;
import y.L;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0007f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f1017c;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0007f(F f2, int i) {
        this.f1016b = i;
        this.f1017c = f2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f1016b;
        F f2 = this.f1017c;
        switch (i) {
            case 0:
                j jVar = (j) f2;
                ArrayList arrayList = jVar.i;
                if (jVar.i() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((i) arrayList.get(0)).f1024a.f1305y) {
                        View view = jVar.f1040p;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ((i) obj).f1024a.c();
                            }
                        } else {
                            jVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 1:
                G g2 = (G) f2;
                C0027i0 c0027i0 = g2.i;
                if (g2.i() && !c0027i0.f1305y) {
                    View view2 = g2.f987n;
                    if (view2 != null && view2.isShown()) {
                        c0027i0.c();
                    } else {
                        g2.dismiss();
                    }
                    break;
                }
                break;
            default:
                K k2 = (K) f2;
                L l2 = k2.G;
                WeakHashMap weakHashMap = q.l.f728a;
                if (l2.isAttachedToWindow() && l2.getGlobalVisibleRect(k2.F)) {
                    k2.h();
                    super/*y.f0*/.c();
                } else {
                    k2.dismiss();
                }
                break;
        }
    }
}
