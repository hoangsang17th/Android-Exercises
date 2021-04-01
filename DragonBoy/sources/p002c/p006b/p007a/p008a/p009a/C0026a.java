package p002c.p006b.p007a.p008a.p009a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: c.b.a.a.a.a */
class C0026a {

    /* renamed from: a */
    private Context f262a;

    C0026a(Context context) {
        this.f262a = context;
    }

    /* renamed from: b */
    private SharedPreferences m126b() {
        return PreferenceManager.getDefaultSharedPreferences(mo53a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Context mo53a() {
        return this.f262a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo54c() {
        return mo53a().getPackageName() + "_preferences";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo55d(String str, boolean z) {
        SharedPreferences b = m126b();
        return b != null ? b.getBoolean(str, z) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo56e(String str, String str2) {
        SharedPreferences b = m126b();
        return b != null ? b.getString(str, str2) : str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo57f(String str, Boolean bool) {
        SharedPreferences b = m126b();
        if (b == null) {
            return false;
        }
        SharedPreferences.Editor edit = b.edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo58g(String str, String str2) {
        SharedPreferences b = m126b();
        if (b == null) {
            return false;
        }
        SharedPreferences.Editor edit = b.edit();
        edit.putString(str, str2);
        edit.commit();
        return true;
    }
}
