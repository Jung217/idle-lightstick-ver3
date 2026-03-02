package n;

import java.util.ArrayList;
import p.j;
import y.B;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f647b;

    public /* synthetic */ c(int i, Object obj) {
        this.f646a = i;
        this.f647b = obj;
    }

    public final void a(Object obj) {
        switch (this.f646a) {
            case 0:
                e eVar = (e) obj;
                B b2 = (B) this.f647b;
                if (eVar == null) {
                    b2.b(1);
                    return;
                }
                int i = eVar.f654b;
                if (i == 0) {
                    b2.c(eVar.f653a);
                    return;
                } else {
                    b2.b(i);
                    return;
                }
            default:
                e eVar2 = (e) obj;
                synchronized (f.f657c) {
                    try {
                        j jVar = f.f658d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f647b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f647b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((c) arrayList.get(i2)).a(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
