package w;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import q.p;
import q.q;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f975e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f972b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f976f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f971a = new ArrayList();

    public final void a() {
        if (this.f975e) {
            ArrayList arrayList = this.f971a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((p) obj).b();
            }
            this.f975e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f975e) {
            return;
        }
        ArrayList arrayList = this.f971a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p pVar = (p) obj;
            long j2 = this.f972b;
            if (j2 >= 0) {
                pVar.c(j2);
            }
            Interpolator interpolator = this.f973c;
            if (interpolator != null && (view = (View) pVar.f733a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f974d != null) {
                pVar.d(this.f976f);
            }
            View view2 = (View) pVar.f733a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f975e = true;
    }
}
