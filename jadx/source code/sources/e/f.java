package e;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a;

    public /* synthetic */ f(int i) {
        this.f494a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f494a) {
            case 0:
                return ((i) obj).f501b - ((i) obj2).f501b;
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    byte b3 = bArr2[i];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
        }
    }
}
