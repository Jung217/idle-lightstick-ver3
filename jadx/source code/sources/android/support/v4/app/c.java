package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f80a) {
            case 0:
                return new d(parcel);
            case 1:
                l lVar = new l();
                lVar.f115e = -1;
                lVar.f112b = (m[]) parcel.createTypedArray(m.CREATOR);
                lVar.f113c = parcel.createIntArray();
                lVar.f114d = (d[]) parcel.createTypedArray(d.CREATOR);
                lVar.f115e = parcel.readInt();
                lVar.f116f = parcel.readInt();
                return lVar;
            case 2:
                return new m(parcel);
            case 3:
                s.j jVar = new s.j(parcel);
                jVar.f771b = parcel.readInt();
                return jVar;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f80a) {
            case 0:
                return new d[i];
            case 1:
                return new l[i];
            case 2:
                return new m[i];
            case 3:
                return new s.j[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
