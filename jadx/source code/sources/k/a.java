package k;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f624a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, b(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), b(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), b(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    public static int b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }
}
