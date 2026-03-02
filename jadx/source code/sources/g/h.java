package g;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f592a = new b();

    public static boolean a(f.d dVar) {
        int[] iArr = dVar.i0;
        int i = iArr[0];
        int i2 = iArr[1];
        f.d dVar2 = dVar.M;
        f.e eVar = dVar2 != null ? (f.e) dVar2 : null;
        if (eVar != null) {
            int i3 = eVar.i0[0];
        }
        if (eVar != null) {
            int i4 = eVar.i0[1];
        }
        boolean z2 = i == 1 || i == 2 || (i == 3 && dVar.f546l == 0 && dVar.P == 0.0f && dVar.o(0)) || dVar.u();
        boolean z3 = i2 == 1 || i2 == 2 || (i2 == 3 && dVar.f547m == 0 && dVar.P == 0.0f && dVar.o(1)) || dVar.v();
        return (dVar.P > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    public static o b(f.d dVar, int i, ArrayList arrayList, o oVar) {
        int i2;
        int i3 = i == 0 ? dVar.g0 : dVar.h0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f601b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i4);
                if (oVar2.f601b == i3) {
                    if (oVar != null) {
                        oVar.c(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof f.a) {
                f.a aVar = (f.a) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= aVar.k0) {
                        i2 = -1;
                        break;
                    }
                    f.d dVar2 = aVar.j0[i5];
                    if ((i == 0 && (i2 = dVar2.g0) != -1) || (i == 1 && (i2 = dVar2.h0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = (o) arrayList.get(i6);
                        if (oVar3.f601b == i2) {
                            oVar = oVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f600a = new ArrayList();
                oVar.f603d = null;
                oVar.f604e = -1;
                int i7 = o.f599f;
                o.f599f = i7 + 1;
                oVar.f601b = i7;
                oVar.f602c = i;
            }
            arrayList.add(oVar);
        }
        int i8 = oVar.f601b;
        ArrayList arrayList2 = oVar.f600a;
        if (arrayList2.contains(dVar)) {
            return oVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof f.f) {
            f.f fVar = (f.f) dVar;
            fVar.m0.b(fVar.n0 == 0 ? 1 : 0, oVar, arrayList);
        }
        if (i == 0) {
            dVar.g0 = i8;
            dVar.B.b(i, oVar, arrayList);
            dVar.D.b(i, oVar, arrayList);
        } else {
            dVar.h0 = i8;
            dVar.C.b(i, oVar, arrayList);
            dVar.F.b(i, oVar, arrayList);
            dVar.E.b(i, oVar, arrayList);
        }
        dVar.I.b(i, oVar, arrayList);
        return oVar;
    }

    public static void c(c.g gVar, f.d dVar, boolean z2) {
        HashSet<f.c> hashSet;
        f.c cVar;
        f.c cVar2;
        float f2;
        f.c cVar3;
        f.c cVar4;
        f.c cVar5;
        if (!(dVar instanceof f.e) && dVar.t() && a(dVar)) {
            f.e.L(dVar, gVar, new b());
        }
        f.c cVarG = dVar.g(2);
        f.c cVarG2 = dVar.g(4);
        int iC = cVarG.c();
        int iC2 = cVarG2.c();
        HashSet<f.c> hashSet2 = cVarG.f527a;
        if (hashSet2 != null && cVarG.f529c) {
            for (f.c cVar6 : hashSet2) {
                f.d dVar2 = cVar6.f530d;
                boolean zA = a(dVar2);
                f.c cVar7 = dVar2.B;
                f.c cVar8 = dVar2.D;
                if (dVar2.t() && zA) {
                    f2 = 0.0f;
                    f.e.L(dVar2, gVar, new b());
                } else {
                    f2 = 0.0f;
                }
                int i = dVar2.i0[0];
                if (i != 3 || zA) {
                    if (!dVar2.t()) {
                        if (cVar6 == cVar7 && cVar8.f532f == null) {
                            int iD = cVar7.d() + iC;
                            dVar2.y(iD, dVar2.l() + iD);
                            c(gVar, dVar2, z2);
                        } else if (cVar6 == cVar8 && cVar7.f532f == null) {
                            int iD2 = iC - cVar8.d();
                            dVar2.y(iD2 - dVar2.l(), iD2);
                            c(gVar, dVar2, z2);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f532f) != null && cVar3.f529c && !dVar2.r()) {
                            d(gVar, dVar2, z2);
                        }
                    }
                } else if (i == 3 && dVar2.f550p >= 0 && dVar2.f549o >= 0 && (dVar2.Z == 8 || (dVar2.f546l == 0 && dVar2.P == f2))) {
                    if (!dVar2.r() && ((cVar6 == cVar7 && (cVar5 = cVar8.f532f) != null && cVar5.f529c) || (cVar6 == cVar8 && (cVar4 = cVar7.f532f) != null && cVar4.f529c))) {
                        if (!dVar2.r()) {
                            e(dVar, gVar, dVar2, z2);
                        }
                    }
                }
            }
        }
        if ((dVar instanceof f.f) || (hashSet = cVarG2.f527a) == null || !cVarG2.f529c) {
            return;
        }
        for (f.c cVar9 : hashSet) {
            f.d dVar3 = cVar9.f530d;
            boolean zA2 = a(dVar3);
            f.c cVar10 = dVar3.B;
            f.c cVar11 = dVar3.D;
            if (dVar3.t() && zA2) {
                f.e.L(dVar3, gVar, new b());
            }
            boolean z3 = (cVar9 == cVar10 && (cVar2 = cVar11.f532f) != null && cVar2.f529c) || (cVar9 == cVar11 && (cVar = cVar10.f532f) != null && cVar.f529c);
            int i2 = dVar3.i0[0];
            if (i2 != 3 || zA2) {
                if (!dVar3.t()) {
                    if (cVar9 == cVar10 && cVar11.f532f == null) {
                        int iD3 = cVar10.d() + iC2;
                        dVar3.y(iD3, dVar3.l() + iD3);
                        c(gVar, dVar3, z2);
                    } else if (cVar9 == cVar11 && cVar10.f532f == null) {
                        int iD4 = iC2 - cVar11.d();
                        dVar3.y(iD4 - dVar3.l(), iD4);
                        c(gVar, dVar3, z2);
                    } else if (z3 && !dVar3.r()) {
                        d(gVar, dVar3, z2);
                    }
                }
            } else if (i2 == 3 && dVar3.f550p >= 0 && dVar3.f549o >= 0 && (dVar3.Z == 8 || (dVar3.f546l == 0 && dVar3.P == 0.0f))) {
                if (!dVar3.r() && z3 && !dVar3.r()) {
                    e(dVar, gVar, dVar3, z2);
                }
            }
        }
    }

    public static void d(c.g gVar, f.d dVar, boolean z2) {
        float f2 = dVar.W;
        f.c cVar = dVar.B;
        int iC = cVar.f532f.c();
        f.c cVar2 = dVar.D;
        int iC2 = cVar2.f532f.c();
        int iD = cVar.d() + iC;
        int iD2 = iC2 - cVar2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iL = dVar.l();
        int i = (iC2 - iC) - iL;
        if (iC > iC2) {
            i = (iC - iC2) - iL;
        }
        int i2 = ((int) ((f2 * i) + 0.5f)) + iC;
        int i3 = i2 + iL;
        if (iC > iC2) {
            i3 = i2 - iL;
        }
        dVar.y(i2, i3);
        c(gVar, dVar, z2);
    }

    public static void e(f.d dVar, c.g gVar, f.d dVar2, boolean z2) {
        float f2 = dVar2.W;
        f.c cVar = dVar2.B;
        int iD = cVar.d() + cVar.f532f.c();
        f.c cVar2 = dVar2.D;
        int iC = cVar2.f532f.c() - cVar2.d();
        if (iC >= iD) {
            int iL = dVar2.l();
            if (dVar2.Z != 8) {
                int i = dVar2.f546l;
                if (i == 2) {
                    iL = (int) (dVar2.W * 0.5f * (dVar instanceof f.e ? dVar.l() : dVar.M.l()));
                } else if (i == 0) {
                    iL = iC - iD;
                }
                iL = Math.max(dVar2.f549o, iL);
                int i2 = dVar2.f550p;
                if (i2 > 0) {
                    iL = Math.min(i2, iL);
                }
            }
            int i3 = iD + ((int) ((f2 * ((iC - iD) - iL)) + 0.5f));
            dVar2.y(i3, iL + i3);
            c(gVar, dVar2, z2);
        }
    }

    public static void f(c.g gVar, f.d dVar) {
        float f2 = dVar.X;
        f.c cVar = dVar.C;
        int iC = cVar.f532f.c();
        f.c cVar2 = dVar.E;
        int iC2 = cVar2.f532f.c();
        int iD = cVar.d() + iC;
        int iD2 = iC2 - cVar2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i = dVar.i();
        int i2 = (iC2 - iC) - i;
        if (iC > iC2) {
            i2 = (iC - iC2) - i;
        }
        int i3 = (int) ((f2 * i2) + 0.5f);
        int i4 = iC + i3;
        int i5 = i4 + i;
        if (iC > iC2) {
            i4 = iC - i3;
            i5 = i4 - i;
        }
        dVar.z(i4, i5);
        i(gVar, dVar);
    }

    public static void g(f.d dVar, c.g gVar, f.d dVar2) {
        float f2 = dVar2.X;
        f.c cVar = dVar2.C;
        int iD = cVar.d() + cVar.f532f.c();
        f.c cVar2 = dVar2.E;
        int iC = cVar2.f532f.c() - cVar2.d();
        if (iC >= iD) {
            int i = dVar2.i();
            if (dVar2.Z != 8) {
                int i2 = dVar2.f547m;
                if (i2 == 2) {
                    i = (int) (f2 * 0.5f * (dVar instanceof f.e ? dVar.i() : dVar.M.i()));
                } else if (i2 == 0) {
                    i = iC - iD;
                }
                i = Math.max(dVar2.r, i);
                int i3 = dVar2.f552s;
                if (i3 > 0) {
                    i = Math.min(i3, i);
                }
            }
            int i4 = iD + ((int) ((f2 * ((iC - iD) - i)) + 0.5f));
            dVar2.z(i4, i + i4);
            i(gVar, dVar2);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(c.g gVar, f.d dVar) {
        f.c cVar;
        f.c cVar2;
        f.c cVar3;
        f.c cVar4;
        f.c cVar5;
        if (!(dVar instanceof f.e) && dVar.t() && a(dVar)) {
            f.e.L(dVar, gVar, new b());
        }
        f.c cVarG = dVar.g(3);
        f.c cVarG2 = dVar.g(5);
        int iC = cVarG.c();
        int iC2 = cVarG2.c();
        HashSet<f.c> hashSet = cVarG.f527a;
        if (hashSet != null && cVarG.f529c) {
            for (f.c cVar6 : hashSet) {
                f.d dVar2 = cVar6.f530d;
                boolean zA = a(dVar2);
                f.c cVar7 = dVar2.C;
                f.c cVar8 = dVar2.E;
                if (dVar2.t() && zA) {
                    f.e.L(dVar2, gVar, new b());
                }
                int i = dVar2.i0[1];
                if (i != 3 || zA) {
                    if (!dVar2.t()) {
                        if (cVar6 == cVar7 && cVar8.f532f == null) {
                            int iD = cVar7.d() + iC;
                            dVar2.z(iD, dVar2.i() + iD);
                            i(gVar, dVar2);
                        } else if (cVar6 == cVar8 && cVar8.f532f == null) {
                            int iD2 = iC - cVar8.d();
                            dVar2.z(iD2 - dVar2.i(), iD2);
                            i(gVar, dVar2);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f532f) != null && cVar3.f529c) {
                            f(gVar, dVar2);
                        }
                    }
                } else if (i == 3 && dVar2.f552s >= 0 && dVar2.r >= 0 && (dVar2.Z == 8 || (dVar2.f547m == 0 && dVar2.P == 0.0f))) {
                    if (!dVar2.s() && ((cVar6 == cVar7 && (cVar5 = cVar8.f532f) != null && cVar5.f529c) || (cVar6 == cVar8 && (cVar4 = cVar7.f532f) != null && cVar4.f529c))) {
                        if (!dVar2.s()) {
                            g(dVar, gVar, dVar2);
                        }
                    }
                }
            }
        }
        if (dVar instanceof f.f) {
            return;
        }
        HashSet<f.c> hashSet2 = cVarG2.f527a;
        if (hashSet2 != null && cVarG2.f529c) {
            for (f.c cVar9 : hashSet2) {
                f.d dVar3 = cVar9.f530d;
                boolean zA2 = a(dVar3);
                f.c cVar10 = dVar3.C;
                f.c cVar11 = dVar3.E;
                if (dVar3.t() && zA2) {
                    f.e.L(dVar3, gVar, new b());
                }
                boolean z2 = (cVar9 == cVar10 && (cVar2 = cVar11.f532f) != null && cVar2.f529c) || (cVar9 == cVar11 && (cVar = cVar10.f532f) != null && cVar.f529c);
                int i2 = dVar3.i0[1];
                if (i2 != 3 || zA2) {
                    if (!dVar3.t()) {
                        if (cVar9 == cVar10 && cVar11.f532f == null) {
                            int iD3 = cVar10.d() + iC2;
                            dVar3.z(iD3, dVar3.i() + iD3);
                            i(gVar, dVar3);
                        } else if (cVar9 == cVar11 && cVar10.f532f == null) {
                            int iD4 = iC2 - cVar11.d();
                            dVar3.z(iD4 - dVar3.i(), iD4);
                            i(gVar, dVar3);
                        } else if (z2 && !dVar3.s()) {
                            f(gVar, dVar3);
                        }
                    }
                } else if (i2 == 3 && dVar3.f552s >= 0 && dVar3.r >= 0 && (dVar3.Z == 8 || (dVar3.f547m == 0 && dVar3.P == 0.0f))) {
                    if (!dVar3.s() && z2 && !dVar3.s()) {
                        g(dVar, gVar, dVar3);
                    }
                }
            }
        }
        f.c cVarG3 = dVar.g(6);
        if (cVarG3.f527a == null || !cVarG3.f529c) {
            return;
        }
        int iC3 = cVarG3.c();
        for (f.c cVar12 : cVarG3.f527a) {
            f.d dVar4 = cVar12.f530d;
            boolean zA3 = a(dVar4);
            f.c cVar13 = dVar4.F;
            if (dVar4.t() && zA3) {
                f.e.L(dVar4, gVar, new b());
            }
            if (dVar4.i0[1] != 3 || zA3) {
                if (!dVar4.t() && cVar12 == cVar13) {
                    if (dVar4.f558y) {
                        int i3 = iC3 - dVar4.T;
                        int i4 = dVar4.O + i3;
                        dVar4.S = i3;
                        dVar4.C.i(i3);
                        dVar4.E.i(i4);
                        cVar13.i(iC3);
                        dVar4.i = true;
                    }
                    i(gVar, dVar4);
                }
            }
        }
    }
}
