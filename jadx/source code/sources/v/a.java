package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import y.C0043v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f919a = null;

    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static Drawable a(Context context, int i) {
        return C0043v.e().f(context, i);
    }
}
