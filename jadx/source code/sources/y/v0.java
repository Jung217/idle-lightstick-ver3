package y;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f1398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f1399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f1400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f1401e;

    public v0(View view) {
        this.f1397a = (TextView) view.findViewById(R.id.text1);
        this.f1398b = (TextView) view.findViewById(R.id.text2);
        this.f1399c = (ImageView) view.findViewById(R.id.icon1);
        this.f1400d = (ImageView) view.findViewById(R.id.icon2);
        this.f1401e = (ImageView) view.findViewById(com.studiothinkers.lightstick.idlev3.R.id.edit_query);
    }
}
