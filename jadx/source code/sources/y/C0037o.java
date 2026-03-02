package y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0037o extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1356d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.studiothinkers.lightstick.idlev3.R.attr.autoCompleteTextViewStyle);
        y0.a(context);
        e.c cVarG = e.c.g(getContext(), attributeSet, f1356d, com.studiothinkers.lightstick.idlev3.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) cVarG.f474b).hasValue(0)) {
            setDropDownBackgroundDrawable(cVarG.b(0));
        }
        cVarG.h();
        C0038p c0038p = new C0038p(this);
        this.f1357b = c0038p;
        c0038p.d(attributeSet, com.studiothinkers.lightstick.idlev3.R.attr.autoCompleteTextViewStyle);
        M m2 = new M(this);
        this.f1358c = m2;
        m2.d(attributeSet, com.studiothinkers.lightstick.idlev3.R.attr.autoCompleteTextViewStyle);
        m2.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            c0038p.a();
        }
        M m2 = this.f1358c;
        if (m2 != null) {
            m2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        android.arch.lifecycle.f.p(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.arch.lifecycle.f.w(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(v.a.a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1357b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m2 = this.f1358c;
        if (m2 != null) {
            m2.e(context, i);
        }
    }
}
