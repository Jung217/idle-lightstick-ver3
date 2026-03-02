package android.support.v7.widget;

import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f308b;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f308b = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f308b;
        if (searchAutoComplete.f276g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f276g = false;
        }
    }
}
