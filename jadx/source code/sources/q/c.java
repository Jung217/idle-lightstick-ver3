package q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f712c = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f713b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f713b, i);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f713b = parcelable == f712c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f713b = parcelable == null ? f712c : parcelable;
    }
}
