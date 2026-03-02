package y;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class V extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f1238h;
    public U i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s.g f1242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A.g f1243n;

    public V(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1232b = new Rect();
        this.f1233c = 0;
        this.f1234d = 0;
        this.f1235e = 0;
        this.f1236f = 0;
        this.f1240k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1238h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.V.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1232b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1243n != null) {
            return;
        }
        super.drawableStateChanged();
        U u2 = this.i;
        if (u2 != null) {
            u2.f1231c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1241l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1240k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1240k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1240k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1240k && this.f1239j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1243n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1243n == null) {
            A.g gVar = new A.g(4, this);
            this.f1243n = gVar;
            post(gVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.f1241l && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1237g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.g gVar = this.f1243n;
        if (gVar != null) {
            V v2 = (V) gVar.f8c;
            v2.f1243n = null;
            v2.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f1239j = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        U u2 = null;
        if (drawable != null) {
            U u3 = new U();
            Drawable drawable2 = u3.f1230b;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            u3.f1230b = drawable;
            drawable.setCallback(u3);
            u3.f1231c = true;
            u2 = u3;
        }
        this.i = u2;
        super.setSelector(u2);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1233c = rect.left;
        this.f1234d = rect.top;
        this.f1235e = rect.right;
        this.f1236f = rect.bottom;
    }
}
