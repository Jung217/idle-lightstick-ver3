package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.j f92b = new p.j();

    public static void a(Context context, String str, Bundle bundle) {
        try {
            p.j jVar = f92b;
            Class<?> clsLoadClass = (Class) jVar.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                jVar.put(str, clsLoadClass);
            }
            e.a(clsLoadClass.getConstructor(null).newInstance(null));
            if (bundle != null) {
                throw null;
            }
        } catch (ClassNotFoundException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }
}
