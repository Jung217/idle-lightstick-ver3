package y;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f1249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public X f1250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X f1251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1253h;
    public final int[] i = new int[2];

    public Y(View view) {
        this.f1249d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1246a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1247b = tapTimeout;
        this.f1248c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        X x2 = this.f1251f;
        View view = this.f1249d;
        if (x2 != null) {
            view.removeCallbacks(x2);
        }
        X x3 = this.f1250e;
        if (x3 != null) {
            view.removeCallbacks(x3);
        }
    }

    public abstract x.F b();

    public abstract boolean c();

    public boolean d() {
        x.F fB = b();
        if (fB == null || !fB.i()) {
            return true;
        }
        fB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.Y.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1252g = false;
        this.f1253h = -1;
        X x2 = this.f1250e;
        if (x2 != null) {
            this.f1249d.removeCallbacks(x2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
