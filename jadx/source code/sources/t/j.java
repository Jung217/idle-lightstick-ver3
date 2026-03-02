package t;

import android.view.View;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends android.arch.lifecycle.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f819n;

    public /* synthetic */ j(int i, Object obj) {
        this.f818m = i;
        this.f819n = obj;
    }

    @Override // q.q
    public final void a() {
        int i = this.f818m;
        Object obj = this.f819n;
        switch (i) {
            case 0:
                n nVar = ((h) obj).f815c;
                nVar.f849m.setAlpha(1.0f);
                nVar.f852p.d(null);
                nVar.f852p = null;
                break;
            case 1:
                n nVar2 = (n) obj;
                nVar2.f849m.setAlpha(1.0f);
                nVar2.f852p.d(null);
                nVar2.f852p = null;
                break;
            default:
                n nVar3 = (n) ((c.j) obj).f370b;
                nVar3.f849m.setVisibility(8);
                PopupWindow popupWindow = nVar3.f850n;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (nVar3.f849m.getParent() instanceof View) {
                    View view = (View) nVar3.f849m.getParent();
                    WeakHashMap weakHashMap = q.l.f728a;
                    view.requestApplyInsets();
                }
                nVar3.f849m.removeAllViews();
                nVar3.f852p.d(null);
                nVar3.f852p = null;
                break;
        }
    }

    @Override // android.arch.lifecycle.f, q.q
    public void c() {
        int i = this.f818m;
        Object obj = this.f819n;
        switch (i) {
            case 0:
                ((h) obj).f815c.f849m.setVisibility(0);
                break;
            case 1:
                n nVar = (n) obj;
                nVar.f849m.setVisibility(0);
                nVar.f849m.sendAccessibilityEvent(32);
                if (nVar.f849m.getParent() instanceof View) {
                    View view = (View) nVar.f849m.getParent();
                    WeakHashMap weakHashMap = q.l.f728a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
