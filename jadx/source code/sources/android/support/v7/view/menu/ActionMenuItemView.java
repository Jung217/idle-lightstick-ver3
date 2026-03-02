package android.support.v7.view.menu;

import android.arch.lifecycle.f;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import u.a;
import x.AbstractC0004c;
import x.C;
import x.C0003b;
import x.o;
import x.p;
import x.r;
import y.InterfaceC0032l;
import y.N;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends N implements C, View.OnClickListener, InterfaceC0032l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f172h;
    public C0003b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0004c f173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f178o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f174k = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f897c, 0, 0);
        this.f176m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f178o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f177n = -1;
        setSaveEnabled(false);
    }

    @Override // y.InterfaceC0032l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // y.InterfaceC0032l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f169e.getIcon() == null;
    }

    @Override // x.C
    public final void c(r rVar) {
        this.f169e = rVar;
        setIcon(rVar.getIcon());
        setTitle(rVar.getTitleCondensed());
        setId(rVar.f1091a);
        setVisibility(rVar.isVisible() ? 0 : 8);
        setEnabled(rVar.isEnabled());
        if (rVar.hasSubMenu() && this.i == null) {
            this.i = new C0003b(this);
        }
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f170f);
        if (this.f171g != null && ((this.f169e.f1113y & 4) != 4 || (!this.f174k && !this.f175l))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f170f : null);
        CharSequence charSequence = this.f169e.f1106q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f169e.f1095e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f169e.r;
        if (TextUtils.isEmpty(charSequence2)) {
            f.u(this, z4 ? null : this.f169e.f1095e);
        } else {
            f.u(this, charSequence2);
        }
    }

    @Override // x.C
    public r getItemData() {
        return this.f169e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o oVar = this.f172h;
        if (oVar != null) {
            oVar.b(this.f169e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f174k = d();
        e();
    }

    @Override // y.N, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f177n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f176m;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f171g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f171g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0003b c0003b;
        if (this.f169e.hasSubMenu() && (c0003b = this.i) != null && c0003b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f175l != z2) {
            this.f175l = z2;
            r rVar = this.f169e;
            if (rVar != null) {
                p pVar = rVar.f1103n;
                pVar.f1074k = true;
                pVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f171g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f178o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(o oVar) {
        this.f172h = oVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f177n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0004c abstractC0004c) {
        this.f173j = abstractC0004c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f170f = charSequence;
        e();
    }
}
