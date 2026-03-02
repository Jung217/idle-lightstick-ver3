package e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i[] f497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i[] f498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f499h;
    public g i;

    @Override // e.b
    public final i d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f499h; i2++) {
            i[] iVarArr = this.f497f;
            i iVar = iVarArr[i2];
            if (!zArr[iVar.f501b]) {
                g gVar = this.i;
                gVar.f495b = iVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = gVar.f495b.f507h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = iVar2.f507h[i3];
                            float f4 = gVar.f495b.f507h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 < f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f497f[i];
    }

    @Override // e.b
    public final boolean e() {
        return this.f499h == 0;
    }

    @Override // e.b
    public final void i(d dVar, b bVar, boolean z2) {
        i iVar = bVar.f467a;
        if (iVar == null) {
            return;
        }
        float[] fArr = iVar.f507h;
        a aVar = bVar.f470d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            i iVarE = aVar.e(i);
            float f2 = aVar.f(i);
            g gVar = this.i;
            gVar.f495b = iVarE;
            if (iVarE.f500a) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = gVar.f495b.f507h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        gVar.f495b.f507h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    gVar.f496c.k(gVar.f495b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        gVar.f495b.f507h[i3] = f5;
                    } else {
                        gVar.f495b.f507h[i3] = 0.0f;
                    }
                }
                j(iVarE);
            }
            this.f468b = (bVar.f468b * f2) + this.f468b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i;
        int i2 = this.f499h + 1;
        i[] iVarArr = this.f497f;
        if (i2 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f497f = iVarArr2;
            this.f498g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f497f;
        int i3 = this.f499h;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f499h = i4;
        if (i4 > 1 && iVarArr3[i3].f501b > iVar.f501b) {
            int i5 = 0;
            while (true) {
                i = this.f499h;
                if (i5 >= i) {
                    break;
                }
                this.f498g[i5] = this.f497f[i5];
                i5++;
            }
            Arrays.sort(this.f498g, 0, i, new f(0));
            for (int i6 = 0; i6 < this.f499h; i6++) {
                this.f497f[i6] = this.f498g[i6];
            }
        }
        iVar.f500a = true;
        iVar.a(this);
    }

    public final void k(i iVar) {
        int i = 0;
        while (i < this.f499h) {
            if (this.f497f[i] == iVar) {
                while (true) {
                    int i2 = this.f499h;
                    if (i >= i2 - 1) {
                        this.f499h = i2 - 1;
                        iVar.f500a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f497f;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // e.b
    public final String toString() {
        g gVar = this.i;
        String str = " goal -> (" + this.f468b + ") : ";
        for (int i = 0; i < this.f499h; i++) {
            gVar.f495b = this.f497f[i];
            str = str + gVar + " ";
        }
        return str;
    }
}
