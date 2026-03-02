package e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f460c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f458a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f461d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f462e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f463f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f464g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f465h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f466j = false;

    public a(b bVar, c cVar) {
        this.f459b = bVar;
        this.f460c = cVar;
    }

    public final void a(i iVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f465h;
            b bVar = this.f459b;
            if (i == -1) {
                this.f465h = 0;
                this.f464g[0] = f2;
                this.f462e[0] = iVar.f501b;
                this.f463f[0] = -1;
                iVar.f509k++;
                iVar.a(bVar);
                this.f458a++;
                if (this.f466j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f462e;
                if (i2 >= iArr.length) {
                    this.f466j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f458a; i4++) {
                int i5 = this.f462e[i];
                int i6 = iVar.f501b;
                if (i5 == i6) {
                    float[] fArr = this.f464g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f465h) {
                            this.f465h = this.f463f[i];
                        } else {
                            int[] iArr2 = this.f463f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            iVar.b(bVar);
                        }
                        if (this.f466j) {
                            this.i = i;
                        }
                        iVar.f509k--;
                        this.f458a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f463f[i];
            }
            int length = this.i;
            int i7 = length + 1;
            if (this.f466j) {
                int[] iArr3 = this.f462e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f462e;
            if (length >= iArr4.length && this.f458a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f462e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f462e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f461d * 2;
                this.f461d = i9;
                this.f466j = false;
                this.i = length - 1;
                this.f464g = Arrays.copyOf(this.f464g, i9);
                this.f462e = Arrays.copyOf(this.f462e, this.f461d);
                this.f463f = Arrays.copyOf(this.f463f, this.f461d);
            }
            this.f462e[length] = iVar.f501b;
            this.f464g[length] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f463f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f463f[length] = this.f465h;
                this.f465h = length;
            }
            iVar.f509k++;
            iVar.a(bVar);
            this.f458a++;
            if (!this.f466j) {
                this.i++;
            }
            int i10 = this.i;
            int[] iArr8 = this.f462e;
            if (i10 >= iArr8.length) {
                this.f466j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f465h;
        for (int i2 = 0; i != -1 && i2 < this.f458a; i2++) {
            i iVar = ((i[]) this.f460c.f475c)[this.f462e[i]];
            if (iVar != null) {
                iVar.b(this.f459b);
            }
            i = this.f463f[i];
        }
        this.f465h = -1;
        this.i = -1;
        this.f466j = false;
        this.f458a = 0;
    }

    public final float c(i iVar) {
        int i = this.f465h;
        for (int i2 = 0; i != -1 && i2 < this.f458a; i2++) {
            if (this.f462e[i] == iVar.f501b) {
                return this.f464g[i];
            }
            i = this.f463f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f458a;
    }

    public final i e(int i) {
        int i2 = this.f465h;
        for (int i3 = 0; i2 != -1 && i3 < this.f458a; i3++) {
            if (i3 == i) {
                return ((i[]) this.f460c.f475c)[this.f462e[i2]];
            }
            i2 = this.f463f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.f465h;
        for (int i3 = 0; i2 != -1 && i3 < this.f458a; i3++) {
            if (i3 == i) {
                return this.f464g[i2];
            }
            i2 = this.f463f[i2];
        }
        return 0.0f;
    }

    public final void g(i iVar, float f2) {
        if (f2 == 0.0f) {
            h(iVar, true);
            return;
        }
        int i = this.f465h;
        b bVar = this.f459b;
        if (i == -1) {
            this.f465h = 0;
            this.f464g[0] = f2;
            this.f462e[0] = iVar.f501b;
            this.f463f[0] = -1;
            iVar.f509k++;
            iVar.a(bVar);
            this.f458a++;
            if (this.f466j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f462e;
            if (i2 >= iArr.length) {
                this.f466j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f458a; i4++) {
            int i5 = this.f462e[i];
            int i6 = iVar.f501b;
            if (i5 == i6) {
                this.f464g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f463f[i];
        }
        int length = this.i;
        int i7 = length + 1;
        if (this.f466j) {
            int[] iArr2 = this.f462e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f462e;
        if (length >= iArr3.length && this.f458a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f462e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f462e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f461d * 2;
            this.f461d = i9;
            this.f466j = false;
            this.i = length - 1;
            this.f464g = Arrays.copyOf(this.f464g, i9);
            this.f462e = Arrays.copyOf(this.f462e, this.f461d);
            this.f463f = Arrays.copyOf(this.f463f, this.f461d);
        }
        this.f462e[length] = iVar.f501b;
        this.f464g[length] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f463f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f463f[length] = this.f465h;
            this.f465h = length;
        }
        iVar.f509k++;
        iVar.a(bVar);
        int i10 = this.f458a + 1;
        this.f458a = i10;
        if (!this.f466j) {
            this.i++;
        }
        int[] iArr7 = this.f462e;
        if (i10 >= iArr7.length) {
            this.f466j = true;
        }
        if (this.i >= iArr7.length) {
            this.f466j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(i iVar, boolean z2) {
        int i = this.f465h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f458a) {
            if (this.f462e[i] == iVar.f501b) {
                if (i == this.f465h) {
                    this.f465h = this.f463f[i];
                } else {
                    int[] iArr = this.f463f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    iVar.b(this.f459b);
                }
                iVar.f509k--;
                this.f458a--;
                this.f462e[i] = -1;
                if (this.f466j) {
                    this.i = i;
                }
                return this.f464g[i];
            }
            i2++;
            i3 = i;
            i = this.f463f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f465h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f458a; i2++) {
            str = ((str + " -> ") + this.f464g[i] + " : ") + ((i[]) this.f460c.f475c)[this.f462e[i]];
            i = this.f463f[i];
        }
        return str;
    }
}
