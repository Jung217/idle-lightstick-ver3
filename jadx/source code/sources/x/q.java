package x;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class q implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f1087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t.e f1088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f1089d;

    @Override // x.A
    public final void a(p pVar, boolean z2) {
        t.e eVar;
        if ((z2 || pVar == this.f1087b) && (eVar = this.f1088c) != null) {
            eVar.dismiss();
        }
    }

    @Override // x.A
    public final boolean f(p pVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        H h2 = this.f1087b;
        l lVar = this.f1089d;
        if (lVar.f1057g == null) {
            lVar.f1057g = new k(lVar);
        }
        h2.q(lVar.f1057g.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1089d.a(this.f1087b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        H h2 = this.f1087b;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1088c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1088c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                h2.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return h2.performShortcut(i, keyEvent, 0);
    }
}
