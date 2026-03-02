package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.h;
import android.util.Log;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p.j;
import y.B;
import y.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.arch.lifecycle.f f625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.e f626b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f625a = new f();
        } else if (i >= 26) {
            f625a = new e();
        } else {
            Method method = d.f629o;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f625a = new d();
            } else {
                f625a = new c();
            }
        }
        f626b = new p.e(16);
    }

    public static Typeface a(Context context, j.a aVar, Resources resources, int i, int i2, B b2) {
        Typeface typefaceG;
        if (aVar instanceof j.d) {
            j.d dVar = (j.d) aVar;
            boolean z2 = dVar.f623c == 0;
            int i3 = dVar.f622b;
            n.a aVar2 = dVar.f621a;
            p.e eVar = n.f.f655a;
            String str = aVar2.f641e + "-" + i2;
            typefaceG = (Typeface) n.f.f655a.a(str);
            if (typefaceG != null) {
                M m2 = (M) b2.f1136c;
                WeakReference weakReference = (WeakReference) b2.f1135b;
                if (m2.f1213k) {
                    m2.f1212j = typefaceG;
                    TextView textView = (TextView) weakReference.get();
                    if (textView != null) {
                        textView.setTypeface(typefaceG, m2.i);
                    }
                }
            } else if (z2 && i3 == -1) {
                n.e eVarB = n.f.b(context, aVar2, i2);
                int i4 = eVarB.f654b;
                if (i4 == 0) {
                    b2.c(eVarB.f653a);
                } else {
                    b2.b(i4);
                }
                typefaceG = eVarB.f653a;
            } else {
                n.b bVar = new n.b(context, aVar2, i2, str);
                if (z2) {
                    try {
                        typefaceG = ((n.e) n.f.f656b.m(bVar, i3)).f653a;
                    } catch (InterruptedException unused) {
                        typefaceG = null;
                    }
                } else {
                    n.c cVar = new n.c(0, b2);
                    synchronized (n.f.f657c) {
                        try {
                            j jVar = n.f.f658d;
                            if (jVar.containsKey(str)) {
                                ((ArrayList) jVar.get(str)).add(cVar);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(cVar);
                                jVar.put(str, arrayList);
                                h hVar = n.f.f656b;
                                n.c cVar2 = new n.c(1, str);
                                hVar.getClass();
                                hVar.l(new n.h(bVar, new Handler(), cVar2));
                            }
                        } finally {
                        }
                    }
                }
                typefaceG = null;
            }
        } else {
            typefaceG = f625a.g(context, (j.b) aVar, resources, i2);
            if (typefaceG != null) {
                b2.c(typefaceG);
            } else {
                b2.b(-3);
            }
        }
        if (typefaceG != null) {
            f626b.b(b(resources, i, i2), typefaceG);
        }
        return typefaceG;
    }

    public static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
