package f;

import e.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    public float j0 = -1.0f;
    public int k0 = -1;
    public int l0 = -1;
    public c m0 = this.C;
    public int n0 = 0;
    public boolean o0;

    public f() {
        this.K.clear();
        this.K.add(this.m0);
        int length = this.J.length;
        for (int i = 0; i < length; i++) {
            this.J[i] = this.m0;
        }
    }

    @Override // f.d
    public final void F(e.d dVar, boolean z2) {
        if (this.M == null) {
            return;
        }
        c cVar = this.m0;
        dVar.getClass();
        int iN = e.d.n(cVar);
        if (this.n0 == 1) {
            this.R = iN;
            this.S = 0;
            A(this.M.i());
            D(0);
            return;
        }
        this.R = 0;
        this.S = iN;
        D(this.M.l());
        A(0);
    }

    public final void G(int i) {
        this.m0.i(i);
        this.o0 = true;
    }

    public final void H(int i) {
        if (this.n0 == i) {
            return;
        }
        this.n0 = i;
        ArrayList arrayList = this.K;
        arrayList.clear();
        if (this.n0 == 1) {
            this.m0 = this.B;
        } else {
            this.m0 = this.C;
        }
        arrayList.add(this.m0);
        c[] cVarArr = this.J;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.m0;
        }
    }

    @Override // f.d
    public final void b(e.d dVar, boolean z2) {
        e eVar = (e) this.M;
        if (eVar == null) {
            return;
        }
        Object objG = eVar.g(2);
        Object objG2 = eVar.g(4);
        d dVar2 = this.M;
        boolean z3 = dVar2 != null && dVar2.i0[0] == 2;
        if (this.n0 == 0) {
            objG = eVar.g(3);
            objG2 = eVar.g(5);
            d dVar3 = this.M;
            z3 = dVar3 != null && dVar3.i0[1] == 2;
        }
        if (this.o0) {
            c cVar = this.m0;
            if (cVar.f529c) {
                i iVarK = dVar.k(cVar);
                dVar.d(iVarK, this.m0.c());
                if (this.k0 != -1) {
                    if (z3) {
                        dVar.f(dVar.k(objG2), iVarK, 0, 5);
                    }
                } else if (this.l0 != -1 && z3) {
                    i iVarK2 = dVar.k(objG2);
                    dVar.f(iVarK, dVar.k(objG), 0, 5);
                    dVar.f(iVarK2, iVarK, 0, 5);
                }
                this.o0 = false;
                return;
            }
        }
        if (this.k0 != -1) {
            i iVarK3 = dVar.k(this.m0);
            dVar.e(iVarK3, dVar.k(objG), this.k0, 8);
            if (z3) {
                dVar.f(dVar.k(objG2), iVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.l0 != -1) {
            i iVarK4 = dVar.k(this.m0);
            i iVarK5 = dVar.k(objG2);
            dVar.e(iVarK4, iVarK5, -this.l0, 8);
            if (z3) {
                dVar.f(iVarK4, dVar.k(objG), 0, 5);
                dVar.f(iVarK5, iVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.j0 != -1.0f) {
            i iVarK6 = dVar.k(this.m0);
            i iVarK7 = dVar.k(objG2);
            float f2 = this.j0;
            e.b bVarL = dVar.l();
            bVarL.f470d.g(iVarK6, -1.0f);
            bVarL.f470d.g(iVarK7, f2);
            dVar.c(bVarL);
        }
    }

    @Override // f.d
    public final boolean c() {
        return true;
    }

    @Override // f.d
    public final c g(int i) {
        switch (c.b.a(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.n0 == 1) {
                    return this.m0;
                }
                break;
            case 2:
            case 4:
                if (this.n0 == 0) {
                    return this.m0;
                }
                break;
        }
        throw new AssertionError(android.support.v4.app.e.b(i));
    }

    @Override // f.d
    public final boolean u() {
        return this.o0;
    }

    @Override // f.d
    public final boolean v() {
        return this.o0;
    }
}
