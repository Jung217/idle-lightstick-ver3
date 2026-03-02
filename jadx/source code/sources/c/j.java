package c;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import x.E;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f370b;

    public void a(w.a aVar) {
        android.support.v4.app.h hVar = (android.support.v4.app.h) this.f369a;
        ((ActionMode.Callback) hVar.f93a).onDestroyActionMode(hVar.i(aVar));
        t.n nVar = (t.n) this.f370b;
        if (nVar.f850n != null) {
            nVar.f840c.getDecorView().removeCallbacks(nVar.f851o);
        }
        if (nVar.f849m != null) {
            q.p pVar = nVar.f852p;
            if (pVar != null) {
                pVar.b();
            }
            q.p pVarA = q.l.a(nVar.f849m);
            pVarA.a(0.0f);
            nVar.f852p = pVarA;
            pVarA.d(new t.j(2, this));
        }
        nVar.f848l = null;
    }

    public boolean b(w.a aVar, Menu menu) {
        android.support.v4.app.h hVar = (android.support.v4.app.h) this.f369a;
        ActionMode.Callback callback = (ActionMode.Callback) hVar.f93a;
        w.e eVarI = hVar.i(aVar);
        p.j jVar = (p.j) hVar.f96d;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            E e2 = new E((Context) hVar.f94b, (x.p) menu);
            jVar.put(menu, e2);
            menu2 = e2;
        }
        return callback.onPrepareActionMode(eVarI, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0091, TryCatch #2 {IOException -> 0x008e, XmlPullParserException -> 0x0091, blocks: (B:15:0x0058, B:23:0x006c, B:26:0x007a, B:28:0x0080, B:88:0x01d3, B:33:0x0094, B:34:0x009c, B:65:0x00f7, B:66:0x00fe, B:67:0x0116, B:69:0x0119, B:70:0x0124, B:71:0x013c, B:73:0x013f, B:74:0x014a, B:75:0x0162, B:77:0x0165, B:78:0x016f, B:79:0x0187, B:81:0x018a, B:82:0x0194, B:83:0x01ac, B:84:0x01ad, B:85:0x01ba, B:86:0x01c7, B:36:0x00a0, B:39:0x00a8, B:42:0x00b2, B:45:0x00bc, B:48:0x00c6, B:51:0x00d0, B:54:0x00d9, B:57:0x00e3, B:87:0x01d0), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0091, TryCatch #2 {IOException -> 0x008e, XmlPullParserException -> 0x0091, blocks: (B:15:0x0058, B:23:0x006c, B:26:0x007a, B:28:0x0080, B:88:0x01d3, B:33:0x0094, B:34:0x009c, B:65:0x00f7, B:66:0x00fe, B:67:0x0116, B:69:0x0119, B:70:0x0124, B:71:0x013c, B:73:0x013f, B:74:0x014a, B:75:0x0162, B:77:0x0165, B:78:0x016f, B:79:0x0187, B:81:0x018a, B:82:0x0194, B:83:0x01ac, B:84:0x01ad, B:85:0x01ba, B:86:0x01c7, B:36:0x00a0, B:39:0x00a8, B:42:0x00b2, B:45:0x00bc, B:48:0x00c6, B:51:0x00d0, B:54:0x00d9, B:57:0x00e3, B:87:0x01d0), top: B:96:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0091, TryCatch #2 {IOException -> 0x008e, XmlPullParserException -> 0x0091, blocks: (B:15:0x0058, B:23:0x006c, B:26:0x007a, B:28:0x0080, B:88:0x01d3, B:33:0x0094, B:34:0x009c, B:65:0x00f7, B:66:0x00fe, B:67:0x0116, B:69:0x0119, B:70:0x0124, B:71:0x013c, B:73:0x013f, B:74:0x014a, B:75:0x0162, B:77:0x0165, B:78:0x016f, B:79:0x0187, B:81:0x018a, B:82:0x0194, B:83:0x01ac, B:84:0x01ad, B:85:0x01ba, B:86:0x01c7, B:36:0x00a0, B:39:0x00a8, B:42:0x00b2, B:45:0x00bc, B:48:0x00c6, B:51:0x00d0, B:54:0x00d9, B:57:0x00e3, B:87:0x01d0), top: B:96:0x0058 }] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.j.c(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
