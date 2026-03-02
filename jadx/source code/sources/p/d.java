package p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f678f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f682e;

    public final void a() {
        int i = this.f682e;
        long[] jArr = this.f680c;
        Object[] objArr = this.f681d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f678f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f679b = false;
        this.f682e = i2;
    }

    public final void b(long j2, Object obj) {
        int iB = b.b(this.f680c, this.f682e, j2);
        if (iB >= 0) {
            this.f681d[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.f682e;
        if (i < i2) {
            Object[] objArr = this.f681d;
            if (objArr[i] == f678f) {
                this.f680c[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f679b && i2 >= this.f680c.length) {
            a();
            i = ~b.b(this.f680c, this.f682e, j2);
        }
        int i3 = this.f682e;
        if (i3 >= this.f680c.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f680c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f681d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f680c = jArr;
            this.f681d = objArr2;
        }
        int i8 = this.f682e - i;
        if (i8 != 0) {
            long[] jArr3 = this.f680c;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f681d;
            System.arraycopy(objArr4, i, objArr4, i9, this.f682e - i);
        }
        this.f680c[i] = j2;
        this.f681d[i] = obj;
        this.f682e++;
    }

    public final Object clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f680c = (long[]) this.f680c.clone();
            dVar.f681d = (Object[]) this.f681d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        if (this.f679b) {
            a();
        }
        int i = this.f682e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f682e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f679b) {
                a();
            }
            sb.append(this.f680c[i2]);
            sb.append('=');
            if (this.f679b) {
                a();
            }
            Object obj = this.f681d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
