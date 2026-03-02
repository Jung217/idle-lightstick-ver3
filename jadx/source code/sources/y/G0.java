package y;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1163h;
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f1165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0030k f1167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f1169o;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f1156a;
        int i2 = this.f1157b ^ i;
        this.f1157b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f1156a;
                if ((this.f1157b & 4) != 0) {
                    Drawable drawable = this.f1161f;
                    if (drawable == null) {
                        drawable = this.f1169o;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f1163h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f1158c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f1156a;
        if ((this.f1157b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1164j)) {
                toolbar.setNavigationContentDescription(this.f1168n);
            } else {
                toolbar.setNavigationContentDescription(this.f1164j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f1157b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1160e) == null) {
            drawable = this.f1159d;
        }
        this.f1156a.setLogo(drawable);
    }
}
