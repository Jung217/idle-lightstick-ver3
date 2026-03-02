package y;

import android.support.v7.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0016d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f1280c;

    public /* synthetic */ RunnableC0016d(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f1279b = i;
        this.f1280c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1279b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1280c;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f242x = actionBarOverlayLayout.f225e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f243y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1280c;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f242x = actionBarOverlayLayout2.f225e.animate().translationY(-actionBarOverlayLayout2.f225e.getHeight()).setListener(actionBarOverlayLayout2.f243y);
                break;
        }
    }
}
