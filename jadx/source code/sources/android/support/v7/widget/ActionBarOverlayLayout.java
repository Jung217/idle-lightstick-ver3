package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.i;
import q.l;
import t.u;
import w.j;
import x.A;
import x.p;
import y.B0;
import y.C0014c;
import y.C0020f;
import y.C0030k;
import y.G0;
import y.InterfaceC0018e;
import y.M0;
import y.Q;
import y.RunnableC0016d;
import y.S;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements Q {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RunnableC0016d f221A;
    public final i B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S f226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f228h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f236q;
    public final Rect r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0018e f240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OverScroller f241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0014c f243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RunnableC0016d f244z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223c = 0;
        this.f234o = new Rect();
        this.f235p = new Rect();
        this.f236q = new Rect();
        this.r = new Rect();
        this.f237s = new Rect();
        this.f238t = new Rect();
        this.f239u = new Rect();
        this.f243y = new C0014c(this);
        this.f244z = new RunnableC0016d(this, 0);
        this.f221A = new RunnableC0016d(this, 1);
        c(context);
        this.B = new i();
    }

    public static boolean a(View view, Rect rect, boolean z2) {
        boolean z3;
        C0020f c0020f = (C0020f) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0020f).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0020f).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0020f).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0020f).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0020f).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0020f).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0020f).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0020f).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    public final void b() {
        removeCallbacks(this.f244z);
        removeCallbacks(this.f221A);
        ViewPropertyAnimator viewPropertyAnimator = this.f242x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f222b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f227g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f228h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f241w = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0020f;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            ((G0) this.f226f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((G0) this.f226f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f227g == null || this.f228h) {
            return;
        }
        if (this.f225e.getVisibility() == 0) {
            translationY = (int) (this.f225e.getTranslationY() + this.f225e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f227g.setBounds(0, translationY, getWidth(), this.f227g.getIntrinsicHeight() + translationY);
        this.f227g.draw(canvas);
    }

    public final void e() {
        S wrapper;
        if (this.f224d == null) {
            this.f224d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f225e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof S) {
                wrapper = (S) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f226f = wrapper;
        }
    }

    public final void f(Menu menu, A a2) {
        e();
        G0 g0 = (G0) this.f226f;
        Toolbar toolbar = g0.f1156a;
        if (g0.f1167m == null) {
            g0.f1167m = new C0030k(toolbar.getContext());
        }
        C0030k c0030k = g0.f1167m;
        c0030k.f1328f = a2;
        p pVar = (p) menu;
        if (pVar == null && toolbar.f279b == null) {
            return;
        }
        toolbar.e();
        p pVar2 = toolbar.f279b.f245q;
        if (pVar2 == pVar) {
            return;
        }
        if (pVar2 != null) {
            pVar2.r(toolbar.J);
            pVar2.r(toolbar.K);
        }
        if (toolbar.K == null) {
            toolbar.K = new B0(toolbar);
        }
        c0030k.r = true;
        if (pVar != null) {
            pVar.b(c0030k, toolbar.f287k);
            pVar.b(toolbar.K, toolbar.f287k);
        } else {
            c0030k.k(toolbar.f287k, null);
            toolbar.K.k(toolbar.f287k, null);
            c0030k.h();
            toolbar.K.h();
        }
        toolbar.f279b.setPopupTheme(toolbar.f288l);
        toolbar.f279b.setPresenter(c0030k);
        toolbar.J = c0030k;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        e();
        WeakHashMap weakHashMap = l.f728a;
        getWindowSystemUiVisibility();
        boolean zA = a(this.f225e, rect, false);
        Rect rect2 = this.r;
        rect2.set(rect);
        Method method = M0.f1214a;
        Rect rect3 = this.f234o;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f237s;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            zA = true;
        }
        Rect rect5 = this.f235p;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            zA = true;
        }
        if (zA) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0020f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0020f(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f225e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.f722a;
    }

    public CharSequence getTitle() {
        e();
        return ((G0) this.f226f).f1156a.getTitle();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = l.f728a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0020f c0020f = (C0020f) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0020f).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0020f).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        measureChildWithMargins(this.f225e, i, 0, i2, 0);
        C0020f c0020f = (C0020f) this.f225e.getLayoutParams();
        int measuredHeight = 0;
        int iMax = Math.max(0, this.f225e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0020f).leftMargin + ((ViewGroup.MarginLayoutParams) c0020f).rightMargin);
        int iMax2 = Math.max(0, this.f225e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0020f).topMargin + ((ViewGroup.MarginLayoutParams) c0020f).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f225e.getMeasuredState());
        WeakHashMap weakHashMap = l.f728a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f222b;
            if (this.f229j && this.f225e.getTabContainer() != null) {
                measuredHeight += this.f222b;
            }
        } else if (this.f225e.getVisibility() != 8) {
            measuredHeight = this.f225e.getMeasuredHeight();
        }
        Rect rect = this.f234o;
        Rect rect2 = this.f236q;
        rect2.set(rect);
        Rect rect3 = this.r;
        Rect rect4 = this.f238t;
        rect4.set(rect3);
        if (this.i || z2) {
            rect4.top += measuredHeight;
            rect4.bottom = rect4.bottom;
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
        }
        a(this.f224d, rect2, true);
        Rect rect5 = this.f239u;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f224d.a(rect4);
        }
        measureChildWithMargins(this.f224d, i, 0, i2, 0);
        C0020f c0020f2 = (C0020f) this.f224d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f224d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0020f2).leftMargin + ((ViewGroup.MarginLayoutParams) c0020f2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f224d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0020f2).topMargin + ((ViewGroup.MarginLayoutParams) c0020f2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f224d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f230k || !z2) {
            return false;
        }
        this.f241w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f241w.getFinalY() > this.f225e.getHeight()) {
            b();
            this.f221A.run();
        } else {
            b();
            this.f244z.run();
        }
        this.f231l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f232m + i2;
        this.f232m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        u uVar;
        j jVar;
        this.B.f722a = i;
        this.f232m = getActionBarHideOffset();
        b();
        InterfaceC0018e interfaceC0018e = this.f240v;
        if (interfaceC0018e == null || (jVar = (uVar = (u) interfaceC0018e).E) == null) {
            return;
        }
        jVar.a();
        uVar.E = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f225e.getVisibility() != 0) {
            return false;
        }
        return this.f230k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f230k || this.f231l) {
            return;
        }
        if (this.f232m <= this.f225e.getHeight()) {
            b();
            postDelayed(this.f244z, 600L);
        } else {
            b();
            postDelayed(this.f221A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.f233n ^ i;
        this.f233n = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0018e interfaceC0018e = this.f240v;
        if (interfaceC0018e != null) {
            u uVar = (u) interfaceC0018e;
            uVar.f880A = !z3;
            if (z2 || !z3) {
                if (uVar.B) {
                    uVar.B = false;
                    uVar.C(true);
                }
            } else if (!uVar.B) {
                uVar.B = true;
                uVar.C(true);
            }
        }
        if ((i2 & 256) == 0 || this.f240v == null) {
            return;
        }
        WeakHashMap weakHashMap = l.f728a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f223c = i;
        InterfaceC0018e interfaceC0018e = this.f240v;
        if (interfaceC0018e != null) {
            ((u) interfaceC0018e).f893z = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.f225e.setTranslationY(-Math.max(0, Math.min(i, this.f225e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0018e interfaceC0018e) {
        this.f240v = interfaceC0018e;
        if (getWindowToken() != null) {
            ((u) this.f240v).f893z = this.f223c;
            int i = this.f233n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = l.f728a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f229j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f230k) {
            this.f230k = z2;
            if (z2) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        e();
        G0 g0 = (G0) this.f226f;
        g0.f1159d = i != 0 ? v.a.a(g0.f1156a.getContext(), i) : null;
        g0.c();
    }

    public void setLogo(int i) {
        e();
        G0 g0 = (G0) this.f226f;
        g0.f1160e = i != 0 ? v.a.a(g0.f1156a.getContext(), i) : null;
        g0.c();
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.f228h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // y.Q
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((G0) this.f226f).f1165k = callback;
    }

    @Override // y.Q
    public void setWindowTitle(CharSequence charSequence) {
        e();
        G0 g0 = (G0) this.f226f;
        if (g0.f1162g) {
            return;
        }
        g0.f1163h = charSequence;
        if ((g0.f1157b & 8) != 0) {
            g0.f1156a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0020f(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        G0 g0 = (G0) this.f226f;
        g0.f1159d = drawable;
        g0.c();
    }
}
