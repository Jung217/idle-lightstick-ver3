package y;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: renamed from: y.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033l0 implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f1346b;

    public C0033l0(SearchView searchView) {
        this.f1346b = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f1346b;
        Editable text = searchView.f265q.getText();
        searchView.W = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.t(!zIsEmpty);
        int i4 = 8;
        if (searchView.V && !searchView.O && zIsEmpty) {
            searchView.f269v.setVisibility(8);
            i4 = 0;
        }
        searchView.f271x.setVisibility(i4);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
