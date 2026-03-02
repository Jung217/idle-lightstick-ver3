package y;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: y.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040s extends CheckedTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1370c = {R.attr.checkMark};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        y0.a(context);
        M m2 = new M(this);
        this.f1371b = m2;
        m2.d(attributeSet, R.attr.checkedTextViewStyle);
        m2.b();
        e.c cVarG = e.c.g(getContext(), attributeSet, f1370c, R.attr.checkedTextViewStyle);
        setCheckMarkDrawable(cVarG.b(0));
        cVarG.h();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        M m2 = this.f1371b;
        if (m2 != null) {
            m2.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        android.arch.lifecycle.f.p(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(v.a.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.arch.lifecycle.f.w(callback, this));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m2 = this.f1371b;
        if (m2 != null) {
            m2.e(context, i);
        }
    }
}
