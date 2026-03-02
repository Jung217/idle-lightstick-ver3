package x;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005d extends AbstractC0006e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.a f1014c;

    public AbstractC0005d(Context context, Object obj) {
        super(obj);
        this.f1013b = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof m.a)) {
            return menuItem;
        }
        m.a aVar = (m.a) menuItem;
        if (this.f1014c == null) {
            this.f1014c = new p.a();
        }
        MenuItem menuItem2 = (MenuItem) this.f1014c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        w wVar = new w(this.f1013b, aVar);
        this.f1014c.put(aVar, wVar);
        return wVar;
    }
}
