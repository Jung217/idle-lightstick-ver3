package g;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f599f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f604e;

    public final void a(ArrayList arrayList) {
        int size = this.f600a.size();
        if (this.f604e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = (o) arrayList.get(i);
                if (this.f604e == oVar.f601b) {
                    c(this.f602c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(e.d dVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f600a;
        if (arrayList.size() == 0) {
            return 0;
        }
        f.e eVar = (f.e) ((f.d) arrayList.get(0)).M;
        dVar.t();
        eVar.b(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((f.d) arrayList.get(i2)).b(dVar, false);
        }
        if (i == 0 && eVar.r0 > 0) {
            f.g.a(eVar, dVar, arrayList, 0);
        }
        if (i == 1 && eVar.s0 > 0) {
            f.g.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f603d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f.d dVar2 = (f.d) arrayList.get(i3);
            n nVar = new n(0);
            new WeakReference(dVar2);
            e.d.n(dVar2.B);
            e.d.n(dVar2.C);
            e.d.n(dVar2.D);
            e.d.n(dVar2.E);
            e.d.n(dVar2.F);
            this.f603d.add(nVar);
        }
        if (i == 0) {
            iN = e.d.n(eVar.B);
            iN2 = e.d.n(eVar.D);
            dVar.t();
        } else {
            iN = e.d.n(eVar.C);
            iN2 = e.d.n(eVar.E);
            dVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, o oVar) {
        ArrayList arrayList = this.f600a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f.d dVar = (f.d) obj;
            ArrayList arrayList2 = oVar.f600a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            int i3 = oVar.f601b;
            if (i == 0) {
                dVar.g0 = i3;
            } else {
                dVar.h0 = i3;
            }
        }
        this.f604e = oVar.f601b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f602c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f601b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f600a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            string = string + " " + ((f.d) obj).a0;
        }
        return string + " >";
    }
}
