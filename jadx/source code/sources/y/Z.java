package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Z extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1255b;

    public Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1255b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f907n);
        this.f1254a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f1255b = typedArrayObtainStyledAttributes.getInt(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Z(int i) {
        super(i, -2);
        this.f1255b = -1;
        this.f1254a = 0.0f;
    }

    public Z(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1255b = -1;
    }
}
