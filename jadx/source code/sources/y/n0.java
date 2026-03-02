package y;

import android.support.v7.widget.SearchView;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f1355a;

    public n0(SearchView searchView) {
        this.f1355a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f1355a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.L;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
