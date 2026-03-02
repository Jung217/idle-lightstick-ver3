package android.support.v7.widget;

import A.g;
import android.arch.lifecycle.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.l;
import w.h;
import x.p;
import x.r;
import y.B0;
import y.C0;
import y.C0029j0;
import y.C0030k;
import y.C0045x;
import y.C0046y;
import y.D0;
import y.E0;
import y.F0;
import y.G0;
import y.M0;
import y.N;
import y.S;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f278A;
    public int B;
    public boolean C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final int[] G;
    public final i H;
    public G0 I;
    public C0030k J;
    public B0 K;
    public boolean L;
    public final g M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0045x f282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0046y f283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f285h;
    public C0045x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f293q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0029j0 f296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f301z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f299x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.H = new i(this);
        this.M = new g(5, this);
        e.c cVarG = e.c.g(getContext(), attributeSet, u.a.f916x, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        this.f289m = typedArray.getResourceId(27, 0);
        this.f290n = typedArray.getResourceId(18, 0);
        this.f299x = typedArray.getInteger(0, 8388627);
        this.f291o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(21, 0);
        dimensionPixelOffset = typedArray.hasValue(26) ? typedArray.getDimensionPixelOffset(26, dimensionPixelOffset) : dimensionPixelOffset;
        this.f295t = dimensionPixelOffset;
        this.f294s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.f293q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f293q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f294s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(22, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f295t = dimensionPixelOffset5;
        }
        this.f292p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        c();
        C0029j0 c0029j0 = this.f296u;
        c0029j0.f1323h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0029j0.f1320e = dimensionPixelSize;
            c0029j0.f1316a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0029j0.f1321f = dimensionPixelSize2;
            c0029j0.f1317b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0029j0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f297v = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f298w = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f284g = cVarG.b(4);
        this.f285h = typedArray.getText(3);
        CharSequence text = typedArray.getText(20);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(17);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f287k = getContext();
        setPopupTheme(typedArray.getResourceId(16, 0));
        Drawable drawableB = cVarG.b(15);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(14);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = cVarG.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(28)) {
            setTitleTextColor(typedArray.getColor(28, -1));
        }
        if (typedArray.hasValue(19)) {
            setSubtitleTextColor(typedArray.getColor(19, -1));
        }
        cVarG.h();
    }

    public static C0 g() {
        C0 c0 = new C0(-2, -2);
        c0.f1142b = 0;
        c0.f1141a = 8388627;
        return c0;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static C0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C0;
        if (z2) {
            C0 c0 = (C0) layoutParams;
            C0 c02 = new C0(c0);
            c02.f1142b = 0;
            c02.f1142b = c0.f1142b;
            return c02;
        }
        if (z2) {
            C0 c03 = new C0((C0) layoutParams);
            c03.f1142b = 0;
            return c03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0 c04 = new C0(layoutParams);
            c04.f1142b = 0;
            return c04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0 c05 = new C0(marginLayoutParams);
        c05.f1142b = 0;
        ((ViewGroup.MarginLayoutParams) c05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c05).bottomMargin = marginLayoutParams.bottomMargin;
        return c05;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = l.f728a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0 c0 = (C0) childAt.getLayoutParams();
                if (c0.f1142b == 0 && q(childAt)) {
                    int i3 = c0.f1141a;
                    WeakHashMap weakHashMap2 = l.f728a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C0 c02 = (C0) childAt2.getLayoutParams();
            if (c02.f1142b == 0 && q(childAt2)) {
                int i5 = c02.f1141a;
                WeakHashMap weakHashMap3 = l.f728a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0 c0G = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (C0) layoutParams;
        c0G.f1142b = 1;
        if (!z2 || this.f286j == null) {
            addView(view, c0G);
        } else {
            view.setLayoutParams(c0G);
            this.F.add(view);
        }
    }

    public final void c() {
        if (this.f296u == null) {
            C0029j0 c0029j0 = new C0029j0();
            c0029j0.f1316a = 0;
            c0029j0.f1317b = 0;
            c0029j0.f1318c = Integer.MIN_VALUE;
            c0029j0.f1319d = Integer.MIN_VALUE;
            c0029j0.f1320e = 0;
            c0029j0.f1321f = 0;
            c0029j0.f1322g = false;
            c0029j0.f1323h = false;
            this.f296u = c0029j0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f279b;
        if (actionMenuView.f245q == null) {
            p pVar = (p) actionMenuView.getMenu();
            if (this.K == null) {
                this.K = new B0(this);
            }
            this.f279b.setExpandedActionViewsExclusive(true);
            pVar.b(this.K, this.f287k);
        }
    }

    public final void e() {
        if (this.f279b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f279b = actionMenuView;
            actionMenuView.setPopupTheme(this.f288l);
            this.f279b.setOnMenuItemClickListener(this.H);
            this.f279b.getClass();
            C0 c0G = g();
            c0G.f1141a = (this.f291o & 112) | 8388613;
            this.f279b.setLayoutParams(c0G);
            b(this.f279b, false);
        }
    }

    public final void f() {
        if (this.f282e == null) {
            this.f282e = new C0045x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0 c0G = g();
            c0G.f1141a = (this.f291o & 112) | 8388611;
            this.f282e.setLayoutParams(c0G);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public int getContentInsetEnd() {
        C0029j0 c0029j0 = this.f296u;
        if (c0029j0 != null) {
            return c0029j0.f1322g ? c0029j0.f1316a : c0029j0.f1317b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f298w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0029j0 c0029j0 = this.f296u;
        if (c0029j0 != null) {
            return c0029j0.f1316a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0029j0 c0029j0 = this.f296u;
        if (c0029j0 != null) {
            return c0029j0.f1317b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0029j0 c0029j0 = this.f296u;
        if (c0029j0 != null) {
            return c0029j0.f1322g ? c0029j0.f1317b : c0029j0.f1316a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f297v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p pVar;
        ActionMenuView actionMenuView = this.f279b;
        return (actionMenuView == null || (pVar = actionMenuView.f245q) == null || !pVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f298w, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = l.f728a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = l.f728a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f297v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0046y c0046y = this.f283f;
        if (c0046y != null) {
            return c0046y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0046y c0046y = this.f283f;
        if (c0046y != null) {
            return c0046y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f279b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0045x c0045x = this.f282e;
        if (c0045x != null) {
            return c0045x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0045x c0045x = this.f282e;
        if (c0045x != null) {
            return c0045x.getDrawable();
        }
        return null;
    }

    public C0030k getOuterActionMenuPresenter() {
        return this.J;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f279b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f287k;
    }

    public int getPopupTheme() {
        return this.f288l;
    }

    public CharSequence getSubtitle() {
        return this.f301z;
    }

    public CharSequence getTitle() {
        return this.f300y;
    }

    public int getTitleMarginBottom() {
        return this.f295t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.f293q;
    }

    public int getTitleMarginTop() {
        return this.f294s;
    }

    public S getWrapper() {
        Drawable drawable;
        if (this.I == null) {
            G0 g0 = new G0();
            g0.f1168n = 0;
            g0.f1156a = this;
            g0.f1163h = getTitle();
            g0.i = getSubtitle();
            g0.f1162g = g0.f1163h != null;
            g0.f1161f = getNavigationIcon();
            e.c cVarG = e.c.g(getContext(), null, u.a.f895a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) cVarG.f474b;
            g0.f1169o = cVarG.b(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                g0.f1162g = true;
                g0.f1163h = text;
                if ((g0.f1157b & 8) != 0) {
                    g0.f1156a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                g0.i = text2;
                if ((g0.f1157b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableB = cVarG.b(20);
            if (drawableB != null) {
                g0.f1160e = drawableB;
                g0.c();
            }
            Drawable drawableB2 = cVarG.b(17);
            if (drawableB2 != null) {
                g0.f1159d = drawableB2;
                g0.c();
            }
            if (g0.f1161f == null && (drawable = g0.f1169o) != null) {
                g0.f1161f = drawable;
                Toolbar toolbar = g0.f1156a;
                if ((g0.f1157b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            g0.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = g0.f1158c;
                if (view != null && (g0.f1157b & 16) != 0) {
                    removeView(view);
                }
                g0.f1158c = viewInflate;
                if (viewInflate != null && (g0.f1157b & 16) != 0) {
                    addView(viewInflate);
                }
                g0.a(g0.f1157b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                c();
                this.f296u.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f289m = resourceId2;
                N n2 = this.f280c;
                if (n2 != null) {
                    n2.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f290n = resourceId3;
                N n3 = this.f281d;
                if (n3 != null) {
                    n3.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            cVarG.h();
            if (R.string.abc_action_bar_up_description != g0.f1168n) {
                g0.f1168n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = g0.f1168n;
                    g0.f1164j = i != 0 ? getContext().getString(i) : null;
                    g0.b();
                }
            }
            g0.f1164j = getNavigationContentDescription();
            setNavigationOnClickListener(new F0(g0));
            this.I = g0;
        }
        return this.I;
    }

    public final int i(View view, int i) {
        C0 c0 = (C0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0.f1141a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f299x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public final int m(View view, int i, int i2, int[] iArr) {
        C0 c0 = (C0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i4, iMax + measuredWidth, view.getMeasuredHeight() + i4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0).rightMargin + iMax;
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        C0 c0 = (C0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i4, iMax, view.getMeasuredHeight() + i4);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0).leftMargin);
    }

    public final int o(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = M0.a(this);
        int i3 = !zA ? 1 : 0;
        int i4 = 0;
        if (q(this.f282e)) {
            p(this.f282e, i, 0, i2, this.f292p);
            iJ = j(this.f282e) + this.f282e.getMeasuredWidth();
            iMax = Math.max(0, k(this.f282e) + this.f282e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f282e.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (q(this.i)) {
            p(this.i, i, 0, i2, this.f292p);
            iJ = j(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        int[] iArr = this.G;
        iArr[zA ? 1 : 0] = iMax4;
        if (q(this.f279b)) {
            p(this.f279b, i, iMax3, i2, this.f292p);
            iJ2 = j(this.f279b) + this.f279b.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f279b) + this.f279b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f279b.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iJ2);
        if (q(this.f286j)) {
            iMax5 += o(this.f286j, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.f286j) + this.f286j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f286j.getMeasuredState());
        }
        if (q(this.f283f)) {
            iMax5 += o(this.f283f, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.f283f) + this.f283f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f283f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C0) childAt.getLayoutParams()).f1142b == 0 && q(childAt)) {
                iMax5 += o(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f294s + this.f295t;
        int i8 = this.f293q + this.r;
        if (q(this.f280c)) {
            o(this.f280c, i, i6 + i8, i2, i7, iArr);
            int iJ3 = j(this.f280c) + this.f280c.getMeasuredWidth();
            iK = k(this.f280c) + this.f280c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f280c.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (q(this.f281d)) {
            iMax2 = Math.max(iMax2, o(this.f281d, i, i6 + i8, i2, i7 + iK, iArr));
            iK += k(this.f281d) + this.f281d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f281d.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.L) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (q(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof E0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E0 e0 = (E0) parcelable;
        super.onRestoreInstanceState(e0.f713b);
        ActionMenuView actionMenuView = this.f279b;
        p pVar = actionMenuView != null ? actionMenuView.f245q : null;
        int i = e0.f1145d;
        if (i != 0 && this.K != null && pVar != null && (menuItemFindItem = pVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (e0.f1146e) {
            g gVar = this.M;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        c();
        C0029j0 c0029j0 = this.f296u;
        boolean z2 = i == 1;
        if (z2 == c0029j0.f1322g) {
            return;
        }
        c0029j0.f1322g = z2;
        if (!c0029j0.f1323h) {
            c0029j0.f1316a = c0029j0.f1320e;
            c0029j0.f1317b = c0029j0.f1321f;
            return;
        }
        if (z2) {
            int i2 = c0029j0.f1319d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0029j0.f1320e;
            }
            c0029j0.f1316a = i2;
            int i3 = c0029j0.f1318c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0029j0.f1321f;
            }
            c0029j0.f1317b = i3;
            return;
        }
        int i4 = c0029j0.f1318c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0029j0.f1320e;
        }
        c0029j0.f1316a = i4;
        int i5 = c0029j0.f1319d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0029j0.f1321f;
        }
        c0029j0.f1317b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0030k c0030k;
        r rVar;
        E0 e0 = new E0(super.onSaveInstanceState());
        B0 b0 = this.K;
        if (b0 != null && (rVar = b0.f1138c) != null) {
            e0.f1145d = rVar.f1091a;
        }
        ActionMenuView actionMenuView = this.f279b;
        e0.f1146e = (actionMenuView == null || (c0030k = actionMenuView.f248u) == null || !c0030k.j()) ? false : true;
        return e0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    public final void p(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapsible(boolean z2) {
        this.L = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f298w) {
            this.f298w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f297v) {
            this.f297v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(v.a.a(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(v.a.a(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f282e.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f279b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f288l != i) {
            this.f288l = i;
            if (i == 0) {
                this.f287k = getContext();
            } else {
                this.f287k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        this.B = i;
        N n2 = this.f281d;
        if (n2 != null) {
            n2.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f295t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f293q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f294s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f278A = i;
        N n2 = this.f280c;
        if (n2 != null) {
            n2.setTextColor(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0 c0 = new C0(context, attributeSet);
        c0.f1141a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f896b);
        c0.f1141a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0.f1142b = 0;
        return c0;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f283f == null) {
                this.f283f = new C0046y(getContext(), null, 0);
            }
            if (!l(this.f283f)) {
                b(this.f283f, true);
            }
        } else {
            C0046y c0046y = this.f283f;
            if (c0046y != null && l(c0046y)) {
                removeView(this.f283f);
                this.F.remove(this.f283f);
            }
        }
        C0046y c0046y2 = this.f283f;
        if (c0046y2 != null) {
            c0046y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f283f == null) {
            this.f283f = new C0046y(getContext(), null, 0);
        }
        C0046y c0046y = this.f283f;
        if (c0046y != null) {
            c0046y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0045x c0045x = this.f282e;
        if (c0045x != null) {
            c0045x.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f282e)) {
                b(this.f282e, true);
            }
        } else {
            C0045x c0045x = this.f282e;
            if (c0045x != null && l(c0045x)) {
                removeView(this.f282e);
                this.F.remove(this.f282e);
            }
        }
        C0045x c0045x2 = this.f282e;
        if (c0045x2 != null) {
            c0045x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            N n2 = this.f281d;
            if (n2 != null && l(n2)) {
                removeView(this.f281d);
                this.F.remove(this.f281d);
            }
        } else {
            if (this.f281d == null) {
                Context context = getContext();
                N n3 = new N(context, null);
                this.f281d = n3;
                n3.setSingleLine();
                this.f281d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f290n;
                if (i != 0) {
                    this.f281d.setTextAppearance(context, i);
                }
                int i2 = this.B;
                if (i2 != 0) {
                    this.f281d.setTextColor(i2);
                }
            }
            if (!l(this.f281d)) {
                b(this.f281d, true);
            }
        }
        N n4 = this.f281d;
        if (n4 != null) {
            n4.setText(charSequence);
        }
        this.f301z = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            N n2 = this.f280c;
            if (n2 != null && l(n2)) {
                removeView(this.f280c);
                this.F.remove(this.f280c);
            }
        } else {
            if (this.f280c == null) {
                Context context = getContext();
                N n3 = new N(context, null);
                this.f280c = n3;
                n3.setSingleLine();
                this.f280c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f289m;
                if (i != 0) {
                    this.f280c.setTextAppearance(context, i);
                }
                int i2 = this.f278A;
                if (i2 != 0) {
                    this.f280c.setTextColor(i2);
                }
            }
            if (!l(this.f280c)) {
                b(this.f280c, true);
            }
        }
        N n4 = this.f280c;
        if (n4 != null) {
            n4.setText(charSequence);
        }
        this.f300y = charSequence;
    }

    public void setOnMenuItemClickListener(D0 d0) {
    }
}
