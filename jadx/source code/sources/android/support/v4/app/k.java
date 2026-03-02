package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f99p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f101d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray f102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f105h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f111o;

    static {
        new DecelerateInterpolator(2.5f);
        new DecelerateInterpolator(1.5f);
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    public k() {
        new CopyOnWriteArrayList();
        this.i = 0;
        new A.g(1, this);
    }

    public final void d(int i) {
        try {
            this.f100c = true;
            h(i, false);
            this.f100c = false;
            f();
        } catch (Throwable th) {
            this.f100c = false;
            throw th;
        }
    }

    public final void e(String str, PrintWriter printWriter) {
        int size;
        int size2;
        String str2;
        int size3;
        String str3 = str + "    ";
        SparseArray sparseArray = this.f102e;
        if (sparseArray != null && (size3 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size3; i++) {
                if (this.f102e.valueAt(i) != null) {
                    throw new ClassCastException();
                }
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println((Object) null);
            }
        }
        int size4 = this.f101d.size();
        if (size4 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            if (size4 > 0) {
                if (this.f101d.get(0) != null) {
                    throw new ClassCastException();
                }
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(0);
                printWriter.print(": ");
                throw null;
            }
        }
        ArrayList arrayList = this.f103f;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = (b) this.f103f.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                ArrayList arrayList2 = bVar.f68a;
                printWriter.print(str3);
                printWriter.print("mName=");
                printWriter.print(bVar.f75h);
                printWriter.print(" mIndex=");
                printWriter.print(bVar.i);
                printWriter.print(" mCommitted=");
                printWriter.println(false);
                if (bVar.f73f != 0) {
                    printWriter.print(str3);
                    printWriter.print("mTransition=#");
                    printWriter.print(Integer.toHexString(bVar.f73f));
                    printWriter.print(" mTransitionStyle=#");
                    printWriter.println(Integer.toHexString(bVar.f74g));
                }
                if (bVar.f69b != 0 || bVar.f70c != 0) {
                    printWriter.print(str3);
                    printWriter.print("mEnterAnim=#");
                    printWriter.print(Integer.toHexString(bVar.f69b));
                    printWriter.print(" mExitAnim=#");
                    printWriter.println(Integer.toHexString(bVar.f70c));
                }
                if (bVar.f71d != 0 || bVar.f72e != 0) {
                    printWriter.print(str3);
                    printWriter.print("mPopEnterAnim=#");
                    printWriter.print(Integer.toHexString(bVar.f71d));
                    printWriter.print(" mPopExitAnim=#");
                    printWriter.println(Integer.toHexString(bVar.f72e));
                }
                if (bVar.f76j != 0 || bVar.f77k != null) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbTitleRes=#");
                    printWriter.print(Integer.toHexString(bVar.f76j));
                    printWriter.print(" mBreadCrumbTitleText=");
                    printWriter.println(bVar.f77k);
                }
                if (bVar.f78l != 0 || bVar.f79m != null) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbShortTitleRes=#");
                    printWriter.print(Integer.toHexString(bVar.f78l));
                    printWriter.print(" mBreadCrumbShortTitleText=");
                    printWriter.println(bVar.f79m);
                }
                if (!arrayList2.isEmpty()) {
                    printWriter.print(str3);
                    printWriter.println("Operations:");
                    int size5 = arrayList2.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        a aVar = (a) arrayList2.get(i3);
                        switch (aVar.f63a) {
                            case 0:
                                str2 = "NULL";
                                break;
                            case 1:
                                str2 = "ADD";
                                break;
                            case 2:
                                str2 = "REPLACE";
                                break;
                            case 3:
                                str2 = "REMOVE";
                                break;
                            case 4:
                                str2 = "HIDE";
                                break;
                            case 5:
                                str2 = "SHOW";
                                break;
                            case 6:
                                str2 = "DETACH";
                                break;
                            case 7:
                                str2 = "ATTACH";
                                break;
                            case 8:
                                str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str2 = "UNSET_PRIMARY_NAV";
                                break;
                            default:
                                str2 = "cmd=" + aVar.f63a;
                                break;
                        }
                        printWriter.print(str3);
                        printWriter.print("  Op #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.print(str2);
                        printWriter.print(" ");
                        printWriter.println((Object) null);
                        if (aVar.f64b != 0 || aVar.f65c != 0) {
                            printWriter.print(str3);
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(aVar.f64b));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(aVar.f65c));
                        }
                        if (aVar.f66d != 0 || aVar.f67e != 0) {
                            printWriter.print(str3);
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(aVar.f66d));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(aVar.f67e));
                        }
                    }
                }
            }
        }
        synchronized (this) {
            try {
                ArrayList arrayList3 = this.f104g;
                if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i4 = 0; i4 < size; i4++) {
                        b bVar2 = (b) this.f104g.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(bVar2);
                    }
                }
                ArrayList arrayList4 = this.f105h;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    printWriter.print(str);
                    printWriter.print("mAvailBackStackIndices: ");
                    printWriter.println(Arrays.toString(this.f105h.toArray()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f106j);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f107k);
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.i);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f108l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f109m);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f110n);
    }

    public final void f() {
        if (this.f100c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f106j == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != ((A.h) this.f106j.f95c).getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (this.f111o == null) {
            this.f111o = new ArrayList();
            new ArrayList();
        }
        this.f100c = false;
        synchronized (this) {
        }
        SparseArray sparseArray = this.f102e;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f102e.valueAt(size) == null) {
                    SparseArray sparseArray2 = this.f102e;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f101d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
        }
        SparseArray sparseArray = this.f102e;
        if (sparseArray != null) {
            for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                if (this.f102e.valueAt(size2) != null) {
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void h(int i, boolean z2) {
        if (this.f106j == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.i) {
            this.i = i;
            if (this.f102e != null) {
                ArrayList arrayList = this.f101d;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) != null) {
                        throw new ClassCastException();
                    }
                }
                int size2 = this.f102e.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (this.f102e.valueAt(i3) != null) {
                        throw new ClassCastException();
                    }
                }
                if (this.f102e == null) {
                    return;
                }
                for (int i4 = 0; i4 < this.f102e.size(); i4++) {
                    if (this.f102e.valueAt(i4) != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f98b);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            t.f fVar = (t.f) this.f106j.f93a;
            try {
                p.j jVar = g.f92b;
                Class<?> clsLoadClass = (Class) jVar.get(attributeValue);
                if (clsLoadClass == null) {
                    clsLoadClass = fVar.getClassLoader().loadClass(attributeValue);
                    jVar.put(attributeValue, clsLoadClass);
                }
                zIsAssignableFrom = g.class.isAssignableFrom(clsLoadClass);
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    g();
                }
                if (string != null) {
                    ArrayList arrayList = this.f101d;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) != null) {
                            throw new ClassCastException();
                        }
                    }
                    SparseArray sparseArray = this.f102e;
                    if (sparseArray != null) {
                        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                            if (this.f102e.valueAt(size2) != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                }
                if (id != -1) {
                    g();
                }
                this.f107k.getClass();
                g.a(context, attributeValue, null);
                throw null;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        p.b.c(this.f106j, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        onCreateView(null, str, context, attributeSet);
        return null;
    }
}
