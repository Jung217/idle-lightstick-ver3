package y;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: y.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0019e0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0021f0 f1282a;

    public ViewOnTouchListenerC0019e0(AbstractC0021f0 abstractC0021f0) {
        this.f1282a = abstractC0021f0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        A a2;
        AbstractC0021f0 abstractC0021f0 = this.f1282a;
        RunnableC0015c0 runnableC0015c0 = abstractC0021f0.r;
        Handler handler = abstractC0021f0.f1302v;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0 && (a2 = abstractC0021f0.f1306z) != null && a2.isShowing() && x2 >= 0 && x2 < abstractC0021f0.f1306z.getWidth() && y2 >= 0 && y2 < abstractC0021f0.f1306z.getHeight()) {
            handler.postDelayed(runnableC0015c0, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC0015c0);
        return false;
    }
}
