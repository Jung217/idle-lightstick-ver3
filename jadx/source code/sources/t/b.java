package t;

import android.view.View;
import android.widget.AdapterView;
import y.J0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J0 f781c;

    public b(J0 j0, d dVar) {
        this.f781c = j0;
        this.f780b = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        x.q qVar = (x.q) this.f781c.f1194g;
        d dVar = this.f780b;
        qVar.onClick(dVar.f783b, i);
        dVar.f783b.dismiss();
    }
}
