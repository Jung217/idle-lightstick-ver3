package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f789h;
    public NestedScrollView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListAdapter f795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f797q;
    public final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A.h f799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f800u = new a(0, this);

    public d(Context context, e eVar, Window window) {
        this.f782a = context;
        this.f783b = eVar;
        this.f784c = window;
        A.h hVar = new A.h();
        hVar.f10b = new WeakReference(eVar);
        this.f799t = hVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, u.a.f899e, R.attr.alertDialogStyle, 0);
        this.f796p = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f797q = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f798s = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        eVar.a().s(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
