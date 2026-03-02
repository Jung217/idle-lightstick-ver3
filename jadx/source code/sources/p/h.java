package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f695b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.app.h f698e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f697d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f696c = -1;

    public h(android.support.v4.app.h hVar) {
        this.f698e = hVar;
        this.f695b = hVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f697d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f696c;
        android.support.v4.app.h hVar = this.f698e;
        Object objB = hVar.b(i, 0);
        if (key != objB && (key == null || !key.equals(objB))) {
            return false;
        }
        Object value = entry.getValue();
        Object objB2 = hVar.b(this.f696c, 1);
        return value == objB2 || (value != null && value.equals(objB2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f697d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f698e.b(this.f696c, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f697d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f698e.b(this.f696c, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f696c < this.f695b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f697d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f696c;
        android.support.v4.app.h hVar = this.f698e;
        Object objB = hVar.b(i, 0);
        Object objB2 = hVar.b(this.f696c, 1);
        return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f696c++;
        this.f697d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f697d) {
            throw new IllegalStateException();
        }
        this.f698e.g(this.f696c);
        this.f696c--;
        this.f695b--;
        this.f697d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f697d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = (this.f696c << 1) + 1;
        Object[] objArr = ((a) this.f698e.f96d).f705c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
