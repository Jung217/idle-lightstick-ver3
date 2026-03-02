package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f81b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f87h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f88j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f89k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f90l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f91m;

    public d(Parcel parcel) {
        this.f81b = parcel.createIntArray();
        this.f82c = parcel.readInt();
        this.f83d = parcel.readInt();
        this.f84e = parcel.readString();
        this.f85f = parcel.readInt();
        this.f86g = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f87h = (CharSequence) creator.createFromParcel(parcel);
        this.i = parcel.readInt();
        this.f88j = (CharSequence) creator.createFromParcel(parcel);
        this.f89k = parcel.createStringArrayList();
        this.f90l = parcel.createStringArrayList();
        this.f91m = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f81b);
        parcel.writeInt(this.f82c);
        parcel.writeInt(this.f83d);
        parcel.writeString(this.f84e);
        parcel.writeInt(this.f85f);
        parcel.writeInt(this.f86g);
        TextUtils.writeToParcel(this.f87h, parcel, 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.f88j, parcel, 0);
        parcel.writeStringList(this.f89k);
        parcel.writeStringList(this.f90l);
        parcel.writeInt(this.f91m ? 1 : 0);
    }
}
