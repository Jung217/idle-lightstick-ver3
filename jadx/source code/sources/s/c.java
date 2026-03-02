package s;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import y.w0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f744a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w0 w0Var) {
        super(new Handler());
        this.f744a = w0Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        w0 w0Var = this.f744a;
        if (!w0Var.f748c || (cursor = w0Var.f749d) == null || cursor.isClosed()) {
            return;
        }
        w0Var.f747b = w0Var.f749d.requery();
    }
}
