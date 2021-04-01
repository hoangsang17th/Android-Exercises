package p013g;

import java.io.DataInputStream;
import p001b.C0005a;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0148a;
import p019j.C0149b;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0165a;
import p020k.C0173i;
import p020k.C0177m;

/* renamed from: g.h0 */
public class C0121h0 {

    /* renamed from: A */
    public static int f1762A = -1;

    /* renamed from: B */
    public static int f1763B = 0;

    /* renamed from: C */
    public static byte f1764C = 0;

    /* renamed from: D */
    public static byte f1765D = -1;

    /* renamed from: E */
    public static C0173i f1766E = new C0173i("vGO");

    /* renamed from: F */
    public static C0173i f1767F = new C0173i("vItemBg");

    /* renamed from: G */
    public static C0173i f1768G = new C0173i("vCurrItem");

    /* renamed from: H */
    public static String[] f1769H = null;

    /* renamed from: I */
    public static C0143b f1770I = C0161h.m1494l("/mainImage/myTexture2dbong.png");

    /* renamed from: J */
    public static int[] f1771J = {21, 22, 23, 39, 40, 41};

    /* renamed from: K */
    public static int[][] f1772K = null;

    /* renamed from: L */
    public static int[][][] f1773L = null;

    /* renamed from: M */
    public static C0143b f1774M = C0161h.m1494l("/bg/light.png");

    /* renamed from: N */
    public static int f1775N = 0;

    /* renamed from: O */
    public static int f1776O = 0;

    /* renamed from: P */
    public static int f1777P = 0;

    /* renamed from: Q */
    public static int f1778Q = 0;

    /* renamed from: R */
    public static int f1779R = 0;

    /* renamed from: S */
    public static int f1780S = 0;

    /* renamed from: T */
    public static int f1781T = 0;

    /* renamed from: a */
    public static int f1782a = 0;

    /* renamed from: b */
    public static int f1783b = 0;

    /* renamed from: c */
    public static int f1784c = 0;

    /* renamed from: d */
    public static int f1785d = 0;

    /* renamed from: e */
    public static int f1786e = 0;

    /* renamed from: f */
    public static int f1787f = -1;

    /* renamed from: g */
    public static int[] f1788g = null;

    /* renamed from: h */
    public static int[] f1789h = null;

    /* renamed from: i */
    public static C0143b[] f1790i = null;

    /* renamed from: j */
    public static C0143b f1791j = null;

    /* renamed from: k */
    public static C0143b f1792k = null;

    /* renamed from: l */
    public static C0143b f1793l = null;

    /* renamed from: m */
    public static C0143b f1794m = null;

    /* renamed from: n */
    public static C0143b f1795n = null;

    /* renamed from: o */
    public static byte f1796o = 24;

    /* renamed from: p */
    private static int f1797p = 0;

    /* renamed from: q */
    private static int f1798q = 0;

    /* renamed from: r */
    private static int f1799r = 0;

    /* renamed from: s */
    private static int f1800s = 0;

    /* renamed from: t */
    public static boolean f1801t = false;

    /* renamed from: u */
    public static String f1802u = "";

    /* renamed from: v */
    public static int f1803v = 0;

    /* renamed from: w */
    public static int f1804w = -1;

    /* renamed from: x */
    public static int f1805x;

    /* renamed from: y */
    public static int f1806y;

    /* renamed from: z */
    public static int f1807z;

    static {
        for (int i = 0; i < 3; i++) {
        }
        new C0173i("vObject");
    }

