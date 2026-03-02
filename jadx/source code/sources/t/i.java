package t;

import android.view.Window;
import x.A;
import y.P;

/* JADX INFO: loaded from: classes.dex */
public final class i implements P, A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f817c;

    public /* synthetic */ i(n nVar, int i) {
        this.f816b = i;
        this.f817c = nVar;
    }

    @Override // x.A
    public void a(x.p pVar, boolean z2) {
        m mVar;
        switch (this.f816b) {
            case 2:
                this.f817c.e(pVar);
                break;
            default:
                x.p pVarK = pVar.k();
                int i = 0;
                boolean z3 = pVarK != pVar;
                if (z3) {
                    pVar = pVarK;
                }
                n nVar = this.f817c;
                m[] mVarArr = nVar.C;
                int length = mVarArr != null ? mVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        mVar = null;
                    } else {
                        mVar = mVarArr[i];
                        if (mVar == null || mVar.f830h != pVar) {
                            i++;
                        }
                    }
                }
                if (mVar != null) {
                    if (!z3) {
                        nVar.f(mVar, z2);
                    } else {
                        nVar.b(mVar.f823a, mVar, pVarK);
                        nVar.f(mVar, true);
                    }
                }
                break;
        }
    }

    @Override // x.A
    public boolean f(x.p pVar) {
        Window.Callback callback;
        switch (this.f816b) {
            case 2:
                Window.Callback callback2 = this.f817c.f840c.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, pVar);
                }
                break;
            default:
                if (pVar == null) {
                    n nVar = this.f817c;
                    if (nVar.f858w && (callback = nVar.f840c.getCallback()) != null && !nVar.F) {
                        callback.onMenuOpened(108, pVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
