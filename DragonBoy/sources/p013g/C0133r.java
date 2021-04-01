package p013g;

import p001b.C0006b;
import p001b.C0016l;
import p011e.C0057d1;
import p011e.C0071k0;
import p011e.C0082q;
import p011e.C0098y;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0173i;
import p020k.C0177m;

/* renamed from: g.r */
public class C0133r {

    /* renamed from: a */
    public byte f2192a;

    /* renamed from: b */
    public byte f2193b;

    /* renamed from: c */
    public byte f2194c;

    /* renamed from: d */
    public byte f2195d;

    /* renamed from: e */
    public int f2196e;

    /* renamed from: f */
    public int f2197f;

    /* renamed from: g */
    public int f2198g;

    /* renamed from: h */
    public String f2199h;

    /* renamed from: i */
    public String f2200i;

    /* renamed from: j */
    public byte f2201j;

    /* renamed from: k */
    public byte f2202k;

    /* renamed from: l */
    public C0114e f2203l;

    /* renamed from: m */
    public C0137v f2204m;

    /* renamed from: n */
    public C0082q[] f2205n;

    /* renamed from: o */
    int[] f2206o = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

    /* renamed from: p */
    int f2207p = 0;

    /* renamed from: q */
    long f2208q;

    /* renamed from: r */
    public C0006b f2209r;

    /* renamed from: s */
    public C0173i f2210s = new C0173i("");

