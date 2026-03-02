package y;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1360a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f1363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f1364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f1365f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1362c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0043v f1361b = C0043v.e();

    public C0038p(View view) {
        this.f1360a = view;
    }

    public final void a() {
        View view = this.f1360a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f1363d != null) {
                if (this.f1365f == null) {
                    this.f1365f = new z0();
                }
                z0 z0Var = this.f1365f;
                z0Var.f1435a = null;
                z0Var.f1438d = false;
                z0Var.f1436b = null;
                z0Var.f1437c = false;
                WeakHashMap weakHashMap = q.l.f728a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    z0Var.f1438d = true;
                    z0Var.f1435a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    z0Var.f1437c = true;
                    z0Var.f1436b = backgroundTintMode;
                }
                if (z0Var.f1438d || z0Var.f1437c) {
                    C0043v.l(background, z0Var, view.getDrawableState());
                    return;
                }
            }
            z0 z0Var2 = this.f1364e;
            if (z0Var2 != null) {
                C0043v.l(background, z0Var2, view.getDrawableState());
                return;
            }
            z0 z0Var3 = this.f1363d;
            if (z0Var3 != null) {
                C0043v.l(background, z0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        z0 z0Var = this.f1364e;
        if (z0Var != null) {
            return z0Var.f1435a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        z0 z0Var = this.f1364e;
        if (z0Var != null) {
            return z0Var.f1436b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        View view = this.f1360a;
        e.c cVarG = e.c.g(view.getContext(), attributeSet, u.a.f918z, i);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        try {
            if (typedArray.hasValue(0)) {
                this.f1362c = typedArray.getResourceId(0, -1);
                ColorStateList colorStateListI = this.f1361b.i(view.getContext(), this.f1362c);
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListA = cVarG.a(1);
                WeakHashMap weakHashMap = q.l.f728a;
                view.setBackgroundTintList(colorStateListA);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeB = T.b(typedArray.getInt(2, -1), null);
                WeakHashMap weakHashMap2 = q.l.f728a;
                view.setBackgroundTintMode(modeB);
            }
            cVarG.h();
        } catch (Throwable th) {
            cVarG.h();
            throw th;
        }
    }

    public final void e() {
        this.f1362c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        this.f1362c = i;
        C0043v c0043v = this.f1361b;
        g(c0043v != null ? c0043v.i(this.f1360a.getContext(), i) : null);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1363d == null) {
                this.f1363d = new z0();
            }
            z0 z0Var = this.f1363d;
            z0Var.f1435a = colorStateList;
            z0Var.f1438d = true;
        } else {
            this.f1363d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1364e == null) {
            this.f1364e = new z0();
        }
        z0 z0Var = this.f1364e;
        z0Var.f1435a = colorStateList;
        z0Var.f1438d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1364e == null) {
            this.f1364e = new z0();
        }
        z0 z0Var = this.f1364e;
        z0Var.f1436b = mode;
        z0Var.f1437c = true;
        a();
    }
}
