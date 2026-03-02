package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0021f0 implements x.F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Method f1283A;
    public static final Method B;
    public static final Method C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f1285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f1286d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1290h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1293l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s.d f1296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f1297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1298q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f1302v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rect f1304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final A f1306z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1287e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1288f = -2;
    public final int i = 1002;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1294m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1295n = Integer.MAX_VALUE;
    public final RunnableC0015c0 r = new RunnableC0015c0(this, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ViewOnTouchListenerC0019e0 f1299s = new ViewOnTouchListenerC0019e0(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0017d0 f1300t = new C0017d0(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RunnableC0015c0 f1301u = new RunnableC0015c0(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f1303w = new Rect();

    static {
        Class cls = Boolean.TYPE;
        try {
            f1283A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public AbstractC0021f0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f1284b = context;
        this.f1302v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f908o, i, 0);
        this.f1289g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1290h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1291j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        A a2 = new A(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, u.a.f911s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            a2.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        a2.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : v.a.a(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f1306z = a2;
        a2.setInputMethodMode(1);
    }

    public V a(Context context, boolean z2) {
        return new V(context, z2);
    }

    @Override // x.F
    public void c() {
        int i;
        int iIntValue;
        int paddingBottom;
        V v2;
        V v3 = this.f1286d;
        Context context = this.f1284b;
        A a2 = this.f1306z;
        if (v3 == null) {
            V vA = a(context, !this.f1305y);
            this.f1286d = vA;
            vA.setAdapter(this.f1285c);
            this.f1286d.setOnItemClickListener(this.f1298q);
            this.f1286d.setFocusable(true);
            this.f1286d.setFocusableInTouchMode(true);
            this.f1286d.setOnItemSelectedListener(new C0013b0(0, this));
            this.f1286d.setOnScrollListener(this.f1300t);
            a2.setContentView(this.f1286d);
        }
        Drawable background = a2.getBackground();
        Rect rect = this.f1303w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f1291j) {
                this.f1290h = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z2 = a2.getInputMethodMode() == 2;
        View view = this.f1297p;
        int i3 = this.f1290h;
        Method method = B;
        if (method != null) {
            try {
                iIntValue = ((Integer) method.invoke(a2, view, Integer.valueOf(i3), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                iIntValue = a2.getMaxAvailableHeight(view, i3);
            }
        } else {
            iIntValue = a2.getMaxAvailableHeight(view, i3);
        }
        int i4 = this.f1287e;
        if (i4 == -1) {
            paddingBottom = iIntValue + i;
        } else {
            int i5 = this.f1288f;
            int iA = this.f1286d.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iIntValue);
            paddingBottom = iA + (iA > 0 ? this.f1286d.getPaddingBottom() + this.f1286d.getPaddingTop() + i : 0);
        }
        boolean z3 = this.f1306z.getInputMethodMode() == 2;
        a2.setWindowLayoutType(this.i);
        if (a2.isShowing()) {
            View view2 = this.f1297p;
            WeakHashMap weakHashMap = q.l.f728a;
            if (view2.isAttachedToWindow()) {
                int width = this.f1288f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1297p.getWidth();
                }
                if (i4 == -1) {
                    i4 = z3 ? paddingBottom : -1;
                    if (z3) {
                        a2.setWidth(this.f1288f == -1 ? -1 : 0);
                        a2.setHeight(0);
                    } else {
                        a2.setWidth(this.f1288f == -1 ? -1 : 0);
                        a2.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                a2.setOutsideTouchable(true);
                View view3 = this.f1297p;
                int i6 = width;
                int i7 = this.f1289g;
                int i8 = this.f1290h;
                int i9 = i6 < 0 ? -1 : i6;
                if (i4 < 0) {
                    i4 = -1;
                }
                a2.update(view3, i7, i8, i9, i4);
                return;
            }
            return;
        }
        int width2 = this.f1288f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1297p.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        a2.setWidth(width2);
        a2.setHeight(i4);
        Method method2 = f1283A;
        if (method2 != null) {
            try {
                method2.invoke(a2, Boolean.TRUE);
            } catch (Exception unused2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        a2.setOutsideTouchable(true);
        a2.setTouchInterceptor(this.f1299s);
        if (this.f1293l) {
            a2.setOverlapAnchor(this.f1292k);
        }
        Method method3 = C;
        if (method3 != null) {
            try {
                method3.invoke(a2, this.f1304x);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        a2.showAsDropDown(this.f1297p, this.f1289g, this.f1290h, this.f1294m);
        this.f1286d.setSelection(-1);
        if ((!this.f1305y || this.f1286d.isInTouchMode()) && (v2 = this.f1286d) != null) {
            v2.setListSelectionHidden(true);
            v2.requestLayout();
        }
        if (this.f1305y) {
            return;
        }
        this.f1302v.post(this.f1301u);
    }

    public void d(ListAdapter listAdapter) {
        s.d dVar = this.f1296o;
        if (dVar == null) {
            this.f1296o = new s.d(1, this);
        } else {
            ListAdapter listAdapter2 = this.f1285c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1285c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1296o);
        }
        V v2 = this.f1286d;
        if (v2 != null) {
            v2.setAdapter(this.f1285c);
        }
    }

    @Override // x.F
    public final void dismiss() {
        A a2 = this.f1306z;
        a2.dismiss();
        a2.setContentView(null);
        this.f1286d = null;
        this.f1302v.removeCallbacks(this.r);
    }

    public final void f(int i) {
        Drawable background = this.f1306z.getBackground();
        if (background == null) {
            this.f1288f = i;
            return;
        }
        Rect rect = this.f1303w;
        background.getPadding(rect);
        this.f1288f = rect.left + rect.right + i;
    }

    @Override // x.F
    public final boolean i() {
        return this.f1306z.isShowing();
    }

    @Override // x.F
    public final V j() {
        return this.f1286d;
    }
}
