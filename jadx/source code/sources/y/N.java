package y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class N extends TextView implements s.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future f1217d;

    public N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            c0038p.a();
        }
        M m2 = this.f1216c;
        if (m2 != null) {
            m2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s.b.f743a) {
            return super.getAutoSizeMaxTextSize();
        }
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
        return m2 != null ? m2.f1211h.f1225f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (s.b.f743a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        M m2 = this.f1216c;
        if (m2 != null) {
            return m2.f1211h.f1220a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1217d;
        if (future != null) {
            try {
                this.f1217d = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    throw null;
                }
                android.arch.lifecycle.f.n(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public o.a getTextMetricsParamsCompat() {
        return android.arch.lifecycle.f.n(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        android.arch.lifecycle.f.p(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        M m2 = this.f1216c;
        if (m2 == null || s.b.f743a) {
            return;
        }
        m2.f1211h.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f1217d;
        if (future != null) {
            try {
                this.f1217d = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    throw null;
                }
                android.arch.lifecycle.f.n(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
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
        M m2 = this.f1216c;
        if (m2 != null) {
            m2.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.arch.lifecycle.f.w(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            android.arch.lifecycle.f.s(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            android.arch.lifecycle.f.t(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(o.b bVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            throw null;
        }
        android.arch.lifecycle.f.n(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1215b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m2 = this.f1216c;
        if (m2 != null) {
            m2.e(context, i);
        }
    }

    public void setTextFuture(Future<o.b> future) {
        this.f1217d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(o.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f670b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f669a);
        setBreakStrategy(aVar.f671c);
        setHyphenationFrequency(aVar.f672d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = s.b.f743a;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        M m2 = this.f1216c;
        if (m2 != null) {
            O o2 = m2.f1211h;
            if (z2 || o2.f()) {
                return;
            }
            o2.g(i, f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y0.a(context);
        C0038p c0038p = new C0038p(this);
        this.f1215b = c0038p;
        c0038p.d(attributeSet, i);
        M m2 = new M(this);
        this.f1216c = m2;
        m2.d(attributeSet, i);
        m2.b();
    }
}
