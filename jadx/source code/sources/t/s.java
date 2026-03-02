package t;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends android.arch.lifecycle.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f874n;

    public /* synthetic */ s(u uVar, int i) {
        this.f873m = i;
        this.f874n = uVar;
    }

    @Override // q.q
    public final void a() {
        View view;
        int i = this.f873m;
        u uVar = this.f874n;
        switch (i) {
            case 0:
                if (uVar.f880A && (view = uVar.f886s) != null) {
                    view.setTranslationY(0.0f);
                    uVar.f884p.setTranslationY(0.0f);
                }
                uVar.f884p.setVisibility(8);
                uVar.f884p.setTransitioning(false);
                uVar.E = null;
                c.j jVar = uVar.f890w;
                if (jVar != null) {
                    jVar.a(uVar.f889v);
                    uVar.f889v = null;
                    uVar.f890w = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = uVar.f883o;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = q.l.f728a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                uVar.E = null;
                uVar.f884p.requestLayout();
                break;
        }
    }
}
