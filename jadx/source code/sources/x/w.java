package x;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0005d implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f1120d;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return ((m.a) this.f1015a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return ((m.a) this.f1015a).expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        v vVarB = ((m.a) this.f1015a).b();
        if (vVarB != null) {
            return vVarB.f1118a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = ((m.a) this.f1015a).getActionView();
        return actionView instanceof s ? (View) ((s) actionView).f1115b : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return ((m.a) this.f1015a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return ((m.a) this.f1015a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return ((m.a) this.f1015a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return ((m.a) this.f1015a).getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return ((m.a) this.f1015a).getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return ((m.a) this.f1015a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return ((m.a) this.f1015a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return ((m.a) this.f1015a).getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return ((m.a) this.f1015a).getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((m.a) this.f1015a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return ((m.a) this.f1015a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return ((m.a) this.f1015a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return ((m.a) this.f1015a).getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return ((m.a) this.f1015a).getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return ((m.a) this.f1015a).getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return ((m.a) this.f1015a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return ((m.a) this.f1015a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return ((m.a) this.f1015a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return ((m.a) this.f1015a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return ((m.a) this.f1015a).isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return ((m.a) this.f1015a).isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return ((m.a) this.f1015a).isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return ((m.a) this.f1015a).isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ((m.a) this.f1015a).a(actionProvider != null ? new v(this, actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new s(view);
        }
        ((m.a) this.f1015a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        ((m.a) this.f1015a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        ((m.a) this.f1015a).setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        ((m.a) this.f1015a).setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        ((m.a) this.f1015a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        ((m.a) this.f1015a).setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        ((m.a) this.f1015a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        ((m.a) this.f1015a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((m.a) this.f1015a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        ((m.a) this.f1015a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        ((m.a) this.f1015a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((m.a) this.f1015a).setOnActionExpandListener(onActionExpandListener != null ? new t(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((m.a) this.f1015a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new u(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        ((m.a) this.f1015a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        ((m.a) this.f1015a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        ((m.a) this.f1015a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        ((m.a) this.f1015a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        ((m.a) this.f1015a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        ((m.a) this.f1015a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return ((m.a) this.f1015a).setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        ((m.a) this.f1015a).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        ((m.a) this.f1015a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        ((m.a) this.f1015a).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((m.a) this.f1015a).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        ((m.a) this.f1015a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        Object obj = this.f1015a;
        ((m.a) obj).setActionView(i);
        View actionView = ((m.a) obj).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((m.a) obj).setActionView(new s(actionView));
        }
        return this;
    }
}
