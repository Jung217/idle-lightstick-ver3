package w;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import x.E;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f932b;

    public e(Context context, a aVar) {
        this.f931a = context;
        this.f932b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f932b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f932b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new E(this.f931a, this.f932b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f932b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f932b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f932b.f920b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f932b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f932b.f921c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f932b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f932b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f932b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f932b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f932b.f920b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f932b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f932b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f932b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f932b.n(i);
    }
}
