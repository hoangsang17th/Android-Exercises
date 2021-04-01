package p011e;

import p012f.C0104c;
import p013g.C0126k;

/* renamed from: e.q */
public class C0082q {

    /* renamed from: a */
    public int f1006a;

    /* renamed from: b */
    public byte f1007b;

    /* renamed from: c */
    public C0084r f1008c;

    public C0082q() {
    }

    public C0082q(int i, int i2) {
        this.f1006a = i2;
        this.f1008c = C0126k.m893c0().f2117e1[i];
    }

    /* renamed from: a */
    public String mo183a() {
        String str = this.f1008c.f1015b;
        return C0104c.m364i(str, "#", this.f1006a + "");
    }

    /* renamed from: b */
    public String mo184b() {
        return C0104c.m364i(this.f1008c.f1015b, "$", "");
    }
}
