package t;

import android.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y.C0043v;
import y.G0;
import y.K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Activity implements g, android.arch.lifecycle.c, q.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.arch.lifecycle.i f807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f809g;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.k f811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f812k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.arch.lifecycle.e f804b = new android.arch.lifecycle.e(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.h f805c = new A.h(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.arch.lifecycle.i f806d = new android.arch.lifecycle.i(new android.support.v4.app.h(this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f810h = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f813l = 0;

    public static void b(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // q.f
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n nVarD = d();
        nVarD.j();
        ((ViewGroup) nVarD.r.findViewById(R.id.content)).addView(view, layoutParams);
        nVarD.f841d.onContentChanged();
    }

    public final boolean c(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !android.arch.lifecycle.f.j(decorView, keyEvent)) {
            return android.arch.lifecycle.f.k(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        d().l();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final n d() {
        if (this.f812k == null) {
            this.f812k = new n(this, getWindow(), this);
        }
        return this.f812k;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        d().l();
        return c(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !android.arch.lifecycle.f.j(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f808f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f809g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f810h);
        if (getApplication() != null) {
            if (getApplication() == null) {
                throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            }
            if (this.f807e == null) {
                android.support.v4.app.i iVar = (android.support.v4.app.i) getLastNonConfigurationInstance();
                if (iVar != null) {
                    this.f807e = iVar.f97a;
                }
                if (this.f807e == null) {
                    this.f807e = new android.arch.lifecycle.i();
                }
            }
            new android.support.v4.app.n(this, this.f807e).a(str2, printWriter);
        }
        ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).e(str, printWriter);
    }

    public final void e(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.arch.lifecycle.i iVar = this.f806d;
        iVar.g();
        ArrayList arrayList = ((android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d).f101d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                throw new ClassCastException();
            }
        }
    }

    public final void f(Bundle bundle) {
        android.arch.lifecycle.i iVar;
        android.support.v4.app.h hVar = (android.support.v4.app.h) this.f806d.f46b;
        android.support.v4.app.k kVar = (android.support.v4.app.k) hVar.f96d;
        if (kVar.f106j != null) {
            throw new IllegalStateException("Already attached");
        }
        kVar.f106j = hVar;
        kVar.f107k = hVar;
        g(bundle);
        android.support.v4.app.i iVar2 = (android.support.v4.app.i) getLastNonConfigurationInstance();
        if (iVar2 != null && (iVar = iVar2.f97a) != null && this.f807e == null) {
            this.f807e = iVar;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            android.support.v4.app.k kVar2 = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
            kVar2.getClass();
            if (parcelable != null) {
                android.support.v4.app.l lVar = (android.support.v4.app.l) parcelable;
                if (lVar.f112b != null) {
                    kVar2.f102e = new SparseArray(lVar.f112b.length);
                    int i = 0;
                    while (true) {
                        android.support.v4.app.m[] mVarArr = lVar.f112b;
                        if (i < mVarArr.length) {
                            android.support.v4.app.m mVar = mVarArr[i];
                            if (mVar != null) {
                                android.support.v4.app.h hVar2 = kVar2.f106j;
                                android.support.v4.app.h hVar3 = kVar2.f107k;
                                String str = mVar.f117b;
                                f fVar = (f) hVar2.f93a;
                                Bundle bundle2 = mVar.f124j;
                                if (bundle2 != null) {
                                    bundle2.setClassLoader(fVar.getClassLoader());
                                }
                                if (hVar3 != null) {
                                    android.support.v4.app.g.a(fVar, str, bundle2);
                                } else {
                                    android.support.v4.app.g.a(fVar, str, bundle2);
                                }
                                mVar.f126l.getClass();
                                mVar.f126l.setClassLoader(fVar.getClassLoader());
                                throw null;
                            }
                            i++;
                        } else {
                            kVar2.f101d.clear();
                            int[] iArr = lVar.f113c;
                            if (iArr != null && iArr.length > 0) {
                                if (kVar2.f102e.get(iArr[0]) != null) {
                                    throw new ClassCastException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("No instantiated fragment for index #" + lVar.f113c[0]);
                                Log.e("FragmentManager", illegalStateException.getMessage());
                                Log.e("FragmentManager", "Activity state:");
                                PrintWriter printWriter = new PrintWriter(new p.c());
                                android.support.v4.app.h hVar4 = kVar2.f106j;
                                if (hVar4 != null) {
                                    try {
                                        ((f) hVar4.f94b).dump("  ", null, printWriter, new String[0]);
                                        throw illegalStateException;
                                    } catch (Exception e2) {
                                        Log.e("FragmentManager", "Failed dumping state", e2);
                                        throw illegalStateException;
                                    }
                                }
                                try {
                                    kVar2.e("  ", printWriter);
                                    throw illegalStateException;
                                } catch (Exception e3) {
                                    Log.e("FragmentManager", "Failed dumping state", e3);
                                    throw illegalStateException;
                                }
                            }
                            if (lVar.f114d != null) {
                                kVar2.f103f = new ArrayList(lVar.f114d.length);
                                int i2 = 0;
                                while (true) {
                                    android.support.v4.app.d[] dVarArr = lVar.f114d;
                                    if (i2 >= dVarArr.length) {
                                        break;
                                    }
                                    android.support.v4.app.d dVar = dVarArr[i2];
                                    int[] iArr2 = dVar.f81b;
                                    android.support.v4.app.b bVar = new android.support.v4.app.b(kVar2);
                                    int i3 = 0;
                                    while (i3 < iArr2.length) {
                                        android.support.v4.app.a aVar = new android.support.v4.app.a();
                                        aVar.f63a = iArr2[i3];
                                        int i4 = i3 + 2;
                                        int i5 = iArr2[i3 + 1];
                                        if (i5 >= 0 && kVar2.f102e.get(i5) != null) {
                                            throw new ClassCastException();
                                        }
                                        int i6 = iArr2[i4];
                                        aVar.f64b = i6;
                                        int i7 = iArr2[i3 + 3];
                                        aVar.f65c = i7;
                                        int i8 = i3 + 5;
                                        int i9 = iArr2[i3 + 4];
                                        aVar.f66d = i9;
                                        i3 += 6;
                                        int i10 = iArr2[i8];
                                        aVar.f67e = i10;
                                        bVar.f69b = i6;
                                        bVar.f70c = i7;
                                        bVar.f71d = i9;
                                        bVar.f72e = i10;
                                        bVar.f68a.add(aVar);
                                        aVar.f64b = bVar.f69b;
                                        aVar.f65c = bVar.f70c;
                                        aVar.f66d = bVar.f71d;
                                        aVar.f67e = bVar.f72e;
                                    }
                                    bVar.f73f = dVar.f82c;
                                    bVar.f74g = dVar.f83d;
                                    bVar.f75h = dVar.f84e;
                                    bVar.i = dVar.f85f;
                                    bVar.f76j = dVar.f86g;
                                    bVar.f77k = dVar.f87h;
                                    bVar.f78l = dVar.i;
                                    bVar.f79m = dVar.f88j;
                                    ArrayList arrayList = bVar.f68a;
                                    int i11 = android.support.v4.app.k.f99p;
                                    int size = arrayList.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        ((android.support.v4.app.a) arrayList.get(i12)).getClass();
                                    }
                                    kVar2.f103f.add(bVar);
                                    int i13 = bVar.i;
                                    if (i13 >= 0) {
                                        synchronized (kVar2) {
                                            try {
                                                if (kVar2.f104g == null) {
                                                    kVar2.f104g = new ArrayList();
                                                }
                                                int size2 = kVar2.f104g.size();
                                                if (i13 < size2) {
                                                    kVar2.f104g.set(i13, bVar);
                                                } else {
                                                    while (size2 < i13) {
                                                        kVar2.f104g.add(null);
                                                        if (kVar2.f105h == null) {
                                                            kVar2.f105h = new ArrayList();
                                                        }
                                                        kVar2.f105h.add(Integer.valueOf(size2));
                                                        size2++;
                                                    }
                                                    kVar2.f104g.add(bVar);
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    i2++;
                                }
                            } else {
                                kVar2.f103f = null;
                            }
                            int i14 = lVar.f115e;
                            if (i14 >= 0 && kVar2.f102e.get(i14) != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                }
            }
            if (bundle.containsKey("android:support:next_request_index")) {
                this.i = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f811j = new p.k(intArray.length);
                    for (int i15 = 0; i15 < intArray.length; i15++) {
                        this.f811j.b(intArray[i15], stringArray[i15]);
                    }
                }
            }
        }
        if (this.f811j == null) {
            this.f811j = new p.k();
            this.i = 0;
        }
        android.support.v4.app.k kVar3 = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        kVar3.f108l = false;
        kVar3.f109m = false;
        kVar3.d(1);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        n nVarD = d();
        nVarD.j();
        return nVarD.f840c.findViewById(i);
    }

    public final void g(Bundle bundle) {
        super.onCreate(bundle);
        int i = android.arch.lifecycle.g.f45b;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new android.arch.lifecycle.g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        n nVarD = d();
        if (nVarD.f844g == null) {
            nVarD.l();
            u uVar = nVarD.f843f;
            nVarD.f844g = new w.h(uVar != null ? uVar.y() : nVarD.f839b);
        }
        return nVarD.f844g;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = K0.f1195a;
        return super.getResources();
    }

    public final void h() {
        super.onDestroy();
        if (this.f807e != null && !isChangingConfigurations()) {
            HashMap map = (HashMap) this.f807e.f46b;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((android.arch.lifecycle.h) it.next()).a();
            }
            map.clear();
        }
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        kVar.f110n = true;
        kVar.f();
        kVar.d(0);
        kVar.f106j = null;
        kVar.f107k = null;
    }

    public final boolean i(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        android.arch.lifecycle.i iVar = this.f806d;
        if (i == 0) {
            android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
            ArrayList arrayList = kVar.f101d;
            if (kVar.i >= 1) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) != null) {
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i == 6) {
            android.support.v4.app.k kVar2 = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
            ArrayList arrayList2 = kVar2.f101d;
            if (kVar2.i >= 1) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (arrayList2.get(i3) != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        n nVarD = d();
        nVarD.l();
        nVarD.n(0);
    }

    public final void j(int i, Menu menu) {
        if (i == 0) {
            android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
            ArrayList arrayList = kVar.f101d;
            if (kVar.i >= 1) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
        super.onPanelClosed(i, menu);
    }

    public final void k() {
        super.onPostResume();
        this.f805c.removeMessages(2);
        android.arch.lifecycle.i iVar = this.f806d;
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
        kVar.f108l = false;
        kVar.f109m = false;
        kVar.d(4);
        ((android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d).f();
    }

    public final void l(Bundle bundle) {
        List list;
        m(bundle);
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        if (kVar.f101d.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            synchronized (kVar.f101d) {
                list = (List) kVar.f101d.clone();
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        android.support.v4.app.k kVar2 = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        SparseArray sparseArray = kVar2.f102e;
        int i = 0;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar2.f102e.valueAt(i2) != null) {
                throw new ClassCastException();
            }
        }
        kVar2.f();
        kVar2.f108l = true;
        SparseArray sparseArray2 = kVar2.f102e;
        if (sparseArray2 != null && sparseArray2.size() > 0) {
            int size2 = kVar2.f102e.size();
            android.support.v4.app.m[] mVarArr = new android.support.v4.app.m[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                if (kVar2.f102e.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
            }
        }
        if (this.f811j.f710d <= 0) {
            return;
        }
        bundle.putInt("android:support:next_request_index", this.i);
        int i4 = this.f811j.f710d;
        int[] iArr = new int[i4];
        String[] strArr = new String[i4];
        while (true) {
            p.k kVar3 = this.f811j;
            if (i >= kVar3.f710d) {
                bundle.putIntArray("android:support:request_indicies", iArr);
                bundle.putStringArray("android:support:request_fragment_who", strArr);
                return;
            } else {
                iArr[i] = kVar3.f708b[i];
                strArr[i] = (String) kVar3.f709c[i];
                i++;
            }
        }
    }

    public final void m(Bundle bundle) {
        this.f804b.a(android.arch.lifecycle.b.f24d);
        super.onSaveInstanceState(bundle);
    }

    public final void n() {
        super.onStart();
        this.f810h = false;
        boolean z2 = this.f808f;
        android.arch.lifecycle.i iVar = this.f806d;
        if (!z2) {
            this.f808f = true;
            android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
            kVar.f108l = false;
            kVar.f109m = false;
            kVar.d(2);
        }
        iVar.g();
        android.support.v4.app.h hVar = (android.support.v4.app.h) iVar.f46b;
        ((android.support.v4.app.k) hVar.f96d).f();
        android.support.v4.app.k kVar2 = (android.support.v4.app.k) hVar.f96d;
        kVar2.f108l = false;
        kVar2.f109m = false;
        kVar2.d(3);
    }

    public final void o() {
        List list;
        super.onStop();
        this.f810h = true;
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        if (kVar.f101d.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            synchronized (kVar.f101d) {
                list = (List) kVar.f101d.clone();
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        android.support.v4.app.k kVar2 = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        kVar2.f109m = true;
        kVar2.d(2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        e(configuration);
        n nVarD = d();
        if (nVarD.f858w && nVarD.f853q) {
            nVarD.l();
            u uVar = nVarD.f843f;
            if (uVar != null) {
                uVar.B(uVar.f881m.getResources().getBoolean(com.studiothinkers.lightstick.idlev3.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0043v c0043vE = C0043v.e();
        Context context = nVarD.f839b;
        synchronized (c0043vE) {
            p.d dVar = (p.d) c0043vE.f1394b.get(context);
            if (dVar != null) {
                int i = dVar.f682e;
                Object[] objArr = dVar.f681d;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                dVar.f682e = 0;
                dVar.f679b = false;
            }
        }
        nVarD.a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        n nVarD = d();
        nVarD.m();
        nVarD.o(bundle);
        if (nVarD.a() && this.f813l != 0) {
            onApplyThemeResource(getTheme(), this.f813l, false);
        }
        f(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        ArrayList arrayList = kVar.f101d;
        if (kVar.i >= 1) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) != null) {
                    throw new ClassCastException();
                }
            }
        }
        return zOnCreatePanelMenu;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).onCreateView(view, str, context, attributeSet);
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        A.k kVar;
        h();
        n nVarD = d();
        if (nVarD.J) {
            nVarD.f840c.getDecorView().removeCallbacks(nVarD.L);
        }
        nVarD.F = true;
        q.g gVar = nVarD.I;
        if (gVar == null || (kVar = (A.k) gVar.f719c) == null) {
            return;
        }
        ((n) gVar.f721e).f839b.unregisterReceiver(kVar);
        gVar.f719c = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ArrayList arrayList = ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).f101d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentA;
        if (!i(i, menuItem)) {
            n nVarD = d();
            nVarD.l();
            u uVar = nVarD.f843f;
            if (menuItem.getItemId() != 16908332 || uVar == null || (((G0) uVar.f885q).f1157b & 4) == 0 || (intentA = android.support.v4.app.j.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = android.support.v4.app.j.a(this);
            if (intentA2 == null) {
                intentA2 = android.support.v4.app.j.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = android.support.v4.app.j.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = android.support.v4.app.j.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ArrayList arrayList = ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).f101d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f806d.g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        j(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f809g = false;
        A.h hVar = this.f805c;
        boolean zHasMessages = hVar.hasMessages(2);
        android.arch.lifecycle.i iVar = this.f806d;
        if (zHasMessages) {
            hVar.removeMessages(2);
            android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d;
            kVar.f108l = false;
            kVar.f109m = false;
            kVar.d(4);
        }
        ((android.support.v4.app.k) ((android.support.v4.app.h) iVar.f46b).f96d).d(3);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ArrayList arrayList = ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).f101d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        d().j();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        k();
        n nVarD = d();
        nVarD.l();
        u uVar = nVarD.f843f;
        if (uVar != null) {
            uVar.F = true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        boolean zOnPreparePanel = super.onPreparePanel(0, view, menu);
        android.support.v4.app.k kVar = (android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d;
        ArrayList arrayList = kVar.f101d;
        if (kVar.i >= 1) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) != null) {
                    throw new ClassCastException();
                }
            }
        }
        return zOnPreparePanel;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f805c.sendEmptyMessage(2);
        this.f809g = true;
        ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).f();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).getClass();
        int i = android.support.v4.app.k.f99p;
        android.arch.lifecycle.i iVar = this.f807e;
        if (iVar == null) {
            return null;
        }
        android.support.v4.app.i iVar2 = new android.support.v4.app.i();
        iVar2.f97a = iVar;
        return iVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        l(bundle);
        int i = d().G;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        n();
        d().a();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f806d.g();
    }

    @Override // android.app.Activity
    public final void onStop() {
        A.k kVar;
        o();
        n nVarD = d();
        nVarD.l();
        u uVar = nVarD.f843f;
        if (uVar != null) {
            uVar.F = false;
            w.j jVar = uVar.E;
            if (jVar != null) {
                jVar.a();
            }
        }
        q.g gVar = nVarD.I;
        if (gVar == null || (kVar = (A.k) gVar.f719c) == null) {
            return;
        }
        ((n) gVar.f721e).f839b.unregisterReceiver(kVar);
        gVar.f719c = null;
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        d().u(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        d().l();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        d().t(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        this.f813l = i;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n nVarD = d();
        nVarD.j();
        ViewGroup viewGroup = (ViewGroup) nVarD.r.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        nVarD.f841d.onContentChanged();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ((android.support.v4.app.k) ((android.support.v4.app.h) this.f806d.f46b).f96d).onCreateView(null, str, context, attributeSet);
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n nVarD = d();
        nVarD.j();
        ViewGroup viewGroup = (ViewGroup) nVarD.r.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        nVarD.f841d.onContentChanged();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
