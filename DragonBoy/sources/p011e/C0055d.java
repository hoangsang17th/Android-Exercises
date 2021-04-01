package p011e;

import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: e.d */
public class C0055d {

    /* renamed from: r */
    public static C0143b f394r = C0161h.m1494l("/mainImage/btn0left.png");

    /* renamed from: s */
    public static C0143b f395s = C0161h.m1494l("/mainImage/btn0mid.png");

    /* renamed from: t */
    public static C0143b f396t = C0161h.m1494l("/mainImage/btn0right.png");

    /* renamed from: u */
    public static C0143b f397u = C0161h.m1494l("/mainImage/btn1left.png");

    /* renamed from: v */
    public static C0143b f398v = C0161h.m1494l("/mainImage/btn1mid.png");

    /* renamed from: w */
    public static C0143b f399w = C0161h.m1494l("/mainImage/btn1right.png");

    /* renamed from: a */
    public String f400a;

    /* renamed from: b */
    public String[] f401b;

    /* renamed from: c */
    public C0072l f402c;

    /* renamed from: d */
    public int f403d;

    /* renamed from: e */
    public boolean f404e = true;

    /* renamed from: f */
    public C0143b f405f;

    /* renamed from: g */
    public C0143b f406g;

    /* renamed from: h */
    public int f407h = 0;

    /* renamed from: i */
    public int f408i = 0;

    /* renamed from: j */
    public int f409j = C0178n.f2967e;

    /* renamed from: k */
    public int f410k = C0178n.f2968f;

    /* renamed from: l */
    public int f411l;

    /* renamed from: m */
    public boolean f412m = false;

    /* renamed from: n */
    public Object f413n;

    /* renamed from: o */
    public int f414o;

    /* renamed from: p */
    public String f415p = "";

    /* renamed from: q */
    public boolean f416q;

    public C0055d(String str, int i) {
        this.f400a = str;
        this.f403d = i;
    }

    public C0055d(String str, int i, int i2, int i3) {
        this.f400a = str;
        this.f403d = i;
        this.f407h = i2;
        this.f408i = i3;
    }

    public C0055d(String str, int i, Object obj) {
        this.f400a = str;
        this.f403d = i;
        this.f413n = obj;
    }

    public C0055d(String str, C0072l lVar, int i, Object obj) {
        this.f400a = str;
        this.f403d = i;
        this.f402c = lVar;
        this.f413n = obj;
    }

    public C0055d(String str, C0072l lVar, int i, Object obj, int i2, int i3) {
        this.f400a = str;
        this.f403d = i;
        this.f402c = lVar;
        this.f413n = obj;
        this.f407h = i2;
        this.f408i = i3;
    }

    /* renamed from: c */
    public static void m224c(C0143b bVar, C0143b bVar2, C0143b bVar3, int i, int i2, int i3, C0159f fVar) {
        int i4 = i;
        int i5 = i2;
        C0159f fVar2 = fVar;
        for (int i6 = 10; i6 <= i3 - 20; i6 += 10) {
            fVar2.mo776e(bVar2, i4 + i6, i5, 0);
        }
        C0143b bVar4 = bVar2;
        int i7 = i3 % 10;
        if (i7 > 0) {
            fVar.mo779h(bVar2, 0, 0, i7, 24, 0, ((i4 + i3) - 10) - i7, i2, 0);
        }
        C0143b bVar5 = bVar;
        fVar2.mo776e(bVar, i4, i5, 0);
        fVar2.mo776e(bVar3, (i4 + i3) - 10, i5, 0);
    }

    /* renamed from: a */
    public boolean mo137a() {
        this.f412m = false;
        if (C0145a.m1336F(this.f407h, this.f408i, this.f409j, this.f410k)) {
            if (C0145a.f2578D) {
                this.f412m = true;
            }
            return C0145a.f2582F && C0145a.f2580E;
        }
    }

    /* renamed from: b */
    public void mo138b(C0159f fVar) {
        int i;
        int i2;
        int i3;
        C0143b bVar;
        C0143b bVar2;
        C0143b bVar3;
        C0143b bVar4;
        C0143b bVar5;
        C0143b bVar6;
        int i4;
        int i5;
        C0143b bVar7 = this.f405f;
        if (bVar7 != null) {
            int i6 = 0;
            fVar.mo776e(bVar7, this.f407h, this.f408i, 0);
            if (this.f412m) {
                C0143b bVar8 = this.f406g;
                if (bVar8 != null) {
                    i5 = this.f407h;
                } else if (this.f416q) {
                    bVar8 = C0078o.f962w;
                    i5 = this.f407h + 8;
                    i4 = this.f408i + 8;
                    i6 = 3;
                    fVar.mo776e(bVar8, i5, i4, i6);
                } else {
                    bVar8 = C0078o.f962w;
                    i5 = this.f407h - (this.f405f.equals(C0126k.f2007o3) ? 10 : 0);
                }
                i4 = this.f408i;
                fVar.mo776e(bVar8, i5, i4, i6);
            }
            String str = this.f400a;
            if (str != "" && str != null) {
                (!this.f412m ? C0177m.f2951s : C0177m.f2952t).mo909a(fVar, str, (C0159f.m1451u(this.f405f) / 2) + this.f407h, (this.f408i + (C0159f.m1450t(this.f405f) / 2)) - 5, 2);
                return;
            }
            return;
        }
        if (this.f400a != "") {
            if (this.f414o == 1) {
                if (!this.f412m) {
                    bVar3 = f394r;
                    bVar2 = f395s;
                    bVar = f396t;
                } else {
                    bVar3 = f397u;
                    bVar2 = f398v;
                    bVar = f399w;
                }
                i3 = this.f407h;
                i2 = this.f408i;
                i = 160;
            } else {
                if (!this.f412m) {
                    bVar4 = f394r;
                    bVar5 = f395s;
                    bVar6 = f396t;
                } else {
                    bVar4 = f397u;
                    bVar5 = f398v;
                    bVar6 = f399w;
                }
                i3 = this.f407h;
                i2 = this.f408i;
                i = 76;
            }
            m224c(bVar3, bVar2, bVar, i3, i2, i, fVar);
        }
        (!this.f412m ? C0177m.f2951s : C0177m.f2952t).mo909a(fVar, this.f400a, this.f414o == 1 ? this.f407h + this.f411l : this.f407h + 38, this.f408i + 7, 2);
    }

    /* renamed from: d */
    public void mo139d() {
        String str;
        C0145a.m1357l();
        if (this.f404e && (((str = this.f400a) != null && !str.equals("") && !this.f400a.equals(C0057d1.f712q2)) || this.f405f != null)) {
            C0175k.m1563p().mo875e();
        }
        int i = this.f403d;
        if (i > 0) {
            C0072l lVar = this.f402c;
            if (lVar != null) {
                lVar.mo3e(i, this.f413n);
            } else {
                C0126k.m893c0().mo530m(this.f403d, this.f413n);
            }
        }
    }

    /* renamed from: e */
    public void mo140e() {
        this.f414o = 1;
        this.f409j = 160;
        this.f411l = 80;
    }
}
