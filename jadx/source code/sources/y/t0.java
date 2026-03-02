package y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends q.c {
    public static final Parcelable.Creator<t0> CREATOR = new q.b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1378d;

    public t0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1378d = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1378d + "}";
    }

    @Override // q.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f1378d));
    }
}