    /* renamed from: a */
    public static C0165a m821a(int i) {
        for (int i2 = 0; i2 < f1767F.size(); i2++) {
            C0165a aVar = (C0165a) f1767F.elementAt(i2);
            if (aVar.f2775a == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m822b() {
        int i = C0161h.f2758f;
        int i2 = 0;
        if (i != 5 && i != 3 && i != 8) {
            if (C0161h.m1496n("/t/" + f1786e + "$1.png") != null) {
                C0149b.m1396a("x" + C0159f.f2750b + "t" + f1786e);
                f1790i = new C0143b[100];
                while (true) {
                    C0143b[] bVarArr = f1790i;
                    if (i2 < bVarArr.length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("/t/");
                        sb.append(f1786e);
                        sb.append("$");
                        int i3 = i2 + 1;
                        sb.append(i3);
                        sb.append(".png");
                        bVarArr[i2] = C0161h.m1496n(sb.toString());
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            } else {
                C0143b n = C0161h.m1496n("/t/" + f1786e + ".png");
                if (n != null) {
                    C0149b.m1396a("$");
                    C0143b[] bVarArr2 = new C0143b[1];
                    f1790i = bVarArr2;
                    bVarArr2[0] = n;
                }
            }
        } else if (C0159f.f2750b == 1) {
            C0143b[] bVarArr3 = new C0143b[1];
            f1790i = bVarArr3;
            bVarArr3[0] = C0161h.m1495m("/t/" + f1786e + ".png");
        } else {
            f1790i = new C0143b[100];
            while (true) {
                C0143b[] bVarArr4 = f1790i;
                if (i2 < bVarArr4.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("/t/");
                    sb2.append(f1786e);
                    sb2.append("/");
                    int i4 = i2 + 1;
                    sb2.append(i4);
                    sb2.append(".png");
                    bVarArr4[i2] = C0161h.m1495m(sb2.toString());
                    i2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = f1803v;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m823c() {
        /*
            boolean r0 = f1801t
            if (r0 != 0) goto L_0x004d
            int r0 = f1803v
            r1 = 45
            if (r0 == r1) goto L_0x004d
            r1 = 46
            if (r0 == r1) goto L_0x004d
            r1 = 48
            if (r0 == r1) goto L_0x004d
            r1 = 51
            if (r0 == r1) goto L_0x004d
            r1 = 52
            if (r0 == r1) goto L_0x004d
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 112(0x70, float:1.57E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 113(0x71, float:1.58E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 121(0x79, float:1.7E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 129(0x81, float:1.81E-43)
            if (r0 == r1) goto L_0x004d
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = 0
            return r0
        L_0x004d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0121h0.m823c():boolean");
    }

    /* renamed from: d */
    public static boolean m824d(int i) {
        int i2;
        if (!(i == 156 || i == 330 || i == 345 || i == 334 || (i2 = f1803v) == 54 || i2 == 55 || i2 == 56 || i2 == 57 || i2 == 58 || i2 == 59 || i2 == 103)) {
            int i3 = 0;
            for (int i4 = 0; i4 < f1768G.size(); i4++) {
                if (((C0165a) f1768G.elementAt(i4)).f2775a == i) {
                    i3++;
                }
            }
            if (i3 > 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m825e() {
        int i = f1803v;
        return i == 45 || i == 46 || i == 48;
    }

    /* renamed from: f */
    public static boolean m826f() {
        int i = 0;
        while (true) {
            int[] iArr = f1771J;
            if (i >= iArr.length) {
                return false;
            }
            if (f1803v == iArr[i]) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: g */
    public static boolean m827g() {
        int i = f1803v;
        return i == 39 || i == 40 || i == 41;
    }

    /* renamed from: h */
    public static boolean m828h() {
        int i = f1803v;
        return (i == 54 || i == 55 || i == 56 || i == 57 || i == 138) ? false : true;
    }

    /* renamed from: i */
    public static final void m829i(int i, int i2, int i3) {
        int[] iArr = f1789h;
        byte b = f1796o;
        int i4 = ((i2 / b) * f1782a) + (i / b);
        iArr[i4] = iArr[i4] & (i3 ^ -1);
    }

    /* renamed from: j */
    public static void m830j() {
        System.gc();
        if (f1787f != f1786e) {
            m822b();
            f1787f = f1786e;
        }
    }

    /* renamed from: k */
    public static void m831k(int i) {
        int i2 = f1783b;
        byte b = f1796o;
        f1785d = i2 * b;
        f1784c = f1782a * b;
        int i3 = i - 1;
        int i4 = 0;
        while (i4 < f1782a * f1783b) {
            try {
                int i5 = 0;
                while (true) {
                    int[][] iArr = f1772K;
                    if (i5 >= iArr[i3].length) {
                        break;
                    }
                    m838r(i4, f1773L[i3][i5], iArr[i3][i5]);
                    i5++;
                }
                i4++;
            } catch (Exception e) {
                e.printStackTrace();
                C0146b.f2678f.mo736c();
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m832l(int i) {
        DataInputStream dataInputStream = new DataInputStream(C0148a.m1395a("/mymap/" + f1803v));
        f1782a = (char) dataInputStream.read();
        f1783b = (char) dataInputStream.read();
        f1788g = new int[dataInputStream.available()];
        for (int i2 = 0; i2 < f1782a * f1783b; i2++) {
            f1788g[i2] = (char) dataInputStream.read();
        }
        f1789h = new int[f1788g.length];
    }

    /* renamed from: m */
    public static final void m833m() {
        if (f1791j == null) {
            f1791j = C0161h.m1496n("/tWater/wtf.png");
        }
        if (f1792k == null) {
            f1792k = C0161h.m1496n("/tWater/twtf.png");
        }
        if (f1793l == null) {
            f1793l = C0161h.m1496n("/tWater/wts.png");
        }
        if (f1794m == null) {
            f1794m = C0161h.m1496n("/tWater/wtsN.png");
        }
        if (f1795n == null) {
            f1795n = C0161h.m1496n("/tWater/wtsN2.png");
        }
        System.gc();
    }

    /* renamed from: n */
    public static final void m834n(C0159f fVar) {
        if (!C0145a.m1339K()) {
            for (int i = C0126k.f1848D1; i < C0126k.f1856F1; i++) {
                for (int i2 = C0126k.f1852E1; i2 < C0126k.f1860G1; i2++) {
                    if ((m840t(i, i2) & 64) == 64) {
                        int i3 = f1786e;
                        C0143b bVar = i3 == 5 ? f1794m : i3 == 8 ? f1795n : f1793l;
                        if (!m828h()) {
                            byte b = f1796o;
                            C0159f fVar2 = fVar;
                            C0143b bVar2 = bVar;
                            fVar2.mo779h(bVar2, 0, 0, 24, 24, 0, i * b, (b * i2) - 1, 0);
                            byte b2 = f1796o;
                            fVar2.mo779h(bVar2, 0, 0, 24, 24, 0, i * b2, (b2 * i2) - 3, 0);
                        }
                        int i4 = ((C0145a.f2600O % 8) >> 2) * 24;
                        byte b3 = f1796o;
                        fVar.mo779h(bVar, 0, i4, 24, 24, 0, i * b3, (b3 * i2) - 12, 0);
                        if (f1781T == 0 && m828h()) {
                            f1781T = (f1796o * i2) - 12;
                            int i5 = 16777215;
                            int i6 = C0145a.f2593K0;
                            if (i6 == 2) {
                                i5 = 10871287;
                            } else if (i6 == 4) {
                                i5 = 8111470;
                            } else if (i6 == 7) {
                                i5 = 5693125;
                            }
                            C0005a.m9b(i5, f1781T + 15);
                        }
                    }
                }
            }
            C0005a.m19s(fVar);
        }
    }

    /* renamed from: o */
    public static final void m835o(C0159f fVar, int i, int i2, int i3) {
        C0143b[] bVarArr = f1790i;
        if (bVarArr != null) {
            if (bVarArr.length == 1) {
                C0143b bVar = bVarArr[0];
                byte b = f1796o;
                fVar.mo779h(bVar, 0, i * b, b, b, 0, i2 * b, i3 * b, 0);
                return;
            }
            C0143b bVar2 = bVarArr[i];
            byte b2 = f1796o;
            C0159f fVar2 = fVar;
            fVar.mo776e(bVar2, i2 * b2, b2 * i3, 0);
        }
    }

    /* renamed from: p */
    public static final void m836p(C0159f fVar, int i, int i2, int i3, int i4, int i5) {
        C0143b[] bVarArr = f1790i;
        if (bVarArr != null) {
            if (bVarArr.length == 1) {
                fVar.mo779h(bVarArr[0], 0, i * i4, i4, i4, 0, i2, i3, 0);
                return;
            }
            C0159f fVar2 = fVar;
            fVar.mo776e(bVarArr[i], i2, i3, 0);
        }
    }

    /* renamed from: q */
    public static final void m837q(C0159f fVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C0159f fVar2;
        C0143b bVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0159f fVar3;
        C0159f fVar4 = fVar;
        if (!C0114e.f1394y4) {
            C0126k.m893c0().mo499N0(fVar4, 1);
            for (int i15 = C0126k.f1848D1; i15 < C0126k.f1856F1; i15++) {
                int i16 = C0126k.f1852E1;
                while (i16 < C0126k.f1860G1) {
                    int i17 = C0161h.f2758f;
                    if (i17 == 5 || i17 == 3) {
                        C0177m.f2926C.mo909a(fVar, "1", -5, -5, 0);
                    }
                    if (i15 != 0) {
                        int i18 = f1782a;
                        if (i15 != i18 - 1) {
                            int i19 = f1788g[(i18 * i16) + i15] - 1;
                            if ((m840t(i15, i16) & 256) != 256) {
                                if ((m840t(i15, i16) & 32) == 32) {
                                    bVar = f1791j;
                                    i7 = 0;
                                    i8 = ((C0145a.f2600O % 8) >> 1) * 24;
                                    i9 = 24;
                                    i10 = 24;
                                    i11 = 0;
                                    byte b = f1796o;
                                    i12 = i15 * b;
                                    int i20 = i16 * b;
                                    fVar3 = fVar;
                                    i = i16;
                                    i13 = i20;
                                    i14 = 0;
                                } else {
                                    i = i16;
                                    if ((m840t(i15, i) & 128) == 128) {
                                        bVar = f1792k;
                                        i7 = 0;
                                        i8 = ((C0145a.f2600O % 8) >> 1) * 24;
                                        i9 = 24;
                                        i10 = 24;
                                        i11 = 0;
                                        byte b2 = f1796o;
                                        i12 = i15 * b2;
                                        i13 = i * b2;
                                        i14 = 0;
                                        fVar3 = fVar;
                                    } else {
                                        int i21 = f1786e;
                                        if (i21 != 13) {
                                            if (i21 == 2 && (m840t(i15, i) & 512) == 512 && i19 != -1) {
                                                byte b3 = f1796o;
                                                int i22 = i19;
                                                m836p(fVar, i22, i15 * b3, i * b3, 24, 1);
                                                byte b4 = f1796o;
                                                m836p(fVar, i22, i15 * b4, (i * b4) + 1, 24, 24);
                                            }
                                            if ((m840t(i15, i) & 16) == 16) {
                                                int i23 = (f1796o * i15) - C0126k.f2028t1;
                                                f1797p = i23;
                                                int i24 = C0126k.f1985k1;
                                                int i25 = i23 - i24;
                                                f1798q = i25;
                                                byte b5 = f1796o;
                                                int i26 = ((b5 - 2) * i25) / b5;
                                                f1800s = i26;
                                                int i27 = i26 + i24;
                                                f1799r = i27;
                                                i4 = i27 + C0126k.f2028t1;
                                                i5 = i * f1796o;
                                                i2 = 24;
                                                i6 = 24;
                                                fVar2 = fVar;
                                                i3 = i19;
                                            } else if ((m840t(i15, i) & 512) == 512) {
                                                if (i19 != -1) {
                                                    byte b6 = f1796o;
                                                    i2 = 24;
                                                    i3 = i19;
                                                    m836p(fVar, i3, i15 * b6, i * b6, 24, 1);
                                                    byte b7 = f1796o;
                                                    i4 = i15 * b7;
                                                    i5 = (i * b7) + 1;
                                                    i6 = 24;
                                                    fVar2 = fVar;
                                                }
                                            } else if (i19 != -1) {
                                                m835o(fVar4, i19, i15, i);
                                            }
                                            m836p(fVar2, i3, i4, i5, i2, i6);
                                        } else if (C0145a.m1339K()) {
                                            if (i19 != -1) {
                                                m835o(fVar4, 0, i15, i);
                                            }
                                        } else {
                                            return;
                                        }
                                        i16 = i + 1;
                                    }
                                }
                                fVar3.mo779h(bVar, i7, i8, i9, i10, i11, i12, i13, i14);
                                i16 = i + 1;
                            }
                        }
                    }
                    i = i16;
                    i16 = i + 1;
                }
            }
            if (C0126k.f2028t1 < 24) {
                for (int i28 = C0126k.f1852E1; i28 < C0126k.f1860G1; i28++) {
                    int i29 = f1788g[(f1782a * i28) + 1] - 1;
                    if (i29 != -1) {
                        m835o(fVar4, i29, 0, i28);
                    }
                }
            }
            if (C0126k.f2028t1 > C0126k.f1840B1) {
                int i30 = f1782a - 2;
                for (int i31 = C0126k.f1852E1; i31 < C0126k.f1860G1; i31++) {
                    int i32 = f1788g[(f1782a * i31) + i30] - 1;
                    if (i32 != -1) {
                        m835o(fVar4, i32, i30 + 1, i31);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public static void m838r(int i, int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (f1788g[i] == i3) {
                int[] iArr2 = f1789h;
                iArr2[i] = i2 | iArr2[i];
                return;
            }
        }
    }

    /* renamed from: s */
    public static final void m839s(int i, int i2, int i3) {
        int[] iArr = f1789h;
        byte b = f1796o;
        int i4 = ((i2 / b) * f1782a) + (i / b);
        iArr[i4] = iArr[i4] | i3;
    }

    /* renamed from: t */
    public static final int m840t(int i, int i2) {
        try {
            return f1789h[(i2 * f1782a) + i];
        } catch (Exception unused) {
            return 1000;
        }
    }

    /* renamed from: u */
    public static final boolean m841u(int i, int i2, int i3) {
        try {
            int[] iArr = f1789h;
            byte b = f1796o;
            return (iArr[((i2 / b) * f1782a) + (i / b)] & i3) == i3;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static final int m842v(int i, int i2) {
        try {
            int[] iArr = f1789h;
            byte b = f1796o;
            return iArr[((i2 / b) * f1782a) + (i / b)];
        } catch (Exception unused) {
            return 1000;
        }
    }

    /* renamed from: w */
    public static final int m843w(int i) {
        byte b = f1796o;
        return (i / b) * b;
    }

    /* renamed from: x */
    public static final int m844x(int i) {
        byte b = f1796o;
        return (i / b) * b;
    }
}
