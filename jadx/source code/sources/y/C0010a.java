package y;

import android.support.v7.widget.ActionBarContextView;
import android.view.View;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0010a implements q.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1256a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f1258c;

    public C0010a(ActionBarContextView actionBarContextView) {
        this.f1258c = actionBarContextView;
    }

    @Override // q.q
    public final void a() {
        if (this.f1256a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f1258c;
        actionBarContextView.f209g = null;
        super/*android.view.View*/.setVisibility(this.f1257b);
    }

    @Override // q.q
    public final void b(View view) {
        this.f1256a = true;
    }

    @Override // q.q
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f1256a = false;
    }
}
