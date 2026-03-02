package android.arch.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f23c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f25e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f26f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f27g;

    static {
        b bVar = new b("DESTROYED", 0);
        f22b = bVar;
        b bVar2 = new b("INITIALIZED", 1);
        f23c = bVar2;
        b bVar3 = new b("CREATED", 2);
        f24d = bVar3;
        b bVar4 = new b("STARTED", 3);
        f25e = bVar4;
        b bVar5 = new b("RESUMED", 4);
        f26f = bVar5;
        f27g = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f27g.clone();
    }
}
