package p002c.p006b.p007a.p008a.p009a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import p002c.p003a.p004a.p005a.C0022a;

/* renamed from: c.b.a.a.a.c */
public class C0028c extends C0026a {

    /* renamed from: j */
    private static final Date f266j;

    /* renamed from: k */
    private static final Date f267k;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0022a f268b;

    /* renamed from: c */
    private String f269c;

    /* renamed from: d */
    private String f270d;

    /* renamed from: e */
    private C0027b f271e;

    /* renamed from: f */
    private C0027b f272f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0031c f273g;

    /* renamed from: h */
    private String f274h;

    /* renamed from: i */
    private ServiceConnection f275i;

    /* renamed from: c.b.a.a.a.c$a */
    class C0029a implements ServiceConnection {
        C0029a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0022a unused = C0028c.this.f268b = C0022a.C0023a.m107f(iBinder);
            new C0030b(C0028c.this, (C0029a) null).execute(new Void[0]);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0022a unused = C0028c.this.f268b = null;
        }
    }

    /* renamed from: c.b.a.a.a.c$b */
    private class C0030b extends AsyncTask<Void, Void, Boolean> {
        private C0030b() {
        }

        /* synthetic */ C0030b(C0028c cVar, C0029a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            if (C0028c.this.m162y()) {
                return Boolean.FALSE;
            }
            C0028c.this.mo66B();
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                C0028c.this.m149J();
                if (C0028c.this.f273g != null) {
                    C0028c.this.f273g.mo44b();
                }
            }
            if (C0028c.this.f273g != null) {
                C0028c.this.f273g.mo45c();
            }
        }
    }

    /* renamed from: c.b.a.a.a.c$c */
    public interface C0031c {
        /* renamed from: a */
        void mo43a(int i, @Nullable Throwable th);

        /* renamed from: b */
        void mo44b();

        /* renamed from: c */
        void mo45c();

        /* renamed from: d */
        void mo46d(@NonNull String str, @Nullable C0038h hVar);
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.set(2012, 11, 5);
        f266j = instance.getTime();
        instance.set(2015, 6, 21);
        f267k = instance.getTime();
    }

    public C0028c(Context context, String str, C0031c cVar) {
        this(context, str, (String) null, cVar);
    }

    public C0028c(Context context, String str, String str2, C0031c cVar) {
        this(context, str, str2, cVar, true);
    }

    private C0028c(Context context, String str, String str2, C0031c cVar, boolean z) {
        super(context.getApplicationContext());
        this.f275i = new C0029a();
        this.f270d = str;
        this.f273g = cVar;
        this.f269c = mo53a().getPackageName();
        this.f271e = new C0027b(mo53a(), ".products.cache.v2_6");
        this.f272f = new C0027b(mo53a(), ".subscriptions.cache.v2_6");
        this.f274h = str2;
        if (z) {
            m155l();
        }
    }

    /* renamed from: C */
    private boolean m144C(String str, C0027b bVar) {
        if (!mo74x()) {
            return false;
        }
        try {
            Bundle d = this.f268b.mo40d(3, this.f269c, str, (String) null);
            if (d.getInt("RESPONSE_CODE") == 0) {
                bVar.mo59h();
                ArrayList<String> stringArrayList = d.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = d.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    return true;
                }
                int i = 0;
                while (i < stringArrayList.size()) {
                    String str2 = stringArrayList.get(i);
                    if (!TextUtils.isEmpty(str2)) {
                        bVar.mo62p(new JSONObject(str2).getString("productId"), str2, (stringArrayList2 == null || stringArrayList2.size() <= i) ? null : stringArrayList2.get(i));
                    }
                    i++;
                }
                return true;
            }
        } catch (Exception e) {
            m147H(100, e);
            Log.e("iabv3", "Error in loadPurchasesByType", e);
        }
        return false;
    }

    /* renamed from: E */
    private boolean m145E(Activity activity, List<String> list, String str, String str2, String str3) {
        return m146F(activity, list, str, str2, str3, (Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8 A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m146F(android.app.Activity r20, java.util.List<java.lang.String> r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, android.os.Bundle r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r9 = r22
            r7 = r23
            r2 = r24
            r8 = r25
            java.lang.String r3 = "skusToReplace"
            java.lang.String r4 = "subs"
            java.lang.String r10 = "iabv3"
            java.lang.String r5 = ":"
            boolean r6 = r19.mo74x()
            r11 = 0
            if (r6 == 0) goto L_0x0143
            boolean r6 = android.text.TextUtils.isEmpty(r22)
            if (r6 != 0) goto L_0x0143
            boolean r6 = android.text.TextUtils.isEmpty(r23)
            if (r6 == 0) goto L_0x0029
            goto L_0x0143
        L_0x0029:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r6.<init>()     // Catch:{ Exception -> 0x0138 }
            r6.append(r7)     // Catch:{ Exception -> 0x0138 }
            r6.append(r5)     // Catch:{ Exception -> 0x0138 }
            r6.append(r9)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0138 }
            boolean r12 = r7.equals(r4)     // Catch:{ Exception -> 0x0138 }
            if (r12 != 0) goto L_0x005b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r12.<init>()     // Catch:{ Exception -> 0x0138 }
            r12.append(r6)     // Catch:{ Exception -> 0x0138 }
            r12.append(r5)     // Catch:{ Exception -> 0x0138 }
            java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0138 }
            r12.append(r6)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = r12.toString()     // Catch:{ Exception -> 0x0138 }
        L_0x005b:
            if (r2 == 0) goto L_0x0071
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r12.<init>()     // Catch:{ Exception -> 0x0138 }
            r12.append(r6)     // Catch:{ Exception -> 0x0138 }
            r12.append(r5)     // Catch:{ Exception -> 0x0138 }
            r12.append(r2)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r12.toString()     // Catch:{ Exception -> 0x0138 }
            r12 = r2
            goto L_0x0072
        L_0x0071:
            r12 = r6
        L_0x0072:
            r1.m148I(r12)     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x00af
            boolean r2 = r7.equals(r4)     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x00af
            if (r8 != 0) goto L_0x0090
            c.a.a.a.a r2 = r1.f268b     // Catch:{ Exception -> 0x0138 }
            r3 = 5
            java.lang.String r4 = r1.f269c     // Catch:{ Exception -> 0x0138 }
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r12
            android.os.Bundle r0 = r2.mo38b(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00c6
        L_0x0090:
            boolean r2 = r8.containsKey(r3)     // Catch:{ Exception -> 0x0138 }
            if (r2 != 0) goto L_0x009e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0138 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0138 }
            r8.putStringArrayList(r3, r2)     // Catch:{ Exception -> 0x0138 }
        L_0x009e:
            c.a.a.a.a r2 = r1.f268b     // Catch:{ Exception -> 0x0138 }
            r3 = 7
            java.lang.String r4 = r1.f269c     // Catch:{ Exception -> 0x0138 }
        L_0x00a3:
            r5 = r22
            r6 = r23
            r7 = r12
            r8 = r25
            android.os.Bundle r0 = r2.mo41e(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00c6
        L_0x00af:
            if (r8 != 0) goto L_0x00c0
            c.a.a.a.a r2 = r1.f268b     // Catch:{ Exception -> 0x0138 }
            r3 = 3
            java.lang.String r4 = r1.f269c     // Catch:{ Exception -> 0x0138 }
            r5 = r22
            r6 = r23
            r7 = r12
            android.os.Bundle r0 = r2.mo39c(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00c6
        L_0x00c0:
            c.a.a.a.a r2 = r1.f268b     // Catch:{ Exception -> 0x0138 }
            r3 = 7
            java.lang.String r4 = r1.f269c     // Catch:{ Exception -> 0x0138 }
            goto L_0x00a3
        L_0x00c6:
            if (r0 == 0) goto L_0x0136
            java.lang.String r2 = "RESPONSE_CODE"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x0138 }
            r3 = 0
            if (r2 != 0) goto L_0x00fa
            java.lang.String r2 = "BUY_INTENT"
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ Exception -> 0x0138 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ Exception -> 0x0138 }
            if (r20 == 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00f4
            android.content.IntentSender r13 = r0.getIntentSender()     // Catch:{ Exception -> 0x0138 }
            r14 = 32459(0x7ecb, float:4.5485E-41)
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x0138 }
            r15.<init>()     // Catch:{ Exception -> 0x0138 }
            r16 = 0
            r17 = 0
            r18 = 0
            r12 = r20
            r12.startIntentSenderForResult(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0136
        L_0x00f4:
            r0 = 103(0x67, float:1.44E-43)
            r1.m147H(r0, r3)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0136
        L_0x00fa:
            r0 = 7
            if (r2 != r0) goto L_0x0131
            boolean r0 = r1.mo75z(r9)     // Catch:{ Exception -> 0x0138 }
            if (r0 != 0) goto L_0x010c
            boolean r0 = r1.mo65A(r9)     // Catch:{ Exception -> 0x0138 }
            if (r0 != 0) goto L_0x010c
            r19.mo66B()     // Catch:{ Exception -> 0x0138 }
        L_0x010c:
            c.b.a.a.a.h r0 = r1.mo70r(r9)     // Catch:{ Exception -> 0x0138 }
            boolean r2 = r1.m156m(r0)     // Catch:{ Exception -> 0x0138 }
            if (r2 != 0) goto L_0x0121
            java.lang.String r0 = "Invalid or tampered merchant id!"
            android.util.Log.i(r10, r0)     // Catch:{ Exception -> 0x0138 }
            r0 = 104(0x68, float:1.46E-43)
            r1.m147H(r0, r3)     // Catch:{ Exception -> 0x0138 }
            return r11
        L_0x0121:
            c.b.a.a.a.c$c r2 = r1.f273g     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0136
            if (r0 != 0) goto L_0x012b
            c.b.a.a.a.h r0 = r1.mo71t(r9)     // Catch:{ Exception -> 0x0138 }
        L_0x012b:
            c.b.a.a.a.c$c r2 = r1.f273g     // Catch:{ Exception -> 0x0138 }
            r2.mo46d(r9, r0)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0136
        L_0x0131:
            r0 = 101(0x65, float:1.42E-43)
            r1.m147H(r0, r3)     // Catch:{ Exception -> 0x0138 }
        L_0x0136:
            r0 = 1
            return r0
        L_0x0138:
            r0 = move-exception
            java.lang.String r2 = "Error in purchase"
            android.util.Log.e(r10, r2, r0)
            r2 = 110(0x6e, float:1.54E-43)
            r1.m147H(r2, r0)
        L_0x0143:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p002c.p006b.p007a.p008a.p009a.C0028c.m146F(android.app.Activity, java.util.List, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: H */
    private void m147H(int i, Throwable th) {
        C0031c cVar = this.f273g;
        if (cVar != null) {
            cVar.mo43a(i, th);
        }
    }

    /* renamed from: I */
    private void m148I(String str) {
        mo58g(mo54c() + ".purchase.last.v2_6", str);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m149J() {
        mo57f(mo54c() + ".products.restored.v2_6", Boolean.TRUE);
    }

    /* renamed from: K */
    private boolean m150K(String str, String str2, String str3) {
        try {
            return TextUtils.isEmpty(this.f270d) || C0037g.m187c(str, this.f270d, str2, str3);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private void m155l() {
        try {
            mo53a().bindService(m158p(), this.f275i, 1);
        } catch (Exception e) {
            Log.e("iabv3", "error in bindPlayServices", e);
            m147H(113, e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r0 = r5.f298e.f288c.f278a.indexOf(46);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m156m(p002c.p006b.p007a.p008a.p009a.C0038h r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f274h
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            c.b.a.a.a.e r0 = r5.f298e
            c.b.a.a.a.d r0 = r0.f288c
            java.util.Date r0 = r0.f281d
            java.util.Date r2 = f266j
            boolean r0 = r0.before(r2)
            if (r0 == 0) goto L_0x0015
            return r1
        L_0x0015:
            c.b.a.a.a.e r0 = r5.f298e
            c.b.a.a.a.d r0 = r0.f288c
            java.util.Date r0 = r0.f281d
            java.util.Date r2 = f267k
            boolean r0 = r0.after(r2)
            if (r0 == 0) goto L_0x0024
            return r1
        L_0x0024:
            c.b.a.a.a.e r0 = r5.f298e
            c.b.a.a.a.d r0 = r0.f288c
            java.lang.String r0 = r0.f278a
            r2 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0038
            goto L_0x005c
        L_0x0038:
            c.b.a.a.a.e r0 = r5.f298e
            c.b.a.a.a.d r0 = r0.f288c
            java.lang.String r0 = r0.f278a
            r3 = 46
            int r0 = r0.indexOf(r3)
            if (r0 > 0) goto L_0x0047
            return r2
        L_0x0047:
            c.b.a.a.a.e r5 = r5.f298e
            c.b.a.a.a.d r5 = r5.f288c
            java.lang.String r5 = r5.f278a
            java.lang.String r5 = r5.substring(r2, r0)
            java.lang.String r0 = r4.f274h
            int r5 = r5.compareTo(r0)
            if (r5 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002c.p006b.p007a.p008a.p009a.C0028c.m156m(c.b.a.a.a.h):boolean");
    }

    /* renamed from: o */
    private String m157o(JSONObject jSONObject) {
        String q = m159q();
        return (TextUtils.isEmpty(q) || !q.startsWith("subs")) ? (jSONObject == null || !jSONObject.has("autoRenewing")) ? "inapp" : "subs" : "subs";
    }

    /* renamed from: p */
    private static Intent m158p() {
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        return intent;
    }

    /* renamed from: q */
    private String m159q() {
        return mo56e(mo54c() + ".purchase.last.v2_6", (String) null);
    }

    @Nullable
    /* renamed from: s */
    private C0038h m160s(String str, C0027b bVar) {
        C0034e k = bVar.mo60k(str);
        if (k == null || TextUtils.isEmpty(k.f286a)) {
            return null;
        }
        return new C0038h(k);
    }

    /* renamed from: w */
    public static boolean m161w(Context context) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(m158p(), 0);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m162y() {
        return mo55d(mo54c() + ".products.restored.v2_6", false);
    }

    /* renamed from: A */
    public boolean mo65A(String str) {
        return this.f272f.mo61n(str);
    }

    /* renamed from: B */
    public boolean mo66B() {
        return m144C("inapp", this.f271e) && m144C("subs", this.f272f);
    }

    /* renamed from: D */
    public boolean mo67D(Activity activity, String str) {
        return m145E(activity, (List<String>) null, str, "inapp", (String) null);
    }

    /* renamed from: G */
    public void mo68G() {
        if (mo74x() && this.f275i != null) {
            try {
                mo53a().unbindService(this.f275i);
            } catch (Exception e) {
                Log.e("iabv3", "Error in release", e);
            }
            this.f268b = null;
        }
    }

    /* renamed from: n */
    public boolean mo69n(String str) {
        if (!mo74x()) {
            return false;
        }
        try {
            C0038h s = m160s(str, this.f271e);
            if (s != null && !TextUtils.isEmpty(s.f298e.f288c.f284g)) {
                int a = this.f268b.mo37a(3, this.f269c, s.f298e.f288c.f284g);
                if (a == 0) {
                    this.f271e.mo63r(str);
                    Log.d("iabv3", "Successfully consumed " + str + " purchase.");
                    return true;
                }
                m147H(a, (Throwable) null);
                Log.e("iabv3", String.format("Failed to consume %s: %d", new Object[]{str, Integer.valueOf(a)}));
            }
        } catch (Exception e) {
            Log.e("iabv3", "Error in consumePurchase", e);
            m147H(111, e);
        }
        return false;
    }

    @Nullable
    /* renamed from: r */
    public C0038h mo70r(String str) {
        return m160s(str, this.f271e);
    }

    @Nullable
    /* renamed from: t */
    public C0038h mo71t(String str) {
        return m160s(str, this.f272f);
    }

    /* renamed from: u */
    public boolean mo72u(int i, int i2, Intent intent) {
        if (i != 32459) {
            return false;
        }
        if (intent == null) {
            Log.e("iabv3", "handleActivityResult: data is null!");
            return false;
        }
        int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
        Log.d("iabv3", String.format("resultCode = %d, responseCode = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(intExtra)}));
        if (i2 == -1 && intExtra == 0) {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            try {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String string = jSONObject.getString("productId");
                if (m150K(string, stringExtra, stringExtra2)) {
                    (m157o(jSONObject).equals("subs") ? this.f272f : this.f271e).mo62p(string, stringExtra, stringExtra2);
                    C0031c cVar = this.f273g;
                    if (cVar != null) {
                        cVar.mo46d(string, new C0038h(new C0034e(stringExtra, stringExtra2)));
                    }
                } else {
                    Log.e("iabv3", "Public key signature doesn't match!");
                    m147H(102, (Throwable) null);
                }
            } catch (Exception e) {
                Log.e("iabv3", "Error in handleActivityResult", e);
                m147H(110, e);
            }
            m148I((String) null);
        } else {
            m147H(intExtra, (Throwable) null);
        }
        return true;
    }

    /* renamed from: v */
    public void mo73v() {
        m155l();
    }

    /* renamed from: x */
    public boolean mo74x() {
        return this.f268b != null;
    }

    /* renamed from: z */
    public boolean mo75z(String str) {
        return this.f271e.mo61n(str);
    }
}
