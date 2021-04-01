package p011e;

import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0126k;
import p013g.C0131p;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0167c;
import p020k.C0173i;
import p020k.C0176l;
import p020k.C0177m;

/* renamed from: e.m */
public class C0074m implements C0072l {

    /* renamed from: p */
    public static C0143b f895p = C0161h.m1494l("/mainImage/myTexture2dgocnhon.png");

    /* renamed from: a */
    public C0173i f896a = new C0173i("infoWaitToShow");

    /* renamed from: b */
    public C0131p f897b;

    /* renamed from: c */
    public int f898c = 100;

    /* renamed from: d */
    public int f899d;

    /* renamed from: e */
    public String[] f900e;

    /* renamed from: f */
    public int f901f;

    /* renamed from: g */
    public int f902g;

    /* renamed from: h */
    public int f903h;

    /* renamed from: i */
    public boolean f904i = false;

    /* renamed from: j */
    public int f905j;

    /* renamed from: k */
    public int f906k;

    /* renamed from: l */
    public int f907l;

    /* renamed from: m */
    public int f908m;

    /* renamed from: n */
    public int f909n;

    /* renamed from: o */
    public int f910o;

    /* renamed from: a */
    public void mo162a(String str, int i, C0114e eVar, boolean z) {
        this.f906k = i;
        int i2 = C0145a.f2614V;
        if (this.f896a.size() > 10) {
            this.f896a.removeElementAt(0);
        }
        if (this.f896a.size() <= 0 || !str.equals(((C0131p) this.f896a.lastElement()).f2166a)) {
            C0131p pVar = new C0131p(str);
            if (this.f906k == 0) {
                pVar.f2167b = str.length();
            }
            if (pVar.f2167b < 70) {
                pVar.f2167b = 70;
            }
            int i3 = this.f906k;
            if (i3 == 1) {
                pVar.f2167b = 10000000;
            }
            if (i3 == 3) {
                pVar.f2167b = 300;
                pVar.f2172g = System.currentTimeMillis();
                int length = str.length() / 4;
                pVar.f2171f = length;
                if (length < 15) {
                    pVar.f2171f = 15;
                }
            }
            if (eVar != null) {
                pVar.f2168c = eVar;
                pVar.f2169d = z;
                C0145a.f2629e0.mo635c(pVar);
                if (C0145a.f2659x && C0145a.f2629e0.f2523s1) {
                    C0126k.f1866H3.f2191r = new C0055d(C0057d1.f655i1, (C0072l) this, 1000, (Object) pVar);
                }
            }
            if ((eVar != null && C0145a.f2629e0.f2523s1) || eVar == null) {
                this.f896a.addElement(pVar);
            }
            if (this.f896a.size() == 1) {
                this.f897b = (C0131p) this.f896a.firstElement();
                mo163b();
            }
            if (C0145a.f2659x && eVar != null && C0145a.f2629e0.f2523s1) {
                int i4 = C0145a.f2614V - 50;
                int i5 = this.f909n;
                if (i4 > i5 + 155) {
                    C0126k.f1866H3.f2191r.f407h = (C0145a.f2614V - i5) - 50;
                    C0126k.f1866H3.f2191r.f408i = 35;
                    return;
                }
                return;
            }
            return;
        }
        C0111c0.m584k("return");
    }

    /* renamed from: b */
    public void mo163b() {
        this.f898c = 100;
        if (C0145a.f2614V == 128) {
            this.f898c = 128;
        }
        C0131p pVar = this.f897b;
        int i = 0;
        if (pVar.f2168c != null) {
            this.f900e = new String[]{pVar.f2166a};
        } else {
            this.f900e = C0177m.f2926C.mo916h(pVar.f2166a, this.f898c - 10);
        }
        this.f899d = 7;
        int i2 = this.f901f;
        int i3 = this.f898c;
        this.f907l = (i2 - (i3 / 2)) - 1;
        String[] strArr = this.f900e;
        this.f908m = ((((this.f902g - this.f903h) - 15) + 7) - (strArr.length * 12)) - 15;
        int i4 = i3 + 2;
        C0114e eVar = this.f897b.f2168c;
        this.f909n = i4 + (eVar != null ? 30 : 0);
        int length = ((strArr.length + 1) * 12) + 1;
        if (eVar != null) {
            i = 5;
        }
        this.f910o = length + i;
    }

