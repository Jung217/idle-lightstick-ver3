package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: y.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0046y extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0038p f1429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f1430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y0.a(context);
        C0038p c0038p = new C0038p(this);
        this.f1429b = c0038p;
        c0038p.d(attributeSet, i);
        B b2 = new B(this, 1);
        this.f1430c = b2;
        b2.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            c0038p.a();
        }
        B b2 = this.f1430c;
        if (b2 != null) {
            b2.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            return c0038p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            return c0038p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        B b2 = this.f1430c;
        if (b2 == null || (z0Var = (z0) b2.f1136c) == null) {
            return null;
        }
        return z0Var.f1435a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        B b2 = this.f1430c;
        if (b2 == null || (z0Var = (z0) b2.f1136c) == null) {
            return null;
        }
        return z0Var.f1436b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f1430c.f1135b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            c0038p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            c0038p.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B b2 = this.f1430c;
        if (b2 != null) {
            b2.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        B b2 = this.f1430c;
        if (b2 != null) {
            b2.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B b2 = this.f1430c;
        if (b2 != null) {
            ImageView imageView = (ImageView) b2.f1135b;
            if (i != 0) {
                Drawable drawableA = v.a.a(imageView.getContext(), i);
                if (drawableA != null) {
                    int i2 = T.f1229a;
                }
                imageView.setImageDrawable(drawableA);
            } else {
                imageView.setImageDrawable(null);
            }
            b2.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B b2 = this.f1430c;
        if (b2 != null) {
            b2.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            c0038p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0038p c0038p = this.f1429b;
        if (c0038p != null) {
            c0038p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B b2 = this.f1430c;
        if (b2 != null) {
            if (((z0) b2.f1136c) == null) {
                b2.f1136c = new z0();
            }
            z0 z0Var = (z0) b2.f1136c;
            z0Var.f1435a = colorStateList;
            z0Var.f1438d = true;
            b2.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B b2 = this.f1430c;
        if (b2 != null) {
            if (((z0) b2.f1136c) == null) {
                b2.f1136c = new z0();
            }
            z0 z0Var = (z0) b2.f1136c;
            z0Var.f1436b = mode;
            z0Var.f1437c = true;
            b2.a();
        }
    }
}
