package y;

import android.support.v7.widget.SearchView;

/* JADX INFO: renamed from: y.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0035m0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f1354c;

    public /* synthetic */ RunnableC0035m0(SearchView searchView, int i) {
        this.f1353b = i;
        this.f1354c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1353b) {
            case 0:
                this.f1354c.q();
                break;
            default:
                s.e eVar = this.f1354c.P;
                if (eVar != null && (eVar instanceof w0)) {
                    eVar.b(null);
                    break;
                }
                break;
        }
    }
}
