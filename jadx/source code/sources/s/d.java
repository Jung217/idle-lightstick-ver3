package s;

import android.database.DataSetObserver;
import y.AbstractC0021f0;
import y.w0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f746b;

    public /* synthetic */ d(int i, Object obj) {
        this.f745a = i;
        this.f746b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f745a) {
            case 0:
                w0 w0Var = (w0) this.f746b;
                w0Var.f747b = true;
                w0Var.notifyDataSetChanged();
                break;
            default:
                AbstractC0021f0 abstractC0021f0 = (AbstractC0021f0) this.f746b;
                if (abstractC0021f0.f1306z.isShowing()) {
                    abstractC0021f0.c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f745a) {
            case 0:
                w0 w0Var = (w0) this.f746b;
                w0Var.f747b = false;
                w0Var.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC0021f0) this.f746b).dismiss();
                break;
        }
    }
}
