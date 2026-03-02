package q;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f733a;

    public final void a(float f2) {
        View view = (View) this.f733a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f733a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f733a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(q qVar) {
        View view = (View) this.f733a.get();
        if (view != null) {
            if (qVar != null) {
                view.animate().setListener(new n(qVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f733a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
