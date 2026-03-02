package t;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f815c;

    public /* synthetic */ h(n nVar, int i) {
        this.f814b = i;
        this.f815c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f814b;
        n nVar = this.f815c;
        switch (i) {
            case 0:
                if ((nVar.K & 1) != 0) {
                    nVar.h(0);
                }
                if ((nVar.K & 4096) != 0) {
                    nVar.h(108);
                }
                nVar.J = false;
                nVar.K = 0;
                break;
            default:
                nVar.f850n.showAtLocation(nVar.f849m, 55, 0, 0);
                q.p pVar = nVar.f852p;
                if (pVar != null) {
                    pVar.b();
                }
                if (nVar.f853q && (viewGroup = nVar.r) != null) {
                    WeakHashMap weakHashMap = q.l.f728a;
                    if (viewGroup.isLaidOut()) {
                        nVar.f849m.setAlpha(0.0f);
                        q.p pVarA = q.l.a(nVar.f849m);
                        pVarA.a(1.0f);
                        nVar.f852p = pVarA;
                        pVarA.d(new j(0, this));
                    }
                }
                nVar.f849m.setAlpha(1.0f);
                nVar.f849m.setVisibility(0);
                break;
        }
    }
}
