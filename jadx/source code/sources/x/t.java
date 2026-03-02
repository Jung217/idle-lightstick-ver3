package x;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0006e implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.f1116b = wVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.f1015a).onMenuItemActionCollapse(this.f1116b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.f1015a).onMenuItemActionExpand(this.f1116b.c(menuItem));
    }
}
