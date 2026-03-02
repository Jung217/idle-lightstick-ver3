package t;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.G0;
import y.InterfaceC0018e;
import y.S;

/* JADX INFO: loaded from: classes.dex */
public final class u extends android.arch.lifecycle.f implements InterfaceC0018e {
    public static final AccelerateInterpolator K = new AccelerateInterpolator();
    public static final DecelerateInterpolator L = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f880A;
    public boolean B;
    public boolean C;
    public boolean D;
    public w.j E;
    public boolean F;
    public boolean G;
    public final s H;
    public final s I;
    public final android.arch.lifecycle.i J;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionBarOverlayLayout f883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActionBarContainer f884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public S f885q;
    public ActionBarContextView r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t f888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t f889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c.j f890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f893z;

    public u(Activity activity, boolean z2) {
        new ArrayList();
        this.f892y = new ArrayList();
        this.f893z = 0;
        this.f880A = true;
        this.D = true;
        this.H = new s(this, 0);
        this.I = new s(this, 1);
        this.J = new android.arch.lifecycle.i(this);
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z2) {
            return;
        }
        this.f886s = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z2) {
        if (this.f887t) {
            return;
        }
        int i = z2 ? 4 : 0;
        G0 g0 = (G0) this.f885q;
        int i2 = g0.f1157b;
        this.f887t = true;
        g0.a((i & 4) | (i2 & (-5)));
    }

    public final void B(boolean z2) {
        if (z2) {
            this.f884p.setTabContainer(null);
            ((G0) this.f885q).getClass();
        } else {
            ((G0) this.f885q).getClass();
            this.f884p.setTabContainer(null);
        }
        this.f885q.getClass();
        ((G0) this.f885q).f1156a.setCollapsible(false);
        this.f883o.setHasNonEmbeddedTabs(false);
    }

    public final void C(boolean z2) {
        boolean z3 = this.B;
        boolean z4 = this.C;
        android.arch.lifecycle.i iVar = this.J;
        View view = this.f886s;
        if (!z4 && z3) {
            if (this.D) {
                this.D = false;
                w.j jVar = this.E;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f893z;
                s sVar = this.H;
                if (i != 0 || (!this.F && !z2)) {
                    sVar.a();
                    return;
                }
                this.f884p.setAlpha(1.0f);
                this.f884p.setTransitioning(true);
                w.j jVar2 = new w.j();
                float f2 = -this.f884p.getHeight();
                if (z2) {
                    this.f884p.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                q.p pVarA = q.l.a(this.f884p);
                pVarA.e(f2);
                View view2 = (View) pVarA.f733a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(iVar != null ? new q.o(iVar, view2) : null);
                }
                boolean z5 = jVar2.f975e;
                ArrayList arrayList = jVar2.f971a;
                if (!z5) {
                    arrayList.add(pVarA);
                }
                if (this.f880A && view != null) {
                    q.p pVarA2 = q.l.a(view);
                    pVarA2.e(f2);
                    if (!jVar2.f975e) {
                        arrayList.add(pVarA2);
                    }
                }
                boolean z6 = jVar2.f975e;
                if (!z6) {
                    jVar2.f973c = K;
                }
                if (!z6) {
                    jVar2.f972b = 250L;
                }
                if (!z6) {
                    jVar2.f974d = sVar;
                }
                this.E = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.D) {
            return;
        }
        this.D = true;
        w.j jVar3 = this.E;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f884p.setVisibility(0);
        int i2 = this.f893z;
        s sVar2 = this.I;
        if (i2 == 0 && (this.F || z2)) {
            this.f884p.setTranslationY(0.0f);
            float f3 = -this.f884p.getHeight();
            if (z2) {
                this.f884p.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f884p.setTranslationY(f3);
            w.j jVar4 = new w.j();
            q.p pVarA3 = q.l.a(this.f884p);
            pVarA3.e(0.0f);
            View view3 = (View) pVarA3.f733a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(iVar != null ? new q.o(iVar, view3) : null);
            }
            boolean z7 = jVar4.f975e;
            ArrayList arrayList2 = jVar4.f971a;
            if (!z7) {
                arrayList2.add(pVarA3);
            }
            if (this.f880A && view != null) {
                view.setTranslationY(f3);
                q.p pVarA4 = q.l.a(view);
                pVarA4.e(0.0f);
                if (!jVar4.f975e) {
                    arrayList2.add(pVarA4);
                }
            }
            boolean z8 = jVar4.f975e;
            if (!z8) {
                jVar4.f973c = L;
            }
            if (!z8) {
                jVar4.f972b = 250L;
            }
            if (!z8) {
                jVar4.f974d = sVar2;
            }
            this.E = jVar4;
            jVar4.b();
        } else {
            this.f884p.setAlpha(1.0f);
            this.f884p.setTranslationY(0.0f);
            if (this.f880A && view != null) {
                view.setTranslationY(0.0f);
            }
            sVar2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f883o;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = q.l.f728a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void x(boolean z2) {
        q.p pVarH;
        q.p pVarH2;
        if (z2) {
            if (!this.C) {
                this.C = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f883o;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                C(false);
            }
        } else if (this.C) {
            this.C = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f883o;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            C(false);
        }
        ActionBarContainer actionBarContainer = this.f884p;
        WeakHashMap weakHashMap = q.l.f728a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((G0) this.f885q).f1156a.setVisibility(4);
                this.r.setVisibility(0);
                return;
            } else {
                ((G0) this.f885q).f1156a.setVisibility(0);
                this.r.setVisibility(8);
                return;
            }
        }
        if (z2) {
            G0 g0 = (G0) this.f885q;
            pVarH = q.l.a(g0.f1156a);
            pVarH.a(0.0f);
            pVarH.c(100L);
            pVarH.d(new w.i(g0, 4));
            pVarH2 = this.r.h(0, 200L);
        } else {
            G0 g02 = (G0) this.f885q;
            q.p pVarA = q.l.a(g02.f1156a);
            pVarA.a(1.0f);
            pVarA.c(200L);
            pVarA.d(new w.i(g02, 0));
            pVarH = this.r.h(8, 100L);
            pVarH2 = pVarA;
        }
        w.j jVar = new w.j();
        ArrayList arrayList = jVar.f971a;
        arrayList.add(pVarH);
        View view = (View) pVarH.f733a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) pVarH2.f733a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(pVarH2);
        jVar.b();
    }

    public final Context y() {
        if (this.f882n == null) {
            TypedValue typedValue = new TypedValue();
            this.f881m.getTheme().resolveAttribute(com.studiothinkers.lightstick.idlev3.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f882n = new ContextThemeWrapper(this.f881m, i);
            } else {
                this.f882n = this.f881m;
            }
        }
        return this.f882n;
    }

    public final void z(View view) {
        S wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.studiothinkers.lightstick.idlev3.R.id.decor_content_parent);
        this.f883o = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.studiothinkers.lightstick.idlev3.R.id.action_bar);
        if (callbackFindViewById instanceof S) {
            wrapper = (S) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f885q = wrapper;
        this.r = (ActionBarContextView) view.findViewById(com.studiothinkers.lightstick.idlev3.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.studiothinkers.lightstick.idlev3.R.id.action_bar_container);
        this.f884p = actionBarContainer;
        S s2 = this.f885q;
        if (s2 == null || this.r == null || actionBarContainer == null) {
            throw new IllegalStateException(u.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((G0) s2).f1156a.getContext();
        this.f881m = context;
        if ((((G0) this.f885q).f1157b & 4) != 0) {
            this.f887t = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f885q.getClass();
        B(context.getResources().getBoolean(com.studiothinkers.lightstick.idlev3.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f881m.obtainStyledAttributes(null, u.a.f895a, com.studiothinkers.lightstick.idlev3.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f883o;
            if (!actionBarOverlayLayout2.i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.G = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f884p;
            WeakHashMap weakHashMap = q.l.f728a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public u(Dialog dialog) {
        new ArrayList();
        this.f892y = new ArrayList();
        this.f893z = 0;
        this.f880A = true;
        this.D = true;
        this.H = new s(this, 0);
        this.I = new s(this, 1);
        this.J = new android.arch.lifecycle.i(this);
        z(dialog.getWindow().getDecorView());
    }
}
