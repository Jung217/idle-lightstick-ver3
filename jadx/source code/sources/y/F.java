package y;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f1147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1150h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1151j;

    public F(E e2) {
        super(e2, 0);
        this.f1149g = null;
        this.f1150h = null;
        this.i = false;
        this.f1151j = false;
        this.f1147e = e2;
    }

    @Override // y.B
    public final void d(AttributeSet attributeSet, int i) {
        super.d(attributeSet, R.attr.seekBarStyle);
        E e2 = this.f1147e;
        e.c cVarG = e.c.g(e2.getContext(), attributeSet, u.a.f901g, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        Drawable drawableC = cVarG.c(0);
        if (drawableC != null) {
            e2.setThumb(drawableC);
        }
        Drawable drawableB = cVarG.b(1);
        Drawable drawable = this.f1148f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1148f = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(e2);
            WeakHashMap weakHashMap = q.l.f728a;
            drawableB.setLayoutDirection(e2.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(e2.getDrawableState());
            }
            f();
        }
        e2.invalidate();
        if (typedArray.hasValue(3)) {
            this.f1150h = T.b(typedArray.getInt(3, -1), this.f1150h);
            this.f1151j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f1149g = cVarG.a(2);
            this.i = true;
        }
        cVarG.h();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1148f;
        if (drawable != null) {
            if (this.i || this.f1151j) {
                Drawable drawableMutate = drawable.mutate();
                this.f1148f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.f1149g);
                }
                if (this.f1151j) {
                    this.f1148f.setTintMode(this.f1150h);
                }
                if (this.f1148f.isStateful()) {
                    this.f1148f.setState(this.f1147e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f1148f != null) {
            int max = this.f1147e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1148f.getIntrinsicWidth();
                int intrinsicHeight = this.f1148f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1148f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1148f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
