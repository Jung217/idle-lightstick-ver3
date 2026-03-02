package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f306b;

    public a(SearchView searchView) {
        this.f306b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f306b;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f265q;
        if (view == searchView.f268u) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.M;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f270w) {
            searchView.k();
            return;
        }
        if (view == searchView.f269v) {
            searchView.o();
            return;
        }
        String strFlattenToShortString = null;
        if (view != searchView.f271x) {
            if (view == searchAutoComplete) {
                e.c cVar = SearchView.h0;
                Method method = (Method) cVar.f473a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, null);
                    } catch (Exception unused) {
                    }
                }
                Method method2 = (Method) cVar.f474b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchAutoComplete, null);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.j(searchView.J, searchableInfo));
                    return;
                }
                return;
            }
            Intent intent = new Intent(searchView.I);
            ComponentName searchActivity = searchableInfo.getSearchActivity();
            if (searchActivity != null) {
                strFlattenToShortString = searchActivity.flattenToShortString();
            }
            intent.putExtra("calling_package", strFlattenToShortString);
            searchView.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused3) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
