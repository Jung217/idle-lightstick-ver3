package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f691e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.app.h f692f;

    public f(android.support.v4.app.h hVar, int i) {
        this.f692f = hVar;
        this.f688b = i;
        this.f689c = hVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f690d < this.f689c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = this.f692f.b(this.f690d, this.f688b);
        this.f690d++;
        this.f691e = true;
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f691e) {
            throw new IllegalStateException();
        }
        int i = this.f690d - 1;
        this.f690d = i;
        this.f689c--;
        this.f691e = false;
        this.f692f.g(i);
    }
}
