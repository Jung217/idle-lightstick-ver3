package x;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionProvider f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.arch.lifecycle.i f1119b;

    public v(w wVar, ActionProvider actionProvider) {
        this.f1118a = actionProvider;
    }

    public final View a(r rVar) {
        return this.f1118a.onCreateActionView(rVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        android.arch.lifecycle.i iVar = this.f1119b;
        if (iVar != null) {
            p pVar = ((r) iVar.f46b).f1103n;
            pVar.f1072h = true;
            pVar.p(true);
        }
    }
}
