package t;

import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ContentFrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f822j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, w.c cVar) {
        super(cVar, null);
        this.f822j = nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f822j.g(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                n nVar = this.f822j;
                nVar.f(nVar.k(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(v.a.a(getContext(), i));
    }
}
