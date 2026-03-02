package A;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
