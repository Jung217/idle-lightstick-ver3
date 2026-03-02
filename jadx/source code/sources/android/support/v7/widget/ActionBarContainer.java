package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;
import q.l;
import y.AbstractC0031k0;
import y.C0012b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f202h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f203j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0012b c0012b = new C0012b(this);
        WeakHashMap weakHashMap = l.f728a;
        setBackground(c0012b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f895a);
        boolean z2 = false;
        this.f199e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f200f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f203j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f202h = true;
            this.f201g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f202h ? !(this.f199e != null || this.f200f != null) : this.f201g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f199e;
        if (drawable != null && drawable.isStateful()) {
            this.f199e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f200f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f200f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f201g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f201g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f199e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f200f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f201g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f197c = findViewById(R.id.action_bar);
        this.f198d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f196b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.f202h) {
            Drawable drawable = this.f201g;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f199e == null) {
                z3 = false;
            } else if (this.f197c.getVisibility() == 0) {
                this.f199e.setBounds(this.f197c.getLeft(), this.f197c.getTop(), this.f197c.getRight(), this.f197c.getBottom());
            } else {
                View view = this.f198d;
                if (view == null || view.getVisibility() != 0) {
                    this.f199e.setBounds(0, 0, 0, 0);
                } else {
                    this.f199e.setBounds(this.f198d.getLeft(), this.f198d.getTop(), this.f198d.getRight(), this.f198d.getBottom());
                }
            }
            this.i = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f197c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f203j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f197c == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f199e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f199e);
        }
        this.f199e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f197c;
            if (view != null) {
                this.f199e.setBounds(view.getLeft(), this.f197c.getTop(), this.f197c.getRight(), this.f197c.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f202h ? !(this.f199e != null || this.f200f != null) : this.f201g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f201g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f201g);
        }
        this.f201g = drawable;
        boolean z2 = this.f202h;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f201g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f199e != null || this.f200f != null) : this.f201g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f200f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f200f);
        }
        this.f200f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && this.f200f != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f202h ? !(this.f199e != null || this.f200f != null) : this.f201g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setTransitioning(boolean z2) {
        this.f196b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f199e;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f200f;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f201g;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f199e;
        boolean z2 = this.f202h;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f200f && this.i) {
            return true;
        }
        return (drawable == this.f201g && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC0031k0 abstractC0031k0) {
    }
}
