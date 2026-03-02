package e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f476p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f477q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f480c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f483f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f488l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f491o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f478a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f479b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f481d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f482e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f484g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f485h = new boolean[32];
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f486j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f487k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f489m = new i[f477q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f490n = 0;

    public d() {
        this.f483f = null;
        this.f483f = new b[32];
        s();
        c cVar = new c();
        cVar.f473a = new e();
        cVar.f474b = new e();
        cVar.f475c = new i[32];
        this.f488l = cVar;
        h hVar = new h(cVar);
        hVar.f497f = new i[128];
        hVar.f498g = new i[128];
        hVar.f499h = 0;
        hVar.i = new g(hVar);
        this.f480c = hVar;
        this.f491o = new b(cVar);
    }

    public static int n(Object obj) {
        i iVar = ((f.c) obj).i;
        if (iVar != null) {
            return (int) (iVar.f504e + 0.5f);
        }
        return 0;
    }

    public final i a(int i) {
        e eVar = (e) this.f488l.f474b;
        int i2 = eVar.f492a;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = eVar.f493b;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            eVar.f492a = i3;
            obj = obj2;
        }
        i iVar = (i) obj;
        if (iVar == null) {
            iVar = new i(i);
            iVar.f510l = i;
        } else {
            iVar.c();
            iVar.f510l = i;
        }
        int i4 = this.f490n;
        int i5 = f477q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f477q = i6;
            this.f489m = (i[]) Arrays.copyOf(this.f489m, i6);
        }
        i[] iVarArr = this.f489m;
        int i7 = this.f490n;
        this.f490n = i7 + 1;
        iVarArr[i7] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2, int i3) {
        b bVarL = l();
        if (iVar2 == iVar3) {
            bVarL.f470d.g(iVar, 1.0f);
            bVarL.f470d.g(iVar4, 1.0f);
            bVarL.f470d.g(iVar2, -2.0f);
        } else if (f2 == 0.5f) {
            bVarL.f470d.g(iVar, 1.0f);
            bVarL.f470d.g(iVar2, -1.0f);
            bVarL.f470d.g(iVar3, -1.0f);
            bVarL.f470d.g(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                bVarL.f468b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            bVarL.f470d.g(iVar, -1.0f);
            bVarL.f470d.g(iVar2, 1.0f);
            bVarL.f468b = i;
        } else if (f2 >= 1.0f) {
            bVarL.f470d.g(iVar4, -1.0f);
            bVarL.f470d.g(iVar3, 1.0f);
            bVarL.f468b = -i2;
        } else {
            float f3 = 1.0f - f2;
            bVarL.f470d.g(iVar, f3 * 1.0f);
            bVarL.f470d.g(iVar2, f3 * (-1.0f));
            bVarL.f470d.g(iVar3, (-1.0f) * f2);
            bVarL.f470d.g(iVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                bVarL.f468b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            bVarL.a(this, i3);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(e.b r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.c(e.b):void");
    }

    public final void d(i iVar, int i) {
        int i2 = iVar.f502c;
        if (i2 == -1) {
            iVar.d(this, i);
            for (int i3 = 0; i3 < this.f479b + 1; i3++) {
                i iVar2 = ((i[]) this.f488l.f475c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            b bVarL = l();
            bVarL.f467a = iVar;
            float f2 = i;
            iVar.f504e = f2;
            bVarL.f468b = f2;
            bVarL.f471e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f483f[i2];
        if (bVar.f471e) {
            bVar.f468b = i;
            return;
        }
        if (bVar.f470d.d() == 0) {
            bVar.f471e = true;
            bVar.f468b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.f468b = i * (-1);
            bVarL2.f470d.g(iVar, 1.0f);
        } else {
            bVarL2.f468b = i;
            bVarL2.f470d.g(iVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(i iVar, i iVar2, int i, int i2) {
        if (i2 == 8 && iVar2.f505f && iVar.f502c == -1) {
            iVar.d(this, iVar2.f504e + i);
            return;
        }
        b bVarL = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            bVarL.f468b = i;
        }
        if (z2) {
            bVarL.f470d.g(iVar, 1.0f);
            bVarL.f470d.g(iVar2, -1.0f);
        } else {
            bVarL.f470d.g(iVar, -1.0f);
            bVarL.f470d.g(iVar2, 1.0f);
        }
        if (i2 != 8) {
            bVarL.a(this, i2);
        }
        c(bVarL);
    }

    public final void f(i iVar, i iVar2, int i, int i2) {
        b bVarL = l();
        i iVarM = m();
        iVarM.f503d = 0;
        bVarL.b(iVar, iVar2, iVarM, i);
        if (i2 != 8) {
            bVarL.f470d.g(j(i2), (int) (bVarL.f470d.c(iVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(i iVar, i iVar2, int i, int i2) {
        b bVarL = l();
        i iVarM = m();
        iVarM.f503d = 0;
        bVarL.c(iVar, iVar2, iVarM, i);
        if (i2 != 8) {
            bVarL.f470d.g(j(i2), (int) (bVarL.f470d.c(iVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f471e) {
            bVar.f467a.d(this, bVar.f468b);
        } else {
            b[] bVarArr = this.f483f;
            int i2 = this.f486j;
            bVarArr[i2] = bVar;
            i iVar = bVar.f467a;
            iVar.f502c = i2;
            this.f486j = i2 + 1;
            iVar.e(this, bVar);
        }
        if (this.f478a) {
            int i3 = 0;
            while (i3 < this.f486j) {
                if (this.f483f[i3] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f483f[i3];
                if (bVar2 != null && bVar2.f471e) {
                    bVar2.f467a.d(this, bVar2.f468b);
                    ((e) this.f488l.f473a).a(bVar2);
                    this.f483f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f486j;
                        if (i4 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f483f;
                        int i6 = i4 - 1;
                        b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        i iVar2 = bVar3.f467a;
                        if (iVar2.f502c == i4) {
                            iVar2.f502c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f483f[i5] = null;
                    }
                    this.f486j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f478a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f486j; i++) {
            b bVar = this.f483f[i];
            bVar.f467a.f504e = bVar.f468b;
        }
    }

    public final i j(int i) {
        if (this.i + 1 >= this.f482e) {
            o();
        }
        i iVarA = a(4);
        float[] fArr = iVarA.f507h;
        int i2 = this.f479b + 1;
        this.f479b = i2;
        this.i++;
        iVarA.f501b = i2;
        iVarA.f503d = i;
        ((i[]) this.f488l.f475c)[i2] = iVarA;
        h hVar = this.f480c;
        hVar.i.f495b = iVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f503d] = 1.0f;
        hVar.j(iVarA);
        return iVarA;
    }

    public final i k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f482e) {
            o();
        }
        if (!(obj instanceof f.c)) {
            return null;
        }
        f.c cVar = (f.c) obj;
        i iVar = cVar.i;
        if (iVar == null) {
            cVar.h();
            iVar = cVar.i;
        }
        int i = iVar.f501b;
        c cVar2 = this.f488l;
        if (i != -1 && i <= this.f479b && ((i[]) cVar2.f475c)[i] != null) {
            return iVar;
        }
        if (i != -1) {
            iVar.c();
        }
        int i2 = this.f479b + 1;
        this.f479b = i2;
        this.i++;
        iVar.f501b = i2;
        iVar.f510l = 1;
        ((i[]) cVar2.f475c)[i2] = iVar;
        return iVar;
    }

    public final b l() {
        Object obj;
        c cVar = this.f488l;
        e eVar = (e) cVar.f473a;
        int i = eVar.f492a;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = eVar.f493b;
            obj = objArr[i2];
            objArr[i2] = null;
            eVar.f492a = i2;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f467a = null;
        bVar.f470d.b();
        bVar.f468b = 0.0f;
        bVar.f471e = false;
        return bVar;
    }

    public final i m() {
        if (this.i + 1 >= this.f482e) {
            o();
        }
        i iVarA = a(3);
        int i = this.f479b + 1;
        this.f479b = i;
        this.i++;
        iVarA.f501b = i;
        ((i[]) this.f488l.f475c)[i] = iVarA;
        return iVarA;
    }

    public final void o() {
        int i = this.f481d * 2;
        this.f481d = i;
        this.f483f = (b[]) Arrays.copyOf(this.f483f, i);
        c cVar = this.f488l;
        cVar.f475c = (i[]) Arrays.copyOf((i[]) cVar.f475c, this.f481d);
        int i2 = this.f481d;
        this.f485h = new boolean[i2];
        this.f482e = i2;
        this.f487k = i2;
    }

    public final void p() {
        h hVar = this.f480c;
        if (hVar.e()) {
            i();
            return;
        }
        if (!this.f484g) {
            q(hVar);
            return;
        }
        for (int i = 0; i < this.f486j; i++) {
            if (!this.f483f[i].f471e) {
                q(hVar);
                return;
            }
        }
        i();
    }

    public final void q(h hVar) {
        int i = 0;
        while (true) {
            if (i >= this.f486j) {
                break;
            }
            b bVar = this.f483f[i];
            int i2 = 1;
            if (bVar.f467a.f510l != 1) {
                float f2 = 0.0f;
                if (bVar.f468b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f486j) {
                            b bVar2 = this.f483f[i6];
                            if (bVar2.f467a.f510l != i2 && !bVar2.f471e && bVar2.f468b < f2) {
                                int iD = bVar2.f470d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    i iVarE = bVar2.f470d.e(i8);
                                    float fC = bVar2.f470d.c(iVarE);
                                    if (fC > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = iVarE.f506g[i9] / fC;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = iVarE.f501b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i6++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            b bVar3 = this.f483f[i4];
                            bVar3.f467a.f502c = -1;
                            bVar3.g(((i[]) this.f488l.f475c)[i5]);
                            i iVar = bVar3.f467a;
                            iVar.f502c = i4;
                            iVar.e(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(hVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(e.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.i
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.f485h
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.i
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            e.i r6 = r1.f467a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.f485h
            int r6 = r6.f501b
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.f485h
            e.i r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.f485h
            int r8 = r6.f501b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.f486j
            if (r9 >= r11) goto L97
            e.b[] r11 = r0.f483f
            r11 = r11[r9]
            e.i r12 = r11.f467a
            int r12 = r12.f510l
            if (r12 != r5) goto L54
            goto L92
        L54:
            boolean r12 = r11.f471e
            if (r12 == 0) goto L59
            goto L92
        L59:
            e.a r12 = r11.f470d
            int r13 = r12.f465h
            r15 = -1
            if (r13 != r15) goto L61
            goto L7a
        L61:
            r2 = 0
        L62:
            if (r13 == r15) goto L7a
            int r5 = r12.f458a
            if (r2 >= r5) goto L7a
            int[] r5 = r12.f462e
            r5 = r5[r13]
            int r14 = r6.f501b
            if (r5 != r14) goto L72
            r14 = 1
            goto L7b
        L72:
            int[] r5 = r12.f463f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L62
        L7a:
            r14 = 0
        L7b:
            if (r14 == 0) goto L92
            e.a r2 = r11.f470d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L92
            float r5 = r11.f468b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L92
            r8 = r5
            r10 = r9
        L92:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            e.b[] r2 = r0.f483f
            r2 = r2[r10]
            e.i r5 = r2.f467a
            r5.f502c = r7
            r2.g(r6)
            e.i r5 = r2.f467a
            r5.f502c = r10
            r5.e(r0, r2)
            goto Lad
        Lac:
            r3 = 1
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.r(e.b):void");
    }

    public final void s() {
        for (int i = 0; i < this.f486j; i++) {
            b bVar = this.f483f[i];
            if (bVar != null) {
                ((e) this.f488l.f473a).a(bVar);
            }
            this.f483f[i] = null;
        }
    }

    public final void t() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.f488l;
            i[] iVarArr = (i[]) cVar.f475c;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.c();
            }
            i++;
        }
        e eVar = (e) cVar.f474b;
        i[] iVarArr2 = this.f489m;
        int length = this.f490n;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            i iVar2 = iVarArr2[i2];
            int i3 = eVar.f492a;
            Object[] objArr = eVar.f493b;
            if (i3 < objArr.length) {
                objArr[i3] = iVar2;
                eVar.f492a = i3 + 1;
            }
        }
        this.f490n = 0;
        Arrays.fill((i[]) cVar.f475c, (Object) null);
        this.f479b = 0;
        h hVar = this.f480c;
        hVar.f499h = 0;
        hVar.f468b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.f486j; i4++) {
            b bVar = this.f483f[i4];
        }
        s();
        this.f486j = 0;
        this.f491o = new b(cVar);
    }
}
