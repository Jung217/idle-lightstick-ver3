package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;
import q.l;
import q.p;
import x.D;
import y.C0010a;
import y.C0022g;
import y.C0030k;
import y.M0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0010a f204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0030k f207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f210h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f218q;
    public final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f220t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f204b = new C0010a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f205c = context;
        } else {
            this.f205c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f898d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : v.a.a(context, resourceId);
        WeakHashMap weakHashMap = l.f728a;
        setBackground(drawable);
        this.f218q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f208f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f220t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int f(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(w.a aVar) {
        View view = this.f213l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f220t, (ViewGroup) this, false);
            this.f213l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f213l);
        }
        this.f213l.findViewById(R.id.action_mode_close_button).setOnClickListener(new t.a(1, aVar));
        x.p pVarE = aVar.e();
        C0030k c0030k = this.f207e;
        if (c0030k != null) {
            c0030k.i();
            C0022g c0022g = c0030k.f1342v;
            if (c0022g != null && c0022g.b()) {
                c0022g.i.dismiss();
            }
        }
        C0030k c0030k2 = new C0030k(getContext());
        this.f207e = c0030k2;
        c0030k2.f1334m = true;
        c0030k2.f1335n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        pVarE.b(this.f207e, this.f205c);
        C0030k c0030k3 = this.f207e;
        D d2 = c0030k3.i;
        if (d2 == null) {
            D d3 = (D) c0030k3.f1327e.inflate(c0030k3.f1329g, (ViewGroup) this, false);
            c0030k3.i = d3;
            d3.a(c0030k3.f1326d);
            c0030k3.h();
        }
        D d4 = c0030k3.i;
        if (d2 != d4) {
            ((ActionMenuView) d4).setPresenter(c0030k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) d4;
        this.f206d = actionMenuView;
        WeakHashMap weakHashMap = l.f728a;
        actionMenuView.setBackground(null);
        addView(this.f206d, layoutParams);
    }

    public final void d() {
        if (this.f215n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f215n = linearLayout;
            this.f216o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f217p = (TextView) this.f215n.findViewById(R.id.action_bar_subtitle);
            int i = this.f218q;
            if (i != 0) {
                this.f216o.setTextAppearance(getContext(), i);
            }
            int i2 = this.r;
            if (i2 != 0) {
                this.f217p.setTextAppearance(getContext(), i2);
            }
        }
        this.f216o.setText(this.f211j);
        this.f217p.setText(this.f212k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f211j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f212k);
        this.f217p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f215n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f215n.getParent() == null) {
            addView(this.f215n);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            p pVar = this.f209g;
            if (pVar != null) {
                pVar.b();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f209g != null ? this.f204b.f1257b : getVisibility();
    }

    public int getContentHeight() {
        return this.f208f;
    }

    public CharSequence getSubtitle() {
        return this.f212k;
    }

    public CharSequence getTitle() {
        return this.f211j;
    }

    public final p h(int i, long j2) {
        p pVar = this.f209g;
        if (pVar != null) {
            pVar.b();
        }
        C0010a c0010a = this.f204b;
        if (i != 0) {
            p pVarA = l.a(this);
            pVarA.a(0.0f);
            pVarA.c(j2);
            c0010a.f1258c.f209g = pVarA;
            c0010a.f1257b = i;
            pVarA.d(c0010a);
            return pVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        p pVarA2 = l.a(this);
        pVarA2.a(1.0f);
        pVarA2.c(j2);
        c0010a.f1258c.f209g = pVarA2;
        c0010a.f1257b = i;
        pVarA2.d(c0010a);
        return pVarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, u.a.f895a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0030k c0030k = this.f207e;
        if (c0030k != null) {
            Configuration configuration2 = c0030k.f1325c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0030k.f1338q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            x.p pVar = c0030k.f1326d;
            if (pVar != null) {
                pVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0030k c0030k = this.f207e;
        if (c0030k != null) {
            c0030k.i();
            C0022g c0022g = this.f207e.f1342v;
            if (c0022g == null || !c0022g.b()) {
                return;
            }
            c0022g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f211j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean zA = M0.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f213l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f213l.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zA ? paddingRight - i5 : paddingRight + i5;
            int iF = f(this.f213l, i7, paddingTop, paddingTop2, zA) + i7;
            paddingRight = zA ? iF - i6 : iF + i6;
        }
        LinearLayout linearLayout = this.f215n;
        if (linearLayout != null && this.f214m == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.f215n, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.f214m;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f206d;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f208f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f213l;
        if (view != null) {
            int iE = e(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f213l.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f206d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.f206d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f215n;
        if (linearLayout != null && this.f214m == null) {
            if (this.f219s) {
                this.f215n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f215n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f215n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f214m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f214m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f208f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f210h = false;
        }
        if (!this.f210h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f210h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f210h = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f208f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f214m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f214m = view;
        if (view != null && (linearLayout = this.f215n) != null) {
            removeView(linearLayout);
            this.f215n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f212k = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f211j = charSequence;
        d();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f219s) {
            requestLayout();
        }
        this.f219s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
