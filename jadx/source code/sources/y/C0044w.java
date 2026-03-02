package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: renamed from: y.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044w extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        y0.a(context);
        C0038p c0038p = new C0038p(this);
        this.f1402b = c0038p;
        c0038p.d(attributeSet, R.attr.editTextStyle);
        M m2 = new M(this);
        this.f1403c = m2;
        m2.d(attributeSet, R.attr.editTextStyle);
        m2.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            c0038p.a();
        }
        M m2 = this.f1403c;
        if (m2 != null) {
            m2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        android.arch.lifecycle.f.p(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.arch.lifecycle.f.w(callback, this));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1402b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m2 = this.f1403c;
        if (m2 != null) {
            m2.e(context, i);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
