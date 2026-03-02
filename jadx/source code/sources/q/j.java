package q;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.M0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.i f723a;

    public j(t.i iVar) {
        this.f723a = iVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        boolean z2;
        boolean z3;
        r rVar = windowInsets == null ? null : new r(windowInsets);
        WindowInsets windowInsets2 = (WindowInsets) rVar.f734a;
        int systemWindowInsetTop = windowInsets2.getSystemWindowInsetTop();
        t.n nVar = this.f723a.f817c;
        Context context = nVar.f839b;
        ActionBarContextView actionBarContextView = nVar.f849m;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = systemWindowInsetTop;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nVar.f849m.getLayoutParams();
            if (nVar.f849m.isShown()) {
                if (nVar.N == null) {
                    nVar.N = new Rect();
                    nVar.O = new Rect();
                }
                Rect rect = nVar.N;
                Rect rect2 = nVar.O;
                rect.set(0, systemWindowInsetTop, 0, 0);
                ViewGroup viewGroup = nVar.r;
                Method method = M0.f1214a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? systemWindowInsetTop : 0)) {
                    marginLayoutParams.topMargin = systemWindowInsetTop;
                    View view2 = nVar.f855t;
                    if (view2 == null) {
                        View view3 = new View(context);
                        nVar.f855t = view3;
                        view3.setBackgroundColor(context.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        nVar.r.addView(nVar.f855t, -1, new ViewGroup.LayoutParams(-1, systemWindowInsetTop));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams.height != systemWindowInsetTop) {
                            layoutParams.height = systemWindowInsetTop;
                            nVar.f855t.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = nVar.f855t != null;
                i = (nVar.f860y || !z) ? systemWindowInsetTop : 0;
                boolean z4 = z;
                z = z3;
                z2 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i = systemWindowInsetTop;
                z2 = false;
            } else {
                i = systemWindowInsetTop;
                z2 = false;
                z = false;
            }
            if (z) {
                nVar.f849m.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = nVar.f855t;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        if (systemWindowInsetTop != i) {
            rVar = new r(windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), i, windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom()));
        }
        WeakHashMap weakHashMap = l.f728a;
        WindowInsets windowInsets3 = (WindowInsets) rVar.f734a;
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets3);
        if (windowInsetsOnApplyWindowInsets != windowInsets3) {
            windowInsets3 = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        r rVar2 = windowInsets3 == null ? null : new r(windowInsets3);
        return (WindowInsets) (rVar2 != null ? rVar2.f734a : null);
    }
}
