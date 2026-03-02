package f;

import android.view.View;
import g.k;
import g.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public final c B;
    public final c C;
    public final c D;
    public final c E;
    public final c F;
    public final c G;
    public final c H;
    public final c I;
    public final c[] J;
    public final ArrayList K;
    public final boolean[] L;
    public d M;
    public int N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public float X;
    public View Y;
    public int Z;
    public String a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g.c f537b;
    public int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g.c f538c;
    public int c0;
    public final float[] d0;
    public final d[] e0;
    public final d[] f0;
    public int g0;
    public int h0;
    public final int[] i0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f536a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f539d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f540e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f541f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f542g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f543h = false;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f544j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f545k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f546l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f547m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f548n = new int[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f549o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f550p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f551q = 1.0f;
    public int r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f552s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f553t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f554u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f555v = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f556w = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f557x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f558y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f559z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f535A = 0;

    public d() {
        c cVar = new c(this, 2);
        this.B = cVar;
        c cVar2 = new c(this, 3);
        this.C = cVar2;
        c cVar3 = new c(this, 4);
        this.D = cVar3;
        c cVar4 = new c(this, 5);
        this.E = cVar4;
        c cVar5 = new c(this, 6);
        this.F = cVar5;
        c cVar6 = new c(this, 8);
        this.G = cVar6;
        c cVar7 = new c(this, 9);
        this.H = cVar7;
        c cVar8 = new c(this, 7);
        this.I = cVar8;
        this.J = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = new boolean[2];
        this.i0 = new int[]{1, 1};
        this.M = null;
        this.N = 0;
        this.O = 0;
        this.P = 0.0f;
        this.Q = -1;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.W = 0.5f;
        this.X = 0.5f;
        this.Z = 0;
        this.a0 = null;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = new float[]{-1.0f, -1.0f};
        this.e0 = new d[]{null, null};
        this.f0 = new d[]{null, null};
        this.g0 = -1;
        this.h0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A(int i) {
        this.O = i;
        int i2 = this.V;
        if (i < i2) {
            this.O = i2;
        }
    }

    public final void B(int i) {
        this.i0[0] = i;
    }

    public final void C(int i) {
        this.i0[1] = i;
    }

    public final void D(int i) {
        this.N = i;
        int i2 = this.U;
        if (i < i2) {
            this.N = i2;
        }
    }

    public void E(boolean z2, boolean z3) {
        int i;
        int i2;
        k kVar = this.f539d;
        boolean z4 = z2 & kVar.f611g;
        m mVar = this.f540e;
        boolean z5 = z3 & mVar.f611g;
        int i3 = kVar.f612h.f586g;
        int i4 = mVar.f612h.f586g;
        int i5 = kVar.i.f586g;
        int i6 = mVar.i.f586g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z4) {
            this.R = i3;
        }
        if (z5) {
            this.S = i4;
        }
        if (this.Z == 8) {
            this.N = 0;
            this.O = 0;
            return;
        }
        int[] iArr = this.i0;
        if (z4) {
            if (iArr[0] == 1 && i8 < (i2 = this.N)) {
                i8 = i2;
            }
            this.N = i8;
            int i10 = this.U;
            if (i8 < i10) {
                this.N = i10;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i9 < (i = this.O)) {
                i9 = i;
            }
            this.O = i9;
            int i11 = this.V;
            if (i9 < i11) {
                this.O = i11;
            }
        }
    }

    public void F(e.d dVar, boolean z2) {
        int i;
        int i2;
        m mVar;
        k kVar;
        dVar.getClass();
        int iN = e.d.n(this.B);
        int iN2 = e.d.n(this.C);
        int iN3 = e.d.n(this.D);
        int iN4 = e.d.n(this.E);
        if (z2 && (kVar = this.f539d) != null) {
            g.f fVar = kVar.f612h;
            if (fVar.f588j) {
                g.f fVar2 = kVar.i;
                if (fVar2.f588j) {
                    iN = fVar.f586g;
                    iN3 = fVar2.f586g;
                }
            }
        }
        if (z2 && (mVar = this.f540e) != null) {
            g.f fVar3 = mVar.f612h;
            if (fVar3.f588j) {
                g.f fVar4 = mVar.i;
                if (fVar4.f588j) {
                    iN2 = fVar3.f586g;
                    iN4 = fVar4.f586g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.R = iN;
        this.S = iN2;
        if (this.Z == 8) {
            this.N = 0;
            this.O = 0;
            return;
        }
        int[] iArr = this.i0;
        if (iArr[0] == 1 && i4 < (i2 = this.N)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.O)) {
            i5 = i;
        }
        this.N = i4;
        this.O = i5;
        int i6 = this.V;
        if (i5 < i6) {
            this.O = i6;
        }
        int i7 = this.U;
        if (i4 < i7) {
            this.N = i7;
        }
    }

    public final void a(e eVar, e.d dVar, HashSet hashSet, int i, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.b(eVar, dVar, this);
            hashSet.remove(this);
            b(dVar, eVar.M(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.B.f527a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f530d.a(eVar, dVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.D.f527a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f530d.a(eVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.C.f527a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f530d.a(eVar, dVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.E.f527a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f530d.a(eVar, dVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.F.f527a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f530d.a(eVar, dVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r58v0, types: [f.d] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(e.d r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 1785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.b(e.d, boolean):void");
    }

    public boolean c() {
        return this.Z != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x045d A[PHI: r4
  0x045d: PHI (r4v16 int) = (r4v15 int), (r4v20 int), (r4v20 int), (r4v20 int) binds: [B:250:0x044d, B:252:0x0453, B:253:0x0455, B:255:0x0459] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(e.d r29, boolean r30, boolean r31, boolean r32, boolean r33, e.i r34, e.i r35, int r36, boolean r37, f.c r38, f.c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.d(e.d, boolean, boolean, boolean, boolean, e.i, e.i, int, boolean, f.c, f.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(e.d dVar) {
        dVar.k(this.B);
        dVar.k(this.C);
        dVar.k(this.D);
        dVar.k(this.E);
        if (this.T > 0) {
            dVar.k(this.F);
        }
    }

    public final void f() {
        if (this.f539d == null) {
            k kVar = new k(this);
            kVar.f612h.f584e = 4;
            kVar.i.f584e = 5;
            kVar.f610f = 0;
            this.f539d = kVar;
        }
        if (this.f540e == null) {
            m mVar = new m(this);
            g.f fVar = new g.f(mVar);
            mVar.f596k = fVar;
            mVar.f597l = null;
            mVar.f612h.f584e = 6;
            mVar.i.f584e = 7;
            fVar.f584e = 8;
            mVar.f610f = 1;
            this.f540e = mVar;
        }
    }

    public c g(int i) {
        switch (c.b.a(i)) {
            case 0:
                return null;
            case 1:
                return this.B;
            case 2:
                return this.C;
            case 3:
                return this.D;
            case 4:
                return this.E;
            case 5:
                return this.F;
            case 6:
                return this.I;
            case 7:
                return this.G;
            case 8:
                return this.H;
            default:
                throw new AssertionError(android.support.v4.app.e.b(i));
        }
    }

    public final int h(int i) {
        int[] iArr = this.i0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.Z == 8) {
            return 0;
        }
        return this.O;
    }

    public final d j(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.E).f532f) != null && cVar2.f532f == cVar) {
                return cVar2.f530d;
            }
            return null;
        }
        c cVar3 = this.D;
        c cVar4 = cVar3.f532f;
        if (cVar4 == null || cVar4.f532f != cVar3) {
            return null;
        }
        return cVar4.f530d;
    }

    public final d k(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.C).f532f) != null && cVar2.f532f == cVar) {
                return cVar2.f530d;
            }
            return null;
        }
        c cVar3 = this.B;
        c cVar4 = cVar3.f532f;
        if (cVar4 == null || cVar4.f532f != cVar3) {
            return null;
        }
        return cVar4.f530d;
    }

    public final int l() {
        if (this.Z == 8) {
            return 0;
        }
        return this.N;
    }

    public final int m() {
        d dVar = this.M;
        return (dVar == null || !(dVar instanceof e)) ? this.R : ((e) dVar).p0 + this.R;
    }

    public final int n() {
        d dVar = this.M;
        return (dVar == null || !(dVar instanceof e)) ? this.S : ((e) dVar).q0 + this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            f.c r5 = r4.B
            f.c r5 = r5.f532f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            f.c r3 = r4.D
            f.c r3 = r3.f532f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            f.c r5 = r4.C
            f.c r5 = r5.f532f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            f.c r3 = r4.E
            f.c r3 = r3.f532f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            f.c r3 = r4.F
            f.c r3 = r3.f532f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d.o(int):boolean");
    }

    public final void p(int i, int i2, int i3, int i4, d dVar) {
        g(i).a(dVar.g(i2), i3, i4);
    }

    public final boolean q(int i) {
        c cVar;
        c cVar2;
        int i2 = i * 2;
        c[] cVarArr = this.J;
        c cVar3 = cVarArr[i2];
        c cVar4 = cVar3.f532f;
        return (cVar4 == null || cVar4.f532f == cVar3 || (cVar2 = (cVar = cVarArr[i2 + 1]).f532f) == null || cVar2.f532f != cVar) ? false : true;
    }

    public final boolean r() {
        c cVar = this.B;
        c cVar2 = cVar.f532f;
        if (cVar2 != null && cVar2.f532f == cVar) {
            return true;
        }
        c cVar3 = this.D;
        c cVar4 = cVar3.f532f;
        return cVar4 != null && cVar4.f532f == cVar3;
    }

    public final boolean s() {
        c cVar = this.C;
        c cVar2 = cVar.f532f;
        if (cVar2 != null && cVar2.f532f == cVar) {
            return true;
        }
        c cVar3 = this.E;
        c cVar4 = cVar3.f532f;
        return cVar4 != null && cVar4.f532f == cVar3;
    }

    public final boolean t() {
        return this.f542g && this.Z != 8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.a0 != null) {
            str = "id: " + this.a0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.R);
        sb.append(", ");
        sb.append(this.S);
        sb.append(") - (");
        sb.append(this.N);
        sb.append(" x ");
        sb.append(this.O);
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        if (this.f543h) {
            return true;
        }
        return this.B.f529c && this.D.f529c;
    }

    public boolean v() {
        if (this.i) {
            return true;
        }
        return this.C.f529c && this.E.f529c;
    }

    public void w() {
        this.B.g();
        this.C.g();
        this.D.g();
        this.E.g();
        this.F.g();
        this.G.g();
        this.H.g();
        this.I.g();
        this.M = null;
        this.f557x = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0.0f;
        this.Q = -1;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0.5f;
        this.X = 0.5f;
        int[] iArr = this.i0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.Y = null;
        this.Z = 0;
        this.b0 = 0;
        this.c0 = 0;
        float[] fArr = this.d0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f544j = -1;
        this.f545k = -1;
        int[] iArr2 = this.f556w;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f546l = 0;
        this.f547m = 0;
        this.f551q = 1.0f;
        this.f553t = 1.0f;
        this.f550p = Integer.MAX_VALUE;
        this.f552s = Integer.MAX_VALUE;
        this.f549o = 0;
        this.r = 0;
        this.f554u = -1;
        this.f555v = 1.0f;
        boolean[] zArr = this.f541f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f542g = true;
    }

    public void x(e.c cVar) {
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.F.h();
        this.I.h();
        this.G.h();
        this.H.h();
    }

    public final void y(int i, int i2) {
        this.B.i(i);
        this.D.i(i2);
        this.R = i;
        this.N = i2 - i;
        this.f543h = true;
    }

    public final void z(int i, int i2) {
        this.C.i(i);
        this.E.i(i2);
        this.S = i;
        this.O = i2 - i;
        if (this.f558y) {
            this.F.i(i + this.T);
        }
        this.i = true;
    }
}
