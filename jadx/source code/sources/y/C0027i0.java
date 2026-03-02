package y;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: y.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027i0 extends AbstractC0021f0 implements InterfaceC0023g0 {
    public static final Method E;
    public android.arch.lifecycle.i D;

    static {
        try {
            E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // y.AbstractC0021f0
    public final V a(Context context, boolean z2) {
        C0025h0 c0025h0 = new C0025h0(context, z2);
        c0025h0.setHoverListener(this);
        return c0025h0;
    }

    @Override // y.InterfaceC0023g0
    public final void b(x.p pVar, x.r rVar) {
        android.arch.lifecycle.i iVar = this.D;
        if (iVar != null) {
            iVar.b(pVar, rVar);
        }
    }

    @Override // y.InterfaceC0023g0
    public final void e(x.p pVar, MenuItem menuItem) {
        android.arch.lifecycle.i iVar = this.D;
        if (iVar != null) {
            iVar.e(pVar, menuItem);
        }
    }
}
