package p;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f707e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f710d;

    public k() {
        this(10);
    }

    public final void a(int i, Object obj) {
        int i2 = this.f710d;
        if (i2 != 0 && i <= this.f708b[i2 - 1]) {
            b(i, obj);
            return;
        }
        if (i2 >= this.f708b.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f708b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f709c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f708b = iArr;
            this.f709c = objArr;
        }
        this.f708b[i2] = i;
        this.f709c[i2] = obj;
        this.f710d = i2 + 1;
    }

    public final void b(int i, Object obj) {
        int iA = b.a(this.f708b, this.f710d, i);
        if (iA >= 0) {
            this.f709c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.f710d;
        if (i2 < i3) {
            Object[] objArr = this.f709c;
            if (objArr[i2] == f707e) {
                this.f708b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f708b.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f708b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f709c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f708b = iArr;
            this.f709c = objArr2;
        }
        int i8 = this.f710d - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f708b;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f709c;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f710d - i2);
        }
        this.f708b[i2] = i;
        this.f709c[i2] = obj;
        this.f710d++;
    }

    public final Object clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f708b = (int[]) this.f708b.clone();
            kVar.f709c = (Object[]) this.f709c.clone();
            return kVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i = this.f710d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f710d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f708b[i2]);
            sb.append('=');
            Object obj = this.f709c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public k(int i) {
        if (i == 0) {
            this.f708b = b.f674a;
            this.f709c = b.f675b;
        } else {
            int i2 = i * 4;
            int i3 = 4;
            while (true) {
                if (i3 >= 32) {
                    break;
                }
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            int i5 = i2 / 4;
            this.f708b = new int[i5];
            this.f709c = new Object[i5];
        }
        this.f710d = 0;
    }
}
