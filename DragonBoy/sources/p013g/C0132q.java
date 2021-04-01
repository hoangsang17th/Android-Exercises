package p013g;

import p001b.C0006b;
import p011e.C0055d;
import p011e.C0074m;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: g.q */
public class C0132q {

    /* renamed from: a */
    public int[][] f2174a = new int[3][];

    /* renamed from: b */
    public C0074m f2175b = new C0074m();

    /* renamed from: c */
    public int f2176c;

    /* renamed from: d */
    public int f2177d;

    /* renamed from: e */
    public int f2178e;

    /* renamed from: f */
    public int f2179f;

    /* renamed from: g */
    public int f2180g;

    /* renamed from: h */
    public int f2181h;

    /* renamed from: i */
    public int f2182i;

    /* renamed from: j */
    public int f2183j;

    /* renamed from: k */
    public int f2184k;

    /* renamed from: l */
    public int f2185l;

    /* renamed from: m */
    public int f2186m;

    /* renamed from: n */
    public boolean f2187n;

    /* renamed from: o */
    public boolean f2188o = true;

    /* renamed from: p */
    public int f2189p;

    /* renamed from: q */
    public int f2190q;

    /* renamed from: r */
    public C0055d f2191r;

    public C0132q() {
        int i = 0;
        while (true) {
            int[][] iArr = this.f2174a;
            if (i < iArr.length) {
                iArr[i] = new int[3];
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo562a(String str, int i) {
        String d = C0111c0.m577d(str);
        if (this.f2175b.f896a.size() <= 0 || !d.equals(((C0131p) this.f2175b.f896a.lastElement()).f2166a)) {
            if (this.f2175b.f896a.size() > 10) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f2175b.f896a.removeElementAt(0);
                }
            }
            this.f2175b.mo162a(d, i, (C0114e) null, false);
            if (this.f2175b.f896a.size() == 1) {
                this.f2180g = 0;
                this.f2184k = (C0114e.m647e0().f1593n - C0126k.f2028t1) + (C0114e.m647e0().f1633v == 1 ? -20 : 20);
            }
            this.f2187n = false;
        }
    }

    /* renamed from: b */
    public void mo563b(String str, C0114e eVar, boolean z) {
        this.f2190q = eVar.f1638w;
        this.f2175b.mo162a(str, 3, eVar, z);
        this.f2187n = false;
    }

    /* renamed from: c */
    public void mo564c(int i) {
        this.f2189p = i;
    }

    /* renamed from: d */
    public void mo565d() {
        this.f2175b.mo164c();
    }

    /* renamed from: e */
    public void mo566e() {
        int i = this.f2180g;
        int i2 = this.f2179f;
        if (i != i2) {
            int i3 = (i2 - i) << 2;
            this.f2182i = i3;
            int i4 = this.f2181h + i3;
            this.f2181h = i4;
            this.f2180g = i + (i4 >> 4);
            this.f2181h = i4 & 15;
        }
        int i5 = this.f2184k;
        int i6 = this.f2183j;
        if (i5 != i6) {
            int i7 = (i6 - i5) << 2;
            this.f2186m = i7;
            int i8 = this.f2185l + i7;
            this.f2185l = i8;
            this.f2184k = i5 + (i8 >> 4);
            this.f2185l = i8 & 15;
        }
        int i9 = this.f2178e + 1;
        this.f2178e = i9;
        if (i9 == 5) {
            this.f2178e = 0;
            if (this.f2177d == 0) {
                this.f2177d = 1;
            } else {
                this.f2177d = 0;
            }
        }
    }

    /* renamed from: f */
    public void mo567f(C0159f fVar) {
        int[][] iArr;
        if (equals(C0126k.f1866H3) && C0126k.m893c0().mo559y0()) {
            return;
        }
        if ((equals(C0126k.f1866H3) && C0126k.m893c0().f2081M0 != null) || !C0126k.f2018q4) {
            return;
        }
        if ((C0145a.f2625c0 != C0126k.m893c0() && C0145a.f2625c0 != C0118g.m792q()) || C0006b.f96D != null || !this.f2188o || C0114e.f1392w4) {
            return;
        }
        if (!C0145a.f2629e0.f2467a || !equals(C0126k.f1866H3)) {
            fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
            fVar.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            C0074m mVar = this.f2175b;
            if (mVar != null) {
                mVar.mo165d(fVar, this.f2184k, this.f2180g, this.f2176c);
                C0131p pVar = this.f2175b.f897b;
                if (!(pVar == null || pVar.f2168c == null || this.f2191r != null)) {
                    boolean z = C0145a.f2659x;
                }
                if (pVar != null) {
                    C0114e eVar = pVar.f2168c;
                }
            }
            C0131p pVar2 = this.f2175b.f897b;
            if (!(pVar2 == null || pVar2.f2168c != null || (iArr = this.f2174a) == null)) {
                C0174j.m1555c(fVar, iArr[C0114e.m647e0().f1643x][this.f2177d], this.f2184k, this.f2180g + 3 + (C0145a.f2600O % 10 > 5 ? 1 : 0), this.f2176c == 1 ? 0 : 2, C0117f0.f1680f);
            }
            fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        }
    }

    /* renamed from: g */
    public void mo568g() {
        if ((!equals(C0126k.f1866H3) || C0126k.m893c0().f2081M0 == null) && this.f2188o) {
            mo566e();
            C0074m mVar = this.f2175b;
            if (mVar != null) {
                if (mVar == null || mVar.f897b != null) {
                    int i = 20;
                    if (!this.f2187n) {
                        int i2 = this.f2189p;
                        if (i2 > 0) {
                            int i3 = i2 - 1;
                            this.f2189p = i3;
                            if (i3 == 0) {
                                C0145a.f2629e0.mo669o2();
                                C0145a.f2629e0.mo689x2();
                            }
                        }
                        if (C0145a.f2600O % 3 == 0) {
                            if (C0114e.m647e0().f1633v == 1) {
                                this.f2183j = (C0114e.m647e0().f1593n - 20) - C0126k.f2028t1;
                            }
                            if (C0114e.m647e0().f1633v == -1) {
                                this.f2183j = (C0114e.m647e0().f1593n + 20) - C0126k.f2028t1;
                            }
                            int i4 = this.f2183j;
                            if (i4 <= 24) {
                                this.f2183j = i4 + (this.f2175b.f898c / 2);
                            }
                            int i5 = this.f2183j;
                            if (i5 >= C0145a.f2614V - 24) {
                                this.f2183j = i5 - (this.f2175b.f898c / 2);
                            }
                            int i6 = (C0114e.m647e0().f1598o - 40) - C0126k.f2032u1;
                            this.f2179f = i6;
                            C0074m mVar2 = this.f2175b;
                            String[] strArr = mVar2.f900e;
                            if (strArr != null && i6 < ((strArr.length + 1) * 12) + 10) {
                                this.f2179f = ((strArr.length + 1) * 12) + 10;
                            }
                            if (mVar2.f897b.f2168c != null) {
                                int i7 = C0145a.f2614V;
                                int i8 = i7 - 50;
                                int i9 = mVar2.f909n;
                                if (i8 > i9 + 155) {
                                    this.f2183j = (i7 - 60) - (i9 / 2);
                                    this.f2179f = mVar2.f910o + 10;
                                } else {
                                    this.f2183j = (i7 - 20) - (i9 / 2);
                                    int i10 = mVar2.f910o;
                                    this.f2179f = i10 + 45;
                                    if (i7 > C0145a.f2616W || C0145a.f2614V < 220) {
                                        this.f2183j = (C0145a.f2614V - 20) - (i9 / 2);
                                        this.f2179f = i10 + 10;
                                    }
                                }
                            }
                        }
                        if (this.f2184k > C0114e.m647e0().f1593n - C0126k.f2028t1) {
                            this.f2176c = -1;
                        } else {
                            this.f2176c = 1;
                        }
                    }
                    C0074m mVar3 = this.f2175b;
                    if (mVar3.f897b == null) {
                        return;
                    }
                    if (mVar3.f896a.size() > 1) {
                        C0074m mVar4 = this.f2175b;
                        C0131p pVar = mVar4.f897b;
                        if (pVar.f2171f == 0) {
                            int i11 = mVar4.f905j + 1;
                            mVar4.f905j = i11;
                            if (i11 >= pVar.f2167b) {
                                mVar4.f905j = 0;
                                mVar4.f896a.removeElementAt(0);
                            } else {
                                return;
                            }
                        } else {
                            pVar.f2173h = System.currentTimeMillis();
                            C0131p pVar2 = this.f2175b.f897b;
                            if (pVar2.f2173h - pVar2.f2172g >= 1000) {
                                pVar2.f2172g = System.currentTimeMillis();
                                this.f2175b.f897b.f2171f--;
                            }
                            C0074m mVar5 = this.f2175b;
                            if (mVar5.f897b.f2171f == 0) {
                                mVar5.f896a.removeElementAt(0);
                                if (this.f2175b.f896a.size() == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        C0074m mVar6 = this.f2175b;
                        mVar6.f897b = (C0131p) this.f2175b.f896a.firstElement();
                        mVar6.mo163b();
                    } else if (this.f2175b.f896a.size() == 1) {
                        C0074m mVar7 = this.f2175b;
                        C0131p pVar3 = mVar7.f897b;
                        int i12 = -20;
                        if (pVar3.f2171f == 0) {
                            int i13 = mVar7.f905j + 1;
                            mVar7.f905j = i13;
                            int i14 = pVar3.f2167b;
                            if (i13 >= i14) {
                                this.f2187n = true;
                            }
                            if (i13 == i14) {
                                this.f2179f = -40;
                                int i15 = C0114e.m647e0().f1593n - C0126k.f2028t1;
                                if (C0114e.m647e0().f1633v != 1) {
                                    i12 = 20;
                                }
                                this.f2183j = i15 + i12;
                            }
                            C0074m mVar8 = this.f2175b;
                            if (mVar8.f905j >= mVar8.f897b.f2167b + 20) {
                                mVar8.f905j = 0;
                                mVar8.f896a.removeAllElements();
                                this.f2175b.f900e = null;
                                return;
                            }
                            return;
                        }
                        pVar3.f2173h = System.currentTimeMillis();
                        C0131p pVar4 = this.f2175b.f897b;
                        if (pVar4.f2173h - pVar4.f2172g >= 1000) {
                            pVar4.f2172g = System.currentTimeMillis();
                            this.f2175b.f897b.f2171f--;
                        }
                        if (this.f2175b.f897b.f2171f == 0) {
                            this.f2187n = true;
                            this.f2179f = -40;
                            int i16 = C0114e.m647e0().f1593n - C0126k.f2028t1;
                            if (C0114e.m647e0().f1633v == 1) {
                                i = -20;
                            }
                            this.f2183j = i16 + i;
                            C0074m mVar9 = this.f2175b;
                            mVar9.f905j = 0;
                            mVar9.f896a.removeAllElements();
                            this.f2175b.f900e = null;
                            this.f2191r = null;
                        }
                    }
                }
            }
        }
    }
}
