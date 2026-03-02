package e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f500a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f504e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f510l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f501b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f502c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f503d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f505f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f506g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f507h = new float[9];
    public b[] i = new b[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f508j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f509k = 0;

    public i(int i) {
        this.f510l = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f508j;
            if (i >= i2) {
                b[] bVarArr = this.i;
                if (i2 >= bVarArr.length) {
                    this.i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.i;
                int i3 = this.f508j;
                bVarArr2[i3] = bVar;
                this.f508j = i3 + 1;
                return;
            }
            if (this.i[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f508j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.i;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f508j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f510l = 5;
        this.f503d = 0;
        this.f501b = -1;
        this.f502c = -1;
        this.f504e = 0.0f;
        this.f505f = false;
        int i = this.f508j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f508j = 0;
        this.f509k = 0;
        this.f500a = false;
        Arrays.fill(this.f507h, 0.0f);
    }

    public final void d(d dVar, float f2) {
        this.f504e = f2;
        this.f505f = true;
        int i = this.f508j;
        this.f502c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(dVar, this, false);
        }
        this.f508j = 0;
    }

    public final void e(d dVar, b bVar) {
        int i = this.f508j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(dVar, bVar, false);
        }
        this.f508j = 0;
    }

    public final String toString() {
        return "" + this.f501b;
    }
}
