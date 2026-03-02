package w;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Resources f925d;

    public c(Context context, int i) {
        super(context);
        this.f922a = i;
    }

    public final void a() {
        if (this.f923b == null) {
            this.f923b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f923b.setTo(theme);
            }
        }
        this.f923b.applyStyle(this.f922a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f925d == null) {
            this.f925d = super.getResources();
        }
        return this.f925d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f924c == null) {
            this.f924c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f924c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f923b;
        if (theme != null) {
            return theme;
        }
        if (this.f922a == 0) {
            this.f922a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f923b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f922a != i) {
            this.f922a = i;
            a();
        }
    }
}
