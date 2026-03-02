package z;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcel f1440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1441c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1443e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f1439a = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1442d = -1;

    public b(Parcel parcel, int i, int i2, String str) {
        this.f1440b = parcel;
        this.f1441c = i2;
        this.f1443e = i;
    }

    @Override // z.a
    public final boolean b(int i) {
        Parcel parcel;
        int iDataPosition;
        while (true) {
            int i2 = this.f1443e;
            int i3 = this.f1441c;
            parcel = this.f1440b;
            if (i2 >= i3) {
                iDataPosition = -1;
                break;
            }
            parcel.setDataPosition(i2);
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            this.f1443e += i4;
            if (i5 == i) {
                iDataPosition = parcel.dataPosition();
                break;
            }
        }
        if (iDataPosition == -1) {
            return false;
        }
        parcel.setDataPosition(iDataPosition);
        return true;
    }

    @Override // z.a
    public final void c(int i) {
        int i2 = this.f1442d;
        SparseIntArray sparseIntArray = this.f1439a;
        Parcel parcel = this.f1440b;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f1442d = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }
}
