package e;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f470d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f467a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f468b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f469c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f471e = false;

    public b(c cVar) {
        this.f470d = new a(this, cVar);
    }

    public final void a(d dVar, int i) {
        this.f470d.g(dVar.j(i), 1.0f);
        this.f470d.g(dVar.j(i), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f468b = i;
        }
        if (z2) {
            this.f470d.g(iVar, 1.0f);
            this.f470d.g(iVar2, -1.0f);
            this.f470d.g(iVar3, -1.0f);
        } else {
            this.f470d.g(iVar, -1.0f);
            this.f470d.g(iVar2, 1.0f);
            this.f470d.g(iVar3, 1.0f);
        }
    }

    public final void c(i iVar, i iVar2, i iVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f468b = i;
        }
        if (z2) {
            this.f470d.g(iVar, 1.0f);
            this.f470d.g(iVar2, -1.0f);
            this.f470d.g(iVar3, 1.0f);
        } else {
            this.f470d.g(iVar, -1.0f);
            this.f470d.g(iVar2, 1.0f);
            this.f470d.g(iVar3, -1.0f);
        }
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f467a == null && this.f468b == 0.0f && this.f470d.d() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i;
        int iD = this.f470d.d();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f3 = this.f470d.f(i2);
            if (f3 < 0.0f) {
                i iVarE = this.f470d.e(i2);
                if ((zArr == null || !zArr[iVarE.f501b]) && iVarE != iVar && (((i = iVarE.f510l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    iVar2 = iVarE;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f467a;
        if (iVar2 != null) {
            this.f470d.g(iVar2, -1.0f);
            this.f467a.f502c = -1;
            this.f467a = null;
        }
        float fH = this.f470d.h(iVar, true) * (-1.0f);
        this.f467a = iVar;
        if (fH == 1.0f) {
            return;
        }
        this.f468b /= fH;
        a aVar = this.f470d;
        int i = aVar.f465h;
        for (int i2 = 0; i != -1 && i2 < aVar.f458a; i2++) {
            float[] fArr = aVar.f464g;
            fArr[i] = fArr[i] / fH;
            i = aVar.f463f[i];
        }
    }

    public final void h(d dVar, i iVar, boolean z2) {
        if (iVar.f505f) {
            float fC = this.f470d.c(iVar);
            this.f468b = (iVar.f504e * fC) + this.f468b;
            this.f470d.h(iVar, z2);
            if (z2) {
                iVar.b(this);
            }
            if (this.f470d.d() == 0) {
                this.f471e = true;
                dVar.f478a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z2) {
        a aVar = this.f470d;
        aVar.getClass();
        float fC = aVar.c(bVar.f467a);
        aVar.h(bVar.f467a, z2);
        a aVar2 = bVar.f470d;
        int iD = aVar2.d();
        for (int i = 0; i < iD; i++) {
            i iVarE = aVar2.e(i);
            aVar.a(iVarE, aVar2.c(iVarE) * fC, z2);
        }
        this.f468b = (bVar.f468b * fC) + this.f468b;
        if (z2) {
            bVar.f467a.b(this);
        }
        if (this.f467a == null || this.f470d.d() != 0) {
            return;
        }
        this.f471e = true;
        dVar.f478a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.toString():java.lang.String");
    }
}
