package x;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class s extends FrameLayout implements w.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f1115b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(View view) {
        super(view.getContext());
        this.f1115b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // w.b
    public final void onActionViewCollapsed() {
        this.f1115b.onActionViewCollapsed();
    }

    @Override // w.b
    public final void onActionViewExpanded() {
        this.f1115b.onActionViewExpanded();
    }
}
