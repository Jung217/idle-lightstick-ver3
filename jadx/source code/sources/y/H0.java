package y;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0 f1173c;

    public /* synthetic */ H0(I0 i0, int i) {
        this.f1172b = i;
        this.f1173c = i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1172b) {
            case 0:
                this.f1173c.c(false);
                break;
            default:
                this.f1173c.a();
                break;
        }
    }
}
