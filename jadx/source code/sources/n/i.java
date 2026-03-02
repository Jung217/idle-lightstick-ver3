package n;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Condition f668f;

    public i(AtomicReference atomicReference, b bVar, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f664b = atomicReference;
        this.f665c = bVar;
        this.f666d = reentrantLock;
        this.f667e = atomicBoolean;
        this.f668f = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f664b.set(this.f665c.call());
        } catch (Exception unused) {
        }
        ReentrantLock reentrantLock = this.f666d;
        reentrantLock.lock();
        try {
            this.f667e.set(false);
            this.f668f.signal();
        } finally {
            reentrantLock.unlock();
        }
    }
}
