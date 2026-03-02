package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f410d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f433f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f409c = typedArrayObtainStyledAttributes.getFloat(index, this.f409c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f407a);
                this.f407a = i2;
                this.f407a = p.f423d[i2];
            } else if (index == 4) {
                this.f408b = typedArrayObtainStyledAttributes.getInt(index, this.f408b);
            } else if (index == 3) {
                this.f410d = typedArrayObtainStyledAttributes.getFloat(index, this.f410d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
