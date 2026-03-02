package g;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f593k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // g.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(g.d r24) {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a(g.d):void");
    }

    @Override // g.p
    public final void d() {
        f.d dVar;
        f.d dVar2;
        f.d dVar3;
        f.d dVar4;
        f.d dVar5 = this.f606b;
        boolean z2 = dVar5.f536a;
        g gVar = this.f609e;
        if (z2) {
            gVar.d(dVar5.l());
        }
        boolean z3 = gVar.f588j;
        f fVar = this.i;
        f fVar2 = this.f612h;
        if (!z3) {
            f.d dVar6 = this.f606b;
            int i = dVar6.i0[0];
            this.f608d = i;
            if (i != 3) {
                if (i == 4 && (((dVar4 = dVar6.M) != null && dVar4.i0[0] == 1) || dVar4.i0[0] == 4)) {
                    int iL = (dVar4.l() - this.f606b.B.d()) - this.f606b.D.d();
                    p.b(fVar2, dVar4.f539d.f612h, this.f606b.B.d());
                    p.b(fVar, dVar4.f539d.i, -this.f606b.D.d());
                    gVar.d(iL);
                    return;
                }
                if (i == 1) {
                    gVar.d(dVar6.l());
                }
            }
        } else if (this.f608d == 4 && (((dVar2 = (dVar = this.f606b).M) != null && dVar2.i0[0] == 1) || dVar2.i0[0] == 4)) {
            p.b(fVar2, dVar2.f539d.f612h, dVar.B.d());
            p.b(fVar, dVar2.f539d.i, -this.f606b.D.d());
            return;
        }
        if (gVar.f588j) {
            f.d dVar7 = this.f606b;
            if (dVar7.f536a) {
                f.c[] cVarArr = dVar7.J;
                f.c cVar = cVarArr[0];
                f.c cVar2 = cVar.f532f;
                if (cVar2 != null && cVarArr[1].f532f != null) {
                    if (dVar7.r()) {
                        fVar2.f585f = this.f606b.J[0].d();
                        fVar.f585f = -this.f606b.J[1].d();
                        return;
                    }
                    f fVarH = p.h(this.f606b.J[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f606b.J[0].d());
                    }
                    f fVarH2 = p.h(this.f606b.J[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f606b.J[1].d());
                    }
                    fVar2.f581b = true;
                    fVar.f581b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f606b.J[0].d());
                        p.b(fVar, fVar2, gVar.f586g);
                        return;
                    }
                    return;
                }
                f.c cVar3 = cVarArr[1];
                if (cVar3.f532f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f606b.J[1].d());
                        p.b(fVar2, fVar, -gVar.f586g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof f.a) || dVar7.M == null || dVar7.g(7).f532f != null) {
                    return;
                }
                f.d dVar8 = this.f606b;
                p.b(fVar2, dVar8.M.f539d.f612h, dVar8.m());
                p.b(fVar, fVar2, gVar.f586g);
                return;
            }
        }
        if (this.f608d == 3) {
            f.d dVar9 = this.f606b;
            int i2 = dVar9.f546l;
            if (i2 == 2) {
                f.d dVar10 = dVar9.M;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f540e.f609e;
                    gVar.f590l.add(gVar2);
                    gVar2.f589k.add(gVar);
                    gVar.f581b = true;
                    gVar.f589k.add(fVar2);
                    gVar.f589k.add(fVar);
                }
            } else if (i2 == 3) {
                if (dVar9.f547m == 3) {
                    fVar2.f580a = this;
                    fVar.f580a = this;
                    m mVar = dVar9.f540e;
                    mVar.f612h.f580a = this;
                    mVar.i.f580a = this;
                    gVar.f580a = this;
                    if (dVar9.s()) {
                        gVar.f590l.add(this.f606b.f540e.f609e);
                        this.f606b.f540e.f609e.f589k.add(gVar);
                        m mVar2 = this.f606b.f540e;
                        mVar2.f609e.f580a = this;
                        gVar.f590l.add(mVar2.f612h);
                        gVar.f590l.add(this.f606b.f540e.i);
                        this.f606b.f540e.f612h.f589k.add(gVar);
                        this.f606b.f540e.i.f589k.add(gVar);
                    } else if (this.f606b.r()) {
                        this.f606b.f540e.f609e.f590l.add(gVar);
                        gVar.f589k.add(this.f606b.f540e.f609e);
                    } else {
                        this.f606b.f540e.f609e.f590l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f540e.f609e;
                    gVar.f590l.add(gVar3);
                    gVar3.f589k.add(gVar);
                    this.f606b.f540e.f612h.f589k.add(gVar);
                    this.f606b.f540e.i.f589k.add(gVar);
                    gVar.f581b = true;
                    gVar.f589k.add(fVar2);
                    gVar.f589k.add(fVar);
                    fVar2.f590l.add(gVar);
                    fVar.f590l.add(gVar);
                }
            }
        }
        f.d dVar11 = this.f606b;
        f.c[] cVarArr2 = dVar11.J;
        f.c cVar4 = cVarArr2[0];
        f.c cVar5 = cVar4.f532f;
        if (cVar5 != null && cVarArr2[1].f532f != null) {
            if (dVar11.r()) {
                fVar2.f585f = this.f606b.J[0].d();
                fVar.f585f = -this.f606b.J[1].d();
                return;
            }
            f fVarH5 = p.h(this.f606b.J[0]);
            f fVarH6 = p.h(this.f606b.J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f613j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = p.h(cVar4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f606b.J[0].d());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        f.c cVar6 = cVarArr2[1];
        if (cVar6.f532f != null) {
            f fVarH8 = p.h(cVar6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f606b.J[1].d());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof f.a) || (dVar3 = dVar11.M) == null) {
            return;
        }
        p.b(fVar2, dVar3.f539d.f612h, dVar11.m());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // g.p
    public final void e() {
        f fVar = this.f612h;
        if (fVar.f588j) {
            this.f606b.R = fVar.f586g;
        }
    }

    @Override // g.p
    public final void f() {
        this.f607c = null;
        this.f612h.c();
        this.i.c();
        this.f609e.c();
        this.f611g = false;
    }

    @Override // g.p
    public final boolean k() {
        return this.f608d != 3 || this.f606b.f546l == 0;
    }

    public final void n() {
        this.f611g = false;
        f fVar = this.f612h;
        fVar.c();
        fVar.f588j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f588j = false;
        this.f609e.f588j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f606b.a0;
    }
}
