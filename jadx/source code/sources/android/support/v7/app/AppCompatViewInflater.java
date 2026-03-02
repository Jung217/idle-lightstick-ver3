package android.support.v7.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f164b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f165c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f166d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f167e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f168a = new Object[2];

    public final View a(Context context, String str, String str2) {
        a aVar = f167e;
        Constructor constructor = (Constructor) aVar.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2.concat(str) : str).asSubclass(View.class).getConstructor(f164b);
                aVar.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f168a);
    }
}
