package n;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f645d;

    public b(Context context, a aVar, int i, String str) {
        this.f642a = context;
        this.f643b = aVar;
        this.f644c = i;
        this.f645d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e eVarB = f.b(this.f642a, this.f643b, this.f644c);
        Typeface typeface = eVarB.f653a;
        if (typeface != null) {
            f.f655a.b(this.f645d, typeface);
        }
        return eVarB;
    }
}
