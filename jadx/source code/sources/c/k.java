package c;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f376f;

    public k() {
        n nVar = new n();
        nVar.f407a = 0;
        nVar.f408b = 0;
        nVar.f409c = 1.0f;
        nVar.f410d = Float.NaN;
        this.f372b = nVar;
        m mVar = new m();
        mVar.f403a = -1;
        mVar.f404b = -1;
        mVar.f405c = Float.NaN;
        mVar.f406d = Float.NaN;
        this.f373c = mVar;
        l lVar = new l();
        lVar.f378a = false;
        lVar.f381d = -1;
        lVar.f382e = -1;
        lVar.f383f = -1.0f;
        lVar.f384g = -1;
        lVar.f385h = -1;
        lVar.i = -1;
        lVar.f386j = -1;
        lVar.f387k = -1;
        lVar.f388l = -1;
        lVar.f389m = -1;
        lVar.f390n = -1;
        lVar.f391o = -1;
        lVar.f392p = -1;
        lVar.f393q = -1;
        lVar.r = -1;
        lVar.f394s = -1;
        lVar.f395t = 0.5f;
        lVar.f396u = 0.5f;
        lVar.f397v = null;
        lVar.f398w = -1;
        lVar.f399x = 0;
        lVar.f400y = 0.0f;
        lVar.f401z = -1;
        lVar.f377A = -1;
        lVar.B = -1;
        lVar.C = -1;
        lVar.D = -1;
        lVar.E = -1;
        lVar.F = -1;
        lVar.G = -1;
        lVar.H = -1;
        lVar.I = -1;
        lVar.J = -1;
        lVar.K = -1;
        lVar.L = -1;
        lVar.M = -1;
        lVar.N = -1;
        lVar.O = -1.0f;
        lVar.P = -1.0f;
        lVar.Q = 0;
        lVar.R = 0;
        lVar.S = 0;
        lVar.T = 0;
        lVar.U = -1;
        lVar.V = -1;
        lVar.W = -1;
        lVar.X = -1;
        lVar.Y = 1.0f;
        lVar.Z = 1.0f;
        lVar.a0 = -1;
        lVar.b0 = 0;
        lVar.c0 = -1;
        lVar.g0 = false;
        lVar.h0 = false;
        lVar.i0 = true;
        this.f374d = lVar;
        o oVar = new o();
        oVar.f412a = 0.0f;
        oVar.f413b = 0.0f;
        oVar.f414c = 0.0f;
        oVar.f415d = 1.0f;
        oVar.f416e = 1.0f;
        oVar.f417f = Float.NaN;
        oVar.f418g = Float.NaN;
        oVar.f419h = 0.0f;
        oVar.i = 0.0f;
        oVar.f420j = 0.0f;
        oVar.f421k = false;
        oVar.f422l = 0.0f;
        this.f375e = oVar;
        this.f376f = new HashMap();
    }

    public final void a(f fVar) {
        l lVar = this.f374d;
        fVar.f332d = lVar.f384g;
        fVar.f333e = lVar.f385h;
        fVar.f334f = lVar.i;
        fVar.f335g = lVar.f386j;
        fVar.f336h = lVar.f387k;
        fVar.i = lVar.f388l;
        fVar.f337j = lVar.f389m;
        fVar.f338k = lVar.f390n;
        fVar.f339l = lVar.f391o;
        fVar.f343p = lVar.f392p;
        fVar.f344q = lVar.f393q;
        fVar.r = lVar.r;
        fVar.f345s = lVar.f394s;
        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = lVar.C;
        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = lVar.D;
        ((ViewGroup.MarginLayoutParams) fVar).topMargin = lVar.E;
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = lVar.F;
        fVar.f350x = lVar.N;
        fVar.f351y = lVar.M;
        fVar.f347u = lVar.J;
        fVar.f349w = lVar.L;
        fVar.f352z = lVar.f395t;
        fVar.f328A = lVar.f396u;
        fVar.f340m = lVar.f398w;
        fVar.f341n = lVar.f399x;
        fVar.f342o = lVar.f400y;
        fVar.B = lVar.f397v;
        fVar.P = lVar.f401z;
        fVar.Q = lVar.f377A;
        fVar.E = lVar.O;
        fVar.D = lVar.P;
        fVar.G = lVar.R;
        fVar.F = lVar.Q;
        fVar.S = lVar.g0;
        fVar.T = lVar.h0;
        fVar.H = lVar.S;
        fVar.I = lVar.T;
        fVar.L = lVar.U;
        fVar.M = lVar.V;
        fVar.J = lVar.W;
        fVar.K = lVar.X;
        fVar.N = lVar.Y;
        fVar.O = lVar.Z;
        fVar.R = lVar.B;
        fVar.f331c = lVar.f383f;
        fVar.f329a = lVar.f381d;
        fVar.f330b = lVar.f382e;
        ((ViewGroup.MarginLayoutParams) fVar).width = lVar.f379b;
        ((ViewGroup.MarginLayoutParams) fVar).height = lVar.f380c;
        String str = lVar.f0;
        if (str != null) {
            fVar.U = str;
        }
        fVar.setMarginStart(lVar.H);
        fVar.setMarginEnd(lVar.G);
        fVar.a();
    }

    public final Object clone() {
        k kVar = new k();
        l lVar = kVar.f374d;
        lVar.getClass();
        l lVar2 = this.f374d;
        lVar.f378a = lVar2.f378a;
        lVar.f379b = lVar2.f379b;
        lVar.f380c = lVar2.f380c;
        lVar.f381d = lVar2.f381d;
        lVar.f382e = lVar2.f382e;
        lVar.f383f = lVar2.f383f;
        lVar.f384g = lVar2.f384g;
        lVar.f385h = lVar2.f385h;
        lVar.i = lVar2.i;
        lVar.f386j = lVar2.f386j;
        lVar.f387k = lVar2.f387k;
        lVar.f388l = lVar2.f388l;
        lVar.f389m = lVar2.f389m;
        lVar.f390n = lVar2.f390n;
        lVar.f391o = lVar2.f391o;
        lVar.f392p = lVar2.f392p;
        lVar.f393q = lVar2.f393q;
        lVar.r = lVar2.r;
        lVar.f394s = lVar2.f394s;
        lVar.f395t = lVar2.f395t;
        lVar.f396u = lVar2.f396u;
        lVar.f397v = lVar2.f397v;
        lVar.f398w = lVar2.f398w;
        lVar.f399x = lVar2.f399x;
        lVar.f400y = lVar2.f400y;
        lVar.f401z = lVar2.f401z;
        lVar.f377A = lVar2.f377A;
        lVar.B = lVar2.B;
        lVar.C = lVar2.C;
        lVar.D = lVar2.D;
        lVar.E = lVar2.E;
        lVar.F = lVar2.F;
        lVar.G = lVar2.G;
        lVar.H = lVar2.H;
        lVar.I = lVar2.I;
        lVar.J = lVar2.J;
        lVar.K = lVar2.K;
        lVar.L = lVar2.L;
        lVar.M = lVar2.M;
        lVar.N = lVar2.N;
        lVar.O = lVar2.O;
        lVar.P = lVar2.P;
        lVar.Q = lVar2.Q;
        lVar.R = lVar2.R;
        lVar.S = lVar2.S;
        lVar.T = lVar2.T;
        lVar.U = lVar2.U;
        lVar.V = lVar2.V;
        lVar.W = lVar2.W;
        lVar.X = lVar2.X;
        lVar.Y = lVar2.Y;
        lVar.Z = lVar2.Z;
        lVar.a0 = lVar2.a0;
        lVar.b0 = lVar2.b0;
        lVar.c0 = lVar2.c0;
        lVar.f0 = lVar2.f0;
        int[] iArr = lVar2.d0;
        if (iArr != null) {
            lVar.d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            lVar.d0 = null;
        }
        lVar.e0 = lVar2.e0;
        lVar.g0 = lVar2.g0;
        lVar.h0 = lVar2.h0;
        lVar.i0 = lVar2.i0;
        m mVar = kVar.f373c;
        mVar.getClass();
        m mVar2 = this.f373c;
        mVar2.getClass();
        mVar.f403a = mVar2.f403a;
        mVar.f404b = mVar2.f404b;
        mVar.f406d = mVar2.f406d;
        mVar.f405c = mVar2.f405c;
        n nVar = this.f372b;
        int i = nVar.f407a;
        n nVar2 = kVar.f372b;
        nVar2.f407a = i;
        nVar2.f409c = nVar.f409c;
        nVar2.f410d = nVar.f410d;
        nVar2.f408b = nVar.f408b;
        o oVar = kVar.f375e;
        oVar.getClass();
        o oVar2 = this.f375e;
        oVar2.getClass();
        oVar.f412a = oVar2.f412a;
        oVar.f413b = oVar2.f413b;
        oVar.f414c = oVar2.f414c;
        oVar.f415d = oVar2.f415d;
        oVar.f416e = oVar2.f416e;
        oVar.f417f = oVar2.f417f;
        oVar.f418g = oVar2.f418g;
        oVar.f419h = oVar2.f419h;
        oVar.i = oVar2.i;
        oVar.f420j = oVar2.f420j;
        oVar.f421k = oVar2.f421k;
        oVar.f422l = oVar2.f422l;
        kVar.f371a = this.f371a;
        return kVar;
    }
}
