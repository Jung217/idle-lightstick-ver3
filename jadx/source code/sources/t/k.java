package t;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Window.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f821c;

    public k(n nVar, Window.Callback callback) {
        this.f821c = nVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f820b = callback;
    }

    public final boolean a(int i, Menu menu) {
        return this.f820b.onMenuOpened(i, menu);
    }

    public final void b(int i, Menu menu) {
        this.f820b.onPanelClosed(i, menu);
    }

    public final void c(List list, Menu menu, int i) {
        this.f820b.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f820b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f821c.g(keyEvent) || this.f820b.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f820b
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            t.n r2 = r6.f821c
            r2.l()
            t.u r3 = r2.f843f
            r4 = 0
            if (r3 == 0) goto L3d
            t.t r3 = r3.f888u
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            x.p r3 = r3.f876e
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            t.m r0 = r2.D
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.q(r0, r3, r7)
            if (r0 == 0) goto L52
            t.m r7 = r2.D
            if (r7 == 0) goto L3b
            r7.f833l = r1
            goto L3b
        L52:
            t.m r0 = r2.D
            if (r0 != 0) goto L6a
            t.m r0 = r2.k(r4)
            r2.r(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.q(r0, r3, r7)
            r0.f832k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f820b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f820b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f820b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f820b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f820b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f820b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof x.p)) {
            return this.f820b.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f820b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f820b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f820b.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        a(i, menu);
        if (i == 108) {
            n nVar = this.f821c;
            nVar.l();
            u uVar = nVar.f843f;
            if (uVar != null) {
                ArrayList arrayList = uVar.f892y;
                if (true != uVar.f891x) {
                    uVar.f891x = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        b(i, menu);
        n nVar = this.f821c;
        if (i != 108) {
            if (i == 0) {
                m mVarK = nVar.k(i);
                if (mVarK.f834m) {
                    nVar.f(mVarK, false);
                    return;
                }
                return;
            }
            return;
        }
        nVar.l();
        u uVar = nVar.f843f;
        if (uVar != null) {
            ArrayList arrayList = uVar.f892y;
            if (uVar.f891x) {
                uVar.f891x = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        this.f820b.onPointerCaptureChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        x.p pVar = menu instanceof x.p ? (x.p) menu : null;
        if (i == 0 && pVar == null) {
            return false;
        }
        if (pVar != null) {
            pVar.f1086x = true;
        }
        boolean zOnPreparePanel = this.f820b.onPreparePanel(i, view, menu);
        if (pVar != null) {
            pVar.f1086x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        x.p pVar = this.f821c.k(0).f830h;
        if (pVar != null) {
            c(list, pVar, i);
        } else {
            c(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f820b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f820b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f820b.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r11, int r12) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f820b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }
}
