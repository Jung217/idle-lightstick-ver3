package y;

/* JADX INFO: renamed from: y.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0029j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1323h;

    public final void a(int i, int i2) {
        this.f1318c = i;
        this.f1319d = i2;
        this.f1323h = true;
        if (this.f1322g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1316a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1317b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1316a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1317b = i2;
        }
    }
}
