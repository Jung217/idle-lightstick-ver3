package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import q.g;
import q.h;
import q.i;
import q.l;
import s.j;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final s.h f138A = new s.h();
    public static final int[] B = {R.attr.fillViewport};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f145h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f153q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f161z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f140c = new Rect();
        this.f145h = true;
        this.i = false;
        this.f146j = null;
        this.f147k = false;
        this.f150n = true;
        this.r = -1;
        this.f154s = new int[2];
        this.f155t = new int[2];
        this.f141d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f151o = viewConfiguration.getScaledTouchSlop();
        this.f152p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f153q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B, 0, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f159x = new i();
        g gVar = new g();
        gVar.f720d = this;
        this.f160y = gVar;
        setNestedScrollingEnabled(true);
        WeakHashMap weakHashMap = l.f728a;
        s.h hVar = f138A;
        setAccessibilityDelegate(hVar != null ? hVar.f716a : null);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f161z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f161z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f161z;
    }

    public static boolean h(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && h((View) parent, nestedScrollView);
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !i(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        } else {
            Rect rect = this.f140c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            c(b(rect));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || i(viewFindFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void c(int i) {
        if (i != 0) {
            if (this.f150n) {
                m(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int overScrollMode;
        OverScroller overScroller = this.f141d;
        if (!overScroller.computeScrollOffset()) {
            if (this.f160y.d(1)) {
                o(1);
            }
            this.f157v = 0;
            return;
        }
        overScroller.getCurrX();
        int currY = overScroller.getCurrY();
        int i = currY - this.f157v;
        if (this.f160y.a(0, i, this.f155t, null, 1)) {
            i -= this.f155t[1];
        }
        if (i != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            k(i, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            if (!this.f160y.b(0, scrollY2, 0, i - scrollY2, null, 1) && ((overScrollMode = getOverScrollMode()) == 0 || (overScrollMode == 1 && scrollRange > 0))) {
                d();
                if (currY <= 0 && scrollY > 0) {
                    this.f142e.onAbsorb((int) overScroller.getCurrVelocity());
                } else if (currY >= scrollRange && scrollY < scrollRange) {
                    this.f143f.onAbsorb((int) overScroller.getCurrVelocity());
                }
            }
        }
        this.f157v = currY;
        WeakHashMap weakHashMap = l.f728a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final void d() {
        if (getOverScrollMode() == 2) {
            this.f142e = null;
            this.f143f = null;
        } else if (this.f142e == null) {
            Context context = getContext();
            this.f142e = new EdgeEffect(context);
            this.f143f = new EdgeEffect(context);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || e(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent viewParentC;
        g gVar = this.f160y;
        if (gVar.f717a && (viewParentC = gVar.c(0)) != null) {
            try {
                return viewParentC.onNestedFling((NestedScrollView) gVar.f720d, f2, f3, z2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent viewParentC;
        g gVar = this.f160y;
        if (gVar.f717a && (viewParentC = gVar.c(0)) != null) {
            try {
                return viewParentC.onNestedPreFling((NestedScrollView) gVar.f720d, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f160y.a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f160y.b(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f142e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f142e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft();
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f142e.setSize(width, height);
                if (this.f142e.draw(canvas)) {
                    WeakHashMap weakHashMap = l.f728a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f143f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f143f.setSize(width2, height2);
            if (this.f143f.draw(canvas)) {
                WeakHashMap weakHashMap2 = l.f728a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public final boolean e(KeyEvent keyEvent) {
        Rect rect = this.f140c;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return !keyEvent.isAltPressed() ? a(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return !keyEvent.isAltPressed() ? a(130) : g(130);
                    }
                    if (keyCode == 62) {
                        int i = keyEvent.isShiftPressed() ? 33 : 130;
                        boolean z2 = i == 130;
                        int height = getHeight();
                        if (z2) {
                            rect.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                                if (rect.top + height > paddingBottom) {
                                    rect.top = paddingBottom - height;
                                }
                            }
                        } else {
                            int scrollY = getScrollY() - height;
                            rect.top = scrollY;
                            if (scrollY < 0) {
                                rect.top = 0;
                            }
                        }
                        int i2 = rect.top;
                        int i3 = height + i2;
                        rect.bottom = i3;
                        l(i, i2, i3);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        int scrollY = getScrollY();
        boolean z2 = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f2 = i;
        if (dispatchNestedPreFling(0.0f, f2)) {
            return;
        }
        dispatchNestedFling(0.0f, f2, z2);
        if (getChildCount() > 0) {
            n(2, 1);
            this.f141d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f157v = getScrollY();
            WeakHashMap weakHashMap = l.f728a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean g(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f140c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return l(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f159x.f722a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f160y.d(0);
    }

    public final boolean i(View view, int i, int i2) {
        Rect rect = this.f140c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f160y.f717a;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f144g = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f148l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z2 = false;
        } else {
            i5 = 0;
            z2 = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z3 = false;
                if (z3 && !this.f160y.d(1)) {
                    this.f141d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z2 || z3;
            }
            i6 = 0;
        }
        z3 = true;
        if (z3) {
            this.f141d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L7f
        L75:
            if (r6 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.c(r2)
            r7 = 1
        L7f:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.l(int, int, int):boolean");
    }

    public final void m(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f139b;
        OverScroller overScroller = this.f141d;
        if (jCurrentAnimationTimeMillis > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f157v = getScrollY();
            overScroller.startScroll(getScrollX(), scrollY, 0, iMax);
            WeakHashMap weakHashMap = l.f728a;
            postInvalidateOnAnimation();
        } else {
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f139b = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r13, int r14) {
        /*
            r12 = this;
            q.g r0 = r12.f160y
            java.lang.Object r1 = r0.f720d
            android.support.v4.widget.NestedScrollView r1 = (android.support.v4.widget.NestedScrollView) r1
            boolean r2 = r0.d(r14)
            r3 = 1
            if (r2 == 0) goto Le
            return r3
        Le:
            boolean r2 = r0.f717a
            r4 = 0
            if (r2 == 0) goto L8b
            android.view.ViewParent r2 = r1.getParent()
            r5 = r1
        L18:
            if (r2 == 0) goto L8b
            boolean r6 = r2 instanceof q.h
            java.lang.String r7 = "ViewParent "
            java.lang.String r8 = "ViewParentCompat"
            if (r6 == 0) goto L2b
            r9 = r2
            q.h r9 = (q.h) r9
            r9 = r13 & 2
            if (r9 == 0) goto L47
            r9 = r3
            goto L48
        L2b:
            if (r14 != 0) goto L47
            boolean r9 = r2.onStartNestedScroll(r5, r1, r13)     // Catch: java.lang.AbstractMethodError -> L32
            goto L48
        L32:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            r10.append(r2)
            java.lang.String r11 = " does not implement interface method onStartNestedScroll"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r8, r10, r9)
        L47:
            r9 = r4
        L48:
            if (r9 == 0) goto L7f
            if (r14 == 0) goto L52
            if (r14 == r3) goto L4f
            goto L54
        L4f:
            r0.f719c = r2
            goto L54
        L52:
            r0.f718b = r2
        L54:
            if (r6 == 0) goto L63
            q.h r2 = (q.h) r2
            android.support.v4.widget.NestedScrollView r2 = (android.support.v4.widget.NestedScrollView) r2
            q.i r0 = r2.f159x
            r0.f722a = r13
            r13 = 2
            r2.n(r13, r14)
            goto L8c
        L63:
            if (r14 != 0) goto L8c
            r2.onNestedScrollAccepted(r5, r1, r13)     // Catch: java.lang.AbstractMethodError -> L69
            goto L8c
        L69:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r7)
            r14.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            android.util.Log.e(r8, r14, r13)
            goto L8c
        L7f:
            boolean r6 = r2 instanceof android.view.View
            if (r6 == 0) goto L86
            r5 = r2
            android.view.View r5 = (android.view.View) r5
        L86:
            android.view.ViewParent r2 = r2.getParent()
            goto L18
        L8b:
            r3 = r4
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.n(int, int):boolean");
    }

    public final void o(int i) {
        g gVar = this.f160y;
        ViewParent viewParentC = gVar.c(i);
        if (viewParentC != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) gVar.f720d;
            if (viewParentC instanceof h) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) ((h) viewParentC);
                nestedScrollView2.f159x.f722a = 0;
                nestedScrollView2.o(i);
            } else if (i == 0) {
                try {
                    viewParentC.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                gVar.f718b = null;
            } else {
                if (i != 1) {
                    return;
                }
                gVar.f719c = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f147k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        this.f145h = false;
        View view = this.f146j;
        if (view != null && h(view, this)) {
            View view2 = this.f146j;
            Rect rect = this.f140c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.f146j = null;
        if (!this.i) {
            if (this.f158w != null) {
                scrollTo(getScrollX(), this.f158w.f771b);
                this.f158w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f149m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        f((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f160y.a(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        this.f160y.b(0, scrollY2, 0, i4 - scrollY2, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f159x.f722a = i;
        n(2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && i(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f158w = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f771b = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !i(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f140c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        c(b(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f159x.f722a = 0;
        o(0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f148l == null) {
            this.f148l = VelocityTracker.obtain();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f156u = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.f156u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f148l;
                velocityTracker.computeCurrentVelocity(1000, this.f153q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.f152p) {
                    f(-yVelocity);
                } else if (this.f141d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = l.f728a;
                    postInvalidateOnAnimation();
                }
                this.r = -1;
                this.f147k = false;
                VelocityTracker velocityTracker2 = this.f148l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f148l = null;
                }
                o(0);
                EdgeEffect edgeEffect = this.f142e;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    this.f143f.onRelease();
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.f144g - y2;
                    boolean zA = this.f160y.a(0, i, this.f155t, this.f154s, 0);
                    int[] iArr = this.f154s;
                    if (zA) {
                        i -= this.f155t[1];
                        motionEventObtain.offsetLocation(0.0f, iArr[1]);
                        this.f156u += iArr[1];
                    }
                    if (!this.f147k) {
                        int iAbs = Math.abs(i);
                        int i2 = this.f151o;
                        if (iAbs > i2) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f147k = true;
                            i = i > 0 ? i - i2 : i + i2;
                        }
                    }
                    if (this.f147k) {
                        this.f144g = y2 - iArr[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (k(i, 0, getScrollY(), scrollRange) && !this.f160y.d(0)) {
                            this.f148l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (this.f160y.b(0, scrollY2, 0, i - scrollY2, this.f154s, 0)) {
                            int i3 = this.f144g;
                            int i4 = iArr[1];
                            this.f144g = i3 - i4;
                            motionEventObtain.offsetLocation(0.0f, i4);
                            this.f156u += iArr[1];
                        } else if (z2) {
                            d();
                            int i5 = scrollY + i;
                            if (i5 < 0) {
                                this.f142e.onPull(i / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f143f.isFinished()) {
                                    this.f143f.onRelease();
                                }
                            } else if (i5 > scrollRange) {
                                this.f143f.onPull(i / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f142e.isFinished()) {
                                    this.f142e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect2 = this.f142e;
                            if (edgeEffect2 != null && (!edgeEffect2.isFinished() || !this.f143f.isFinished())) {
                                WeakHashMap weakHashMap2 = l.f728a;
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f147k && getChildCount() > 0) {
                    if (this.f141d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        WeakHashMap weakHashMap3 = l.f728a;
                        postInvalidateOnAnimation();
                    }
                }
                this.r = -1;
                this.f147k = false;
                VelocityTracker velocityTracker3 = this.f148l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f148l = null;
                }
                o(0);
                EdgeEffect edgeEffect3 = this.f142e;
                if (edgeEffect3 != null) {
                    edgeEffect3.onRelease();
                    this.f143f.onRelease();
                }
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f144g = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f144g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            OverScroller overScroller = this.f141d;
            boolean zIsFinished = overScroller.isFinished();
            this.f147k = !zIsFinished;
            if (!zIsFinished && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            this.f144g = (int) motionEvent.getY();
            this.r = motionEvent.getPointerId(0);
            n(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f148l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f145h) {
            this.f146j = view2;
        } else {
            Rect rect = this.f140c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z3 = iB != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iB);
                return z3;
            }
            m(0, iB);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f148l) != null) {
            velocityTracker.recycle();
            this.f148l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f145h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f149m) {
            this.f149m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        g gVar = this.f160y;
        if (gVar.f717a) {
            NestedScrollView nestedScrollView = (NestedScrollView) gVar.f720d;
            WeakHashMap weakHashMap = l.f728a;
            nestedScrollView.stopNestedScroll();
        }
        gVar.f717a = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f150n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return n(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        o(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(s.i iVar) {
    }
}
