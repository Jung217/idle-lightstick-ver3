package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.app.h f694c;

    public /* synthetic */ g(android.support.v4.app.h hVar, int i) {
        this.f693b = i;
        this.f694c = hVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f693b) {
            case 0:
                android.support.v4.app.h hVar = this.f694c;
                int iD = hVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((a) hVar.f96d).put(entry.getKey(), entry.getValue());
                }
                return iD != hVar.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f693b) {
            case 0:
                this.f694c.a();
                break;
            default:
                this.f694c.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f693b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                android.support.v4.app.h hVar = this.f694c;
                int iE = hVar.e(key);
                if (iE < 0) {
                    return false;
                }
                Object objB = hVar.b(iE, 1);
                Object value = entry.getValue();
                return objB == value || (objB != null && objB.equals(value));
            default:
                return this.f694c.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f693b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapC = this.f694c.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapC.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f693b) {
        }
        return android.support.v4.app.h.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f693b) {
            case 0:
                android.support.v4.app.h hVar = this.f694c;
                int iHashCode = 0;
                for (int iD = hVar.d() - 1; iD >= 0; iD--) {
                    Object objB = hVar.b(iD, 0);
                    Object objB2 = hVar.b(iD, 1);
                    iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
                }
                return iHashCode;
            default:
                android.support.v4.app.h hVar2 = this.f694c;
                int iHashCode2 = 0;
                for (int iD2 = hVar2.d() - 1; iD2 >= 0; iD2--) {
                    Object objB3 = hVar2.b(iD2, 0);
                    iHashCode2 += objB3 == null ? 0 : objB3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f693b) {
            case 0:
                if (this.f694c.d() == 0) {
                }
                break;
            default:
                if (this.f694c.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f693b) {
            case 0:
                return new h(this.f694c);
            default:
                return new f(this.f694c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                android.support.v4.app.h hVar = this.f694c;
                int iE = hVar.e(obj);
                if (iE < 0) {
                    return false;
                }
                hVar.g(iE);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapC = this.f694c.c();
                int size = mapC.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapC.remove(it.next());
                }
                return size != mapC.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapC = this.f694c.c();
                int size = mapC.size();
                Iterator it = mapC.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapC.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f693b) {
        }
        return this.f694c.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f694c.n(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f693b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                android.support.v4.app.h hVar = this.f694c;
                int iD = hVar.d();
                Object[] objArr = new Object[iD];
                for (int i = 0; i < iD; i++) {
                    objArr[i] = hVar.b(i, 0);
                }
                return objArr;
        }
    }
}
