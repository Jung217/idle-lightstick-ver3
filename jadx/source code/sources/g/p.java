package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.d f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f609e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f610f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f611g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f612h = new f(this);
    public final f i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f613j = 1;

    public p(f.d dVar) {
        this.f606b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f590l.add(fVar2);
        fVar.f585f = i;
        fVar2.f589k.add(fVar);
    }

    public static f h(f.c cVar) {
        f.c cVar2 = cVar.f532f;
        if (cVar2 == null) {
            return null;
        }
        f.d dVar = cVar2.f530d;
        int iA = c.b.a(cVar2.f531e);
        if (iA == 1) {
            return dVar.f539d.f612h;
        }
        if (iA == 2) {
            return dVar.f540e.f612h;
        }
        if (iA == 3) {
            return dVar.f539d.i;
        }
        if (iA == 4) {
            return dVar.f540e.i;
        }
        if (iA != 5) {
            return null;
        }
        return dVar.f540e.f596k;
    }

    public static f i(f.c cVar, int i) {
        f.c cVar2 = cVar.f532f;
        if (cVar2 == null) {
            return null;
        }
        f.d dVar = cVar2.f530d;
        p pVar = i == 0 ? dVar.f539d : dVar.f540e;
        int iA = c.b.a(cVar2.f531e);
        if (iA == 1 || iA == 2) {
            return pVar.f612h;
        }
        if (iA == 3 || iA == 4) {
            return pVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f590l.add(fVar2);
        fVar.f590l.add(this.f609e);
        fVar.f587h = i;
        fVar.i = gVar;
        fVar2.f589k.add(fVar);
        gVar.f589k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            f.d dVar = this.f606b;
            int i3 = dVar.f550p;
            int iMax = Math.max(dVar.f549o, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            f.d dVar2 = this.f606b;
            int i4 = dVar2.f552s;
            int iMax2 = Math.max(dVar2.r, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f609e.f588j) {
            return r0.f586g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(f.c r12, f.c r13, int r14) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.p.l(f.c, f.c, int):void");
    }
}
