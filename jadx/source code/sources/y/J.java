package y;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import x.ViewTreeObserverOnGlobalLayoutListenerC0007f;

/* JADX INFO: loaded from: classes.dex */
public final class J implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0007f f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f1187c;

    public J(K k2, ViewTreeObserverOnGlobalLayoutListenerC0007f viewTreeObserverOnGlobalLayoutListenerC0007f) {
        this.f1187c = k2;
        this.f1186b = viewTreeObserverOnGlobalLayoutListenerC0007f;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1187c.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1186b);
        }
    }
}
