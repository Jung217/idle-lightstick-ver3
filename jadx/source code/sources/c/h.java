package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f362b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f363c;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f363c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.f434g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f361a = typedArrayObtainStyledAttributes.getResourceId(index, this.f361a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f363c);
                this.f363c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().a(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
