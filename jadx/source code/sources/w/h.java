package w;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x.p;
import x.v;
import y.T;

/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f962f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f966d;

    static {
        Class[] clsArr = {Context.class};
        f961e = clsArr;
        f962f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f965c = context;
        Object[] objArr = {context};
        this.f963a = objArr;
        this.f964b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z2 = z2;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f938b = 0;
                            gVar.f939c = 0;
                            gVar.f940d = 0;
                            gVar.f941e = 0;
                            gVar.f942f = true;
                            gVar.f943g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f944h) {
                                v vVar = gVar.f960z;
                                if (vVar == null || !vVar.f1118a.hasSubMenu()) {
                                    gVar.f944h = true;
                                    gVar.b(gVar.f937a.add(gVar.f938b, gVar.i, gVar.f945j, gVar.f946k));
                                } else {
                                    gVar.f944h = true;
                                    gVar.b(gVar.f937a.addSubMenu(gVar.f938b, gVar.i, gVar.f945j, gVar.f946k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z2 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z2 = z2;
                    }
                }
                eventType = xmlPullParser2.next();
                z2 = z2;
                z3 = z3;
            } else {
                if (!z3) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray typedArrayObtainStyledAttributes = this.f965c.obtainStyledAttributes(attributeSet, u.a.f909p);
                        gVar.f938b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f939c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f940d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f941e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f942f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gVar.f943g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = this.f965c.obtainStyledAttributes(attributeSet, u.a.f910q);
                            gVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f945j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f939c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.f940d) & 65535);
                            gVar.f946k = typedArrayObtainStyledAttributes2.getText(7);
                            gVar.f947l = typedArrayObtainStyledAttributes2.getText(8);
                            gVar.f948m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gVar.f949n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f950o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gVar.f951p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f952q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.r = gVar.f941e;
                            }
                            gVar.f953s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gVar.f954t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f942f);
                            gVar.f955u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f943g);
                            gVar.f956v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gVar.f959y = typedArrayObtainStyledAttributes2.getString(12);
                            gVar.f957w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f958x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z4 = string3 != null;
                            if (z4 && gVar.f957w == 0 && gVar.f958x == null) {
                                gVar.f960z = (v) gVar.a(string3, f962f, this.f964b);
                            } else {
                                if (z4) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f960z = null;
                            }
                            gVar.f936A = typedArrayObtainStyledAttributes2.getText(17);
                            gVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gVar.D = T.b(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                gVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                gVar.C = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            } else {
                                gVar.C = colorStateList;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gVar.f944h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f944h = true;
                            SubMenu subMenuAddSubMenu = gVar.f937a.addSubMenu(gVar.f938b, gVar.i, gVar.f945j, gVar.f946k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlPullParser2.next();
                        z2 = z2;
                        z3 = z3;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z2 = z2;
            }
            eventType = xmlPullParser2.next();
            z2 = z2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof p)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f965c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
