package s;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import y.V;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A.g f758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f762h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V f770q;

    public g(V v2) {
        a aVar = new a();
        aVar.f739e = Long.MIN_VALUE;
        aVar.f741g = -1L;
        aVar.f740f = 0L;
        this.f755a = aVar;
        this.f756b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f759e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f760f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f763j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f764k = fArr5;
        this.f757c = v2;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f761g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f762h = r;
        aVar.f735a = 500;
        aVar.f736b = 500;
        this.f770q = v2;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f759e
            r0 = r0[r4]
            float[] r1 = r3.f760f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f756b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r4]
            float[] r1 = r3.f763j
            r1 = r1[r4]
            float[] r2 = r3.f764k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 != 0.0f) {
            int i = this.f761g;
            if (i == 0 || i == 1) {
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (this.f768o && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < 0.0f) {
                return f2 / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f766m) {
            this.f768o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f755a;
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.f739e);
        int i3 = aVar.f736b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.f742h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f741g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        V v2;
        int count;
        a aVar = this.f755a;
        float f2 = aVar.f738d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f737c);
        if (iAbs != 0 && (count = (v2 = this.f770q).getCount()) != 0) {
            int childCount = v2.getChildCount();
            int firstVisiblePosition = v2.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && v2.getChildAt(0).getTop() >= 0)) : !(i >= count && v2.getChildAt(childCount - 1).getBottom() <= v2.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f769p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            r4 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.f767n = r3
            r8.f765l = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            y.V r5 = r8.f757c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r3, r10, r9, r4)
            s.a r10 = r8.f755a
            r10.f737c = r0
            r10.f738d = r9
            boolean r9 = r8.f768o
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            A.g r9 = r8.f758d
            if (r9 != 0) goto L60
            A.g r9 = new A.g
            r9.<init>(r2, r8)
            r8.f758d = r9
        L60:
            r8.f768o = r3
            r8.f766m = r3
            boolean r9 = r8.f765l
            if (r9 != 0) goto L75
            int r9 = r8.f762h
            if (r9 <= 0) goto L75
            A.g r10 = r8.f758d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = q.l.f728a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            A.g r9 = r8.f758d
            r9.run()
        L7a:
            r8.f765l = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
