package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import c.f;
import c.g;
import c.j;
import c.p;
import c.q;
import c.r;
import c.t;
import e.c;
import e.d;
import f.e;
import g.b;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f47b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f48c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f49d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f55k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f56l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f57m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f58n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f59o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f60p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f61q;
    public int r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f47b = sparseArray;
        this.f48c = new ArrayList(4);
        e eVar = new e();
        eVar.j0 = new ArrayList();
        c cVar = new c();
        cVar.f473a = new ArrayList();
        cVar.f474b = new b();
        cVar.f475c = eVar;
        eVar.k0 = cVar;
        g.e eVar2 = new g.e();
        eVar2.f573b = true;
        eVar2.f574c = true;
        eVar2.f576e = new ArrayList();
        new ArrayList();
        eVar2.f577f = null;
        eVar2.f578g = new b();
        eVar2.f579h = new ArrayList();
        eVar2.f572a = eVar;
        eVar2.f575d = eVar;
        eVar.l0 = eVar2;
        eVar.m0 = null;
        eVar.n0 = false;
        eVar.o0 = new d();
        eVar.r0 = 0;
        eVar.s0 = 0;
        eVar.t0 = new f.b[4];
        eVar.u0 = new f.b[4];
        eVar.v0 = 257;
        eVar.w0 = false;
        eVar.x0 = false;
        eVar.y0 = null;
        eVar.z0 = null;
        eVar.A0 = null;
        eVar.B0 = null;
        eVar.C0 = new b();
        this.f49d = eVar;
        this.f50e = 0;
        this.f51f = 0;
        this.f52g = Integer.MAX_VALUE;
        this.f53h = Integer.MAX_VALUE;
        this.i = true;
        this.f54j = 257;
        this.f55k = null;
        this.f56l = null;
        this.f57m = -1;
        this.f58n = new HashMap();
        this.f59o = new SparseArray();
        g gVar = new g(this, this);
        this.f60p = gVar;
        this.f61q = 0;
        this.r = 0;
        eVar.Y = this;
        eVar.m0 = gVar;
        eVar2.f577f = gVar;
        sparseArray.put(getId(), this);
        this.f55k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f429b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f50e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f50e);
                } else if (index == 10) {
                    this.f51f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f51f);
                } else if (index == 7) {
                    this.f52g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f52g);
                } else if (index == 8) {
                    this.f53h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53h);
                } else if (index == 90) {
                    this.f54j = typedArrayObtainStyledAttributes.getInt(index, this.f54j);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            c(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f56l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.f55k = pVar;
                        pVar.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f55k = null;
                    }
                    this.f57m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.v0 = this.f54j;
        d.f476p = eVar.M(512);
    }

    public static f a() {
        f fVar = new f(-2, -2);
        fVar.f329a = -1;
        fVar.f330b = -1;
        fVar.f331c = -1.0f;
        fVar.f332d = -1;
        fVar.f333e = -1;
        fVar.f334f = -1;
        fVar.f335g = -1;
        fVar.f336h = -1;
        fVar.i = -1;
        fVar.f337j = -1;
        fVar.f338k = -1;
        fVar.f339l = -1;
        fVar.f340m = -1;
        fVar.f341n = 0;
        fVar.f342o = 0.0f;
        fVar.f343p = -1;
        fVar.f344q = -1;
        fVar.r = -1;
        fVar.f345s = -1;
        fVar.f346t = -1;
        fVar.f347u = -1;
        fVar.f348v = -1;
        fVar.f349w = -1;
        fVar.f350x = -1;
        fVar.f351y = -1;
        fVar.f352z = 0.5f;
        fVar.f328A = 0.5f;
        fVar.B = null;
        fVar.C = 1;
        fVar.D = -1.0f;
        fVar.E = -1.0f;
        fVar.F = 0;
        fVar.G = 0;
        fVar.H = 0;
        fVar.I = 0;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 1.0f;
        fVar.O = 1.0f;
        fVar.P = -1;
        fVar.Q = -1;
        fVar.R = -1;
        fVar.S = false;
        fVar.T = false;
        fVar.U = null;
        fVar.V = true;
        fVar.W = true;
        fVar.X = false;
        fVar.Y = false;
        fVar.Z = false;
        fVar.a0 = -1;
        fVar.b0 = -1;
        fVar.c0 = -1;
        fVar.d0 = -1;
        fVar.e0 = -1;
        fVar.f0 = -1;
        fVar.g0 = 0.5f;
        fVar.k0 = new f.d();
        return fVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final f.d b(View view) {
        if (view == this) {
            return this.f49d;
        }
        if (view == null) {
            return null;
        }
        return ((f) view.getLayoutParams()).k0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.c(int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public final void d(int i, int i2, int i3, int i4, boolean z2, boolean z3) {
        g gVar = this.f60p;
        int i5 = gVar.f357e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + gVar.f356d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f52g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f53h, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f48c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((c.d) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0471  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(f.e r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.e(f.e, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f329a = -1;
        fVar.f330b = -1;
        fVar.f331c = -1.0f;
        fVar.f332d = -1;
        fVar.f333e = -1;
        fVar.f334f = -1;
        fVar.f335g = -1;
        fVar.f336h = -1;
        fVar.i = -1;
        fVar.f337j = -1;
        fVar.f338k = -1;
        fVar.f339l = -1;
        fVar.f340m = -1;
        fVar.f341n = 0;
        fVar.f342o = 0.0f;
        fVar.f343p = -1;
        fVar.f344q = -1;
        fVar.r = -1;
        fVar.f345s = -1;
        fVar.f346t = -1;
        fVar.f347u = -1;
        fVar.f348v = -1;
        fVar.f349w = -1;
        fVar.f350x = -1;
        fVar.f351y = -1;
        fVar.f352z = 0.5f;
        fVar.f328A = 0.5f;
        fVar.B = null;
        fVar.C = 1;
        fVar.D = -1.0f;
        fVar.E = -1.0f;
        fVar.F = 0;
        fVar.G = 0;
        fVar.H = 0;
        fVar.I = 0;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 1.0f;
        fVar.O = 1.0f;
        fVar.P = -1;
        fVar.Q = -1;
        fVar.R = -1;
        fVar.S = false;
        fVar.T = false;
        fVar.U = null;
        fVar.V = true;
        fVar.W = true;
        fVar.X = false;
        fVar.Y = false;
        fVar.Z = false;
        fVar.a0 = -1;
        fVar.b0 = -1;
        fVar.c0 = -1;
        fVar.d0 = -1;
        fVar.e0 = -1;
        fVar.f0 = -1;
        fVar.g0 = 0.5f;
        fVar.k0 = new f.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f429b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = c.e.f327a.get(index);
            switch (i3) {
                case 1:
                    fVar.R = typedArrayObtainStyledAttributes.getInt(index, fVar.R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f340m);
                    fVar.f340m = resourceId;
                    if (resourceId == -1) {
                        fVar.f340m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    fVar.f341n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f341n);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, fVar.f342o) % 360.0f;
                    fVar.f342o = f2;
                    if (f2 < 0.0f) {
                        fVar.f342o = (360.0f - f2) % 360.0f;
                    }
                    break;
                case 5:
                    fVar.f329a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.f329a);
                    break;
                case 6:
                    fVar.f330b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.f330b);
                    break;
                case 7:
                    fVar.f331c = typedArrayObtainStyledAttributes.getFloat(index, fVar.f331c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f332d);
                    fVar.f332d = resourceId2;
                    if (resourceId2 == -1) {
                        fVar.f332d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f333e);
                    fVar.f333e = resourceId3;
                    if (resourceId3 == -1) {
                        fVar.f333e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f334f);
                    fVar.f334f = resourceId4;
                    if (resourceId4 == -1) {
                        fVar.f334f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f335g);
                    fVar.f335g = resourceId5;
                    if (resourceId5 == -1) {
                        fVar.f335g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f336h);
                    fVar.f336h = resourceId6;
                    if (resourceId6 == -1) {
                        fVar.f336h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.i);
                    fVar.i = resourceId7;
                    if (resourceId7 == -1) {
                        fVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f337j);
                    fVar.f337j = resourceId8;
                    if (resourceId8 == -1) {
                        fVar.f337j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f338k);
                    fVar.f338k = resourceId9;
                    if (resourceId9 == -1) {
                        fVar.f338k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f339l);
                    fVar.f339l = resourceId10;
                    if (resourceId10 == -1) {
                        fVar.f339l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f343p);
                    fVar.f343p = resourceId11;
                    if (resourceId11 == -1) {
                        fVar.f343p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f344q);
                    fVar.f344q = resourceId12;
                    if (resourceId12 == -1) {
                        fVar.f344q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.r);
                    fVar.r = resourceId13;
                    if (resourceId13 == -1) {
                        fVar.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, fVar.f345s);
                    fVar.f345s = resourceId14;
                    if (resourceId14 == -1) {
                        fVar.f345s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    fVar.f346t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f346t);
                    break;
                case 22:
                    fVar.f347u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f347u);
                    break;
                case 23:
                    fVar.f348v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f348v);
                    break;
                case 24:
                    fVar.f349w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f349w);
                    break;
                case 25:
                    fVar.f350x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f350x);
                    break;
                case 26:
                    fVar.f351y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.f351y);
                    break;
                case 27:
                    fVar.S = typedArrayObtainStyledAttributes.getBoolean(index, fVar.S);
                    break;
                case 28:
                    fVar.T = typedArrayObtainStyledAttributes.getBoolean(index, fVar.T);
                    break;
                case 29:
                    fVar.f352z = typedArrayObtainStyledAttributes.getFloat(index, fVar.f352z);
                    break;
                case 30:
                    fVar.f328A = typedArrayObtainStyledAttributes.getFloat(index, fVar.f328A);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fVar.H = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fVar.I = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        fVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.J) == -2) {
                            fVar.J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        fVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.L) == -2) {
                            fVar.L = -2;
                        }
                    }
                    break;
                case 35:
                    fVar.N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fVar.N));
                    fVar.H = 2;
                    break;
                case 36:
                    try {
                        fVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.K) == -2) {
                            fVar.K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        fVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fVar.M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fVar.M) == -2) {
                            fVar.M = -2;
                        }
                    }
                    break;
                case 38:
                    fVar.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fVar.O));
                    fVar.I = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            fVar.B = string;
                            fVar.C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = fVar.B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = fVar.B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        fVar.C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        fVar.C = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = fVar.B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = fVar.B.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = fVar.B.substring(i, iIndexOf2);
                                    String strSubstring4 = fVar.B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f3 = Float.parseFloat(strSubstring3);
                                            float f4 = Float.parseFloat(strSubstring4);
                                            if (f3 > 0.0f && f4 > 0.0f) {
                                                if (fVar.C == 1) {
                                                    Math.abs(f4 / f3);
                                                } else {
                                                    Math.abs(f3 / f4);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            fVar.D = typedArrayObtainStyledAttributes.getFloat(index, fVar.D);
                            break;
                        case 46:
                            fVar.E = typedArrayObtainStyledAttributes.getFloat(index, fVar.E);
                            break;
                        case 47:
                            fVar.F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            fVar.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            fVar.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.P);
                            break;
                        case 50:
                            fVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fVar.Q);
                            break;
                        case 51:
                            fVar.U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        fVar.a();
        return fVar;
    }

    public int getMaxHeight() {
        return this.f53h;
    }

    public int getMaxWidth() {
        return this.f52g;
    }

    public int getMinHeight() {
        return this.f51f;
    }

    public int getMinWidth() {
        return this.f50e;
    }

    public int getOptimizationLevel() {
        return this.f49d.v0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            f.d dVar = fVar.k0;
            if (childAt.getVisibility() != 8 || fVar.Y || fVar.Z || zIsInEditMode) {
                int iM = dVar.m();
                int iN = dVar.n();
                childAt.layout(iM, iN, dVar.l() + iM, dVar.i() + iN);
            }
        }
        ArrayList arrayList = this.f48c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((c.d) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x095f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 2566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        f.d dVarB = b(view);
        if ((view instanceof r) && !(dVarB instanceof f.f)) {
            f fVar = (f) view.getLayoutParams();
            f.f fVar2 = new f.f();
            fVar.k0 = fVar2;
            fVar.Y = true;
            fVar2.H(fVar.R);
        }
        if (view instanceof c.d) {
            c.d dVar = (c.d) view;
            dVar.e();
            ((f) view.getLayoutParams()).Z = true;
            ArrayList arrayList = this.f48c;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
        }
        this.f47b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f47b.remove(view.getId());
        f.d dVarB = b(view);
        this.f49d.j0.remove(dVarB);
        dVarB.w();
        this.f48c.remove(view);
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void setConstraintSet(p pVar) {
        this.f55k = pVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f47b;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f53h) {
            return;
        }
        this.f53h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f52g) {
            return;
        }
        this.f52g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f51f) {
            return;
        }
        this.f51f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f50e) {
            return;
        }
        this.f50e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        j jVar = this.f56l;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f54j = i;
        e eVar = this.f49d;
        eVar.v0 = i;
        d.f476p = eVar.M(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(layoutParams);
        fVar.f329a = -1;
        fVar.f330b = -1;
        fVar.f331c = -1.0f;
        fVar.f332d = -1;
        fVar.f333e = -1;
        fVar.f334f = -1;
        fVar.f335g = -1;
        fVar.f336h = -1;
        fVar.i = -1;
        fVar.f337j = -1;
        fVar.f338k = -1;
        fVar.f339l = -1;
        fVar.f340m = -1;
        fVar.f341n = 0;
        fVar.f342o = 0.0f;
        fVar.f343p = -1;
        fVar.f344q = -1;
        fVar.r = -1;
        fVar.f345s = -1;
        fVar.f346t = -1;
        fVar.f347u = -1;
        fVar.f348v = -1;
        fVar.f349w = -1;
        fVar.f350x = -1;
        fVar.f351y = -1;
        fVar.f352z = 0.5f;
        fVar.f328A = 0.5f;
        fVar.B = null;
        fVar.C = 1;
        fVar.D = -1.0f;
        fVar.E = -1.0f;
        fVar.F = 0;
        fVar.G = 0;
        fVar.H = 0;
        fVar.I = 0;
        fVar.J = 0;
        fVar.K = 0;
        fVar.L = 0;
        fVar.M = 0;
        fVar.N = 1.0f;
        fVar.O = 1.0f;
        fVar.P = -1;
        fVar.Q = -1;
        fVar.R = -1;
        fVar.S = false;
        fVar.T = false;
        fVar.U = null;
        fVar.V = true;
        fVar.W = true;
        fVar.X = false;
        fVar.Y = false;
        fVar.Z = false;
        fVar.a0 = -1;
        fVar.b0 = -1;
        fVar.c0 = -1;
        fVar.d0 = -1;
        fVar.e0 = -1;
        fVar.f0 = -1;
        fVar.g0 = 0.5f;
        fVar.k0 = new f.d();
        return fVar;
    }
}
