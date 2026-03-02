package c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.a f323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f326h;

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f322d
            if (r6 == 0) goto La6
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto La6
        Lc:
            if (r0 != 0) goto L10
            goto La6
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof android.support.constraint.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            android.support.constraint.ConstraintLayout r1 = (android.support.constraint.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof android.support.constraint.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            android.support.constraint.ConstraintLayout r1 = (android.support.constraint.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5a
            if (r1 == 0) goto L5a
            if (r6 == 0) goto L4e
            java.util.HashMap r3 = r1.f58n
            if (r3 == 0) goto L4e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4e
            java.util.HashMap r3 = r1.f58n
            java.lang.Object r3 = r3.get(r6)
            goto L4f
        L4e:
            r3 = r2
        L4f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 != 0) goto L63
            if (r1 == 0) goto L63
            int r3 = r5.d(r1, r6)
        L63:
            if (r3 != 0) goto L6f
            java.lang.Class<c.s> r1 = c.s.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6f
        L6f:
            if (r3 != 0) goto L7f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7f:
            if (r3 == 0) goto L8e
            java.util.HashMap r0 = r5.f326h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto La6
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f321c + 1;
        int[] iArr = this.f320b;
        if (i2 > iArr.length) {
            this.f320b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f320b;
        int i3 = this.f321c;
        iArr2[i3] = i;
        this.f321c = i3 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f322d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof f) && strTrim.equals(((f) layoutParams).U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f322d.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void e() {
        if (this.f323e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof f) {
            ((f) layoutParams).k0 = this.f323e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f320b, this.f321c);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f324f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f325g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f324f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f321c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f325g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f321c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f324f = null;
        this.f321c = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f324f == null) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
