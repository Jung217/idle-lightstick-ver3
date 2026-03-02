package android.arch.lifecycle;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import g.n;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.k;
import q.l;
import q.q;
import y.I0;
import y.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements q, s.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f35b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f36c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f37d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f38e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f39f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Class f40g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f41h;
    public static Field i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f42j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f43k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f44l;

    public static int d(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean f(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            e(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = l.f728a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = k.f724d;
        k kVar = (k) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (kVar == null) {
            kVar = new k();
            kVar.f725a = null;
            kVar.f726b = null;
            kVar.f727c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, kVar);
        }
        WeakReference weakReference2 = kVar.f727c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        kVar.f727c = new WeakReference(keyEvent);
        if (kVar.f726b == null) {
            kVar.f726b = new SparseArray();
        }
        SparseArray sparseArray = kVar.f726b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean k(q.f fVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (fVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return fVar.a(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f34a) {
                            try {
                                f35b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f34a = true;
                        }
                        Method method = f35b;
                        if (method != null) {
                            try {
                                zBooleanValue = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (l.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f36c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f37d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f36c = true;
                }
                Field field = f37d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (l.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && l.b(view, keyEvent)) || fVar.a(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static Object l(Object[] objArr, int i2, n nVar) {
        int i3;
        boolean z2;
        int i4 = (i2 & 1) == 0 ? 400 : 700;
        boolean z3 = (i2 & 2) != 0;
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            switch (nVar.f598b) {
                case 1:
                    i3 = ((n.d) obj2).f650c;
                    break;
                default:
                    i3 = ((j.c) obj2).f616b;
                    break;
            }
            int iAbs = Math.abs(i3 - i4) * 2;
            switch (nVar.f598b) {
                case 1:
                    z2 = ((n.d) obj2).f651d;
                    break;
                default:
                    z2 = ((j.c) obj2).f617c;
                    break;
            }
            int i6 = iAbs + (z2 == z3 ? 0 : 1);
            if (obj == null || i5 > i6) {
                obj = obj2;
                i5 = i6;
            }
        }
        return obj;
    }

    public static File m(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(context.getCacheDir(), str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static o.a n(N n2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new o.a(n2.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(n2.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = n2.getBreakStrategy();
        int hyphenationFrequency = n2.getHyphenationFrequency();
        if (n2.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (n2.getInputType() & 15) != 3) {
            boolean z2 = n2.getLayoutDirection() == 1;
            switch (n2.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(n2.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new o.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static MappedByteBuffer o(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void p(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static j.a q(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            v(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b.a.f310a);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(4);
        String string3 = typedArrayObtainAttributes.getString(5);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(2, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                v(xmlResourceParser);
            }
            return new j.d(new n.a(string, string2, string3, r(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b.a.f311b);
                    int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string4 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                    int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                    String string5 = typedArrayObtainAttributes2.getString(i5);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        v(xmlResourceParser);
                    }
                    arrayList.add(new j.c(string5, i2, z2, string4, i4, resourceId2));
                } else {
                    v(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j.b((j.c[]) arrayList.toArray(new j.c[arrayList.size()]));
    }

    public static List r(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void s(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 - (-i3), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void t(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void u(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        I0 i0 = I0.f1176j;
        if (i0 != null && i0.f1178a == view) {
            I0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new I0(view, charSequence);
            return;
        }
        I0 i02 = I0.f1177k;
        if (i02 != null && i02.f1178a == view) {
            i02.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static ActionMode.Callback w(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof s.k)) ? callback : new s.k(callback, textView);
    }

    public Typeface g(Context context, j.b bVar, Resources resources, int i2) {
        j.c cVar = (j.c) l(bVar.f614a, i2, new n(2));
        if (cVar == null) {
            return null;
        }
        int i3 = cVar.f620f;
        Typeface typefaceI = k.b.f625a.i(context, resources, i3, cVar.f615a, i2);
        if (typefaceI != null) {
            k.b.f626b.b(k.b.b(resources, i3, i2), typefaceI);
        }
        return typefaceI;
    }

    public abstract Typeface h(Context context, n.d[] dVarArr, int i2);

    public Typeface i(Context context, Resources resources, int i2, String str, int i3) {
        InputStream inputStreamOpenRawResource;
        File fileM = m(context);
        try {
            if (fileM == null) {
                return null;
            }
            try {
                inputStreamOpenRawResource = resources.openRawResource(i2);
            } catch (Throwable th) {
                th = th;
                inputStreamOpenRawResource = null;
            }
            try {
                boolean zF = f(fileM, inputStreamOpenRawResource);
                e(inputStreamOpenRawResource);
                if (zF) {
                    return Typeface.createFromFile(fileM.getPath());
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                e(inputStreamOpenRawResource);
                throw th;
            }
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM.delete();
        }
    }

    @Override // q.q
    public void b(View view) {
    }

    @Override // q.q
    public void c() {
    }
}
