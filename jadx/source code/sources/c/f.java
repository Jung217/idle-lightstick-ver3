package c;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f328A;
    public String B;
    public int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f329a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f330b;
    public int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f331c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f332d;
    public int d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f333e;
    public int e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f334f;
    public int f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f335g;
    public float g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f336h;
    public int h0;
    public int i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f337j;
    public float j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f338k;
    public f.d k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f344q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f352z;

    public final void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.S) {
            this.V = false;
            if (this.H == 0) {
                this.H = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.T) {
            this.W = false;
            if (this.I == 0) {
                this.I = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.V = false;
            if (i == 0 && this.H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.W = false;
            if (i2 == 0 && this.I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f331c == -1.0f && this.f329a == -1 && this.f330b == -1) {
            return;
        }
        this.Y = true;
        this.V = true;
        this.W = true;
        if (!(this.k0 instanceof f.f)) {
            this.k0 = new f.f();
        }
        ((f.f) this.k0).H(this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.resolveLayoutDirection(int):void");
    }
}
