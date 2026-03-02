package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Collection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.app.h f699b;

    public i(android.support.v4.app.h hVar) {
        this.f699b = hVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f699b.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f699b.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f699b.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f699b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        android.support.v4.app.h hVar = this.f699b;
        int iF = hVar.f(obj);
        if (iF < 0) {
            return false;
        }
        hVar.g(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        android.support.v4.app.h hVar = this.f699b;
        int iD = hVar.d();
        int i = 0;
        boolean z2 = false;
        while (i < iD) {
            if (collection.contains(hVar.b(i, 1))) {
                hVar.g(i);
                i--;
                iD--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        android.support.v4.app.h hVar = this.f699b;
        int iD = hVar.d();
        int i = 0;
        boolean z2 = false;
        while (i < iD) {
            if (!collection.contains(hVar.b(i, 1))) {
                hVar.g(i);
                i--;
                iD--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f699b.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f699b.n(objArr, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        android.support.v4.app.h hVar = this.f699b;
        int iD = hVar.d();
        Object[] objArr = new Object[iD];
        for (int i = 0; i < iD; i++) {
            objArr[i] = hVar.b(i, 1);
        }
        return objArr;
    }
}
