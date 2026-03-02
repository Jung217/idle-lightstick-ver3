package g;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f595b;

    public static long a(f fVar, long j2) {
        p pVar = fVar.f583d;
        ArrayList arrayList = fVar.f589k;
        if (pVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long jMin = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f583d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f585f) + j2));
                }
            }
        }
        f fVar3 = pVar.i;
        f fVar4 = pVar.f612h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j3 = j2 - pVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j3)), j3 - ((long) fVar4.f585f));
    }

    public static long b(f fVar, long j2) {
        p pVar = fVar.f583d;
        ArrayList arrayList = fVar.f589k;
        if (pVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long jMax = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f583d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f585f) + j2));
                }
            }
        }
        f fVar3 = pVar.f612h;
        f fVar4 = pVar.i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j3 = pVar.j() + j2;
        return Math.max(Math.max(jMax, b(fVar4, j3)), j3 - ((long) fVar4.f585f));
    }
}
