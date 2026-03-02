package p;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Writer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f677c = new StringBuilder(128);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f676b = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f677c;
        if (sb.length() > 0) {
            Log.d(this.f676b, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f677c.append(c2);
            }
        }
    }
}
