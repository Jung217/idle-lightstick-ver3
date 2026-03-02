package g;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f571l;

    public c(f.d dVar, int i) {
        f.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f570k = arrayList;
        this.f610f = i;
        f.d dVar3 = this.f606b;
        f.d dVarK = dVar3.k(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarK;
            if (dVar3 == null) {
                break;
            } else {
                dVarK = dVar3.k(this.f610f);
            }
        }
        this.f606b = dVar2;
        int i2 = this.f610f;
        arrayList.add(i2 == 0 ? dVar2.f539d : i2 == 1 ? dVar2.f540e : null);
        f.d dVarJ = dVar2.j(this.f610f);
        while (dVarJ != null) {
            int i3 = this.f610f;
            arrayList.add(i3 == 0 ? dVarJ.f539d : i3 == 1 ? dVarJ.f540e : null);
            dVarJ = dVarJ.j(this.f610f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            p pVar = (p) obj;
            int i5 = this.f610f;
            if (i5 == 0) {
                pVar.f606b.f537b = this;
            } else if (i5 == 1) {
                pVar.f606b.f538c = this;
            }
        }
        if (this.f610f == 0 && ((f.e) this.f606b.M).n0 && arrayList.size() > 1) {
            this.f606b = ((p) arrayList.get(arrayList.size() - 1)).f606b;
        }
        this.f571l = this.f610f == 0 ? this.f606b.b0 : this.f606b.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01bc A[PHI: r1 r26
  0x01bc: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r26v1 int) = (r26v0 int), (r26v3 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // g.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(g.d r28) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a(g.d):void");
    }

    @Override // g.p
    public final void d() {
        ArrayList arrayList = this.f570k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((p) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        f.d dVar = ((p) arrayList.get(0)).f606b;
        f.d dVar2 = ((p) arrayList.get(size2 - 1)).f606b;
        int i2 = this.f610f;
        f fVar = this.i;
        f fVar2 = this.f612h;
        if (i2 == 0) {
            f.c cVar = dVar.B;
            f.c cVar2 = dVar2.D;
            f fVarI = p.i(cVar, 0);
            int iD = cVar.d();
            f.d dVarM = m();
            if (dVarM != null) {
                iD = dVarM.B.d();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iD);
            }
            f fVarI2 = p.i(cVar2, 0);
            int iD2 = cVar2.d();
            f.d dVarN = n();
            if (dVarN != null) {
                iD2 = dVarN.D.d();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iD2);
            }
        } else {
            f.c cVar3 = dVar.C;
            f.c cVar4 = dVar2.E;
            f fVarI3 = p.i(cVar3, 1);
            int iD3 = cVar3.d();
            f.d dVarM2 = m();
            if (dVarM2 != null) {
                iD3 = dVarM2.C.d();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iD3);
            }
            f fVarI4 = p.i(cVar4, 1);
            int iD4 = cVar4.d();
            f.d dVarN2 = n();
            if (dVarN2 != null) {
                iD4 = dVarN2.E.d();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iD4);
            }
        }
        fVar2.f580a = this;
        fVar.f580a = this;
    }

    @Override // g.p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f570k;
            if (i >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // g.p
    public final void f() {
        this.f607c = null;
        ArrayList arrayList = this.f570k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((p) obj).f();
        }
    }

    @Override // g.p
    public final long j() {
        ArrayList arrayList = this.f570k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            j2 = ((long) pVar.i.f585f) + pVar.j() + j2 + ((long) pVar.f612h.f585f);
        }
        return j2;
    }

    @Override // g.p
    public final boolean k() {
        ArrayList arrayList = this.f570k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final f.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f570k;
            if (i >= arrayList.size()) {
                return null;
            }
            f.d dVar = ((p) arrayList.get(i)).f606b;
            if (dVar.Z != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final f.d n() {
        ArrayList arrayList = this.f570k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f.d dVar = ((p) arrayList.get(size)).f606b;
            if (dVar.Z != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f610f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f570k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            strConcat = ((strConcat + "<") + ((p) obj)) + "> ";
        }
        return strConcat;
    }
}
