package android.arch.lifecycle;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.k;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import x.A;
import x.H;
import x.RunnableC0009h;
import x.j;
import x.n;
import x.p;
import x.r;
import y.C0030k;
import y.InterfaceC0023g0;
import y.InterfaceC0036n;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0023g0, A, n, InterfaceC0036n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46b;

    public /* synthetic */ i(Object obj) {
        this.f46b = obj;
    }

    @Override // x.A
    public void a(p pVar, boolean z2) {
        if (pVar instanceof H) {
            ((H) pVar).f995z.k().c(false);
        }
        A a2 = ((C0030k) this.f46b).f1328f;
        if (a2 != null) {
            a2.a(pVar, z2);
        }
    }

    @Override // y.InterfaceC0023g0
    public void b(p pVar, r rVar) {
        j jVar = (j) this.f46b;
        Handler handler = jVar.f1032g;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = jVar.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (pVar == ((x.i) arrayList.get(i)).f1025b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0009h(this, i2 < arrayList.size() ? (x.i) arrayList.get(i2) : null, rVar, pVar), pVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // x.n
    public boolean d(p pVar, MenuItem menuItem) {
        InterfaceC0036n interfaceC0036n = ((ActionMenuView) this.f46b).f253z;
        if (interfaceC0036n == null) {
            return false;
        }
        ((Toolbar) ((i) interfaceC0036n).f46b).getClass();
        return false;
    }

    @Override // y.InterfaceC0023g0
    public void e(p pVar, MenuItem menuItem) {
        ((j) this.f46b).f1032g.removeCallbacksAndMessages(pVar);
    }

    @Override // x.A
    public boolean f(p pVar) {
        C0030k c0030k = (C0030k) this.f46b;
        if (pVar == null) {
            return false;
        }
        ((H) pVar).f994A.getClass();
        c0030k.getClass();
        A a2 = c0030k.f1328f;
        if (a2 != null) {
            return a2.f(pVar);
        }
        return false;
    }

    public void g() {
        k kVar = (k) ((android.support.v4.app.h) this.f46b).f96d;
        kVar.getClass();
        kVar.f108l = false;
        kVar.f109m = false;
        ArrayList arrayList = kVar.f101d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) != null) {
                throw new ClassCastException();
            }
        }
    }

    public i() {
        this.f46b = new HashMap();
    }

    @Override // x.n
    public void c(p pVar) {
    }
}
