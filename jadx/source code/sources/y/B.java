package y;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1133d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1136c;

    public /* synthetic */ B(View view, int i) {
        this.f1134a = i;
        this.f1135b = view;
    }

    public void a() {
        z0 z0Var;
        ImageView imageView = (ImageView) this.f1135b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i = T.f1229a;
        }
        if (drawable == null || (z0Var = (z0) this.f1136c) == null) {
            return;
        }
        C0043v.l(drawable, z0Var, imageView.getDrawableState());
    }

    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new A.g(this, i));
    }

    public void c(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new A.j(this, typeface, 2));
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int i2 = this.f1134a;
        Object obj = this.f1135b;
        switch (i2) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) obj;
                e.c cVarG = e.c.g(absSeekBar.getContext(), attributeSet, f1133d, i);
                Drawable drawableC = cVarG.c(0);
                if (drawableC != null) {
                    if (drawableC instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableC;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i3), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableC = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableC);
                }
                Drawable drawableC2 = cVarG.c(1);
                if (drawableC2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableC2, false));
                }
                cVarG.h();
                return;
            default:
                ImageView imageView = (ImageView) obj;
                e.c cVarG2 = e.c.g(imageView.getContext(), attributeSet, u.a.f900f, i);
                TypedArray typedArray = (TypedArray) cVarG2.f474b;
                try {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = v.a.a(imageView.getContext(), resourceId)) != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (drawable != null) {
                        int i4 = T.f1229a;
                    }
                    if (typedArray.hasValue(2)) {
                        imageView.setImageTintList(cVarG2.a(2));
                    }
                    if (typedArray.hasValue(3)) {
                        imageView.setImageTintMode(T.b(typedArray.getInt(3, -1), null));
                        break;
                    }
                    cVarG2.h();
                    return;
                } catch (Throwable th) {
                    cVarG2.h();
                    throw th;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof l.b) {
            ((l.c) ((l.b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f1136c) == null) {
                    this.f1136c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public B(M m2, WeakReference weakReference) {
        this.f1134a = 2;
        this.f1136c = m2;
        this.f1135b = weakReference;
    }
}
