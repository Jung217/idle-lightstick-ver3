package q;

import android.animation.ValueAnimator;
import android.view.View;
import t.u;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.arch.lifecycle.i f732a;

    public o(android.arch.lifecycle.i iVar, View view) {
        this.f732a = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) ((u) this.f732a.f46b).f884p.getParent()).invalidate();
    }
}
