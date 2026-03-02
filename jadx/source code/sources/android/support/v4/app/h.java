package android.support.v4.app;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import x.E;
import x.p;
import x.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f94b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f95c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f96d;

    public h(t.f fVar) {
        this.f94b = fVar;
        A.h hVar = fVar.f805c;
        this.f96d = new k();
        this.f93a = fVar;
        if (hVar == null) {
            throw new NullPointerException("handler == null");
        }
        this.f95c = hVar;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public void a() {
        ((p.a) this.f96d).clear();
    }

    public Object b(int i, int i2) {
        return ((p.a) this.f96d).f705c[(i << 1) + i2];
    }

    public Map c() {
        return (p.a) this.f96d;
    }

    public int d() {
        return ((p.a) this.f96d).f706d;
    }

    public int e(Object obj) {
        p.a aVar = (p.a) this.f96d;
        return obj == null ? aVar.d() : aVar.c(obj.hashCode(), obj);
    }

    public int f(Object obj) {
        return ((p.a) this.f96d).e(obj);
    }

    public void g(int i) {
        ((p.a) this.f96d).f(i);
    }

    public w.e i(w.a aVar) {
        ArrayList arrayList = (ArrayList) this.f95c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w.e eVar = (w.e) arrayList.get(i);
            if (eVar != null && eVar.f932b == aVar) {
                return eVar;
            }
        }
        w.e eVar2 = new w.e((Context) this.f94b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public boolean j(w.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f93a).onActionItemClicked(i(aVar), new w((Context) this.f94b, (m.a) menuItem));
    }

    public boolean k(w.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f93a;
        w.e eVarI = i(aVar);
        p.j jVar = (p.j) this.f96d;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            E e2 = new E((Context) this.f94b, (p) menu);
            jVar.put(menu, e2);
            menu2 = e2;
        }
        return callback.onCreateActionMode(eVarI, menu2);
    }

    public void l(Runnable runnable) {
        synchronized (this.f93a) {
            try {
                if (((HandlerThread) this.f94b) == null) {
                    HandlerThread handlerThread = new HandlerThread("fonts", 10);
                    this.f94b = handlerThread;
                    handlerThread.start();
                    this.f95c = new Handler(((HandlerThread) this.f94b).getLooper(), (n.g) this.f96d);
                }
                ((Handler) this.f95c).removeMessages(0);
                Handler handler = (Handler) this.f95c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object m(n.b bVar, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        l(new n.i(atomicReference, bVar, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                Object obj = atomicReference.get();
                reentrantLock.unlock();
                return obj;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    Object obj2 = atomicReference.get();
                    reentrantLock.unlock();
                    return obj2;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object[] n(Object[] objArr, int i) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }

    public h(p.a aVar) {
        this.f96d = aVar;
    }

    public h() {
        this.f93a = new Object();
        this.f96d = new n.g(this);
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f94b = context;
        this.f93a = callback;
        this.f95c = new ArrayList();
        this.f96d = new p.j();
    }
}
