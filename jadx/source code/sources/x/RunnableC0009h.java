package x;

/* JADX INFO: renamed from: x.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0009h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f1022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.arch.lifecycle.i f1023e;

    public RunnableC0009h(android.arch.lifecycle.i iVar, i iVar2, r rVar, p pVar) {
        this.f1023e = iVar;
        this.f1020b = iVar2;
        this.f1021c = rVar;
        this.f1022d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = (j) this.f1023e.f46b;
        i iVar = this.f1020b;
        if (iVar != null) {
            jVar.f1027A = true;
            iVar.f1025b.c(false);
            jVar.f1027A = false;
        }
        r rVar = this.f1021c;
        if (rVar.isEnabled() && rVar.hasSubMenu()) {
            this.f1022d.q(rVar, null, 4);
        }
    }
}
