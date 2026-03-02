package o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PrecomputedText.Params f673e;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f673e = l.a.f(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            this.f673e = null;
        }
        this.f669a = textPaint;
        this.f670b = textDirectionHeuristic;
        this.f671c = i;
        this.f672d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        TextPaint textPaint = aVar.f669a;
        PrecomputedText.Params params = this.f673e;
        if (params != null) {
            return params.equals(aVar.f673e);
        }
        if (this.f671c != aVar.f671c || this.f672d != aVar.f672d || this.f670b != aVar.f670b) {
            return false;
        }
        TextPaint textPaint2 = this.f669a;
        if (textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return textPaint2.getTypeface() == null ? textPaint.getTypeface() == null : textPaint2.getTypeface().equals(textPaint.getTypeface());
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f669a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f670b, Integer.valueOf(this.f671c), Integer.valueOf(this.f672d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f669a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f670b);
        sb.append(", breakStrategy=" + this.f671c);
        sb.append(", hyphenationFrequency=" + this.f672d);
        sb.append("}");
        return sb.toString();
    }

    public a(PrecomputedText.Params params) {
        this.f669a = params.getTextPaint();
        this.f670b = params.getTextDirection();
        this.f671c = params.getBreakStrategy();
        this.f672d = params.getHyphenationFrequency();
        this.f673e = params;
    }
}
