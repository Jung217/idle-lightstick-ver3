package t;

import android.support.v7.widget.Toolbar;
import android.view.View;
import y.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f779c;

    public /* synthetic */ a(int i, Object obj) {
        this.f778b = i;
        this.f779c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f778b) {
            case 0:
                d dVar = (d) this.f779c;
                dVar.f799t.obtainMessage(1, dVar.f783b).sendToTarget();
                break;
            case 1:
                ((w.a) this.f779c).a();
                break;
            default:
                B0 b0 = ((Toolbar) this.f779c).K;
                x.r rVar = b0 == null ? null : b0.f1138c;
                if (rVar != null) {
                    rVar.collapseActionView();
                }
                break;
        }
    }
}
