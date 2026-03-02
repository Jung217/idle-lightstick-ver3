package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final SparseIntArray j0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f377A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f378a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f379b;
    public int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f380c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f381d;
    public int[] d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f382e;
    public String e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f383f;
    public String f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f384g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f385h;
    public boolean h0;
    public int i;
    public boolean i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f393q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f395t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f396u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f397v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f400y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f401z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.append(39, 24);
        sparseIntArray.append(40, 25);
        sparseIntArray.append(42, 28);
        sparseIntArray.append(43, 29);
        sparseIntArray.append(48, 35);
        sparseIntArray.append(47, 34);
        sparseIntArray.append(21, 4);
        sparseIntArray.append(20, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(56, 6);
        sparseIntArray.append(57, 7);
        sparseIntArray.append(28, 17);
        sparseIntArray.append(29, 18);
        sparseIntArray.append(30, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(44, 31);
        sparseIntArray.append(45, 32);
        sparseIntArray.append(27, 10);
        sparseIntArray.append(26, 9);
        sparseIntArray.append(60, 13);
        sparseIntArray.append(63, 16);
        sparseIntArray.append(61, 14);
        sparseIntArray.append(58, 11);
        sparseIntArray.append(62, 15);
        sparseIntArray.append(59, 12);
        sparseIntArray.append(51, 38);
        sparseIntArray.append(37, 37);
        sparseIntArray.append(36, 39);
        sparseIntArray.append(50, 40);
        sparseIntArray.append(35, 20);
        sparseIntArray.append(49, 36);
        sparseIntArray.append(25, 5);
        sparseIntArray.append(38, 76);
        sparseIntArray.append(46, 76);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(19, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(22, 61);
        sparseIntArray.append(24, 62);
        sparseIntArray.append(23, 63);
        sparseIntArray.append(55, 69);
        sparseIntArray.append(34, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f431d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = j0;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.g0 = typedArrayObtainStyledAttributes.getBoolean(index, this.g0);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.f391o = p.e(typedArrayObtainStyledAttributes, index, this.f391o);
                        break;
                    case 2:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 3:
                        this.f390n = p.e(typedArrayObtainStyledAttributes, index, this.f390n);
                        break;
                    case 4:
                        this.f389m = p.e(typedArrayObtainStyledAttributes, index, this.f389m);
                        break;
                    case 5:
                        this.f397v = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f401z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f401z);
                        break;
                    case 7:
                        this.f377A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f377A);
                        break;
                    case 8:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 9:
                        this.f394s = p.e(typedArrayObtainStyledAttributes, index, this.f394s);
                        break;
                    case 10:
                        this.r = p.e(typedArrayObtainStyledAttributes, index, this.r);
                        break;
                    case 11:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 12:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 13:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 14:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 15:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 16:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 17:
                        this.f381d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f381d);
                        break;
                    case 18:
                        this.f382e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f382e);
                        break;
                    case 19:
                        this.f383f = typedArrayObtainStyledAttributes.getFloat(index, this.f383f);
                        break;
                    case 20:
                        this.f395t = typedArrayObtainStyledAttributes.getFloat(index, this.f395t);
                        break;
                    case 21:
                        this.f380c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f380c);
                        break;
                    case 22:
                        this.f379b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f379b);
                        break;
                    case 23:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                        break;
                    case 24:
                        this.f384g = p.e(typedArrayObtainStyledAttributes, index, this.f384g);
                        break;
                    case 25:
                        this.f385h = p.e(typedArrayObtainStyledAttributes, index, this.f385h);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                        break;
                    case 27:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                        break;
                    case 28:
                        this.i = p.e(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 29:
                        this.f386j = p.e(typedArrayObtainStyledAttributes, index, this.f386j);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 31:
                        this.f392p = p.e(typedArrayObtainStyledAttributes, index, this.f392p);
                        break;
                    case 32:
                        this.f393q = p.e(typedArrayObtainStyledAttributes, index, this.f393q);
                        break;
                    case 33:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 34:
                        this.f388l = p.e(typedArrayObtainStyledAttributes, index, this.f388l);
                        break;
                    case 35:
                        this.f387k = p.e(typedArrayObtainStyledAttributes, index, this.f387k);
                        break;
                    case 36:
                        this.f396u = typedArrayObtainStyledAttributes.getFloat(index, this.f396u);
                        break;
                    case 37:
                        this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                        break;
                    case 38:
                        this.O = typedArrayObtainStyledAttributes.getFloat(index, this.O);
                        break;
                    case 39:
                        this.Q = typedArrayObtainStyledAttributes.getInt(index, this.Q);
                        break;
                    case 40:
                        this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                                break;
                            case 55:
                                this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                break;
                            case 56:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                break;
                            case 57:
                                this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                break;
                            case 58:
                                this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                break;
                            case 59:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f398w = p.e(typedArrayObtainStyledAttributes, index, this.f398w);
                                        break;
                                    case 62:
                                        this.f399x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f399x);
                                        break;
                                    case 63:
                                        this.f400y = typedArrayObtainStyledAttributes.getFloat(index, this.f400y);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                                break;
                                            case 73:
                                                this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                                break;
                                            case 74:
                                                this.e0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                                                break;
                                            case 76:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
