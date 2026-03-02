package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f29b;

    static {
        int[] iArr = new int[b.values().length];
        f29b = iArr;
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29b[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29b[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f29b[0] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[a.values().length];
        f28a = iArr2;
        try {
            iArr2[a.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f28a[a.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f28a[a.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f28a[a.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f28a[a.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f28a[a.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f28a[a.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
