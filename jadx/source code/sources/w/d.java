package w;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import x.n;
import x.p;
import y.C0030k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.j f928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f930h;
    public p i;

    @Override // w.a
    public final void a() {
        if (this.f930h) {
            return;
        }
        this.f930h = true;
        this.f927e.sendAccessibilityEvent(32);
        this.f928f.a(this);
    }

    @Override // w.a
    public final View b() {
        WeakReference weakReference = this.f929g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // x.n
    public final void c(p pVar) {
        i();
        C0030k c0030k = this.f927e.f207e;
        if (c0030k != null) {
            c0030k.l();
        }
    }

    @Override // x.n
    public final boolean d(p pVar, MenuItem menuItem) {
        return ((android.support.v4.app.h) this.f928f.f369a).j(this, menuItem);
    }

    @Override // w.a
    public final p e() {
        return this.i;
    }

    @Override // w.a
    public final MenuInflater f() {
        return new h(this.f927e.getContext());
    }

    @Override // w.a
    public final CharSequence g() {
        return this.f927e.getSubtitle();
    }

    @Override // w.a
    public final CharSequence h() {
        return this.f927e.getTitle();
    }

    @Override // w.a
    public final void i() {
        this.f928f.b(this, this.i);
    }

    @Override // w.a
    public final boolean j() {
        return this.f927e.f219s;
    }

    @Override // w.a
    public final void k(View view) {
        this.f927e.setCustomView(view);
        this.f929g = view != null ? new WeakReference(view) : null;
    }

    @Override // w.a
    public final void l(int i) {
        m(this.f926d.getString(i));
    }

    @Override // w.a
    public final void m(CharSequence charSequence) {
        this.f927e.setSubtitle(charSequence);
    }

    @Override // w.a
    public final void n(int i) {
        o(this.f926d.getString(i));
    }

    @Override // w.a
    public final void o(CharSequence charSequence) {
        this.f927e.setTitle(charSequence);
    }

    @Override // w.a
    public final void p(boolean z2) {
        this.f921c = z2;
        this.f927e.setTitleOptional(z2);
    }
}
