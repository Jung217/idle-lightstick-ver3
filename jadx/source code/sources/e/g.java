package e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f496c;

    public g(h hVar) {
        this.f496c = hVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f495b.f501b - ((i) obj).f501b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f495b != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.f495b.f507h[i] + " ";
            }
        }
        return str + "] " + this.f495b;
    }
}
