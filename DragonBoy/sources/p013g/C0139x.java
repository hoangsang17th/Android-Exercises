package p013g;

import p011e.C0055d;
import p011e.C0057d1;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0170f;
import p020k.C0177m;

/* renamed from: g.x */
public class C0139x extends C0122i {

    /* renamed from: d */
    public String[] f2342d;

    /* renamed from: e */
    public boolean f2343e;

    /* renamed from: f */
    int f2344f;

    /* renamed from: g */
    private int f2345g = 35;

    public C0139x() {
        int i = C0145a.f2614V;
        if (i <= 176) {
            this.f2345g = 10;
        }
        if (i > 320) {
            this.f2345g = 80;
        }
    }

    /* renamed from: a */
    public void mo484a(C0159f fVar) {
        int i = 0;
        fVar.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        if (!C0170f.f2805J) {
            int i2 = C0145a.f2616W;
            int i3 = this.f2344f;
            int i4 = (i2 - i3) - 38;
            int i5 = C0145a.f2614V;
            int i6 = this.f2345g;
            C0145a.f2642l0.mo144d(i6, i4, i5 - (i6 * 2), i3, fVar);
            int length = (i4 + ((this.f2344f - (this.f2342d.length * C0177m.f2930G.mo913e())) / 2)) - 2;
            if (this.f2343e) {
                length += 8;
                C0145a.m1343P(C0145a.f2621a0, length - 12, fVar);
            }
            while (true) {
                String[] strArr = this.f2342d;
                if (i < strArr.length) {
                    C0177m.f2951s.mo909a(fVar, strArr[i], C0145a.f2621a0, length, 2);
                    i++;
                    length += C0177m.f2930G.mo913e();
                } else {
                    super.mo484a(fVar);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo485b() {
        super.mo485b();
    }

    /* renamed from: c */
    public void mo602c() {
        mo604e(C0057d1.f724s0, (C0055d) null, (C0055d) null, (C0055d) null);
        C0145a.f2637i0 = this;
    }

    /* renamed from: d */
    public void mo603d(String str) {
        String[] h = C0177m.f2930G.mo916h(str, C0145a.f2614V - ((this.f2345g * 2) + 20));
        this.f2342d = h;
        this.f2344f = 80;
        if (h.length >= 5) {
            this.f2344f = (h.length * C0177m.f2930G.mo913e()) + 20;
        }
    }

    /* renamed from: e */
    public void mo604e(String str, C0055d dVar, C0055d dVar2, C0055d dVar3) {
        String[] h = C0177m.f2930G.mo916h(str, C0145a.f2614V - ((this.f2345g * 2) + 20));
        this.f2342d = h;
        this.f1808a = dVar;
        this.f1809b = dVar2;
        this.f1810c = dVar3;
        this.f2344f = 80;
        if (h.length >= 5) {
            this.f2344f = (h.length * C0177m.f2930G.mo913e()) + 20;
        }
        if (C0145a.f2659x) {
            if (dVar != null) {
                C0055d dVar4 = this.f1808a;
                dVar4.f407h = ((C0145a.f2614V / 2) - 68) - 5;
                dVar4.f408i = C0145a.f2616W - 50;
            }
            if (dVar3 != null) {
                C0055d dVar5 = this.f1810c;
                dVar5.f407h = (C0145a.f2614V / 2) + 5;
                dVar5.f408i = C0145a.f2616W - 50;
            }
            if (dVar2 != null) {
                C0055d dVar6 = this.f1809b;
                dVar6.f407h = (C0145a.f2614V / 2) - 35;
                dVar6.f408i = C0145a.f2616W - 50;
            }
        }
        this.f2343e = false;
    }

    /* renamed from: f */
    public void mo605f() {
        C0145a.f2637i0 = this;
    }
}
