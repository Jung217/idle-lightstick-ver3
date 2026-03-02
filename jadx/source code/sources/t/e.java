package t;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Dialog implements DialogInterface, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f803d;

    public e(ContextThemeWrapper contextThemeWrapper, int i) {
        int iC = c(contextThemeWrapper, i);
        if (iC == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            iC = typedValue.resourceId;
        }
        super(contextThemeWrapper, iC);
        this.f802c = new o(this);
        a().o(null);
        a().a();
        this.f803d = new d(getContext(), this, getWindow());
    }

    public static int c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final n a() {
        if (this.f801b == null) {
            this.f801b = new n(getContext(), getWindow(), this);
        }
        return this.f801b;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n nVarA = a();
        nVarA.j();
        ((ViewGroup) nVarA.r.findViewById(android.R.id.content)).addView(view, layoutParams);
        nVarA.f841d.onContentChanged();
    }

    public final void b(Bundle bundle) {
        a().m();
        super.onCreate(bundle);
        a().o(bundle);
    }

    public final void d(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().u(charSequence);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return android.arch.lifecycle.f.k(this.f802c, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        n nVarA = a();
        nVarA.j();
        return nVarA.f840c.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        n nVarA = a();
        nVarA.l();
        nVarA.n(0);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        b(bundle);
        d dVar = this.f803d;
        dVar.f783b.setContentView(dVar.f796p);
        Context context = dVar.f782a;
        Window window = dVar.f784c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = d.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = d.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = d.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        dVar.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        dVar.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        dVar.f793m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            dVar.i.removeView(dVar.f793m);
            if (dVar.f786e != null) {
                ViewGroup viewGroup2 = (ViewGroup) dVar.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(dVar.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(dVar.f786e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        dVar.f787f = button;
        a aVar = dVar.f800u;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            dVar.f787f.setVisibility(8);
            i = 0;
        } else {
            dVar.f787f.setText((CharSequence) null);
            dVar.f787f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        dVar.f788g = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            dVar.f788g.setVisibility(8);
        } else {
            dVar.f788g.setText((CharSequence) null);
            dVar.f788g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        dVar.f789h = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            dVar.f789h.setVisibility(8);
        } else {
            dVar.f789h.setText((CharSequence) null);
            dVar.f789h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = dVar.f787f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = dVar.f788g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = dVar.f789h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (dVar.f794n != null) {
            viewGroupA.addView(dVar.f794n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            dVar.f791k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(dVar.f785d) || !dVar.f798s) {
                window.findViewById(R.id.title_template).setVisibility(8);
                dVar.f791k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                dVar.f792l = textView2;
                textView2.setText(dVar.f785d);
                Drawable drawable = dVar.f790j;
                if (drawable != null) {
                    dVar.f791k.setImageDrawable(drawable);
                } else {
                    dVar.f792l.setPadding(dVar.f791k.getPaddingLeft(), dVar.f791k.getPaddingTop(), dVar.f791k.getPaddingRight(), dVar.f791k.getPaddingBottom());
                    dVar.f791k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupA3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = dVar.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = dVar.f786e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = dVar.f786e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f162b, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f163c);
        }
        if (!z2) {
            View view = dVar.f786e;
            if (view == null) {
                view = dVar.i;
            }
            if (view != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = q.l.f728a;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = dVar.f786e;
        if (alertController$RecycleListView2 == null || (listAdapter = dVar.f795o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f803d.i;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f803d.i;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onStop() {
        A.k kVar;
        super.onStop();
        n nVarA = a();
        nVarA.l();
        u uVar = nVarA.f843f;
        if (uVar != null) {
            uVar.F = false;
            w.j jVar = uVar.E;
            if (jVar != null) {
                jVar.a();
            }
        }
        q.g gVar = nVarA.I;
        if (gVar == null || (kVar = (A.k) gVar.f719c) == null) {
            return;
        }
        ((n) gVar.f721e).f839b.unregisterReceiver(kVar);
        gVar.f719c = null;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        a().t(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        a().u(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        n nVarA = a();
        nVarA.j();
        ViewGroup viewGroup = (ViewGroup) nVarA.r.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        nVarA.f841d.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        d(charSequence);
        d dVar = this.f803d;
        dVar.f785d = charSequence;
        TextView textView = dVar.f792l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n nVarA = a();
        nVarA.j();
        ViewGroup viewGroup = (ViewGroup) nVarA.r.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        nVarA.f841d.onContentChanged();
    }
}
