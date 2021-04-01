package p013g;

import p001b.C0007c;
import p001b.C0009e;
import p001b.C0016l;
import p011e.C0057d1;
import p011e.C0072l;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0167c;
import p020k.C0174j;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.g */
public class C0118g extends C0178n implements C0072l {

    /* renamed from: S */
    public static C0118g f1682S;

    /* renamed from: T */
    static int f1683T;

    /* renamed from: U */
    static int[] f1684U;

    /* renamed from: V */
    static C0016l f1685V;

    /* renamed from: W */
    static C0016l f1686W;

    /* renamed from: X */
    static C0143b f1687X;

    /* renamed from: Y */
    static C0143b f1688Y;

    /* renamed from: A */
    int f1689A;

    /* renamed from: B */
    int f1690B = 0;

    /* renamed from: C */
    int f1691C = 0;

    /* renamed from: D */
    int f1692D;

    /* renamed from: E */
    int f1693E;

    /* renamed from: F */
    int[] f1694F;

    /* renamed from: G */
    int[] f1695G;

    /* renamed from: H */
    int[] f1696H;

    /* renamed from: I */
    int[] f1697I;

    /* renamed from: J */
    short[] f1698J;

    /* renamed from: K */
    long f1699K;

    /* renamed from: L */
    long f1700L;

    /* renamed from: M */
    boolean f1701M;

    /* renamed from: N */
    boolean f1702N;

    /* renamed from: O */
    boolean f1703O;

    /* renamed from: P */
    short f1704P;

    /* renamed from: Q */
    byte[] f1705Q = {19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};

