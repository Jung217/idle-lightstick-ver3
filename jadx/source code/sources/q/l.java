package q;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f728a;

    static {
        new AtomicInteger(1);
        f728a = null;
    }

    public static p a(View view) {
        if (f728a == null) {
            f728a = new WeakHashMap();
        }
        p pVar = (p) f728a.get(view);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p();
        pVar2.f733a = new WeakReference(view);
        f728a.put(view, pVar2);
        return pVar2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = k.f724d;
        k kVar = (k) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (kVar == null) {
            kVar = new k();
            kVar.f725a = null;
            kVar.f726b = null;
            kVar.f727c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, kVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = kVar.f725a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = k.f724d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (kVar.f725a == null) {
                            kVar.f725a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = k.f724d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                kVar.f725a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    kVar.f725a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = kVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (kVar.f726b == null) {
                    kVar.f726b = new SparseArray();
                }
                kVar.f726b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }
}
