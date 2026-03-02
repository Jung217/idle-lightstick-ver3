package q;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f734a;

    public r(Object obj) {
        this.f734a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        Object obj2 = ((r) obj).f734a;
        Object obj3 = this.f734a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f734a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
