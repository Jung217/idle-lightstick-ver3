package y;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1384f;

    public u0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1383e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f1380b = rect3;
        Rect rect4 = new Rect();
        this.f1382d = rect4;
        Rect rect5 = new Rect();
        this.f1381c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f1379a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f1384f;
                if (z3 && !this.f1382d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f1384f;
                    this.f1384f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else if (this.f1380b.contains(x2, y2)) {
            this.f1384f = true;
            z2 = true;
        } else {
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f1381c;
        View view = this.f1379a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
