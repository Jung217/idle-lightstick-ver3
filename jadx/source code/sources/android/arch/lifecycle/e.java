package android.arch.lifecycle;

import a.C0000a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0000a f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33d;

    public e(t.f fVar) {
        C0000a c0000a = new C0000a();
        c0000a.f21b = new WeakHashMap();
        new HashMap();
        this.f30a = c0000a;
        this.f33d = false;
        new ArrayList();
        this.f32c = new WeakReference(fVar);
        this.f31b = b.f23c;
    }

    public final void a(b bVar) {
        if (this.f31b == bVar) {
            return;
        }
        this.f31b = bVar;
        if (this.f33d) {
            return;
        }
        this.f33d = true;
        if (((c) this.f32c.get()) == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
        } else {
            this.f30a.getClass();
        }
        this.f33d = false;
    }
}
