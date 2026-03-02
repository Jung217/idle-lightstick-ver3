package g;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    @Override // g.d
    public final void a(d dVar) {
        f fVar = this.f612h;
        if (fVar.f582c && !fVar.f588j) {
            fVar.d((int) ((((f) fVar.f590l.get(0)).f586g * ((f.f) this.f606b).j0) + 0.5f));
        }
    }

    @Override // g.p
    public final void d() {
        f.d dVar = this.f606b;
        f.f fVar = (f.f) dVar;
        int i = fVar.k0;
        int i2 = fVar.l0;
        int i3 = fVar.n0;
        f fVar2 = this.f612h;
        if (i3 == 1) {
            if (i != -1) {
                fVar2.f590l.add(dVar.M.f539d.f612h);
                this.f606b.M.f539d.f612h.f589k.add(fVar2);
                fVar2.f585f = i;
            } else if (i2 != -1) {
                fVar2.f590l.add(dVar.M.f539d.i);
                this.f606b.M.f539d.i.f589k.add(fVar2);
                fVar2.f585f = -i2;
            } else {
                fVar2.f581b = true;
                fVar2.f590l.add(dVar.M.f539d.i);
                this.f606b.M.f539d.i.f589k.add(fVar2);
            }
            m(this.f606b.f539d.f612h);
            m(this.f606b.f539d.i);
            return;
        }
        if (i != -1) {
            fVar2.f590l.add(dVar.M.f540e.f612h);
            this.f606b.M.f540e.f612h.f589k.add(fVar2);
            fVar2.f585f = i;
        } else if (i2 != -1) {
            fVar2.f590l.add(dVar.M.f540e.i);
            this.f606b.M.f540e.i.f589k.add(fVar2);
            fVar2.f585f = -i2;
        } else {
            fVar2.f581b = true;
            fVar2.f590l.add(dVar.M.f540e.i);
            this.f606b.M.f540e.i.f589k.add(fVar2);
        }
        m(this.f606b.f540e.f612h);
        m(this.f606b.f540e.i);
    }

    @Override // g.p
    public final void e() {
        f.d dVar = this.f606b;
        int i = ((f.f) dVar).n0;
        f fVar = this.f612h;
        if (i == 1) {
            dVar.R = fVar.f586g;
        } else {
            dVar.S = fVar.f586g;
        }
    }

    @Override // g.p
    public final void f() {
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
