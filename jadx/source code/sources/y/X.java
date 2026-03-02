package y;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f1245c;

    public /* synthetic */ X(Y y2, int i) {
        this.f1244b = i;
        this.f1245c = y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1244b) {
            case 0:
                ViewParent parent = this.f1245c.f1249d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                Y y2 = this.f1245c;
                y2.a();
                View view = y2.f1249d;
                if (view.isEnabled() && !view.isLongClickable() && y2.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    y2.f1252g = true;
                    break;
                }
                break;
        }
    }
}
