package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import e.c;
import x.D;
import x.o;
import x.p;
import x.r;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements o, D, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f179c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f180b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c cVarG = c.g(context, attributeSet, f179c, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(cVarG.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(cVarG.b(1));
        }
        cVarG.h();
    }

    @Override // x.D
    public final void a(p pVar) {
        this.f180b = pVar;
    }

    @Override // x.o
    public final boolean b(r rVar) {
        return this.f180b.q(rVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        b((r) getAdapter().getItem(i));
    }
}
