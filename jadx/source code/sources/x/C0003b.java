package x;

import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import y.C0022g;
import y.C0024h;
import y.C0028j;
import y.C0030k;
import y.Y;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0003b extends Y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1011j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f1012k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1012k = actionMenuItemView;
    }

    @Override // y.Y
    public final F b() {
        C0022g c0022g;
        switch (this.f1011j) {
            case 0:
                AbstractC0004c abstractC0004c = ((ActionMenuItemView) this.f1012k).f173j;
                if (abstractC0004c == null || (c0022g = ((C0024h) abstractC0004c).f1309a.f1342v) == null) {
                    return null;
                }
                return c0022g.a();
            default:
                C0022g c0022g2 = ((C0028j) this.f1012k).f1315d.f1341u;
                if (c0022g2 == null) {
                    return null;
                }
                return c0022g2.a();
        }
    }

    @Override // y.Y
    public final boolean c() {
        F fB;
        switch (this.f1011j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1012k;
                o oVar = actionMenuItemView.f172h;
                return oVar != null && oVar.b(actionMenuItemView.f169e) && (fB = b()) != null && fB.i();
            default:
                ((C0028j) this.f1012k).f1315d.l();
                return true;
        }
    }

    @Override // y.Y
    public boolean d() {
        switch (this.f1011j) {
            case 1:
                C0030k c0030k = ((C0028j) this.f1012k).f1315d;
                if (c0030k.f1343w != null) {
                    return false;
                }
                c0030k.i();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003b(C0028j c0028j, C0028j c0028j2) {
        super(c0028j2);
        this.f1012k = c0028j;
    }
}
