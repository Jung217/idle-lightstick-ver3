package e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import org.xmlpull.v1.XmlPullParserException;
import t.q;
import t.r;
import y.B;
import y.C0043v;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f472d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f475c;

    public c(Context context, TypedArray typedArray) {
        this.f473a = context;
        this.f474b = typedArray;
    }

    public static c g(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList a(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f474b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            Context context = (Context) this.f473a;
            Object obj = v.a.f919a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f474b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : v.a.a((Context) this.f473a, resourceId);
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f474b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0043v.e().g((Context) this.f473a, resourceId, true);
    }

    public Typeface d(int i, int i2, B b2) {
        B b3;
        String str;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f474b).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f475c) == null) {
                this.f475c = new TypedValue();
            }
            Context context = (Context) this.f473a;
            TypedValue typedValue = (TypedValue) this.f475c;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    b2.b(-3);
                    return null;
                }
                p.e eVar = k.b.f626b;
                Typeface typeface = (Typeface) eVar.a(k.b.b(resources, resourceId, i2));
                if (typeface != null) {
                    b2.c(typeface);
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        try {
                            j.a aVarQ = android.arch.lifecycle.f.q(resources.getXml(resourceId), resources);
                            if (aVarQ != null) {
                                try {
                                    return k.b.a(context, aVarQ, resources, resourceId, i2, b2);
                                } catch (IOException e2) {
                                    e = e2;
                                    b3 = b2;
                                    iOException = e;
                                    str = string;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(str), iOException);
                                    b3.b(-3);
                                    return null;
                                } catch (XmlPullParserException e3) {
                                    e = e3;
                                    b3 = b2;
                                    xmlPullParserException = e;
                                    str = string;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), xmlPullParserException);
                                    b3.b(-3);
                                    return null;
                                }
                            }
                            try {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                b2.b(-3);
                                return null;
                            } catch (IOException e4) {
                                iOException = e4;
                                b3 = b2;
                                str = string;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(str), iOException);
                                b3.b(-3);
                                return null;
                            } catch (XmlPullParserException e5) {
                                xmlPullParserException = e5;
                                b3 = b2;
                                str = string;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), xmlPullParserException);
                                b3.b(-3);
                                return null;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            b3 = b2;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            b3 = b2;
                        }
                    } else {
                        b3 = b2;
                        try {
                            try {
                                Typeface typefaceI = k.b.f625a.i(context, resources, resourceId, string, i2);
                                str = string;
                                if (typefaceI != null) {
                                    try {
                                        eVar.b(k.b.b(resources, resourceId, i2), typefaceI);
                                    } catch (IOException e8) {
                                        e = e8;
                                        iOException = e;
                                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(str), iOException);
                                        b3.b(-3);
                                        return null;
                                    } catch (XmlPullParserException e9) {
                                        e = e9;
                                        xmlPullParserException = e;
                                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), xmlPullParserException);
                                        b3.b(-3);
                                        return null;
                                    }
                                }
                                if (typefaceI != null) {
                                    b3.c(typefaceI);
                                } else {
                                    b3.b(-3);
                                }
                                return typefaceI;
                            } catch (IOException e10) {
                                e = e10;
                                str = string;
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                str = string;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            str = string;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(str), iOException);
                            b3.b(-3);
                            return null;
                        } catch (XmlPullParserException e13) {
                            e = e13;
                            str = string;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), xmlPullParserException);
                            b3.b(-3);
                            return null;
                        }
                    }
                } catch (IOException e14) {
                    e = e14;
                    b3 = b2;
                } catch (XmlPullParserException e15) {
                    e = e15;
                    b3 = b2;
                }
            }
        }
        return null;
    }

    public boolean e() {
        Location location;
        long j2;
        LocationManager locationManager = (LocationManager) this.f474b;
        r rVar = (r) this.f475c;
        if (rVar.f872b > System.currentTimeMillis()) {
            return rVar.f871a;
        }
        Context context = (Context) this.f473a;
        Location lastKnownLocation = null;
        if (android.arch.lifecycle.f.d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
            } catch (Exception e2) {
                Log.d("TwilightManager", "Failed to get last known location", e2);
            }
            Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
            location = lastKnownLocation2;
        } else {
            location = null;
        }
        if (android.arch.lifecycle.f.d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    lastKnownLocation = locationManager.getLastKnownLocation("gps");
                }
            } catch (Exception e3) {
                Log.d("TwilightManager", "Failed to get last known location", e3);
            }
        }
        if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
            location = lastKnownLocation;
        }
        if (location == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i = Calendar.getInstance().get(11);
            return i < 6 || i >= 22;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (q.f867d == null) {
            q.f867d = new q();
        }
        q qVar = q.f867d;
        qVar.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        qVar.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = qVar.f870c == 1;
        long j3 = qVar.f869b;
        long j4 = qVar.f868a;
        qVar.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = qVar.f869b;
        if (j3 == -1 || j4 == -1) {
            j2 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j4) {
                j3 = j5;
            } else if (jCurrentTimeMillis > j3) {
                j3 = j4;
            }
            j2 = j3 + 60000;
        }
        rVar.f871a = z2;
        rVar.f872b = j2;
        return z2;
    }

    public boolean f(c.g gVar, f.d dVar, int i) {
        g.b bVar = (g.b) this.f474b;
        int[] iArr = dVar.i0;
        int[] iArr2 = dVar.f548n;
        bVar.f561a = iArr[0];
        bVar.f562b = iArr[1];
        bVar.f563c = dVar.l();
        bVar.f564d = dVar.i();
        bVar.i = false;
        bVar.f569j = i;
        boolean z2 = bVar.f561a == 3;
        boolean z3 = bVar.f562b == 3;
        boolean z4 = z2 && dVar.P > 0.0f;
        boolean z5 = z3 && dVar.P > 0.0f;
        if (z4 && iArr2[0] == 4) {
            bVar.f561a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            bVar.f562b = 1;
        }
        gVar.b(dVar, bVar);
        dVar.D(bVar.f565e);
        dVar.A(bVar.f566f);
        dVar.f558y = bVar.f568h;
        int i2 = bVar.f567g;
        dVar.T = i2;
        dVar.f558y = i2 > 0;
        bVar.f569j = 0;
        return bVar.i;
    }

    public void h() {
        ((TypedArray) this.f474b).recycle();
    }

    public void i(f.e eVar, int i, int i2) {
        int i3 = eVar.U;
        int i4 = eVar.V;
        eVar.U = 0;
        eVar.V = 0;
        eVar.D(i);
        eVar.A(i2);
        if (i3 < 0) {
            eVar.U = 0;
        } else {
            eVar.U = i3;
        }
        if (i4 < 0) {
            eVar.V = 0;
        } else {
            eVar.V = i4;
        }
        ((f.e) this.f475c).K();
    }

    public void j(f.e eVar) {
        ArrayList arrayList = (ArrayList) this.f473a;
        arrayList.clear();
        int size = eVar.j0.size();
        for (int i = 0; i < size; i++) {
            f.d dVar = (f.d) eVar.j0.get(i);
            int[] iArr = dVar.i0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.l0.f573b = true;
    }
}
