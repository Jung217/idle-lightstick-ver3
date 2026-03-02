package y;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.studiothinkers.lightstick.idlev3.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends s.e implements View.OnClickListener {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1404z = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LayoutInflater f1407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchView f1408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SearchableInfo f1409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f1410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WeakHashMap f1411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1412q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f1413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1419y;

    public w0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f748c = true;
        this.f749d = null;
        this.f747b = false;
        this.f750e = context;
        this.f751f = -1;
        this.f752g = new s.c(this);
        this.f753h = new s.d(0, this);
        this.f1406k = suggestionRowLayout;
        this.f1405j = suggestionRowLayout;
        this.f1407l = (LayoutInflater) context.getSystemService("layout_inflater");
        this.r = 1;
        this.f1414t = -1;
        this.f1415u = -1;
        this.f1416v = -1;
        this.f1417w = -1;
        this.f1418x = -1;
        this.f1419y = -1;
        this.f1408m = searchView;
        this.f1409n = searchableInfo;
        this.f1412q = searchView.getSuggestionCommitIconResId();
        this.f1410o = context;
        this.f1411p = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    @Override // s.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.w0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // s.e
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1414t = cursor.getColumnIndex("suggest_text_1");
                this.f1415u = cursor.getColumnIndex("suggest_text_2");
                this.f1416v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1417w = cursor.getColumnIndex("suggest_icon_1");
                this.f1418x = cursor.getColumnIndex("suggest_icon_2");
                this.f1419y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // s.e
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f1409n;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // s.e
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f1407l.inflate(this.f1405j, viewGroup, false);
        viewInflate.setTag(new v0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f1412q);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f750e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.w0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f750e.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // s.e, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewInflate = this.f1407l.inflate(this.f1406k, viewGroup, false);
            if (viewInflate != null) {
                ((v0) viewInflate.getTag()).f1397a.setText(e2.toString());
            }
            return viewInflate;
        }
    }

    @Override // s.e, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewD = d(viewGroup);
            ((v0) viewD.getTag()).f1397a.setText(e2.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f749d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f749d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1408m.n((CharSequence) tag);
        }
    }
}
