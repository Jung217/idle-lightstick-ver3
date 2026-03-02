package g;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f597l;

    @Override // g.d
    public final void a(d dVar) {
        float f2;
        float f3;
        float f4;
        int i;
        if (c.b.a(this.f613j) == 3) {
            f.d dVar2 = this.f606b;
            l(dVar2.C, dVar2.E, 1);
            return;
        }
        g gVar = this.f609e;
        if (gVar.f582c && !gVar.f588j && this.f608d == 3) {
            f.d dVar3 = this.f606b;
            int i2 = dVar3.f547m;
            if (i2 == 2) {
                f.d dVar4 = dVar3.M;
                if (dVar4 != null) {
                    if (dVar4.f540e.f609e.f588j) {
                        gVar.d((int) ((r5.f586g * dVar3.f553t) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar3.f539d.f609e;
                if (gVar2.f588j) {
                    int i3 = dVar3.Q;
                    if (i3 == -1) {
                        f2 = gVar2.f586g;
                        f3 = dVar3.P;
                    } else if (i3 == 0) {
                        f4 = gVar2.f586g * dVar3.P;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f586g;
                        f3 = dVar3.P;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.f612h;
        if (fVar.f582c) {
            f fVar2 = this.i;
            if (fVar2.f582c) {
                if (fVar.f588j && fVar2.f588j && gVar.f588j) {
                    return;
                }
                if (!gVar.f588j && this.f608d == 3) {
                    f.d dVar5 = this.f606b;
                    if (dVar5.f546l == 0 && !dVar5.s()) {
                        f fVar3 = (f) fVar.f590l.get(0);
                        f fVar4 = (f) fVar2.f590l.get(0);
                        int i4 = fVar3.f586g + fVar.f585f;
                        int i5 = fVar4.f586g + fVar2.f585f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f588j && this.f608d == 3 && this.f605a == 1 && fVar.f590l.size() > 0 && fVar2.f590l.size() > 0) {
                    f fVar5 = (f) fVar.f590l.get(0);
                    int i6 = (((f) fVar2.f590l.get(0)).f586g + fVar2.f585f) - (fVar5.f586g + fVar.f585f);
                    int i7 = gVar.f591m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f588j && fVar.f590l.size() > 0 && fVar2.f590l.size() > 0) {
                    f fVar6 = (f) fVar.f590l.get(0);
                    f fVar7 = (f) fVar2.f590l.get(0);
                    int i8 = fVar6.f586g;
                    int i9 = fVar.f585f + i8;
                    int i10 = fVar7.f586g;
                    int i11 = fVar2.f585f + i10;
                    float f5 = this.f606b.X;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.f586g) * f5) + i8 + 0.5f));
                    fVar2.d(fVar.f586g + gVar.f586g);
                }
            }
        }
    }

    @Override // g.p
    public final void d() {
        f.d dVar;
        f.d dVar2;
        f.d dVar3;
        f.d dVar4;
        f fVar = this.f596k;
        f.d dVar5 = this.f606b;
        boolean z2 = dVar5.f536a;
        g gVar = this.f609e;
        if (z2) {
            gVar.d(dVar5.i());
        }
        boolean z3 = gVar.f588j;
        f fVar2 = this.i;
        f fVar3 = this.f612h;
        if (!z3) {
            f.d dVar6 = this.f606b;
            this.f608d = dVar6.i0[1];
            if (dVar6.f558y) {
                this.f597l = new a(this);
            }
            int i = this.f608d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f606b.M) != null && dVar4.i0[1] == 1) {
                    int i2 = (dVar4.i() - this.f606b.C.d()) - this.f606b.E.d();
                    p.b(fVar3, dVar4.f540e.f612h, this.f606b.C.d());
                    p.b(fVar2, dVar4.f540e.i, -this.f606b.E.d());
                    gVar.d(i2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f606b.i());
                }
            }
        } else if (this.f608d == 4 && (dVar2 = (dVar = this.f606b).M) != null && dVar2.i0[1] == 1) {
            p.b(fVar3, dVar2.f540e.f612h, dVar.C.d());
            p.b(fVar2, dVar2.f540e.i, -this.f606b.E.d());
            return;
        }
        boolean z4 = gVar.f588j;
        if (z4) {
            f.d dVar7 = this.f606b;
            if (dVar7.f536a) {
                f.c[] cVarArr = dVar7.J;
                f.c cVar = cVarArr[2];
                f.c cVar2 = cVar.f532f;
                if (cVar2 != null && cVarArr[3].f532f != null) {
                    if (dVar7.s()) {
                        fVar3.f585f = this.f606b.J[2].d();
                        fVar2.f585f = -this.f606b.J[3].d();
                    } else {
                        f fVarH = p.h(this.f606b.J[2]);
                        if (fVarH != null) {
                            p.b(fVar3, fVarH, this.f606b.J[2].d());
                        }
                        f fVarH2 = p.h(this.f606b.J[3]);
                        if (fVarH2 != null) {
                            p.b(fVar2, fVarH2, -this.f606b.J[3].d());
                        }
                        fVar3.f581b = true;
                        fVar2.f581b = true;
                    }
                    f.d dVar8 = this.f606b;
                    if (dVar8.f558y) {
                        p.b(fVar, fVar3, dVar8.T);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar3, fVarH3, this.f606b.J[2].d());
                        p.b(fVar2, fVar3, gVar.f586g);
                        f.d dVar9 = this.f606b;
                        if (dVar9.f558y) {
                            p.b(fVar, fVar3, dVar9.T);
                            return;
                        }
                        return;
                    }
                    return;
                }
                f.c cVar3 = cVarArr[3];
                if (cVar3.f532f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar2, fVarH4, -this.f606b.J[3].d());
                        p.b(fVar3, fVar2, -gVar.f586g);
                    }
                    f.d dVar10 = this.f606b;
                    if (dVar10.f558y) {
                        p.b(fVar, fVar3, dVar10.T);
                        return;
                    }
                    return;
                }
                f.c cVar4 = cVarArr[4];
                if (cVar4.f532f != null) {
                    f fVarH5 = p.h(cVar4);
                    if (fVarH5 != null) {
                        p.b(fVar, fVarH5, 0);
                        p.b(fVar3, fVar, -this.f606b.T);
                        p.b(fVar2, fVar3, gVar.f586g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof f.a) || dVar7.M == null || dVar7.g(7).f532f != null) {
                    return;
                }
                f.d dVar11 = this.f606b;
                p.b(fVar3, dVar11.M.f540e.f612h, dVar11.n());
                p.b(fVar2, fVar3, gVar.f586g);
                f.d dVar12 = this.f606b;
                if (dVar12.f558y) {
                    p.b(fVar, fVar3, dVar12.T);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f608d != 3) {
            gVar.b(this);
        } else {
            f.d dVar13 = this.f606b;
            int i3 = dVar13.f547m;
            if (i3 == 2) {
                f.d dVar14 = dVar13.M;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f540e.f609e;
                    gVar.f590l.add(gVar2);
                    gVar2.f589k.add(gVar);
                    gVar.f581b = true;
                    gVar.f589k.add(fVar3);
                    gVar.f589k.add(fVar2);
                }
            } else if (i3 == 3 && !dVar13.s()) {
                f.d dVar15 = this.f606b;
                if (dVar15.f546l != 3) {
                    g gVar3 = dVar15.f539d.f609e;
                    gVar.f590l.add(gVar3);
                    gVar3.f589k.add(gVar);
                    gVar.f581b = true;
                    gVar.f589k.add(fVar3);
                    gVar.f589k.add(fVar2);
                }
            }
        }
        f.d dVar16 = this.f606b;
        f.c[] cVarArr2 = dVar16.J;
        f.c cVar5 = cVarArr2[2];
        f.c cVar6 = cVar5.f532f;
        if (cVar6 != null && cVarArr2[3].f532f != null) {
            if (dVar16.s()) {
                fVar3.f585f = this.f606b.J[2].d();
                fVar2.f585f = -this.f606b.J[3].d();
            } else {
                f fVarH6 = p.h(this.f606b.J[2]);
                f fVarH7 = p.h(this.f606b.J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f613j = 4;
            }
            if (this.f606b.f558y) {
                c(fVar, fVar3, 1, this.f597l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = p.h(cVar5);
            if (fVarH8 != null) {
                p.b(fVar3, fVarH8, this.f606b.J[2].d());
                c(fVar2, fVar3, 1, gVar);
                if (this.f606b.f558y) {
                    c(fVar, fVar3, 1, this.f597l);
                }
                if (this.f608d == 3) {
                    f.d dVar17 = this.f606b;
                    if (dVar17.P > 0.0f) {
                        k kVar = dVar17.f539d;
                        if (kVar.f608d == 3) {
                            kVar.f609e.f589k.add(gVar);
                            gVar.f590l.add(this.f606b.f539d.f609e);
                            gVar.f580a = this;
                        }
                    }
                }
            }
        } else {
            f.c cVar7 = cVarArr2[3];
            if (cVar7.f532f != null) {
                f fVarH9 = p.h(cVar7);
                if (fVarH9 != null) {
                    p.b(fVar2, fVarH9, -this.f606b.J[3].d());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f606b.f558y) {
                        c(fVar, fVar3, 1, this.f597l);
                    }
                }
            } else {
                f.c cVar8 = cVarArr2[4];
                if (cVar8.f532f != null) {
                    f fVarH10 = p.h(cVar8);
                    if (fVarH10 != null) {
                        p.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f597l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof f.a) && (dVar3 = dVar16.M) != null) {
                    p.b(fVar3, dVar3.f540e.f612h, dVar16.n());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f606b.f558y) {
                        c(fVar, fVar3, 1, this.f597l);
                    }
                    if (this.f608d == 3) {
                        f.d dVar18 = this.f606b;
                        if (dVar18.P > 0.0f) {
                            k kVar2 = dVar18.f539d;
                            if (kVar2.f608d == 3) {
                                kVar2.f609e.f589k.add(gVar);
                                gVar.f590l.add(this.f606b.f539d.f609e);
                                gVar.f580a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f590l.size() == 0) {
            gVar.f582c = true;
        }
    }

    @Override // g.p
    public final void e() {
        f fVar = this.f612h;
        if (fVar.f588j) {
            this.f606b.S = fVar.f586g;
        }
    }

    @Override // g.p
    public final void f() {
        this.f607c = null;
        this.f612h.c();
        this.i.c();
        this.f596k.c();
        this.f609e.c();
        this.f611g = false;
    }

    @Override // g.p
    public final boolean k() {
        return this.f608d != 3 || this.f606b.f547m == 0;
    }

    public final void m() {
        this.f611g = false;
        f fVar = this.f612h;
        fVar.c();
        fVar.f588j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f588j = false;
        f fVar3 = this.f596k;
        fVar3.c();
        fVar3.f588j = false;
        this.f609e.f588j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f606b.a0;
    }
}
