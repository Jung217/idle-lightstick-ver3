package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import q.p;
import t.i;
import t.n;
import y.C0022g;
import y.C0030k;
import y.G0;
import y.P;
import y.Q;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f263h;
    public P i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f263h = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f261f == null) {
            this.f261f = new TypedValue();
        }
        return this.f261f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f262g == null) {
            this.f262g = new TypedValue();
        }
        return this.f262g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f259d == null) {
            this.f259d = new TypedValue();
        }
        return this.f259d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f260e == null) {
            this.f260e = new TypedValue();
        }
        return this.f260e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f257b == null) {
            this.f257b = new TypedValue();
        }
        return this.f257b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f258c == null) {
            this.f258c = new TypedValue();
        }
        return this.f258c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        P p2 = this.i;
        if (p2 != null) {
            p2.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0030k c0030k;
        super.onDetachedFromWindow();
        P p2 = this.i;
        if (p2 != null) {
            n nVar = ((i) p2).f817c;
            Q q2 = nVar.i;
            if (q2 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q2;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f226f).f1156a.f279b;
                if (actionMenuView != null && (c0030k = actionMenuView.f248u) != null) {
                    c0030k.i();
                    C0022g c0022g = c0030k.f1342v;
                    if (c0022g != null && c0022g.b()) {
                        c0022g.i.dismiss();
                    }
                }
            }
            if (nVar.f850n != null) {
                nVar.f840c.getDecorView().removeCallbacks(nVar.f851o);
                if (nVar.f850n.isShowing()) {
                    try {
                        nVar.f850n.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                nVar.f850n = null;
            }
            p pVar = nVar.f852p;
            if (pVar != null) {
                pVar.b();
            }
            x.p pVar2 = nVar.k(0).f830h;
            if (pVar2 != null) {
                pVar2.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(P p2) {
        this.i = p2;
    }
}
