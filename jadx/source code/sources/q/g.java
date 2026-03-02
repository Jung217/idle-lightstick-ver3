package q;

import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f721e;

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentC;
        int i4;
        int i5;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f720d;
        if (!this.f717a || (viewParentC = c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f721e) == null) {
                this.f721e = new int[2];
            }
            iArr3 = (int[]) this.f721e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentC instanceof h) {
            ((NestedScrollView) ((h) viewParentC)).f160y.a(i, i2, iArr3, null, i3);
        } else if (i3 == 0) {
            try {
                viewParentC.onNestedPreScroll(nestedScrollView, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r20, int r21, int r22, int r23, int[] r24, int r25) {
        /*
            r19 = this;
            r1 = r19
            r7 = r23
            r8 = r24
            r15 = r25
            java.lang.Object r0 = r1.f720d
            r3 = r0
            android.support.v4.widget.NestedScrollView r3 = (android.support.v4.widget.NestedScrollView) r3
            boolean r0 = r1.f717a
            r2 = 0
            if (r0 == 0) goto L18
            android.view.ViewParent r4 = r1.c(r15)
            if (r4 != 0) goto L1b
        L18:
            r9 = r2
            goto L99
        L1b:
            r16 = 1
            if (r20 != 0) goto L2d
            if (r21 != 0) goto L2d
            if (r22 != 0) goto L2d
            if (r7 == 0) goto L26
            goto L2d
        L26:
            if (r8 == 0) goto L18
            r8[r2] = r2
            r8[r16] = r2
            return r2
        L2d:
            if (r8 == 0) goto L3b
            r3.getLocationInWindow(r8)
            r0 = r8[r2]
            r5 = r8[r16]
            r17 = r0
            r18 = r5
            goto L3f
        L3b:
            r17 = r2
            r18 = r17
        L3f:
            boolean r0 = r4 instanceof q.h
            if (r0 == 0) goto L60
            q.h r4 = (q.h) r4
            android.support.v4.widget.NestedScrollView r4 = (android.support.v4.widget.NestedScrollView) r4
            int r0 = r4.getScrollY()
            r4.scrollBy(r2, r7)
            int r5 = r4.getScrollY()
            int r11 = r5 - r0
            int r13 = r7 - r11
            r14 = 0
            q.g r9 = r4.f160y
            r10 = 0
            r12 = 0
            r9.b(r10, r11, r12, r13, r14, r15)
        L5e:
            r9 = r2
            goto L87
        L60:
            if (r25 != 0) goto L5e
            r5 = r21
            r6 = r22
            r9 = r2
            r2 = r4
            r4 = r20
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L6e
            goto L87
        L6e:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ViewParent "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " does not implement interface method onNestedScroll"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r2, r0)
        L87:
            if (r8 == 0) goto L98
            r3.getLocationInWindow(r8)
            r0 = r8[r9]
            int r0 = r0 - r17
            r8[r9] = r0
            r0 = r8[r16]
            int r0 = r0 - r18
            r8[r16] = r0
        L98:
            return r16
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g.b(int, int, int, int, int[], int):boolean");
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.f718b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.f719c;
    }

    public boolean d(int i) {
        return c(i) != null;
    }
}
