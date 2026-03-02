package t;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.C;
import y.C0022g;
import y.C0030k;
import y.C0037o;
import y.C0039q;
import y.C0040s;
import y.C0043v;
import y.C0044w;
import y.C0045x;
import y.C0046y;
import y.C0047z;
import y.D;
import y.E;
import y.G0;
import y.K0;
import y.L;
import y.M0;
import y.N;
import y.Q;

/* JADX INFO: loaded from: classes.dex */
public final class n implements x.n, LayoutInflater.Factory2 {
    public static final int[] Q = {R.attr.windowBackground};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f838A;
    public boolean B;
    public m[] C;
    public m D;
    public boolean E;
    public boolean F;
    public boolean H;
    public q.g I;
    public boolean J;
    public int K;
    public boolean M;
    public Rect N;
    public Rect O;
    public AppCompatViewInflater P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window.Callback f841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w.h f844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f845h;
    public Q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w.a f848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ActionBarContextView f849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow f850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f851o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f853q;
    public ViewGroup r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f855t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f860y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f861z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q.p f852p = null;
    public int G = -100;
    public final h L = new h(this, 0);

    public n(Context context, Window window, g gVar) {
        int resourceId;
        Drawable drawableG = null;
        this.f839b = context;
        this.f840c = window;
        this.f842e = gVar;
        Window.Callback callback = window.getCallback();
        this.f841d = callback;
        if (callback instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        window.setCallback(new k(this, callback));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, Q);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawableG = C0043v.e().g(context, resourceId, true);
        }
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.a():boolean");
    }

    public final void b(int i, m mVar, x.p pVar) {
        if (pVar == null) {
            if (mVar == null && i >= 0) {
                m[] mVarArr = this.C;
                if (i < mVarArr.length) {
                    mVar = mVarArr[i];
                }
            }
            if (mVar != null) {
                pVar = mVar.f830h;
            }
        }
        if ((mVar == null || mVar.f834m) && !this.F) {
            this.f841d.onPanelClosed(i, pVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // x.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x.p r6) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.c(x.p):void");
    }

    @Override // x.n
    public final boolean d(x.p pVar, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f840c.getCallback();
        if (callback != null && !this.F) {
            x.p pVarK = pVar.k();
            m[] mVarArr = this.C;
            int length = mVarArr != null ? mVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    mVar = mVarArr[i];
                    if (mVar != null && mVar.f830h == pVarK) {
                        break;
                    }
                    i++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f823a, menuItem);
            }
        }
        return false;
    }

    public final void e(x.p pVar) {
        C0030k c0030k;
        if (this.B) {
            return;
        }
        this.B = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.i;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f226f).f1156a.f279b;
        if (actionMenuView != null && (c0030k = actionMenuView.f248u) != null) {
            c0030k.i();
            C0022g c0022g = c0030k.f1342v;
            if (c0022g != null && c0022g.b()) {
                c0022g.i.dismiss();
            }
        }
        Window.Callback callback = this.f840c.getCallback();
        if (callback != null && !this.F) {
            callback.onPanelClosed(108, pVar);
        }
        this.B = false;
    }

    public final void f(m mVar, boolean z2) {
        l lVar;
        Q q2;
        C0030k c0030k;
        if (z2 && mVar.f823a == 0 && (q2 = this.i) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q2;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f226f).f1156a.f279b;
            if (actionMenuView != null && (c0030k = actionMenuView.f248u) != null && c0030k.j()) {
                e(mVar.f830h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f839b.getSystemService("window");
        if (windowManager != null && mVar.f834m && (lVar = mVar.f827e) != null) {
            windowManager.removeView(lVar);
            if (z2) {
                b(mVar.f823a, mVar, null);
            }
        }
        mVar.f832k = false;
        mVar.f833l = false;
        mVar.f834m = false;
        mVar.f828f = null;
        mVar.f835n = true;
        if (this.D == mVar) {
            this.D = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.g(android.view.KeyEvent):boolean");
    }

    public final void h(int i) {
        m mVarK = k(i);
        if (mVarK.f830h != null) {
            Bundle bundle = new Bundle();
            mVarK.f830h.t(bundle);
            if (bundle.size() > 0) {
                mVarK.f837p = bundle;
            }
            mVarK.f830h.w();
            mVarK.f830h.clear();
        }
        mVarK.f836o = true;
        mVarK.f835n = true;
        if ((i == 108 || i == 0) && this.i != null) {
            m mVarK2 = k(0);
            mVarK2.f832k = false;
            r(mVarK2, null);
        }
    }

    public final void i() {
        if (this.I == null) {
            if (e.c.f472d == null) {
                Context applicationContext = this.f839b.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                e.c cVar = new e.c();
                cVar.f475c = new r();
                cVar.f473a = applicationContext;
                cVar.f474b = locationManager;
                e.c.f472d = cVar;
            }
            e.c cVar2 = e.c.f472d;
            q.g gVar = new q.g();
            gVar.f721e = this;
            gVar.f718b = cVar2;
            gVar.f717a = cVar2.e();
            this.I = gVar;
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        if (this.f853q) {
            return;
        }
        Context context = this.f839b;
        int[] iArr = u.a.f903j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(111)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(120, false)) {
            s(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(111, false)) {
            s(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(112, false)) {
            s(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(113, false)) {
            s(10);
        }
        this.f861z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        Window window = this.f840c;
        window.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f838A) {
            viewGroup = this.f860y ? (ViewGroup) layoutInflaterFrom.inflate(com.studiothinkers.lightstick.idlev3.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.studiothinkers.lightstick.idlev3.R.layout.abc_screen_simple, (ViewGroup) null);
            i iVar = new i(this, i);
            WeakHashMap weakHashMap = q.l.f728a;
            viewGroup.setOnApplyWindowInsetsListener(new q.j(iVar));
        } else if (this.f861z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.studiothinkers.lightstick.idlev3.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f859x = false;
            this.f858w = false;
        } else if (this.f858w) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.studiothinkers.lightstick.idlev3.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new w.c(context, typedValue.resourceId) : context).inflate(com.studiothinkers.lightstick.idlev3.R.layout.abc_screen_toolbar, (ViewGroup) null);
            Q q2 = (Q) viewGroup.findViewById(com.studiothinkers.lightstick.idlev3.R.id.decor_content_parent);
            this.i = q2;
            q2.setWindowCallback(window.getCallback());
            if (this.f859x) {
                ((ActionBarOverlayLayout) this.i).d(109);
            }
            if (this.f856u) {
                ((ActionBarOverlayLayout) this.i).d(2);
            }
            if (this.f857v) {
                ((ActionBarOverlayLayout) this.i).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f858w + ", windowActionBarOverlay: " + this.f859x + ", android:windowIsFloating: " + this.f861z + ", windowActionModeOverlay: " + this.f860y + ", windowNoTitle: " + this.f838A + " }");
        }
        if (this.i == null) {
            this.f854s = (TextView) viewGroup.findViewById(com.studiothinkers.lightstick.idlev3.R.id.title);
        }
        Method method = M0.f1214a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.studiothinkers.lightstick.idlev3.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) window.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        window.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new i(this, i2));
        this.r = viewGroup;
        Window.Callback callback = this.f841d;
        CharSequence title = callback instanceof Activity ? ((Activity) callback).getTitle() : this.f845h;
        if (!TextUtils.isEmpty(title)) {
            Q q3 = this.i;
            if (q3 != null) {
                q3.setWindowTitle(title);
            } else {
                u uVar = this.f843f;
                if (uVar != null) {
                    G0 g0 = (G0) uVar.f885q;
                    if (!g0.f1162g) {
                        g0.f1163h = title;
                        if ((g0.f1157b & 8) != 0) {
                            g0.f1156a.setTitle(title);
                        }
                    }
                } else {
                    TextView textView = this.f854s;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.r.findViewById(R.id.content);
        View decorView = window.getDecorView();
        contentFrameLayout2.f263h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = q.l.f728a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(118, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(119, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(116)) {
            typedArrayObtainStyledAttributes2.getValue(116, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(117)) {
            typedArrayObtainStyledAttributes2.getValue(117, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(114)) {
            typedArrayObtainStyledAttributes2.getValue(114, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(115)) {
            typedArrayObtainStyledAttributes2.getValue(115, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f853q = true;
        m mVarK = k(0);
        if (this.F || mVarK.f830h != null) {
            return;
        }
        n(108);
    }

    public final m k(int i) {
        m[] mVarArr = this.C;
        if (mVarArr == null || mVarArr.length <= i) {
            m[] mVarArr2 = new m[i + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.C = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f823a = i;
        mVar2.f835n = false;
        mVarArr[i] = mVar2;
        return mVar2;
    }

    public final void l() {
        j();
        if (this.f858w && this.f843f == null) {
            Window.Callback callback = this.f841d;
            if (callback instanceof Activity) {
                this.f843f = new u((Activity) callback, this.f859x);
            } else if (callback instanceof Dialog) {
                this.f843f = new u((Dialog) callback);
            }
            u uVar = this.f843f;
            if (uVar != null) {
                uVar.A(this.M);
            }
        }
    }

    public final void m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f839b);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof n) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void n(int i) {
        this.K = (1 << i) | this.K;
        if (this.J) {
            return;
        }
        View decorView = this.f840c.getDecorView();
        WeakHashMap weakHashMap = q.l.f728a;
        decorView.postOnAnimation(this.L);
        this.J = true;
    }

    public final void o(Bundle bundle) {
        String strC;
        Window.Callback callback = this.f841d;
        if (callback instanceof Activity) {
            try {
                Activity activity = (Activity) callback;
                try {
                    strC = android.support.v4.app.j.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                u uVar = this.f843f;
                if (uVar == null) {
                    this.M = true;
                } else {
                    uVar.A(true);
                }
            }
        }
        if (bundle == null || this.G != -100) {
            return;
        }
        this.G = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context cVar;
        View d2;
        View view2 = null;
        if (this.P == null) {
            String string = this.f839b.obtainStyledAttributes(u.a.f903j).getString(110);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.P = new AppCompatViewInflater();
            } else {
                try {
                    this.P = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.P = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.P;
        int i = K0.f1195a;
        appCompatViewInflater.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f917y, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        cVar = (resourceId == 0 || ((context instanceof w.c) && ((w.c) context).f922a == resourceId)) ? context : new w.c(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                d2 = new D(cVar, attributeSet);
                break;
            case "CheckedTextView":
                d2 = new C0040s(cVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                d2 = new C0047z(cVar, attributeSet);
                break;
            case "TextView":
                d2 = new N(cVar, attributeSet);
                break;
            case "ImageButton":
                d2 = new C0045x(cVar, attributeSet, com.studiothinkers.lightstick.idlev3.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                d2 = new E(cVar, attributeSet);
                break;
            case "Spinner":
                d2 = new L(cVar, attributeSet);
                break;
            case "RadioButton":
                d2 = new C(cVar, attributeSet);
                break;
            case "ImageView":
                d2 = new C0046y(cVar, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                d2 = new C0037o(cVar, attributeSet);
                break;
            case "CheckBox":
                d2 = new y.r(cVar, attributeSet);
                break;
            case "EditText":
                d2 = new C0044w(cVar, attributeSet);
                break;
            case "Button":
                d2 = new C0039q(cVar, attributeSet);
                break;
            default:
                d2 = null;
                break;
        }
        if (d2 == null && context != cVar) {
            Object[] objArr = appCompatViewInflater.f168a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = AppCompatViewInflater.f166d;
                        if (i2 < 3) {
                            View viewA = appCompatViewInflater.a(cVar, str, strArr[i2]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    View viewA2 = appCompatViewInflater.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            d2 = view2;
        }
        if (d2 != null) {
            Context context2 = d2.getContext();
            if (context2 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = q.l.f728a;
                if (d2.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f165c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        d2.setOnClickListener(new p(d2, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return d2;
    }

    public final void p(m mVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z2 = mVar.f834m;
        int i2 = mVar.f823a;
        if (z2 || this.F) {
            return;
        }
        Context context = this.f839b;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f840c.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, mVar.f830h)) {
            f(mVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && r(mVar, keyEvent)) {
            l lVar = mVar.f827e;
            if (lVar != null && !mVar.f835n) {
                View view = mVar.f829g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                mVar.f833l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = mVar.f825c;
                layoutParams2.windowAnimations = mVar.f826d;
                windowManager.addView(mVar.f827e, layoutParams2);
                mVar.f834m = true;
            }
            if (lVar == null) {
                l();
                u uVar = this.f843f;
                Context contextY = uVar != null ? uVar.y() : null;
                if (contextY != null) {
                    context = contextY;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.studiothinkers.lightstick.idlev3.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(com.studiothinkers.lightstick.idlev3.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(com.studiothinkers.lightstick.idlev3.R.style.Theme_AppCompat_CompactMenu, true);
                }
                w.c cVar = new w.c(context, 0);
                cVar.getTheme().setTo(themeNewTheme);
                mVar.f831j = cVar;
                TypedArray typedArrayObtainStyledAttributes = cVar.obtainStyledAttributes(u.a.f903j);
                mVar.f824b = typedArrayObtainStyledAttributes.getResourceId(80, 0);
                mVar.f826d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                mVar.f827e = new l(this, mVar.f831j);
                mVar.f825c = 81;
            } else if (mVar.f835n && lVar.getChildCount() > 0) {
                mVar.f827e.removeAllViews();
            }
            View view2 = mVar.f829g;
            if (view2 != null) {
                mVar.f828f = view2;
            } else {
                if (mVar.f830h == null) {
                    return;
                }
                if (this.f847k == null) {
                    this.f847k = new i(this, 3);
                }
                i iVar = this.f847k;
                if (mVar.i == null) {
                    x.l lVar2 = new x.l(mVar.f831j);
                    mVar.i = lVar2;
                    lVar2.f1056f = iVar;
                    x.p pVar = mVar.f830h;
                    pVar.b(lVar2, pVar.f1065a);
                }
                x.l lVar3 = mVar.i;
                l lVar4 = mVar.f827e;
                if (lVar3.f1055e == null) {
                    lVar3.f1055e = (ExpandedMenuView) lVar3.f1053c.inflate(com.studiothinkers.lightstick.idlev3.R.layout.abc_expanded_menu_layout, (ViewGroup) lVar4, false);
                    if (lVar3.f1057g == null) {
                        lVar3.f1057g = new x.k(lVar3);
                    }
                    lVar3.f1055e.setAdapter((ListAdapter) lVar3.f1057g);
                    lVar3.f1055e.setOnItemClickListener(lVar3);
                }
                ExpandedMenuView expandedMenuView = lVar3.f1055e;
                mVar.f828f = expandedMenuView;
                if (expandedMenuView == null) {
                    return;
                }
            }
            if (mVar.f828f == null) {
                return;
            }
            if (mVar.f829g == null) {
                x.l lVar5 = mVar.i;
                if (lVar5.f1057g == null) {
                    lVar5.f1057g = new x.k(lVar5);
                }
                if (lVar5.f1057g.getCount() <= 0) {
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams3 = mVar.f828f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            mVar.f827e.setBackgroundResource(mVar.f824b);
            ViewParent parent = mVar.f828f.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(mVar.f828f);
            }
            mVar.f827e.addView(mVar.f828f, layoutParams3);
            if (!mVar.f828f.hasFocus()) {
                mVar.f828f.requestFocus();
            }
            i = -2;
            mVar.f833l = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams22.gravity = mVar.f825c;
            layoutParams22.windowAnimations = mVar.f826d;
            windowManager.addView(mVar.f827e, layoutParams22);
            mVar.f834m = true;
        }
    }

    public final boolean q(m mVar, int i, KeyEvent keyEvent) {
        x.p pVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f832k || r(mVar, keyEvent)) && (pVar = mVar.f830h) != null) {
            return pVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(t.m r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.r(t.m, android.view.KeyEvent):boolean");
    }

    public final boolean s(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f838A && i == 108) {
            return false;
        }
        if (this.f858w && i == 1) {
            this.f858w = false;
        }
        if (i == 1) {
            v();
            this.f838A = true;
            return true;
        }
        if (i == 2) {
            v();
            this.f856u = true;
            return true;
        }
        if (i == 5) {
            v();
            this.f857v = true;
            return true;
        }
        if (i == 10) {
            v();
            this.f860y = true;
            return true;
        }
        if (i == 108) {
            v();
            this.f858w = true;
            return true;
        }
        if (i != 109) {
            return this.f840c.requestFeature(i);
        }
        v();
        this.f859x = true;
        return true;
    }

    public final void t(int i) {
        j();
        ViewGroup viewGroup = (ViewGroup) this.r.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f839b).inflate(i, viewGroup);
        this.f841d.onContentChanged();
    }

    public final void u(CharSequence charSequence) {
        this.f845h = charSequence;
        Q q2 = this.i;
        if (q2 != null) {
            q2.setWindowTitle(charSequence);
            return;
        }
        u uVar = this.f843f;
        if (uVar == null) {
            TextView textView = this.f854s;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        G0 g0 = (G0) uVar.f885q;
        if (g0.f1162g) {
            return;
        }
        g0.f1163h = charSequence;
        if ((g0.f1157b & 8) != 0) {
            g0.f1156a.setTitle(charSequence);
        }
    }

    public final void v() {
        if (this.f853q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
