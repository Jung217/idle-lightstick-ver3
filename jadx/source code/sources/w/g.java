package w;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import x.r;
import x.v;
import x.w;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f936A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f937a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f944h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f952q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public v f960z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f938b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f939c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f940d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f941e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f942f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f943g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f937a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = this.E.f965c.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f953s).setVisible(this.f954t).setEnabled(this.f955u).setCheckable(this.r >= 1).setTitleCondensed(this.f947l).setIcon(this.f948m);
        int i = this.f956v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f959y;
        h hVar = this.E;
        if (str != null) {
            if (hVar.f965c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f966d == null) {
                hVar.f966d = h.a(hVar.f965c);
            }
            Object obj = hVar.f966d;
            String str2 = this.f959y;
            f fVar = new f();
            fVar.f934a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f935b = cls.getMethod(str2, f.f933c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof r;
        if (z3) {
        }
        if (this.r >= 2) {
            if (z3) {
                r rVar = (r) menuItem;
                rVar.f1112x = (rVar.f1112x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                Object obj2 = wVar.f1015a;
                try {
                    if (wVar.f1120d == null) {
                        wVar.f1120d = ((m.a) obj2).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f1120d.invoke(obj2, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f958x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f961e, hVar.f963a));
            z2 = true;
        }
        int i2 = this.f957w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        v vVar = this.f960z;
        if (vVar != null) {
            if (menuItem instanceof m.a) {
                ((m.a) menuItem).a(vVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f936A;
        boolean z4 = menuItem instanceof m.a;
        if (z4) {
            ((m.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z4) {
            ((m.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c2 = this.f949n;
        int i3 = this.f950o;
        if (z4) {
            ((m.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, i3);
        }
        char c3 = this.f951p;
        int i4 = this.f952q;
        if (z4) {
            ((m.a) menuItem).setNumericShortcut(c3, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c3, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((m.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z4) {
                ((m.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
