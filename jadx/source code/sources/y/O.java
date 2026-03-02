package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RectF f1218k = new RectF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f1219l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1220a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1221b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1222c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1223d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1224e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1225f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1226g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f1227h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f1228j;

    public O(TextView textView) {
        this.i = textView;
        this.f1228j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f1219l;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f1221b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) e(this.i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1218k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f1221b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1225f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f1225f[i4];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f1227h;
            if (textPaint == null) {
                this.f1227h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1227h.set(textView.getPaint());
            this.f1227h.setTextSize(i5);
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), this.f1227h, Math.round(rectF.right)).setAlignment((Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f1225f[i3];
    }

    public final boolean f() {
        return j() && this.f1220a != 0;
    }

    public final void g(int i, float f2) {
        Context context = this.f1228j;
        float fApplyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f1221b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f1220a == 1) {
            if (!this.f1226g || this.f1225f.length == 0) {
                float fRound = Math.round(this.f1223d);
                int i = 1;
                while (Math.round(this.f1222c + fRound) <= Math.round(this.f1224e)) {
                    i++;
                    fRound += this.f1222c;
                }
                int[] iArr = new int[i];
                float f2 = this.f1223d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f2);
                    f2 += this.f1222c;
                }
                this.f1225f = b(iArr);
            }
            this.f1221b = true;
        } else {
            this.f1221b = false;
        }
        return this.f1221b;
    }

    public final boolean i() {
        boolean z2 = this.f1225f.length > 0;
        this.f1226g = z2;
        if (z2) {
            this.f1220a = 1;
            this.f1223d = r0[0];
            this.f1224e = r0[r1 - 1];
            this.f1222c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.i instanceof C0044w);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f1220a = 1;
        this.f1223d = f2;
        this.f1224e = f3;
        this.f1222c = f4;
        this.f1226g = false;
    }
}
