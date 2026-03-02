package y;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static I0 f1176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static I0 f1177k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H0 f1181d = new H0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H0 f1182e = new H0(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J0 f1185h;
    public boolean i;

    public I0(View view, CharSequence charSequence) {
        this.f1178a = view;
        this.f1179b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i = q.m.f729a;
        this.f1180c = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        this.f1183f = Integer.MAX_VALUE;
        this.f1184g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(I0 i0) {
        I0 i02 = f1176j;
        if (i02 != null) {
            i02.f1178a.removeCallbacks(i02.f1181d);
        }
        f1176j = i0;
        if (i0 != null) {
            i0.f1178a.postDelayed(i0.f1181d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        I0 i0 = f1177k;
        View view = this.f1178a;
        if (i0 == this) {
            f1177k = null;
            J0 j0 = this.f1185h;
            if (j0 != null) {
                View view2 = j0.f1188a;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) j0.f1189b).getSystemService("window")).removeView(view2);
                }
                this.f1185h = null;
                this.f1183f = Integer.MAX_VALUE;
                this.f1184g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1176j == this) {
            b(null);
        }
        view.removeCallbacks(this.f1182e);
    }

    public final void c(boolean z2) {
        int height;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        long longPressTimeout;
        long j2;
        long j3;
        WeakHashMap weakHashMap = q.l.f728a;
        View view = this.f1178a;
        if (view.isAttachedToWindow()) {
            b(null);
            I0 i0 = f1177k;
            if (i0 != null) {
                i0.a();
            }
            f1177k = this;
            this.i = z2;
            J0 j0 = new J0(view.getContext());
            View view2 = j0.f1188a;
            Context context = (Context) j0.f1189b;
            this.f1185h = j0;
            int width = this.f1183f;
            int i5 = this.f1184g;
            boolean z4 = this.i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) j0.f1191d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) j0.f1190c).setText(this.f1179b);
            int[] iArr = (int[]) j0.f1194g;
            int[] iArr2 = (int[]) j0.f1193f;
            Rect rect = (Rect) j0.f1192e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z4 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i6 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z3 = z4;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    i2 = i;
                    z3 = z4;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i7;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i7 + i6) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[i4];
                int i9 = ((i8 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i9 >= 0) {
                        layoutParams.y = i9;
                    } else {
                        layoutParams.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i9;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            H0 h0 = this.f1182e;
            view.removeCallbacks(h0);
            view.postDelayed(h0, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1185h == null || !this.i) {
            View view2 = this.f1178a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f1183f = Integer.MAX_VALUE;
                        this.f1184g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f1185h == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    int iAbs = Math.abs(x2 - this.f1183f);
                    int i = this.f1180c;
                    if (iAbs > i || Math.abs(y2 - this.f1184g) > i) {
                        this.f1183f = x2;
                        this.f1184g = y2;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1183f = view.getWidth() / 2;
        this.f1184g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
