package x;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.C0027i0;
import y.V;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1027A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f1032g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0007f f1034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0008g f1035k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f1040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1041q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1044u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public A f1047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f1048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1049z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1033h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.arch.lifecycle.i f1036l = new android.arch.lifecycle.i(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1037m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1038n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1045v = false;

    public j(Context context, View view, int i, boolean z2) {
        this.f1034j = new ViewTreeObserverOnGlobalLayoutListenerC0007f(this, i);
        this.f1035k = new ViewOnAttachStateChangeListenerC0008g(this, i);
        this.f1028c = context;
        this.f1039o = view;
        this.f1030e = i;
        this.f1031f = z2;
        WeakHashMap weakHashMap = q.l.f728a;
        this.f1041q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1029d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1032g = new Handler();
    }

    @Override // x.B
    public final void a(p pVar, boolean z2) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (pVar == ((i) arrayList.get(i)).f1025b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((i) arrayList.get(i2)).f1025b.c(false);
        }
        i iVar = (i) arrayList.remove(i);
        p pVar2 = iVar.f1025b;
        C0027i0 c0027i0 = iVar.f1024a;
        pVar2.r(this);
        if (this.f1027A) {
            c0027i0.f1306z.setExitTransition(null);
            c0027i0.f1306z.setAnimationStyle(0);
        }
        c0027i0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1041q = ((i) arrayList.get(size2 - 1)).f1026c;
        } else {
            View view = this.f1039o;
            WeakHashMap weakHashMap = q.l.f728a;
            this.f1041q = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((i) arrayList.get(0)).f1025b.c(false);
                return;
            }
            return;
        }
        dismiss();
        A a2 = this.f1047x;
        if (a2 != null) {
            a2.a(pVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1048y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1048y.removeGlobalOnLayoutListener(this.f1034j);
            }
            this.f1048y = null;
        }
        this.f1040p.removeOnAttachStateChangeListener(this.f1035k);
        this.f1049z.onDismiss();
    }

    @Override // x.F
    public final void c() {
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f1033h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((p) obj);
        }
        arrayList.clear();
        View view = this.f1039o;
        this.f1040p = view;
        if (view != null) {
            boolean z2 = this.f1048y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1048y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1034j);
            }
            this.f1040p.addOnAttachStateChangeListener(this.f1035k);
        }
    }

    @Override // x.B
    public final boolean d() {
        return false;
    }

    @Override // x.F
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            i[] iVarArr = (i[]) arrayList.toArray(new i[size]);
            for (int i = size - 1; i >= 0; i--) {
                i iVar = iVarArr[i];
                if (iVar.f1024a.f1306z.isShowing()) {
                    iVar.f1024a.dismiss();
                }
            }
        }
    }

    @Override // x.B
    public final boolean e(H h2) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i iVar = (i) obj;
            if (h2 == iVar.f1025b) {
                iVar.f1024a.f1286d.requestFocus();
                return true;
            }
        }
        if (!h2.hasVisibleItems()) {
            return false;
        }
        l(h2);
        A a2 = this.f1047x;
        if (a2 != null) {
            a2.f(h2);
        }
        return true;
    }

    @Override // x.B
    public final void g(A a2) {
        this.f1047x = a2;
    }

    @Override // x.B
    public final void h() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((i) obj).f1024a.f1286d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((m) adapter).notifyDataSetChanged();
        }
    }

    @Override // x.F
    public final boolean i() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((i) arrayList.get(0)).f1024a.f1306z.isShowing();
    }

    @Override // x.F
    public final V j() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((i) arrayList.get(arrayList.size() - 1)).f1024a.f1286d;
    }

    @Override // x.x
    public final void l(p pVar) {
        pVar.b(this, this.f1028c);
        if (i()) {
            u(pVar);
        } else {
            this.f1033h.add(pVar);
        }
    }

    @Override // x.x
    public final void n(View view) {
        if (this.f1039o != view) {
            this.f1039o = view;
            int i = this.f1037m;
            WeakHashMap weakHashMap = q.l.f728a;
            this.f1038n = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // x.x
    public final void o(boolean z2) {
        this.f1045v = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        i iVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                iVar = null;
                break;
            }
            iVar = (i) arrayList.get(i);
            if (!iVar.f1024a.f1306z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (iVar != null) {
            iVar.f1025b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // x.x
    public final void p(int i) {
        if (this.f1037m != i) {
            this.f1037m = i;
            View view = this.f1039o;
            WeakHashMap weakHashMap = q.l.f728a;
            this.f1038n = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // x.x
    public final void q(int i) {
        this.r = true;
        this.f1043t = i;
    }

    @Override // x.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1049z = onDismissListener;
    }

    @Override // x.x
    public final void s(boolean z2) {
        this.f1046w = z2;
    }

    @Override // x.x
    public final void t(int i) {
        this.f1042s = true;
        this.f1044u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(x.p r19) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.j.u(x.p):void");
    }
}
