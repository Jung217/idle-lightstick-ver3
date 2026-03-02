package y;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class I implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1175c;

    public /* synthetic */ I(int i, Object obj) {
        this.f1174b = i;
        this.f1175c = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        switch (this.f1174b) {
            case 0:
                K k2 = (K) this.f1175c;
                L l2 = k2.G;
                l2.setSelection(i);
                if (l2.getOnItemClickListener() != null) {
                    l2.performItemClick(view, i, k2.E.getItemId(i));
                }
                k2.dismiss();
                break;
            default:
                ((SearchView) this.f1175c).l(i);
                break;
        }
    }
}
