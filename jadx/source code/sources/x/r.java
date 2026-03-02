package x;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r implements m.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public v f1090A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f1097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f1098h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f1099j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f1101l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f1103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public H f1104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f1105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1106q;
    public CharSequence r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f1114z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1100k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1102m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f1107s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f1108t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1109u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1110v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1111w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1112x = 16;
    public boolean C = false;

    public r(p pVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1103n = pVar;
        this.f1091a = i2;
        this.f1092b = i;
        this.f1093c = i3;
        this.f1094d = i4;
        this.f1095e = charSequence;
        this.f1113y = i5;
    }

    public static void c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // m.a
    public final m.a a(v vVar) {
        this.f1114z = null;
        this.f1090A = vVar;
        this.f1103n.p(true);
        v vVar2 = this.f1090A;
        if (vVar2 != null) {
            vVar2.f1119b = new android.arch.lifecycle.i(this);
            vVar2.f1118a.setVisibilityListener(vVar2);
        }
        return this;
    }

    @Override // m.a
    public final v b() {
        return this.f1090A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f1113y & 8) == 0) {
            return false;
        }
        if (this.f1114z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1103n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f1111w && (this.f1109u || this.f1110v)) {
            drawable = drawable.mutate();
            if (this.f1109u) {
                drawable.setTintList(this.f1107s);
            }
            if (this.f1110v) {
                drawable.setTintMode(this.f1108t);
            }
            this.f1111w = false;
        }
        return drawable;
    }

    public final boolean e() {
        v vVar;
        if ((this.f1113y & 8) == 0) {
            return false;
        }
        if (this.f1114z == null && (vVar = this.f1090A) != null) {
            this.f1114z = vVar.a(this);
        }
        return this.f1114z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1103n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f1112x |= 32;
        } else {
            this.f1112x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f1114z;
        if (view != null) {
            return view;
        }
        v vVar = this.f1090A;
        if (vVar == null) {
            return null;
        }
        View viewA = vVar.a(this);
        this.f1114z = viewA;
        return viewA;
    }

    @Override // m.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1100k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1099j;
    }

    @Override // m.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1106q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1092b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f1101l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f1102m;
        if (i == 0) {
            return null;
        }
        Drawable drawableA = v.a.a(this.f1103n.f1065a, i);
        this.f1102m = 0;
        this.f1101l = drawableA;
        return d(drawableA);
    }

    @Override // m.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1107s;
    }

    @Override // m.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1108t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1097g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f1091a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1098h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1093c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f1104o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1095e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1096f;
        return charSequence != null ? charSequence : this.f1095e;
    }

    @Override // m.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f1104o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f1112x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1112x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1112x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        v vVar = this.f1090A;
        return (vVar == null || !vVar.f1118a.overridesItemVisibility()) ? (this.f1112x & 8) == 0 : (this.f1112x & 8) == 0 && this.f1090A.f1118a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f1114z = view;
        this.f1090A = null;
        if (view != null && view.getId() == -1 && (i = this.f1091a) > 0) {
            view.setId(i);
        }
        p pVar = this.f1103n;
        pVar.f1074k = true;
        pVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1099j == c2) {
            return this;
        }
        this.f1099j = Character.toLowerCase(c2);
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f1112x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f1112x = i2;
        if (i != i2) {
            this.f1103n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f1112x;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z2 ? 2 : 0);
            this.f1112x = i2;
            if (i != i2) {
                this.f1103n.p(false);
            }
            return this;
        }
        p pVar = this.f1103n;
        ArrayList arrayList = pVar.f1070f;
        int size = arrayList.size();
        pVar.w();
        for (int i3 = 0; i3 < size; i3++) {
            r rVar = (r) arrayList.get(i3);
            if (rVar.f1092b == this.f1092b && (rVar.f1112x & 4) != 0 && rVar.isCheckable()) {
                boolean z3 = rVar == this;
                int i4 = rVar.f1112x;
                int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                rVar.f1112x = i5;
                if (i4 != i5) {
                    rVar.f1103n.p(false);
                }
            }
        }
        pVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f1112x |= 16;
        } else {
            this.f1112x &= -17;
        }
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1102m = 0;
        this.f1101l = drawable;
        this.f1111w = true;
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1107s = colorStateList;
        this.f1109u = true;
        this.f1111w = true;
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1108t = mode;
        this.f1110v = true;
        this.f1111w = true;
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1097g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f1098h == c2) {
            return this;
        }
        this.f1098h = c2;
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1105p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f1098h = c2;
        this.f1099j = Character.toLowerCase(c3);
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1113y = i;
        p pVar = this.f1103n;
        pVar.f1074k = true;
        pVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1095e = charSequence;
        this.f1103n.p(false);
        H h2 = this.f1104o;
        if (h2 != null) {
            h2.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1096f = charSequence;
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f1112x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f1112x = i2;
        if (i != i2) {
            p pVar = this.f1103n;
            pVar.f1072h = true;
            pVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f1095e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // m.a, android.view.MenuItem
    public final m.a setContentDescription(CharSequence charSequence) {
        this.f1106q = charSequence;
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final m.a setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f1099j == c2 && this.f1100k == i) {
            return this;
        }
        this.f1099j = Character.toLowerCase(c2);
        this.f1100k = KeyEvent.normalizeMetaState(i);
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f1098h == c2 && this.i == i) {
            return this;
        }
        this.f1098h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f1103n.p(false);
        return this;
    }

    @Override // m.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1098h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f1099j = Character.toLowerCase(c3);
        this.f1100k = KeyEvent.normalizeMetaState(i2);
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1101l = null;
        this.f1102m = i;
        this.f1111w = true;
        this.f1103n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f1103n.f1065a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f1103n.f1065a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f1114z = viewInflate;
        this.f1090A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f1091a) > 0) {
            viewInflate.setId(i2);
        }
        p pVar = this.f1103n;
        pVar.f1074k = true;
        pVar.p(true);
        return this;
    }
}
