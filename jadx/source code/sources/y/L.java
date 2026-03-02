package y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class L extends Spinner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f1196j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.c f1198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f1199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f1200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f1202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1203h;
    public final Rect i;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130837872(0x7f020170, float:1.728071E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.i = r1
            int[] r1 = u.a.f914v
            e.c r2 = e.c.g(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f474b
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            y.p r4 = new y.p
            r4.<init>(r12)
            r12.f1197b = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            r6 = 0
            if (r4 == 0) goto L2f
            w.c r7 = new w.c
            r7.<init>(r13, r4)
            r12.f1198c = r7
            goto L31
        L2f:
            r12.f1198c = r6
        L31:
            w.c r4 = r12.f1198c
            r7 = 1
            if (r4 == 0) goto L9d
            r4 = -1
            int[] r8 = y.L.f1196j     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r8 = r13.obtainStyledAttributes(r14, r8, r0, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r9 = r8.hasValue(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            if (r9 == 0) goto L4d
            int r4 = r8.getInt(r5, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            goto L4d
        L48:
            r13 = move-exception
            r6 = r8
            goto L97
        L4b:
            r9 = move-exception
            goto L55
        L4d:
            r8.recycle()
            goto L5f
        L51:
            r13 = move-exception
            goto L97
        L53:
            r9 = move-exception
            r8 = r6
        L55:
            java.lang.String r10 = "AppCompatSpinner"
            java.lang.String r11 = "Could not read android:spinnerMode"
            android.util.Log.i(r10, r11, r9)     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L5f
            goto L4d
        L5f:
            if (r4 != r7) goto L9d
            y.K r4 = new y.K
            w.c r8 = r12.f1198c
            r4.<init>(r12, r8, r14)
            w.c r8 = r12.f1198c
            e.c r1 = e.c.g(r8, r14, r1, r0)
            java.lang.Object r8 = r1.f474b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r12.f1203h = r8
            android.graphics.drawable.Drawable r8 = r1.b(r7)
            y.A r9 = r4.f1306z
            r9.setBackgroundDrawable(r8)
            r8 = 2
            java.lang.String r8 = r3.getString(r8)
            r4.D = r8
            r1.h()
            r12.f1202g = r4
            y.G r1 = new y.G
            r1.<init>(r12, r12, r4)
            r12.f1199d = r1
            goto L9d
        L97:
            if (r6 == 0) goto L9c
            r6.recycle()
        L9c:
            throw r13
        L9d:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lb4
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131296294(0x7f090026, float:1.82105E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lb4:
            r2.h()
            r12.f1201f = r7
            android.widget.SpinnerAdapter r13 = r12.f1200e
            if (r13 == 0) goto Lc2
            r12.setAdapter(r13)
            r12.f1200e = r6
        Lc2:
            y.p r13 = r12.f1197b
            r13.d(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.L.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.i;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            c0038p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        K k2 = this.f1202g;
        return k2 != null ? k2.f1289g : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        K k2 = this.f1202g;
        if (k2 == null) {
            return super.getDropDownVerticalOffset();
        }
        if (k2.f1291j) {
            return k2.f1290h;
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1202g != null ? this.f1203h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        K k2 = this.f1202g;
        return k2 != null ? k2.f1306z.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1202g != null ? this.f1198c : super.getPopupContext();
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        K k2 = this.f1202g;
        return k2 != null ? k2.D : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K k2 = this.f1202g;
        if (k2 == null || !k2.f1306z.isShowing()) {
            return;
        }
        k2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1202g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        G g2 = this.f1199d;
        if (g2 == null || !g2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        K k2 = this.f1202g;
        if (k2 == null) {
            return super.performClick();
        }
        if (k2.f1306z.isShowing()) {
            return true;
        }
        k2.c();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        K k2 = this.f1202g;
        if (k2 != null) {
            k2.f1289g = i;
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        K k2 = this.f1202g;
        if (k2 == null) {
            super.setDropDownVerticalOffset(i);
        } else {
            k2.f1290h = i;
            k2.f1291j = true;
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1202g != null) {
            this.f1203h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        K k2 = this.f1202g;
        if (k2 != null) {
            k2.f1306z.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(v.a.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        K k2 = this.f1202g;
        if (k2 != null) {
            k2.D = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1197b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1201f) {
            this.f1200e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        K k2 = this.f1202g;
        if (k2 != null) {
            Context context = this.f1198c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            H h2 = new H();
            h2.f1170b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                h2.f1171c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            k2.d(h2);
        }
    }
}
