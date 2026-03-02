package y;

import android.widget.AbsListView;

/* JADX INFO: renamed from: y.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017d0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0021f0 f1281a;

    public C0017d0(AbstractC0021f0 abstractC0021f0) {
        this.f1281a = abstractC0021f0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC0021f0 abstractC0021f0 = this.f1281a;
        RunnableC0015c0 runnableC0015c0 = abstractC0021f0.r;
        if (i != 1 || abstractC0021f0.f1306z.getInputMethodMode() == 2 || abstractC0021f0.f1306z.getContentView() == null) {
            return;
        }
        abstractC0021f0.f1302v.removeCallbacks(runnableC0015c0);
        runnableC0015c0.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
