package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f402e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f406d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f402e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f432e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f402e.get(index)) {
                case 1:
                    this.f406d = typedArrayObtainStyledAttributes.getFloat(index, this.f406d);
                    break;
                case 2:
                    this.f404b = typedArrayObtainStyledAttributes.getInt(index, this.f404b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = d.a.f457a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f403a = p.e(typedArrayObtainStyledAttributes, index, this.f403a);
                    break;
                case 6:
                    this.f405c = typedArrayObtainStyledAttributes.getFloat(index, this.f405c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
