package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new c(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m[] f112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f112b, i);
        parcel.writeIntArray(this.f113c);
        parcel.writeTypedArray(this.f114d, i);
        parcel.writeInt(this.f115e);
        parcel.writeInt(this.f116f);
    }
}
