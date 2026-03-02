package x;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f1064y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f1066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f1069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1072h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1074k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f1076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f1077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1078o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f1084v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1086x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1075l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1079p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1080q = false;
    public boolean r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1081s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f1082t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f1083u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1085w = false;

    public p(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z2 = false;
        this.f1065a = context;
        Resources resources = context.getResources();
        this.f1066b = resources;
        this.f1070f = new ArrayList();
        this.f1071g = new ArrayList();
        this.f1072h = true;
        this.i = new ArrayList();
        this.f1073j = new ArrayList();
        this.f1074k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = q.m.f729a;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z2 = true;
            }
        }
        this.f1068d = z2;
    }

    public final r a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f1064y[i5] << 16) | (65535 & i3);
        r rVar = new r(this, i, i2, i3, i6, charSequence, this.f1075l);
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((r) arrayList.get(size)).f1094d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, rVar);
        p(true);
        return rVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1065a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            r rVarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            rVarA.setIcon(resolveInfo.loadIcon(packageManager));
            rVarA.f1097g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = rVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(B b2, Context context) {
        this.f1083u.add(new WeakReference(b2));
        b2.k(context, this);
        this.f1074k = true;
    }

    public final void c(boolean z2) {
        if (this.f1081s) {
            return;
        }
        this.f1081s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            B b2 = (B) weakReference.get();
            if (b2 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                b2.a(this, z2);
            }
        }
        this.f1081s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        r rVar = this.f1084v;
        if (rVar != null) {
            d(rVar);
        }
        this.f1070f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f1077n = null;
        this.f1076m = null;
        this.f1078o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(r rVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
        boolean zB = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1084v == rVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                B b2 = (B) weakReference.get();
                if (b2 != null) {
                    zB = b2.b(rVar);
                    if (zB) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zB) {
                this.f1084v = null;
            }
        }
        return zB;
    }

    public boolean e(p pVar, MenuItem menuItem) {
        n nVar = this.f1069e;
        return nVar != null && nVar.d(pVar, menuItem);
    }

    public boolean f(r rVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            B b2 = (B) weakReference.get();
            if (b2 != null) {
                zF = b2.f(rVar);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zF) {
            this.f1084v = rVar;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            if (rVar.f1091a == i) {
                return rVar;
            }
            if (rVar.hasSubMenu() && (menuItemFindItem = rVar.f1104o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final r g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1082t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (r) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            char c2 = zN ? rVar.f1099j : rVar.f1098h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i == 67))) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f1070f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f1070f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                r rVar = (r) arrayList.get(i2);
                if (rVar.hasSubMenu()) {
                    rVar.f1104o.h(list, i, keyEvent);
                }
                char c2 = zN ? rVar.f1099j : rVar.f1098h;
                if ((modifiers & 69647) == ((zN ? rVar.f1100k : rVar.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zN && c2 == '\b' && i == 67)) && rVar.isEnabled()) {
                        list.add(rVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f1086x) {
            return true;
        }
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f1074k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                B b2 = (B) weakReference.get();
                if (b2 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= b2.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f1073j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    r rVar = (r) arrayListL.get(i);
                    if ((rVar.f1112x & 32) == 32) {
                        arrayList.add(rVar);
                    } else {
                        arrayList2.add(rVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f1074k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.f1072h;
        ArrayList arrayList = this.f1071g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f1070f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            r rVar = (r) arrayList2.get(i);
            if (rVar.isVisible()) {
                arrayList.add(rVar);
            }
        }
        this.f1072h = false;
        this.f1074k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f1085w;
    }

    public boolean n() {
        return this.f1067c;
    }

    public boolean o() {
        return this.f1068d;
    }

    public final void p(boolean z2) {
        if (this.f1079p) {
            this.f1080q = true;
            if (z2) {
                this.r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f1072h = true;
            this.f1074k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            B b2 = (B) weakReference.get();
            if (b2 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                b2.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        r rVarG = g(i, keyEvent);
        boolean zQ = rVarG != null ? q(rVarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, x.B r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.p.q(android.view.MenuItem, x.B, int):boolean");
    }

    public final void r(B b2) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1083u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            B b3 = (B) weakReference.get();
            if (b3 == null || b3 == b2) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((r) arrayList.get(i3)).f1092b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((r) arrayList.get(i3)).f1092b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f1070f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((r) arrayList.get(i2)).f1091a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f1070f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f1070f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((H) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            if (rVar.f1092b == i) {
                rVar.f1112x = (rVar.f1112x & (-5)) | (z3 ? 4 : 0);
                rVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f1085w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            if (rVar.f1092b == i) {
                rVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f1070f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            if (rVar.f1092b == i) {
                int i3 = rVar.f1112x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                rVar.f1112x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f1067c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1070f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f1070f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((H) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f1078o = view;
            this.f1076m = null;
            this.f1077n = null;
        } else {
            if (i > 0) {
                this.f1076m = this.f1066b.getText(i);
            } else if (charSequence != null) {
                this.f1076m = charSequence;
            }
            if (i2 > 0) {
                this.f1077n = this.f1065a.getDrawable(i2);
            } else if (drawable != null) {
                this.f1077n = drawable;
            }
            this.f1078o = null;
        }
        p(false);
    }

    public final void v() {
        this.f1079p = false;
        if (this.f1080q) {
            this.f1080q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.f1079p) {
            return;
        }
        this.f1079p = true;
        this.f1080q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f1066b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1066b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        r rVarA = a(i, i2, i3, charSequence);
        H h2 = new H(this.f1065a, this, rVarA);
        rVarA.f1104o = h2;
        h2.setHeaderTitle(rVarA.f1095e);
        return h2;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f1066b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1066b.getString(i4));
    }

    public p k() {
        return this;
    }
}
