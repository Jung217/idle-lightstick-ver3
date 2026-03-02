package x;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class E extends AbstractC0005d implements Menu {
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(((p) this.f1015a).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((p) this.f1015a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((p) this.f1015a).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        p.a aVar = this.f1014c;
        if (aVar != null) {
            aVar.clear();
        }
        ((p) this.f1015a).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((p) this.f1015a).close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return c(((p) this.f1015a).findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return c(((p) this.f1015a).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((p) this.f1015a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((p) this.f1015a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((p) this.f1015a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((p) this.f1015a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        p.a aVar = this.f1014c;
        if (aVar != null) {
            Iterator it = ((p.g) aVar.keySet()).iterator();
            while (true) {
                p.f fVar = (p.f) it;
                if (!fVar.hasNext()) {
                    break;
                } else if (i == ((MenuItem) fVar.next()).getGroupId()) {
                    fVar.remove();
                }
            }
        }
        ((p) this.f1015a).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        p.a aVar = this.f1014c;
        if (aVar != null) {
            Iterator it = ((p.g) aVar.keySet()).iterator();
            while (true) {
                p.f fVar = (p.f) it;
                if (!fVar.hasNext()) {
                    break;
                } else if (i == ((MenuItem) fVar.next()).getItemId()) {
                    fVar.remove();
                    break;
                }
            }
        }
        ((p) this.f1015a).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ((p) this.f1015a).setGroupCheckable(i, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ((p) this.f1015a).setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ((p) this.f1015a).setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        ((p) this.f1015a).setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((p) this.f1015a).size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return ((p) this.f1015a).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(((p) this.f1015a).add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return ((p) this.f1015a).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(((p) this.f1015a).a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((p) this.f1015a).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(((p) this.f1015a).add(i, i2, i3, i4));
    }
}
