package e;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f493b;

    public e() {
        this.f493b = new Object[256];
    }

    public void a(b bVar) {
        int i = this.f492a;
        Object[] objArr = this.f493b;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f492a = i + 1;
        }
    }

    public e(int i, n.d[] dVarArr) {
        this.f492a = i;
        this.f493b = dVarArr;
    }
}
