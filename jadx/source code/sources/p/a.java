package p;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements Map {
    public android.support.v4.app.h i;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.i == null) {
            this.i = new android.support.v4.app.h(this);
        }
        android.support.v4.app.h hVar = this.i;
        if (((g) hVar.f93a) == null) {
            hVar.f93a = new g(hVar, 0);
        }
        return (g) hVar.f93a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.i == null) {
            this.i = new android.support.v4.app.h(this);
        }
        android.support.v4.app.h hVar = this.i;
        if (((g) hVar.f94b) == null) {
            hVar.f94b = new g(hVar, 1);
        }
        return (g) hVar.f94b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f706d;
        int i = this.f706d;
        int[] iArr = this.f704b;
        if (iArr.length < size) {
            Object[] objArr = this.f705c;
            a(size);
            if (this.f706d > 0) {
                System.arraycopy(iArr, 0, this.f704b, 0, i);
                System.arraycopy(objArr, 0, this.f705c, 0, i << 1);
            }
            j.b(iArr, objArr, i);
        }
        if (this.f706d != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.i == null) {
            this.i = new android.support.v4.app.h(this);
        }
        android.support.v4.app.h hVar = this.i;
        if (((i) hVar.f95c) == null) {
            hVar.f95c = new i(hVar);
        }
        return (i) hVar.f95c;
    }
}
