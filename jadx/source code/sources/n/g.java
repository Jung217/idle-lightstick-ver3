package n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.app.h f660a;

    public g(android.support.v4.app.h hVar) {
        this.f660a = hVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            android.support.v4.app.h hVar = this.f660a;
            synchronized (hVar.f93a) {
                try {
                    if (!((Handler) hVar.f95c).hasMessages(1)) {
                        ((HandlerThread) hVar.f94b).quit();
                        hVar.f94b = null;
                        hVar.f95c = null;
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return true;
        }
        android.support.v4.app.h hVar2 = this.f660a;
        Runnable runnable = (Runnable) message.obj;
        hVar2.getClass();
        runnable.run();
        synchronized (hVar2.f93a) {
            ((Handler) hVar2.f95c).removeMessages(0);
            Handler handler = (Handler) hVar2.f95c;
            handler.sendMessageDelayed(handler.obtainMessage(0), 10000);
        }
        return true;
    }
}
