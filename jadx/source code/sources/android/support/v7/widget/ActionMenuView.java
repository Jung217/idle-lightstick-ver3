package android.support.v7.widget;

import android.arch.lifecycle.i;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g.n;
import x.D;
import x.o;
import x.p;
import x.r;
import y.AbstractC0011a0;
import y.C0022g;
import y.C0028j;
import y.C0030k;
import y.C0034m;
import y.InterfaceC0032l;
import y.InterfaceC0036n;
import y.M0;
import y.Z;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0011a0 implements o, D {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f245q;
    public Context r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0030k f248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0036n f253z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f251x = (int) (56.0f * f2);
        this.f252y = (int) (f2 * 4.0f);
        this.r = context;
        this.f246s = 0;
    }

    public static C0034m i() {
        C0034m c0034m = new C0034m(-2);
        c0034m.f1347c = false;
        c0034m.f1255b = 16;
        return c0034m;
    }

    public static C0034m j(ViewGroup.LayoutParams layoutParams) {
        C0034m c0034m;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C0034m) {
            C0034m c0034m2 = (C0034m) layoutParams;
            c0034m = new C0034m(c0034m2);
            c0034m.f1347c = c0034m2.f1347c;
        } else {
            c0034m = new C0034m(layoutParams);
        }
        if (c0034m.f1255b <= 0) {
            c0034m.f1255b = 16;
        }
        return c0034m;
    }

    @Override // x.D
    public final void a(p pVar) {
        this.f245q = pVar;
    }

    @Override // x.o
    public final boolean b(r rVar) {
        return this.f245q.q(rVar, null, 0);
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0034m);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // y.AbstractC0011a0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Z generateDefaultLayoutParams() {
        return i();
    }

    @Override // y.AbstractC0011a0
    /* JADX INFO: renamed from: f */
    public final Z generateLayoutParams(AttributeSet attributeSet) {
        return new C0034m(getContext(), attributeSet);
    }

    @Override // y.AbstractC0011a0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Z generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f245q == null) {
            Context context = getContext();
            p pVar = new p(context);
            this.f245q = pVar;
            pVar.f1069e = new i(this);
            C0030k c0030k = new C0030k(context);
            this.f248u = c0030k;
            c0030k.f1334m = true;
            c0030k.f1335n = true;
            c0030k.f1328f = new n(3);
            this.f245q.b(c0030k, this.r);
            C0030k c0030k2 = this.f248u;
            c0030k2.i = this;
            this.f245q = c0030k2.f1326d;
        }
        return this.f245q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0030k c0030k = this.f248u;
        C0028j c0028j = c0030k.f1331j;
        if (c0028j != null) {
            return c0028j.getDrawable();
        }
        if (c0030k.f1333l) {
            return c0030k.f1332k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f246s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0032l)) {
            zA = ((InterfaceC0032l) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0032l)) ? zA : ((InterfaceC0032l) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0030k c0030k = this.f248u;
        if (c0030k != null) {
            c0030k.h();
            if (this.f248u.j()) {
                this.f248u.i();
                this.f248u.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0030k c0030k = this.f248u;
        if (c0030k != null) {
            c0030k.i();
            C0022g c0022g = c0030k.f1342v;
            if (c0022g == null || !c0022g.b()) {
                return;
            }
            c0022g.i.dismiss();
        }
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f249v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zA = M0.a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0034m c0034m = (C0034m) childAt.getLayoutParams();
                if (c0034m.f1347c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0034m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0034m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0034m).leftMargin) + ((ViewGroup.MarginLayoutParams) c0034m).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0034m c0034m2 = (C0034m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0034m2.f1347c) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) c0034m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0034m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0034m c0034m3 = (C0034m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0034m3.f1347c) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0034m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0034m3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // y.AbstractC0011a0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        p pVar;
        boolean z2 = this.f249v;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f249v = z3;
        if (z2 != z3) {
            this.f250w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f249v && (pVar = this.f245q) != null && size != this.f250w) {
            this.f250w = size;
            pVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f249v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0034m c0034m = (C0034m) getChildAt(i7).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0034m).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0034m).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f251x;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f252y;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0034m c0034m2 = (C0034m) childAt.getLayoutParams();
                c0034m2.f1352h = false;
                c0034m2.f1349e = 0;
                c0034m2.f1348d = 0;
                c0034m2.f1350f = false;
                ((ViewGroup.MarginLayoutParams) c0034m2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0034m2).rightMargin = 0;
                c0034m2.f1351g = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c0034m2.f1347c ? 1 : i10;
                C0034m c0034m3 = (C0034m) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i18 <= 0 || (z6 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z7 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c0034m3.f1350f = !c0034m3.f1347c && z7;
                c0034m3.f1348d = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c0034m2.f1350f) {
                    i15++;
                }
                if (c0034m2.f1347c) {
                    z4 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j2 |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z8 = z4 && i13 == 2;
        int i23 = i21;
        boolean z9 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j3 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C0034m c0034m4 = (C0034m) getChildAt(i26).getLayoutParams();
                boolean z10 = z8;
                if (c0034m4.f1350f) {
                    int i28 = c0034m4.f1348d;
                    if (i28 < i24) {
                        j3 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j3 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z8 = z10;
                iMax = i27;
            }
            i4 = iMax;
            boolean z11 = z8;
            j2 |= j3;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0034m c0034m5 = (C0034m) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i30;
                if ((j3 & j4) != 0) {
                    if (z11 && c0034m5.f1351g) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0034m5.f1348d += r11;
                    c0034m5.f1352h = r11;
                    i23--;
                } else if (c0034m5.f1348d == i29) {
                    j2 |= j4;
                }
                i30++;
                z4 = z12;
            }
            z8 = z11;
            iMax = i4;
            z9 = true;
        }
        i4 = iMax;
        boolean z13 = !z4 && i13 == 1;
        if (i23 > 0 && j2 != 0 && (i23 < i13 - 1 || z13 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C0034m) getChildAt(0).getLayoutParams()).f1351g) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j2 & ((long) (1 << i31))) != 0 && !((C0034m) getChildAt(i31).getLayoutParams()).f1351g) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z14 = z9;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j2 & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0034m c0034m6 = (C0034m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0034m6.f1349e = i32;
                        c0034m6.f1352h = true;
                        if (i33 == 0 && !c0034m6.f1351g) {
                            ((ViewGroup.MarginLayoutParams) c0034m6).leftMargin = (-i32) / 2;
                        }
                        z14 = true;
                    } else if (c0034m6.f1347c) {
                        c0034m6.f1349e = i32;
                        c0034m6.f1352h = true;
                        ((ViewGroup.MarginLayoutParams) c0034m6).rightMargin = (-i32) / 2;
                        z14 = true;
                    } else {
                        if (i33 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0034m6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0034m6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0034m c0034m7 = (C0034m) childAt4.getLayoutParams();
                if (c0034m7.f1352h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0034m7.f1348d * i22) + c0034m7.f1349e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f248u.r = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0036n interfaceC0036n) {
        this.f253z = interfaceC0036n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0030k c0030k = this.f248u;
        C0028j c0028j = c0030k.f1331j;
        if (c0028j != null) {
            c0028j.setImageDrawable(drawable);
        } else {
            c0030k.f1333l = true;
            c0030k.f1332k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f247t = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f246s != i) {
            this.f246s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0030k c0030k) {
        this.f248u = c0030k;
        c0030k.i = this;
        this.f245q = c0030k.f1326d;
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0034m(getContext(), attributeSet);
    }
}
