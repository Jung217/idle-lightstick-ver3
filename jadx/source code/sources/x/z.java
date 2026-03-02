package x;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f1127e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A f1130h;
    public x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1131j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1128f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f1132k = new y(this);

    public z(Context context, p pVar, View view, boolean z2, int i, int i2) {
        this.f1123a = context;
        this.f1124b = pVar;
        this.f1127e = view;
        this.f1125c = z2;
        this.f1126d = i;
    }

    public final x a() {
        x g2;
        if (this.i == null) {
            Context context = this.f1123a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                g2 = new j(context, this.f1127e, this.f1126d, this.f1125c);
            } else {
                g2 = new G(this.f1123a, this.f1124b, this.f1127e, this.f1126d, this.f1125c);
            }
            g2.l(this.f1124b);
            g2.r(this.f1132k);
            g2.n(this.f1127e);
            g2.g(this.f1130h);
            g2.o(this.f1129g);
            g2.p(this.f1128f);
            this.i = g2;
        }
        return this.i;
    }

    public final boolean b() {
        x xVar = this.i;
        return xVar != null && xVar.i();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1131j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        x xVarA = a();
        xVarA.s(z3);
        if (z2) {
            int i3 = this.f1128f;
            View view = this.f1127e;
            WeakHashMap weakHashMap = q.l.f728a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f1127e.getWidth();
            }
            xVarA.q(i);
            xVarA.t(i2);
            int i4 = (int) ((this.f1123a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            xVarA.f1121b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        xVarA.c();
    }
}
