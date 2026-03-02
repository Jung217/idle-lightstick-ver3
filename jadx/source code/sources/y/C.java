package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: loaded from: classes.dex */
public final class C extends RadioButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0041t f1140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        y0.a(context);
        C0041t c0041t = new C0041t(this);
        this.f1140b = c0041t;
        c0041t.b(attributeSet, R.attr.radioButtonStyle);
        new M(this).d(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            c0041t.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            return c0041t.f1373b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            return c0041t.f1374c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            if (c0041t.f1377f) {
                c0041t.f1377f = false;
            } else {
                c0041t.f1377f = true;
                c0041t.a();
            }
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            c0041t.f1373b = colorStateList;
            c0041t.f1375d = true;
            c0041t.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0041t c0041t = this.f1140b;
        if (c0041t != null) {
            c0041t.f1374c = mode;
            c0041t.f1376e = true;
            c0041t.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(v.a.a(getContext(), i));
    }
}
