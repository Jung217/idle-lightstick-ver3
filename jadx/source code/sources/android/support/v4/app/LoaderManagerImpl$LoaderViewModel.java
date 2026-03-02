package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl$LoaderViewModel extends android.arch.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.k f62a = new p.k();

    @Override // android.arch.lifecycle.h
    public final void a() {
        p.k kVar = this.f62a;
        int i = kVar.f710d;
        if (i > 0) {
            kVar.f709c[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = kVar.f709c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        kVar.f710d = 0;
    }
}
