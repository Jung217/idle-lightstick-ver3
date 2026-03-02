package A;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.studiothinkers.lightstick.idlev3.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3c;

    public /* synthetic */ d(MainActivity mainActivity, int i) {
        this.f2b = i;
        this.f3c = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2b) {
            case 0:
                dialogInterface.dismiss();
                this.f3c.finish();
                break;
            case 1:
                dialogInterface.dismiss();
                MainActivity mainActivity = this.f3c;
                mainActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", mainActivity.getPackageName(), null)));
                mainActivity.finish();
                break;
            case 2:
                dialogInterface.dismiss();
                this.f3c.finish();
                break;
            case 3:
                this.f3c.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                break;
            default:
                dialogInterface.dismiss();
                this.f3c.r();
                break;
        }
    }
}
