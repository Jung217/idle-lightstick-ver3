package x;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1122b;

    public y(z zVar) {
        this.f1122b = zVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1122b.c();
    }
}
