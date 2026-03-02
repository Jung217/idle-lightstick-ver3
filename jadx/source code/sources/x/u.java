package x;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0006e implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.f1117b = wVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.f1015a).onMenuItemClick(this.f1117b.c(menuItem));
    }
}
