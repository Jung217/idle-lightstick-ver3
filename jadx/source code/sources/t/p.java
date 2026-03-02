package t;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f866e;

    public p(View view, String str) {
        this.f863b = view;
        this.f864c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f865d == null) {
            View view2 = this.f863b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f864c;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f865d = method;
                        this.f866e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f865d.invoke(this.f866e, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
