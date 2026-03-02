package y;

import android.content.Context;
import android.view.View;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0022g extends x.z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1307l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0030k f1308m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022g(C0030k c0030k, Context context, x.p pVar, View view) {
        super(context, pVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f1308m = c0030k;
        this.f1128f = 8388613;
        android.arch.lifecycle.i iVar = c0030k.f1345y;
        this.f1130h = iVar;
        x.x xVar = this.i;
        if (xVar != null) {
            xVar.g(iVar);
        }
    }

    @Override // x.z
    public final void c() {
        switch (this.f1307l) {
            case 0:
                C0030k c0030k = this.f1308m;
                c0030k.f1342v = null;
                c0030k.getClass();
                super.c();
                break;
            default:
                C0030k c0030k2 = this.f1308m;
                x.p pVar = c0030k2.f1326d;
                if (pVar != null) {
                    pVar.c(true);
                }
                c0030k2.f1341u = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022g(C0030k c0030k, Context context, x.H h2, View view) {
        super(context, h2, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f1308m = c0030k;
        if ((h2.f994A.f1112x & 32) != 32) {
            View view2 = c0030k.f1331j;
            this.f1127e = view2 == null ? (View) c0030k.i : view2;
        }
        android.arch.lifecycle.i iVar = c0030k.f1345y;
        this.f1130h = iVar;
        x.x xVar = this.i;
        if (xVar != null) {
            xVar.g(iVar);
        }
    }
}
