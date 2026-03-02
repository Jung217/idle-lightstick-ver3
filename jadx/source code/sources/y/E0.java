package y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends q.c {
    public static final Parcelable.Creator<E0> CREATOR = new q.b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1146e;

    public E0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1145d = parcel.readInt();
        this.f1146e = parcel.readInt() != 0;
    }

    @Override // q.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1145d);
        parcel.writeInt(this.f1146e ? 1 : 0);
    }
}
