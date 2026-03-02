package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.studiothinkers.lightstick.idlev3.R;
import e.c;
import java.util.WeakHashMap;
import q.l;
import u.a;
import x.C;
import x.p;
import x.r;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements C, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f187h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f195q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVarG = c.g(getContext(), attributeSet, a.r, R.attr.listMenuViewStyle);
        this.f189k = cVarG.b(5);
        TypedArray typedArray = (TypedArray) cVarG.f474b;
        this.f190l = typedArray.getResourceId(1, -1);
        this.f192n = typedArray.getBoolean(7, false);
        this.f191m = context;
        this.f193o = cVarG.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f194p = typedArrayObtainStyledAttributes.hasValue(0);
        cVarG.h();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f195q == null) {
            this.f195q = LayoutInflater.from(getContext());
        }
        return this.f195q;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f187h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // x.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x.r r11) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ListMenuItemView.c(x.r):void");
    }

    @Override // x.C
    public r getItemData() {
        return this.f181b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = l.f728a;
        setBackground(this.f189k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f184e = textView;
        int i = this.f190l;
        if (i != -1) {
            textView.setTextAppearance(this.f191m, i);
        }
        this.f186g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f187h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f193o);
        }
        this.i = (ImageView) findViewById(R.id.group_divider);
        this.f188j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f182c != null && this.f192n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f182c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f183d == null && this.f185f == null) {
            return;
        }
        if ((this.f181b.f1112x & 4) != 0) {
            if (this.f183d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f183d = radioButton;
                LinearLayout linearLayout = this.f188j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f183d;
            view = this.f185f;
        } else {
            if (this.f185f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f185f = checkBox;
                LinearLayout linearLayout2 = this.f188j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f185f;
            view = this.f183d;
        }
        if (z2) {
            compoundButton.setChecked(this.f181b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f185f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f183d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f181b.f1112x & 4) != 0) {
            if (this.f183d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f183d = radioButton;
                LinearLayout linearLayout = this.f188j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f183d;
        } else {
            if (this.f185f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f185f = checkBox;
                LinearLayout linearLayout2 = this.f188j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f185f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.r = z2;
        this.f192n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.f194p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        p pVar = this.f181b.f1103n;
        boolean z2 = this.r;
        if (z2 || this.f192n) {
            ImageView imageView = this.f182c;
            if (imageView == null && drawable == null && !this.f192n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f182c = imageView2;
                LinearLayout linearLayout = this.f188j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f192n) {
                this.f182c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f182c;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f182c.getVisibility() != 0) {
                this.f182c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f184e.getVisibility() != 8) {
                this.f184e.setVisibility(8);
            }
        } else {
            this.f184e.setText(charSequence);
            if (this.f184e.getVisibility() != 0) {
                this.f184e.setVisibility(0);
            }
        }
    }
}
