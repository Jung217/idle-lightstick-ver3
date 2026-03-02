package s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f742h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f739e) {
            return 0.0f;
        }
        long j3 = this.f741g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f735a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f742h;
        return (g.b((j2 - j3) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
