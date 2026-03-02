package x;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class H extends p implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final r f994A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p f995z;

    public H(Context context, p pVar, r rVar) {
        super(context);
        this.f995z = pVar;
        this.f994A = rVar;
    }

    @Override // x.p
    public final boolean d(r rVar) {
        return this.f995z.d(rVar);
    }

    @Override // x.p
    public final boolean e(p pVar, MenuItem menuItem) {
        return super.e(pVar, menuItem) || this.f995z.e(pVar, menuItem);
    }

    @Override // x.p
    public final boolean f(r rVar) {
        return this.f995z.f(rVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f994A;
    }

    @Override // x.p
    public final String j() {
        r rVar = this.f994A;
        int i = rVar != null ? rVar.f1091a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // x.p
    public final p k() {
        return this.f995z.k();
    }

    @Override // x.p
    public final boolean m() {
        return this.f995z.m();
    }

    @Override // x.p
    public final boolean n() {
        return this.f995z.n();
    }

    @Override // x.p
    public final boolean o() {
        return this.f995z.o();
    }

    @Override // x.p, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f995z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f994A.setIcon(drawable);
        return this;
    }

    @Override // x.p, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f995z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f994A.setIcon(i);
        return this;
    }
}
