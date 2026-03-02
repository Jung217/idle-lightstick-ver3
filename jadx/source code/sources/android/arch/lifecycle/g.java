package android.arch.lifecycle;

import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class g extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45b = 0;

    public final void a(a aVar) {
        e eVar;
        b bVar;
        ComponentCallbacks2 activity = getActivity();
        if (!(activity instanceof c) || (eVar = ((t.f) ((c) activity)).f804b) == null) {
            return;
        }
        switch (d.f28a[aVar.ordinal()]) {
            case 1:
            case 2:
                bVar = b.f24d;
                break;
            case 3:
            case 4:
                bVar = b.f25e;
                break;
            case 5:
                bVar = b.f26f;
                break;
            case 6:
                bVar = b.f22b;
                break;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
        eVar.a(bVar);
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(a.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a(a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a(a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(a.ON_STOP);
    }
}
