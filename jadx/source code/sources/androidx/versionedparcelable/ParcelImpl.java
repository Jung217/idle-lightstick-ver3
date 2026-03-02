package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import z.a;
import z.b;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomVersionedParcelable f309b;

    public ParcelImpl(Parcel parcel) {
        parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        new SparseIntArray();
        String string = parcel.readString();
        CustomVersionedParcelable customVersionedParcelable = null;
        if (string != null) {
            try {
                customVersionedParcelable = (CustomVersionedParcelable) Class.forName(string, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class).invoke(null, new b(parcel, parcel.dataPosition(), iDataSize, "  "));
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        }
        this.f309b = customVersionedParcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        new SparseIntArray();
        CustomVersionedParcelable customVersionedParcelable = this.f309b;
        if (customVersionedParcelable == null) {
            parcel.writeString(null);
            return;
        }
        try {
            parcel.writeString(a.a(customVersionedParcelable.getClass()).getName());
            b bVar = new b(parcel, parcel.dataPosition(), iDataSize, "  ");
            try {
                a.a(customVersionedParcelable.getClass()).getDeclaredMethod("write", customVersionedParcelable.getClass(), a.class).invoke(null, customVersionedParcelable, bVar);
                int i2 = bVar.f1442d;
                if (i2 >= 0) {
                    int i3 = bVar.f1439a.get(i2);
                    Parcel parcel2 = bVar.f1440b;
                    int iDataPosition = parcel2.dataPosition();
                    parcel2.setDataPosition(i3);
                    parcel2.writeInt(iDataPosition - i3);
                    parcel2.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(customVersionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
