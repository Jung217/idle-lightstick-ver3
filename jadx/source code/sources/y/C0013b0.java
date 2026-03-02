package y;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: y.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0013b0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1275c;

    public /* synthetic */ C0013b0(int i, Object obj) {
        this.f1274b = i;
        this.f1275c = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        V v2;
        switch (this.f1274b) {
            case 0:
                if (i != -1 && (v2 = ((AbstractC0021f0) this.f1275c).f1286d) != null) {
                    v2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f1275c).m(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f1274b;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
