package android.support.v4.app;

import java.io.PrintWriter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.f f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoaderManagerImpl$LoaderViewModel f128b;

    public n(t.f fVar, android.arch.lifecycle.i iVar) {
        this.f127a = fVar;
        String canonicalName = LoaderManagerImpl$LoaderViewModel.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strConcat = "android.arch.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        Object loaderManagerImpl$LoaderViewModel = (android.arch.lifecycle.h) ((HashMap) iVar.f46b).get(strConcat);
        if (!LoaderManagerImpl$LoaderViewModel.class.isInstance(loaderManagerImpl$LoaderViewModel)) {
            loaderManagerImpl$LoaderViewModel = new LoaderManagerImpl$LoaderViewModel();
            android.arch.lifecycle.h hVar = (android.arch.lifecycle.h) ((HashMap) iVar.f46b).put(strConcat, loaderManagerImpl$LoaderViewModel);
            if (hVar != null) {
                hVar.a();
            }
        }
        this.f128b = (LoaderManagerImpl$LoaderViewModel) loaderManagerImpl$LoaderViewModel;
    }

    public final void a(String str, PrintWriter printWriter) {
        p.k kVar = this.f128b.f62a;
        if (kVar.f710d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (kVar.f710d <= 0) {
                return;
            }
            if (kVar.f709c[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(kVar.f708b[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        p.b.c(this.f127a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
