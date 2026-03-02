package A;

import com.studiothinkers.lightstick.idlev3.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f18c;

    public /* synthetic */ m(n nVar, int i) {
        this.f17b = i;
        this.f18c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17b) {
            case 0:
                MainActivity mainActivity = this.f18c.f19a;
                mainActivity.f452v.setVisibility(8);
                if (mainActivity.f447p) {
                    mainActivity.f447p = false;
                    mainActivity.f449s.loadUrl("https://idle.studiothinkers.com");
                }
                break;
            default:
                this.f18c.f19a.f452v.setVisibility(0);
                break;
        }
    }
}
