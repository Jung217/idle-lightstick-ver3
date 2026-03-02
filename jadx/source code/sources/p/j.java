package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Object[] f700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object[] f702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f703h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f704b = b.f674a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f705c = b.f675b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f706d = 0;

    public static void b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                try {
                    if (f703h < 10) {
                        objArr[0] = f702g;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f702g = objArr;
                        f703h++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                try {
                    if (f701f < 10) {
                        objArr[0] = f700e;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f700e = objArr;
                        f701f++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (a.class) {
                try {
                    Object[] objArr = f702g;
                    if (objArr != null) {
                        this.f705c = objArr;
                        f702g = (Object[]) objArr[0];
                        this.f704b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f703h--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                try {
                    Object[] objArr2 = f700e;
                    if (objArr2 != null) {
                        this.f705c = objArr2;
                        f700e = (Object[]) objArr2[0];
                        this.f704b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f701f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f704b = new int[i];
        this.f705c = new Object[i << 1];
    }

    public final int c(int i, Object obj) {
        int i2 = this.f706d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = b.a(this.f704b, i2, i);
            if (iA < 0 || obj.equals(this.f705c[iA << 1])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && this.f704b[i3] == i) {
                if (obj.equals(this.f705c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && this.f704b[i4] == i; i4--) {
                if (obj.equals(this.f705c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f706d;
        if (i > 0) {
            int[] iArr = this.f704b;
            Object[] objArr = this.f705c;
            this.f704b = b.f674a;
            this.f705c = b.f675b;
            this.f706d = 0;
            b(iArr, objArr, i);
        }
        if (this.f706d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return (obj == null ? d() : c(obj.hashCode(), obj)) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return e(obj) >= 0;
    }

    public final int d() {
        int i = this.f706d;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = b.a(this.f704b, i, 0);
            if (iA < 0 || this.f705c[iA << 1] == null) {
                return iA;
            }
            int i2 = iA + 1;
            while (i2 < i && this.f704b[i2] == 0) {
                if (this.f705c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iA - 1; i3 >= 0 && this.f704b[i3] == 0; i3--) {
                if (this.f705c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        int i = this.f706d * 2;
        Object[] objArr = this.f705c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f706d == jVar.f706d) {
                    for (0; i2 < this.f706d; i2 + 1) {
                        Object[] objArr = this.f705c;
                        int i3 = i2 << 1;
                        Object obj2 = objArr[i3];
                        Object obj3 = objArr[i3 + 1];
                        Object obj4 = jVar.get(obj2);
                        if (obj3 == null) {
                            i2 = (obj4 == null && jVar.containsKey(obj2)) ? i2 + 1 : 0;
                        } else if (obj3.equals(obj4)) {
                        }
                    }
                    return true;
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f706d == map.size()) {
                    for (0; i < this.f706d; i + 1) {
                        Object[] objArr2 = this.f705c;
                        int i4 = i << 1;
                        Object obj5 = objArr2[i4];
                        Object obj6 = objArr2[i4 + 1];
                        Object obj7 = map.get(obj5);
                        if (obj6 == null) {
                            i = (obj7 == null && map.containsKey(obj5)) ? i + 1 : 0;
                        } else if (obj6.equals(obj7)) {
                        }
                    }
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        Object[] objArr = this.f705c;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f706d;
        int i4 = 0;
        if (i3 <= 1) {
            b(this.f704b, objArr, i3);
            this.f704b = b.f674a;
            this.f705c = b.f675b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f704b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f705c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f705c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f706d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f704b, 0, i);
                    System.arraycopy(objArr, 0, this.f705c, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f704b, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f705c, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f706d) {
            throw new ConcurrentModificationException();
        }
        this.f706d = i4;
        return obj;
    }

    public final Object get(Object obj) {
        int iD = obj == null ? d() : c(obj.hashCode(), obj);
        if (iD >= 0) {
            return this.f705c[(iD << 1) + 1];
        }
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.f704b;
        Object[] objArr = this.f705c;
        int i = this.f706d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f706d <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iC;
        int i2 = this.f706d;
        if (obj == null) {
            iC = d();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = c(iHashCode, obj);
        }
        if (iC >= 0) {
            int i3 = (iC << 1) + 1;
            Object[] objArr = this.f705c;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iC;
        int[] iArr = this.f704b;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f705c;
            a(i5);
            if (i2 != this.f706d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f704b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f705c, 0, objArr2.length);
            }
            b(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f704b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f705c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f706d - i4) << 1);
        }
        int i7 = this.f706d;
        if (i2 == i7) {
            int[] iArr4 = this.f704b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f705c;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f706d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int iD = obj == null ? d() : c(obj.hashCode(), obj);
        if (iD >= 0) {
            return f(iD);
        }
        return null;
    }

    public final int size() {
        return this.f706d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f706d * 28);
        sb.append('{');
        for (int i = 0; i < this.f706d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i << 1;
            Object obj = this.f705c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f705c[i2 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
