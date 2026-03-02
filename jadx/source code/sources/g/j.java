package g;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    @Override // g.d
    public final void a(d dVar) {
        f.a aVar = (f.a) this.f606b;
        int i = aVar.l0;
        f fVar = this.f612h;
        ArrayList arrayList = fVar.f590l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((f) obj).f586g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + aVar.n0);
        } else {
            fVar.d(i2 + aVar.n0);
        }
    }

    @Override // g.p
    public final void d() {
        f.d dVar = this.f606b;
        if (dVar instanceof f.a) {
            f fVar = this.f612h;
            fVar.f581b = true;
            f.a aVar = (f.a) dVar;
            int i = aVar.l0;
            boolean z2 = aVar.m0;
            int i2 = 0;
            if (i == 0) {
                fVar.f584e = 4;
                while (i2 < aVar.k0) {
                    f.d dVar2 = aVar.j0[i2];
                    if (z2 || dVar2.Z != 8) {
                        f fVar2 = dVar2.f539d.f612h;
                        fVar2.f589k.add(fVar);
                        fVar.f590l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f606b.f539d.f612h);
                m(this.f606b.f539d.i);
                return;
            }
            if (i == 1) {
                fVar.f584e = 5;
                while (i2 < aVar.k0) {
                    f.d dVar3 = aVar.j0[i2];
                    if (z2 || dVar3.Z != 8) {
                        f fVar3 = dVar3.f539d.i;
                        fVar3.f589k.add(fVar);
                        fVar.f590l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f606b.f539d.f612h);
                m(this.f606b.f539d.i);
                return;
            }
            if (i == 2) {
                fVar.f584e = 6;
                while (i2 < aVar.k0) {
                    f.d dVar4 = aVar.j0[i2];
                    if (z2 || dVar4.Z != 8) {
                        f fVar4 = dVar4.f540e.f612h;
                        fVar4.f589k.add(fVar);
                        fVar.f590l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f606b.f540e.f612h);
                m(this.f606b.f540e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f584e = 7;
            while (i2 < aVar.k0) {
                f.d dVar5 = aVar.j0[i2];
                if (z2 || dVar5.Z != 8) {
                    f fVar5 = dVar5.f540e.i;
                    fVar5.f589k.add(fVar);
                    fVar.f590l.add(fVar5);
                }
                i2++;
            }
            m(this.f606b.f540e.f612h);
            m(this.f606b.f540e.i);
        }
    }

    @Override // g.p
    public final void e() {
        f.d dVar = this.f606b;
        if (dVar instanceof f.a) {
            int i = ((f.a) dVar).l0;
            f fVar = this.f612h;
            if (i == 0 || i == 1) {
                dVar.R = fVar.f586g;
            } else {
                dVar.S = fVar.f586g;
            }
        }
    }

    @Override // g.p
    public final void f() {
        this.f607c = null;
        this.f612h.c();
    }

    @Override // g.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f612h;
        fVar2.f589k.add(fVar);
        fVar.f590l.add(fVar2);
    }
}
