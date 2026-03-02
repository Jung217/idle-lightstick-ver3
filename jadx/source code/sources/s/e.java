package s;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import y.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f753h;
    public f i;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f749d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.f752g;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                d dVar = this.f753h;
                if (dVar != null) {
                    cursor2.unregisterDataSetObserver(dVar);
                }
            }
            this.f749d = cursor;
            if (cursor != null) {
                c cVar2 = this.f752g;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                d dVar2 = this.f753h;
                if (dVar2 != null) {
                    cursor.registerDataSetObserver(dVar2);
                }
                this.f751f = cursor.getColumnIndexOrThrow("_id");
                this.f747b = true;
                notifyDataSetChanged();
            } else {
                this.f751f = -1;
                this.f747b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f747b || (cursor = this.f749d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f747b) {
            return null;
        }
        this.f749d.moveToPosition(i);
        if (view == null) {
            w0 w0Var = (w0) this;
            view = w0Var.f1407l.inflate(w0Var.f1406k, viewGroup, false);
        }
        a(view, this.f749d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.i == null) {
            f fVar = new f();
            fVar.f754a = this;
            this.i = fVar;
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f747b || (cursor = this.f749d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f749d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f747b && (cursor = this.f749d) != null && cursor.moveToPosition(i)) {
            return this.f749d.getLong(this.f751f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f747b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f749d.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f749d);
        return view;
    }
}
