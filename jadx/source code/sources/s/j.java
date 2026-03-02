package s;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j extends View.BaseSavedState {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.app.c(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f771b;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f771b + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f771b);
    }
}
