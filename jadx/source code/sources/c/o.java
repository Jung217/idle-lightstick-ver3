package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f411m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f419h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f422l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f411m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f435h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f411m.get(index)) {
                case 1:
                    this.f412a = typedArrayObtainStyledAttributes.getFloat(index, this.f412a);
                    break;
                case 2:
                    this.f413b = typedArrayObtainStyledAttributes.getFloat(index, this.f413b);
                    break;
                case 3:
                    this.f414c = typedArrayObtainStyledAttributes.getFloat(index, this.f414c);
                    break;
                case 4:
                    this.f415d = typedArrayObtainStyledAttributes.getFloat(index, this.f415d);
                    break;
                case 5:
                    this.f416e = typedArrayObtainStyledAttributes.getFloat(index, this.f416e);
                    break;
                case 6:
                    this.f417f = typedArrayObtainStyledAttributes.getDimension(index, this.f417f);
                    break;
                case 7:
                    this.f418g = typedArrayObtainStyledAttributes.getDimension(index, this.f418g);
                    break;
                case 8:
                    this.f419h = typedArrayObtainStyledAttributes.getDimension(index, this.f419h);
                    break;
                case 9:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 10:
                    this.f420j = typedArrayObtainStyledAttributes.getDimension(index, this.f420j);
                    break;
                case 11:
                    this.f421k = true;
                    this.f422l = typedArrayObtainStyledAttributes.getDimension(index, this.f422l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
