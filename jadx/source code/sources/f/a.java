package f;

import e.i;
import g.h;
import g.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    public d[] j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public boolean o0;

    public final void G(int i, o oVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.k0; i2++) {
            d dVar = this.j0[i2];
            ArrayList arrayList2 = oVar.f600a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.k0; i3++) {
            h.b(this.j0[i3], i, arrayList, oVar);
        }
    }

    public final boolean H() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.k0;
            if (i4 >= i) {
                break;
            }
            d dVar = this.j0[i4];
            if ((this.m0 || dVar.c()) && ((((i2 = this.l0) == 0 || i2 == 1) && !dVar.u()) || (((i3 = this.l0) == 2 || i3 == 3) && !dVar.v()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < this.k0; i5++) {
            d dVar2 = this.j0[i5];
            if (this.m0 || dVar2.c()) {
                if (!z3) {
                    int i6 = this.l0;
                    if (i6 == 0) {
                        iMax = dVar2.g(2).c();
                    } else if (i6 == 1) {
                        iMax = dVar2.g(4).c();
                    } else if (i6 == 2) {
                        iMax = dVar2.g(3).c();
                    } else if (i6 == 3) {
                        iMax = dVar2.g(5).c();
                    }
                    z3 = true;
                }
                int i7 = this.l0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, dVar2.g(2).c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, dVar2.g(4).c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, dVar2.g(3).c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, dVar2.g(5).c());
                }
            }
        }
        int i8 = iMax + this.n0;
        int i9 = this.l0;
        if (i9 == 0 || i9 == 1) {
            y(i8, i8);
        } else {
            z(i8, i8);
        }
        this.o0 = true;
        return true;
    }

    public final int I() {
        int i = this.l0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // f.d
    public final void b(e.d dVar, boolean z2) {
        boolean z3;
        int i;
        int i2;
        c[] cVarArr = this.J;
        c cVar = this.B;
        cVarArr[0] = cVar;
        int i3 = 2;
        c cVar2 = this.C;
        cVarArr[2] = cVar2;
        c cVar3 = this.D;
        cVarArr[1] = cVar3;
        c cVar4 = this.E;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.i = dVar.k(cVar5);
        }
        int i4 = this.l0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i4];
        if (!this.o0) {
            H();
        }
        if (this.o0) {
            this.o0 = false;
            int i5 = this.l0;
            if (i5 == 0 || i5 == 1) {
                dVar.d(cVar.i, this.R);
                dVar.d(cVar3.i, this.R);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    dVar.d(cVar2.i, this.S);
                    dVar.d(cVar4.i, this.S);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.k0; i6++) {
            d dVar2 = this.j0[i6];
            if ((this.m0 || dVar2.c()) && ((((i2 = this.l0) == 0 || i2 == 1) && dVar2.i0[0] == 3 && dVar2.B.f532f != null && dVar2.D.f532f != null) || ((i2 == 2 || i2 == 3) && dVar2.i0[1] == 3 && dVar2.C.f532f != null && dVar2.E.f532f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = cVar.e() || cVar3.e();
        boolean z5 = cVar2.e() || cVar4.e();
        int i7 = !(!z3 && (((i = this.l0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.k0) {
            d dVar3 = this.j0[i8];
            if (this.m0 || dVar3.c()) {
                i iVarK = dVar.k(dVar3.J[this.l0]);
                c[] cVarArr2 = dVar3.J;
                int i9 = this.l0;
                c cVar7 = cVarArr2[i9];
                cVar7.i = iVarK;
                c cVar8 = cVar7.f532f;
                int i10 = (cVar8 == null || cVar8.f530d != this) ? 0 : cVar7.f533g;
                if (i9 == 0 || i9 == i3) {
                    i iVar = cVar6.i;
                    int i11 = this.n0 - i10;
                    e.b bVarL = dVar.l();
                    i iVarM = dVar.m();
                    iVarM.f503d = 0;
                    bVarL.c(iVar, iVarK, iVarM, i11);
                    dVar.c(bVarL);
                } else {
                    i iVar2 = cVar6.i;
                    int i12 = this.n0 + i10;
                    e.b bVarL2 = dVar.l();
                    i iVarM2 = dVar.m();
                    iVarM2.f503d = 0;
                    bVarL2.b(iVar2, iVarK, iVarM2, i12);
                    dVar.c(bVarL2);
                }
                dVar.e(cVar6.i, iVarK, this.n0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.l0;
        if (i13 == 0) {
            dVar.e(cVar3.i, cVar.i, 0, 8);
            dVar.e(cVar.i, this.M.D.i, 0, 4);
            dVar.e(cVar.i, this.M.B.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            dVar.e(cVar.i, cVar3.i, 0, 8);
            dVar.e(cVar.i, this.M.B.i, 0, 4);
            dVar.e(cVar.i, this.M.D.i, 0, 0);
        } else if (i13 == 2) {
            dVar.e(cVar4.i, cVar2.i, 0, 8);
            dVar.e(cVar2.i, this.M.E.i, 0, 4);
            dVar.e(cVar2.i, this.M.C.i, 0, 0);
        } else if (i13 == 3) {
            dVar.e(cVar2.i, cVar4.i, 0, 8);
            dVar.e(cVar2.i, this.M.C.i, 0, 4);
            dVar.e(cVar2.i, this.M.E.i, 0, 0);
        }
    }

    @Override // f.d
    public final boolean c() {
        return true;
    }

    @Override // f.d
    public final String toString() {
        String str = "[Barrier] " + this.a0 + " {";
        for (int i = 0; i < this.k0; i++) {
            d dVar = this.j0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + dVar.a0;
        }
        return str + "}";
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
