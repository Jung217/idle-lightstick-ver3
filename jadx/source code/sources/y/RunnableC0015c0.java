package y;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: y.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0015c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0021f0 f1278c;

    public /* synthetic */ RunnableC0015c0(AbstractC0021f0 abstractC0021f0, int i) {
        this.f1277b = i;
        this.f1278c = abstractC0021f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1277b;
        AbstractC0021f0 abstractC0021f0 = this.f1278c;
        switch (i) {
            case 0:
                V v2 = abstractC0021f0.f1286d;
                if (v2 != null) {
                    v2.setListSelectionHidden(true);
                    v2.requestLayout();
                }
                break;
            default:
                V v3 = abstractC0021f0.f1286d;
                if (v3 != null) {
                    WeakHashMap weakHashMap = q.l.f728a;
                    if (v3.isAttachedToWindow() && abstractC0021f0.f1286d.getCount() > abstractC0021f0.f1286d.getChildCount() && abstractC0021f0.f1286d.getChildCount() <= abstractC0021f0.f1295n) {
                        abstractC0021f0.f1306z.setInputMethodMode(2);
                        abstractC0021f0.c();
                        break;
                    }
                }
                break;
        }
    }
}
