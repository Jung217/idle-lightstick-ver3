package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0043v f1386f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f1393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1394b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PorterDuff.Mode f1385e = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0042u f1387g = new C0042u(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f1388h = {2131099730, 2131099728, 2131099649};
    public static final int[] i = {2131099671, R.drawable.abc_seekbar_tick_mark_material, 2131099678, 2131099673, 2131099674, 2131099677, 2131099676};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f1389j = {2131099727, 2131099729, 2131099664, R.drawable.abc_text_cursor_material, 2131099721, 2131099723, 2131099725, 2131099722, 2131099724, 2131099726};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1390k = {2131099702, R.drawable.abc_cab_background_internal_bg, 2131099701};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f1391l = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f1392m = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int iB = x0.b(context, R.attr.colorControlHighlight);
        int iA = x0.a(context, R.attr.colorButtonNormal);
        int[] iArr = x0.f1423b;
        int[] iArr2 = x0.f1425d;
        int iA2 = k.a.a(iB, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, x0.f1424c, x0.f1427f}, new int[]{iA, iA2, k.a.a(iB, i2), i2});
    }

    public static ColorStateList d(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListC = x0.c(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListC == null || !colorStateListC.isStateful()) {
            iArr[0] = x0.f1423b;
            iArr2[0] = x0.a(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = x0.f1426e;
            iArr2[1] = x0.b(context, R.attr.colorControlActivated);
            iArr[2] = x0.f1427f;
            iArr2[2] = x0.b(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = x0.f1423b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
            iArr[1] = x0.f1426e;
            iArr2[1] = x0.b(context, R.attr.colorControlActivated);
            iArr[2] = x0.f1427f;
            iArr2[2] = colorStateListC.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static synchronized C0043v e() {
        try {
            if (f1386f == null) {
                f1386f = new C0043v();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1386f;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0042u c0042u = f1387g;
        c0042u.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0042u.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (T.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1385e;
        }
        drawable.setColorFilter(h(i2, mode));
    }

    public static void l(Drawable drawable, z0 z0Var, int[] iArr) {
        if (T.a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = z0Var.f1438d;
        if (!z2 && !z0Var.f1437c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterH = null;
        ColorStateList colorStateList = z2 ? z0Var.f1435a : null;
        PorterDuff.Mode mode = z0Var.f1437c ? z0Var.f1436b : f1385e;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterH = h(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterH);
    }

    public final Drawable c(Context context, int i2) {
        Drawable drawableNewDrawable;
        Object obj;
        int i3;
        if (this.f1395c == null) {
            this.f1395c = new TypedValue();
        }
        TypedValue typedValue = this.f1395c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            p.d dVar = (p.d) this.f1394b.get(context);
            drawableNewDrawable = null;
            if (dVar != null) {
                int iB = p.b.b(dVar.f680c, dVar.f682e, j2);
                if (iB < 0 || (obj = dVar.f681d[iB]) == p.d.f678f) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iB2 = p.b.b(dVar.f680c, dVar.f682e, j2);
                        if (iB2 >= 0) {
                            Object[] objArr = dVar.f681d;
                            Object obj2 = objArr[iB2];
                            Object obj3 = p.d.f678f;
                            if (obj2 != obj3) {
                                objArr[iB2] = obj3;
                                dVar.f679b = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (i2 == R.drawable.abc_cab_background_top_material) {
            drawableNewDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131099664)});
        }
        if (drawableNewDrawable == null) {
            return drawableNewDrawable;
        }
        drawableNewDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = drawableNewDrawable.getConstantState();
                if (constantState2 != null) {
                    p.d dVar2 = (p.d) this.f1394b.get(context);
                    if (dVar2 == null) {
                        dVar2 = new p.d();
                        dVar2.f679b = false;
                        int i4 = 4;
                        while (true) {
                            i3 = 80;
                            if (i4 >= 32) {
                                break;
                            }
                            int i5 = (1 << i4) - 12;
                            if (80 <= i5) {
                                i3 = i5;
                                break;
                            }
                            i4++;
                        }
                        int i6 = i3 / 8;
                        dVar2.f680c = new long[i6];
                        dVar2.f681d = new Object[i6];
                        dVar2.f682e = 0;
                        this.f1394b.put(context, dVar2);
                    }
                    dVar2.b(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return drawableNewDrawable;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z2) {
        Drawable drawableC;
        try {
            if (!this.f1396d) {
                this.f1396d = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof h.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f1396d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableC = c(context, i2);
            if (drawableC == null) {
                drawableC = context.getDrawable(i2);
            }
            if (drawableC != null) {
                drawableC = k(context, i2, z2, drawableC);
            }
            if (drawableC != null) {
                int i3 = T.f1229a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableC;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        p.k kVar;
        Object obj;
        try {
            WeakHashMap weakHashMap = this.f1393a;
            colorStateList = null;
            obj = null;
            Object obj2 = null;
            colorStateList = null;
            if (weakHashMap != null && (kVar = (p.k) weakHashMap.get(context)) != null) {
                int iA = p.b.a(kVar.f708b, kVar.f710d, i2);
                if (iA >= 0 && (obj = kVar.f709c[iA]) != p.k.f707e) {
                    obj2 = obj;
                }
                colorStateList = (ColorStateList) obj2;
            }
            if (colorStateList == null) {
                if (i2 == R.drawable.abc_edit_text_material) {
                    Object obj3 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_edittext);
                } else if (i2 == 2131099717) {
                    Object obj4 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_switch_track);
                } else if (i2 == R.drawable.abc_switch_thumb_material) {
                    colorStateList = d(context);
                } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList = b(context, x0.b(context, R.attr.colorButtonNormal));
                } else if (i2 == R.drawable.abc_btn_borderless_material) {
                    colorStateList = b(context, 0);
                } else if (i2 == R.drawable.abc_btn_colored_material) {
                    colorStateList = b(context, x0.b(context, R.attr.colorAccent));
                } else if (i2 == 2131099714 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                    Object obj5 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_spinner);
                } else if (a(i, i2)) {
                    colorStateList = x0.c(context, R.attr.colorControlNormal);
                } else if (a(f1391l, i2)) {
                    Object obj6 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_default);
                } else if (a(f1392m, i2)) {
                    Object obj7 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_btn_checkable);
                } else if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    Object obj8 = v.a.f919a;
                    colorStateList = context.getColorStateList(R.color.abc_tint_seek_thumb);
                }
                if (colorStateList != null) {
                    if (this.f1393a == null) {
                        this.f1393a = new WeakHashMap();
                    }
                    p.k kVar2 = (p.k) this.f1393a.get(context);
                    if (kVar2 == null) {
                        kVar2 = new p.k();
                        this.f1393a.put(context, kVar2);
                    }
                    kVar2.a(i2, colorStateList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable k(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C0043v.k(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
