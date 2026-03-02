package x;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;
import y.C0027i0;
import y.V;

/* JADX INFO: loaded from: classes.dex */
public final class G extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f982h;
    public final C0027i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0007f f983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0008g f984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A f988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f990q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f992t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f993u;

    public G(Context context, p pVar, View view, int i, boolean z2) {
        int i2 = 1;
        this.f983j = new ViewTreeObserverOnGlobalLayoutListenerC0007f(this, i2);
        this.f984k = new ViewOnAttachStateChangeListenerC0008g(this, i2);
        this.f977c = context;
        this.f978d = pVar;
        this.f980f = z2;
        this.f979e = new m(pVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f982h = i;
        Resources resources = context.getResources();
        this.f981g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f986m = view;
        this.i = new C0027i0(context, null, i);
        pVar.b(this, context);
    }

    @Override // x.B
    public final void a(p pVar, boolean z2) {
        if (pVar != this.f978d) {
            return;
        }
        dismiss();
        A a2 = this.f988o;
        if (a2 != null) {
            a2.a(pVar, z2);
        }
    }

    @Override // x.F
    public final void c() {
        View view;
        if (i()) {
            return;
        }
        if (this.f990q || (view = this.f986m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f987n = view;
        C0027i0 c0027i0 = this.i;
        c0027i0.f1306z.setOnDismissListener(this);
        c0027i0.f1298q = this;
        c0027i0.f1305y = true;
        c0027i0.f1306z.setFocusable(true);
        View view2 = this.f987n;
        boolean z2 = this.f989p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f989p = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f983j);
        }
        view2.addOnAttachStateChangeListener(this.f984k);
        c0027i0.f1297p = view2;
        c0027i0.f1294m = this.f992t;
        boolean z3 = this.r;
        Context context = this.f977c;
        m mVar = this.f979e;
        if (!z3) {
            this.f991s = x.m(mVar, context, this.f981g);
            this.r = true;
        }
        c0027i0.f(this.f991s);
        c0027i0.f1306z.setInputMethodMode(2);
        c0027i0.f1304x = this.f1121b;
        c0027i0.c();
        V v2 = c0027i0.f1286d;
        v2.setOnKeyListener(this);
        if (this.f993u) {
            p pVar = this.f978d;
            if (pVar.f1076m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) v2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(pVar.f1076m);
                }
                frameLayout.setEnabled(false);
                v2.addHeaderView(frameLayout, null, false);
            }
        }
        c0027i0.d(mVar);
        c0027i0.c();
    }

    @Override // x.B
    public final boolean d() {
        return false;
    }

    @Override // x.F
    public final void dismiss() {
        if (i()) {
            this.i.dismiss();
        }
    }

    @Override // x.B
    public final boolean e(H h2) {
        boolean z2;
        if (h2.hasVisibleItems()) {
            z zVar = new z(this.f977c, h2, this.f987n, this.f980f, this.f982h, 0);
            A a2 = this.f988o;
            zVar.f1130h = a2;
            x xVar = zVar.i;
            if (xVar != null) {
                xVar.g(a2);
            }
            int size = h2.f1070f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = h2.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i++;
            }
            zVar.f1129g = z2;
            x xVar2 = zVar.i;
            if (xVar2 != null) {
                xVar2.o(z2);
            }
            zVar.f1131j = this.f985l;
            this.f985l = null;
            this.f978d.c(false);
            C0027i0 c0027i0 = this.i;
            int width = c0027i0.f1289g;
            int i2 = !c0027i0.f1291j ? 0 : c0027i0.f1290h;
            int i3 = this.f992t;
            View view = this.f986m;
            WeakHashMap weakHashMap = q.l.f728a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                width += this.f986m.getWidth();
            }
            if (!zVar.b()) {
                if (zVar.f1127e != null) {
                    zVar.d(width, i2, true, true);
                }
            }
            A a3 = this.f988o;
            if (a3 != null) {
                a3.f(h2);
            }
            return true;
        }
        return false;
    }

    @Override // x.B
    public final void g(A a2) {
        this.f988o = a2;
    }

    @Override // x.B
    public final void h() {
        this.r = false;
        m mVar = this.f979e;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // x.F
    public final boolean i() {
        return !this.f990q && this.i.f1306z.isShowing();
    }

    @Override // x.F
    public final V j() {
        return this.i.f1286d;
    }

    @Override // x.x
    public final void n(View view) {
        this.f986m = view;
    }

    @Override // x.x
    public final void o(boolean z2) {
        this.f979e.f1060d = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f990q = true;
        this.f978d.c(true);
        ViewTreeObserver viewTreeObserver = this.f989p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f989p = this.f987n.getViewTreeObserver();
            }
            this.f989p.removeGlobalOnLayoutListener(this.f983j);
            this.f989p = null;
        }
        this.f987n.removeOnAttachStateChangeListener(this.f984k);
        PopupWindow.OnDismissListener onDismissListener = this.f985l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f992t = i;
    }

    @Override // x.x
    public final void q(int i) {
        this.i.f1289g = i;
    }

    @Override // x.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f985l = onDismissListener;
    }

    @Override // x.x
    public final void s(boolean z2) {
        this.f993u = z2;
    }

    @Override // x.x
    public final void t(int i) {
        C0027i0 c0027i0 = this.i;
        c0027i0.f1290h = i;
        c0027i0.f1291j = true;
    }

    @Override // x.x
    public final void l(p pVar) {
    }
}
