package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new c(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f123h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f126l;

    public m(Parcel parcel) {
        this.f117b = parcel.readString();
        this.f118c = parcel.readInt();
        this.f119d = parcel.readInt() != 0;
        this.f120e = parcel.readInt();
        this.f121f = parcel.readInt();
        this.f122g = parcel.readString();
        this.f123h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f124j = parcel.readBundle();
        this.f125k = parcel.readInt() != 0;
        this.f126l = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117b);
        parcel.writeInt(this.f118c);
        parcel.writeInt(this.f119d ? 1 : 0);
        parcel.writeInt(this.f120e);
        parcel.writeInt(this.f121f);
        parcel.writeString(this.f122g);
        parcel.writeInt(this.f123h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f124j);
        parcel.writeInt(this.f125k ? 1 : 0);
        parcel.writeBundle(this.f126l);
    }
}
