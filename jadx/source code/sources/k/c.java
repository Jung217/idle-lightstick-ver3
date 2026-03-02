package k;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import g.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.arch.lifecycle.f {
    @Override // android.arch.lifecycle.f
    public Typeface h(Context context, n.d[] dVarArr, int i) {
        String str;
        if (dVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(((n.d) android.arch.lifecycle.f.l(dVarArr, i, new n(1))).f648a, "r", null);
                try {
                    try {
                        str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    } finally {
                    }
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    File fileM = android.arch.lifecycle.f.m(context);
                    Typeface typefaceCreateFromFile2 = null;
                    if (fileM != null) {
                        try {
                            if (android.arch.lifecycle.f.f(fileM, fileInputStream)) {
                                typefaceCreateFromFile2 = Typeface.createFromFile(fileM.getPath());
                            }
                        } catch (RuntimeException unused2) {
                        } catch (Throwable th) {
                            fileM.delete();
                            throw th;
                        }
                        fileM.delete();
                    }
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile2;
                } finally {
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
