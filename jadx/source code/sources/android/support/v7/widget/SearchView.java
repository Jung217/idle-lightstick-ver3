package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.arch.lifecycle.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.studiothinkers.lightstick.idlev3.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.l;
import s.e;
import y.AbstractC0011a0;
import y.C0013b0;
import y.C0033l0;
import y.C0037o;
import y.I;
import y.RunnableC0035m0;
import y.n0;
import y.o0;
import y.p0;
import y.q0;
import y.r0;
import y.s0;
import y.t0;
import y.u0;
import y.w0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0011a0 implements w.b {
    public static final e.c h0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f264A;
    public final Rect B;
    public final int[] C;
    public final int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public e P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;
    public boolean a0;
    public int b0;
    public SearchableInfo c0;
    public Bundle d0;
    public final RunnableC0035m0 e0;
    public final RunnableC0035m0 f0;
    public final WeakHashMap g0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f265q;
    public final View r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u0 f273z;

    public static class SearchAutoComplete extends C0037o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c f277h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f277h = new c(this);
            this.f274e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f274e <= 0 || super.enoughToFilter();
        }

        @Override // y.C0037o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f276g) {
                c cVar = this.f277h;
                removeCallbacks(cVar);
                post(cVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i, Rect rect) {
            super.onFocusChanged(z2, i, rect);
            SearchView searchView = this.f275f;
            searchView.u(searchView.O);
            searchView.post(searchView.e0);
            SearchAutoComplete searchAutoComplete = searchView.f265q;
            if (searchAutoComplete.hasFocus()) {
                e.c cVar = SearchView.h0;
                Method method = (Method) cVar.f473a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, null);
                    } catch (Exception unused) {
                    }
                }
                Method method2 = (Method) cVar.f474b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchAutoComplete, null);
                    } catch (Exception unused2) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f275f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            Method method;
            super.onWindowFocusChanged(z2);
            if (z2 && this.f275f.hasFocus() && getVisibility() == 0) {
                this.f276g = true;
                Context context = getContext();
                e.c cVar = SearchView.h0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = (Method) SearchView.h0.f475c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f277h;
            if (!z2) {
                this.f276g = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f276g = true;
                    return;
                }
                this.f276g = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f275f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f274e = i;
        }
    }

    static {
        e.c cVar = new e.c();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            cVar.f473a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            cVar.f474b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            cVar.f475c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        h0 = cVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f265q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f265q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.T = false;
    }

    public int getImeOptions() {
        return this.f265q.getImeOptions();
    }

    public int getInputType() {
        return this.f265q.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f265q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public e getSuggestionsAdapter() {
        return this.P;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.c0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f265q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i) {
        int position;
        String strH;
        Cursor cursor = this.P.f749d;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentI = null;
            try {
                int i2 = w0.f1404z;
                String strH2 = w0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.c0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = w0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.c0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = w0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentI = i(strH2, strH3 == null ? null : Uri.parse(strH3), w0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), w0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentI != null) {
                try {
                    getContext().startActivity(intentI);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentI, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f265q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i) {
        Editable text = this.f265q.getText();
        Cursor cursor = this.P.f749d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.P.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f265q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.c0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // w.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f265q;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W = "";
        clearFocus();
        u(true);
        searchAutoComplete.setImeOptions(this.b0);
        this.a0 = false;
    }

    @Override // w.b
    public final void onActionViewExpanded() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        SearchAutoComplete searchAutoComplete = this.f265q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        post(this.f0);
        super.onDetachedFromWindow();
    }

    @Override // y.AbstractC0011a0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.f265q;
            int[] iArr = this.C;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.D;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f264A;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.B;
            rect2.set(i7, 0, i8, i9);
            u0 u0Var = this.f273z;
            if (u0Var == null) {
                u0 u0Var2 = new u0(rect2, rect, searchAutoComplete);
                this.f273z = u0Var2;
                setTouchDelegate(u0Var2);
            } else {
                u0Var.f1380b.set(rect2);
                Rect rect3 = u0Var.f1382d;
                rect3.set(rect2);
                int i10 = -u0Var.f1383e;
                rect3.inset(i10, i10);
                u0Var.f1381c.set(rect);
            }
        }
    }

    @Override // y.AbstractC0011a0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.O) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.U;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.U) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t0 t0Var = (t0) parcelable;
        super.onRestoreInstanceState(t0Var.f713b);
        u(t0Var.f1378d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        t0 t0Var = new t0(super.onSaveInstanceState());
        t0Var.f1378d = this.O;
        return t0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.e0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f265q.getText());
        int i = (!zIsEmpty || (this.N && !this.a0)) ? 0 : 8;
        ImageView imageView = this.f270w;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f265q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f266s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f267t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z2 = this.N;
        SearchAutoComplete searchAutoComplete = this.f265q;
        CharSequence charSequence2 = charSequence;
        if (z2) {
            Drawable drawable = this.F;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (this.O) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f265q.requestFocus(i, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.f267t.setVisibility(((this.Q || this.V) && !this.O && (this.f269v.getVisibility() == 0 || this.f271x.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.d0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f265q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.N == z2) {
            return;
        }
        this.N = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i) {
        this.f265q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f265q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.U = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.S = z2;
        e eVar = this.P;
        if (eVar instanceof w0) {
            ((w0) eVar).r = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.c0 = r7
            r0 = 0
            r1 = 1
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r6.f265q
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.c0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.c0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.c0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            s.e r7 = r6.P
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.c0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            y.w0 r7 = new y.w0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.c0
            java.util.WeakHashMap r5 = r6.g0
            r7.<init>(r3, r6, r4, r5)
            r6.P = r7
            r2.setAdapter(r7)
            s.e r7 = r6.P
            y.w0 r7 = (y.w0) r7
            boolean r3 = r6.S
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.r = r3
        L62:
            r6.r()
        L65:
            android.app.SearchableInfo r7 = r6.c0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.c0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.I
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.c0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.J
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.V = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.O
            r6.u(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.Q = z2;
        u(this.O);
    }

    public void setSuggestionsAdapter(e eVar) {
        this.P = eVar;
        this.f265q.setAdapter(eVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.Q;
        this.f269v.setVisibility((!z3 || !(z3 || this.V) || this.O || !hasFocus() || (!z2 && this.V)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.O = z2;
        int i = 8;
        int i2 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f265q.getText());
        this.f268u.setVisibility(i2);
        t(!zIsEmpty);
        this.r.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.E;
        imageView.setVisibility((imageView.getDrawable() == null || this.N) ? 8 : 0);
        p();
        if (this.V && !this.O && zIsEmpty) {
            this.f269v.setVisibility(8);
            i = 0;
        }
        this.f271x.setVisibility(i);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f264A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.e0 = new RunnableC0035m0(this, 0);
        int i2 = 1;
        this.f0 = new RunnableC0035m0(this, i2);
        this.g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        p0 p0Var = new p0(this);
        I i3 = new I(i2, this);
        C0013b0 c0013b0 = new C0013b0(1, this);
        C0033l0 c0033l0 = new C0033l0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.a.f913u, i, 0);
        e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f265q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f266s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f267t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f268u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f269v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f270w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f271x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        Drawable drawableB = cVar.b(10);
        WeakHashMap weakHashMap = l.f728a;
        viewFindViewById.setBackground(drawableB);
        viewFindViewById2.setBackground(cVar.b(14));
        imageView.setImageDrawable(cVar.b(13));
        imageView2.setImageDrawable(cVar.b(7));
        imageView3.setImageDrawable(cVar.b(4));
        imageView4.setImageDrawable(cVar.b(16));
        imageView5.setImageDrawable(cVar.b(13));
        this.F = cVar.b(12);
        f.u(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c0033l0);
        searchAutoComplete.setOnEditorActionListener(p0Var);
        searchAutoComplete.setOnItemClickListener(i3);
        searchAutoComplete.setOnItemSelectedListener(c0013b0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new n0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.K = typedArrayObtainStyledAttributes.getText(6);
        this.R = typedArrayObtainStyledAttributes.getText(11);
        int i4 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        cVar.h();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f272y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new o0(this));
        }
        u(this.N);
        r();
    }

    public void setOnCloseListener(q0 q0Var) {
    }

    public void setOnQueryTextListener(r0 r0Var) {
    }

    public void setOnSuggestionListener(s0 s0Var) {
    }
}
