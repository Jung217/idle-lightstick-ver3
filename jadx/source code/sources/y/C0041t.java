package y;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: y.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1373b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1374c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1375d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1376e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1377f;

    public C0041t(CompoundButton compoundButton) {
        this.f1372a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f1372a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1375d || this.f1376e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1375d) {
                    drawableMutate.setTintList(this.f1373b);
                }
                if (this.f1376e) {
                    drawableMutate.setTintMode(this.f1374c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        CompoundButton compoundButton = this.f1372a;
        TypedArray typedArrayObtainStyledAttributes = compoundButton.getContext().obtainStyledAttributes(attributeSet, u.a.f905l, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(v.a.a(compoundButton.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                compoundButton.setButtonTintList(typedArrayObtainStyledAttributes.getColorStateList(1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                compoundButton.setButtonTintMode(T.b(typedArrayObtainStyledAttributes.getInt(2, -1), null));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
