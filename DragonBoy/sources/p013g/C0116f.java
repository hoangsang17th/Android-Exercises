package p013g;

import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p012f.C0105d;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0167c;
import p020k.C0176l;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.f */
public class C0116f extends C0178n implements C0072l {

    /* renamed from: s */
    public static C0116f f1664s;

    /* renamed from: i */
    public C0176l[] f1665i;

    /* renamed from: j */
    private int f1666j;

    /* renamed from: k */
    private int f1667k;

    /* renamed from: l */
    private int f1668l;

    /* renamed from: m */
    private int f1669m;

    /* renamed from: n */
    String[] f1670n;

    /* renamed from: o */
    String f1671o;

    /* renamed from: p */
    public C0167c f1672p;

    /* renamed from: q */
    int f1673q;

    /* renamed from: r */
    int f1674r;

    /* renamed from: k */
    public static C0116f m778k() {
        if (f1664s == null) {
            f1664s = new C0116f();
        }
        return f1664s;
    }

    /* renamed from: l */
    private void m779l(String str) {
        this.f1671o = str;
        int i = C0145a.f2614V - 20;
        this.f1668l = i;
        if (i > 320) {
            this.f1668l = 320;
        }
        C0111c0.m584k("title= " + str);
        String[] h = C0177m.f2951s.mo916h(str, this.f1668l + -20);
        this.f1670n = h;
        this.f1666j = (C0145a.f2614V - this.f1668l) / 2;
        C0176l[] lVarArr = new C0176l[this.f1674r];
        this.f1665i = lVarArr;
        int length = (lVarArr.length * 35) + ((h.length - 1) * 20) + 40;
        this.f1669m = length;
        this.f1667k = ((C0145a.f2616W - length) - 40) - ((h.length - 1) * 20);
        int i2 = 0;
        while (true) {
            C0176l[] lVarArr2 = this.f1665i;
            if (i2 >= lVarArr2.length) {
                break;
            }
            lVarArr2[i2] = new C0176l();
            C0176l[] lVarArr3 = this.f1665i;
            lVarArr3[i2].f2905g = "";
            lVarArr3[i2].f2899a = this.f1666j + 10;
            lVarArr3[i2].f2900b = this.f1667k + 35 + ((this.f1670n.length - 1) * 20) + (i2 * 35);
            lVarArr3[i2].f2901c = this.f1668l - 20;
            lVarArr3[i2].f2902d = C0178n.f2966d + 2;
            boolean z = C0145a.f2659x;
            if (z) {
                lVarArr3[0].f2903e = false;
            } else {
                lVarArr3[0].f2903e = true;
            }
            if (!z) {
                this.f2973c = lVarArr3[0].f2922x;
            }
            i2++;
        }
        this.f2971a = new C0055d(C0057d1.f606b1, (C0072l) this, 1, (Object) null);
        C0055d dVar = new C0055d(C0057d1.f669k1, (C0072l) this, 2, (Object) null);
        this.f2972b = dVar;
        if (C0145a.f2659x) {
            int i3 = C0145a.f2614V;
            dVar.f407h = (i3 / 2) + 18;
            C0055d dVar2 = this.f2971a;
            dVar2.f407h = (i3 / 2) - 85;
            int i4 = this.f1667k + this.f1669m + 5;
            dVar2.f408i = i4;
            dVar.f408i = i4;
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        C0126k.m893c0().mo341d(fVar);
        C0067i0.m243g(fVar, this.f1666j, this.f1667k, this.f1668l, this.f1669m, -1, true);
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f1670n;
            if (i2 >= strArr.length) {
                break;
            }
            C0177m.f2952t.mo909a(fVar, strArr[i2], C0145a.f2614V / 2, this.f1667k + 15 + (i2 * 20), 2);
            i2++;
        }
        while (true) {
            C0176l[] lVarArr = this.f1665i;
            if (i < lVarArr.length) {
                lVarArr[i].mo901l(fVar);
                i++;
            } else {
                super.mo341d(fVar);
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1) {
            C0126k.f1970h1.mo342f();
            mo470j();
        }
        if (i == 2) {
            int i2 = C0161h.f2758f;
            int i3 = 0;
            if ((i2 != 5 || this.f1665i.length != 1) && (i2 != 3 || this.f1665i.length != 1)) {
                while (true) {
                    C0176l[] lVarArr = this.f1665i;
                    if (i3 < lVarArr.length) {
                        if (lVarArr[i3].mo899f() == null || this.f1665i[i3].mo899f().equals("")) {
                            break;
                        }
                        i3++;
                    } else {
                        C0105d.m365M().mo234M0(this.f1665i);
                        break;
                    }
                }
                C0126k.f1970h1.mo342f();
                return;
            } else if (this.f1672p.f2789a.mo899f() != null && !this.f1672p.f2789a.mo899f().equals("")) {
                this.f1665i[0].mo906r(this.f1672p.f2789a.mo899f());
                C0105d.m365M().mo234M0(this.f1665i);
                C0126k.f1970h1.mo342f();
                return;
            }
            C0145a.m1349X(C0057d1.f544R5);
        }
    }

    /* renamed from: f */
    public void mo342f() {
        int i = C0161h.f2758f;
        if ((i == 5 && this.f1665i.length == 1) || (i == 3 && this.f1665i.length == 1)) {
            C0167c cVar = new C0167c();
            this.f1672p = cVar;
            C0167c.f2788n = this.f1671o;
            C0176l lVar = cVar.f2789a;
            lVar.f2905g = this.f1665i[0].f2906h;
            cVar.f2800l = "";
            cVar.f2790b = true;
            lVar.mo903n(0);
            if (C0145a.f2659x) {
                this.f1672p.f2789a.mo898d();
                return;
            }
            return;
        }
        this.f1673q = 0;
        super.mo342f();
    }

    /* renamed from: h */
    public void mo343h() {
        C0126k.m893c0().mo343h();
        int i = 0;
        while (true) {
            C0176l[] lVarArr = this.f1665i;
            if (i < lVarArr.length) {
                lVarArr[i].mo908t();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public void mo344i() {
        boolean[] zArr = C0145a.f2574B;
        if (zArr[2]) {
            int i = this.f1673q - 1;
            this.f1673q = i;
            if (i < 0) {
                this.f1673q = this.f1665i.length - 1;
            }
        } else if (zArr[8]) {
            int i2 = this.f1673q + 1;
            this.f1673q = i2;
            if (i2 > this.f1665i.length - 1) {
                this.f1673q = 0;
            }
        }
        if (zArr[2] || zArr[8]) {
            C0145a.m1359n();
            int i3 = 0;
            while (true) {
                C0176l[] lVarArr = this.f1665i;
                if (i3 < lVarArr.length) {
                    if (this.f1673q == i3) {
                        lVarArr[i3].f2903e = true;
                        if (!C0145a.f2659x) {
                            this.f2973c = lVarArr[i3].f2922x;
                        }
                    } else {
                        lVarArr[i3].f2903e = false;
                    }
                    if (C0145a.f2582F && C0145a.m1336F(lVarArr[i3].f2899a, lVarArr[i3].f2900b, lVarArr[i3].f2901c, lVarArr[i3].f2902d)) {
                        this.f1673q = i3;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        }
        super.mo344i();
        C0145a.m1359n();
    }

    /* renamed from: j */
    public void mo470j() {
        f1664s = null;
    }

    /* renamed from: m */
    public void mo471m(int i, String str) {
        this.f1674r = i;
        m779l(str);
        mo342f();
    }
}
