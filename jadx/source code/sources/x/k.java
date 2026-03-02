package x;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1050b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1051c;

    public k(l lVar) {
        this.f1051c = lVar;
        a();
    }

    public final void a() {
        p pVar = this.f1051c.f1054d;
        r rVar = pVar.f1084v;
        if (rVar != null) {
            pVar.i();
            ArrayList arrayList = pVar.f1073j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r) arrayList.get(i)) == rVar) {
                    this.f1050b = i;
                    return;
                }
            }
        }
        this.f1050b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r getItem(int i) {
        l lVar = this.f1051c;
        p pVar = lVar.f1054d;
        pVar.i();
        ArrayList arrayList = pVar.f1073j;
        lVar.getClass();
        int i2 = this.f1050b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (r) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        l lVar = this.f1051c;
        p pVar = lVar.f1054d;
        pVar.i();
        int size = pVar.f1073j.size();
        lVar.getClass();
        return this.f1050b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1051c.f1053c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((C) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