    /* renamed from: c */
    public void mo164c() {
        this.f900e = null;
        this.f896a.removeAllElements();
    }

    /* renamed from: d */
    public void mo165d(C0159f fVar, int i, int i2, int i3) {
        int i4;
        C0177m mVar;
        int i5;
        int i6;
        String str;
        C0177m mVar2;
        int i7;
        int i8;
        String str2;
        C0177m mVar3;
        int i9;
        int i10;
        int i11;
        String str3;
        C0177m mVar4;
        C0159f fVar2 = fVar;
        int i12 = i3;
        if (this.f896a.size() != 0) {
            fVar.mo773E(i, i2);
            String[] strArr = this.f900e;
            if (!(strArr == null || strArr.length == 0 || this.f906k == 1)) {
                if (this.f904i) {
                    this.f901f -= C0126k.f2028t1;
                    int i13 = this.f902g - C0126k.f2032u1;
                    this.f902g = i13;
                    this.f902g = i13 + 35;
                }
                int i14 = C0159f.f2750b == 1 ? 0 : 10;
                if (this.f897b.f2168c == null) {
                    C0067i0.m243g(fVar, this.f907l, this.f908m, this.f909n, this.f910o, 16777215, false);
                } else {
                    C0161h.m1500r(fVar2, this.f907l - 23, this.f908m - (i14 / 2), this.f909n + 15, this.f910o + (C0145a.f2659x ? 0 : 14) + i14);
                }
                if (this.f897b.f2168c == null) {
                    i4 = 3;
                    fVar.mo779h(f895p, 0, 0, 9, 8, i12 == 1 ? 0 : 2, (i12 == 1 ? -15 : 20) + (this.f901f - 3), ((this.f902g - this.f903h) - 20) + this.f899d + 2, 17);
                } else {
                    i4 = 3;
                }
                int i15 = -1;
                int i16 = 0;
                while (true) {
                    String[] strArr2 = this.f900e;
                    if (i16 < strArr2.length) {
                        C0177m mVar5 = C0177m.f2956x;
                        String str4 = strArr2[i16];
                        if (strArr2[i16].startsWith("|")) {
                            String[] q = C0111c0.m590q(this.f900e[i16], "|", 0);
                            if (q.length == i4) {
                                str4 = q[2];
                            }
                            if (q.length == 4) {
                                str4 = q[i4];
                                Integer.parseInt(q[2]);
                            }
                            i15 = Integer.parseInt(q[1]);
                        }
                        int i17 = i15;
                        String str5 = str4;
                        switch (i17) {
                            case -1:
                                mVar = C0177m.f2956x;
                                break;
                            case 0:
                                mVar = C0177m.f2951s;
                                break;
                            case 1:
                                mVar = C0177m.f2953u;
                                break;
                            case 2:
                                mVar = C0177m.f2947o;
                                break;
                            case 3:
                                mVar = C0177m.f2926C;
                                break;
                            case 4:
                                mVar = C0177m.f2928E;
                                break;
                            case 5:
                                mVar = C0177m.f2927D;
                                break;
                            case 7:
                                mVar = C0177m.f2946n;
                                break;
                            default:
                                mVar = mVar5;
                                break;
                        }
                        if (this.f897b.f2168c == null) {
                            mVar.mo909a(fVar, str5, this.f901f, (((((this.f902g - this.f903h) - 15) + this.f899d) + (i16 * 12)) - (this.f900e.length * 12)) - 9, 2);
                        } else {
                            if (C0159f.f2750b == 1) {
                                mVar2 = C0177m.f2941i;
                                str = this.f897b.f2171f + "";
                                i6 = (this.f907l + this.f909n) - 5;
                                i5 = this.f908m + 5;
                            } else {
                                mVar2 = C0177m.f2942j;
                                str = this.f897b.f2171f + "";
                                i6 = (this.f907l + this.f909n) - 5;
                                i5 = this.f908m - 3;
                            }
                            mVar2.mo909a(fVar, str, i6, i5, 1);
                            C0131p pVar = this.f897b;
                            if (pVar.f2171f != 0) {
                                pVar.f2168c.mo441n0(fVar2, this.f907l + 10, this.f908m + (this.f910o / 2), 0);
                                if (C0159f.f2750b == 1) {
                                    C0131p pVar2 = this.f897b;
                                    mVar3 = pVar2.f2169d ? C0177m.f2942j : C0177m.f2943k;
                                    str2 = pVar2.f2168c.f1511X;
                                    i8 = this.f907l + 12;
                                    i7 = this.f908m + 3;
                                } else {
                                    C0131p pVar3 = this.f897b;
                                    mVar3 = pVar3.f2169d ? C0177m.f2942j : C0177m.f2943k;
                                    str2 = pVar3.f2168c.f1511X;
                                    i8 = this.f907l + 12;
                                    i7 = this.f908m - 3;
                                }
                                mVar3.mo909a(fVar, str2, i8, i7, 0);
                                if (!C0145a.f2659x) {
                                    if (!C0176l.f2892C) {
                                        mVar4 = C0177m.f2944l;
                                        i11 = this.f907l + (this.f909n / 2) + 10;
                                        i10 = this.f908m + this.f910o;
                                        i9 = 2;
                                        str3 = "Nhấn # để chat";
                                    } else {
                                        mVar4 = C0177m.f2944l;
                                        i11 = this.f907l + (this.f909n / 2) + 10;
                                        i10 = this.f908m + this.f910o;
                                        i9 = 2;
                                        str3 = "Nhấn Y để chat";
                                    }
                                    mVar4.mo909a(fVar, str3, i11, i10, i9);
                                }
                                if (C0159f.f2750b == 1) {
                                    int i18 = this.f907l + 14;
                                    int i19 = this.f908m;
                                    int i20 = this.f910o;
                                    C0048a1.m211a(fVar, str5, i18, i19 + (i20 / 2) + 2, this.f909n - 16, i20, C0177m.f2945m);
                                } else {
                                    String[] h = C0177m.f2945m.mo916h(str5, 120);
                                    for (int i21 = 0; i21 < h.length; i21++) {
                                        C0177m.f2945m.mo909a(fVar, h[i21], this.f907l + 12, ((this.f908m + 8) + (i21 * 8)) - 3, 0);
                                    }
                                    C0145a.m1346T(fVar);
                                }
                            } else {
                                return;
                            }
                        }
                        i16++;
                        i15 = i17;
                    } else {
                        C0114e eVar = this.f897b.f2168c;
                    }
                }
            }
            fVar2.mo773E(-i, -i2);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1000) {
            C0167c.m1522b().mo825h(C0126k.m893c0(), C0057d1.f436C2);
        }
    }

    /* renamed from: f */
    public void mo166f() {
        if (this.f896a.size() != 0) {
            C0131p pVar = this.f897b;
            if (pVar.f2171f == 0) {
                int i = this.f905j + 1;
                this.f905j = i;
                if (i >= pVar.f2167b) {
                    this.f905j = 0;
                    this.f896a.removeElementAt(0);
                    if (this.f896a.size() != 0) {
                        this.f897b = (C0131p) this.f896a.firstElement();
                        mo163b();
                    }
                }
            }
        }
    }
}
