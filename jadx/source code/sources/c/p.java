package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f423d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f424e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f425a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f426b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f427c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f424e = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(102, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(107, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(104, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(103, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(105, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    public static int[] b(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = s.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f58n;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f58n.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static k c(Context context, AttributeSet attributeSet) {
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f428a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            m mVar = kVar.f373c;
            o oVar = kVar.f375e;
            l lVar = kVar.f374d;
            if (index != 1 && 23 != index && 24 != index) {
                mVar.getClass();
                lVar.getClass();
                oVar.getClass();
            }
            SparseIntArray sparseIntArray = f424e;
            int i2 = sparseIntArray.get(index);
            n nVar = kVar.f372b;
            switch (i2) {
                case 1:
                    lVar.f391o = e(typedArrayObtainStyledAttributes, index, lVar.f391o);
                    break;
                case 2:
                    lVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.F);
                    break;
                case 3:
                    lVar.f390n = e(typedArrayObtainStyledAttributes, index, lVar.f390n);
                    break;
                case 4:
                    lVar.f389m = e(typedArrayObtainStyledAttributes, index, lVar.f389m);
                    break;
                case 5:
                    lVar.f397v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    lVar.f401z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f401z);
                    break;
                case 7:
                    lVar.f377A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f377A);
                    break;
                case 8:
                    lVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.G);
                    break;
                case 9:
                    lVar.f394s = e(typedArrayObtainStyledAttributes, index, lVar.f394s);
                    break;
                case 10:
                    lVar.r = e(typedArrayObtainStyledAttributes, index, lVar.r);
                    break;
                case 11:
                    lVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.L);
                    break;
                case 12:
                    lVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.M);
                    break;
                case 13:
                    lVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.I);
                    break;
                case 14:
                    lVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.K);
                    break;
                case 15:
                    lVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.N);
                    break;
                case 16:
                    lVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.J);
                    break;
                case 17:
                    lVar.f381d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f381d);
                    break;
                case 18:
                    lVar.f382e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f382e);
                    break;
                case 19:
                    lVar.f383f = typedArrayObtainStyledAttributes.getFloat(index, lVar.f383f);
                    break;
                case 20:
                    lVar.f395t = typedArrayObtainStyledAttributes.getFloat(index, lVar.f395t);
                    break;
                case 21:
                    lVar.f380c = typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f380c);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, nVar.f407a);
                    nVar.f407a = i3;
                    nVar.f407a = f423d[i3];
                    break;
                case 23:
                    lVar.f379b = typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f379b);
                    break;
                case 24:
                    lVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.C);
                    break;
                case 25:
                    lVar.f384g = e(typedArrayObtainStyledAttributes, index, lVar.f384g);
                    break;
                case 26:
                    lVar.f385h = e(typedArrayObtainStyledAttributes, index, lVar.f385h);
                    break;
                case 27:
                    lVar.B = typedArrayObtainStyledAttributes.getInt(index, lVar.B);
                    break;
                case 28:
                    lVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.D);
                    break;
                case 29:
                    lVar.i = e(typedArrayObtainStyledAttributes, index, lVar.i);
                    break;
                case 30:
                    lVar.f386j = e(typedArrayObtainStyledAttributes, index, lVar.f386j);
                    break;
                case 31:
                    lVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.H);
                    break;
                case 32:
                    lVar.f392p = e(typedArrayObtainStyledAttributes, index, lVar.f392p);
                    break;
                case 33:
                    lVar.f393q = e(typedArrayObtainStyledAttributes, index, lVar.f393q);
                    break;
                case 34:
                    lVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.E);
                    break;
                case 35:
                    lVar.f388l = e(typedArrayObtainStyledAttributes, index, lVar.f388l);
                    break;
                case 36:
                    lVar.f387k = e(typedArrayObtainStyledAttributes, index, lVar.f387k);
                    break;
                case 37:
                    lVar.f396u = typedArrayObtainStyledAttributes.getFloat(index, lVar.f396u);
                    break;
                case 38:
                    kVar.f371a = typedArrayObtainStyledAttributes.getResourceId(index, kVar.f371a);
                    break;
                case 39:
                    lVar.P = typedArrayObtainStyledAttributes.getFloat(index, lVar.P);
                    break;
                case 40:
                    lVar.O = typedArrayObtainStyledAttributes.getFloat(index, lVar.O);
                    break;
                case 41:
                    lVar.Q = typedArrayObtainStyledAttributes.getInt(index, lVar.Q);
                    break;
                case 42:
                    lVar.R = typedArrayObtainStyledAttributes.getInt(index, lVar.R);
                    break;
                case 43:
                    nVar.f409c = typedArrayObtainStyledAttributes.getFloat(index, nVar.f409c);
                    break;
                case 44:
                    oVar.f421k = true;
                    oVar.f422l = typedArrayObtainStyledAttributes.getDimension(index, oVar.f422l);
                    break;
                case 45:
                    oVar.f413b = typedArrayObtainStyledAttributes.getFloat(index, oVar.f413b);
                    break;
                case 46:
                    oVar.f414c = typedArrayObtainStyledAttributes.getFloat(index, oVar.f414c);
                    break;
                case 47:
                    oVar.f415d = typedArrayObtainStyledAttributes.getFloat(index, oVar.f415d);
                    break;
                case 48:
                    oVar.f416e = typedArrayObtainStyledAttributes.getFloat(index, oVar.f416e);
                    break;
                case 49:
                    oVar.f417f = typedArrayObtainStyledAttributes.getDimension(index, oVar.f417f);
                    break;
                case 50:
                    oVar.f418g = typedArrayObtainStyledAttributes.getDimension(index, oVar.f418g);
                    break;
                case 51:
                    oVar.f419h = typedArrayObtainStyledAttributes.getDimension(index, oVar.f419h);
                    break;
                case 52:
                    oVar.i = typedArrayObtainStyledAttributes.getDimension(index, oVar.i);
                    break;
                case 53:
                    oVar.f420j = typedArrayObtainStyledAttributes.getDimension(index, oVar.f420j);
                    break;
                case 54:
                    lVar.S = typedArrayObtainStyledAttributes.getInt(index, lVar.S);
                    break;
                case 55:
                    lVar.T = typedArrayObtainStyledAttributes.getInt(index, lVar.T);
                    break;
                case 56:
                    lVar.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.U);
                    break;
                case 57:
                    lVar.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.V);
                    break;
                case 58:
                    lVar.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.W);
                    break;
                case 59:
                    lVar.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.X);
                    break;
                case 60:
                    oVar.f412a = typedArrayObtainStyledAttributes.getFloat(index, oVar.f412a);
                    break;
                case 61:
                    lVar.f398w = e(typedArrayObtainStyledAttributes, index, lVar.f398w);
                    break;
                case 62:
                    lVar.f399x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f399x);
                    break;
                case 63:
                    lVar.f400y = typedArrayObtainStyledAttributes.getFloat(index, lVar.f400y);
                    break;
                case 64:
                    mVar.f403a = e(typedArrayObtainStyledAttributes, index, mVar.f403a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        mVar.getClass();
                    } else {
                        String str = d.a.f457a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        mVar.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    mVar.getClass();
                    break;
                case 67:
                    mVar.f406d = typedArrayObtainStyledAttributes.getFloat(index, mVar.f406d);
                    break;
                case 68:
                    nVar.f410d = typedArrayObtainStyledAttributes.getFloat(index, nVar.f410d);
                    break;
                case 69:
                    lVar.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    lVar.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    lVar.a0 = typedArrayObtainStyledAttributes.getInt(index, lVar.a0);
                    break;
                case 73:
                    lVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.b0);
                    break;
                case 74:
                    lVar.e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    lVar.i0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.i0);
                    break;
                case 76:
                    mVar.f404b = typedArrayObtainStyledAttributes.getInt(index, mVar.f404b);
                    break;
                case 77:
                    lVar.f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    nVar.f408b = typedArrayObtainStyledAttributes.getInt(index, nVar.f408b);
                    break;
                case 79:
                    mVar.f405c = typedArrayObtainStyledAttributes.getFloat(index, mVar.f405c);
                    break;
                case 80:
                    lVar.g0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.g0);
                    break;
                case 81:
                    lVar.h0 = typedArrayObtainStyledAttributes.getBoolean(index, lVar.h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(Context context, int i) {
        p pVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        HashMap map = pVar.f427c;
        map.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            int id = childAt.getId();
            if (pVar.f426b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new k());
            }
            k kVar = (k) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = pVar.f425a;
            for (String str : map3.keySet()) {
                c cVar = (c) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new c(cVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new c(cVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
            kVar.f376f = map2;
            n nVar = kVar.f372b;
            l lVar = kVar.f374d;
            o oVar = kVar.f375e;
            kVar.f371a = id;
            lVar.f384g = fVar.f332d;
            lVar.f385h = fVar.f333e;
            lVar.i = fVar.f334f;
            lVar.f386j = fVar.f335g;
            lVar.f387k = fVar.f336h;
            lVar.f388l = fVar.i;
            lVar.f389m = fVar.f337j;
            lVar.f390n = fVar.f338k;
            lVar.f391o = fVar.f339l;
            lVar.f392p = fVar.f343p;
            lVar.f393q = fVar.f344q;
            lVar.r = fVar.r;
            lVar.f394s = fVar.f345s;
            lVar.f395t = fVar.f352z;
            lVar.f396u = fVar.f328A;
            lVar.f397v = fVar.B;
            lVar.f398w = fVar.f340m;
            lVar.f399x = fVar.f341n;
            lVar.f400y = fVar.f342o;
            lVar.f401z = fVar.P;
            lVar.f377A = fVar.Q;
            lVar.B = fVar.R;
            lVar.f383f = fVar.f331c;
            lVar.f381d = fVar.f329a;
            lVar.f382e = fVar.f330b;
            lVar.f379b = ((ViewGroup.MarginLayoutParams) fVar).width;
            lVar.f380c = ((ViewGroup.MarginLayoutParams) fVar).height;
            lVar.C = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            lVar.D = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            lVar.E = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            lVar.F = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            lVar.O = fVar.E;
            lVar.P = fVar.D;
            lVar.R = fVar.G;
            lVar.Q = fVar.F;
            lVar.g0 = fVar.S;
            lVar.h0 = fVar.T;
            lVar.S = fVar.H;
            lVar.T = fVar.I;
            lVar.U = fVar.L;
            lVar.V = fVar.M;
            lVar.W = fVar.J;
            lVar.X = fVar.K;
            lVar.Y = fVar.N;
            lVar.Z = fVar.O;
            lVar.f0 = fVar.U;
            lVar.J = fVar.f347u;
            lVar.L = fVar.f349w;
            lVar.I = fVar.f346t;
            lVar.K = fVar.f348v;
            lVar.N = fVar.f350x;
            lVar.M = fVar.f351y;
            lVar.G = fVar.getMarginEnd();
            lVar.H = fVar.getMarginStart();
            nVar.f407a = childAt.getVisibility();
            nVar.f409c = childAt.getAlpha();
            oVar.f412a = childAt.getRotation();
            oVar.f413b = childAt.getRotationX();
            oVar.f414c = childAt.getRotationY();
            oVar.f415d = childAt.getScaleX();
            oVar.f416e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                oVar.f417f = pivotX;
                oVar.f418g = pivotY;
            }
            oVar.f419h = childAt.getTranslationX();
            oVar.i = childAt.getTranslationY();
            oVar.f420j = childAt.getTranslationZ();
            if (oVar.f421k) {
                oVar.f422l = childAt.getElevation();
            }
            if (childAt instanceof a) {
                a aVar = (a) childAt;
                lVar.i0 = aVar.f313k.m0;
                lVar.d0 = aVar.getReferencedIds();
                lVar.a0 = aVar.getType();
                lVar.b0 = aVar.getMargin();
            }
            i2++;
            pVar = this;
        }
    }

    public final void d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    k kVarC = c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        kVarC.f374d.f378a = true;
                    }
                    this.f427c.put(Integer.valueOf(kVarC.f371a), kVarC);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
