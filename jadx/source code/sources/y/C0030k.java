package y;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030k implements x.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.p f1326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f1327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x.A f1328f;
    public x.D i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0028j f1331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1338q;
    public boolean r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f1340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0022g f1341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0022g f1342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RunnableC0026i f1343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0024h f1344x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1329g = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1330h = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f1339s = new SparseBooleanArray();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final android.arch.lifecycle.i f1345y = new android.arch.lifecycle.i(this);

    public C0030k(Context context) {
        this.f1324b = context;
        this.f1327e = LayoutInflater.from(context);
    }

    @Override // x.B
    public final void a(x.p pVar, boolean z2) {
        i();
        C0022g c0022g = this.f1342v;
        if (c0022g != null && c0022g.b()) {
            c0022g.i.dismiss();
        }
        x.A a2 = this.f1328f;
        if (a2 != null) {
            a2.a(pVar, z2);
        }
    }

    @Override // x.B
    public final boolean b(x.r rVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View c(x.r rVar, View view, ViewGroup viewGroup) {
        View actionView = rVar.getActionView();
        if (actionView == null || rVar.e()) {
            x.C c2 = view instanceof x.C ? (x.C) view : (x.C) this.f1327e.inflate(this.f1330h, viewGroup, false);
            c2.c(rVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c2;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
            if (this.f1344x == null) {
                this.f1344x = new C0024h(this);
            }
            actionMenuItemView.setPopupCallback(this.f1344x);
            actionView = (View) c2;
        }
        actionView.setVisibility(rVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // x.B
    public final boolean d() {
        ArrayList arrayListL;
        int size;
        int i;
        boolean z2;
        C0030k c0030k = this;
        x.p pVar = c0030k.f1326d;
        if (pVar != null) {
            arrayListL = pVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i2 = c0030k.f1338q;
        int i3 = c0030k.f1337p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0030k.i;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z2 = true;
            if (i4 >= size) {
                break;
            }
            x.r rVar = (x.r) arrayListL.get(i4);
            int i7 = rVar.f1113y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z3 = true;
            }
            if (c0030k.r && rVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (c0030k.f1334m && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0030k.f1339s;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            x.r rVar2 = (x.r) arrayListL.get(i9);
            int i11 = rVar2.f1113y;
            boolean z4 = (i11 & 2) == i ? z2 : false;
            int i12 = rVar2.f1092b;
            if (z4) {
                View viewC = c0030k.c(rVar2, c0030k.f1340t, viewGroup);
                if (c0030k.f1340t == null) {
                    c0030k.f1340t = viewC;
                }
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z2);
                }
                rVar2.f(z2);
            } else if ((i11 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i12);
                boolean z6 = ((i8 > 0 || z5) && i3 > 0) ? z2 : false;
                if (z6) {
                    View viewC2 = c0030k.c(rVar2, c0030k.f1340t, viewGroup);
                    if (c0030k.f1340t == null) {
                        c0030k.f1340t = viewC2;
                    }
                    viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewC2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z6 &= i3 + i10 > 0;
                }
                if (z6 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z5) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        x.r rVar3 = (x.r) arrayListL.get(i13);
                        if (rVar3.f1092b == i12) {
                            if ((rVar3.f1112x & 32) == 32) {
                                i8++;
                            }
                            rVar3.f(false);
                        }
                    }
                }
                if (z6) {
                    i8--;
                }
                rVar2.f(z6);
            } else {
                rVar2.f(false);
                i9++;
                i = 2;
                c0030k = this;
                z2 = true;
            }
            i9++;
            i = 2;
            c0030k = this;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x.B
    public final boolean e(x.H h2) {
        boolean z2;
        if (h2.hasVisibleItems()) {
            x.H h3 = h2;
            while (true) {
                x.p pVar = h3.f995z;
                if (pVar == this.f1326d) {
                    break;
                }
                h3 = (x.H) pVar;
            }
            x.r rVar = h3.f994A;
            ViewGroup viewGroup = (ViewGroup) this.i;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof x.C) && ((x.C) childAt).getItemData() == rVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                h2.f994A.getClass();
                int size = h2.f1070f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = h2.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                C0022g c0022g = new C0022g(this, this.f1325c, h2, view);
                this.f1342v = c0022g;
                c0022g.f1129g = z2;
                x.x xVar = c0022g.i;
                if (xVar != null) {
                    xVar.o(z2);
                }
                C0022g c0022g2 = this.f1342v;
                if (!c0022g2.b()) {
                    if (c0022g2.f1127e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0022g2.d(0, 0, false, false);
                }
                x.A a2 = this.f1328f;
                if (a2 != null) {
                    a2.f(h2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // x.B
    public final boolean f(x.r rVar) {
        return false;
    }

    @Override // x.B
    public final void g(x.A a2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x.B
    public final void h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            x.p pVar = this.f1326d;
            if (pVar != null) {
                pVar.i();
                ArrayList arrayListL = this.f1326d.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    x.r rVar = (x.r) arrayListL.get(i2);
                    if ((rVar.f1112x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        x.r itemData = childAt instanceof x.C ? ((x.C) childAt).getItemData() : null;
                        View viewC = c(rVar, childAt, viewGroup);
                        if (rVar != itemData) {
                            viewC.setPressed(false);
                            viewC.jumpDrawablesToCurrentState();
                        }
                        if (viewC != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewC.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewC);
                            }
                            ((ViewGroup) this.i).addView(viewC, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1331j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.i).requestLayout();
        x.p pVar2 = this.f1326d;
        if (pVar2 != null) {
            pVar2.i();
            ArrayList arrayList2 = pVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                x.v vVar = ((x.r) arrayList2.get(i3)).f1090A;
            }
        }
        x.p pVar3 = this.f1326d;
        if (pVar3 != null) {
            pVar3.i();
            arrayList = pVar3.f1073j;
        }
        if (this.f1334m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((x.r) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1331j == null) {
                this.f1331j = new C0028j(this, this.f1324b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1331j.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1331j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                C0028j c0028j = this.f1331j;
                actionMenuView.getClass();
                C0034m c0034mI = ActionMenuView.i();
                c0034mI.f1347c = true;
                actionMenuView.addView(c0028j, c0034mI);
            }
        } else {
            C0028j c0028j2 = this.f1331j;
            if (c0028j2 != null) {
                Object parent = c0028j2.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1331j);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.f1334m);
    }

    public final boolean i() {
        Object obj;
        RunnableC0026i runnableC0026i = this.f1343w;
        if (runnableC0026i != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(runnableC0026i);
            this.f1343w = null;
            return true;
        }
        C0022g c0022g = this.f1341u;
        if (c0022g == null) {
            return false;
        }
        if (c0022g.b()) {
            c0022g.i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        C0022g c0022g = this.f1341u;
        return c0022g != null && c0022g.b();
    }

    @Override // x.B
    public final void k(Context context, x.p pVar) {
        this.f1325c = context;
        LayoutInflater.from(context);
        this.f1326d = pVar;
        Resources resources = context.getResources();
        if (!this.f1335n) {
            this.f1334m = true;
        }
        int i = 2;
        this.f1336o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1338q = i;
        int measuredWidth = this.f1336o;
        if (this.f1334m) {
            if (this.f1331j == null) {
                C0028j c0028j = new C0028j(this, this.f1324b);
                this.f1331j = c0028j;
                if (this.f1333l) {
                    c0028j.setImageDrawable(this.f1332k);
                    this.f1332k = null;
                    this.f1333l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1331j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1331j.getMeasuredWidth();
        } else {
            this.f1331j = null;
        }
        this.f1337p = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
        this.f1340t = null;
    }

    public final boolean l() {
        x.p pVar;
        if (!this.f1334m || j() || (pVar = this.f1326d) == null || this.i == null || this.f1343w != null) {
            return false;
        }
        pVar.i();
        if (pVar.f1073j.isEmpty()) {
            return false;
        }
        RunnableC0026i runnableC0026i = new RunnableC0026i(this, new C0022g(this, this.f1325c, this.f1326d, this.f1331j));
        this.f1343w = runnableC0026i;
        ((View) this.i).post(runnableC0026i);
        x.A a2 = this.f1328f;
        if (a2 == null) {
            return true;
        }
        a2.f(null);
        return true;
    }
}
