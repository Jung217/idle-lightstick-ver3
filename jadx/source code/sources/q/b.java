package q;

import android.os.Parcel;
import android.os.Parcelable;
import y.E0;
import y.t0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f711a;

    public /* synthetic */ b(int i) {
        this.f711a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f711a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f712c;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new t0(parcel, classLoader);
            default:
                return new E0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f711a) {
            case 0:
                return new c[i];
            case 1:
                return new t0[i];
            default:
                return new E0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f711a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f712c;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new t0(parcel, null);
            default:
                return new E0(parcel, null);
        }
    }
}
