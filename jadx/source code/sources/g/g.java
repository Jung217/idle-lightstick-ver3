package g;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f591m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof k) {
            this.f584e = 2;
        } else {
            this.f584e = 3;
        }
    }

    @Override // g.f
    public final void d(int i) {
        if (this.f588j) {
            return;
        }
        this.f588j = true;
        this.f586g = i;
        ArrayList arrayList = this.f589k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
