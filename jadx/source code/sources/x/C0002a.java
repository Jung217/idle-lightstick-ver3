package x;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0002a implements m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f1001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1003h;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f1006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1010p;

    @Override // m.a
    public final m.a a(v vVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m.a
    public final v b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1003h;
        if (drawable != null) {
            if (this.f1008n || this.f1009o) {
                this.f1003h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f1003h = drawableMutate;
                if (this.f1008n) {
                    drawableMutate.setTintList(this.f1006l);
                }
                if (this.f1009o) {
                    this.f1003h.setTintMode(this.f1007m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // m.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1002g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1001f;
    }

    @Override // m.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1004j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f1003h;
    }

    @Override // m.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1006l;
    }

    @Override // m.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1007m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f998c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1000e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f999d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f996a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f997b;
        return charSequence != null ? charSequence : this.f996a;
    }

    @Override // m.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1005k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f1010p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1010p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1010p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f1010p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f1001f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f1010p = (z2 ? 1 : 0) | (this.f1010p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f1010p = (z2 ? 2 : 0) | (this.f1010p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1004j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f1010p = (z2 ? 16 : 0) | (this.f1010p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1003h = drawable;
        c();
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1006l = colorStateList;
        this.f1008n = true;
        c();
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1007m = mode;
        this.f1009o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f998c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f999d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f999d = c2;
        this.f1001f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f996a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f997b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1005k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f1010p = (this.f1010p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1001f = Character.toLowerCase(c2);
        this.f1002g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final m.a setContentDescription(CharSequence charSequence) {
        this.f1004j = charSequence;
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f999d = c2;
        this.f1000e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f996a = this.i.getResources().getString(i);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final m.a setTooltipText(CharSequence charSequence) {
        this.f1005k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1003h = this.i.getDrawable(i);
        c();
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f999d = c2;
        this.f1000e = KeyEvent.normalizeMetaState(i);
        this.f1001f = Character.toLowerCase(c3);
        this.f1002g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
