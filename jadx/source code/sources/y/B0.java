package y;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements x.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.p f1137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x.r f1138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1139d;

    public B0(Toolbar toolbar) {
        this.f1139d = toolbar;
    }

    @Override // x.B
    public final boolean b(x.r rVar) {
        Toolbar toolbar = this.f1139d;
        KeyEvent.Callback callback = toolbar.f286j;
        if (callback instanceof w.b) {
            ((w.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f286j);
        toolbar.removeView(toolbar.i);
        toolbar.f286j = null;
        ArrayList arrayList = toolbar.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f1138c = null;
        toolbar.requestLayout();
        rVar.C = false;
        rVar.f1103n.p(false);
        return true;
    }

    @Override // x.B
    public final boolean d() {
        return false;
    }

    @Override // x.B
    public final boolean e(x.H h2) {
        return false;
    }

    @Override // x.B
    public final boolean f(x.r rVar) {
        Toolbar toolbar = this.f1139d;
        if (toolbar.i == null) {
            C0045x c0045x = new C0045x(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.i = c0045x;
            c0045x.setImageDrawable(toolbar.f284g);
            toolbar.i.setContentDescription(toolbar.f285h);
            C0 c0G = Toolbar.g();
            c0G.f1141a = (toolbar.f291o & 112) | 8388611;
            c0G.f1142b = 2;
            toolbar.i.setLayoutParams(c0G);
            toolbar.i.setOnClickListener(new t.a(2, toolbar));
        }
        ViewParent parent = toolbar.i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.i);
            }
            toolbar.addView(toolbar.i);
        }
        View actionView = rVar.getActionView();
        toolbar.f286j = actionView;
        this.f1138c = rVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f286j);
            }
            C0 c0G2 = Toolbar.g();
            c0G2.f1141a = 8388611 | (toolbar.f291o & 112);
            c0G2.f1142b = 2;
            toolbar.f286j.setLayoutParams(c0G2);
            toolbar.addView(toolbar.f286j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0) childAt.getLayoutParams()).f1142b != 2 && childAt != toolbar.f279b) {
                toolbar.removeViewAt(childCount);
                toolbar.F.add(childAt);
            }
        }
        toolbar.requestLayout();
        rVar.C = true;
        rVar.f1103n.p(false);
        KeyEvent.Callback callback = toolbar.f286j;
        if (callback instanceof w.b) {
            ((w.b) callback).onActionViewExpanded();
        }
        return true;
    }

    @Override // x.B
    public final void h() {
        if (this.f1138c != null) {
            x.p pVar = this.f1137b;
            if (pVar != null) {
                int size = pVar.f1070f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f1137b.getItem(i) == this.f1138c) {
                        return;
                    }
                }
            }
            b(this.f1138c);
        }
    }

    @Override // x.B
    public final void k(Context context, x.p pVar) {
        x.r rVar;
        x.p pVar2 = this.f1137b;
        if (pVar2 != null && (rVar = this.f1138c) != null) {
            pVar2.d(rVar);
        }
        this.f1137b = pVar;
    }

    @Override // x.B
    public final void a(x.p pVar, boolean z2) {
    }
}
