package g;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f.e f572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.e f575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.g f577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f579h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        p pVar = fVar.f583d;
        l lVar2 = pVar.f607c;
        f fVar2 = pVar.i;
        f fVar3 = pVar.f612h;
        if (lVar2 == null) {
            f.e eVar = this.f572a;
            if (pVar == eVar.f539d || pVar == eVar.f540e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f594a = null;
                lVar.f595b = new ArrayList();
                lVar.f594a = pVar;
                arrayList.add(lVar);
            }
            pVar.f607c = lVar;
            lVar.f595b.add(pVar);
            ArrayList arrayList2 = fVar3.f589k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f589k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (pVar instanceof m)) {
                ArrayList arrayList4 = ((m) pVar).f596k.f589k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f590l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((f) obj4, i, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f590l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((f) obj5, i, arrayList, lVar);
            }
            if (i == 1 && (pVar instanceof m)) {
                ArrayList arrayList7 = ((m) pVar).f596k.f590l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((f) obj6, i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(f.e r25) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b(f.e):void");
    }

    public final void c() {
        f.e eVar = this.f572a;
        ArrayList arrayList = this.f579h;
        ArrayList arrayList2 = this.f576e;
        arrayList2.clear();
        f.e eVar2 = this.f575d;
        eVar2.f539d.f();
        eVar2.f540e.f();
        arrayList2.add(eVar2.f539d);
        arrayList2.add(eVar2.f540e);
        ArrayList arrayList3 = eVar2.j0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            f.d dVar = (f.d) obj;
            if (dVar instanceof f.f) {
                i iVar = new i(dVar);
                dVar.f539d.f();
                dVar.f540e.f();
                iVar.f610f = ((f.f) dVar).n0;
                arrayList2.add(iVar);
            } else {
                if (dVar.r()) {
                    if (dVar.f537b == null) {
                        dVar.f537b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f537b);
                } else {
                    arrayList2.add(dVar.f539d);
                }
                if (dVar.s()) {
                    if (dVar.f538c == null) {
                        dVar.f538c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f538c);
                } else {
                    arrayList2.add(dVar.f540e);
                }
                if (dVar instanceof f.a) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((p) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            p pVar = (p) obj3;
            if (pVar.f606b != eVar2) {
                pVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f539d, 0, arrayList);
        e(eVar.f540e, 1, arrayList);
        this.f573b = false;
    }

    public final int d(f.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f2;
        f.e eVar2 = eVar;
        ArrayList arrayList2 = this.f579h;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            p pVar = ((l) arrayList2.get(i3)).f594a;
            if (!(pVar instanceof c) ? !(i != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((c) pVar).f610f != i) {
                f fVar = (i == 0 ? eVar2.f539d : eVar2.f540e).f612h;
                f fVar2 = (i == 0 ? eVar2.f539d : eVar2.f540e).i;
                f fVar3 = pVar.f612h;
                f fVar4 = pVar.i;
                boolean zContains = fVar3.f590l.contains(fVar);
                boolean zContains2 = fVar4.f590l.contains(fVar2);
                long j3 = pVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j2);
                    long jA = l.a(fVar4, j2);
                    long j4 = jB - j3;
                    int i4 = fVar4.f585f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j4 >= (-i4)) {
                        j4 += (long) i4;
                    }
                    long j5 = fVar3.f585f;
                    long j6 = ((-jA) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    f.d dVar = pVar.f606b;
                    if (i == 0) {
                        f2 = dVar.W;
                    } else if (i == 1) {
                        f2 = dVar.X;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j6 / f2)) : 0L;
                    jMax = (((long) fVar3.f585f) + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - ((long) fVar4.f585f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(l.b(fVar3, fVar3.f585f), ((long) fVar3.f585f) + j3) : zContains2 ? Math.max(-l.a(fVar4, fVar4.f585f), ((long) (-fVar4.f585f)) + j3) : (pVar.j() + ((long) fVar3.f585f)) - ((long) fVar4.f585f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j2;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i2;
            j2 = 0;
        }
        return (int) jMax2;
    }

    public final void e(p pVar, int i, ArrayList arrayList) {
        f fVar = pVar.f612h;
        f fVar2 = pVar.i;
        ArrayList arrayList2 = fVar.f589k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f612h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f589k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) pVar).f596k.f589k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, f.d dVar) {
        b bVar = this.f578g;
        bVar.f561a = i;
        bVar.f562b = i3;
        bVar.f563c = i2;
        bVar.f564d = i4;
        this.f577f.b(dVar, bVar);
        dVar.D(bVar.f565e);
        dVar.A(bVar.f566f);
        dVar.f558y = bVar.f568h;
        int i5 = bVar.f567g;
        dVar.T = i5;
        dVar.f558y = i5 > 0;
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f572a.j0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            f.d dVar = (f.d) arrayList.get(i);
            if (!dVar.f536a) {
                int[] iArr = dVar.i0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dVar.f546l;
                int i6 = dVar.f547m;
                boolean z2 = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z3 = i4 == 2 || (i4 == 3 && i6 == 1);
                g gVar = dVar.f539d.f609e;
                boolean z4 = gVar.f588j;
                g gVar2 = dVar.f540e.f609e;
                boolean z5 = gVar2.f588j;
                boolean z6 = z2;
                if (z4 && z5) {
                    eVar.f(1, gVar.f586g, 1, gVar2.f586g, dVar);
                    dVar.f536a = true;
                } else if (z4 && z3) {
                    f(1, gVar.f586g, 2, gVar2.f586g, dVar);
                    if (i4 == 3) {
                        dVar.f540e.f609e.f591m = dVar.i();
                    } else {
                        dVar.f540e.f609e.d(dVar.i());
                        dVar.f536a = true;
                    }
                } else if (z5 && z6) {
                    f(2, gVar.f586g, 1, gVar2.f586g, dVar);
                    if (i3 == 3) {
                        dVar.f539d.f609e.f591m = dVar.l();
                    } else {
                        dVar.f539d.f609e.d(dVar.l());
                        dVar.f536a = true;
                    }
                }
                if (dVar.f536a && (aVar = dVar.f540e.f597l) != null) {
                    aVar.d(dVar.T);
                }
                eVar = this;
            }
            i = i2;
        }
    }
}
