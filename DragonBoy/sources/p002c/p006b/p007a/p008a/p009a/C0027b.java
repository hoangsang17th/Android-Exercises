package p002c.p006b.p007a.p008a.p009a;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: c.b.a.a.a.b */
class C0027b extends C0026a {

    /* renamed from: b */
    private HashMap<String, C0034e> f263b = new HashMap<>();

    /* renamed from: c */
    private String f264c;

    /* renamed from: d */
    private String f265d;

    C0027b(Context context, String str) {
        super(context);
        this.f264c = str;
        m137o();
    }

    /* renamed from: i */
    private void m133i() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f263b.keySet()) {
            C0034e eVar = this.f263b.get(next);
            arrayList.add(next + ">>>>>" + eVar.f286a + ">>>>>" + eVar.f287b);
        }
        mo58g(m135l(), TextUtils.join("#####", arrayList));
        this.f265d = Long.toString(new Date().getTime());
        mo58g(m136m(), this.f265d);
    }

    /* renamed from: j */
    private String m134j() {
        return mo56e(m136m(), "0");
    }

    /* renamed from: l */
    private String m135l() {
        return mo54c() + this.f264c;
    }

    /* renamed from: m */
    private String m136m() {
        return m135l() + ".version";
    }

    /* renamed from: o */
    private void m137o() {
        for (String str : mo56e(m135l(), "").split(Pattern.quote("#####"))) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(Pattern.quote(">>>>>"));
                if (split.length > 2) {
                    this.f263b.put(split[0], new C0034e(split[1], split[2]));
                } else if (split.length > 1) {
                    this.f263b.put(split[0], new C0034e(split[1], (String) null));
                }
            }
        }
        this.f265d = m134j();
    }

    /* renamed from: q */
    private void m138q() {
        if (!this.f265d.equalsIgnoreCase(m134j())) {
            this.f263b.clear();
            m137o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo59h() {
        m138q();
        this.f263b.clear();
        m133i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0034e mo60k(String str) {
        m138q();
        if (this.f263b.containsKey(str)) {
            return this.f263b.get(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo61n(String str) {
        m138q();
        return this.f263b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo62p(String str, String str2, String str3) {
        m138q();
        if (!this.f263b.containsKey(str)) {
            this.f263b.put(str, new C0034e(str2, str3));
            m133i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo63r(String str) {
        m138q();
        if (this.f263b.containsKey(str)) {
            this.f263b.remove(str);
            m133i();
        }
    }

    public String toString() {
        return TextUtils.join(", ", this.f263b.keySet());
    }
}
