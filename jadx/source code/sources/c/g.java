package c;

import android.support.constraint.ConstraintLayout;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f360h;

    public g(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f360h = constraintLayout;
        this.f353a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(f.d r18, g.b r19) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.b(f.d, g.b):void");
    }
}
