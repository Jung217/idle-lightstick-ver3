package x;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import y.J0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements B, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f1053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f1054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f1055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f1056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f1057g;

    public l(ContextWrapper contextWrapper) {
        this.f1052b = contextWrapper;
        this.f1053c = LayoutInflater.from(contextWrapper);
    }

    @Override // x.B
    public final void a(p pVar, boolean z2) {
        A a2 = this.f1056f;
        if (a2 != null) {
            a2.a(pVar, z2);
        }
    }

    @Override // x.B
    public final boolean b(r rVar) {
        return false;
    }

    @Override // x.B
    public final boolean d() {
        return false;
    }

    @Override // x.B
    public final boolean e(H h2) {
        boolean zHasVisibleItems = h2.hasVisibleItems();
        Context context = h2.f1065a;
        if (!zHasVisibleItems) {
            return false;
        }
        q qVar = new q();
        qVar.f1087b = h2;
        int iC = t.e.c(context, 0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, t.e.c(context, iC));
        J0 j0 = new J0(contextThemeWrapper);
        l lVar = new l(contextThemeWrapper);
        qVar.f1089d = lVar;
        lVar.f1056f = qVar;
        h2.b(lVar, context);
        l lVar2 = qVar.f1089d;
        if (lVar2.f1057g == null) {
            lVar2.f1057g = new k(lVar2);
        }
        j0.f1193f = lVar2.f1057g;
        j0.f1194g = qVar;
        View view = h2.f1078o;
        if (view != null) {
            j0.f1188a = view;
        } else {
            j0.f1190c = h2.f1077n;
            j0.f1191d = h2.f1076m;
        }
        j0.f1192e = qVar;
        t.e eVar = new t.e(contextThemeWrapper, iC);
        View view2 = j0.f1188a;
        t.d dVar = eVar.f803d;
        if (view2 != null) {
            dVar.f794n = view2;
        } else {
            CharSequence charSequence = (CharSequence) j0.f1191d;
            if (charSequence != null) {
                dVar.f785d = charSequence;
                TextView textView = dVar.f792l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) j0.f1190c;
            if (drawable != null) {
                dVar.f790j = drawable;
                ImageView imageView = dVar.f791k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    dVar.f791k.setImageDrawable(drawable);
                }
            }
        }
        if (((k) j0.f1193f) != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) j0.f1189b).inflate(dVar.f797q, (ViewGroup) null);
            int i = dVar.r;
            ListAdapter cVar = (k) j0.f1193f;
            if (cVar == null) {
                cVar = new t.c(contextThemeWrapper, i, R.id.text1, null);
            }
            dVar.f795o = cVar;
            if (((q) j0.f1194g) != null) {
                alertController$RecycleListView.setOnItemClickListener(new t.b(j0, dVar));
            }
            dVar.f786e = alertController$RecycleListView;
        }
        eVar.setCancelable(true);
        eVar.setCanceledOnTouchOutside(true);
        eVar.setOnCancelListener(null);
        eVar.setOnDismissListener(null);
        q qVar2 = (q) j0.f1192e;
        if (qVar2 != null) {
            eVar.setOnKeyListener(qVar2);
        }
        qVar.f1088c = eVar;
        eVar.setOnDismissListener(qVar);
        WindowManager.LayoutParams attributes = qVar.f1088c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        qVar.f1088c.show();
        A a2 = this.f1056f;
        if (a2 != null) {
            a2.f(h2);
        }
        return true;
    }

    @Override // x.B
    public final boolean f(r rVar) {
        return false;
    }

    @Override // x.B
    public final void g(A a2) {
        throw null;
    }

    @Override // x.B
    public final void h() {
        k kVar = this.f1057g;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // x.B
    public final void k(Context context, p pVar) {
        if (this.f1052b != null) {
            this.f1052b = context;
            if (this.f1053c == null) {
                this.f1053c = LayoutInflater.from(context);
            }
        }
        this.f1054d = pVar;
        k kVar = this.f1057g;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f1054d.q(this.f1057g.getItem(i), this, 0);
    }
}
