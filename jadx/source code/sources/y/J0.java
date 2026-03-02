package y;

import android.content.Context;
import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1194g;

    public J0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1191d = layoutParams;
        this.f1192e = new Rect();
        this.f1193f = new int[2];
        this.f1194g = new int[2];
        this.f1189b = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1188a = viewInflate;
        this.f1190c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(J0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public J0(ContextThemeWrapper contextThemeWrapper) {
        this.f1189b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
