package y;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: y.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025h0 extends V {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC0023g0 f1312q;
    public x.r r;

    public C0025h0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f1310o = 21;
            this.f1311p = 22;
        } else {
            this.f1310o = 22;
            this.f1311p = 21;
        }
    }

    @Override // y.V, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        x.m mVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f1312q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                mVar = (x.m) headerViewListAdapter.getWrappedAdapter();
            } else {
                mVar = (x.m) adapter;
                headersCount = 0;
            }
            x.r item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= mVar.getCount()) ? null : mVar.getItem(i);
            x.r rVar = this.r;
            if (rVar != item) {
                x.p pVar = mVar.f1058b;
                if (rVar != null) {
                    this.f1312q.e(pVar, rVar);
                }
                this.r = item;
                if (item != null) {
                    this.f1312q.b(pVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f1310o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f1311p) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ((x.m) getAdapter()).f1058b.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0023g0 interfaceC0023g0) {
        this.f1312q = interfaceC0023g0;
    }

    @Override // y.V, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
