package y;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.studiothinkers.lightstick.idlev3.R;
import x.ViewTreeObserverOnGlobalLayoutListenerC0007f;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0021f0 {
    public CharSequence D;
    public H E;
    public final Rect F;
    public final /* synthetic */ L G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l2, w.c cVar, AttributeSet attributeSet) {
        super(cVar, attributeSet, R.attr.spinnerStyle);
        this.G = l2;
        this.F = new Rect();
        this.f1297p = l2;
        this.f1305y = true;
        this.f1306z.setFocusable(true);
        this.f1298q = new I(0, this);
    }

    @Override // y.AbstractC0021f0, x.F
    public final void c() {
        ViewTreeObserver viewTreeObserver;
        A a2 = this.f1306z;
        boolean zIsShowing = a2.isShowing();
        h();
        this.f1306z.setInputMethodMode(2);
        super.c();
        this.f1286d.setChoiceMode(1);
        L l2 = this.G;
        int selectedItemPosition = l2.getSelectedItemPosition();
        V v2 = this.f1286d;
        if (a2.isShowing() && v2 != null) {
            v2.setListSelectionHidden(false);
            v2.setSelection(selectedItemPosition);
            if (v2.getChoiceMode() != 0) {
                v2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = l2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0007f viewTreeObserverOnGlobalLayoutListenerC0007f = new ViewTreeObserverOnGlobalLayoutListenerC0007f(this, 2);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0007f);
        this.f1306z.setOnDismissListener(new J(this, viewTreeObserverOnGlobalLayoutListenerC0007f));
    }

    @Override // y.AbstractC0021f0
    public final void d(ListAdapter listAdapter) {
        super.d(listAdapter);
        this.E = (H) listAdapter;
    }

    public final void h() {
        int i;
        L l2 = this.G;
        Rect rect = l2.i;
        A a2 = this.f1306z;
        Drawable background = a2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = M0.a(l2) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = l2.getPaddingLeft();
        int paddingRight = l2.getPaddingRight();
        int width = l2.getWidth();
        int i2 = l2.f1203h;
        if (i2 == -2) {
            int iA = l2.a(this.E, a2.getBackground());
            int i3 = (l2.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            f(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            f((width - paddingLeft) - paddingRight);
        } else {
            f(i2);
        }
        this.f1289g = M0.a(l2) ? ((width - paddingRight) - this.f1288f) + i : i + paddingLeft;
    }
}
