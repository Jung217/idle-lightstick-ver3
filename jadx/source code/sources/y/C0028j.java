package y;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.studiothinkers.lightstick.idlev3.R;
import x.C0003b;

/* JADX INFO: renamed from: y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0028j extends C0046y implements InterfaceC0032l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0030k f1315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028j(C0030k c0030k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f1315d = c0030k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        android.arch.lifecycle.f.u(this, getContentDescription());
        setOnTouchListener(new C0003b(this, this));
    }

    @Override // y.InterfaceC0032l
    public final boolean a() {
        return false;
    }

    @Override // y.InterfaceC0032l
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1315d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
