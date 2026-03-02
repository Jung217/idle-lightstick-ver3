package n;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f641e;

    public a(String str, String str2, String str3, List list) {
        this.f637a = str;
        this.f638b = str2;
        this.f639c = str3;
        list.getClass();
        this.f640d = list;
        this.f641e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f637a + ", mProviderPackage: " + this.f638b + ", mQuery: " + this.f639c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f640d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
