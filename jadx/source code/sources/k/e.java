package k;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import g.n;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Constructor f632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f635q;
    public final Method r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f636s;

    public e() throws NoSuchMethodException {
        Method methodD;
        Constructor<?> constructor;
        Method methodC;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodC = C(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodD = D(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodD = null;
            constructor = null;
            methodC = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f631m = cls;
        this.f632n = constructor;
        this.f633o = methodC;
        this.f634p = method;
        this.f635q = method2;
        this.r = method3;
        this.f636s = methodD;
    }

    public static Method C(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean A(Object obj) {
        try {
            return ((Boolean) this.f635q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Object B() {
        try {
            return this.f632n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Method D(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // android.arch.lifecycle.f
    public final Typeface g(Context context, j.b bVar, Resources resources, int i) {
        Method method = this.f633o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, bVar, resources, i);
        }
        Object objB = B();
        j.c[] cVarArr = bVar.f614a;
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            j.c cVar = cVarArr[i2];
            String str = cVar.f615a;
            int i3 = cVar.f619e;
            int i4 = cVar.f616b;
            boolean z2 = cVar.f617c;
            Context context2 = context;
            if (!y(context2, objB, str, i3, i4, z2 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f618d))) {
                x(objB);
                return null;
            }
            i2++;
            context = context2;
        }
        if (A(objB)) {
            return z(objB);
        }
        return null;
    }

    @Override // k.c, android.arch.lifecycle.f
    public final Typeface h(Context context, n.d[] dVarArr, int i) {
        if (dVarArr.length >= 1) {
            Method method = this.f633o;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                p.e eVar = n.f.f655a;
                HashMap map = new HashMap();
                int i2 = 0;
                for (n.d dVar : dVarArr) {
                    if (dVar.f652e == 0) {
                        Uri uri = dVar.f648a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, android.arch.lifecycle.f.o(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objB = B();
                int length = dVarArr.length;
                boolean z2 = false;
                while (i2 < length) {
                    n.d dVar2 = dVarArr[i2];
                    ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(dVar2.f648a);
                    if (byteBuffer != null) {
                        try {
                            if (!((Boolean) this.f634p.invoke(objB, byteBuffer, Integer.valueOf(dVar2.f649b), null, Integer.valueOf(dVar2.f650c), Integer.valueOf(dVar2.f651d ? 1 : 0))).booleanValue()) {
                                x(objB);
                                return null;
                            }
                            z2 = true;
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    i2++;
                    z2 = z2;
                }
                if (!z2) {
                    x(objB);
                    return null;
                }
                if (A(objB)) {
                    return Typeface.create(z(objB), i);
                }
            } else {
                n.d dVar3 = (n.d) android.arch.lifecycle.f.l(dVarArr, i, new n(1));
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(dVar3.f648a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            A.c.g();
                            Typeface typefaceBuild = A.c.d(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(dVar3.f650c).setItalic(dVar3.f651d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.arch.lifecycle.f
    public final Typeface i(Context context, Resources resources, int i, String str, int i2) {
        Method method = this.f633o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, resources, i, str, i2);
        }
        Object objB = B();
        if (!y(context, objB, str, 0, -1, -1, null)) {
            x(objB);
            return null;
        }
        if (A(objB)) {
            return z(objB);
        }
        return null;
    }

    public final void x(Object obj) {
        try {
            this.r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean y(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f633o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface z(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f631m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f636s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
