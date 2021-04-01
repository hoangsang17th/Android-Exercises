package p011e;

import p013g.C0111c0;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0176l;
import p020k.C0177m;

/* renamed from: e.j0 */
public class C0069j0 implements C0072l {

    /* renamed from: a */
    public C0055d f844a;

    /* renamed from: b */
    public C0055d f845b;

    /* renamed from: c */
    public String[] f846c;

    /* renamed from: d */
    private int f847d;

    /* renamed from: e */
    private int f848e;

    /* renamed from: f */
    private int f849f = 120;

    /* renamed from: g */
    private int f850g;

    /* renamed from: h */
    private int f851h;

    /* renamed from: i */
    long f852i;

    /* renamed from: j */
    long f853j;

    /* renamed from: a */
    public void mo154a(C0159f fVar) {
        String str;
        StringBuilder sb;
        C0177m mVar;
        C0067i0.m243g(fVar, this.f847d, this.f848e, this.f849f, (!C0145a.f2659x ? 10 : 0) + this.f850g, 16777215, false);
        String[] strArr = this.f846c;
        if (strArr != null) {
            String str2 = strArr[0];
            int i = this.f847d + 5;
            int i2 = this.f848e;
            int i3 = this.f850g;
            C0048a1.m211a(fVar, str2, i, (i2 + (i3 / 2)) - (C0145a.f2659x ? 4 : 6), this.f849f - 10, i3, C0177m.f2956x);
            if (C0145a.f2659x) {
                C0159f fVar2 = fVar;
                this.f844a.mo138b(fVar2);
                C0055d dVar = this.f844a;
                C0177m.f2924A.mo910b(fVar2, this.f851h + "", dVar.f407h + (dVar.f409j / 2), dVar.f408i + dVar.f410k + 5, 2, C0177m.f2925B);
                return;
            }
            C0159f fVar3 = fVar;
            if (C0176l.f2892C) {
                mVar = C0177m.f2947o;
                sb = new StringBuilder();
                str = C0057d1.f754w2;
            } else {
                mVar = C0177m.f2947o;
                sb = new StringBuilder();
                str = C0057d1.f761x2;
            }
            sb.append(str);
            sb.append(this.f851h);
            sb.append(")");
            mVar.mo909a(fVar, sb.toString(), (this.f849f / 2) + this.f847d, this.f850g + this.f848e, 2);
        }
    }

    /* renamed from: b */
    public void mo155b(String str, C0055d dVar, C0055d dVar2) {
        this.f846c = new String[]{str};
        this.f850g = 29;
        this.f844a = dVar;
        this.f845b = dVar2;
        C0143b bVar = C0126k.f1998m4;
        dVar2.f405f = bVar;
        dVar.f405f = bVar;
        C0143b bVar2 = C0126k.f2003n4;
        dVar2.f406g = bVar2;
        dVar.f406g = bVar2;
        dVar.f409j = C0159f.m1451u(bVar);
        this.f845b.f409j = C0159f.m1451u(dVar.f405f);
        this.f844a.f410k = C0159f.m1450t(dVar.f405f);
        this.f845b.f410k = C0159f.m1450t(dVar.f405f);
        this.f852i = System.currentTimeMillis();
        int length = this.f846c[0].length() / 3;
        this.f851h = length;
        if (length < 15) {
            this.f851h = 15;
        }
        C0048a1.m212b();
    }

    /* renamed from: c */
    public void mo156c() {
        if (this.f846c != null) {
            int i = C0145a.f2614V;
            int i2 = this.f849f;
            this.f847d = (i - 5) - i2;
            this.f848e = 45;
            if (i - 50 > i2 + 155) {
                this.f847d = (i - 55) - i2;
                this.f848e = 5;
            }
            C0055d dVar = this.f844a;
            dVar.f407h = this.f847d - 35;
            dVar.f408i = this.f848e;
            this.f853j = System.currentTimeMillis();
            C0111c0.m584k("curr - last= " + (this.f853j - this.f852i));
            if (this.f853j - this.f852i >= 1000) {
                this.f852i = System.currentTimeMillis();
                this.f851h--;
            }
            if (this.f851h == 0) {
                C0126k.m893c0().f2081M0 = null;
            }
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
    }
}
