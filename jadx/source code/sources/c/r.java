package c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r extends View {
    public r(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        f fVar = (f) getLayoutParams();
        fVar.f329a = i;
        setLayoutParams(fVar);
    }

    public void setGuidelineEnd(int i) {
        f fVar = (f) getLayoutParams();
        fVar.f330b = i;
        setLayoutParams(fVar);
    }

    public void setGuidelinePercent(float f2) {
        f fVar = (f) getLayoutParams();
        fVar.f331c = f2;
        setLayoutParams(fVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
