package p011e;

import p001b.C0006b;
import p001b.C0007c;
import p001b.C0009e;
import p012f.C0104c;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0137v;
import p014h.p015a.p016a.C0142a;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;
import p020k.C0177m;

/* renamed from: e.b0 */
public class C0050b0 extends C0114e {

    /* renamed from: J4 */
    public static C0053c0[] f359J4;

    /* renamed from: K4 */
    public static boolean f360K4;

    /* renamed from: L4 */
    public static int f361L4;

    /* renamed from: A4 */
    public C0053c0 f362A4;

    /* renamed from: B4 */
    public boolean f363B4;

    /* renamed from: C4 */
    int f364C4;

    /* renamed from: D4 */
    int f365D4;

    /* renamed from: E4 */
    public int[] f366E4;

    /* renamed from: F4 */
    public int f367F4;

    /* renamed from: G4 */
    public long f368G4;

    /* renamed from: H4 */
    public long f369H4;

    /* renamed from: I4 */
    public int f370I4;

    public C0050b0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f1534b1 = true;
        this.f1442J0 = i6;
        C0111c0.m584k("npc avatar= " + this.f1442J0);
        this.f1593n = i3;
        this.f1598o = i4;
        this.f1572i3 = i3;
        this.f1577j3 = i4;
        this.f1628u = i2;
        if (i != -1) {
            this.f362A4 = f359J4[i5];
        }
        if (i5 == 23 || i5 == 42) {
            this.f1539c0 = 45;
        }
        if (i5 == 51) {
            this.f1534b1 = false;
            this.f364C4 = i2;
            C0111c0.m584k("duaHau = " + i2);
        }
        C0053c0 c0Var = this.f362A4;
        if (c0Var != null) {
            if (c0Var.f382b == null) {
                c0Var.f382b = "";
            }
            c0Var.f382b = C0111c0.m577d(c0Var.f382b);
        }
    }

    /* renamed from: A1 */
    public static void m217A1() {
        for (int i = 0; i < C0126k.f1924W1.size(); i++) {
            C0050b0 b0Var = (C0050b0) C0126k.f1924W1.elementAt(i);
            b0Var.f1656z2 = null;
            b0Var.f1646x2 = -1;
        }
    }

    /* renamed from: B1 */
    public void mo132B1(C0159f fVar) {
        C0053c0 c0Var;
        C0177m mVar;
        String str;
        int i;
        int e;
        C0177m mVar2;
        String str2;
        int i2;
        int e2;
        int i3;
        int i4;
        String str3;
        C0177m mVar3;
        int i5;
        if (!C0114e.f1394y4 && !this.f363B4 && mo413X()) {
            int i6 = 15;
            if (this.f1628u != 15 && (c0Var = this.f362A4) != null) {
                int i7 = c0Var.f381a;
                if (i7 == 3) {
                    if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                        C0177m.f2924A.mo910b(fVar, this.f362A4.f382b, this.f1593n, ((this.f1598o - this.f1539c0) - 3) - C0177m.f2956x.mo913e(), 2, C0177m.f2925B);
                    } else {
                        C0177m.f2924A.mo910b(fVar, this.f362A4.f382b, this.f1593n, ((this.f1598o - this.f1539c0) - C0177m.f2956x.mo913e()) - 5, 2, C0177m.f2925B);
                    }
                    i3 = 60;
                } else if (i7 != 4) {
                    int i8 = 8;
                    if (i7 == 50 || i7 == 51) {
                        int[] iArr = this.f366E4;
                        if (iArr != null) {
                            int i9 = 0;
                            C0089t0[] t0VarArr = C0174j.f2850c;
                            int i10 = this.f364C4;
                            if (!(t0VarArr[iArr[i10]] == null || t0VarArr[iArr[i10]].f1037a == null)) {
                                i9 = C0159f.m1450t(t0VarArr[iArr[i10]].f1037a);
                            }
                            if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                                mVar = C0177m.f2924A;
                                str = this.f362A4.f382b;
                                i = this.f1593n;
                                e = ((((this.f1598o - this.f1539c0) - 8) - C0177m.f2956x.mo913e()) - i9) + 16;
                                mVar.mo910b(fVar, str, i, e, 2, C0177m.f2925B);
                                return;
                            }
                            mVar2 = C0177m.f2924A;
                            str2 = this.f362A4.f382b;
                            i2 = this.f1593n;
                            e2 = ((this.f1598o - this.f1539c0) - C0177m.f2956x.mo913e()) - i9;
                        } else {
                            return;
                        }
                    } else if (i7 != 6) {
                        if (C0121h0.f1803v != 51) {
                            if (i7 == 47) {
                                i6 = 47;
                            }
                            if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                                C0053c0 c0Var2 = this.f362A4;
                                if (c0Var2.f381a == 47) {
                                    i8 = 40;
                                }
                                if (C0121h0.f1803v != 113) {
                                    mVar3 = C0177m.f2924A;
                                    str3 = c0Var2.f382b;
                                    i4 = this.f1593n;
                                    i5 = (this.f1598o - this.f1539c0) - i8;
                                    i6 = C0177m.f2956x.mo913e();
                                }
                            } else if (C0121h0.f1803v != 113) {
                                mVar3 = C0177m.f2924A;
                                str3 = this.f362A4.f382b;
                                i4 = this.f1593n;
                                i5 = (this.f1598o - this.f1539c0) - C0177m.f2956x.mo913e();
                            }
                            mVar3.mo910b(fVar, str3, i4, i5 - i6, 2, C0177m.f2925B);
                        }
                        i3 = 65;
                    } else if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                        mVar = C0177m.f2924A;
                        str = this.f362A4.f382b;
                        i = this.f1593n;
                        e = ((this.f1598o - this.f1539c0) - 8) - C0177m.f2956x.mo913e();
                        mVar.mo910b(fVar, str, i, e, 2, C0177m.f2925B);
                        return;
                    } else {
                        mVar2 = C0177m.f2924A;
                        str2 = this.f362A4.f382b;
                        i2 = this.f1593n;
                        e2 = ((this.f1598o - this.f1539c0) - C0177m.f2956x.mo913e()) - 16;
                    }
                    mVar2.mo910b(fVar, str2, i2, e2, 2, C0177m.f2925B);
                    return;
                } else {
                    return;
                }
                this.f365D4 = i3;
            }
        }
    }

    /* renamed from: C1 */
    public void mo133C1(byte b, int i) {
        this.f364C4 = b;
        long currentTimeMillis = System.currentTimeMillis();
        this.f369H4 = currentTimeMillis;
        this.f368G4 = currentTimeMillis;
        this.f367F4 = i;
        C0111c0.m584k("in ra second= " + this.f367F4);
    }

    /* renamed from: M */
    public void mo134M() {
        this.f1628u = 15;
        C0114e.f1372c4 = null;
    }

    /* renamed from: f1 */
    public void mo135f1() {
        C0062g gVar;
        if (this.f362A4.f381a == 51) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f369H4 = currentTimeMillis;
            if (currentTimeMillis - this.f368G4 >= 1000) {
                int i = this.f367F4 - 1;
                this.f367F4 = i;
                this.f368G4 = currentTimeMillis;
                if (i < 0) {
                    this.f367F4 = 0;
                }
            }
        }
        if (this.f1534b1) {
            mo450s1();
        }
        if (this.f1656z2 == null) {
            byte[] bArr = {-1, 9, 9, 10, 10, 11, 11};
            if (C0114e.m647e0().f1648y < 9 || C0114e.m647e0().f1648y > 10 || C0114e.m647e0().f1614r0.f337a <= 0 || bArr[C0114e.m647e0().f1614r0.f337a] != this.f362A4.f381a) {
                C0126k.m893c0();
                byte g0 = C0126k.m896g0();
                if (!(C0114e.m647e0().f1644x0 == null && g0 == this.f362A4.f381a)) {
                    if (C0114e.m647e0().f1644x0 != null && g0 == this.f362A4.f381a) {
                        gVar = C0114e.m647e0().f1644x0.f1095a + 1 == C0114e.m647e0().f1644x0.f1100f.length ? C0126k.f1888N1[98] : C0126k.f1888N1[98];
                    }
                }
                this.f1646x2 = 0;
            } else if (C0114e.m647e0().f1644x0 == null) {
                gVar = C0126k.f1888N1[57];
            } else if (C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1095a + 1 == C0114e.m647e0().f1644x0.f1100f.length) {
                gVar = C0126k.f1888N1[62];
            }
            this.f1656z2 = gVar;
            this.f1646x2 = 0;
        }
        super.mo135f1();
        if (C0121h0.f1803v == 51) {
            if (this.f1593n > C0114e.m647e0().f1593n) {
                this.f1633v = -1;
            } else {
                this.f1633v = 1;
            }
            if (this.f362A4.f381a % 2 != 0) {
                return;
            }
            if (this.f1584l0 == 1) {
                this.f1584l0 = 0;
            } else {
                this.f1584l0 = 1;
            }
        }
    }

    /* renamed from: g0 */
    public void mo136g0(C0159f fVar) {
        int i;
        int i2;
        C0062g gVar;
        int i3;
        String str;
        C0177m mVar;
        int i4;
        int i5;
        int i6;
        int i7;
        short s;
        int i8;
        C0063g0 g0Var;
        if (!C0114e.f1394y4 && !this.f363B4 && mo413X()) {
            int i9 = 15;
            if (this.f1628u != 15) {
                if (this.f1437I0 != 0) {
                    super.mo136g0(fVar);
                    return;
                }
                C0053c0 c0Var = this.f362A4;
                if (c0Var != null) {
                    int i10 = c0Var.f381a;
                    if (i10 == 4 || i10 == 51 || i10 == 50) {
                        C0159f fVar2 = fVar;
                    } else {
                        fVar.mo776e(C0121h0.f1770I, this.f1593n, this.f1598o, 3);
                    }
                    C0053c0 c0Var2 = this.f362A4;
                    int i11 = c0Var2.f381a;
                    if (i11 == 3) {
                        i = 0;
                        i2 = 1;
                        C0174j.m1555c(fVar, 265, this.f1593n, this.f1598o, 0, C0142a.f2562f | C0142a.f2566j);
                        if (C0114e.m647e0().f1467O0 != null && C0114e.m647e0().f1467O0.equals(this) && C0006b.f95C == null) {
                            fVar.mo779h(C0137v.f2268p0, 0, 0, 9, 6, 0, this.f1593n, (this.f1598o - this.f1539c0) + 4, C0142a.f2562f | C0142a.f2566j);
                        }
                        this.f365D4 = 60;
                    } else {
                        if (i11 != 4) {
                            if (i11 == 50 || i11 == 51) {
                                i2 = 1;
                                i = 0;
                                if (this.f366E4 != null) {
                                    if (i11 == 50 && f360K4) {
                                        f361L4++;
                                        if (C0145a.f2600O % 3 == 0) {
                                            C0007c.m43a(new C0009e(19, this.f1593n + C0111c0.m587n(-50, 50), this.f1598o, 2, 1, -1));
                                        }
                                        if (C0145a.f2600O % 15 == 0) {
                                            C0007c.m43a(new C0009e(18, this.f1593n + C0111c0.m587n(-5, 5), this.f1598o + C0111c0.m587n(-90, 0), 2, 1, -1));
                                        }
                                        if (f361L4 == 100) {
                                            C0126k.m893c0().mo536o(this.f1593n, this.f1598o);
                                        }
                                        if (f361L4 == 110) {
                                            f360K4 = false;
                                            this.f362A4.f381a = 4;
                                        }
                                    }
                                    C0089t0[] t0VarArr = C0174j.f2850c;
                                    int[] iArr = this.f366E4;
                                    int i12 = this.f364C4;
                                    int t = (t0VarArr[iArr[i12]] == null || t0VarArr[iArr[i12]].f1037a == null) ? 0 : C0159f.m1450t(t0VarArr[iArr[i12]].f1037a);
                                    C0174j.m1555c(fVar, this.f366E4[this.f364C4], this.f1593n + C0111c0.m587n(-1, 1), this.f1598o, 0, C0142a.f2562f | C0142a.f2566j);
                                    if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                                        mVar = C0177m.f2948p;
                                        str = C0104c.m359d(this.f367F4);
                                        i3 = this.f1593n;
                                        i4 = (this.f1598o - this.f1539c0) - 8;
                                    } else {
                                        if (C0006b.f95C == null) {
                                            fVar.mo779h(C0137v.f2268p0, 0, 0, 9, 6, 0, this.f1593n, (((this.f1598o - this.f1539c0) - 9) + 16) - t, C0142a.f2562f | C0142a.f2566j);
                                        }
                                        mVar = C0177m.f2948p;
                                        str = C0104c.m359d(this.f367F4);
                                        i3 = this.f1593n;
                                        i4 = (this.f1598o - this.f1539c0) - 16;
                                    }
                                    mVar.mo910b(fVar, str, i3, (((i4 - C0177m.f2956x.mo913e()) - 20) - t) + 16, 2, C0177m.f2951s);
                                }
                            } else if (i11 == 6) {
                                C0174j.m1555c(fVar, 545, this.f1593n, this.f1598o + 5, 0, C0142a.f2562f | C0142a.f2566j);
                                if (C0114e.m647e0().f1467O0 != null && C0114e.m647e0().f1467O0.equals(this) && C0006b.f95C == null) {
                                    fVar.mo779h(C0137v.f2268p0, 0, 0, 9, 6, 0, this.f1593n, (this.f1598o - this.f1539c0) - 9, C0142a.f2562f | C0142a.f2566j);
                                }
                                C0177m.f2948p.mo909a(fVar, C0121h0.f1805x + "", this.f1593n, ((this.f1598o - this.f1539c0) + 19) - C0177m.f2956x.mo913e(), 2);
                            } else {
                                int i13 = c0Var2.f383c;
                                int i14 = c0Var2.f385e;
                                int i15 = c0Var2.f384d;
                                C0061f0[] f0VarArr = C0126k.f1884M1;
                                C0061f0 f0Var = f0VarArr[i13];
                                C0061f0 f0Var2 = f0VarArr[i14];
                                C0061f0 f0Var3 = f0VarArr[i15];
                                int i16 = this.f1633v;
                                C0063g0[] g0VarArr = f0Var.f796a;
                                int[][][] iArr2 = C0114e.f1389t4;
                                if (i16 == 1) {
                                    int i17 = this.f1584l0;
                                    i6 = 0;
                                    i5 = 0;
                                    C0174j.m1555c(fVar, g0VarArr[iArr2[i17][0][0]].f799a, this.f1593n + iArr2[i17][0][1] + g0VarArr[iArr2[i17][0][0]].f800b, (this.f1598o - iArr2[i17][0][2]) + g0VarArr[iArr2[i17][0][0]].f801c, 0, 0);
                                    C0063g0[] g0VarArr2 = f0Var2.f796a;
                                    int i18 = this.f1584l0;
                                    C0174j.m1555c(fVar, g0VarArr2[iArr2[i18][1][0]].f799a, g0VarArr2[iArr2[i18][1][0]].f800b + this.f1593n + iArr2[i18][1][1], (this.f1598o - iArr2[i18][1][2]) + g0VarArr2[iArr2[i18][1][0]].f801c, 0, 0);
                                    C0063g0[] g0VarArr3 = f0Var3.f796a;
                                    int i19 = this.f1584l0;
                                    s = g0VarArr3[iArr2[i19][2][0]].f799a;
                                    i7 = this.f1593n + iArr2[i19][2][1] + g0VarArr3[iArr2[i19][2][0]].f800b;
                                    i8 = this.f1598o - iArr2[i19][2][2];
                                    g0Var = g0VarArr3[iArr2[i19][2][0]];
                                } else {
                                    int i20 = this.f1584l0;
                                    i6 = 2;
                                    i5 = 24;
                                    C0174j.m1555c(fVar, g0VarArr[iArr2[i20][0][0]].f799a, (this.f1593n - iArr2[i20][0][1]) - g0VarArr[iArr2[i20][0][0]].f800b, (this.f1598o - iArr2[i20][0][2]) + g0VarArr[iArr2[i20][0][0]].f801c, 2, 24);
                                    C0063g0[] g0VarArr4 = f0Var2.f796a;
                                    int i21 = this.f1584l0;
                                    C0174j.m1555c(fVar, g0VarArr4[iArr2[i21][1][0]].f799a, (this.f1593n - iArr2[i21][1][1]) - g0VarArr4[iArr2[i21][1][0]].f800b, (this.f1598o - iArr2[i21][1][2]) + g0VarArr4[iArr2[i21][1][0]].f801c, 2, 24);
                                    C0063g0[] g0VarArr5 = f0Var3.f796a;
                                    int i22 = this.f1584l0;
                                    s = g0VarArr5[iArr2[i22][2][0]].f799a;
                                    i7 = (this.f1593n - iArr2[i22][2][1]) - g0VarArr5[iArr2[i22][2][0]].f800b;
                                    i8 = this.f1598o - iArr2[i22][2][2];
                                    g0Var = g0VarArr5[iArr2[i22][2][0]];
                                }
                                C0174j.m1555c(fVar, s, i7, i8 + g0Var.f801c, i6, i5);
                                if (C0121h0.f1803v != 51) {
                                    if (this.f362A4.f381a == 47) {
                                        i9 = 47;
                                    }
                                    if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                                        int i23 = this.f362A4.f381a;
                                    } else if (C0006b.f95C == null) {
                                        fVar.mo779h(C0137v.f2268p0, 0, 0, 9, 6, 0, this.f1593n, (this.f1598o - this.f1539c0) - (i9 - 8), 33);
                                    }
                                }
                                this.f365D4 = 65;
                            }
                        }
                        i2 = 1;
                        i = 0;
                    }
                    int i24 = this.f1646x2;
                    if (i24 >= 0 && (gVar = this.f1656z2) != null && this.f1437I0 == 0) {
                        C0064h[] hVarArr = gVar.f798b;
                        C0174j.m1555c(fVar, hVarArr[i24].f804c, this.f1593n + hVarArr[i24].f802a, (this.f1598o + hVarArr[i24].f803b) - this.f365D4, 0, C0142a.f2563g | C0142a.f2566j);
                        if (C0145a.f2600O % 2 == 0) {
                            int i25 = this.f1646x2 + i2;
                            this.f1646x2 = i25;
                            if (i25 >= this.f1656z2.f798b.length) {
                                this.f1646x2 = i;
                            }
                        }
                    }
                }
            }
        }
    }
}
