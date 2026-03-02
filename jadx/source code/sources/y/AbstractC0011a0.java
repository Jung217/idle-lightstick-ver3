package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: y.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0011a0 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1265h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f1267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f1268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1272p;

    public AbstractC0011a0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1259b = true;
        this.f1260c = -1;
        this.f1261d = 0;
        this.f1263f = 8388659;
        e.c cVarG = e.c.g(context, attributeSet, u.a.f906m, i);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f1265h = typedArray.getFloat(4, -1.0f);
        this.f1260c = typedArray.getInt(3, -1);
        this.i = typedArray.getBoolean(7, false);
        setDividerDrawable(cVarG.b(5));
        this.f1271o = typedArray.getInt(8, 0);
        this.f1272p = typedArray.getDimensionPixelSize(6, 0);
        cVarG.h();
    }

    public final void c(Canvas canvas, int i) {
        this.f1268l.setBounds(getPaddingLeft() + this.f1272p, i, (getWidth() - getPaddingRight()) - this.f1272p, this.f1270n + i);
        this.f1268l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Z;
    }

    public final void d(Canvas canvas, int i) {
        this.f1268l.setBounds(i, getPaddingTop() + this.f1272p, this.f1269m + i, (getHeight() - getPaddingBottom()) - this.f1272p);
        this.f1268l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Z generateDefaultLayoutParams() {
        int i = this.f1262e;
        if (i == 0) {
            return new Z(-2);
        }
        if (i == 1) {
            return new Z(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Z generateLayoutParams(AttributeSet attributeSet) {
        return new Z(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Z generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Z(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1260c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1260c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1260c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1261d;
        if (this.f1262e == 1 && (i = this.f1263f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1264g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1264g;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((Z) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1260c;
    }

    public Drawable getDividerDrawable() {
        return this.f1268l;
    }

    public int getDividerPadding() {
        return this.f1272p;
    }

    public int getDividerWidth() {
        return this.f1269m;
    }

    public int getGravity() {
        return this.f1263f;
    }

    public int getOrientation() {
        return this.f1262e;
    }

    public int getShowDividers() {
        return this.f1271o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1265h;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.f1271o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1271o & 4) != 0;
        }
        if ((this.f1271o & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f1268l == null) {
            return;
        }
        int i2 = 0;
        if (this.f1262e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((Z) childAt.getLayoutParams())).topMargin) - this.f1270n);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1270n : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((Z) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = M0.a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                Z z2 = (Z) childAt3.getLayoutParams();
                d(canvas, zA ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) z2).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) z2).leftMargin) - this.f1269m);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                Z z3 = (Z) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) z3).leftMargin;
                    i = this.f1269m;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) z3).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f1269m;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC0011a0.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC0011a0.class.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC0011a0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.AbstractC0011a0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f1259b = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1260c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1268l) {
            return;
        }
        this.f1268l = drawable;
        if (drawable != null) {
            this.f1269m = drawable.getIntrinsicWidth();
            this.f1270n = drawable.getIntrinsicHeight();
        } else {
            this.f1269m = 0;
            this.f1270n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1272p = i;
    }

    public void setGravity(int i) {
        if (this.f1263f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1263f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1263f;
        if ((8388615 & i3) != i2) {
            this.f1263f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.i = z2;
    }

    public void setOrientation(int i) {
        if (this.f1262e != i) {
            this.f1262e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1271o) {
            requestLayout();
        }
        this.f1271o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1263f;
        if ((i3 & 112) != i2) {
            this.f1263f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1265h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
