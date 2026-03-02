package w;

import android.view.View;
import q.q;
import y.G0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends android.arch.lifecycle.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f970p;

    public i(j jVar) {
        this.f967m = 0;
        this.f970p = jVar;
        this.f968n = false;
        this.f969o = 0;
    }

    @Override // q.q
    public final void a() {
        switch (this.f967m) {
            case 0:
                int i = this.f969o + 1;
                this.f969o = i;
                j jVar = (j) this.f970p;
                if (i == jVar.f971a.size()) {
                    q qVar = jVar.f974d;
                    if (qVar != null) {
                        qVar.a();
                    }
                    this.f969o = 0;
                    this.f968n = false;
                    jVar.f975e = false;
                }
                break;
            default:
                if (!this.f968n) {
                    ((G0) this.f970p).f1156a.setVisibility(this.f969o);
                }
                break;
        }
    }

    @Override // android.arch.lifecycle.f, q.q
    public void b(View view) {
        switch (this.f967m) {
            case 1:
                this.f968n = true;
                break;
        }
    }

    @Override // android.arch.lifecycle.f, q.q
    public final void c() {
        switch (this.f967m) {
            case 0:
                if (!this.f968n) {
                    this.f968n = true;
                    q qVar = ((j) this.f970p).f974d;
                    if (qVar != null) {
                        qVar.c();
                    }
                    break;
                }
                break;
            default:
                ((G0) this.f970p).f1156a.setVisibility(0);
                break;
        }
    }

    public i(G0 g0, int i) {
        this.f967m = 1;
        this.f970p = g0;
        this.f969o = i;
        this.f968n = false;
    }
}
