package x;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0008g implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1019b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0008g(x xVar, int i) {
        this.f1018a = i;
        this.f1019b = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f1018a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1018a) {
            case 0:
                j jVar = (j) this.f1019b;
                ViewTreeObserver viewTreeObserver = jVar.f1048y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        jVar.f1048y = view.getViewTreeObserver();
                    }
                    jVar.f1048y.removeGlobalOnLayoutListener(jVar.f1034j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                G g2 = (G) this.f1019b;
                ViewTreeObserver viewTreeObserver2 = g2.f989p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        g2.f989p = view.getViewTreeObserver();
                    }
                    g2.f989p.removeGlobalOnLayoutListener(g2.f983j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
