package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends android.arch.lifecycle.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Class f627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Constructor f628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Method f629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Method f630p;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f628n = constructor;
        f627m = cls;
        f629o = method2;
        f630p = method;
    }

    public static boolean x(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) f629o.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Typeface y(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f627m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f630p.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // android.arch.lifecycle.f
    public final Typeface g(Context context, j.b bVar, Resources resources, int i) {
        InputStream inputStreamOpenRawResource;
        MappedByteBuffer map;
        try {
            InputStream inputStream = null;
            Object objNewInstance = f628n.newInstance(null);
            for (j.c cVar : bVar.f614a) {
                int i2 = cVar.f620f;
                File fileM = android.arch.lifecycle.f.m(context);
                if (fileM != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        boolean zF = android.arch.lifecycle.f.f(fileM, inputStreamOpenRawResource);
                        try {
                            android.arch.lifecycle.f.e(inputStreamOpenRawResource);
                            if (zF) {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(fileM);
                                    try {
                                        FileChannel channel = fileInputStream.getChannel();
                                        map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } finally {
                                        }
                                    }
                                } catch (IOException unused) {
                                    map = null;
                                }
                                if (map == null || !x(objNewInstance, map, cVar.f619e, cVar.f616b, cVar.f617c)) {
                                    return null;
                                }
                            }
                        } finally {
                            fileM.delete();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStreamOpenRawResource;
                        android.arch.lifecycle.f.e(inputStream);
                        throw th;
                    }
                }
                map = null;
                if (map == null) {
                }
                return null;
            }
            return y(objNewInstance);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // android.arch.lifecycle.f
    public final Typeface h(Context context, n.d[] dVarArr, int i) {
        try {
            Object objNewInstance = f628n.newInstance(null);
            j jVar = new j();
            for (n.d dVar : dVarArr) {
                Uri uri = dVar.f648a;
                ByteBuffer byteBufferO = (ByteBuffer) jVar.get(uri);
                if (byteBufferO == null) {
                    byteBufferO = android.arch.lifecycle.f.o(context, uri);
                    jVar.put(uri, byteBufferO);
                }
                if (!x(objNewInstance, byteBufferO, dVar.f649b, dVar.f650c, dVar.f651d)) {
                    return null;
                }
            }
            return Typeface.create(y(objNewInstance), i);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
