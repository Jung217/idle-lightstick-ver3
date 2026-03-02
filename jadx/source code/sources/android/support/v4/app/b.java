package android.support.v4.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f75h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f76j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f77k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f78l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f79m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f68a = new ArrayList();
    public int i = -1;

    public b(k kVar) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.i >= 0) {
            sb.append(" #");
            sb.append(this.i);
        }
        if (this.f75h != null) {
            sb.append(" ");
            sb.append(this.f75h);
        }
        sb.append("}");
        return sb.toString();
    }
}
