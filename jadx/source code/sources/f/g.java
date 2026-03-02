package f;

import e.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f560a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:183:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(f.e r40, e.d r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g.a(f.e, e.d, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, e.d dVar, d dVar2) {
        dVar2.f544j = -1;
        c cVar = dVar2.F;
        int[] iArr = dVar2.i0;
        c cVar2 = dVar2.E;
        c cVar3 = dVar2.C;
        c cVar4 = dVar2.D;
        c cVar5 = dVar2.B;
        dVar2.f545k = -1;
        if (eVar.i0[0] != 2 && iArr[0] == 4) {
            int i = cVar5.f533g;
            int iL = eVar.l() - cVar4.f533g;
            cVar5.i = dVar.k(cVar5);
            cVar4.i = dVar.k(cVar4);
            dVar.d(cVar5.i, i);
            dVar.d(cVar4.i, iL);
            dVar2.f544j = 2;
            dVar2.R = i;
            int i2 = iL - i;
            dVar2.N = i2;
            int i3 = dVar2.U;
            if (i2 < i3) {
                dVar2.N = i3;
            }
        }
        if (eVar.i0[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = cVar3.f533g;
        int i5 = eVar.i() - cVar2.f533g;
        cVar3.i = dVar.k(cVar3);
        cVar2.i = dVar.k(cVar2);
        dVar.d(cVar3.i, i4);
        dVar.d(cVar2.i, i5);
        if (dVar2.T > 0 || dVar2.Z == 8) {
            i iVarK = dVar.k(cVar);
            cVar.i = iVarK;
            dVar.d(iVarK, dVar2.T + i4);
        }
        dVar2.f545k = 2;
        dVar2.S = i4;
        int i6 = i5 - i4;
        dVar2.O = i6;
        int i7 = dVar2.V;
        if (i6 < i7) {
            dVar2.O = i7;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
