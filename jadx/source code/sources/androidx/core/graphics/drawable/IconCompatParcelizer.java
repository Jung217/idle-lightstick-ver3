package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import java.nio.charset.Charset;
import z.a;
import z.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f130a;
        if (aVar.b(1)) {
            i = ((b) aVar).f1440b.readInt();
        }
        iconCompat.f130a = i;
        byte[] bArr = iconCompat.f132c;
        if (aVar.b(2)) {
            Parcel parcel = ((b) aVar).f1440b;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f132c = bArr;
        Parcelable parcelable = iconCompat.f133d;
        if (aVar.b(3)) {
            parcelable = ((b) aVar).f1440b.readParcelable(b.class.getClassLoader());
        }
        iconCompat.f133d = parcelable;
        int i3 = iconCompat.f134e;
        if (aVar.b(4)) {
            i3 = ((b) aVar).f1440b.readInt();
        }
        iconCompat.f134e = i3;
        int i4 = iconCompat.f135f;
        if (aVar.b(5)) {
            i4 = ((b) aVar).f1440b.readInt();
        }
        iconCompat.f135f = i4;
        Parcelable parcelable2 = iconCompat.f136g;
        if (aVar.b(6)) {
            parcelable2 = ((b) aVar).f1440b.readParcelable(b.class.getClassLoader());
        }
        iconCompat.f136g = (ColorStateList) parcelable2;
        String string = iconCompat.i;
        if (aVar.b(7)) {
            string = ((b) aVar).f1440b.readString();
        }
        iconCompat.i = string;
        iconCompat.f137h = PorterDuff.Mode.valueOf(string);
        int i5 = iconCompat.f130a;
        if (i5 == -1) {
            Parcelable parcelable3 = iconCompat.f133d;
            if (parcelable3 == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
            iconCompat.f131b = parcelable3;
            return iconCompat;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    iconCompat.f131b = iconCompat.f132c;
                    return iconCompat;
                }
                if (i5 != 4) {
                    if (i5 != 5) {
                        return iconCompat;
                    }
                }
            }
            iconCompat.f131b = new String(iconCompat.f132c, Charset.forName("UTF-16"));
            return iconCompat;
        }
        Parcelable parcelable4 = iconCompat.f133d;
        if (parcelable4 != null) {
            iconCompat.f131b = parcelable4;
            return iconCompat;
        }
        byte[] bArr3 = iconCompat.f132c;
        iconCompat.f131b = bArr3;
        iconCompat.f130a = 3;
        iconCompat.f134e = 0;
        iconCompat.f135f = bArr3.length;
        return iconCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void write(android.support.v4.graphics.drawable.IconCompat r8, z.a r9) {
        /*
            r9.getClass()
            android.graphics.PorterDuff$Mode r0 = r8.f137h
            java.lang.String r0 = r0.name()
            r8.i = r0
            int r0 = r8.f130a
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r6) goto L50
            if (r0 == r5) goto L49
            java.lang.String r7 = "UTF-16"
            if (r0 == r4) goto L3a
            if (r0 == r3) goto L33
            if (r0 == r2) goto L22
            if (r0 == r1) goto L49
            goto L56
        L22:
            java.lang.Object r0 = r8.f131b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.f132c = r0
            goto L56
        L33:
            java.lang.Object r0 = r8.f131b
            byte[] r0 = (byte[]) r0
            r8.f132c = r0
            goto L56
        L3a:
            java.lang.Object r0 = r8.f131b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.f132c = r0
            goto L56
        L49:
            java.lang.Object r0 = r8.f131b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.f133d = r0
            goto L56
        L50:
            java.lang.Object r0 = r8.f131b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.f133d = r0
        L56:
            int r0 = r8.f130a
            r9.c(r5)
            r5 = r9
            z.b r5 = (z.b) r5
            android.os.Parcel r5 = r5.f1440b
            r5.writeInt(r0)
            byte[] r0 = r8.f132c
            r9.c(r4)
            if (r0 == 0) goto L72
            int r4 = r0.length
            r5.writeInt(r4)
            r5.writeByteArray(r0)
            goto L75
        L72:
            r5.writeInt(r6)
        L75:
            android.os.Parcelable r0 = r8.f133d
            r9.c(r3)
            r3 = 0
            r5.writeParcelable(r0, r3)
            int r0 = r8.f134e
            r9.c(r2)
            r5.writeInt(r0)
            int r0 = r8.f135f
            r9.c(r1)
            r5.writeInt(r0)
            android.content.res.ColorStateList r0 = r8.f136g
            r1 = 6
            r9.c(r1)
            r5.writeParcelable(r0, r3)
            java.lang.String r8 = r8.i
            r0 = 7
            r9.c(r0)
            r5.writeString(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(android.support.v4.graphics.drawable.IconCompat, z.a):void");
    }
}
