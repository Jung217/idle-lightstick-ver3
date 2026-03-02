package t;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import y.C0030k;
import y.G0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w.a implements x.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.p f876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.j f877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f879h;

    public t(u uVar, Context context, c.j jVar) {
        this.f879h = uVar;
        this.f875d = context;
        this.f877f = jVar;
        x.p pVar = new x.p(context);
        pVar.f1075l = 1;
        this.f876e = pVar;
        pVar.f1069e = this;
    }

    @Override // w.a
    public final void a() {
        u uVar = this.f879h;
        if (uVar.f888u != this) {
            return;
        }
        if (uVar.B) {
            uVar.f889v = this;
            uVar.f890w = this.f877f;
        } else {
            this.f877f.a(this);
        }
        this.f877f = null;
        uVar.x(false);
        ActionBarContextView actionBarContextView = uVar.r;
        if (actionBarContextView.f213l == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.f214m = null;
            actionBarContextView.f206d = null;
        }
        ((G0) uVar.f885q).f1156a.sendAccessibilityEvent(32);
        uVar.f883o.setHideOnContentScrollEnabled(uVar.G);
        uVar.f888u = null;
    }

    @Override // w.a
    public final View b() {
        WeakReference weakReference = this.f878g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // x.n
    public final void c(x.p pVar) {
        if (this.f877f == null) {
            return;
        }
        i();
        C0030k c0030k = this.f879h.r.f207e;
        if (c0030k != null) {
            c0030k.l();
        }
    }

    @Override // x.n
    public final boolean d(x.p pVar, MenuItem menuItem) {
        c.j jVar = this.f877f;
        if (jVar != null) {
            return ((android.support.v4.app.h) jVar.f369a).j(this, menuItem);
        }
        return false;
    }

    @Override // w.a
    public final x.p e() {
        return this.f876e;
    }

    @Override // w.a
    public final MenuInflater f() {
        return new w.h(this.f875d);
    }

    @Override // w.a
    public final CharSequence g() {
        return this.f879h.r.getSubtitle();
    }

    @Override // w.a
    public final CharSequence h() {
        return this.f879h.r.getTitle();
    }

    @Override // w.a
    public final void i() {
        if (this.f879h.f888u != this) {
            return;
        }
        x.p pVar = this.f876e;
        pVar.w();
        try {
            this.f877f.b(this, pVar);
        } finally {
            pVar.v();
        }
    }

    @Override // w.a
    public final boolean j() {
        return this.f879h.r.f219s;
    }

    @Override // w.a
    public final void k(View view) {
        this.f879h.r.setCustomView(view);
        this.f878g = new WeakReference(view);
    }

    @Override // w.a
    public final void l(int i) {
        m(this.f879h.f881m.getResources().getString(i));
    }

    @Override // w.a
    public final void m(CharSequence charSequence) {
        this.f879h.r.setSubtitle(charSequence);
    }

    @Override // w.a
    public final void n(int i) {
        o(this.f879h.f881m.getResources().getString(i));
    }

    @Override // w.a
    public final void o(CharSequence charSequence) {
        this.f879h.r.setTitle(charSequence);
    }

    @Override // w.a
    public final void p(boolean z2) {
        this.f921c = z2;
        this.f879h.r.setTitleOptional(z2);
    }
}
