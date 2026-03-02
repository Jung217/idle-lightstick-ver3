package y;

import android.content.Context;
import android.view.View;
import android.view.Window;
import x.C0002a;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0002a f1152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f1153c;

    public F0(G0 g0) {
        this.f1153c = g0;
        Context context = g0.f1156a.getContext();
        CharSequence charSequence = g0.f1163h;
        C0002a c0002a = new C0002a();
        c0002a.f1000e = 4096;
        c0002a.f1002g = 4096;
        c0002a.f1006l = null;
        c0002a.f1007m = null;
        c0002a.f1008n = false;
        c0002a.f1009o = false;
        c0002a.f1010p = 16;
        c0002a.i = context;
        c0002a.f996a = charSequence;
        this.f1152b = c0002a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        G0 g0 = this.f1153c;
        Window.Callback callback = g0.f1165k;
        if (callback == null || !g0.f1166l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1152b);
    }
}