    /* renamed from: R */
    byte[] f1706R = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};

    /* renamed from: i */
    C0108b[] f1707i;

    /* renamed from: j */
    byte f1708j = 0;

    /* renamed from: k */
    byte f1709k;

    /* renamed from: l */
    int f1710l;

    /* renamed from: m */
    int f1711m;

    /* renamed from: n */
    int f1712n;

    /* renamed from: o */
    int f1713o;

    /* renamed from: p */
    int f1714p;

    /* renamed from: q */
    int f1715q;

    /* renamed from: r */
    int f1716r;

    /* renamed from: s */
    int f1717s;

    /* renamed from: t */
    int f1718t;

    /* renamed from: u */
    int f1719u;

    /* renamed from: v */
    int f1720v;

    /* renamed from: w */
    int f1721w;

    /* renamed from: x */
    int f1722x;

    /* renamed from: y */
    int f1723y;

    /* renamed from: z */
    int f1724z;

    public C0118g() {
        int[] iArr = new int[2];
        f1684U = iArr;
        iArr[0] = 16;
        f1683T = C0145a.f2616W - 41;
        f1684U[1] = C0145a.f2614V - 40;
        f1685V = new C0016l(C0161h.m1494l("/e/e_1.png"), 30, 30);
        f1686W = new C0016l(C0161h.m1494l("/e/e_0.png"), 68, 65);
        new C0016l(C0161h.m1494l("/e/e_2.png"), 66, 70);
        f1688Y = C0161h.m1494l("/e/nut2.png");
        f1687X = C0161h.m1494l("/e/nut3.png");
        this.f1722x = 230;
        this.f1720v = C0145a.f2621a0 - (230 / 2);
        this.f1723y = 40;
        this.f1721w = -40;
    }

    /* renamed from: l */
    private byte m787l() {
        int i = 0;
        byte b = 0;
        while (true) {
            C0108b[] bVarArr = this.f1707i;
            if (i >= bVarArr.length) {
                break;
            }
            if (bVarArr[i].f1237k) {
                b = (byte) (b + 1);
            }
            i++;
        }
        byte n = (byte) (b - m789n());
        if (n <= 0) {
            return 0;
        }
        return n;
    }

    /* renamed from: m */
    private void m788m() {
        int i = 0;
        while (i < C0114e.m647e0().f1397A0.length) {
            if (C0114e.m647e0().f1397A0[i] == null || C0114e.m647e0().f1397A0[i].f923b.f1026a != this.f1704P) {
                i++;
            } else {
                this.f1719u = C0114e.m647e0().f1397A0[i].f929h;
                return;
            }
        }
    }

    /* renamed from: n */
    private byte m789n() {
        int i = 0;
        byte b = 0;
        while (true) {
            C0108b[] bVarArr = this.f1707i;
            if (i >= bVarArr.length) {
                break;
            }
            if (bVarArr[i].f1237k) {
                b = (byte) (b + 1);
            }
            i++;
        }
        int i2 = this.f1719u;
        return b > i2 ? (byte) i2 : b;
    }

    /* renamed from: o */
    private void m790o(int i) {
        if (!this.f1707i[i].f1237k) {
            C0175k.m1563p().mo886q();
            int i2 = this.f1709k == 0 ? C0114e.m647e0().f1594n0 : C0114e.m647e0().f1609q0;
            if (m789n() < this.f1719u || i2 >= this.f1689A + this.f1724z) {
                this.f1717s = i;
                this.f1707i[i].f1230d = this.f1716r + C0111c0.m587n(-3, 3);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C0057d1.f618d);
            sb.append(" ");
            sb.append(this.f1709k == 0 ? C0057d1.f753w1 : C0057d1.f760x1);
            C0126k.f1862G3.mo562a(sb.toString(), 0);
        }
    }

    /* renamed from: p */
    private void m791p(int i) {
        if (this.f1718t != i) {
            this.f1718t = i;
        } else if (i != 0) {
            C0126k.m893c0().f2106Z = false;
            C0126k.m893c0().mo342f();
        } else if (this.f1708j < 2) {
            if (m789n() + m787l() > 0) {
                this.f1708j = 2;
                C0175k.m1563p().mo889t();
                C0114e.m647e0().mo414X0(C0126k.f1872J1[13], 0);
                this.f1700L = C0145a.f2653u + ((long) C0111c0.m587n(2000, 3000));
            }
        } else if (this.f1721w == C0145a.f2623b0 / 3) {
            C0105d.m365M().mo261a(this.f1709k, (byte) 0);
        }
    }

    /* renamed from: q */
    public static C0118g m792q() {
        if (f1682S == null) {
            f1682S = new C0118g();
        }
        return f1682S;
    }

    /* renamed from: r */
    private void m793r() {
        int i = (C0145a.f2623b0 / 3) + 10;
        this.f1710l = i;
        if (i > 50) {
            this.f1710l = 50;
        }
        this.f1711m = 360;
        C0126k.f2028t1 = C0126k.f1840B1 / 2;
        this.f1712n = C0126k.f2032u1 + (C0145a.f2623b0 / 3) + 30;
        this.f1715q = 175;
        this.f1713o = 0;
        this.f1714p = 360 / 175;
        this.f1694F = new int[175];
        this.f1695G = new int[175];
        this.f1696H = new int[175];
        this.f1697I = new int[175];
        m794s();
    }

    /* renamed from: s */
    private void m794s() {
        if (!C0145a.f2649s) {
            int i = 0;
            while (true) {
                int[] iArr = this.f1695G;
                if (i < iArr.length) {
                    iArr[i] = C0111c0.m574a((this.f1710l * C0111c0.m589p(this.f1713o)) / 1024);
                    this.f1694F[i] = C0111c0.m574a((this.f1710l * C0111c0.m578e(this.f1713o)) / 1024);
                    int i2 = this.f1713o;
                    if (i2 < 90) {
                        this.f1696H[i] = this.f1711m + this.f1694F[i];
                        this.f1697I[i] = this.f1712n - this.f1695G[i];
                    } else if (i2 >= 90 && i2 < 180) {
                        this.f1696H[i] = this.f1711m - this.f1694F[i];
                        this.f1697I[i] = this.f1712n - this.f1695G[i];
                    } else if (i2 < 180 || i2 >= 270) {
                        this.f1696H[i] = this.f1711m + this.f1694F[i];
                        this.f1697I[i] = this.f1712n + this.f1695G[i];
                    } else {
                        this.f1696H[i] = this.f1711m - this.f1694F[i];
                        this.f1697I[i] = this.f1712n + this.f1695G[i];
                    }
                    this.f1713o = i2 + this.f1714p;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private void m795t() {
        int i = 0;
        if (this.f1708j == 1 && C0145a.f2580E) {
            int i2 = 0;
            while (true) {
                C0108b[] bVarArr = this.f1707i;
                if (i2 >= bVarArr.length) {
                    break;
                }
                if (C0145a.m1336F((bVarArr[i2].f1227a - 20) - C0126k.f2028t1, (bVarArr[i2].f1228b - 10) - C0126k.f2032u1, 30, 30) && C0145a.f2580E && C0145a.f2582F) {
                    m790o(i2);
                }
                i2++;
            }
        }
        if (C0145a.f2580E) {
            while (true) {
                int[] iArr = f1684U;
                if (i < iArr.length) {
                    if (C0145a.m1336F(iArr[i], f1683T, 36, 36) && C0145a.f2580E && C0145a.f2582F) {
                        m791p(i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        int i;
        C0159f fVar2 = fVar;
        try {
            C0126k.m893c0().mo341d(fVar2);
            fVar2.mo773E(-C0126k.f2028t1, -C0126k.f2032u1);
            fVar2.mo773E(0, C0145a.f2595L0);
            int i2 = 0;
            while (true) {
                C0108b[] bVarArr = this.f1707i;
                if (i2 >= bVarArr.length) {
                    break;
                }
                if (bVarArr[i2].f1236j && bVarArr[i2].f1228b > bVarArr[i2].f1230d - 20) {
                    fVar2.mo776e(C0121h0.f1770I, bVarArr[i2].f1227a, bVarArr[i2].f1230d + 7, 3);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                C0108b[] bVarArr2 = this.f1707i;
                if (i3 >= bVarArr2.length) {
                    break;
                }
                if (bVarArr2[i3].f1236j) {
                    C0174j.m1555c(fVar, bVarArr2[i3].f1235i, bVarArr2[i3].f1227a, bVarArr2[i3].f1228b, 0, 3);
                }
                i3++;
            }
            if (this.f1701M) {
                if (f1685V != null) {
                    int i4 = (C0114e.m647e0().f1593n - f1685V.f210a) - 28;
                    int i5 = 0;
                    while (true) {
                        int i6 = C0145a.f2614V;
                        C0016l lVar = f1685V;
                        int i7 = lVar.f210a;
                        if (i5 >= (i6 / i7) + 1) {
                            break;
                        }
                        lVar.mo35a(this.f1692D, i4 - ((i7 - 1) * i5), ((C0114e.m647e0().f1598o - (f1685V.f211b / 2)) - 12) + 2, 0, 0, fVar);
                        i5++;
                    }
                }
                if (f1686W != null) {
                    int i8 = C0114e.m647e0().f1593n;
                    C0016l lVar2 = f1686W;
                    lVar2.mo35a(this.f1692D, ((i8 - lVar2.f210a) - 10) - 5, (C0114e.m647e0().f1598o - (f1686W.f211b / 2)) - 12, 0, 0, fVar);
                }
            }
            C0126k.m901l1(fVar);
            int i9 = C0145a.f2614V - 180;
            fVar2.mo772D(13524492);
            fVar2.mo783l(i9, 0, 180, 15);
            fVar2.mo776e(C0140y.f2354I2, i9 + 11, 8, 3);
            fVar2.mo776e(C0140y.f2355J2, i9 + 90, 7, 3);
            C0177m.f2924A.mo910b(fVar, C0114e.m647e0().f1594n0 + "", i9 + 24, 2, 0, C0177m.f2925B);
            C0177m.f2924A.mo910b(fVar, C0114e.m647e0().f1609q0 + "", i9 + 100, 2, 0, C0177m.f2925B);
            fVar2.mo776e(C0140y.f2356K2, i9 + 150, 8, 3);
            C0177m.f2924A.mo910b(fVar, this.f1719u + "", i9 + 160, 2, 0, C0177m.f2925B);
            if (this.f1708j < 4) {
                int i10 = C0145a.f2614V - 110;
                fVar2.mo772D(11837316);
                fVar2.mo783l(i10, 15, 110, 15);
                if (this.f1709k == 0) {
                    fVar2.mo776e(C0140y.f2354I2, i10 + 21, 23, 3);
                } else {
                    fVar2.mo776e(C0140y.f2355J2, i10 + 21, 22, 3);
                }
                C0177m.f2926C.mo910b(fVar, "-" + this.f1689A, i10 + 30, 17, 0, C0177m.f2925B);
                fVar2.mo776e(C0140y.f2356K2, i10 + 80, 22, 3);
                C0177m.f2926C.mo910b(fVar, "-" + m789n(), i10 + 90, 17, 0, C0177m.f2925B);
            }
            fVar2.mo776e(C0126k.f2022r3, f1684U[0], f1683T, 0);
            if (this.f1718t == 0) {
                fVar2.mo776e(C0126k.f2026s3, f1684U[0], f1683T, 0);
            }
            if (this.f1708j < 3) {
                C0174j.m1555c(fVar, 540, f1684U[0] + 14, f1683T + 14, 0, C0117f0.f1680f);
                i = 0;
            } else {
                i = 0;
                fVar2.mo776e(f1688Y, (f1684U[0] + 14) - 10, (f1683T + 14) - 10, 0);
            }
            fVar2.mo776e(C0126k.f2022r3, f1684U[1], f1683T, i);
            if (this.f1718t == 1) {
                fVar2.mo776e(C0126k.f2026s3, f1684U[1], f1683T, 0);
            }
            fVar2.mo776e(f1687X, (f1684U[1] + 14) - 10, (f1683T + 14) - 10, 0);
            if (this.f1708j > 3) {
                C0145a.f2642l0.mo143c(this.f1720v, this.f1721w, this.f1722x, this.f1723y, fVar);
                int length = C0145a.f2621a0 - ((this.f1698J.length * 30) / 2);
                int i11 = 0;
                while (true) {
                    short[] sArr = this.f1698J;
                    if (i11 < sArr.length) {
                        C0174j.m1555c(fVar, sArr[i11], (i11 * 30) + length + 5, this.f1721w + 10, 0, 0);
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
    }

    /* renamed from: f */
    public void mo342f() {
        C0126k.f1960f1 = true;
        C0126k.m893c0().f2106Z = true;
        super.mo342f();
    }

    /* renamed from: h */
    public void mo343h() {
        try {
            this.f1689A = this.f1724z * m787l();
            m788m();
            C0126k.m893c0().mo343h();
            if (this.f1699K - C0145a.f2653u > 0) {
                int i = 0;
                while (true) {
                    C0108b[] bVarArr = this.f1707i;
                    if (i < bVarArr.length) {
                        bVarArr[i].f1231e += 2;
                        if (bVarArr[i].f1231e >= this.f1715q) {
                            bVarArr[i].f1231e = 0;
                        }
                        bVarArr[i].f1227a = this.f1696H[bVarArr[i].f1231e];
                        bVarArr[i].f1228b = this.f1697I[bVarArr[i].f1231e];
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                if (this.f1708j == 0) {
                    this.f1708j = 1;
                }
                if (this.f1708j == 1) {
                    int i2 = 0;
                    while (true) {
                        C0108b[] bVarArr2 = this.f1707i;
                        if (i2 >= bVarArr2.length) {
                            break;
                        }
                        if (bVarArr2[i2].f1230d != -999 && !bVarArr2[i2].f1237k) {
                            if (bVarArr2[i2].f1228b < bVarArr2[i2].f1230d) {
                                if (bVarArr2[i2].f1232f < 0) {
                                    bVarArr2[i2].f1232f = 0;
                                }
                                if (bVarArr2[i2].f1228b + bVarArr2[i2].f1232f > bVarArr2[i2].f1230d) {
                                    bVarArr2[i2].f1228b = bVarArr2[i2].f1230d;
                                } else {
                                    bVarArr2[i2].f1228b += bVarArr2[i2].f1232f;
                                }
                                bVarArr2[i2].f1232f++;
                            } else {
                                if (bVarArr2[i2].f1232f > 0) {
                                    bVarArr2[i2].f1232f = 0;
                                }
                                bVarArr2[i2].f1228b += bVarArr2[i2].f1232f;
                                bVarArr2[i2].f1232f--;
                            }
                            if (bVarArr2[i2].f1228b == bVarArr2[i2].f1230d) {
                                C0108b[] bVarArr3 = this.f1707i;
                                C0007c.m43a(new C0009e(19, bVarArr3[i2].f1227a - 5, bVarArr3[i2].f1228b + 25, 2, 1, -1));
                                C0175k.m1563p().mo877g();
                                this.f1707i[i2].f1237k = true;
                                if (!this.f1702N) {
                                    this.f1702N = true;
                                }
                            }
                        }
                        i2++;
                    }
                }
                if (this.f1708j == 2) {
                    int i3 = 0;
                    while (true) {
                        C0108b[] bVarArr4 = this.f1707i;
                        if (i3 >= bVarArr4.length) {
                            break;
                        }
                        if (!bVarArr4[i3].f1237k) {
                            if (bVarArr4[i3].f1228b > -10) {
                                if (bVarArr4[i3].f1232f > 0) {
                                    bVarArr4[i3].f1232f = 0;
                                }
                                bVarArr4[i3].f1228b += bVarArr4[i3].f1232f;
                                bVarArr4[i3].f1232f--;
                                bVarArr4[i3].f1227a += bVarArr4[i3].f1233g * bVarArr4[i3].f1234h;
                                bVarArr4[i3].f1233g -= 3;
                            }
                            if (bVarArr4[i3].f1228b == -10) {
                                bVarArr4[i3].f1236j = false;
                            }
                        }
                        i3++;
                    }
                    int i4 = this.f1690B + 1;
                    this.f1690B = i4;
                    byte[] bArr = this.f1705Q;
                    if (i4 > bArr.length - 1) {
                        this.f1690B = bArr.length - 1;
                        this.f1701M = true;
                        C0175k.m1563p().mo854E();
                        if (!this.f1703O && this.f1700L - C0145a.f2653u < 0) {
                            C0105d.m365M().mo261a((byte) 2, (byte) (m789n() + m787l()));
                            this.f1703O = true;
                        }
                    }
                    C0114e.m647e0().f1584l0 = this.f1705Q[this.f1690B];
                    int i5 = this.f1691C + 1;
                    this.f1691C = i5;
                    if (i5 > 5) {
                        this.f1691C = 0;
                    }
                    this.f1692D = this.f1706R[this.f1691C];
                }
                if (this.f1708j == 3) {
                    if (this.f1691C <= 5) {
                        this.f1691C = 5;
                    }
                    int i6 = this.f1691C + 1;
                    this.f1691C = i6;
                    byte[] bArr2 = this.f1706R;
                    if (i6 > bArr2.length - 1) {
                        this.f1691C = bArr2.length - 1;
                        this.f1708j = 4;
                        this.f1701M = false;
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            C0108b[] bVarArr5 = this.f1707i;
                            if (i7 >= bVarArr5.length) {
                                break;
                            }
                            if (bVarArr5[i7].f1237k && !bVarArr5[i7].f1238l) {
                                bVarArr5[i7].f1235i = this.f1698J[i8];
                                bVarArr5[i7].f1238l = true;
                                i8++;
                            }
                            i7++;
                        }
                    }
                    this.f1692D = this.f1706R[this.f1691C];
                }
                if (this.f1708j == 4) {
                    int i9 = 0;
                    while (true) {
                        C0108b[] bVarArr6 = this.f1707i;
                        if (i9 >= bVarArr6.length) {
                            break;
                        }
                        if (bVarArr6[i9].f1236j) {
                            bVarArr6[i9].f1229c = C0114e.m647e0().f1593n;
                        }
                        i9++;
                    }
                    this.f1708j = 5;
                }
                if (this.f1708j == 5) {
                    int i10 = this.f1693E + 1;
                    this.f1693E = i10;
                    int i11 = this.f1721w;
                    int i12 = C0145a.f2623b0;
                    if (i11 < i12 / 3) {
                        if (i11 + i10 > i12 / 3) {
                            this.f1721w = i12 / 3;
                        } else {
                            this.f1721w = i11 + i10;
                        }
                    }
                    int i13 = 0;
                    while (true) {
                        C0108b[] bVarArr7 = this.f1707i;
                        if (i13 < bVarArr7.length) {
                            if (bVarArr7[i13].f1236j) {
                                if (bVarArr7[i13].f1227a < bVarArr7[i13].f1229c) {
                                    if (bVarArr7[i13].f1233g < 0) {
                                        bVarArr7[i13].f1233g = 0;
                                    }
                                    if (bVarArr7[i13].f1227a + bVarArr7[i13].f1233g > bVarArr7[i13].f1229c) {
                                        bVarArr7[i13].f1227a = bVarArr7[i13].f1229c;
                                    } else {
                                        bVarArr7[i13].f1227a += bVarArr7[i13].f1233g;
                                    }
                                    bVarArr7[i13].f1233g++;
                                } else {
                                    if (bVarArr7[i13].f1233g > 0) {
                                        bVarArr7[i13].f1233g = 0;
                                    }
                                    bVarArr7[i13].f1227a += bVarArr7[i13].f1233g;
                                    bVarArr7[i13].f1233g--;
                                }
                                if (bVarArr7[i13].f1227a == bVarArr7[i13].f1229c) {
                                    bVarArr7[i13].f1236j = false;
                                }
                            }
                            i13++;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public void mo344i() {
        if (!C0130o.f2165e) {
            if (C0145a.f2659x && !C0167c.m1522b().f2790b && !C0145a.f2627d0.f2239a) {
                m795t();
            }
            for (int i = 1; i < 8; i++) {
                boolean[] zArr = C0145a.f2574B;
                if (zArr[i]) {
                    zArr[i] = false;
                    m790o(i - 1);
                }
            }
            boolean[] zArr2 = C0145a.f2574B;
            if (zArr2[12]) {
                zArr2[12] = false;
                m791p(0);
            }
            boolean[] zArr3 = C0145a.f2574B;
            if (zArr3[13]) {
                zArr3[13] = false;
                m791p(1);
            }
            C0145a.m1359n();
        }
    }

    /* renamed from: j */
    public void mo472j(short[] sArr) {
        this.f1708j = 3;
        this.f1698J = sArr;
    }

    /* renamed from: k */
    public void mo473k(short[] sArr, byte b, int i, short s) {
        if (sArr != null && sArr.length > 0) {
            this.f1716r = C0114e.m647e0().f1598o - 10;
            m793r();
            this.f1707i = new C0108b[sArr.length];
            int i2 = 0;
            while (true) {
                C0108b[] bVarArr = this.f1707i;
                if (i2 < bVarArr.length) {
                    bVarArr[i2] = new C0108b();
                    bVarArr[i2].f1235i = sArr[i2];
                    bVarArr[i2].f1231e = i2 * 25;
                    bVarArr[i2].f1230d = -999;
                    bVarArr[i2].f1233g = C0111c0.m587n(2, 5);
                    this.f1707i[i2].f1234h = C0111c0.m587n(-1, 2);
                    this.f1707i[i2].mo347a();
                    i2++;
                } else {
                    this.f1702N = false;
                    this.f1701M = false;
                    this.f1703O = false;
                    this.f1699K = C0145a.f2653u + ((long) C0111c0.m587n(1000, 2000));
                    this.f1708j = 0;
                    this.f1717s = -1;
                    this.f1718t = -1;
                    this.f1709k = b;
                    this.f1724z = i;
                    this.f1689A = 0;
                    C0114e.m647e0().mo424d0(470, 408, 1);
                    C0114e.m647e0().f1633v = 2;
                    C0114e.m647e0().f1628u = 1;
                    this.f1690B = 0;
                    this.f1691C = 0;
                    this.f1692D = 0;
                    this.f1693E = 0;
                    this.f1721w = -this.f1723y;
                    this.f1704P = s;
                    this.f1719u = 0;
                    m788m();
                    mo342f();
                    C0175k.m1563p().mo891v();
                    return;
                }
            }
        }
    }
}
