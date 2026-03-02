package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: renamed from: y.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039q extends Button implements s.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        y0.a(context);
        C0038p c0038p = new C0038p(this);
        this.f1367b = c0038p;
        c0038p.d(attributeSet, R.attr.buttonStyle);
        M m2 = new M(this);
        this.f1368c = m2;
        m2.d(attributeSet, R.attr.buttonStyle);
        m2.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            c0038p.a();
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s.b.f743a) {
            return super.getAutoSizeMaxTextSize();
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            return Math.round(m2.f1211h.f1224e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s.b.f743a) {
            return super.getAutoSizeMinTextSize();
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            return Math.round(m2.f1211h.f1223d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s.b.f743a) {
            return super.getAutoSizeStepGranularity();
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            return Math.round(m2.f1211h.f1222c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s.b.f743a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        M m2 = this.f1368c;
        return m2 != null ? m2.f1211h.f1225f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (s.b.f743a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            return m2.f1211h.f1220a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        M m2 = this.f1368c;
        if (m2 == null || s.b.f743a) {
            return;
        }
        m2.f1211h.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        M m2 = this.f1368c;
        if (m2 != null) {
            O o2 = m2.f1211h;
            if (s.b.f743a || !o2.f()) {
                return;
            }
            o2.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (s.b.f743a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (s.b.f743a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (s.b.f743a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.arch.lifecycle.f.w(callback, this));
    }

    public void setSupportAllCaps(boolean z2) {
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.f1204a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1367b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m2 = this.f1368c;
        if (m2 != null) {
            m2.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = s.b.f743a;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        M m2 = this.f1368c;
        if (m2 != null) {
            O o2 = m2.f1211h;
            if (z2 || o2.f()) {
                return;
            }
            o2.g(i, f2);
        }
    }
}
