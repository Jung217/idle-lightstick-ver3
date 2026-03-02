package g;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f583d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f586g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f580a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f581b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f582c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f584e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f587h = 1;
    public g i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f588j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f589k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f590l = new ArrayList();

    public f(p pVar) {
        this.f583d = pVar;
    }

    @Override // g.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f590l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((f) obj).f588j) {
                return;
            }
        }
        this.f582c = true;
        p pVar = this.f580a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f581b) {
            this.f583d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f588j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f588j) {
                    return;
                } else {
                    this.f585f = this.f587h * gVar.f586g;
                }
            }
            d(fVar.f586g + this.f585f);
        }
        p pVar2 = this.f580a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f589k.add(pVar);
        if (this.f588j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f590l.clear();
        this.f589k.clear();
        this.f588j = false;
        this.f586g = 0;
        this.f582c = false;
        this.f581b = false;
    }

    public void d(int i) {
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

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f583d.f606b.a0);
        sb.append(":");
        switch (this.f584e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f588j ? Integer.valueOf(this.f586g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f590l.size());
        sb.append(":d=");
        sb.append(this.f589k.size());
        sb.append(">");
        return sb.toString();
    }
}
