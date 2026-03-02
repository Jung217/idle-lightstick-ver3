package a;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakHashMap f21b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0000a)) {
            return false;
        }
        C0000a c0000a = (C0000a) obj;
        c0000a.getClass();
        iterator();
        c0000a.iterator();
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0001b c0001b = new C0001b();
        this.f21b.put(c0001b, Boolean.FALSE);
        return c0001b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
