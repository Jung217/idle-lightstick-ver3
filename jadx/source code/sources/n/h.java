package n;

import A.j;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f663d;

    public h(b bVar, Handler handler, c cVar) {
        this.f661b = bVar;
        this.f662c = handler;
        this.f663d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f661b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f662c.post(new j(this, objCall, 3));
    }
}
