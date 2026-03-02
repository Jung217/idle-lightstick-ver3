package y;

/* JADX INFO: loaded from: classes.dex */
public final class G extends Y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K f1154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L f1155k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L l2, L l3, K k2) {
        super(l3);
        this.f1155k = l2;
        this.f1154j = k2;
    }

    @Override // y.Y
    public final x.F b() {
        return this.f1154j;
    }

    @Override // y.Y
    public final boolean c() {
        L l2 = this.f1155k;
        if (l2.f1202g.f1306z.isShowing()) {
            return true;
        }
        l2.f1202g.c();
        return true;
    }
}
