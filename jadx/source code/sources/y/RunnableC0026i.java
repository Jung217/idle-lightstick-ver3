package y;

import android.view.View;

/* JADX INFO: renamed from: y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0026i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0022g f1313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0030k f1314c;

    public RunnableC0026i(C0030k c0030k, C0022g c0022g) {
        this.f1314c = c0030k;
        this.f1313b = c0022g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.n nVar;
        C0030k c0030k = this.f1314c;
        x.p pVar = c0030k.f1326d;
        if (pVar != null && (nVar = pVar.f1069e) != null) {
            nVar.c(pVar);
        }
        View view = (View) c0030k.i;
        if (view != null && view.getWindowToken() != null) {
            C0022g c0022g = this.f1313b;
            if (c0022g.b()) {
                c0030k.f1341u = c0022g;
            } else if (c0022g.f1127e != null) {
                c0022g.d(0, 0, false, false);
                c0030k.f1341u = c0022g;
            }
        }
        c0030k.f1343w = null;
    }
}
