package c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f.a f313k;

    public int getMargin() {
        return this.f313k.n0;
    }

    public int getType() {
        return this.i;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f313k.m0 = z2;
    }

    public void setDpMargin(int i) {
        this.f313k.n0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f313k.n0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }
}
