package x;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1059c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f1062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1063g;

    public m(p pVar, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f1061e = z2;
        this.f1062f = layoutInflater;
        this.f1058b = pVar;
        this.f1063g = i;
        a();
    }

    public final void a() {
        p pVar = this.f1058b;
        r rVar = pVar.f1084v;
        if (rVar != null) {
            pVar.i();
            ArrayList arrayList = pVar.f1073j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r) arrayList.get(i)) == rVar) {
                    this.f1059c = i;
                    return;
                }
            }
        }
        this.f1059c = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r getItem(int i) {
        ArrayList arrayListL;
        boolean z2 = this.f1061e;
        p pVar = this.f1058b;
        if (z2) {
            pVar.i();
            arrayListL = pVar.f1073j;
        } else {
            arrayListL = pVar.l();
        }
        int i2 = this.f1059c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (r) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z2 = this.f1061e;
        p pVar = this.f1058b;
        if (z2) {
            pVar.i();
            arrayListL = pVar.f1073j;
        } else {
            arrayListL = pVar.l();
        }
        return this.f1059c < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f1062f.inflate(this.f1063g, viewGroup, false);
        }
        int i2 = getItem(i).f1092b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f1092b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1058b.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        C c2 = (C) view;
        if (this.f1060d) {
            listMenuItemView.setForceShowIcon(true);
        }
        c2.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