    /* renamed from: a */
    public static C0133r m1017a(C0173i iVar, int i) {
        if (iVar == null) {
            return null;
        }
        for (int i2 = 0; i2 < iVar.size(); i2++) {
            C0133r rVar = (C0133r) iVar.elementAt(i2);
            if (rVar != null && rVar.f2196e == i) {
                return rVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0114e m1018c(int i, int i2, int i3, int i4) {
        C0114e eVar = new C0114e();
        eVar.f1616r2 = i;
        eVar.f1626t2 = i2;
        eVar.f1621s2 = i3;
        eVar.f1631u2 = i4;
        return eVar;
    }

    /* renamed from: b */
    public void mo569b(byte b, byte b2) {
        this.f2193b = b;
        this.f2194c = b2;
    }

    /* renamed from: d */
    public void mo570d() {
        if (this.f2193b == this.f2194c && this.f2210s.size() == 0) {
            int n = C0111c0.m587n(1, 5);
            for (int i = 0; i < n; i++) {
                C0071k0 k0Var = new C0071k0();
                k0Var.f866a = C0111c0.m587n(5, 25);
                k0Var.f867b = C0111c0.m587n(5, 25);
                k0Var.f869d = C0111c0.m587n(0, 8) * i;
                k0Var.f870e = 0;
                k0Var.f868c = -1;
                this.f2210s.addElement(k0Var);
            }
        }
    }

    /* renamed from: e */
    public void mo571e(int i, int i2, int i3, byte b, byte b2, short s, String str, String str2, C0114e eVar, C0082q[] qVarArr) {
        this.f2196e = i;
        this.f2197f = i2;
        this.f2198g = i3;
        this.f2192a = b;
        this.f2195d = b2;
        if (s != -1) {
            C0137v vVar = new C0137v();
            this.f2204m = vVar;
            vVar.f2275G = s;
        }
        this.f2199h = str;
        this.f2200i = str2;
        this.f2203l = eVar;
        this.f2205n = qVarArr;
        mo574h();
    }

    /* renamed from: f */
    public void mo572f(byte b) {
        this.f2201j = b;
        mo574h();
    }

    /* renamed from: g */
    public void mo573g(byte b) {
        this.f2202k = b;
        mo574h();
    }

    /* renamed from: h */
    public void mo574h() {
        boolean z;
        StringBuilder sb;
        this.f2209r = new C0006b();
        String str = ("" + "\n|6|" + this.f2200i) + "\n--";
        if (this.f2205n != null) {
            int i = 0;
            while (true) {
                int i2 = 0;
                while (true) {
                    C0082q[] qVarArr = this.f2205n;
                    if (i2 < qVarArr.length) {
                        if (!qVarArr[i2].mo183a().equals("") && i == this.f2205n[i2].f1007b) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    break;
                }
                if (i == 0) {
                    sb.append(str);
                    sb.append("\n|6|2|--");
                    sb.append(C0057d1.f604b);
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\n|6|2|--");
                    sb.append(C0057d1.f597a);
                    sb.append(" Lv.");
                    sb.append(i);
                }
                sb.append("--");
                str = sb.toString();
                int i3 = 0;
                while (true) {
                    C0082q[] qVarArr2 = this.f2205n;
                    if (i3 >= qVarArr2.length) {
                        break;
                    }
                    String a = qVarArr2[i3].mo183a();
                    if (!a.equals("")) {
                        C0082q[] qVarArr3 = this.f2205n;
                        if (i == qVarArr3[i3].f1007b) {
                            byte b = this.f2201j;
                            String str2 = "2";
                            if (b != 0 && (qVarArr3[i3].f1007b == 0 || (this.f2202k != 0 && b >= qVarArr3[i3].f1007b))) {
                                str2 = "1";
                            }
                            str = str + "\n|" + str2 + "|1|" + a;
                        }
                    }
                    i3++;
                }
                if (z) {
                    i++;
                }
            }
        }
        mo577k(this.f2209r, str);
    }

    /* renamed from: i */
    public void mo575i(C0159f fVar, int i, int i2) {
        mo570d();
        int i3 = 0;
        while (i3 < this.f2210s.size()) {
            C0071k0 k0Var = (C0071k0) this.f2210s.elementAt(i3);
            if (k0Var != null) {
                int i4 = k0Var.f870e;
                int i5 = k0Var.f869d;
                if (i4 < i5) {
                    k0Var.f870e = i4 + 1;
                }
                if (k0Var.f870e >= i5) {
                    C0016l lVar = C0107a0.f1213x;
                    int i6 = lVar.f212c;
                    int i7 = (C0145a.f2600O / 3) % (i6 + 1);
                    k0Var.f868c = i7;
                    if (i7 >= i6) {
                        this.f2210s.removeElementAt(i3);
                        i3--;
                    } else {
                        lVar.mo35a(i7, i + k0Var.f866a, i2 + k0Var.f867b, 0, 3, fVar);
                    }
                }
            }
            i3++;
        }
    }

    /* renamed from: j */
    public void mo576j(C0159f fVar, int i, int i2) {
        int i3 = this.f2207p + 1;
        this.f2207p = i3;
        int[] iArr = this.f2206o;
        if (i3 > iArr.length - 1) {
            this.f2207p = 0;
        }
        if (this.f2195d == 0) {
            C0098y[] yVarArr = C0137v.f2265m0;
            C0137v vVar = this.f2204m;
            int i4 = vVar.f2275G;
            if (yVarArr[i4] == null) {
                return;
            }
            if (yVarArr[i4].f1109g != null) {
                yVarArr[i4].f1109g.mo23b(fVar, iArr[this.f2207p], i, i2, 0, 0);
                return;
            }
            long j = this.f2208q;
            long j2 = C0145a.f2653u;
            if (j - j2 < 0) {
                this.f2208q = j2 + 1500;
                vVar.mo596o();
                return;
            }
            return;
        }
        C0114e eVar = this.f2203l;
        if (eVar != null) {
            eVar.mo429i0(fVar, i, i2, 1, iArr[this.f2207p], true);
        }
    }

    /* renamed from: k */
    public void mo577k(C0006b bVar, String str) {
        int i = C0107a0.f1197V;
        bVar.f102g = i;
        bVar.f106k = C0107a0.f1195T;
        String[] h = C0177m.f2956x.mo916h(str, i - 8);
        bVar.f105j = h;
        bVar.f103h = 10000000;
        bVar.f110o = null;
        int length = h.length * 12;
        bVar.f108m = length;
        bVar.f107l = C0107a0.f1196U;
        bVar.f121z = 10;
        int i2 = length - C0107a0.f1199X;
        bVar.f109n = i2;
        if (i2 < 0) {
            bVar.f109n = 0;
        }
    }
}
