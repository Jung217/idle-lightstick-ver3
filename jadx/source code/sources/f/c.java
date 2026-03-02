package f;

import e.i;
import g.h;
import g.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f532f;
    public i i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f527a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f533g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f534h = -1;

    public c(d dVar, int i) {
        this.f530d = dVar;
        this.f531e = i;
    }

    public final void a(c cVar, int i, int i2) {
        if (cVar == null) {
            g();
            return;
        }
        this.f532f = cVar;
        if (cVar.f527a == null) {
            cVar.f527a = new HashSet();
        }
        HashSet hashSet = this.f532f.f527a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f533g = i;
        } else {
            this.f533g = 0;
        }
        this.f534h = i2;
    }

    public final void b(int i, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f527a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                h.b(((c) it.next()).f530d, i, arrayList, oVar);
            }
        }
    }

    public final int c() {
        if (this.f529c) {
            return this.f528b;
        }
        return 0;
    }

    public final int d() {
        c cVar;
        if (this.f530d.Z == 8) {
            return 0;
        }
        int i = this.f534h;
        return (i <= -1 || (cVar = this.f532f) == null || cVar.f530d.Z != 8) ? this.f533g : i;
    }

    public final boolean e() {
        c cVar;
        HashSet<c> hashSet = this.f527a;
        if (hashSet == null) {
            return false;
        }
        for (c cVar2 : hashSet) {
            d dVar = cVar2.f530d;
            int i = cVar2.f531e;
            switch (c.b.a(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = dVar.D;
                    break;
                case 2:
                    cVar = dVar.E;
                    break;
                case 3:
                    cVar = dVar.B;
                    break;
                case 4:
                    cVar = dVar.C;
                    break;
                default:
                    throw new AssertionError(android.support.v4.app.e.b(i));
            }
            if (cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f532f != null;
    }

    public final void g() {
        HashSet hashSet;
        c cVar = this.f532f;
        if (cVar != null && (hashSet = cVar.f527a) != null) {
            hashSet.remove(this);
            if (this.f532f.f527a.size() == 0) {
                this.f532f.f527a = null;
            }
        }
        this.f527a = null;
        this.f532f = null;
        this.f533g = 0;
        this.f534h = -1;
        this.f529c = false;
        this.f528b = 0;
    }

    public final void h() {
        i iVar = this.i;
        if (iVar == null) {
            this.i = new i(1);
        } else {
            iVar.c();
        }
    }

    public final void i(int i) {
        this.f528b = i;
        this.f529c = true;
    }

    public final String toString() {
        return this.f530d.a0 + ":" + android.support.v4.app.e.b(this.f531e);
    }
}
