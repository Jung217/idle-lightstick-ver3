package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f1205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f1206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f1207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f1208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f1209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f1210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O f1211h;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Typeface f1212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1213k;

    public M(TextView textView) {
        this.f1204a = textView;
        this.f1211h = new O(textView);
    }

    public static z0 c(Context context, C0043v c0043v, int i) {
        ColorStateList colorStateListI = c0043v.i(context, i);
        if (colorStateListI == null) {
            return null;
        }
        z0 z0Var = new z0();
        z0Var.f1438d = true;
        z0Var.f1435a = colorStateListI;
        return z0Var;
    }

    public final void a(Drawable drawable, z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        C0043v.l(drawable, z0Var, this.f1204a.getDrawableState());
    }

    public final void b() {
        z0 z0Var = this.f1205b;
        TextView textView = this.f1204a;
        if (z0Var != null || this.f1206c != null || this.f1207d != null || this.f1208e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1205b);
            a(compoundDrawables[1], this.f1206c);
            a(compoundDrawables[2], this.f1207d);
            a(compoundDrawables[3], this.f1208e);
        }
        if (this.f1209f == null && this.f1210g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1209f);
        a(compoundDrawablesRelative[2], this.f1210g);
    }

    public final void d(AttributeSet attributeSet, int i) {
        boolean z2;
        boolean z3;
        float f2;
        int i2;
        int resourceId;
        TextView textView = this.f1204a;
        Context context = textView.getContext();
        C0043v c0043vE = C0043v.e();
        e.c cVarG = e.c.g(context, attributeSet, u.a.f902h, i);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1205b = c(context, c0043vE, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1206c = c(context, c0043vE, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1207d = c(context, c0043vE, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1208e = c(context, c0043vE, typedArray.getResourceId(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f1209f = c(context, c0043vE, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1210g = c(context, c0043vE, typedArray.getResourceId(6, 0));
        }
        cVarG.h();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = u.a.f915w;
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr);
            e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(12)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(12, false);
                z3 = true;
            }
            i(context, cVar);
            cVar.h();
        } else {
            z2 = false;
            z3 = false;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        e.c cVar2 = new e.c(context, typedArrayObtainStyledAttributes2);
        if (!z4 && typedArrayObtainStyledAttributes2.hasValue(12)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(12, false);
            z3 = true;
        }
        if (i3 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, cVar2);
        cVar2.h();
        if (!z4 && z3) {
            textView.setAllCaps(z2);
        }
        Typeface typeface = this.f1212j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.i);
        }
        O o2 = this.f1211h;
        Context context2 = o2.f1228j;
        int[] iArr2 = u.a.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            o2.f1220a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            f2 = -1.0f;
        } else {
            f2 = -1.0f;
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr3[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                o2.f1225f = O.b(iArr3);
                o2.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!o2.j()) {
            o2.f1220a = 0;
        } else if (o2.f1220a == 1) {
            if (!o2.f1226g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f2) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == f2) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == f2) {
                    dimension = 1.0f;
                }
                o2.k(dimension2, dimension3, dimension);
            }
            o2.h();
        }
        if (s.b.f743a && o2.f1220a != 0) {
            int[] iArr4 = o2.f1225f;
            if (iArr4.length > 0) {
                if (textView.getAutoSizeStepGranularity() != f2) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(o2.f1223d), Math.round(o2.f1224e), Math.round(o2.f1222c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(6, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(8, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(9, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            android.arch.lifecycle.f.s(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            android.arch.lifecycle.f.t(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public final void e(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, u.a.f915w);
        e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        TextView textView = this.f1204a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(12, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, cVar);
        cVar.h();
        Typeface typeface = this.f1212j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.i);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        O o2 = this.f1211h;
        if (o2.j()) {
            DisplayMetrics displayMetrics = o2.f1228j.getResources().getDisplayMetrics();
            o2.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (o2.h()) {
                o2.a();
            }
        }
    }

    public final void g(int[] iArr, int i) {
        O o2 = this.f1211h;
        if (o2.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o2.f1228j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                o2.f1225f = O.b(iArrCopyOf);
                if (!o2.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                o2.f1226g = false;
            }
            if (o2.h()) {
                o2.a();
            }
        }
    }

    public final void h(int i) {
        O o2 = this.f1211h;
        if (o2.j()) {
            if (i == 0) {
                o2.f1220a = 0;
                o2.f1223d = -1.0f;
                o2.f1224e = -1.0f;
                o2.f1222c = -1.0f;
                o2.f1225f = new int[0];
                o2.f1221b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = o2.f1228j.getResources().getDisplayMetrics();
            o2.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o2.h()) {
                o2.a();
            }
        }
    }

    public final void i(Context context, e.c cVar) {
        String string;
        int i = this.i;
        TypedArray typedArray = (TypedArray) cVar.f474b;
        this.i = typedArray.getInt(2, i);
        if (typedArray.hasValue(10) || typedArray.hasValue(11)) {
            this.f1212j = null;
            int i2 = typedArray.hasValue(11) ? 11 : 10;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceD = cVar.d(i2, this.i, new B(this, new WeakReference(this.f1204a)));
                    this.f1212j = typefaceD;
                    this.f1213k = typefaceD == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1212j != null || (string = typedArray.getString(i2)) == null) {
                return;
            }
            this.f1212j = Typeface.create(string, this.i);
            return;
        }
        if (typedArray.hasValue(1)) {
            this.f1213k = false;
            int i3 = typedArray.getInt(1, 1);
            if (i3 == 1) {
                this.f1212j = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f1212j = Typeface.SERIF;
            } else {
                if (i3 != 3) {
                    return;
                }
                this.f1212j = Typeface.MONOSPACE;
            }
        }
    }
}
