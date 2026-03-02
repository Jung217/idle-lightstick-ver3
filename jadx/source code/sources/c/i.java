package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f368e;

    public i(Context context, XmlResourceParser xmlResourceParser) {
        this.f364a = Float.NaN;
        this.f365b = Float.NaN;
        this.f366c = Float.NaN;
        this.f367d = Float.NaN;
        this.f368e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f368e);
                this.f368e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().a(context, resourceId);
                }
            } else if (index == 1) {
                this.f367d = typedArrayObtainStyledAttributes.getDimension(index, this.f367d);
            } else if (index == 2) {
                this.f365b = typedArrayObtainStyledAttributes.getDimension(index, this.f365b);
            } else if (index == 3) {
                this.f366c = typedArrayObtainStyledAttributes.getDimension(index, this.f366c);
            } else if (index == 4) {
                this.f364a = typedArrayObtainStyledAttributes.getDimension(index, this.f364a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
