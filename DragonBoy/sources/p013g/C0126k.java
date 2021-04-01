package p013g;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import p000a.C0003d;
import p001b.C0005a;
import p001b.C0006b;
import p001b.C0007c;
import p001b.C0008d;
import p001b.C0009e;
import p001b.C0018n;
import p001b.C0020p;
import p010d.C0045c;
import p011e.C0047a0;
import p011e.C0050b0;
import p011e.C0052c;
import p011e.C0054c1;
import p011e.C0055d;
import p011e.C0056d0;
import p011e.C0057d1;
import p011e.C0058e;
import p011e.C0059e0;
import p011e.C0061f0;
import p011e.C0062g;
import p011e.C0063g0;
import p011e.C0064h;
import p011e.C0067i0;
import p011e.C0069j0;
import p011e.C0072l;
import p011e.C0073l0;
import p011e.C0074m;
import p011e.C0076n;
import p011e.C0077n0;
import p011e.C0078o;
import p011e.C0079o0;
import p011e.C0081p0;
import p011e.C0083q0;
import p011e.C0084r;
import p011e.C0085r0;
import p011e.C0087s0;
import p011e.C0090u;
import p011e.C0092v;
import p011e.C0096x;
import p011e.C0100z;
import p011e.C0101z0;
import p012f.C0103b;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0147c;
import p019j.C0149b;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0165a;
import p020k.C0167c;
import p020k.C0170f;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;
import p020k.C0176l;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.k */
public class C0126k extends C0178n implements C0127l {

    /* renamed from: A1 */
    public static int f1836A1 = 0;

    /* renamed from: A2 */
    public static boolean f1837A2 = false;

    /* renamed from: A3 */
    public static C0143b f1838A3 = C0161h.m1494l("/mainImage/myTexture2dbtnlf.png");

    /* renamed from: A4 */
    static int f1839A4 = 0;

    /* renamed from: B1 */
    public static int f1840B1 = 0;

    /* renamed from: B2 */
    public static boolean f1841B2 = false;

    /* renamed from: B3 */
    public static C0143b f1842B3 = C0161h.m1494l("/mainImage/myTexture2dbtnl2.png");

    /* renamed from: B4 */
    public static int f1843B4 = 0;

    /* renamed from: C1 */
    public static int f1844C1 = 0;

    /* renamed from: C2 */
    public static boolean f1845C2 = false;

    /* renamed from: C3 */
    public static C0143b f1846C3 = C0161h.m1494l("/mainImage/myTexture2dbtnlf2.png");

    /* renamed from: C4 */
    public static int f1847C4 = 0;

    /* renamed from: D1 */
    public static int f1848D1 = 0;

    /* renamed from: D2 */
    public static boolean f1849D2 = false;

    /* renamed from: D3 */
    public static C0143b f1850D3 = C0161h.m1494l("/mainImage/myTexture2danalog1.png");

    /* renamed from: D4 */
    static int f1851D4 = 0;

    /* renamed from: E1 */
    public static int f1852E1 = 0;

    /* renamed from: E2 */
    public static boolean f1853E2 = false;

    /* renamed from: E3 */
    public static C0143b f1854E3 = C0161h.m1494l("/mainImage/myTexture2danalog2.png");

    /* renamed from: E4 */
    static int f1855E4 = 0;

    /* renamed from: F1 */
    public static int f1856F1 = 0;

    /* renamed from: F2 */
    public static boolean f1857F2 = false;

    /* renamed from: F3 */
    public static byte f1858F3 = 0;

    /* renamed from: F4 */
    public static int[] f1859F4 = null;

    /* renamed from: G1 */
    public static int f1860G1 = 0;

    /* renamed from: G2 */
    public static boolean f1861G2 = false;

    /* renamed from: G3 */
    public static C0132q f1862G3 = new C0132q();

    /* renamed from: G4 */
    public static int[] f1863G4 = null;

    /* renamed from: H1 */
    public static int f1864H1 = 0;

    /* renamed from: H2 */
    public static boolean f1865H2 = false;

    /* renamed from: H3 */
    public static C0132q f1866H3 = new C0132q();

    /* renamed from: H4 */
    public static int f1867H4 = 0;

    /* renamed from: I1 */
    public static int f1868I1 = 0;

    /* renamed from: I2 */
    public static boolean f1869I2 = false;

    /* renamed from: I3 */
    public static C0143b f1870I3 = C0161h.m1494l("/mainImage/myTexture2dpanel.png");

    /* renamed from: I4 */
    public static int f1871I4 = 0;

    /* renamed from: J1 */
    public static C0083q0[] f1872J1 = null;

    /* renamed from: J2 */
    public static boolean f1873J2 = false;

    /* renamed from: J3 */
    public static C0143b f1874J3 = C0161h.m1494l("/mainImage/panel2.png");

    /* renamed from: J4 */
    public static int f1875J4 = 0;

    /* renamed from: K1 */
    public static C0052c[] f1876K1 = null;

    /* renamed from: K2 */
    public static boolean f1877K2 = false;

    /* renamed from: K3 */
    public static C0143b f1878K3 = C0161h.m1494l("/mainImage/myTexture2dHP.png");

    /* renamed from: K4 */
    public static String[] f1879K4 = new String[5];

    /* renamed from: L1 */
    public static C0058e[] f1880L1 = null;

    /* renamed from: L2 */
    public static boolean f1881L2 = false;

    /* renamed from: L3 */
    public static C0143b f1882L3 = C0161h.m1494l("/mainImage/myTexture2dMP.png");

    /* renamed from: L4 */
    public static int[] f1883L4 = new int[5];

    /* renamed from: M1 */
    public static C0061f0[] f1884M1 = null;

    /* renamed from: M2 */
    public static boolean f1885M2 = false;

    /* renamed from: M3 */
    public static C0143b f1886M3 = C0161h.m1494l("/mainImage/SP.png");

    /* renamed from: M4 */
    public static int[] f1887M4 = new int[5];

    /* renamed from: N1 */
    public static C0062g[] f1888N1 = null;

    /* renamed from: N2 */
    public static boolean f1889N2 = false;

    /* renamed from: N3 */
    public static C0143b f1890N3 = C0161h.m1494l("/mainImage/myTexture2dhpLost.png");

    /* renamed from: N4 */
    public static int[] f1891N4 = new int[5];

    /* renamed from: O1 */
    public static int f1892O1 = 0;

    /* renamed from: O2 */
    public static boolean f1893O2 = false;

    /* renamed from: O3 */
    public static C0143b f1894O3 = C0161h.m1494l("/mainImage/myTexture2dmpLost.png");

    /* renamed from: O4 */
    public static int[] f1895O4 = new int[5];

    /* renamed from: P1 */
    public static C0173i f1896P1 = new C0173i("vClan");

    /* renamed from: P2 */
    public static boolean f1897P2 = false;

    /* renamed from: P3 */
    public static int f1898P3 = 0;

    /* renamed from: P4 */
    public static int[] f1899P4 = new int[5];

    /* renamed from: Q1 */
    public static C0173i f1900Q1 = new C0173i("vFriend");

    /* renamed from: Q2 */
    public static boolean f1901Q2 = false;

    /* renamed from: Q3 */
    public static C0147c f1902Q3 = null;

    /* renamed from: Q4 */
    public static int[] f1903Q4 = new int[5];

    /* renamed from: R1 */
    public static C0173i f1904R1 = new C0173i("vEnemies");

    /* renamed from: R2 */
    public static boolean f1905R2 = false;

    /* renamed from: R3 */
    public static int f1906R3 = 0;

    /* renamed from: R4 */
    public static int[] f1907R4 = new int[8];

    /* renamed from: S1 */
    public static C0173i f1908S1 = new C0173i("vCharInMap");

    /* renamed from: S2 */
    public static boolean f1909S2 = false;

    /* renamed from: S3 */
    public static boolean f1910S3 = false;

    /* renamed from: S4 */
    public static int[] f1911S4 = new int[5];

    /* renamed from: T1 */
    public static C0173i f1912T1 = new C0173i("vItemMap");

    /* renamed from: T2 */
    public static C0114e f1913T2 = null;

    /* renamed from: T3 */
    public static boolean f1914T3 = false;

    /* renamed from: T4 */
    public static int[] f1915T4 = null;

    /* renamed from: U1 */
    public static C0173i f1916U1 = new C0173i("vMobAttack");

    /* renamed from: U2 */
    public static long[] f1917U2 = null;

    /* renamed from: U3 */
    public static C0077n0[] f1918U3 = {null, null, null, null, null};

    /* renamed from: U4 */
    public static int[] f1919U4 = null;

    /* renamed from: V1 */
    public static C0173i f1920V1 = new C0173i("vMob");

    /* renamed from: V2 */
    public static int[] f1921V2 = null;

    /* renamed from: V3 */
    public static C0077n0[] f1922V3 = {null, null, null, null, null};

    /* renamed from: V4 */
    public static int[] f1923V4 = null;

    /* renamed from: W1 */
    public static C0173i f1924W1 = new C0173i("vNpc");

    /* renamed from: W2 */
    public static int[] f1925W2 = null;

    /* renamed from: W3 */
    public static int f1926W3 = 0;

    /* renamed from: W4 */
    public static int[] f1927W4 = null;

    /* renamed from: X1 */
    public static C0173i f1928X1 = new C0173i("vFlag");

    /* renamed from: X2 */
    public static C0143b f1929X2 = C0161h.m1494l("/mainImage/myTexture2dstat.png");

    /* renamed from: X3 */
    public static int f1930X3 = 0;

    /* renamed from: X4 */
    public static int[] f1931X4 = null;

    /* renamed from: Y1 */
    public static C0047a0[] f1932Y1 = null;

    /* renamed from: Y2 */
    public static C0143b f1933Y2 = C0161h.m1494l("/mainImage/myTexture2dlineColor20.png");

    /* renamed from: Y3 */
    public static long f1934Y3 = 0;

    /* renamed from: Y4 */
    public static C0143b[] f1935Y4 = null;

    /* renamed from: Z1 */
    public static int f1936Z1 = 0;

    /* renamed from: Z2 */
    public static C0143b f1937Z2 = C0161h.m1494l("/mainImage/myTexture2dlineColor21.png");

    /* renamed from: Z3 */
    public static boolean f1938Z3 = false;

    /* renamed from: Z4 */
    public static int f1939Z4 = 0;

    /* renamed from: a2 */
    public static int f1940a2 = -1;

    /* renamed from: a3 */
    public static C0143b f1941a3 = C0161h.m1494l("/mainImage/myTexture2dlineColor22.png");

    /* renamed from: a4 */
    public static C0143b f1942a4 = C0161h.m1494l("/bg/trans.png");

    /* renamed from: a5 */
    public static int f1943a5 = 0;

    /* renamed from: b2 */
    public static int f1944b2 = 0;

    /* renamed from: b3 */
    public static C0143b f1945b3 = C0161h.m1494l("/mainImage/myTexture2dlineColor00.png");

    /* renamed from: b4 */
    public static int f1946b4 = 0;

    /* renamed from: b5 */
    public static int f1947b5 = 0;

    /* renamed from: c2 */
    private static C0073l0 f1948c2 = new C0073l0();

    /* renamed from: c3 */
    public static C0143b f1949c3 = C0161h.m1494l("/mainImage/myTexture2dlineColor01.png");

    /* renamed from: c4 */
    public static boolean f1950c4 = false;

    /* renamed from: c5 */
    public static int f1951c5 = 0;

    /* renamed from: d2 */
    public static C0073l0 f1952d2 = new C0073l0();

    /* renamed from: d3 */
    public static C0143b f1953d3 = C0161h.m1494l("/mainImage/myTexture2dlineColor02.png");

    /* renamed from: d4 */
    public static boolean f1954d4 = false;

    /* renamed from: d5 */
    public static int f1955d5 = 0;

    /* renamed from: e2 */
    public static boolean f1956e2 = false;

    /* renamed from: e3 */
    public static byte f1957e3 = 0;

    /* renamed from: e4 */
    public static boolean f1958e4 = false;

    /* renamed from: e5 */
    public static int f1959e5 = 140;

    /* renamed from: f1 */
    public static boolean f1960f1 = false;

    /* renamed from: f2 */
    public static int f1961f2 = 0;

    /* renamed from: f3 */
    public static byte f1962f3 = 0;

    /* renamed from: f4 */
    public static int f1963f4 = 0;

    /* renamed from: f5 */
    public static int f1964f5 = 160;

    /* renamed from: g1 */
    public static boolean f1965g1 = false;

    /* renamed from: g2 */
    public static boolean f1966g2 = false;

    /* renamed from: g3 */
    public static byte f1967g3;

    /* renamed from: g4 */
    public static long f1968g4;

    /* renamed from: g5 */
    public static int f1969g5;

    /* renamed from: h1 */
    public static C0126k f1970h1;

    /* renamed from: h2 */
    public static boolean f1971h2 = false;

    /* renamed from: h3 */
    public static byte f1972h3;

    /* renamed from: h4 */
    public static long f1973h4;

    /* renamed from: h5 */
    public static int f1974h5;

    /* renamed from: i1 */
    public static int f1975i1;

    /* renamed from: i2 */
    public static boolean f1976i2 = false;

    /* renamed from: i3 */
    public static byte f1977i3;

    /* renamed from: i4 */
    public static long f1978i4;

    /* renamed from: i5 */
    public static int f1979i5;

    /* renamed from: j1 */
    public static int f1980j1;

    /* renamed from: j2 */
    public static boolean f1981j2 = false;

    /* renamed from: j3 */
    public static byte f1982j3;

    /* renamed from: j4 */
    public static long f1983j4;

    /* renamed from: j5 */
    public static int f1984j5;

    /* renamed from: k1 */
    public static int f1985k1;

    /* renamed from: k2 */
    public static boolean f1986k2 = false;

    /* renamed from: k3 */
    public static byte f1987k3;

    /* renamed from: k4 */
    public static int f1988k4;

    /* renamed from: k5 */
    public static int f1989k5;

    /* renamed from: l1 */
    public static int f1990l1;

    /* renamed from: l2 */
    public static boolean f1991l2 = false;

    /* renamed from: l3 */
    public static byte f1992l3;

    /* renamed from: l4 */
    public static int f1993l4;

    /* renamed from: l5 */
    public static boolean f1994l5 = false;

    /* renamed from: m1 */
    public static int f1995m1;

    /* renamed from: m2 */
    public static boolean f1996m2 = false;

    /* renamed from: m3 */
    public static C0143b f1997m3 = C0161h.m1494l("/mainImage/myTexture2dchat.png");

    /* renamed from: m4 */
    public static C0143b f1998m4 = C0161h.m1494l("/mainImage/myTexture2dnut.png");

    /* renamed from: m5 */
    public static boolean f1999m5 = false;

    /* renamed from: n1 */
    public static int f2000n1;

    /* renamed from: n2 */
    public static boolean f2001n2 = false;

    /* renamed from: n3 */
    public static C0143b f2002n3 = C0161h.m1494l("/mainImage/myTexture2dchat2.png");

    /* renamed from: n4 */
    public static C0143b f2003n4 = C0161h.m1494l("/mainImage/myTexture2dnutF.png");

    /* renamed from: n5 */
    public static Vector f2004n5 = new Vector();

    /* renamed from: o1 */
    public static int f2005o1;

    /* renamed from: o2 */
    public static boolean f2006o2 = false;

    /* renamed from: o3 */
    public static C0143b f2007o3 = C0161h.m1494l("/mainImage/myTexture2dmenu.png");

    /* renamed from: o4 */
    public static C0143b f2008o4;

    /* renamed from: o5 */
    public static boolean f2009o5;

    /* renamed from: p1 */
    public static int f2010p1;

    /* renamed from: p2 */
    public static boolean f2011p2 = false;

    /* renamed from: p3 */
    public static C0143b f2012p3 = C0161h.m1494l("/mainImage/myTexture2dfocus.png");

    /* renamed from: p4 */
    public static int f2013p4;

    /* renamed from: p5 */
    public static byte f2014p5;

    /* renamed from: q1 */
    public static int f2015q1;

    /* renamed from: q2 */
    public static boolean f2016q2 = false;

    /* renamed from: q3 */
    public static C0143b f2017q3 = C0161h.m1494l("/mainImage/myTexture2dfocus2.png");

    /* renamed from: q4 */
    public static boolean f2018q4 = true;

    /* renamed from: q5 */
    public static byte f2019q5;

    /* renamed from: r1 */
    public static int f2020r1;

    /* renamed from: r2 */
    public static boolean f2021r2 = false;

    /* renamed from: r3 */
    public static C0143b f2022r3 = C0161h.m1494l("/mainImage/myTexture2dskill.png");

    /* renamed from: r4 */
    public static int f2023r4;

    /* renamed from: s1 */
    public static int f2024s1;

    /* renamed from: s2 */
    public static boolean f2025s2 = false;

    /* renamed from: s3 */
    public static C0143b f2026s3 = C0161h.m1494l("/mainImage/myTexture2dskill2.png");

    /* renamed from: s4 */
    private static int[] f2027s4 = {3, -3, 3, -3};

    /* renamed from: t1 */
    public static int f2028t1;

    /* renamed from: t2 */
    public static boolean f2029t2 = false;

    /* renamed from: t3 */
    public static C0143b f2030t3 = C0161h.m1494l("/mainImage/myTexture2dPea0.png");

    /* renamed from: t4 */
    private static int[] f2031t4 = {3, -3, -3, 3};

    /* renamed from: u1 */
    public static int f2032u1;

    /* renamed from: u2 */
    public static boolean f2033u2 = false;

    /* renamed from: u3 */
    public static C0143b f2034u3 = C0161h.m1494l("/mainImage/myTexture2dPea1.png");

    /* renamed from: u4 */
    public static C0173i f2035u4 = new C0173i("");

    /* renamed from: v1 */
    public static int f2036v1;

    /* renamed from: v2 */
    public static boolean f2037v2 = false;

    /* renamed from: v3 */
    public static C0143b f2038v3 = C0161h.m1494l("/mainImage/myTexture2dPea2.png");

    /* renamed from: v4 */
    public static C0143b f2039v4 = C0161h.m1494l("/mainImage/myTexture2darrow3.png");

    /* renamed from: w1 */
    public static int f2040w1;

    /* renamed from: w2 */
    public static boolean f2041w2 = false;

    /* renamed from: w3 */
    public static C0143b f2042w3 = C0161h.m1494l("/mainImage/myTexture2dPea3.png");

    /* renamed from: w4 */
    static int f2043w4;

    /* renamed from: x1 */
    public static int f2044x1;

    /* renamed from: x2 */
    public static boolean f2045x2 = false;

    /* renamed from: x3 */
    public static C0143b f2046x3 = C0161h.m1494l("/mainImage/myTexture2dfirebtn0.png");

    /* renamed from: x4 */
    static int f2047x4;

    /* renamed from: y1 */
    public static int f2048y1;

    /* renamed from: y2 */
    public static boolean f2049y2 = false;

    /* renamed from: y3 */
    public static C0143b f2050y3 = C0161h.m1494l("/mainImage/myTexture2dfirebtn1.png");

    /* renamed from: y4 */
    static int f2051y4;

    /* renamed from: z1 */
    public static int f2052z1;

    /* renamed from: z2 */
    public static boolean f2053z2 = false;

    /* renamed from: z3 */
    public static C0143b f2054z3 = C0161h.m1494l("/mainImage/myTexture2dbtnl.png");

    /* renamed from: z4 */
    static int f2055z4;

    /* renamed from: A */
    public C0137v f2056A;

    /* renamed from: A0 */
    public int f2057A0;

    /* renamed from: B */
    public C0092v f2058B;

    /* renamed from: B0 */
    public int f2059B0;

    /* renamed from: C */
    public int f2060C;

    /* renamed from: C0 */
    public boolean f2061C0;

    /* renamed from: D */
    public C0055d f2062D;

    /* renamed from: D0 */
    public int f2063D0;

    /* renamed from: E */
    public boolean f2064E;

    /* renamed from: E0 */
    public int f2065E0;

    /* renamed from: F */
    public boolean f2066F;

    /* renamed from: F0 */
    public boolean f2067F0;

    /* renamed from: G */
    int f2068G;

    /* renamed from: G0 */
    long f2069G0;

    /* renamed from: H */
    int f2070H;

    /* renamed from: H0 */
    long f2071H0;

    /* renamed from: I */
    int f2072I;

    /* renamed from: I0 */
    int f2073I0;

    /* renamed from: J */
    int f2074J;

    /* renamed from: J0 */
    int f2075J0;

    /* renamed from: K */
    int f2076K;

    /* renamed from: K0 */
    String f2077K0;

    /* renamed from: L */
    boolean f2078L;

    /* renamed from: L0 */
    public C0055d f2079L0;

    /* renamed from: M */
    public long f2080M;

    /* renamed from: M0 */
    public C0069j0 f2081M0;

    /* renamed from: N */
    boolean f2082N;

    /* renamed from: N0 */
    public boolean f2083N0 = false;

    /* renamed from: O */
    boolean f2084O;

    /* renamed from: O0 */
    public int[] f2085O0;

    /* renamed from: P */
    int f2086P;

    /* renamed from: P0 */
    public int[] f2087P0;

    /* renamed from: Q */
    int f2088Q;

    /* renamed from: Q0 */
    public int[] f2089Q0;

    /* renamed from: R */
    int f2090R;

    /* renamed from: R0 */
    public int[] f2091R0;

    /* renamed from: S */
    int f2092S;

    /* renamed from: S0 */
    public int[] f2093S0;

    /* renamed from: T */
    long f2094T;

    /* renamed from: T0 */
    public int f2095T0;

    /* renamed from: U */
    long f2096U;

    /* renamed from: U0 */
    String f2097U0;

    /* renamed from: V */
    public int f2098V;

    /* renamed from: V0 */
    int f2099V0;

    /* renamed from: W */
    int f2100W;

    /* renamed from: W0 */
    int f2101W0;

    /* renamed from: X */
    public boolean f2102X;

    /* renamed from: X0 */
    int f2103X0;

    /* renamed from: Y */
    public boolean f2104Y;

    /* renamed from: Y0 */
    boolean f2105Y0;

    /* renamed from: Z */
    public boolean f2106Z = false;

    /* renamed from: Z0 */
    public byte f2107Z0;

    /* renamed from: a0 */
    public boolean f2108a0 = false;

    /* renamed from: a1 */
    public boolean f2109a1;

    /* renamed from: b0 */
    public boolean f2110b0 = false;

    /* renamed from: b1 */
    public int f2111b1;

    /* renamed from: c0 */
    public int f2112c0;

    /* renamed from: c1 */
    String f2113c1 = "";

    /* renamed from: d0 */
    public int f2114d0;

    /* renamed from: d1 */
    String[] f2115d1;

    /* renamed from: e0 */
    public int f2116e0;

    /* renamed from: e1 */
    public C0084r[] f2117e1;

    /* renamed from: f0 */
    public int f2118f0;

    /* renamed from: g0 */
    public boolean f2119g0;

    /* renamed from: h0 */
    public boolean f2120h0;

    /* renamed from: i */
    public C0055d f2121i;

    /* renamed from: i0 */
    public int f2122i0;

    /* renamed from: j */
    public C0081p0[] f2123j;

    /* renamed from: j0 */
    public int f2124j0;

    /* renamed from: k */
    public int f2125k = 0;

    /* renamed from: k0 */
    public int f2126k0;

    /* renamed from: l */
    public int[] f2127l;

    /* renamed from: l0 */
    public int f2128l0;

    /* renamed from: m */
    public int[] f2129m;

    /* renamed from: m0 */
    public int f2130m0;

    /* renamed from: n */
    public int[] f2131n;

    /* renamed from: n0 */
    public int f2132n0;

    /* renamed from: o */
    public int[] f2133o;

    /* renamed from: o0 */
    int f2134o0;

    /* renamed from: p */
    public int[] f2135p;

    /* renamed from: p0 */
    int f2136p0 = 0;

    /* renamed from: q */
    public int[] f2137q;

    /* renamed from: q0 */
    int f2138q0 = -1;

    /* renamed from: r */
    public String[] f2139r;

    /* renamed from: r0 */
    C0077n0 f2140r0;

    /* renamed from: s */
    public String[] f2141s;

    /* renamed from: s0 */
    public String f2142s0;

    /* renamed from: t */
    public int f2143t = 0;

    /* renamed from: t0 */
    public boolean f2144t0;

    /* renamed from: u */
    public int f2145u = 0;

    /* renamed from: u0 */
    int f2146u0;

    /* renamed from: v */
    public int f2147v = -1;

    /* renamed from: v0 */
    public int f2148v0 = -1;

    /* renamed from: w */
    public boolean f2149w;

    /* renamed from: w0 */
    public int f2150w0 = 0;

    /* renamed from: x */
    public C0173i f2151x;

    /* renamed from: x0 */
    public int[] f2152x0;

    /* renamed from: y */
    public int f2153y;

    /* renamed from: y0 */
    public String f2154y0;

    /* renamed from: z */
    public int f2155z;

    /* renamed from: z0 */
    private int f2156z0 = 0;

    static {
        new C0173i("vPtMap");
        new C0173i("vSet");
        new C0173i("vItemUpGrade");
        f1902Q3 = new C0147c();
        f1906R3 = 0;
        if (C0145a.f2659x) {
            C0161h.m1494l("/mainImage/myTexture2darrow.png");
            C0161h.m1494l("/mainImage/myTexture2darrow2.png");
            C0111c0.m584k("games--javaAnalog: " + f1910S3);
            if (!f1910S3) {
                f1906R3 = C0149b.m1399d("analog") == 1 ? 1 : 0;
                f1902Q3 = new C0147c();
            }
        }
        byte[] c = C0149b.m1398c("NRdataVersion");
        byte[] c2 = C0149b.m1398c("NRmapVersion");
        byte[] c3 = C0149b.m1398c("NRskillVersion");
        byte[] c4 = C0149b.m1398c("NRitemVersion");
        if (c != null) {
            f1957e3 = c[0];
        }
        if (c2 != null) {
            f1962f3 = c2[0];
        }
        if (c3 != null) {
            f1967g3 = c3[0];
        }
        if (c4 != null) {
            f1972h3 = c4[0];
        }
        for (int i = 0; i < 5; i++) {
            f1903Q4[i] = -1;
        }
    }

    public C0126k() {
        if (C0145a.f2614V != 128) {
            int i = C0145a.f2616W;
        }
        new C0055d("", 11021);
        this.f2062D = new C0055d("  ", 11000);
        this.f2121i = new C0055d("", 11001);
        C0055d dVar = this.f2062D;
        C0143b bVar = f2007o3;
        dVar.f405f = bVar;
        dVar.f409j = C0159f.m1451u(bVar) + 20;
        C0055d dVar2 = this.f2062D;
        dVar2.f404e = false;
        C0055d dVar3 = this.f2121i;
        dVar3.f405f = f2012p3;
        boolean z = C0145a.f2659x;
        dVar2.f407h = 0;
        if (z) {
            dVar2.f408i = 50;
            this.f2121i = null;
        } else {
            int i2 = f1980j1;
            dVar2.f408i = i2 - 30;
            dVar3.f407h = f1975i1 - 32;
            dVar3.f408i = i2 - 32;
        }
        this.f2973c = this.f2121i;
        f1993l4 = 1;
        if (z) {
            f2001n2 = true;
        }
    }

    /* renamed from: A */
    private boolean m854A(int i, int i2) {
        if (equals(f1866H3) && m893c0().f2081M0 != null) {
            return false;
        }
        C0132q qVar = f1866H3;
        C0131p pVar = qVar.f2175b.f897b;
        if (!(pVar == null || pVar.f2168c == null)) {
            int a = C0111c0.m574a(qVar.f2184k);
            C0132q qVar2 = f1866H3;
            int i3 = (a + qVar2.f2175b.f907l) - 40;
            int a2 = C0111c0.m574a(qVar2.f2180g);
            C0074m mVar = f1866H3.f2175b;
            if (m900k0(i - f2028t1, i2 - f2032u1, i3, a2 + mVar.f908m, 200, mVar.f910o)) {
                f1866H3.mo564c(10);
                return true;
            }
        }
        return false;
    }

    /* renamed from: A0 */
    public static final void m855A0(boolean z, int i, int i2) {
        C0140y yVar;
        f1975i1 = C0145a.f2614V;
        f2020r1 = 39;
        f1980j1 = C0145a.f2616W;
        C0059e0 e0Var = C0145a.f2642l0;
        int i3 = C0059e0.f791c;
        int i4 = C0145a.f2616W / 6;
        f2015q1 = i4;
        if (i4 < 48) {
            f2015q1 = 48;
        }
        int i5 = f1975i1;
        f1985k1 = i5 >> 1;
        int i6 = f1980j1;
        f2010p1 = i6 >> 1;
        int i7 = i5 / 3;
        int i8 = i6 / 3;
        f2005o1 = i6 - 120;
        f2000n1 = (i6 * 2) / 3;
        int i9 = (i5 * 3) / 4;
        int i10 = (i6 * 3) / 4;
        f2024s1 = i5 / 6;
        int i11 = i6 / 6;
        byte b = C0121h0.f1796o;
        int i12 = (i5 / b) + 2;
        f1990l1 = i12;
        f1995m1 = (f1980j1 / b) + 2;
        boolean z2 = true;
        if (f1975i1 % 24 != 0) {
            f1990l1 = i12 + 1;
        }
        f1840B1 = ((C0121h0.f1782a - 1) * C0121h0.f1796o) - f1975i1;
        f1844C1 = ((C0121h0.f1783b - 1) * C0121h0.f1796o) - f1980j1;
        if (i == -1 && i2 == -1) {
            int i13 = (C0114e.m647e0().f1593n - f1985k1) + (f2024s1 * C0114e.m647e0().f1633v);
            f2052z1 = i13;
            f2028t1 = i13;
            int i14 = C0114e.m647e0().f1598o - f2000n1;
            f1836A1 = i14;
            f2032u1 = i14;
        } else {
            int i15 = (i - f2005o1) + (f2024s1 * C0114e.m647e0().f1633v);
            f2052z1 = i15;
            f2028t1 = i15;
            int i16 = i2 - f2000n1;
            f1836A1 = i16;
            f2032u1 = i16;
        }
        int i17 = f2032u1;
        if (f2028t1 < 24) {
            f2052z1 = 24;
            f2028t1 = 24;
        }
        int i18 = f2028t1;
        int i19 = f1840B1;
        if (i18 > i19) {
            f2052z1 = i19;
            f2028t1 = i19;
        }
        if (i17 < 0) {
            f1836A1 = 0;
            f2032u1 = 0;
        }
        int i20 = f2032u1;
        int i21 = f1844C1;
        if (i20 > i21) {
            f1836A1 = i21;
            f2032u1 = i21;
        }
        int i22 = f2028t1;
        byte b2 = C0121h0.f1796o;
        int i23 = (i22 / b2) - 1;
        f1848D1 = i23;
        if (i23 < 0) {
            f1848D1 = 0;
        }
        int i24 = f2032u1 / b2;
        f1852E1 = i24;
        f1856F1 = f1848D1 + f1990l1;
        int i25 = f1995m1 + i24;
        f1860G1 = i25;
        if (i24 < 0) {
            f1852E1 = 0;
        }
        int i26 = C0121h0.f1783b;
        if (i25 > i26 - 1) {
            f1860G1 = i26 - 1;
        }
        int i27 = (f1856F1 - f1848D1) * 4;
        C0121h0.f1779R = i27;
        int i28 = C0121h0.f1782a;
        if (i27 > i28) {
            C0121h0.f1779R = i28;
        }
        int i29 = (f1860G1 - f1852E1) * 4;
        C0121h0.f1780S = i29;
        int i30 = C0121h0.f1783b;
        if (i29 > i30) {
            C0121h0.f1780S = i30;
        }
        int i31 = (C0114e.m647e0().f1593n - (f1975i1 * 2)) / C0121h0.f1796o;
        C0121h0.f1775N = i31;
        if (i31 < 0) {
            C0121h0.f1775N = 0;
        }
        int i32 = C0121h0.f1775N + C0121h0.f1779R;
        C0121h0.f1776O = i32;
        int i33 = C0121h0.f1782a;
        if (i32 > i33) {
            C0121h0.f1776O = i33;
        }
        int i34 = (C0114e.m647e0().f1598o - (f1980j1 * 2)) / C0121h0.f1796o;
        C0121h0.f1777P = i34;
        if (i34 < 0) {
            C0121h0.f1777P = 0;
        }
        int i35 = C0121h0.f1777P + C0121h0.f1780S;
        C0121h0.f1778Q = i35;
        int i36 = C0121h0.f1783b;
        if (i35 > i36) {
            C0121h0.f1778Q = i36;
        }
        C0167c.m1522b().f2791c = f1970h1;
        C0167c.m1522b().f2789a.f2900b = (C0145a.f2616W - 35) - C0167c.m1522b().f2789a.f2902d;
        C0167c.m1522b().mo821c();
        int i37 = 40;
        if (C0145a.f2659x) {
            f2043w4 = f1980j1 - 88;
            f2047x4 = f1975i1 - 40;
            f2051y4 = 2;
            int i38 = C0145a.f2614V;
            if (i38 <= 240) {
                f2047x4 = f1975i1 - 35;
                f2051y4 = 5;
            }
            int i39 = f1975i1;
            int i40 = i39 - 55;
            f2055z4 = i40;
            int i41 = f2043w4;
            int i42 = i41 + 35;
            f1839A4 = i42;
            int i43 = i39 - 37;
            f1851D4 = i43;
            int i44 = i41 - 1;
            f1855E4 = i44;
            if (i38 >= 450) {
                f1855E4 = i44 - 12;
                f1847C4 -= 7;
                f2055z4 = i40 - 10;
                f1839A4 = i42 - 5;
                f1851D4 = i43 - 10;
            }
        }
        m903r1();
        if (C0145a.f2614V <= 200) {
            i37 = 30;
        }
        f2013p4 = i37;
        if (C0149b.m1399d("viewchat") == -1) {
            yVar = C0145a.f2629e0;
        } else {
            yVar = C0145a.f2629e0;
            if (C0149b.m1399d("viewchat") != 1) {
                z2 = false;
            }
        }
        yVar.f2523s1 = z2;
    }

    /* renamed from: A1 */
    private static final void m856A1() {
        if (!f1960f1) {
            int i = f2028t1;
            int i2 = f2052z1;
            if (!(i == i2 && f2032u1 == f1836A1)) {
                int i3 = (i2 - i) << 2;
                f2044x1 = i3;
                int i4 = f1836A1;
                int i5 = f2032u1;
                int i6 = (i4 - i5) << 2;
                f2048y1 = i6;
                int i7 = f2036v1 + i3;
                f2036v1 = i7;
                int i8 = i + (i7 >> 4);
                f2028t1 = i8;
                f2036v1 = i7 & 15;
                int i9 = f2040w1 + i6;
                f2040w1 = i9;
                int i10 = i5 + (i9 >> 4);
                f2032u1 = i10;
                f2040w1 = i9 & 15;
                if (i8 < 24) {
                    f2028t1 = 24;
                }
                int i11 = f2028t1;
                int i12 = f1840B1;
                if (i11 > i12) {
                    f2028t1 = i12;
                }
                if (i10 < 0) {
                    f2032u1 = 0;
                }
                int i13 = f2032u1;
                int i14 = f1844C1;
                if (i13 > i14) {
                    f2032u1 = i14;
                }
            }
            int i15 = f2028t1;
            byte b = C0121h0.f1796o;
            int i16 = (i15 / b) - 1;
            f1848D1 = i16;
            if (i16 < 0) {
                f1848D1 = 0;
            }
            int i17 = f2032u1 / b;
            f1852E1 = i17;
            f1856F1 = f1848D1 + f1990l1;
            int i18 = f1995m1 + i17;
            f1860G1 = i18;
            if (i17 < 0) {
                f1852E1 = 0;
            }
            int i19 = C0121h0.f1783b;
            if (i18 > i19 - 1) {
                f1860G1 = i19 - 1;
            }
            int i20 = (C0114e.m647e0().f1593n - (f1975i1 * 2)) / C0121h0.f1796o;
            C0121h0.f1775N = i20;
            if (i20 < 0) {
                C0121h0.f1775N = 0;
            }
            int i21 = C0121h0.f1775N + C0121h0.f1779R;
            C0121h0.f1776O = i21;
            int i22 = C0121h0.f1782a;
            if (i21 > i22) {
                C0121h0.f1776O = i22;
                C0121h0.f1775N = i22 - C0121h0.f1779R;
            }
            int i23 = (C0114e.m647e0().f1598o - (f1980j1 * 2)) / C0121h0.f1796o;
            C0121h0.f1777P = i23;
            if (i23 < 0) {
                C0121h0.f1777P = 0;
            }
            int i24 = C0121h0.f1777P + C0121h0.f1780S;
            C0121h0.f1778Q = i24;
            int i25 = C0121h0.f1783b;
            if (i24 > i25) {
                C0121h0.f1778Q = i25;
                C0121h0.f1777P = i25 - C0121h0.f1780S;
            }
            f1952d2.mo161g();
            f1948c2.mo161g();
        }
    }

    /* renamed from: B */
    private void m857B() {
        int i = C0145a.f2586H + this.f2090R;
        int i2 = C0145a.f2588I + this.f2092S;
        int i3 = C0114e.m647e0().f1598o;
        if (!this.f2149w) {
            C0128m Y = m885Y(i, i2);
            if (Y != null) {
                if ((Y instanceof C0137v) && !mo547s0((C0137v) Y)) {
                    m907w(i, i2);
                } else if (!m908x(Y)) {
                    if (Y.equals(C0114e.m647e0().f1467O0) || this.f2056A == null) {
                        if (C0114e.m647e0().mo394N() && C0114e.m647e0().f1472P0 != null && !Y.equals(C0114e.m647e0().f1472P0) && !Y.equals(C0114e.m647e0().f1472P0.f1457M0) && (Y instanceof C0114e)) {
                            C0114e eVar = (C0114e) Y;
                            if (eVar.f1437I0 != 5 && !eVar.mo394N()) {
                                m907w(i, i2);
                                return;
                            }
                        }
                        if (C0121h0.f1803v != 51 || !Y.equals(C0114e.m647e0().f1467O0)) {
                            m876M(Y);
                        } else {
                            m907w(i, i2);
                        }
                    }
                }
            } else if (!m911z(i, i2) && !m854A(i, i2)) {
                m907w(i, i2);
            }
        }
    }

    /* renamed from: B0 */
    private void m858B0() {
        C0111c0.m584k("LOAD DEFAULT KEY SKILL");
        int i = 0;
        while (i < f1918U3.length && i < C0114e.m647e0().f1629u0.size()) {
            f1918U3[i] = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i);
            i++;
        }
        mo532m1();
    }

    /* renamed from: C */
    private void m859C() {
        int i;
        int i2;
        int i3;
        if (!f1902Q3.mo739b() && f1906R3 != 1) {
            C0114e.m647e0().f1564h0 = true;
            if (!f1914T3) {
                if (C0145a.f2624b1) {
                    C0145a.f2624b1 = false;
                    this.f2064E = true;
                    this.f2076K = 0;
                    int i4 = C0145a.f2586H;
                    this.f2072I = i4;
                    this.f2068G = i4;
                    int i5 = C0145a.f2588I;
                    this.f2074J = i5;
                    this.f2070H = i5;
                }
                if (this.f2064E) {
                    int i6 = C0145a.f2586H - this.f2068G;
                    int i7 = C0145a.f2588I - this.f2070H;
                    if (!this.f2066F && (C0111c0.m574a(C0145a.f2586H - this.f2072I) > 15 || C0111c0.m574a(C0145a.f2588I - this.f2074J) > 15)) {
                        this.f2066F = true;
                    }
                    this.f2068G = C0145a.f2586H;
                    this.f2070H = C0145a.f2588I;
                    this.f2076K++;
                    if (this.f2066F) {
                        C0114e.m647e0().f1564h0 = false;
                        int i8 = f2028t1 - i6;
                        f2028t1 = i8;
                        f2032u1 -= i7;
                        int i9 = 24;
                        if (i8 < 24 && (i3 = (24 - i8) / 3) != 0) {
                            f2028t1 = i8 + (i6 - (i6 / i3));
                        }
                        if (f2028t1 < (mo560z0() ? 24 : 0)) {
                            f2028t1 = mo560z0() ? 24 : 0;
                        }
                        int i10 = f2028t1;
                        int i11 = f1840B1;
                        if (i10 > i11 && (i2 = (i10 - i11) / 3) != 0) {
                            f2028t1 = i10 + (i6 - (i6 / i2));
                        }
                        if (f2028t1 > i11 + (mo560z0() ? 0 : 24)) {
                            f2028t1 = f1840B1 + (mo560z0() ? 0 : 24);
                        }
                        int i12 = f2032u1;
                        if (i12 < 0 && (i = (0 - i12) / 3) != 0) {
                            f2032u1 = i12 + (i7 - (i7 / i));
                        }
                        if (f2032u1 < (-(mo560z0() ? 0 : 24))) {
                            if (mo560z0()) {
                                i9 = 0;
                            }
                            f2032u1 = -i9;
                        }
                        int i13 = f2032u1;
                        int i14 = f1844C1;
                        if (i13 > i14) {
                            f2032u1 = i14;
                        }
                        f2052z1 = f2028t1;
                        f1836A1 = f2032u1;
                    }
                }
                if (this.f2064E && C0145a.f2582F) {
                    this.f2064E = false;
                    this.f2066F = false;
                    if (C0111c0.m574a(C0145a.f2586H - this.f2072I) > 15 || C0111c0.m574a(C0145a.f2588I - this.f2074J) > 15) {
                        C0145a.f2582F = false;
                    }
                }
            }
        }
    }

    /* renamed from: C0 */
    private void m860C0() {
        C0111c0.m584k("LOAD DEFAULT ONSCREEN SKILL");
        int i = 0;
        while (i < f1922V3.length && i < C0114e.m647e0().f1629u0.size()) {
            f1922V3[i] = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i);
            i++;
        }
        mo535n1();
    }

    /* renamed from: C1 */
    private void m861C1() {
        int i = this.f2156z0;
        if (i > 0) {
            this.f2156z0 = i - 1;
        }
        if (this.f2082N) {
            this.f2082N = false;
            C0128m Y = m885Y(this.f2086P, this.f2088Q);
            if (Y == null || (Y != null && Y.equals(C0114e.m647e0().f1467O0) && C0121h0.f1803v == 51)) {
                C0020p.m96c(134, this.f2086P, this.f2088Q + (C0145a.f2595L0 / 2), 3);
            }
        }
    }

    /* renamed from: D */
    private void m862D(C0128m mVar) {
        int i;
        if (mVar != null && this.f2156z0 <= 0) {
            this.f2156z0 = 10;
            int a = C0111c0.m574a(C0114e.m647e0().f1593n - mVar.mo176c());
            int i2 = a <= 80 ? 1 : (a <= 80 || a > 200) ? (a <= 200 || a > 400) ? 4 : 3 : 2;
            if (mVar.equals(C0114e.m647e0().f1452L0) || (mVar.equals(C0114e.m647e0().f1472P0) && C0114e.m647e0().mo409V(C0114e.m647e0().f1472P0))) {
                i = 135;
            } else if (mVar.equals(C0114e.m647e0().f1467O0) || mVar.equals(C0114e.m647e0().f1477Q0) || mVar.equals(C0114e.m647e0().f1472P0)) {
                i = 136;
            } else {
                return;
            }
            C0020p.m96c(i, mVar.mo176c(), mVar.mo179g(), i2);
        }
    }

    /* renamed from: D1 */
    public static final void m863D1() {
        for (int i = 0; i < 5; i++) {
            int[] iArr = f1903Q4;
            if (iArr[i] != -1) {
                int i2 = iArr[i];
                int[] iArr2 = f1891N4;
                if (i2 > iArr2[i]) {
                    int[] iArr3 = f1911S4;
                    iArr3[i] = iArr3[i] + 1;
                    if (iArr3[i] == 25) {
                        iArr3[i] = 0;
                        iArr[i] = -1;
                        iArr2[i] = 0;
                        f1895O4[i] = 0;
                        f1883L4[i] = 0;
                    }
                } else {
                    iArr[i] = iArr[i] + C0111c0.m574a(f1899P4[i]);
                    int[] iArr4 = f1883L4;
                    iArr4[i] = iArr4[i] + f1895O4[i];
                    int[] iArr5 = f1887M4;
                    iArr5[i] = iArr5[i] + f1899P4[i];
                }
            }
        }
    }

    /* renamed from: E */
    public static void m864E() {
        C0018n.m87b(C0018n.f219a, 10, false);
    }

    /* renamed from: E0 */
    public static void m865E0() {
        C0121h0.m833m();
    }

    /* renamed from: E1 */
    private void m866E1() {
        if (f1906R3 != 0 && C0114e.m647e0().f1628u != 14) {
            if (C0145a.m1336F(f2055z4, f1839A4, 40, 40)) {
                C0178n.f2969g = 5;
                if (C0145a.f2582F) {
                    C0145a.f2574B[5] = true;
                    C0145a.f2582F = false;
                    C0145a.f2624b1 = false;
                    C0145a.f2580E = false;
                }
            }
            f1902Q3.mo742f();
            if (C0145a.m1336F(f1851D4, f1855E4, 34, 34)) {
                C0178n.f2969g = 13;
                C0145a.f2624b1 = false;
                this.f2064E = false;
                if (C0145a.f2580E && C0145a.f2582F) {
                    C0114e.m647e0().mo371B();
                    C0145a.f2582F = false;
                    C0145a.f2624b1 = false;
                    C0145a.f2580E = false;
                }
            }
        }
    }

    /* renamed from: F */
    private void m867F() {
        int i = C0145a.f2586H + this.f2090R;
        int i2 = C0145a.f2588I + this.f2092S;
        if (!this.f2149w && !m911z(i, i2) && !m854A(i, i2)) {
            m907w(i, i2);
        }
    }

    /* renamed from: F0 */
    private void m868F0() {
        this.f2075J0 = 84;
        f1939Z4 = 66;
        f1947b5 = 59;
        f1943a5 = 61;
    }

    /* renamed from: G */
    private boolean m869G() {
        int i = C0145a.f2586H + f2028t1;
        int i2 = C0145a.f2588I + f2032u1;
        C0114e.m647e0().mo440n();
        C0128m Y = m885Y(i, i2);
        if (Y == null) {
            return false;
        }
        if (C0114e.m647e0().mo394N() && C0114e.m647e0().f1472P0 != null && !Y.equals(C0114e.m647e0().f1472P0) && !Y.equals(C0114e.m647e0().f1472P0.f1457M0) && (Y instanceof C0114e)) {
            C0114e eVar = (C0114e) Y;
            if (eVar.f1437I0 != 5 && !eVar.mo394N()) {
                m907w(i, i2);
                return false;
            }
        }
        if (C0114e.m647e0().f1452L0 == Y || C0114e.m647e0().f1477Q0 == Y) {
            m876M(Y);
            return true;
        } else if (C0121h0.f1803v != 51 || !Y.equals(C0114e.m647e0().f1467O0)) {
            if (C0114e.m647e0().f1479Q2 == null && C0114e.m647e0().f1464N2 == null && C0114e.m647e0().f1469O2 == null && C0114e.m647e0().mo418Z0() == null) {
                C0114e.m647e0().mo373C(Y);
                Y.mo175b();
            }
            return false;
        } else {
            m907w(i, i2);
            return false;
        }
    }

    /* renamed from: H */
    private boolean m870H() {
        if (C0114e.m647e0().f1639w0 != null && ((C0114e.m647e0().f1639w0.f948a.f1020d != 1 && C0114e.m647e0().f1426G < C0114e.m647e0().f1639w0.f957j) || (C0114e.m647e0().f1639w0.f948a.f1020d == 1 && C0114e.m647e0().f1426G < (C0114e.m647e0().f1466O * C0114e.m647e0().f1639w0.f957j) / 100))) {
            f1862G3.mo562a(C0057d1.f421A1, 0);
            this.f2098V = 0;
            return false;
        } else if (C0114e.m647e0().f1639w0 != null && (C0114e.m647e0().f1639w0.f948a.f1019c <= 0 || C0114e.m647e0().f1639w0.f950c != 0)) {
            return true;
        } else {
            C0145a.m1349X(C0057d1.f497L0);
            return false;
        }
    }

    /* renamed from: H0 */
    public static final void m871H0() {
        if (f1935Y4 == null) {
            f1935Y4 = new C0143b[3];
            for (int i = 0; i < 3; i++) {
                C0143b[] bVarArr = f1935Y4;
                bVarArr[i] = C0161h.m1494l("/e/sp" + i + ".png");
            }
        }
        f1915T4 = new int[2];
        f1919U4 = new int[2];
        int[] iArr = new int[2];
        f1923V4 = iArr;
        f1927W4 = new int[2];
        f1931X4 = new int[2];
        iArr[1] = -1;
        iArr[0] = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        if (p018i.C0145a.m1336F((r0 - (r1 / 2)) + 12, (f1863G4[0] - (r1 / 2)) + 12, r1, f1922V3.length * r1) != false) goto L_0x0169;
     */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m872H1() {
        /*
            r8 = this;
            boolean r0 = r8.mo548t0()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = -1
            p020k.C0178n.f2969g = r0
            boolean r1 = p018i.C0145a.f2661y
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x010b
            r1 = 60
            r4 = 50
            boolean r1 = p018i.C0145a.m1336F(r3, r3, r1, r4)
            r4 = 0
            if (r1 == 0) goto L_0x0043
            boolean r1 = p018i.C0145a.f2580E
            if (r1 == 0) goto L_0x0043
            boolean r1 = p018i.C0145a.f2582F
            if (r1 == 0) goto L_0x0043
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            if (r0 == 0) goto L_0x0034
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            r0.mo139d()
        L_0x0034:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1541c2 = r4
            p018i.C0145a.m1357l()
            r8.f2144t0 = r2
            r0 = 5
            r8.f2146u0 = r0
            return
        L_0x0043:
            boolean r1 = p013g.C0121h0.m826f()
            r5 = 34
            if (r1 != 0) goto L_0x0086
            int r1 = f2047x4
            int r6 = f2051y4
            boolean r1 = p018i.C0145a.m1336F(r1, r6, r5, r5)
            if (r1 == 0) goto L_0x0086
            r1 = 15
            p020k.C0178n.f2969g = r1
            p018i.C0145a.f2624b1 = r3
            r8.f2064E = r3
            p020k.C0167c.m1522b()
            java.lang.String r1 = p011e.C0057d1.f655i1
            p020k.C0167c.f2788n = r1
            boolean r1 = p018i.C0145a.f2580E
            if (r1 == 0) goto L_0x0086
            boolean r1 = p018i.C0145a.f2582F
            if (r1 == 0) goto L_0x0086
            k.c r0 = p020k.C0167c.m1522b()
            java.lang.String r1 = ""
            r0.mo825h(r8, r1)
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo875e()
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1541c2 = r4
            p018i.C0145a.m1357l()
            return
        L_0x0086:
            g.e r1 = p013g.C0114e.m647e0()
            e.d r1 = r1.f1554f0
            if (r1 == 0) goto L_0x00c5
            g.e r1 = p013g.C0114e.m647e0()
            e.d r1 = r1.f1554f0
            int r1 = r1.f407h
            int r1 = r1 + -17
            g.e r4 = p013g.C0114e.m647e0()
            e.d r4 = r4.f1554f0
            int r4 = r4.f408i
            int r4 = r4 + -17
            boolean r1 = p018i.C0145a.m1336F(r1, r4, r5, r5)
            if (r1 == 0) goto L_0x00c5
            r1 = 20
            p020k.C0178n.f2969g = r1
            p018i.C0145a.f2624b1 = r3
            r8.f2064E = r3
            boolean r1 = p018i.C0145a.f2580E
            if (r1 == 0) goto L_0x00c5
            boolean r1 = p018i.C0145a.f2582F
            if (r1 == 0) goto L_0x00c5
            p018i.C0145a.m1357l()
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            r0.mo139d()
            return
        L_0x00c5:
            r8.m866E1()
            int r1 = f1906R3
            if (r1 != 0) goto L_0x00d9
            int r1 = f1843B4
            int r4 = f1847C4
            r5 = 40
            boolean r1 = p018i.C0145a.m1336F(r1, r4, r5, r5)
            if (r1 == 0) goto L_0x010b
            goto L_0x00e3
        L_0x00d9:
            int r1 = f1843B4
            int r4 = f1847C4
            boolean r1 = p018i.C0145a.m1336F(r1, r4, r5, r5)
            if (r1 == 0) goto L_0x010b
        L_0x00e3:
            g.e r1 = p013g.C0114e.m647e0()
            int r1 = r1.f1628u
            r4 = 14
            if (r1 == r4) goto L_0x010b
            g.v r1 = r8.f2056A
            if (r1 != 0) goto L_0x010b
            r1 = 10
            p020k.C0178n.f2969g = r1
            p018i.C0145a.f2624b1 = r3
            r8.f2064E = r3
            boolean r4 = p018i.C0145a.f2580E
            if (r4 == 0) goto L_0x010b
            boolean r4 = p018i.C0145a.f2582F
            if (r4 == 0) goto L_0x010b
            boolean[] r4 = p018i.C0145a.f2574B
            r4[r1] = r2
            p018i.C0145a.f2582F = r3
            p018i.C0145a.f2624b1 = r3
            p018i.C0145a.f2580E = r3
        L_0x010b:
            g.v r1 = r8.f2056A
            if (r1 == 0) goto L_0x0114
            r8.mo490G1()
            goto L_0x01aa
        L_0x0114:
            boolean r1 = f2001n2
            if (r1 == 0) goto L_0x01aa
            boolean r1 = r8.mo540p0()
            if (r1 == 0) goto L_0x011f
            return
        L_0x011f:
            r8.f2148v0 = r0
            int r0 = f1867H4
            int[] r1 = f1859F4
            r1 = r1[r3]
            int r0 = r0 + r1
            int r1 = f1930X3
            int r4 = r1 / 2
            int r0 = r0 - r4
            int r0 = r0 + 12
            int[] r4 = f1863G4
            r4 = r4[r3]
            int r5 = r1 / 2
            int r4 = r4 - r5
            int r4 = r4 + 12
            e.n0[] r5 = f1922V3
            int r5 = r5.length
            int r5 = r5 * r1
            boolean r0 = p018i.C0145a.m1336F(r0, r4, r5, r1)
            if (r0 != 0) goto L_0x0169
            boolean r0 = p018i.C0145a.f2661y
            if (r0 != 0) goto L_0x01aa
            int r0 = f1867H4
            int[] r1 = f1859F4
            r1 = r1[r3]
            int r0 = r0 + r1
            int r1 = f1930X3
            int r4 = r1 / 2
            int r0 = r0 - r4
            int r0 = r0 + 12
            int[] r4 = f1863G4
            r4 = r4[r3]
            int r5 = r1 / 2
            int r4 = r4 - r5
            int r4 = r4 + 12
            e.n0[] r5 = f1922V3
            int r5 = r5.length
            int r5 = r5 * r1
            boolean r0 = p018i.C0145a.m1336F(r0, r4, r1, r5)
            if (r0 == 0) goto L_0x01aa
        L_0x0169:
            p018i.C0145a.f2624b1 = r3
            r8.f2064E = r3
            int r0 = p018i.C0145a.f2594L
            int r1 = f1867H4
            int[] r4 = f1859F4
            r4 = r4[r3]
            int r1 = r1 + r4
            int r4 = f1930X3
            int r5 = r4 / 2
            int r1 = r1 - r5
            int r1 = r1 + 12
            int r0 = r0 - r1
            int r0 = r0 / r4
            r8.f2148v0 = r0
            boolean r1 = p018i.C0145a.f2580E
            if (r1 == 0) goto L_0x01aa
            boolean r1 = p018i.C0145a.f2582F
            if (r1 == 0) goto L_0x01aa
            p018i.C0145a.f2582F = r3
            p018i.C0145a.f2624b1 = r3
            p018i.C0145a.f2580E = r3
            r8.f2138q0 = r0
            int r1 = f1936Z1
            if (r1 >= 0) goto L_0x0197
            f1936Z1 = r3
        L_0x0197:
            e.n0[] r1 = f1922V3
            int r4 = r1.length
            int r4 = r4 - r2
            if (r0 <= r4) goto L_0x01a1
            int r0 = r1.length
            int r0 = r0 - r2
            r8.f2138q0 = r0
        L_0x01a1:
            int r0 = r8.f2138q0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x01aa
            r8.mo500O(r0, r2)
        L_0x01aa:
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x01d6
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r1 = r0[r2]
            r4 = 6
            r5 = 4
            r6 = 3
            r7 = 2
            if (r1 != 0) goto L_0x01c8
            boolean r1 = r0[r7]
            if (r1 != 0) goto L_0x01c8
            boolean r1 = r0[r6]
            if (r1 != 0) goto L_0x01c8
            boolean r1 = r0[r5]
            if (r1 != 0) goto L_0x01c8
            boolean r0 = r0[r4]
            if (r0 == 0) goto L_0x01ca
        L_0x01c8:
            p018i.C0145a.f2582F = r3
        L_0x01ca:
            boolean[] r0 = p018i.C0145a.f2576C
            r0[r2] = r3
            r0[r7] = r3
            r0[r6] = r3
            r0[r5] = r3
            r0[r4] = r3
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m872H1():void");
    }

    /* renamed from: I */
    private boolean m873I() {
        return (C0114e.m647e0().f1639w0 == null || ((C0114e.m647e0().f1639w0.f948a.f1020d == 1 || C0114e.m647e0().f1426G >= C0114e.m647e0().f1639w0.f957j) && (C0114e.m647e0().f1639w0.f948a.f1020d != 1 || C0114e.m647e0().f1426G >= (C0114e.m647e0().f1466O * C0114e.m647e0().f1639w0.f957j) / 100))) && C0114e.m647e0().f1639w0 != null && (C0114e.m647e0().f1639w0.f948a.f1019c <= 0 || C0114e.m647e0().f1639w0.f950c != 0);
    }

    /* renamed from: J1 */
    public static final void m874J1() {
        for (int i = 0; i < 2; i++) {
            int[] iArr = f1923V4;
            if (iArr[i] != -1) {
                iArr[i] = iArr[i] + 1;
                int[] iArr2 = f1915T4;
                iArr2[i] = iArr2[i] + (f1931X4[i] << 2);
                int[] iArr3 = f1919U4;
                iArr3[i] = iArr3[i] - 1;
                if (iArr[i] >= 6) {
                    iArr[i] = -1;
                } else {
                    f1927W4[i] = (iArr[i] >> 1) % 3;
                }
            }
        }
    }

    /* renamed from: K */
    public static void m875K() {
        f1970h1 = null;
    }

    /* renamed from: M */
    private void m876M(C0128m mVar) {
        if ((mVar.equals(C0114e.m647e0().f1467O0) || this.f2056A == null) && !m908x(mVar)) {
            m862D(mVar);
            C0114e.m647e0().mo440n();
            C0114e.m647e0().f1541c2 = null;
            C0114e e0 = C0114e.m647e0();
            C0114e.m647e0().f1608q = 0;
            e0.f1603p = 0;
            mVar.mo175b();
            this.f2098V = 10;
            m878N(false, true);
            this.f2086P = mVar.mo176c();
            this.f2088Q = mVar.mo179g();
            this.f2084O = false;
            this.f2082N = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de A[ADDED_TO_REGION, Catch:{ Exception -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c A[ADDED_TO_REGION, Catch:{ Exception -> 0x0146 }] */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m877M0(p019j.C0159f r16) {
        /*
            r15 = this;
            b.b r0 = p001b.C0006b.f95C     // Catch:{ Exception -> 0x0146 }
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte r0 = m896g0()     // Catch:{ Exception -> 0x0146 }
            r1 = -1
            if (r0 != r1) goto L_0x000d
            return
        L_0x000d:
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0010:
            k.i r4 = f1924W1     // Catch:{ Exception -> 0x0146 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x0146 }
            if (r3 >= r4) goto L_0x0049
            k.i r4 = f1924W1     // Catch:{ Exception -> 0x0146 }
            java.lang.Object r4 = r4.elementAt(r3)     // Catch:{ Exception -> 0x0146 }
            e.b0 r4 = (p011e.C0050b0) r4     // Catch:{ Exception -> 0x0146 }
            e.c0 r5 = r4.f362A4     // Catch:{ Exception -> 0x0146 }
            int r5 = r5.f381a     // Catch:{ Exception -> 0x0146 }
            if (r5 != r0) goto L_0x0046
            if (r1 != 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            int r5 = r4.f1593n     // Catch:{ Exception -> 0x0146 }
            g.e r6 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0146 }
            int r6 = r6.f1593n     // Catch:{ Exception -> 0x0146 }
            int r5 = r5 - r6
            int r5 = p013g.C0111c0.m574a(r5)     // Catch:{ Exception -> 0x0146 }
            int r6 = r1.f1593n     // Catch:{ Exception -> 0x0146 }
            g.e r7 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0146 }
            int r7 = r7.f1593n     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 - r7
            int r6 = p013g.C0111c0.m574a(r6)     // Catch:{ Exception -> 0x0146 }
            if (r5 >= r6) goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0049:
            if (r1 == 0) goto L_0x0146
            int r0 = r1.f1628u     // Catch:{ Exception -> 0x0146 }
            r3 = 15
            if (r0 != r3) goto L_0x0053
            goto L_0x0146
        L_0x0053:
            int r0 = r1.f1593n     // Catch:{ Exception -> 0x0146 }
            int r3 = f2028t1     // Catch:{ Exception -> 0x0146 }
            if (r0 <= r3) goto L_0x006a
            int r4 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r3 = r3 + r4
            if (r0 >= r3) goto L_0x006a
            int r3 = r1.f1598o     // Catch:{ Exception -> 0x0146 }
            int r4 = f2032u1     // Catch:{ Exception -> 0x0146 }
            if (r3 <= r4) goto L_0x006a
            int r5 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r4 = r4 + r5
            if (r3 >= r4) goto L_0x006a
            return
        L_0x006a:
            int r3 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x0146 }
            r4 = 10
            int r3 = r3 % r4
            r5 = 5
            if (r3 >= r5) goto L_0x0073
            return
        L_0x0073:
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0146 }
            int r3 = r3.f1593n     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 - r3
            int r1 = r1.f1598o     // Catch:{ Exception -> 0x0146 }
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0146 }
            int r3 = r3.f1598o     // Catch:{ Exception -> 0x0146 }
            int r1 = r1 - r3
            r3 = 6
            if (r0 <= 0) goto L_0x00b1
            if (r1 < 0) goto L_0x00b1
            int r6 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0146 }
            int r7 = p013g.C0111c0.m574a(r1)     // Catch:{ Exception -> 0x0146 }
            if (r6 < r7) goto L_0x00a7
            int r6 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 - r4
            int r7 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r7 = r7 / 2
            int r7 = r7 + 30
            boolean r8 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0146 }
            if (r8 == 0) goto L_0x00a4
            int r7 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r7 = r7 / 2
        L_0x00a3:
            int r7 = r7 + r4
        L_0x00a4:
            r2 = r6
            r6 = 0
            goto L_0x00db
        L_0x00a7:
            int r2 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r2 = r2 / 2
            int r6 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 - r4
            r7 = r6
            r6 = 5
            goto L_0x00db
        L_0x00b1:
            if (r0 < 0) goto L_0x00d9
            if (r1 >= 0) goto L_0x00d9
            int r6 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0146 }
            int r7 = p013g.C0111c0.m574a(r1)     // Catch:{ Exception -> 0x0146 }
            if (r6 < r7) goto L_0x00d1
            int r6 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 - r4
            int r7 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r7 = r7 / 2
            int r7 = r7 + 30
            boolean r8 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0146 }
            if (r8 == 0) goto L_0x00a4
            int r7 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r7 = r7 / 2
            goto L_0x00a3
        L_0x00d1:
            int r2 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r2 = r2 / 2
            r6 = 6
            r7 = 10
            goto L_0x00db
        L_0x00d9:
            r6 = 0
            r7 = 0
        L_0x00db:
            r8 = 3
            if (r0 >= 0) goto L_0x010a
            if (r1 < 0) goto L_0x010a
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0146 }
            int r1 = p013g.C0111c0.m574a(r1)     // Catch:{ Exception -> 0x0146 }
            if (r0 < r1) goto L_0x00fe
            int r0 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
            int r0 = r0 + 30
            boolean r1 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00f9
            int r0 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
        L_0x00f8:
            int r0 = r0 + r4
        L_0x00f9:
            r13 = r0
            r11 = 3
            r12 = 10
            goto L_0x0133
        L_0x00fe:
            int r0 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
            int r1 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r4 = r1 + -10
            r12 = r0
            r13 = r4
            r11 = 5
            goto L_0x0133
        L_0x010a:
            if (r0 > 0) goto L_0x0130
            if (r1 >= 0) goto L_0x0130
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0146 }
            int r1 = p013g.C0111c0.m574a(r1)     // Catch:{ Exception -> 0x0146 }
            if (r0 < r1) goto L_0x0127
            int r0 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
            int r0 = r0 + 30
            boolean r1 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00f9
            int r0 = f1980j1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
            goto L_0x00f8
        L_0x0127:
            int r0 = f1975i1     // Catch:{ Exception -> 0x0146 }
            int r0 = r0 / 2
            r12 = r0
            r11 = 6
            r13 = 10
            goto L_0x0133
        L_0x0130:
            r12 = r2
            r11 = r6
            r13 = r7
        L_0x0133:
            m901l1(r16)     // Catch:{ Exception -> 0x0146 }
            h.a.a.b r6 = f2039v4     // Catch:{ Exception -> 0x0146 }
            r7 = 0
            r8 = 0
            r9 = 13
            r10 = 16
            int r14 = p013g.C0117f0.f1680f     // Catch:{ Exception -> 0x0146 }
            r5 = r16
            r5.mo779h(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0146 }
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m877M0(j.f):void");
    }

    /* renamed from: N */
    private void m878N(boolean z, boolean z2) {
        C0067i0 i0Var;
        if (C0114e.m647e0().f1472P0 == null || C0114e.m647e0().f1472P0.f1598o < C0114e.m647e0().f1598o + 48 || !C0121h0.m841u(C0114e.m647e0().f1593n, C0114e.m647e0().f1598o, 2)) {
            C0111c0.m584k("do fire");
            f1946b4++;
            C0054c1 R = C0114e.m647e0().mo401R();
            C0054c1 S = C0114e.m647e0().mo403S();
            if (!z2 && R != null && (C0114e.m647e0().f1452L0 == null || (C0114e.m647e0().f1452L0 != null && C0114e.m647e0().f1452L0.f2275G == 0))) {
                i0Var = R.f393g;
            } else if (!z2 && S != null && (C0114e.m647e0().f1452L0 == null || (C0114e.m647e0().f1452L0 != null && C0114e.m647e0().f1452L0.f2275G == 0))) {
                i0Var = S.f393g;
            } else if ((C0121h0.f1803v != 51 || C0114e.m647e0().f1467O0 == null) && C0114e.m647e0().f1628u != 14) {
                C0114e e0 = C0114e.m647e0();
                C0114e.m647e0().f1608q = 0;
                e0.f1603p = 0;
                if (!C0114e.m647e0().mo419a0() || !C0114e.m647e0().mo375D()) {
                    if (mo534n0()) {
                        if (!C0114e.m647e0().mo421b0() || !C0114e.m647e0().mo375D()) {
                            boolean u = C0121h0.m841u(C0114e.m647e0().f1593n, C0114e.m647e0().f1598o, 2);
                            C0111c0.m584k("my skill id= " + C0114e.m647e0().f1639w0.f949b);
                            C0114e.m647e0().mo414X0(f1872J1[C0114e.m647e0().f1639w0.f949b], u ^ true ? 1 : 0);
                            if (u) {
                                C0114e.m647e0().f1546d2 = 20;
                            }
                            C0114e.m647e0().f1612q3 = z;
                        } else if (m870H()) {
                            C0114e.m647e0().f1612q3 = z;
                            C0114e.m647e0().mo376D0();
                        } else {
                            C0114e.m647e0().mo425d1();
                        }
                    }
                } else if (m870H()) {
                    C0114e.m647e0().f1612q3 = z;
                    C0114e.m647e0().mo466y1();
                }
                if (C0114e.m647e0().mo417Z()) {
                    this.f2098V = 0;
                    return;
                }
                return;
            } else {
                return;
            }
            i0Var.f840k.mo139d();
            return;
        }
        this.f2098V = 0;
        C0114e.m647e0().f1541c2 = null;
        C0114e.f1393x4 = false;
        C0114e.m647e0().f1493T1 = false;
    }

    /* renamed from: S0 */
    private void m879S0(C0159f fVar) {
        if (f1906R3 != 0 && C0114e.m647e0().f1628u != 14) {
            fVar.mo776e(C0178n.f2969g == 5 ? f2050y3 : f2046x3, f2055z4 + 20, f1839A4 + 20, 3);
            f1902Q3.mo741d(fVar);
            fVar.mo776e(C0178n.f2969g == 13 ? f2017q3 : f2012p3, f1851D4 + 20, f1855E4 + 20, 3);
        }
    }

    /* renamed from: T0 */
    private void m880T0(C0159f fVar, boolean z, C0114e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0159f fVar2 = fVar;
        C0114e eVar2 = eVar;
        if (eVar2 != null) {
            if (eVar2.f1638w == C0114e.m647e0().f1638w) {
                int i6 = this.f2063D0;
                int i7 = f1939Z4;
                int i8 = eVar2.f1461N;
                i4 = (i6 * i7) / i8;
                int i9 = this.f2057A0;
                int i10 = f1947b5;
                int i11 = eVar2.f1466O;
                i3 = (eVar2.f1431H * i7) / i8;
                i2 = (eVar2.f1426G * i10) / i11;
                i = (i9 * i10) / i11;
            } else {
                int i12 = eVar2.f1515X3;
                int i13 = f1939Z4;
                int i14 = eVar2.f1461N;
                i4 = (i12 * i13) / i14;
                int i15 = eVar2.f1510W3;
                int i16 = f1947b5;
                i3 = (eVar2.f1431H * i13) / i14;
                i2 = (i15 * i16) / 100;
                i = (i15 * i16) / 100;
            }
            int i17 = i3;
            int i18 = i4;
            if (C0114e.m647e0().f1518Y1 > 0) {
                int i19 = (C0114e.m647e0().f1508W1 * f1943a5) / C0114e.m647e0().f1513X1;
                fVar2.mo776e(f1874J3, 58, 29, 0);
                fVar2.mo771C(83, 31, i19, 10);
                fVar.mo770B();
                fVar2.mo774a(83, 31, i19, 10);
                fVar2.mo776e(f1886M3, 83, 31, 0);
                C0159f.m1454z(fVar);
                fVar.mo769A();
                fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
                C0177m mVar = C0177m.f2929F;
                i5 = 83;
                mVar.mo909a(fVar, C0114e.m647e0().f1503V1 + ":" + C0114e.m647e0().f1508W1 + "/" + C0114e.m647e0().f1513X1, 115, 29, 2);
            } else {
                i5 = 83;
            }
            if (eVar2.f1638w != C0114e.m647e0().f1638w) {
                fVar2.mo771C(C0159f.m1451u(f1870I3) - 95, 0, 95, 100);
                fVar.mo770B();
                fVar2.mo774a(C0159f.m1451u(f1870I3) - 95, 0, 95, 100);
            }
            fVar2.mo776e(f1870I3, 0, 0, 0);
            if (eVar2.f1638w != C0114e.m647e0().f1638w) {
                fVar.mo769A();
            }
            if (z) {
                fVar2.mo771C(i5, 5, i18, 10);
                fVar.mo770B();
                fVar2.mo774a(i5, 5, i18, 10);
            } else {
                fVar2.mo771C((f1939Z4 + i5) - i18, 5, i18, 10);
                fVar.mo770B();
                fVar2.mo774a((f1939Z4 + i5) - i18, 5, i18, 10);
            }
            fVar2.mo776e(f1890N3, i5, 5, 0);
            C0159f.m1454z(fVar);
            fVar.mo769A();
            fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            if (z) {
                fVar2.mo771C(i5, 5, i17, 10);
                fVar.mo770B();
                fVar2.mo774a(i5, 5, i17, 10);
            } else {
                fVar2.mo771C((f1939Z4 + i5) - i17, 5, i17, 10);
                fVar.mo770B();
                fVar2.mo774a((f1939Z4 + i5) - i17, 5, i17, 10);
            }
            fVar2.mo776e(f1878K3, i5, 5, 0);
            C0159f.m1454z(fVar);
            fVar.mo769A();
            fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            if (z) {
                fVar2.mo771C(i5, 20, i, 6);
                fVar.mo770B();
                fVar2.mo774a(i5, 20, i, 6);
            } else {
                fVar2.mo771C((f1947b5 + i5) - i, 20, i, 6);
                fVar.mo770B();
                fVar2.mo774a((f1947b5 + i5) - i, 20, i, 6);
            }
            fVar2.mo776e(f1894O3, i5, 20, 0);
            C0159f.m1454z(fVar);
            fVar.mo769A();
            fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            if (z) {
                fVar2.mo771C(i5, 20, i, 6);
                fVar.mo770B();
                fVar2.mo774a(i5, 20, i, 6);
            } else {
                fVar2.mo771C((f1947b5 + i5) - i2, 20, i2, 6);
                fVar.mo770B();
                fVar2.mo774a((f1947b5 + i5) - i2, 20, i2, 6);
            }
            fVar2.mo776e(f1882L3, i5, 20, 0);
            C0159f.m1454z(fVar);
            fVar.mo769A();
            fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            if (C0114e.m647e0().f1426G == 0 && C0145a.f2600O % 10 > 5) {
                fVar2.mo771C(i5, 20, 2, 6);
                fVar.mo770B();
                fVar2.mo774a(i5, 20, 2, 6);
                fVar2.mo776e(f1894O3, i5, 20, 0);
                C0159f.m1454z(fVar);
                fVar.mo769A();
                fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            }
        }
    }

    /* renamed from: V */
    public static C0114e m881V(int i) {
        for (int i2 = 0; i2 < f1908S1.size(); i2++) {
            C0114e eVar = (C0114e) f1908S1.elementAt(i2);
            if (eVar.f1638w == i) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m882V0(p019j.C0159f r11) {
        /*
            r10 = this;
            boolean r0 = p013g.C0114e.f1394y4
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            m901l1(r11)
            boolean r0 = r10.mo559y0()
            java.lang.String r6 = ""
            r1 = 20
            r2 = 15
            r7 = 1
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x0055
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            if (r0 == 0) goto L_0x0055
            int r0 = p018i.C0145a.f2614V
            int r0 = r0 / r9
            int r0 = r0 + -62
            r11.mo773E(r0, r8)
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            r10.m880T0(r11, r7, r0)
            int r0 = p018i.C0145a.f2614V
            int r0 = r0 / r9
            int r0 = r0 + -65
            int r0 = -r0
            r11.mo773E(r0, r8)
            g.e r0 = p013g.C0114e.m647e0()
            r10.mo511U0(r11, r0)
            g.e r0 = p013g.C0114e.m647e0()
            r0.mo443o0(r11, r2, r1, r8)
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
        L_0x004d:
            int r3 = p018i.C0145a.f2614V
            int r3 = r3 - r2
            r0.mo443o0(r11, r3, r1, r9)
            goto L_0x01cc
        L_0x0055:
            int r0 = p013g.C0121h0.f1803v
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != r3) goto L_0x0092
            g.e r0 = r10.mo512W()
            if (r0 == 0) goto L_0x0092
            g.e r0 = r10.mo513X()
            if (r0 == 0) goto L_0x0092
            int r0 = p018i.C0145a.f2614V
            int r0 = r0 / r9
            int r0 = r0 + -62
            r11.mo773E(r0, r8)
            g.e r0 = r10.mo512W()
            r10.m880T0(r11, r7, r0)
            int r0 = p018i.C0145a.f2614V
            int r0 = r0 / r9
            int r0 = r0 + -65
            int r0 = -r0
            r11.mo773E(r0, r8)
            g.e r0 = r10.mo513X()
            r10.mo511U0(r11, r0)
            g.e r0 = r10.mo512W()
            r0.mo443o0(r11, r2, r1, r8)
            g.e r0 = r10.mo513X()
            goto L_0x004d
        L_0x0092:
            g.e r0 = p013g.C0114e.m647e0()
            r10.m880T0(r11, r7, r0)
            g.e r0 = p013g.C0114e.m647e0()
            e.c1 r0 = r0.mo401R()
            if (r0 != 0) goto L_0x01bd
            g.e r0 = p013g.C0114e.m647e0()
            e.c1 r0 = r0.mo403S()
            if (r0 == 0) goto L_0x00af
            goto L_0x01bd
        L_0x00af:
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            if (r0 == 0) goto L_0x0101
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            e.y r0 = r0.mo597p()
            if (r0 == 0) goto L_0x00dc
            k.m r0 = p020k.C0177m.f2958z
            g.e r1 = p013g.C0114e.m647e0()
            g.v r1 = r1.f1452L0
            e.y r1 = r1.mo597p()
            java.lang.String r2 = r1.f1108f
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 9
            r5 = 2
            r1 = r11
            r0.mo909a(r1, r2, r3, r4, r5)
        L_0x00dc:
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            int r0 = r0.f2275G
            if (r0 == 0) goto L_0x01cc
            k.m r0 = p020k.C0177m.f2958z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            int r2 = r2.f2311i
            long r2 = (long) r2
            java.lang.String r2 = p012f.C0104c.m358c(r2)
            r1.append(r2)
            r1.append(r6)
            goto L_0x014f
        L_0x0101:
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            if (r0 == 0) goto L_0x015a
            k.m r0 = p020k.C0177m.f2958z
            g.e r1 = p013g.C0114e.m647e0()
            e.b0 r1 = r1.f1467O0
            e.c0 r1 = r1.f362A4
            java.lang.String r2 = r1.f382b
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 9
            r5 = 2
            r1 = r11
            r0.mo909a(r1, r2, r3, r4, r5)
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            e.c0 r0 = r0.f362A4
            int r0 = r0.f381a
            r1 = 4
            if (r0 != r1) goto L_0x01cc
            k.m r0 = p020k.C0177m.f2958z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            g.k r2 = m893c0()
            e.v r2 = r2.f2058B
            int r2 = r2.f1055Q4
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            g.k r2 = m893c0()
            e.v r2 = r2.f2058B
            int r2 = r2.f1057S4
            r1.append(r2)
        L_0x014f:
            java.lang.String r2 = r1.toString()
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 22
            goto L_0x01c7
        L_0x015a:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            if (r0 == 0) goto L_0x0188
            k.m r0 = p020k.C0177m.f2958z
            g.e r1 = p013g.C0114e.m647e0()
            g.e r1 = r1.f1472P0
            java.lang.String r2 = r1.f1511X
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 9
            r5 = 2
            r1 = r11
            r0.mo909a(r1, r2, r3, r4, r5)
            k.m r0 = p020k.C0177m.f2958z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            g.e r2 = p013g.C0114e.m647e0()
            g.e r2 = r2.f1472P0
            int r2 = r2.f1431H
            long r2 = (long) r2
            goto L_0x01a8
        L_0x0188:
            k.m r0 = p020k.C0177m.f2958z
            g.e r1 = p013g.C0114e.m647e0()
            java.lang.String r2 = r1.f1511X
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 9
            r5 = 2
            r1 = r11
            r0.mo909a(r1, r2, r3, r4, r5)
            k.m r0 = p020k.C0177m.f2958z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            g.e r2 = p013g.C0114e.m647e0()
            long r2 = r2.f1578k
        L_0x01a8:
            java.lang.String r2 = p012f.C0104c.m358c(r2)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = r1.toString()
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 22
            goto L_0x01c8
        L_0x01bd:
            k.m r0 = p020k.C0177m.f2958z
            java.lang.String r2 = p011e.C0057d1.f704p1
            int r1 = r10.f2075J0
            int r3 = r1 / 2
            r4 = 8
        L_0x01c7:
            r5 = 2
        L_0x01c8:
            r1 = r11
            r0.mo909a(r1, r2, r3, r4, r5)
        L_0x01cc:
            int r0 = r11.mo791x()
            int r0 = -r0
            int r1 = r11.mo792y()
            int r1 = -r1
            r11.mo773E(r0, r1)
            boolean r0 = r10.mo559y0()
            if (r0 == 0) goto L_0x021d
            int r0 = r10.f2073I0
            if (r0 <= 0) goto L_0x021d
            long r0 = java.lang.System.currentTimeMillis()
            r10.f2069G0 = r0
            long r2 = r10.f2071H0
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01fd
            long r0 = java.lang.System.currentTimeMillis()
            r10.f2071H0 = r0
            int r0 = r10.f2073I0
            int r0 = r0 - r7
            r10.f2073I0 = r0
        L_0x01fd:
            k.m r0 = p020k.C0177m.f2948p
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r10.f2073I0
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = r1.toString()
            int r1 = p018i.C0145a.f2614V
            int r3 = r1 / 2
            r4 = 13
            r5 = 2
            k.m r6 = p020k.C0177m.f2951s
            r1 = r11
            r0.mo910b(r1, r2, r3, r4, r5, r6)
        L_0x021d:
            boolean r0 = r10.f2144t0
            if (r0 == 0) goto L_0x0237
            h.a.a.b r0 = p011e.C0078o.f962w
            r1 = 40
            r2 = 35
            r3 = 33
            r11.mo776e(r0, r1, r2, r3)
            int r0 = r10.f2146u0
            int r0 = r0 - r7
            r10.f2146u0 = r0
            if (r0 >= 0) goto L_0x0237
            r10.f2146u0 = r8
            r10.f2144t0 = r8
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m882V0(j.f):void");
    }

    /* renamed from: W0 */
    public static void m883W0(C0143b bVar, C0143b bVar2, C0143b bVar3, float f, float f2, int i, float f3, C0159f fVar) {
        float f4 = f;
        int i2 = i;
        C0159f fVar2 = fVar;
        int r = fVar.mo789r();
        int s = fVar.mo790s();
        int q = fVar.mo788q();
        int p = fVar.mo787p();
        int i3 = (int) f4;
        int i4 = (int) f2;
        int i5 = (int) f3;
        fVar2.mo771C(i3, i4, i5, 13);
        fVar.mo770B();
        fVar2.mo774a(i3, i4, i5, 13);
        int i6 = (i2 / 15) - 2;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i7 + 1;
            fVar.mo775d(bVar2, f4 + ((float) (i8 * 15)), f2, 0, true);
            i7 = i8;
        }
        float f5 = f2;
        fVar.mo775d(bVar, f, f5, 0, true);
        float f6 = f4 + ((float) i2);
        fVar.mo775d(bVar2, f6 - 30.0f, f5, 0, true);
        fVar.mo775d(bVar3, f6 - 15.0f, f5, 0, true);
        fVar.mo769A();
        fVar2.mo771C(r, s, q, p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02ab  */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m884X0(p019j.C0159f r26) {
        /*
            r25 = this;
            r0 = r25
            r11 = r26
            g.v r1 = r0.f2056A
            if (r1 == 0) goto L_0x000c
            r25.mo503P0(r26)
            return
        L_0x000c:
            g.i r1 = p018i.C0145a.f2637i0
            if (r1 != 0) goto L_0x043f
            b.b r1 = p001b.C0006b.f95C
            if (r1 != 0) goto L_0x043f
            g.u r1 = p018i.C0145a.f2627d0
            boolean r1 = r1.f2239a
            if (r1 != 0) goto L_0x043f
            boolean r1 = r25.mo553v0()
            if (r1 != 0) goto L_0x043f
            g.y r1 = p018i.C0145a.f2629e0
            boolean r1 = r1.f2467a
            if (r1 != 0) goto L_0x043f
            g.e r1 = p013g.C0114e.m647e0()
            e.x0 r1 = r1.f1644x0
            short r1 = r1.f1097c
            if (r1 == 0) goto L_0x043f
            k.c r1 = p020k.C0167c.m1522b()
            boolean r1 = r1.f2790b
            if (r1 != 0) goto L_0x043f
            k.n r1 = p018i.C0145a.f2625c0
            g.w r2 = p013g.C0138w.f2333q
            if (r1 != r2) goto L_0x0040
            goto L_0x043f
        L_0x0040:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f2096U
            long r7 = r1 - r3
            r9 = 20
            r12 = 10000(0x2710, double:4.9407E-320)
            r14 = 0
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            long r1 = r7 * r9
            long r1 = r1 / r12
            int r2 = (int) r1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            boolean r1 = p018i.C0145a.f2659x
            r15 = 2721889(0x298861, float:3.814179E-39)
            r6 = 14
            java.lang.String r5 = ""
            r3 = 3
            r9 = 1
            r10 = 10
            if (r1 != 0) goto L_0x00e2
            int r1 = p020k.C0178n.f2969g
            if (r1 != r10) goto L_0x006d
            h.a.a.b r1 = f2026s3
            goto L_0x006f
        L_0x006d:
            h.a.a.b r1 = f2022r3
        L_0x006f:
            int r2 = f1867H4
            int r19 = f1843B4
            int r2 = r2 + r19
            int r2 = r2 - r9
            int r19 = f1847C4
            int r4 = r19 + -1
            r11.mo776e(r1, r2, r4, r14)
            r2 = 542(0x21e, float:7.6E-43)
            int r1 = f1867H4
            int r4 = f1843B4
            int r1 = r1 + r4
            int r4 = r1 + 3
            int r1 = f1847C4
            int r19 = r1 + 3
            r21 = 0
            r22 = 0
            r1 = r26
            r14 = 3
            r3 = r4
            r10 = 22
            r4 = r19
            r9 = r5
            r5 = r21
            r6 = r22
            p020k.C0174j.m1555c(r1, r2, r3, r4, r5, r6)
            k.m r1 = p020k.C0177m.f2931H
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = f1868I1
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            int r2 = f1867H4
            int r4 = f1843B4
            int r2 = r2 + r4
            int r4 = r2 + 22
            int r2 = f1847C4
            int r5 = r2 + 15
            r6 = 1
            r2 = r26
            r1.mo909a(r2, r3, r4, r5, r6)
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x02a5
            r11.mo772D(r15)
            r1 = 20
            long r7 = r7 * r1
            long r7 = r7 / r12
            int r1 = (int) r7
            int r2 = f1867H4
            int r3 = f1843B4
            int r2 = r2 + r3
            int r2 = r2 + r14
            int r3 = f1847C4
            int r3 = r3 + r14
            int r3 = r3 + r1
            r4 = 20
            int r10 = 20 - r1
            r11.mo783l(r2, r3, r4, r10)
            goto L_0x02a5
        L_0x00e2:
            r9 = r5
            r10 = 22
            r14 = 3
            g.e r1 = p013g.C0114e.m647e0()
            int r1 = r1.f1628u
            r6 = 14
            if (r1 == r6) goto L_0x02a5
            i.c r1 = f1902Q3
            boolean r1 = r1.f2698t
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = 9670800(0x939090, float:1.3551677E-38)
            if (r1 == 0) goto L_0x01dd
            int r1 = f1906R3
            r5 = 1
            if (r1 == r5) goto L_0x0168
            r11.mo772D(r4)
            int r1 = f1843B4
            int r1 = r1 + 9
            int r4 = f1847C4
            r5 = 10
            int r4 = r4 + r5
            r7 = 20
            r11.mo783l(r1, r4, r10, r7)
            r11.mo772D(r3)
            int r1 = f1843B4
            int r1 = r1 + 9
            int r3 = f1847C4
            int r3 = r3 + r5
            if (r2 == 0) goto L_0x0121
            int r4 = 20 - r2
            goto L_0x0122
        L_0x0121:
            r4 = 0
        L_0x0122:
            int r3 = r3 + r4
            if (r2 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r2 = 20
        L_0x0128:
            r11.mo783l(r1, r3, r10, r2)
            int r1 = p020k.C0178n.f2969g
            r2 = 10
            if (r1 != r2) goto L_0x0134
            h.a.a.b r1 = f2034u3
            goto L_0x0136
        L_0x0134:
            h.a.a.b r1 = f2030t3
        L_0x0136:
            int r2 = f1843B4
            int r3 = f1847C4
            r4 = 0
            r11.mo776e(r1, r2, r3, r4)
            k.m r1 = p020k.C0177m.f2926C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = f1868I1
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            int r2 = f1843B4
            r4 = 20
            int r5 = r2 + 20
            int r2 = f1847C4
            int r7 = r2 + 15
            r8 = 2
            r2 = r26
            r4 = r5
            r5 = r7
            r20 = 14
            r6 = r8
        L_0x0163:
            r1.mo909a(r2, r3, r4, r5, r6)
            goto L_0x02a7
        L_0x0168:
            r2 = 1
            r20 = 14
            if (r1 != r2) goto L_0x02a7
            int r1 = p020k.C0178n.f2969g
            r3 = 10
            if (r1 != r3) goto L_0x0176
            h.a.a.b r1 = f2026s3
            goto L_0x0178
        L_0x0176:
            h.a.a.b r1 = f2022r3
        L_0x0178:
            int r3 = f1867H4
            int r4 = f1843B4
            int r3 = r3 + r4
            int r3 = r3 - r2
            int r4 = f1847C4
            int r4 = r4 - r2
            r2 = 0
            r11.mo776e(r1, r3, r4, r2)
            r2 = 542(0x21e, float:7.6E-43)
            int r1 = f1867H4
            int r3 = f1843B4
            int r1 = r1 + r3
            int r3 = r1 + 3
            int r1 = f1847C4
            int r4 = r1 + 3
            r5 = 0
            r6 = 0
            r1 = r26
            p020k.C0174j.m1555c(r1, r2, r3, r4, r5, r6)
            k.m r1 = p020k.C0177m.f2931H
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = f1868I1
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            int r2 = f1867H4
            int r4 = f1843B4
            int r2 = r2 + r4
            int r4 = r2 + 22
            int r2 = f1847C4
            int r5 = r2 + 13
            r6 = 1
            r2 = r26
            r1.mo909a(r2, r3, r4, r5, r6)
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x02a7
            r11.mo772D(r15)
            r1 = 20
            long r7 = r7 * r1
            long r7 = r7 / r12
            int r1 = (int) r7
            int r2 = f1867H4
            int r3 = f1843B4
            int r2 = r2 + r3
            int r2 = r2 + r14
            int r3 = f1847C4
            int r3 = r3 + r14
            int r3 = r3 + r1
            r4 = 20
            int r10 = 20 - r1
            r11.mo783l(r2, r3, r4, r10)
            goto L_0x02a7
        L_0x01dd:
            r20 = 14
            if (r1 != 0) goto L_0x02a7
            int r1 = f1906R3
            r5 = 1
            r11.mo772D(r4)
            if (r1 == r5) goto L_0x0248
            int r1 = f1843B4
            int r1 = r1 + 9
            int r4 = f1847C4
            r5 = 10
            int r4 = r4 + r5
            r6 = 20
            r11.mo783l(r1, r4, r10, r6)
            r11.mo772D(r3)
            int r1 = f1843B4
            int r1 = r1 + 9
            int r3 = f1847C4
            int r3 = r3 + r5
            if (r2 == 0) goto L_0x0206
            int r4 = 20 - r2
            goto L_0x0207
        L_0x0206:
            r4 = 0
        L_0x0207:
            int r3 = r3 + r4
            if (r2 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r2 = 20
        L_0x020d:
            r11.mo783l(r1, r3, r10, r2)
            int r1 = p020k.C0178n.f2969g
            r2 = 10
            if (r1 != r2) goto L_0x0219
            h.a.a.b r1 = f2034u3
            goto L_0x021b
        L_0x0219:
            h.a.a.b r1 = f2030t3
        L_0x021b:
            int r2 = f1843B4
            int r3 = f1847C4
            r4 = 0
            r11.mo776e(r1, r2, r3, r4)
            k.m r1 = p020k.C0177m.f2926C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = f1868I1
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            int r2 = f1843B4
            r4 = 20
            int r5 = r2 + 20
            int r2 = f1847C4
            int r6 = r2 + 15
            r7 = 2
            r2 = r26
            r4 = r5
            r5 = r6
            r6 = r7
            goto L_0x0163
        L_0x0248:
            int r1 = f1843B4
            r4 = 10
            int r1 = r1 + r4
            int r5 = f1847C4
            int r5 = r5 + r4
            r6 = 18
            r7 = 20
            r11.mo783l(r1, r5, r7, r6)
            r11.mo772D(r3)
            int r1 = f1843B4
            int r1 = r1 + r4
            int r3 = f1847C4
            int r3 = r3 + r4
            if (r2 == 0) goto L_0x0265
            int r4 = 20 - r2
            goto L_0x0266
        L_0x0265:
            r4 = 0
        L_0x0266:
            int r3 = r3 + r4
            if (r2 == 0) goto L_0x026a
            goto L_0x026c
        L_0x026a:
            r2 = 18
        L_0x026c:
            r4 = 20
            r11.mo783l(r1, r3, r4, r2)
            int r1 = p020k.C0178n.f2969g
            r2 = 10
            if (r1 != r2) goto L_0x027a
            h.a.a.b r1 = f2042w3
            goto L_0x027c
        L_0x027a:
            h.a.a.b r1 = f2038v3
        L_0x027c:
            int r2 = f1843B4
            int r2 = r2 + r4
            int r3 = f1847C4
            int r3 = r3 + r4
            r11.mo776e(r1, r2, r3, r14)
            k.m r1 = p020k.C0177m.f2926C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = f1868I1
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            int r2 = f1843B4
            int r4 = r2 + 21
            int r2 = f1847C4
            int r5 = r2 + 14
            r6 = 2
            r2 = r26
            goto L_0x0163
        L_0x02a5:
            r20 = 14
        L_0x02a7:
            boolean r1 = f2001n2
            if (r1 == 0) goto L_0x043c
            boolean r1 = p018i.C0145a.f2659x
            if (r1 == 0) goto L_0x02b2
            e.n0[] r1 = f1922V3
            goto L_0x02b4
        L_0x02b2:
            e.n0[] r1 = f1918U3
        L_0x02b4:
            r12 = r1
            boolean r1 = p018i.C0145a.f2659x
            r13 = 11152401(0xaa2c11, float:1.5627842E-38)
            r15 = 2
            if (r1 != 0) goto L_0x02e5
            r11.mo772D(r13)
            int r1 = f1867H4
            int r2 = f1843B4
            int r1 = r1 + r2
            int r1 = r1 + r15
            int r2 = f1847C4
            r3 = 10
            int r2 = r2 - r3
            r4 = 20
            r11.mo783l(r1, r2, r4, r3)
            k.m r1 = p020k.C0177m.f2929F
            int r2 = f1867H4
            int r3 = f1843B4
            int r2 = r2 + r3
            int r4 = r2 + 12
            int r2 = f1847C4
            int r5 = r2 + -8
            r6 = 2
            java.lang.String r3 = "*"
            r2 = r26
            r1.mo909a(r2, r3, r4, r5, r6)
        L_0x02e5:
            r10 = 0
        L_0x02e6:
            boolean r1 = p018i.C0145a.f2659x
            if (r1 == 0) goto L_0x02ed
            int r2 = r0.f2136p0
            goto L_0x02ee
        L_0x02ed:
            int r2 = r12.length
        L_0x02ee:
            if (r10 >= r2) goto L_0x043c
            r9 = 5
            if (r1 != 0) goto L_0x035c
            boolean r1 = p020k.C0176l.f2892C
            if (r1 == 0) goto L_0x0311
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r2 = "Q"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "W"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "E"
            r1[r15] = r2
            java.lang.String r2 = "R"
            r1[r14] = r2
            r2 = 4
            java.lang.String r3 = "T"
            r1[r2] = r3
            goto L_0x032a
        L_0x0311:
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r2 = "7"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "8"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "9"
            r1[r15] = r2
            java.lang.String r2 = "1"
            r1[r14] = r2
            r2 = 4
            java.lang.String r3 = "3"
            r1[r2] = r3
        L_0x032a:
            r11.mo772D(r13)
            int r2 = f1867H4
            int[] r3 = f1859F4
            r3 = r3[r10]
            int r2 = r2 + r3
            int r2 = r2 + r15
            int[] r3 = f1863G4
            r3 = r3[r10]
            r8 = 10
            int r3 = r3 - r8
            r7 = 20
            r11.mo783l(r2, r3, r7, r8)
            k.m r2 = p020k.C0177m.f2929F
            r3 = r1[r10]
            int r1 = f1867H4
            int[] r4 = f1859F4
            r4 = r4[r10]
            int r1 = r1 + r4
            int r4 = r1 + 12
            int[] r1 = f1863G4
            r1 = r1[r10]
            int r5 = r1 + -10
            r6 = 2
            r1 = r2
            r2 = r26
            r1.mo909a(r2, r3, r4, r5, r6)
            goto L_0x0360
        L_0x035c:
            r7 = 20
            r8 = 10
        L_0x0360:
            r6 = r12[r10]
            g.e r1 = p013g.C0114e.m647e0()
            e.n0 r1 = r1.f1639w0
            if (r6 == r1) goto L_0x037e
            h.a.a.b r1 = f2022r3
            int r2 = f1867H4
            int[] r3 = f1859F4
            r3 = r3[r10]
            int r2 = r2 + r3
            r3 = 1
            int r2 = r2 - r3
            int[] r4 = f1863G4
            r4 = r4[r10]
            int r4 = r4 - r3
            r3 = 0
            r11.mo776e(r1, r2, r4, r3)
        L_0x037e:
            if (r6 != 0) goto L_0x038c
            r14 = r10
            r4 = 3
            r16 = 1
            r18 = 20
            r19 = 10
            r24 = 0
            goto L_0x0433
        L_0x038c:
            g.e r1 = p013g.C0114e.m647e0()
            e.n0 r1 = r1.f1639w0
            if (r6 != r1) goto L_0x03eb
            h.a.a.b r1 = f2026s3
            int r2 = f1867H4
            int[] r3 = f1859F4
            r3 = r3[r10]
            int r2 = r2 + r3
            r16 = 1
            int r2 = r2 + -1
            int[] r3 = f1863G4
            r3 = r3[r10]
            int r3 = r3 + -1
            r5 = 0
            r11.mo776e(r1, r2, r3, r5)
            boolean r1 = p018i.C0145a.f2659x
            if (r1 == 0) goto L_0x03e7
            h.a.a.b r2 = p013g.C0137v.f2268p0
            r3 = 0
            r4 = 12
            r17 = 9
            r18 = 6
            r19 = 0
            int r1 = f1867H4
            int[] r21 = f1859F4
            r21 = r21[r10]
            int r1 = r1 + r21
            int r21 = r1 + 8
            int[] r1 = f1863G4
            r1 = r1[r10]
            int r22 = r1 + -7
            r23 = 0
            r1 = r26
            r24 = 0
            r5 = r17
            r13 = r6
            r6 = r18
            r18 = 20
            r7 = r19
            r19 = 10
            r8 = r21
            r15 = 5
            r9 = r22
            r14 = r10
            r10 = r23
            r1.mo779h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x03f6
        L_0x03e7:
            r13 = r6
            r14 = r10
            r15 = 5
            goto L_0x03f0
        L_0x03eb:
            r13 = r6
            r14 = r10
            r15 = 5
            r16 = 1
        L_0x03f0:
            r18 = 20
            r19 = 10
            r24 = 0
        L_0x03f6:
            int r1 = f1867H4
            int[] r2 = f1859F4
            r2 = r2[r14]
            int r1 = r1 + r2
            int r1 = r1 + 13
            int[] r2 = f1863G4
            r2 = r2[r14]
            int r2 = r2 + 13
            r13.mo173a(r1, r2, r11)
            int r1 = r0.f2138q0
            if (r14 != r1) goto L_0x0418
            boolean r1 = r25.mo555w0()
            if (r1 != 0) goto L_0x0418
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 10
            if (r1 > r15) goto L_0x041c
        L_0x0418:
            int r1 = r0.f2148v0
            if (r14 != r1) goto L_0x0432
        L_0x041c:
            h.a.a.b r1 = p011e.C0078o.f962w
            int r2 = f1867H4
            int[] r3 = f1859F4
            r3 = r3[r14]
            int r2 = r2 + r3
            int r2 = r2 + 13
            int[] r3 = f1863G4
            r3 = r3[r14]
            int r3 = r3 + 14
            r4 = 3
            r11.mo776e(r1, r2, r3, r4)
            goto L_0x0433
        L_0x0432:
            r4 = 3
        L_0x0433:
            int r10 = r14 + 1
            r13 = 11152401(0xaa2c11, float:1.5627842E-38)
            r14 = 3
            r15 = 2
            goto L_0x02e6
        L_0x043c:
            r25.m879S0(r26)
        L_0x043f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m884X0(j.f):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: g.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p013g.C0128m m885Y(int r19, int r20) {
        /*
            r18 = this;
            r7 = 4
            k.i[] r8 = new p020k.C0173i[r7]
            k.i r0 = f1920V1
            r9 = 0
            r8[r9] = r0
            k.i r0 = f1924W1
            r10 = 1
            r8[r10] = r0
            k.i r0 = f1912T1
            r1 = 2
            r8[r1] = r0
            k.i r0 = f1908S1
            r1 = 3
            r8[r1] = r0
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x001a:
            if (r11 >= r7) goto L_0x0099
            r12 = r0
            r13 = r1
            r14 = 0
        L_0x001f:
            r0 = r8[r11]
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x0094
            r0 = r8[r11]
            java.lang.Object r0 = r0.elementAt(r14)
            r15 = r0
            g.m r15 = (p013g.C0128m) r15
            boolean r0 = r15.mo177d()
            if (r0 == 0) goto L_0x0037
            goto L_0x0091
        L_0x0037:
            boolean r0 = r15 instanceof p013g.C0137v
            if (r0 == 0) goto L_0x004f
            r0 = r15
            g.v r0 = (p013g.C0137v) r0
            boolean r1 = r0.f2282N
            if (r1 == 0) goto L_0x004f
            g.e r1 = p013g.C0114e.m647e0()
            g.v r1 = r1.f1457M0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            goto L_0x0091
        L_0x004f:
            int r16 = r15.mo176c()
            int r17 = r15.mo179g()
            int r0 = r15.mo174a()
            int r1 = r15.mo178f()
            int r2 = r0 / 2
            int r2 = r16 - r2
            int r3 = r2 + -30
            int r2 = r17 - r1
            int r4 = r2 + -30
            int r5 = r0 + 60
            int r6 = r1 + 60
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r0 = r0.m900k0(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0091
            int r0 = r19 - r16
            int r0 = p013g.C0111c0.m574a(r0)
            int r1 = r20 - r17
            int r1 = p013g.C0111c0.m574a(r1)
            int r0 = r0 + r1
            if (r12 != 0) goto L_0x008e
            if (r11 != r10) goto L_0x008b
            return r15
        L_0x008b:
            r13 = r0
            r12 = r15
            goto L_0x0091
        L_0x008e:
            if (r0 >= r13) goto L_0x0091
            goto L_0x008b
        L_0x0091:
            int r14 = r14 + 1
            goto L_0x001f
        L_0x0094:
            int r11 = r11 + 1
            r0 = r12
            r1 = r13
            goto L_0x001a
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m885Y(int, int):g.m");
    }

    /* renamed from: Y0 */
    public static final void m886Y0(C0159f fVar) {
        for (int i = 0; i < 2; i++) {
            if (f1923V4[i] != -1) {
                if (f1931X4[i] == 1) {
                    fVar.mo776e(f1935Y4[f1927W4[i]], f1915T4[i], f1919U4[i], 3);
                } else {
                    C0143b[] bVarArr = f1935Y4;
                    int[] iArr = f1927W4;
                    fVar.mo779h(bVarArr[iArr[i]], 0, 0, C0159f.m1451u(bVarArr[iArr[i]]), C0159f.m1450t(f1935Y4[f1927W4[i]]), 2, f1915T4[i], f1919U4[i], 3);
                }
            }
        }
    }

    /* renamed from: Z */
    public static C0137v m887Z(byte b) {
        return (C0137v) f1920V1.elementAt(b);
    }

    /* renamed from: Z0 */
    private void m888Z0(C0159f fVar) {
        if (!mo548t0()) {
            m901l1(fVar);
            if (!C0121h0.m826f() && !mo559y0()) {
                fVar.mo776e(C0178n.f2969g == 15 ? f2002n3 : f1997m3, f2047x4 + 17, f2051y4 + 17, 3);
            }
            boolean z = f1914T3;
        }
    }

    /* renamed from: a0 */
    public static C0137v m889a0(int i) {
        for (int i2 = 0; i2 < f1920V1.size(); i2++) {
            C0137v vVar = (C0137v) f1920V1.elementAt(i2);
            if (vVar.f2331y == i) {
                return vVar;
            }
        }
        return null;
    }

    /* renamed from: a1 */
    private void m890a1(C0159f fVar) {
        if (this.f2099V0 != 0) {
            String str = "";
            for (int i = 0; i < this.f2085O0.length; i++) {
                str = str + this.f2087P0[i] + " ";
            }
            C0067i0.m243g(fVar, 20, 45, 95, 35, 16777215, false);
            C0177m.f2951s.mo909a(fVar, C0057d1.f639g, 68, 50, 2);
            C0177m.f2951s.mo909a(fVar, str + "", 68, 65, 2);
        }
    }

    /* renamed from: b0 */
    public static C0050b0 m891b0(short s) {
        for (int i = 0; i < f1924W1.size(); i++) {
            C0050b0 b0Var = (C0050b0) f1924W1.elementAt(i);
            if (b0Var.f362A4.f381a == s) {
                return b0Var;
            }
        }
        return null;
    }

    /* renamed from: b1 */
    private void m892b1() {
        int i;
        C0114e eVar;
        if (C0114e.m647e0().f1477Q0 != null) {
            if (C0114e.m647e0().f1593n < C0114e.m647e0().f1477Q0.f966a) {
                eVar = C0114e.m647e0();
                i = 1;
            } else {
                eVar = C0114e.m647e0();
                i = -1;
            }
            eVar.f1633v = i;
            int abs = Math.abs(C0114e.m647e0().f1593n - C0114e.m647e0().f1477Q0.f966a);
            int abs2 = Math.abs(C0114e.m647e0().f1598o - C0114e.m647e0().f1477Q0.f967b);
            if (abs > 40 || abs2 >= 40) {
                C0114e.m647e0().f1541c2 = new C0100z(C0114e.m647e0().f1477Q0.f966a, C0114e.m647e0().f1477Q0.f967b);
                C0114e.m647e0().f1619s0 = new C0055d((String) null, (C0072l) null, 8002, (Object) null);
                C0145a.m1358m();
                C0145a.m1359n();
                return;
            }
            C0145a.m1358m();
            C0145a.m1359n();
            if (C0114e.m647e0().f1477Q0.f974i.f1026a != 673) {
                C0105d.m365M().mo306t0(C0114e.m647e0().f1477Q0.f973h);
            } else {
                mo539p();
            }
        }
    }

    /* renamed from: c0 */
    public static C0126k m893c0() {
        if (f1970h1 == null) {
            f1970h1 = new C0126k();
        }
        return f1970h1;
    }

    /* renamed from: e0 */
    public static C0050b0 m894e0() {
        for (int i = 0; i < f1924W1.size(); i++) {
            C0050b0 b0Var = (C0050b0) f1924W1.elementAt(i);
            if (b0Var.f362A4.f381a == m896g0()) {
                return b0Var;
            }
        }
        return null;
    }

    /* renamed from: f0 */
    public static int m895f0() {
        if (C0114e.m647e0().f1644x0 == null) {
            return -1;
        }
        return f1925W2[C0114e.m647e0().f1644x0.f1095a];
    }

    /* renamed from: g0 */
    public static byte m896g0() {
        if (C0114e.m647e0().f1644x0 == null) {
            return -1;
        }
        int i = C0114e.m647e0().f1644x0.f1095a;
        int[] iArr = f1921V2;
        if (i <= iArr.length - 1) {
            return (byte) iArr[C0114e.m647e0().f1644x0.f1095a];
        }
        return 0;
    }

    /* renamed from: j */
    public static void m897j(String str) {
        C0145a.m1366v();
        C0050b0 b0Var = new C0050b0(-1, 0, 0, 0, 0, 0);
        b0Var.f1442J0 = 1139;
        C0006b.m32c(str, 100000, b0Var);
        C0006b.f96D.f114s = new C0055d(C0057d1.f606b1, (C0072l) C0006b.f96D, 1001, (Object) null);
        C0006b.f96D.f114s.f407h = (C0145a.f2614V / 2) - 35;
        C0006b.f96D.f114s.f408i = C0145a.f2616W - 35;
    }

    /* renamed from: j1 */
    public static void m898j1() {
        C0101z0.f1120u.removeAllElements();
        f1908S1.removeAllElements();
        f1912T1.removeAllElements();
        C0008d.f124b.removeAllElements();
        C0008d.f127e.removeAllElements();
        C0008d.f126d.removeAllElements();
        C0008d.f128f.removeAllElements();
        C0008d.f123a.removeAllElements();
        f1916U1.removeAllElements();
        f1920V1.removeAllElements();
        f1924W1.removeAllElements();
        C0114e.m647e0().f1488S1.removeAllElements();
    }

    /* renamed from: k */
    private void m899k() {
        C0173i iVar = new C0173i("");
        iVar.addElement(new C0055d(C0057d1.f525P0[1], 110381));
        iVar.addElement(new C0055d(C0057d1.f525P0[2], 110382));
        iVar.addElement(new C0055d(C0057d1.f525P0[3], 110383));
        C0145a.f2627d0.mo590g(iVar, 3);
    }

    /* renamed from: k0 */
    private boolean m900k0(int i, int i2, int i3, int i4, int i5, int i6) {
        return i >= i3 && i <= i3 + i5 && i2 >= i4 && i2 <= i4 + i6;
    }

    /* renamed from: l1 */
    public static void m901l1(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        fVar.mo771C(0, -200, C0145a.f2614V, C0145a.f2616W + 200);
    }

    /* renamed from: q1 */
    public static void m902q1(int i, int i2) {
        if (C0145a.f2614V == 128 || C0145a.f2616W <= 208) {
            i = 126;
            i2 = 160;
        }
        f1959e5 = i;
        f1964f5 = i2;
        int i3 = i / 2;
        f1955d5 = f1985k1 - i3;
        f1951c5 = f2010p1 - (i2 / 2);
        if (C0145a.f2659x && !f1901Q2 && !f1976i2 && !f1909S2 && !f1893O2 && !f1981j2 && !f1986k2 && !f1991l2 && !f1971h2 && !f1905R2) {
            if (C0145a.f2616W <= 240) {
                f1951c5 -= 10;
            }
            if (C0145a.f2659x && !C0145a.f2663z && (C0145a.f2625c0 instanceof C0126k)) {
                f1959e5 = 310;
                f1955d5 = (f1975i1 / 2) - (310 / 2);
                if (f2006o2 && f1944b2 > 0) {
                    f1959e5 = i;
                    f1955d5 = f1985k1 - i3;
                }
            }
        }
        if (f1951c5 < -10) {
            f1951c5 = -10;
        }
        int i4 = C0145a.f2616W;
        if (i4 > 208 && f1951c5 < 0) {
            f1951c5 = 0;
        }
        if (i4 == 208 && f1951c5 < 10) {
            f1951c5 = 10;
        }
    }

    /* renamed from: r1 */
    public static void m903r1() {
        int length;
        int i;
        C0077n0[] n0VarArr = C0145a.f2659x ? f1922V3 : f1918U3;
        f1859F4 = new int[n0VarArr.length];
        f1863G4 = new int[n0VarArr.length];
        int i2 = 0;
        if (!C0145a.f2663z || !f1914T3) {
            f1930X3 = 30;
            if (C0145a.f2614V <= 320) {
                int i3 = f1980j1;
                int i4 = f1930X3;
                f1871I4 = (i3 - i4) - 6;
                f1867H4 = (f1985k1 - ((n0VarArr.length * i4) / 2)) - 25;
            } else {
                f1930X3 = 40;
                f1867H4 = 10;
                f1871I4 = (C0145a.f2616W - f1930X3) + 7;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = f1859F4;
                if (i5 >= iArr.length) {
                    break;
                }
                iArr[i5] = f1930X3 * i5;
                f1863G4[i5] = f1871I4;
                i5++;
            }
            length = n0VarArr.length;
            i = f1930X3;
        } else {
            f1867H4 = 23;
            f1871I4 = 52;
            f1875J4 = 5;
            int i6 = 0;
            while (true) {
                int[] iArr2 = f1859F4;
                if (i6 >= iArr2.length) {
                    break;
                }
                iArr2[i6] = (f1875J4 + 25) * i6;
                f1863G4[i6] = f1871I4;
                i6++;
            }
            length = n0VarArr.length;
            i = f1875J4 + 25;
        }
        f1843B4 = length * i;
        f1847C4 = f1871I4;
        if (C0145a.f2659x) {
            f1867H4 = 17;
            int i7 = C0145a.f2616W - 40;
            f1871I4 = i7;
            if (!f1902Q3.f2698t || f1906R3 != 1) {
                f1843B4 = C0145a.f2614V - 45;
                f1847C4 = C0145a.f2616W - 45;
            } else {
                f1843B4 = n0VarArr.length * f1930X3;
                f1847C4 = i7;
            }
            m904s1();
            while (true) {
                int[] iArr3 = f1859F4;
                if (i2 < iArr3.length) {
                    iArr3[i2] = f1930X3 * i2;
                    f1863G4[i2] = f1871I4;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1.f2699u != false) goto L_0x001d;
     */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m904s1() {
        /*
            int r0 = f1906R3
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = p018i.C0145a.f2614V
            int r0 = r0 + -45
            f2055z4 = r0
            f1851D4 = r0
            i.c r1 = f1902Q3
            boolean r2 = r1.f2700v
            if (r2 == 0) goto L_0x0022
            int r1 = r1.f2695q
            int r1 = r1 + -20
            f1867H4 = r1
            r1 = 35
            f1930X3 = r1
        L_0x001d:
            int r0 = r0 + -45
            f1843B4 = r0
            goto L_0x0027
        L_0x0022:
            boolean r1 = r1.f2699u
            if (r1 == 0) goto L_0x0027
            goto L_0x001d
        L_0x0027:
            int r0 = p018i.C0145a.f2616W
            int r0 = r0 + -45
            f1839A4 = r0
            int r0 = r0 + -45
            f1855E4 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.m904s1():void");
    }

    /* renamed from: t */
    private void m905t() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean[] zArr = C0145a.f2574B;
        if (zArr[2] || zArr[4] || zArr[6] || zArr[1] || zArr[3]) {
            this.f2098V = 0;
            f1950c4 = false;
        }
        if (zArr[5] && !mo553v0()) {
            if (this.f2098V != 0) {
                this.f2098V = 0;
                boolean[] zArr2 = C0145a.f2574B;
                zArr2[6] = false;
                zArr2[4] = false;
            } else if (currentTimeMillis - this.f2094T < 800 && m873I() && (C0114e.m647e0().f1452L0 != null || (C0114e.m647e0().f1472P0 != null && C0114e.m647e0().mo409V(C0114e.m647e0().f1472P0)))) {
                this.f2098V = 10;
                C0145a.f2574B[5] = false;
            }
            this.f2094T = currentTimeMillis;
        }
        if (C0145a.f2600O % 5 == 0 && this.f2098V > 0 && C0114e.m647e0().f1541c2 == null) {
            if (C0114e.m647e0().f1639w0 != null && (C0114e.m647e0().f1639w0.f948a.mo187c() || C0114e.m647e0().f1639w0.f958k)) {
                return;
            }
            if (!(C0114e.m647e0().f1452L0 == null || C0114e.m647e0().f1452L0.f2321o == 1 || C0114e.m647e0().f1452L0.f2321o == 0 || C0114e.m647e0().f1472P0 != null) || (C0114e.m647e0().f1472P0 != null && C0114e.m647e0().mo409V(C0114e.m647e0().f1472P0))) {
                if (!C0114e.m647e0().f1639w0.f958k) {
                    m878N(false, true);
                } else {
                    return;
                }
            }
        }
        int i = this.f2098V;
        if (i > 1) {
            this.f2098V = i - 1;
        }
    }

    /* renamed from: v */
    private void m906v() {
        C0055d dVar;
        if (!mo540p0()) {
            C0069j0 j0Var = this.f2081M0;
            if (j0Var != null && (dVar = j0Var.f844a) != null && dVar.mo137a()) {
                this.f2081M0.f844a.mo139d();
            } else if (!mo558y()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f2080M;
                if (j != 0 && currentTimeMillis - j > 300) {
                    this.f2080M = 0;
                    C0145a.f2624b1 = false;
                    if (!this.f2078L) {
                        m867F();
                        C0145a.f2582F = false;
                    }
                }
                if (C0145a.f2582F) {
                    this.f2078L = m869G();
                    if (currentTimeMillis - this.f2080M < 300) {
                        this.f2080M = 0;
                        m857B();
                    } else {
                        this.f2080M = currentTimeMillis;
                        this.f2090R = f2028t1;
                        this.f2092S = f2032u1;
                    }
                    C0145a.f2582F = false;
                }
            }
        }
    }

    /* renamed from: w */
    private void m907w(int i, int i2) {
        int i3;
        if (!f1902Q3.mo740c()) {
            C0114e.m647e0().mo440n();
            int i4 = C0121h0.f1784c;
            if (i < i4 && i > i4 - 32) {
                C0114e.m647e0().f1541c2 = new C0100z(C0121h0.f1784c, i2);
            } else if (i >= 32 || i <= 0) {
                this.f2086P = i;
                this.f2088Q = i2;
                this.f2084O = false;
                C0114e.m647e0().f1546d2 = 0;
                int i5 = (!C0114e.m647e0().f1559g0 || C0114e.m647e0().f1426G <= 0) ? 1000 : 0;
                if (this.f2088Q <= C0114e.m647e0().f1598o || C0111c0.m574a(this.f2086P - C0114e.m647e0().f1593n) >= 12) {
                    int i6 = 0;
                    while (true) {
                        i3 = 1;
                        if (i6 >= i5 + 60) {
                            break;
                        }
                        int i7 = this.f2088Q;
                        if (i7 + i6 >= C0121h0.f1785d - 24) {
                            break;
                        } else if (C0121h0.m841u(this.f2086P, i7 + i6, 2)) {
                            this.f2088Q = C0121h0.m844x(this.f2088Q + i6);
                            this.f2084O = true;
                            break;
                        } else {
                            i6 += 24;
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i5 + 40) {
                            break;
                        } else if (C0121h0.m841u(this.f2086P, this.f2088Q - i8, 2)) {
                            this.f2088Q = C0121h0.m844x(this.f2088Q - i8);
                            this.f2084O = true;
                            break;
                        } else {
                            i8 += 24;
                        }
                    }
                    this.f2082N = true;
                    if (this.f2084O) {
                        int i9 = this.f2088Q;
                    }
                    C0114e.m647e0().f1546d2 = 0;
                    if (!this.f2084O && this.f2088Q < C0114e.m647e0().f1598o - 50) {
                        C0114e.m647e0().f1546d2 = 20;
                    }
                    this.f2098V = 0;
                    if (C0114e.m647e0().f1440I3) {
                        C0114e.m647e0().mo459w0();
                    }
                    C0114e.m647e0().f1541c2 = new C0100z(this.f2086P, this.f2088Q);
                    C0114e e0 = C0114e.m647e0();
                    if (C0114e.m647e0().f1593n - C0114e.m647e0().f1541c2.f1117a > 0) {
                        i3 = -1;
                    }
                    e0.f1633v = i3;
                    C0114e.m647e0().f1619s0 = null;
                    f1950c4 = false;
                }
            } else {
                C0114e.m647e0().f1541c2 = new C0100z(0, i2);
            }
        }
    }

    /* renamed from: x */
    private boolean m908x(C0128m mVar) {
        int g;
        int i;
        if (mVar != null && (g = mVar.mo179g()) < (i = C0114e.m647e0().f1598o)) {
            while (g < i) {
                i -= 5;
                if (C0121h0.m841u(C0114e.m647e0().f1593n, i, 8192)) {
                    this.f2098V = 0;
                    C0114e.m647e0().mo440n();
                    C0114e.m647e0().f1541c2 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: x1 */
    public static final void m909x1(String str, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (true) {
            if (i6 >= 5) {
                i6 = -1;
                break;
            } else if (f1903Q4[i6] == -1) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 != -1) {
            f1907R4[i6] = i5;
            f1879K4[i6] = str;
            f1883L4[i6] = i;
            f1887M4[i6] = i2;
            f1895O4[i6] = i3;
            f1899P4[i6] = i4 < 0 ? -5 : 5;
            f1903Q4[i6] = 0;
            f1911S4[i6] = 0;
            f1891N4[i6] = 10;
            for (int i7 = 0; i7 < 5; i7++) {
                if (!(f1903Q4[i7] == -1 || i6 == i7 || f1899P4[i6] >= 0)) {
                    int[] iArr = f1883L4;
                    if (C0111c0.m574a(iArr[i6] - iArr[i7]) <= 20) {
                        int[] iArr2 = f1891N4;
                        if (iArr2[i6] == iArr2[i7]) {
                            iArr2[i6] = iArr2[i6] + 10;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: y1 */
    public static final boolean m910y1(int i, int i2, int i3) {
        int[] iArr = f1923V4;
        char c = iArr[0] == -1 ? (char) 0 : 1;
        if (iArr[c] != -1) {
            return false;
        }
        iArr[c] = 0;
        f1931X4[c] = i3;
        f1915T4[c] = i;
        f1919U4[c] = i2;
        return true;
    }

    /* renamed from: z */
    private boolean m911z(int i, int i2) {
        for (int i3 = 0; i3 < C0067i0.f825n.size(); i3++) {
            C0067i0 i0Var = (C0067i0) C0067i0.f825n.elementAt(i3);
            if (m900k0(i, i2, i0Var.f833d, i0Var.f834e, i0Var.f835f, i0Var.f836g)) {
                if (i0Var.f834e <= 24 && C0121h0.m825e() && C0114e.m647e0().f1437I0 != 0) {
                    return false;
                }
                if (i0Var.f841l) {
                    i0Var.mo150b(10);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B1 */
    public void mo486B1() {
        if (this.f2105Y0) {
            int i = this.f2101W0 - 2;
            this.f2101W0 = i;
            if (i < (-this.f2103X0)) {
                this.f2101W0 = C0145a.f2614V;
                f2004n5.removeElementAt(0);
                if (f2004n5.size() == 0) {
                    this.f2083N0 = false;
                    this.f2105Y0 = false;
                    return;
                }
                this.f2103X0 = C0177m.f2948p.mo914f((String) f2004n5.elementAt(0));
            }
        }
    }

    /* renamed from: D0 */
    public void mo487D0() {
        m871H0();
        m868F0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo488F1() {
        /*
            r6 = this;
            boolean r0 = f1966g2
            if (r0 == 0) goto L_0x012c
            g.i r0 = p018i.C0145a.f2637i0
            if (r0 == 0) goto L_0x000a
            goto L_0x012c
        L_0x000a:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 8
            boolean r1 = r0[r1]
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0026
            int r0 = f1940a2
            int r0 = r0 + r4
            f1940a2 = r0
            k.i r1 = r6.f2151x
            int r1 = r1.size()
            if (r0 < r1) goto L_0x0024
            f1940a2 = r3
        L_0x0024:
            r3 = 1
            goto L_0x003b
        L_0x0026:
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x003b
            int r0 = f1940a2
            int r0 = r0 - r4
            f1940a2 = r0
            if (r0 >= 0) goto L_0x0024
            k.i r0 = r6.f2151x
            int r0 = r0.size()
            int r0 = r0 - r4
            f1940a2 = r0
            goto L_0x0024
        L_0x003b:
            if (r3 == 0) goto L_0x004e
            e.l0 r0 = f1952d2
            int r1 = f1940a2
            int r5 = r0.f892v
            int r1 = r1 * r5
            r0.mo158b(r1)
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
        L_0x004e:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 == 0) goto L_0x0065
            e.l0 r0 = f1952d2
            e.m0 r0 = r0.mo160d()
            boolean r1 = r0.f911a
            if (r1 != 0) goto L_0x0060
            boolean r1 = r0.f913c
            if (r1 == 0) goto L_0x0065
        L_0x0060:
            int r0 = r0.f912b
            f1940a2 = r0
            r3 = 1
        L_0x0065:
            if (r3 == 0) goto L_0x012c
            int r0 = f1940a2
            if (r0 < 0) goto L_0x012c
            k.i r1 = r6.f2151x
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x012c
            k.i r0 = r6.f2151x
            int r1 = f1940a2
            java.lang.Object r0 = r0.elementAt(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r6.f2077K0 = r1
            r6.f2972b = r1
            k.c r3 = p020k.C0167c.m1522b()
            r3.f2795g = r1
            java.lang.String r3 = "http://"
            int r3 = r0.indexOf(r3)
            if (r3 < 0) goto L_0x00c4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "currentLine: "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            p013g.C0111c0.m584k(r2)
            r0.substring(r3)
            e.d r0 = new e.d
            java.lang.String r2 = p011e.C0057d1.f711q1
            r3 = 12000(0x2ee0, float:1.6816E-41)
            r0.<init>(r2, r3)
            r6.f2972b = r0
            boolean r0 = p018i.C0145a.f2659x
            if (r0 != 0) goto L_0x012c
            k.c r0 = p020k.C0167c.m1522b()
            e.d r2 = new e.d
            java.lang.String r4 = p011e.C0057d1.f711q1
            r2.<init>((java.lang.String) r4, (p011e.C0072l) r1, (int) r3, (java.lang.Object) r1)
        L_0x00c1:
            r0.f2795g = r2
            goto L_0x012c
        L_0x00c4:
            java.lang.String r3 = "@"
            int r5 = r0.indexOf(r3)
            if (r5 < 0) goto L_0x012c
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = r0.trim()
            int r2 = r0.indexOf(r3)
            java.lang.String r3 = r0.substring(r2)
            java.lang.String r5 = " "
            int r5 = r3.indexOf(r5)
            if (r5 > 0) goto L_0x00ea
            int r3 = r3.length()
            int r3 = r3 + r2
            goto L_0x00ec
        L_0x00ea:
            int r3 = r5 + r2
        L_0x00ec:
            int r2 = r2 + r4
            java.lang.String r0 = r0.substring(r2, r3)
            r6.f2077K0 = r0
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = r6.f2077K0
            g.e r2 = p013g.C0114e.m647e0()
            java.lang.String r2 = r2.f1511X
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0128
            e.d r0 = new e.d
            java.lang.String r2 = p011e.C0057d1.f697o1
            java.lang.String r3 = r6.f2077K0
            r4 = 12009(0x2ee9, float:1.6828E-41)
            r0.<init>(r2, r4, r3)
            r6.f2972b = r0
            boolean r0 = p018i.C0145a.f2659x
            if (r0 != 0) goto L_0x012c
            k.c r0 = p020k.C0167c.m1522b()
            e.d r2 = new e.d
            java.lang.String r3 = p011e.C0057d1.f697o1
            java.lang.String r5 = r6.f2077K0
            r2.<init>((java.lang.String) r3, (p011e.C0072l) r1, (int) r4, (java.lang.Object) r5)
            goto L_0x00c1
        L_0x0128:
            r6.f2077K0 = r1
            r6.f2972b = r1
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.mo488F1():void");
    }

    /* renamed from: G0 */
    public void mo489G0() {
    }

    /* renamed from: G1 */
    public void mo490G1() {
        if (!mo548t0()) {
            for (int i = 0; i < this.f2142s0.length(); i++) {
                this.f2152x0[i] = -1;
                if (C0145a.f2661y) {
                    int length = (C0145a.f2614V - (this.f2142s0.length() * f2013p4)) / 2;
                    if (C0145a.m1336F(length, C0145a.f2616W - 40, this.f2142s0.length() * f2013p4, f2013p4)) {
                        int i2 = (C0145a.f2586H - length) / f2013p4;
                        if (i == i2) {
                            this.f2152x0[i] = 1;
                        }
                        if (C0145a.f2580E && C0145a.f2582F && i == i2) {
                            char[] charArray = this.f2154y0.toCharArray();
                            C0173i iVar = new C0173i("");
                            for (int i3 = 0; i3 < charArray.length; i3++) {
                                iVar.addElement(charArray[i3] + "");
                            }
                            iVar.removeElementAt(0);
                            iVar.insertElementAt(this.f2142s0.charAt(i) + "", iVar.size());
                            this.f2154y0 = "";
                            for (int i4 = 0; i4 < iVar.size(); i4++) {
                                this.f2154y0 += ((String) iVar.elementAt(i4)).toUpperCase();
                            }
                            C0105d.m365M().mo294n0(this.f2142s0.charAt(i));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I0 */
    public void mo491I0(byte[] bArr) {
        C0111c0.m584k("GET CURRENTSKILL!");
        if (bArr != null && bArr.length != 0) {
            int i = 0;
            while (true) {
                if (i >= C0114e.m647e0().f1629u0.size()) {
                    break;
                }
                C0077n0 n0Var = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i);
                if (n0Var.f948a.f1017a == bArr[0]) {
                    C0114e.m647e0().f1639w0 = n0Var;
                    break;
                }
                i++;
            }
        } else if (C0114e.m647e0().f1629u0.size() > 0) {
            C0114e.m647e0().f1639w0 = (C0077n0) C0114e.m647e0().f1629u0.elementAt(0);
        }
        if (C0114e.m647e0().f1639w0 != null) {
            C0105d.m365M().mo227I0(C0114e.m647e0().f1639w0.f948a.f1017a);
            mo538o1(C0114e.m647e0().f1639w0.f948a.f1017a);
        }
    }

    /* renamed from: I1 */
    public void mo492I1() {
        int i;
        if (f1944b2 != -1) {
            int i2 = f1969g5;
            int i3 = f1974h5;
            if (i2 != i3) {
                int i4 = (i3 - i2) << 2;
                f1984j5 = i4;
                int i5 = f1979i5 + i4;
                f1979i5 = i5;
                f1969g5 = i2 + (i5 >> 4);
                f1979i5 = i5 & 15;
            }
            if (Math.abs(i3 - f1969g5) < 15 && f1969g5 < 0) {
                f1974h5 = 0;
            }
            if (Math.abs(f1974h5 - f1969g5) < 15 && f1969g5 > (i = f1989k5)) {
                f1974h5 = i;
            }
        }
    }

    /* renamed from: J */
    public void mo493J(String str, int i, int i2) {
        C0003d dVar = new C0003d();
        dVar.f32b = i2;
        dVar.f31a = i;
        mo561z1(str, new C0055d(C0057d1.f634f1, 12002, dVar), new C0055d(C0057d1.f641g1, 12003, dVar));
    }

    /* renamed from: J0 */
    public void mo494J0(byte[] bArr) {
        C0111c0.m584k("GET KEYSKILL!");
        f1918U3 = new C0077n0[5];
        if (bArr == null) {
            m858B0();
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= C0114e.m647e0().f1629u0.size()) {
                    break;
                }
                C0077n0 n0Var = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i2);
                if (n0Var.f948a.f1017a == bArr[i]) {
                    f1918U3[i] = n0Var;
                    break;
                }
                i2++;
            }
        }
    }

    /* renamed from: K0 */
    public void mo495K0(byte[] bArr) {
        C0111c0.m584k("GET ONSCREENSKILL!");
        f1922V3 = new C0077n0[5];
        if (bArr == null) {
            C0111c0.m584k("null");
            m860C0();
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= C0114e.m647e0().f1629u0.size()) {
                    break;
                }
                C0077n0 n0Var = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i2);
                if (n0Var.f948a.f1017a == bArr[i]) {
                    f1922V3[i] = n0Var;
                    break;
                }
                i2++;
            }
        }
    }

    /* renamed from: K1 */
    public void mo496K1() {
        if (this.f2099V0 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            f1983j4 = currentTimeMillis;
            if (currentTimeMillis - f1978i4 > 1000) {
                f1978i4 = System.currentTimeMillis();
                f1988k4++;
            }
            if (f1988k4 > 20) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f2085O0;
                    if (i >= iArr.length) {
                        break;
                    }
                    this.f2087P0[i] = iArr[i];
                    i++;
                }
                int i2 = this.f2099V0 - 1;
                this.f2099V0 = i2;
                if (i2 == 0) {
                    this.f2113c1 = "";
                    f1862G3.mo562a(this.f2097U0, 0);
                    f1988k4 = 0;
                    return;
                }
                return;
            }
            int i3 = this.f2095T0;
            int[] iArr2 = this.f2085O0;
            if (i3 > iArr2.length - 1) {
                int i4 = this.f2099V0 - 1;
                this.f2099V0 = i4;
                if (i4 == 0) {
                    this.f2113c1 = "";
                    f1862G3.mo562a(this.f2097U0, 0);
                    return;
                }
                return;
            }
            int[] iArr3 = this.f2087P0;
            if (i3 < iArr3.length) {
                int[] iArr4 = this.f2089Q0;
                if (iArr4[i3] == 15) {
                    if (iArr3[i3] == iArr2[i3] - 1) {
                        this.f2093S0[i3] = 10;
                    }
                    if (iArr3[i3] == iArr2[i3]) {
                        iArr4[i3] = -1;
                        this.f2095T0 = i3 + 1;
                    }
                } else if (C0145a.f2600O % 5 == 0) {
                    iArr4[i3] = iArr4[i3] + 1;
                }
            }
            for (int i5 = 0; i5 < this.f2085O0.length; i5++) {
                int[] iArr5 = this.f2089Q0;
                if (iArr5[i5] != -1) {
                    int[] iArr6 = this.f2091R0;
                    iArr6[i5] = iArr6[i5] + 1;
                    if (iArr6[i5] > iArr5[i5] + this.f2093S0[i5]) {
                        iArr6[i5] = 0;
                        int[] iArr7 = this.f2087P0;
                        iArr7[i5] = iArr7[i5] + 1;
                        if (iArr7[i5] >= 10) {
                            iArr7[i5] = 0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public void mo497L(String[] strArr, C0050b0 b0Var) {
        C0173i iVar = new C0173i("");
        for (String dVar : strArr) {
            iVar.addElement(new C0055d(dVar, 11057, b0Var));
        }
        C0145a.f2627d0.mo590g(iVar, 2);
    }

    /* renamed from: L0 */
    public void mo498L0(C0045c cVar) {
        C0130o.m1005a();
        try {
            int[] iArr = new int[cVar.mo128d().readByte()];
            this.f2127l = iArr;
            this.f2129m = new int[iArr.length];
            this.f2131n = new int[iArr.length];
            this.f2133o = new int[iArr.length];
            this.f2135p = new int[iArr.length];
            this.f2139r = new String[iArr.length];
            this.f2137q = new int[iArr.length];
            this.f2141s = new String[iArr.length];
            int i = 0;
            while (true) {
                int[] iArr2 = this.f2127l;
                if (i >= iArr2.length) {
                    break;
                }
                iArr2[i] = cVar.mo128d().readByte();
                this.f2129m[i] = cVar.mo128d().readByte();
                this.f2131n[i] = cVar.mo128d().readByte();
                this.f2133o[i] = cVar.mo128d().readByte();
                if (cVar.mo128d().readByte() == 1) {
                    this.f2139r[i] = cVar.mo128d().readUTF();
                    this.f2135p[i] = cVar.mo128d().readInt();
                    this.f2141s[i] = cVar.mo128d().readUTF();
                    this.f2137q[i] = cVar.mo128d().readInt();
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C0145a.f2629e0.mo688w2();
        C0145a.f2629e0.mo689x2();
    }

    /* renamed from: N0 */
    public void mo499N0(C0159f fVar, int i) {
        int[] iArr;
        for (int i2 = 0; i2 < C0121h0.f1768G.size(); i2++) {
            C0165a aVar = (C0165a) C0121h0.f1768G.elementAt(i2);
            if (aVar.f2777c != -1 && aVar.f2782h == i) {
                aVar.mo819f(fVar);
            }
        }
        if (C0121h0.f1803v == 48 && i == 3 && !C0145a.m1339K() && (iArr = C0145a.f2646p0) != null && iArr[0] != 0) {
            for (int i3 = 0; i3 < (C0121h0.f1784c / C0145a.f2646p0[0]) + 1; i3++) {
                fVar.mo776e(C0145a.f2643m0[0], C0145a.f2646p0[0] * i3, (C0121h0.f1785d - C0145a.f2647q0[0]) - 70, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo500O(C0077n0 n0Var, boolean z) {
        if (!C0114e.m647e0().f1474P2 && !mo540p0() && C0114e.m647e0().f1644x0.f1097c > 1) {
            C0114e.m647e0().f1639w0 = n0Var;
            C0077n0 n0Var2 = this.f2140r0;
            if (n0Var2 != n0Var && n0Var2 != null) {
                C0105d.m365M().mo227I0(n0Var.f948a.f1017a);
                mo538o1(n0Var.f948a.f1017a);
                mo527k1();
                this.f2140r0 = n0Var;
                this.f2138q0 = -1;
                m893c0().f2098V = 0;
            } else if (C0114e.m647e0().mo419a0()) {
                C0111c0.m584k("use skill not focus");
                mo509T(n0Var);
                this.f2140r0 = n0Var;
            } else {
                this.f2138q0 = -1;
                if (n0Var != null) {
                    C0111c0.m584k("only select skill");
                    if (this.f2140r0 != n0Var) {
                        C0105d.m365M().mo227I0(n0Var.f948a.f1017a);
                        mo538o1(n0Var.f948a.f1017a);
                        mo527k1();
                    }
                    if (C0114e.m647e0().f1472P0 != null || !C0114e.m647e0().mo417Z()) {
                        if (C0114e.m647e0().mo375D()) {
                            m878N(z, true);
                        }
                        this.f2140r0 = n0Var;
                        return;
                    }
                    C0111c0.m584k("return o day");
                }
            }
        }
    }

    /* renamed from: O0 */
    public void mo501O0(C0159f fVar) {
        if (!C0145a.m1339K()) {
            fVar.mo786o(f1942a4, 0, 0, C0145a.f2614V, C0145a.f2616W);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo502P(C0085r0 r0Var) {
        C0111c0.m584k("DO SET KEY SKILL");
        C0077n0 H = C0114e.m647e0().mo383H(r0Var);
        String[] strArr = C0176l.f2892C ? C0057d1.f483J0 : C0057d1.f490K0;
        C0173i iVar = new C0173i("");
        for (int i = 0; i < 5; i++) {
            iVar.addElement(new C0055d(strArr[i], 11121, new Object[]{H, i + ""}));
        }
        C0145a.f2627d0.mo590g(iVar, 0);
    }

    /* renamed from: P0 */
    public void mo503P0(C0159f fVar) {
        C0177m mVar;
        StringBuilder sb;
        C0096x.m327b(fVar, C0114e.m647e0().f1593n, C0114e.m647e0().f1598o);
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        if (!C0145a.f2627d0.f2239a && !C0145a.f2629e0.f2467a && C0006b.f95C == null && C0145a.f2659x) {
            for (int i = 0; i < this.f2142s0.length(); i++) {
                int i2 = C0145a.f2614V;
                int length = this.f2142s0.length();
                int i3 = f2013p4;
                int i4 = ((i2 - (length * i3)) / 2) + (i * i3) + (i3 / 2);
                if (this.f2152x0[i] == -1) {
                    fVar.mo776e(f1998m4, i4, C0145a.f2616W - 25, 3);
                    mVar = C0177m.f2951s;
                    sb = new StringBuilder();
                } else {
                    fVar.mo776e(f2003n4, i4, C0145a.f2616W - 25, 3);
                    mVar = C0177m.f2952t;
                    sb = new StringBuilder();
                }
                sb.append(this.f2142s0.charAt(i));
                sb.append("");
                mVar.mo909a(fVar, sb.toString(), i4, C0145a.f2616W - 30, 2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo504Q(C0085r0 r0Var) {
        C0111c0.m584k("DO SET ONSCREEN SKILL");
        C0077n0 H = C0114e.m647e0().mo383H(r0Var);
        C0173i iVar = new C0173i("");
        int i = 0;
        while (i < 5) {
            Object[] objArr = {H, i + ""};
            StringBuilder sb = new StringBuilder();
            sb.append(C0057d1.f691n2);
            i++;
            sb.append(i);
            iVar.addElement(new C0055d(sb.toString(), 11120, objArr));
        }
        C0145a.f2627d0.mo590g(iVar, 0);
    }

    /* renamed from: Q0 */
    public void mo505Q0(C0159f fVar) {
        if (f2004n5.size() != 0 && f2009o5) {
            fVar.mo771C(0, C0145a.f2616W - 13, C0145a.f2614V, 15);
            fVar.mo770B();
            fVar.mo774a(0, C0145a.f2616W - 13, C0145a.f2614V, 15);
            fVar.mo784m(0, C0145a.f2616W - 13, C0145a.f2614V, 15, 0, 90);
            C0177m.f2950r.mo909a(fVar, (String) f2004n5.elementAt(0), this.f2101W0, C0145a.f2616W - 12, 0);
            fVar.mo769A();
        }
    }

    /* renamed from: R */
    public void mo506R() {
        if (!C0114e.m647e0().f1505V3 && !C0114e.m647e0().f1490S3 && C0114e.m647e0().f1435H3 <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f2096U >= 10000) {
                if (!C0114e.m647e0().mo369A()) {
                    f1862G3.mo562a(C0057d1.f504M0, 0);
                    return;
                }
                C0020p.m98f(11, C0114e.m647e0(), 5);
                C0020p.m98f(104, C0114e.m647e0(), 4);
                this.f2096U = currentTimeMillis;
                C0175k.m1563p().mo883m();
            }
        }
    }

    /* renamed from: R0 */
    public void mo507R0(C0159f fVar) {
        for (int i = 0; i < C0008d.f124b.size(); i++) {
            C0008d dVar = (C0008d) C0008d.f124b.elementAt(i);
            if (!(dVar instanceof C0006b)) {
                dVar.mo12a(fVar);
            }
        }
        if (!C0145a.m1339K()) {
            for (int i2 = 0; i2 < C0008d.f127e.size(); i2++) {
                ((C0008d) C0008d.f127e.elementAt(i2)).mo12a(fVar);
            }
        }
        for (int i3 = 0; i3 < C0008d.f126d.size(); i3++) {
            ((C0008d) C0008d.f126d.elementAt(i3)).mo12a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo508S(C0077n0 n0Var, boolean z) {
        int i = C0121h0.f1803v;
        if ((i != 112 && i != 113) || C0114e.m647e0().f1437I0 != 0) {
            if (C0114e.m647e0().mo419a0()) {
                mo509T(n0Var);
                return;
            }
            this.f2138q0 = -1;
            if (n0Var != null) {
                C0105d.m365M().mo227I0(n0Var.f948a.f1017a);
                mo538o1(n0Var.f948a.f1017a);
                mo527k1();
                C0114e.m647e0().f1639w0 = n0Var;
                m878N(z, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo509T(C0077n0 n0Var) {
        int i = C0121h0.f1803v;
        if (((i != 112 && i != 113) || C0114e.m647e0().f1437I0 != 0) && m870H()) {
            this.f2138q0 = -1;
            if (n0Var != null) {
                C0105d.m365M().mo227I0(n0Var.f948a.f1017a);
                mo538o1(n0Var.f948a.f1017a);
                mo527k1();
                C0114e.m647e0().f1639w0 = n0Var;
                C0114e.m647e0().mo466y1();
                C0114e.m647e0().f1612q3 = true;
                this.f2098V = 0;
            }
        }
    }

    /* renamed from: U */
    public void mo510U() {
        this.f2106Z = true;
        int[] iArr = C0145a.f2599N0;
        this.f2122i0 = C0159f.m1449c(0.4f, 0, iArr[iArr.length - 1]);
    }

    /* renamed from: U0 */
    public void mo511U0(C0159f fVar, C0114e eVar) {
        C0159f fVar2 = fVar;
        C0114e eVar2 = eVar;
        int i = eVar2.f1431H;
        int i2 = f1939Z4;
        int i3 = eVar2.f1461N;
        int i4 = (i * i2) / i3;
        int i5 = eVar2.f1426G;
        int i6 = f1947b5;
        int i7 = (i5 * i6) / 1;
        int i8 = (this.f2063D0 * i2) / i3;
        int i9 = (this.f2057A0 * i6) / 1;
        fVar2.mo771C(((C0145a.f2614V / 2) + 58) - C0159f.m1451u(f1870I3), 0, 95, 100);
        fVar.mo770B();
        fVar2.mo774a(((C0145a.f2614V / 2) + 58) - C0159f.m1451u(f1870I3), 0, 95, 100);
        C0143b bVar = f1870I3;
        int i10 = i9;
        fVar.mo780i(bVar, 0, 0, C0159f.m1451u(bVar), C0159f.m1450t(f1870I3), 2, (C0145a.f2614V / 2) + 60, 0, 24, false);
        fVar.mo769A();
        int i11 = f1939Z4;
        fVar2.mo771C((((((C0145a.f2614V / 2) + 60) - 83) - i11) + i11) - i8, 5, i8, 10);
        fVar.mo770B();
        int i12 = f1939Z4;
        fVar2.mo774a((((((C0145a.f2614V / 2) + 60) - 83) - i12) + i12) - i8, 5, i8, 10);
        fVar2.mo776e(f1890N3, ((C0145a.f2614V / 2) + 60) - 83, 5, 24);
        C0159f.m1454z(fVar);
        fVar.mo769A();
        fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        int i13 = f1939Z4;
        fVar2.mo771C((((((C0145a.f2614V / 2) + 60) - 83) - i13) + i13) - i4, 5, i4, 10);
        fVar.mo770B();
        int i14 = f1939Z4;
        fVar2.mo774a((((((C0145a.f2614V / 2) + 60) - 83) - i14) + i14) - i4, 5, i4, 10);
        fVar2.mo776e(f1878K3, ((C0145a.f2614V / 2) + 60) - 83, 5, 24);
        C0159f.m1454z(fVar);
        fVar.mo769A();
        fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        fVar2.mo771C((((((C0145a.f2614V / 2) + 60) - 83) - f1947b5) + f1939Z4) - i10, 20, i10, 6);
        fVar.mo770B();
        fVar2.mo774a((((((C0145a.f2614V / 2) + 60) - 83) - f1947b5) + f1939Z4) - i10, 20, i10, 6);
        fVar2.mo776e(f1894O3, ((C0145a.f2614V / 2) + 60) - 83, 20, 24);
        fVar.mo769A();
        fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        fVar2.mo771C((((((C0145a.f2614V / 2) + 60) - 83) - f1947b5) + f1939Z4) - i7, 20, i7, 6);
        fVar.mo770B();
        fVar2.mo774a((((((C0145a.f2614V / 2) + 60) - 83) - f1947b5) + f1939Z4) - i7, 20, i7, 6);
        fVar2.mo776e(f1882L3, ((C0145a.f2614V / 2) + 60) - 83, 20, 24);
        fVar.mo769A();
        fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public C0114e mo512W() {
        for (int i = 0; i < f1908S1.size(); i++) {
            C0114e eVar = (C0114e) f1908S1.elementAt(i);
            if (eVar.f1437I0 != 0) {
                return eVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public C0114e mo513X() {
        for (int i = 0; i < f1908S1.size(); i++) {
            C0114e eVar = (C0114e) f1908S1.elementAt(i);
            if (eVar.f1437I0 != 0 && eVar != mo512W()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo514a(String str, String str2) {
        if (!f1905R2 || C0145a.f2659x) {
            C0167c.m1522b().f2790b = false;
        }
        if (str2.equals(C0057d1.f436C2)) {
            if (f1866H3.f2190q != C0114e.m647e0().f1638w) {
                C0105d.m365M().mo303s(str, f1866H3.f2190q);
            }
        } else if (!str.equals("")) {
            if (str.equals("pingABCD")) {
                C0105d.m365M().mo231K0();
                C0105d.m365M().mo233L0();
                f1999m5 = !f1999m5;
            }
            if (str.equals("icon")) {
                C0111c0.f1308e = !C0111c0.f1308e;
            }
            if (str.equals("big")) {
                C0111c0.f1309f = !C0111c0.f1309f;
            }
            C0105d.m365M().mo299q(str);
        }
    }

    /* renamed from: b */
    public void mo515b() {
        if (f1905R2) {
            f1905R2 = false;
            C0167c.m1522b().f2795g = null;
        }
    }

    /* renamed from: c1 */
    public void mo516c1(C0114e eVar) {
        this.f2098V = 0;
        C0145a.m1358m();
        if (C0114e.m647e0().f1472P0.f1638w >= 0 && C0114e.m647e0().f1638w >= 0) {
            C0173i iVar = C0145a.f2629e0.f2474c0;
            if (iVar.size() <= 0) {
                if (C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1097c > 1) {
                    iVar.addElement(new C0055d(C0057d1.f429B2, 11112, C0114e.m647e0().f1472P0));
                    iVar.addElement(new C0055d(C0057d1.f762x3, 11113, C0114e.m647e0().f1472P0));
                }
                if (C0114e.m647e0().f1521Z != null && C0114e.m647e0().f1527a0 < 2 && C0114e.m647e0().f1472P0.f1516Y == -1) {
                    iVar.addElement(new C0055d(C0057d1.f448E0[4], 110391));
                }
                if (C0114e.m647e0().f1472P0.f1628u == 14 || C0114e.m647e0().f1472P0.f1628u == 5) {
                    int i = C0114e.m647e0().f1639w0.f948a.f1021e;
                } else if (C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1097c >= 14) {
                    iVar.addElement(new C0055d(C0057d1.f448E0[0], 2003));
                }
                if (!(C0114e.m647e0().f1521Z == null || C0114e.m647e0().f1521Z.f0a != C0114e.m647e0().f1472P0.f1516Y || C0114e.m647e0().f1472P0.f1628u == 14 || C0114e.m647e0().f1644x0 == null || C0114e.m647e0().f1644x0.f1097c < 14)) {
                    iVar.addElement(new C0055d(C0057d1.f448E0[1], 2004));
                }
                for (C0085r0 r0Var : C0114e.m647e0().f1614r0.f339c) {
                    C0077n0 H = C0114e.m647e0().mo383H(r0Var);
                    if (H != null && r0Var.mo186b() && H.f950c >= 1) {
                        iVar.addElement(new C0055d(r0Var.f1018b, 12004, H));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:381:0x08a4 A[LOOP:19: B:379:0x089c->B:381:0x08a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x08fc  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0927 A[LOOP:21: B:399:0x0927->B:401:0x092c, LOOP_START, PHI: r9 
      PHI: (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:398:0x0925, B:401:0x092c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:469:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo341d(p019j.C0159f r28) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = 0
            f1898P3 = r9
            boolean r1 = f2018q4
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r1 = "PA1"
            r10 = 1
            p018i.C0145a.m1363r(r1, r10)
            boolean r1 = r0.f2102X
            r11 = 30
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = 4
            r7 = 50
            r14 = 3
            if (r1 != 0) goto L_0x0027
            boolean r1 = r0.f2104Y
            if (r1 == 0) goto L_0x0087
            b.b r1 = p001b.C0006b.f95C
            if (r1 != 0) goto L_0x0087
        L_0x0027:
            int r1 = r0.f2100W
            int r1 = r1 + r10
            r0.f2100W = r1
            if (r1 >= r11) goto L_0x0035
            if (r1 < 0) goto L_0x0035
            int r2 = p018i.C0145a.f2600O
            int r2 = r2 % r13
            if (r2 == 0) goto L_0x0040
        L_0x0035:
            if (r1 < r11) goto L_0x003e
            if (r1 > r7) goto L_0x003e
            int r2 = p018i.C0145a.f2600O
            int r2 = r2 % r14
            if (r2 == 0) goto L_0x0040
        L_0x003e:
            if (r1 <= r7) goto L_0x0087
        L_0x0040:
            r8.mo772D(r12)
            int r1 = p018i.C0145a.f2614V
            int r2 = p018i.C0145a.f2616W
            r8.mo783l(r9, r9, r1, r2)
            int r1 = r0.f2100W
            if (r1 <= r7) goto L_0x0086
            boolean r1 = r0.f2104Y
            if (r1 == 0) goto L_0x0065
            r0.f2104Y = r9
            r0.f2100W = r9
            boolean r1 = r0.f2119g0
            if (r1 == 0) goto L_0x0062
            int r1 = r0.f2124j0
            int r2 = r0.f2126k0
            r0.mo544r(r1, r2)
            goto L_0x0065
        L_0x0062:
            r27.mo524i0()
        L_0x0065:
            r27.m882V0(r28)
            int r1 = f2028t1
            int r1 = -r1
            int r2 = f2032u1
            int r2 = -r2
            r8.mo773E(r1, r2)
            int r1 = p018i.C0145a.f2595L0
            r8.mo773E(r9, r1)
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo136g0(r8)
            p019j.C0161h.m1499q(r28)
            m901l1(r28)
            r27.m884X0(r28)
        L_0x0086:
            return
        L_0x0087:
            java.lang.String r1 = "PA2"
            p018i.C0145a.m1363r(r1, r10)
            p018i.C0145a.m1340L(r28)
            boolean r1 = r0.f2106Z
            if (r1 != 0) goto L_0x0097
            boolean r1 = r0.f2083N0
            if (r1 == 0) goto L_0x009e
        L_0x0097:
            int r1 = p013g.C0121h0.f1806y
            if (r1 == r14) goto L_0x009e
            r27.mo501O0(r28)
        L_0x009e:
            java.lang.String r1 = "PA3"
            p018i.C0145a.m1363r(r1, r10)
            int r1 = f2023r4
            if (r1 <= 0) goto L_0x00c5
            int r2 = f2028t1
            int r2 = -r2
            int[] r3 = f2027s4
            int r4 = r3.length
            int r4 = r1 % r4
            r3 = r3[r4]
            int r2 = r2 + r3
            int r3 = f2032u1
            int r3 = -r3
            int[] r4 = f2031t4
            int r5 = r4.length
            int r1 = r1 % r5
            r1 = r4[r1]
            int r3 = r3 + r1
            r8.mo773E(r2, r3)
            int r1 = f2023r4
            int r1 = r1 - r10
            f2023r4 = r1
            goto L_0x00ce
        L_0x00c5:
            int r1 = f2028t1
            int r1 = -r1
            int r2 = f2032u1
            int r2 = -r2
            r8.mo773E(r1, r2)
        L_0x00ce:
            boolean r1 = r0.f2110b0
            if (r1 == 0) goto L_0x00dd
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r14
            if (r1 != 0) goto L_0x00d9
            r1 = 3
            goto L_0x00da
        L_0x00d9:
            r1 = -3
        L_0x00da:
            r8.mo773E(r1, r9)
        L_0x00dd:
            p001b.C0005a.m14i(r28)
            p001b.C0007c.m46d(r28)
            p013g.C0121h0.m837q(r28)
            p013g.C0121h0.m834n(r28)
            r1 = 0
        L_0x00ea:
            k.i r2 = f1908S1
            int r2 = r2.size()
            r15 = 128(0x80, float:1.794E-43)
            if (r1 >= r2) goto L_0x010e
            k.i r2 = f1908S1
            java.lang.Object r2 = r2.elementAt(r1)
            g.e r2 = (p013g.C0114e) r2
            boolean r3 = r2.f1536b3
            if (r3 == 0) goto L_0x010b
            int r3 = p013g.C0121h0.f1803v
            if (r3 != r15) goto L_0x010b
            int r3 = r2.f1593n
            int r4 = r2.f1598o
            r2.mo443o0(r8, r3, r4, r9)
        L_0x010b:
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x010e:
            g.e r1 = p013g.C0114e.m647e0()
            boolean r1 = r1.f1536b3
            if (r1 == 0) goto L_0x012d
            int r1 = p013g.C0121h0.f1803v
            if (r1 != r15) goto L_0x012d
            g.e r1 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1598o
            r1.mo443o0(r8, r2, r3, r9)
        L_0x012d:
            r6 = 2
            r0.mo499N0(r8, r6)
            g.e r1 = p013g.C0114e.m647e0()
            e.d r1 = r1.f1554f0
            if (r1 == 0) goto L_0x0161
            boolean r1 = p018i.C0145a.f2659x
            if (r1 == 0) goto L_0x0161
            int r1 = p020k.C0178n.f2969g
            r2 = 20
            if (r1 != r2) goto L_0x0146
            h.a.a.b r1 = f2002n3
            goto L_0x0148
        L_0x0146:
            h.a.a.b r1 = f1997m3
        L_0x0148:
            g.e r2 = p013g.C0114e.m647e0()
            e.d r2 = r2.f1554f0
            int r2 = r2.f407h
            int r3 = f2028t1
            int r2 = r2 + r3
            g.e r3 = p013g.C0114e.m647e0()
            e.d r3 = r3.f1554f0
            int r3 = r3.f408i
            int r4 = f2032u1
            int r3 = r3 + r4
            r8.mo776e(r1, r2, r3, r14)
        L_0x0161:
            java.lang.String r1 = "PA4"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA5"
            p018i.C0145a.m1363r(r1, r10)
            p001b.C0005a.m13g(r28)
            r1 = 0
        L_0x016f:
            k.i r2 = p001b.C0008d.f128f
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0185
            k.i r2 = p001b.C0008d.f128f
            java.lang.Object r2 = r2.elementAt(r1)
            b.d r2 = (p001b.C0008d) r2
            r2.mo12a(r8)
            int r1 = r1 + 1
            goto L_0x016f
        L_0x0185:
            r1 = 0
        L_0x0186:
            k.i r2 = p011e.C0101z0.f1120u
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x019c
            k.i r2 = p011e.C0101z0.f1120u
            java.lang.Object r2 = r2.elementAt(r1)
            e.z0 r2 = (p011e.C0101z0) r2
            r2.mo199c(r8)
            int r1 = r1 + 1
            goto L_0x0186
        L_0x019c:
            r1 = 0
        L_0x019d:
            k.i r2 = f1924W1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x01b7
            k.i r2 = f1924W1
            java.lang.Object r2 = r2.elementAt(r1)
            e.b0 r2 = (p011e.C0050b0) r2
            int r3 = r2.f1431H
            if (r3 <= 0) goto L_0x01b4
            r2.mo452t0(r8)
        L_0x01b4:
            int r1 = r1 + 1
            goto L_0x019d
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            k.i r2 = f1924W1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x01ce
            k.i r2 = f1924W1
            java.lang.Object r2 = r2.elementAt(r1)
            e.b0 r2 = (p011e.C0050b0) r2
            r2.mo136g0(r8)
            int r1 = r1 + 1
            goto L_0x01b8
        L_0x01ce:
            int r1 = p018i.C0145a.f2595L0
            r8.mo773E(r9, r1)
            java.lang.String r1 = "PA7"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA8"
            p018i.C0145a.m1363r(r1, r10)
            r1 = 0
        L_0x01de:
            k.i r2 = f1908S1
            int r2 = r2.size()
            r16 = 0
            if (r1 >= r2) goto L_0x020d
            k.i r2 = f1908S1     // Catch:{ Exception -> 0x01f1 }
            java.lang.Object r2 = r2.elementAt(r1)     // Catch:{ Exception -> 0x01f1 }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x01f1 }
            goto L_0x01f3
        L_0x01f1:
            r2 = r16
        L_0x01f3:
            if (r2 != 0) goto L_0x01f6
            goto L_0x020a
        L_0x01f6:
            g.y r3 = p018i.C0145a.f2629e0
            boolean r4 = r3.f2467a
            if (r4 == 0) goto L_0x0203
            boolean r3 = r3.mo662m0()
            if (r3 == 0) goto L_0x0203
            goto L_0x020a
        L_0x0203:
            boolean r3 = r2.f1534b1
            if (r3 == 0) goto L_0x020a
            r2.mo452t0(r8)
        L_0x020a:
            int r1 = r1 + 1
            goto L_0x01de
        L_0x020d:
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo452t0(r8)
            p001b.C0007c.m47e(r28)
            r1 = 0
        L_0x0218:
            k.i r2 = f1920V1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x022e
            k.i r2 = f1920V1
            java.lang.Object r2 = r2.elementAt(r1)
            g.v r2 = (p013g.C0137v) r2
            r2.mo339x(r8)
            int r1 = r1 + 1
            goto L_0x0218
        L_0x022e:
            r1 = 0
        L_0x022f:
            k.i r2 = p011e.C0101z0.f1120u
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0245
            k.i r2 = p011e.C0101z0.f1120u
            java.lang.Object r2 = r2.elementAt(r1)
            e.z0 r2 = (p011e.C0101z0) r2
            r2.mo198b(r8)
            int r1 = r1 + 1
            goto L_0x022f
        L_0x0245:
            r1 = 0
        L_0x0246:
            k.i r2 = f1908S1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x026f
            k.i r2 = f1908S1     // Catch:{ Exception -> 0x0257 }
            java.lang.Object r2 = r2.elementAt(r1)     // Catch:{ Exception -> 0x0257 }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x0257 }
            goto L_0x0259
        L_0x0257:
            r2 = r16
        L_0x0259:
            if (r2 != 0) goto L_0x025c
            goto L_0x026c
        L_0x025c:
            g.y r3 = p018i.C0145a.f2629e0
            boolean r4 = r3.f2467a
            if (r4 == 0) goto L_0x0269
            boolean r3 = r3.mo662m0()
            if (r3 == 0) goto L_0x0269
            goto L_0x026c
        L_0x0269:
            r2.mo136g0(r8)
        L_0x026c:
            int r1 = r1 + 1
            goto L_0x0246
        L_0x026f:
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo136g0(r8)
            g.e r1 = p013g.C0114e.m647e0()
            e.q0 r1 = r1.f1479Q2
            if (r1 == 0) goto L_0x02a7
            g.e r1 = p013g.C0114e.m647e0()
            e.o0[] r1 = r1.mo418Z0()
            if (r1 == 0) goto L_0x02a7
            g.e r1 = p013g.C0114e.m647e0()
            int r1 = r1.f1399A2
            g.e r2 = p013g.C0114e.m647e0()
            e.o0[] r2 = r2.mo418Z0()
            int r2 = r2.length
            if (r1 >= r2) goto L_0x02a7
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo434k0(r8)
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo449r0(r8)
        L_0x02a7:
            r1 = 0
        L_0x02a8:
            k.i r2 = f1908S1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x02e7
            k.i r2 = f1908S1     // Catch:{ Exception -> 0x02b9 }
            java.lang.Object r2 = r2.elementAt(r1)     // Catch:{ Exception -> 0x02b9 }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x02b9 }
            goto L_0x02bb
        L_0x02b9:
            r2 = r16
        L_0x02bb:
            if (r2 != 0) goto L_0x02be
            goto L_0x02e4
        L_0x02be:
            g.y r3 = p018i.C0145a.f2629e0
            boolean r4 = r3.f2467a
            if (r4 == 0) goto L_0x02cb
            boolean r3 = r3.mo662m0()
            if (r3 == 0) goto L_0x02cb
            goto L_0x02e4
        L_0x02cb:
            e.q0 r3 = r2.f1479Q2
            if (r3 == 0) goto L_0x02e4
            e.o0[] r3 = r2.mo418Z0()
            if (r3 == 0) goto L_0x02e4
            int r3 = r2.f1399A2
            e.o0[] r4 = r2.mo418Z0()
            int r4 = r4.length
            if (r3 >= r4) goto L_0x02e4
            r2.mo434k0(r8)
            r2.mo449r0(r8)
        L_0x02e4:
            int r1 = r1 + 1
            goto L_0x02a8
        L_0x02e7:
            r1 = 0
        L_0x02e8:
            k.i r2 = f1912T1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x02fe
            k.i r2 = f1912T1
            java.lang.Object r2 = r2.elementAt(r1)
            e.o r2 = (p011e.C0078o) r2
            r2.mo180h(r8)
            int r1 = r1 + 1
            goto L_0x02e8
        L_0x02fe:
            int r1 = p018i.C0145a.f2595L0
            int r1 = -r1
            r8.mo773E(r9, r1)
            java.lang.String r1 = "PA9"
            p018i.C0145a.m1363r(r1, r10)
            m886Y0(r28)
            java.lang.String r1 = "PA10"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA11"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA13"
            p018i.C0145a.m1363r(r1, r10)
            r27.mo507R0(r28)
            r0.mo499N0(r8, r14)
            r1 = 0
        L_0x0322:
            k.i r2 = f1924W1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0338
            k.i r2 = f1924W1
            java.lang.Object r2 = r2.elementAt(r1)
            e.b0 r2 = (p011e.C0050b0) r2
            r2.mo132B1(r8)
            int r1 = r1 + 1
            goto L_0x0322
        L_0x0338:
            p001b.C0007c.m48f(r28)
            r1 = 0
        L_0x033c:
            k.i r2 = f1924W1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0367
            k.i r2 = f1924W1
            java.lang.Object r2 = r2.elementAt(r1)
            e.b0 r2 = (p011e.C0050b0) r2
            if (r2 != 0) goto L_0x034f
            goto L_0x0362
        L_0x034f:
            e.m r3 = r2.f1583l
            if (r3 == 0) goto L_0x0362
            int r4 = r2.f1593n
            int r5 = r2.f1598o
            int r11 = r2.f1539c0
            int r5 = r5 - r11
            int r11 = p018i.C0145a.f2595L0
            int r5 = r5 - r11
            int r2 = r2.f1633v
            r3.mo165d(r8, r4, r5, r2)
        L_0x0362:
            int r1 = r1 + 1
            r11 = 30
            goto L_0x033c
        L_0x0367:
            r1 = 0
        L_0x0368:
            k.i r2 = f1908S1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0391
            k.i r2 = f1908S1     // Catch:{ Exception -> 0x0379 }
            java.lang.Object r2 = r2.elementAt(r1)     // Catch:{ Exception -> 0x0379 }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x0379 }
            goto L_0x037b
        L_0x0379:
            r2 = r16
        L_0x037b:
            if (r2 != 0) goto L_0x037e
            goto L_0x038e
        L_0x037e:
            e.m r3 = r2.f1583l
            if (r3 == 0) goto L_0x038e
            int r4 = r2.f1593n
            int r5 = r2.f1598o
            int r11 = r2.f1539c0
            int r5 = r5 - r11
            int r2 = r2.f1633v
            r3.mo165d(r8, r4, r5, r2)
        L_0x038e:
            int r1 = r1 + 1
            goto L_0x0368
        L_0x0391:
            g.e r1 = p013g.C0114e.m647e0()
            e.m r1 = r1.f1583l
            if (r1 == 0) goto L_0x03bb
            g.e r1 = p013g.C0114e.m647e0()
            e.m r1 = r1.f1583l
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1598o
            g.e r4 = p013g.C0114e.m647e0()
            int r4 = r4.f1539c0
            int r3 = r3 - r4
            g.e r4 = p013g.C0114e.m647e0()
            int r4 = r4.f1633v
            r1.mo165d(r8, r2, r3, r4)
        L_0x03bb:
            p001b.C0005a.m18o(r28)
            r1 = 0
        L_0x03bf:
            k.i r2 = p013g.C0121h0.f1768G
            int r2 = r2.size()
            r11 = -1
            if (r1 >= r2) goto L_0x03de
            k.i r2 = p013g.C0121h0.f1768G
            java.lang.Object r2 = r2.elementAt(r1)
            k.a r2 = (p020k.C0165a) r2
            short r3 = r2.f2777c
            if (r3 == r11) goto L_0x03db
            byte r3 = r2.f2782h
            if (r3 <= r14) goto L_0x03db
            r2.mo819f(r8)
        L_0x03db:
            int r1 = r1 + 1
            goto L_0x03bf
        L_0x03de:
            p011e.C0067i0.m242e(r28)
            int r1 = p013g.C0121h0.f1803v
            r2 = 120(0x78, float:1.68E-43)
            r5 = 10
            r4 = 5
            r3 = 100
            if (r1 != r2) goto L_0x04b6
            byte r1 = r0.f2107Z0
            if (r1 == r3) goto L_0x044a
            h.a.a.b r2 = f1890N3
            int r2 = p019j.C0159f.m1451u(r2)
            int r1 = r1 * r2
            int r1 = r1 / r3
            h.a.a.b r2 = f1890N3
            int r17 = p013g.C0121h0.f1784c
            int r17 = r17 / 2
            h.a.a.b r18 = f1890N3
            int r18 = p019j.C0159f.m1451u(r18)
            int r18 = r18 / 2
            int r11 = r17 - r18
            r12 = 220(0xdc, float:3.08E-43)
            r8.mo776e(r2, r11, r12, r9)
            int r2 = p013g.C0121h0.f1784c
            int r2 = r2 / r6
            h.a.a.b r11 = f1890N3
            int r11 = p019j.C0159f.m1451u(r11)
            int r11 = r11 / r6
            int r2 = r2 - r11
            r8.mo771C(r2, r12, r1, r5)
            r28.mo770B()
            int r2 = p013g.C0121h0.f1784c
            int r2 = r2 / r6
            h.a.a.b r11 = f1890N3
            int r11 = p019j.C0159f.m1451u(r11)
            int r11 = r11 / r6
            int r2 = r2 - r11
            r8.mo774a(r2, r12, r1, r5)
            h.a.a.b r1 = f1878K3
            int r2 = p013g.C0121h0.f1784c
            int r2 = r2 / r6
            h.a.a.b r11 = f1890N3
            int r11 = p019j.C0159f.m1451u(r11)
            int r11 = r11 / r6
            int r2 = r2 - r11
            r8.mo776e(r1, r2, r12, r9)
            p019j.C0159f.m1454z(r28)
            r28.mo769A()
            int r1 = p018i.C0145a.f2614V
            int r2 = p018i.C0145a.f2616W
            r8.mo771C(r9, r9, r1, r2)
        L_0x044a:
            boolean r1 = r0.f2109a1
            if (r1 == 0) goto L_0x04b6
            int r1 = r0.f2111b1
            int r1 = r1 + r10
            r0.f2111b1 = r1
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r14
            if (r1 != 0) goto L_0x0477
            b.e r1 = new b.e
            r20 = 19
            int r2 = p013g.C0121h0.f1784c
            int r11 = r2 / 2
            int r11 = r11 - r7
            int r2 = r2 / r6
            int r2 = r2 + r7
            int r21 = p013g.C0111c0.m587n(r11, r2)
            r22 = 340(0x154, float:4.76E-43)
            r23 = 2
            r24 = 1
            r25 = -1
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            p001b.C0007c.m43a(r1)
        L_0x0477:
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 15
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 != 0) goto L_0x04a2
            b.e r1 = new b.e
            r20 = 18
            int r11 = p013g.C0121h0.f1784c
            int r12 = r11 / 2
            int r12 = r12 - r4
            int r11 = r11 / r6
            int r11 = r11 + r4
            int r21 = p013g.C0111c0.m587n(r12, r11)
            r11 = 320(0x140, float:4.48E-43)
            int r22 = p013g.C0111c0.m587n(r2, r11)
            r23 = 2
            r24 = 1
            r25 = -1
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            p001b.C0007c.m43a(r1)
        L_0x04a2:
            int r1 = r0.f2111b1
            if (r1 != r3) goto L_0x04ac
            int r1 = p013g.C0121h0.f1784c
            int r1 = r1 / r6
            r0.mo536o(r1, r2)
        L_0x04ac:
            int r1 = r0.f2111b1
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L_0x04b6
            r0.f2111b1 = r9
            r0.f2109a1 = r9
        L_0x04b6:
            p001b.C0005a.m17m(r28)
            r1 = 0
        L_0x04ba:
            k.i r2 = p001b.C0005a.f67z
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x04d3
            k.i r2 = p001b.C0005a.f67z
            java.lang.Object r2 = r2.elementAt(r1)
            b.a r2 = (p001b.C0005a) r2
            int r2 = r2.f84q
            if (r2 != 0) goto L_0x04d0
            r1 = 0
            goto L_0x04d4
        L_0x04d0:
            int r1 = r1 + 1
            goto L_0x04ba
        L_0x04d3:
            r1 = 1
        L_0x04d4:
            int r2 = p019j.C0159f.f2750b
            if (r2 > r10) goto L_0x04d9
            r1 = 0
        L_0x04d9:
            r11 = -20
            if (r1 == 0) goto L_0x053f
            boolean r1 = r0.f2106Z
            if (r1 != 0) goto L_0x053f
            int r1 = p013g.C0121h0.f1784c
            h.a.a.b r2 = p013g.C0121h0.f1774M
            int r2 = p019j.C0159f.m1451u(r2)
            int r2 = r2 + r7
            int r1 = r1 / r2
            if (r1 > 0) goto L_0x04ee
            r1 = 1
        L_0x04ee:
            int r2 = p013g.C0121h0.f1786e
            r12 = 28
            if (r2 == r12) goto L_0x053f
            r2 = 0
        L_0x04f5:
            if (r2 >= r1) goto L_0x053f
            h.a.a.b r12 = p013g.C0121h0.f1774M
            int r12 = p019j.C0159f.m1451u(r12)
            int r12 = r12 + r7
            int r12 = r12 * r2
            int r12 = r12 + r3
            int r18 = f2028t1
            int r18 = r18 / 2
            int r12 = r12 - r18
            h.a.a.b r18 = p013g.C0121h0.f1774M
            int r18 = p019j.C0159f.m1451u(r18)
            int r4 = r12 + r18
            int r5 = f2028t1
            if (r4 < r5) goto L_0x0539
            int r4 = p018i.C0145a.f2614V
            int r5 = r5 + r4
            if (r12 > r5) goto L_0x0539
            h.a.a.b r4 = p013g.C0121h0.f1774M
            int r4 = p019j.C0159f.m1450t(r4)
            int r4 = r4 + r11
            int r5 = f2032u1
            if (r4 < r5) goto L_0x0539
            int r4 = p018i.C0145a.f2616W
            int r5 = r5 + r4
            if (r11 > r5) goto L_0x0539
            h.a.a.b r4 = p013g.C0121h0.f1774M
            int r5 = p019j.C0159f.m1451u(r4)
            int r5 = r5 + r7
            int r5 = r5 * r2
            int r5 = r5 + r3
            int r12 = f2028t1
            int r12 = r12 / r6
            int r5 = r5 - r12
            r8.mo776e(r4, r5, r11, r9)
        L_0x0539:
            int r2 = r2 + 1
            r4 = 5
            r5 = 10
            goto L_0x04f5
        L_0x053f:
            p019j.C0161h.m1499q(r28)
            java.lang.String r1 = "PA14"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA15"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA16"
            p018i.C0145a.m1363r(r1, r10)
            r27.m877M0(r28)
            java.lang.String r1 = "PA17"
            p018i.C0145a.m1363r(r1, r10)
            boolean r1 = f1960f1
            if (r1 != 0) goto L_0x056a
            int r1 = f1993l4
            if (r1 != r10) goto L_0x056a
            g.y r1 = p018i.C0145a.f2629e0
            boolean r1 = r1.f2467a
            if (r1 != 0) goto L_0x056a
            r27.m882V0(r28)
        L_0x056a:
            m901l1(r28)
            boolean r1 = f1960f1
            if (r1 != 0) goto L_0x0941
            boolean r1 = p018i.C0145a.f2640j1
            if (r1 == 0) goto L_0x05d3
            int r1 = p018i.C0145a.f2614V
            r2 = 250(0xfa, float:3.5E-43)
            if (r1 <= r2) goto L_0x05a9
            h.a.a.b r1 = p018i.C0145a.f2617W0
            r2 = 160(0xa0, float:2.24E-43)
            r4 = 6
            r8.mo776e(r1, r2, r4, r9)
            k.m r1 = p020k.C0177m.f2929F
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 2
            r12 = 0
            java.lang.String r20 = "Dành cho người chơi trên 12 tuổi."
            r2 = r28
            r11 = 100
            r3 = r20
            r11 = 5
            r18 = 2
            r6 = r12
            r1.mo909a(r2, r3, r4, r5, r6)
            k.m r1 = p020k.C0177m.f2929F
            r5 = 12
            r6 = 0
            java.lang.String r3 = "Chơi quá 180 phút mỗi ngày "
            r1.mo909a(r2, r3, r4, r5, r6)
            k.m r1 = p020k.C0177m.f2929F
            r5 = 22
            java.lang.String r3 = "sẽ hại sức khỏe."
            goto L_0x05cf
        L_0x05a9:
            r11 = 5
            r18 = 2
            h.a.a.b r1 = p018i.C0145a.f2617W0
            int r2 = p018i.C0145a.f2616W
            int r2 = r2 + -67
            r8.mo776e(r1, r11, r2, r9)
            k.m r1 = p020k.C0177m.f2929F
            r4 = 25
            int r2 = p018i.C0145a.f2616W
            int r5 = r2 + -70
            r6 = 0
            java.lang.String r3 = "Dành cho người chơi trên 12 tuổi."
            r2 = r28
            r1.mo909a(r2, r3, r4, r5, r6)
            k.m r1 = p020k.C0177m.f2929F
            int r2 = p018i.C0145a.f2616W
            int r5 = r2 + -60
            java.lang.String r3 = "Chơi quá 180 phút mỗi ngày sẽ hại sức khỏe."
            r2 = r28
        L_0x05cf:
            r1.mo909a(r2, r3, r4, r5, r6)
            goto L_0x05d6
        L_0x05d3:
            r11 = 5
            r18 = 2
        L_0x05d6:
            java.lang.String r1 = "PA21"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA18"
            p018i.C0145a.m1363r(r1, r10)
            int r1 = r28.mo791x()
            int r1 = -r1
            int r2 = r28.mo792y()
            int r2 = -r2
            r8.mo773E(r1, r2)
            int r1 = p013g.C0121h0.f1803v
            r12 = 90
            if (r1 == r15) goto L_0x05f7
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L_0x063d
        L_0x05f7:
            byte r1 = f2014p5
            if (r1 == 0) goto L_0x063d
            r8.mo772D(r9)
            r1 = 88
            r2 = 54
            r3 = 8
            r8.mo783l(r14, r1, r2, r3)
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r8.mo772D(r1)
            byte r1 = f2014p5
            r8.mo771C(r11, r12, r1, r13)
            r28.mo770B()
            byte r1 = f2014p5
            r8.mo774a(r11, r12, r1, r13)
            r8.mo783l(r11, r12, r7, r13)
            r28.mo769A()
            r1 = 3000(0xbb8, float:4.204E-42)
            r8.mo771C(r9, r9, r1, r1)
            r28.mo770B()
            r8.mo774a(r9, r9, r1, r1)
            k.m r1 = p020k.C0177m.f2948p
            r5 = 98
            r6 = 2
            k.m r7 = p020k.C0177m.f2951s
            r4 = 30
            java.lang.String r3 = "Mabu"
            r2 = r28
            r1.mo910b(r2, r3, r4, r5, r6, r7)
            r28.mo769A()
        L_0x063d:
            g.e r1 = p013g.C0114e.m647e0()
            boolean r1 = r1.f1475P3
            if (r1 == 0) goto L_0x0671
            g.e r1 = p013g.C0114e.m647e0()
            int r2 = r1.f1480Q3
            int r2 = r2 + r10
            r1.f1480Q3 = r2
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r14
            if (r1 != 0) goto L_0x0660
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r8.mo772D(r1)
            int r1 = p018i.C0145a.f2614V
            int r2 = p018i.C0145a.f2616W
            r8.mo783l(r9, r9, r1, r2)
        L_0x0660:
            g.e r1 = p013g.C0114e.m647e0()
            int r1 = r1.f1480Q3
            r2 = 100
            if (r1 < r2) goto L_0x0671
            g.e r1 = p013g.C0114e.m647e0()
            r1.mo377E()
        L_0x0671:
            r1 = 0
        L_0x0672:
            k.i r2 = f1908S1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x06b5
            k.i r2 = f1908S1     // Catch:{ Exception -> 0x0683 }
            java.lang.Object r2 = r2.elementAt(r1)     // Catch:{ Exception -> 0x0683 }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x0683 }
            goto L_0x0685
        L_0x0683:
            r2 = r16
        L_0x0685:
            if (r2 != 0) goto L_0x0688
            goto L_0x06b2
        L_0x0688:
            boolean r3 = r2.f1475P3
            if (r3 == 0) goto L_0x06b2
            boolean r3 = p013g.C0114e.m645P(r2)
            if (r3 == 0) goto L_0x06b2
            int r3 = r2.f1480Q3
            int r3 = r3 + r10
            r2.f1480Q3 = r3
            int r3 = p018i.C0145a.f2600O
            int r3 = r3 % r14
            if (r3 != 0) goto L_0x06a9
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r8.mo772D(r3)
            int r3 = p018i.C0145a.f2614V
            int r4 = p018i.C0145a.f2616W
            r8.mo783l(r9, r9, r3, r4)
        L_0x06a9:
            int r3 = r2.f1480Q3
            r4 = 100
            if (r3 < r4) goto L_0x06b2
            r2.mo377E()
        L_0x06b2:
            int r1 = r1 + 1
            goto L_0x0672
        L_0x06b5:
            e.e0 r1 = p018i.C0145a.f2642l0
            r1.mo145e(r8)
            java.lang.String r1 = "PA19"
            p018i.C0145a.m1363r(r1, r10)
            java.lang.String r1 = "PA20"
            p018i.C0145a.m1363r(r1, r10)
            m901l1(r28)
            r27.m884X0(r28)
            java.lang.String r1 = "PA22"
            p018i.C0145a.m1363r(r1, r10)
            m901l1(r28)
            boolean r1 = p018i.C0145a.f2659x
            if (r1 == 0) goto L_0x06dd
            boolean r1 = p018i.C0145a.f2661y
            if (r1 == 0) goto L_0x06dd
            r27.m888Z0(r28)
        L_0x06dd:
            m901l1(r28)
            r27.mo505Q0(r28)
            g.y r1 = p018i.C0145a.f2629e0
            boolean r1 = r1.f2467a
            if (r1 != 0) goto L_0x0702
            g.i r1 = p018i.C0145a.f2637i0
            if (r1 != 0) goto L_0x0702
            b.b r1 = p001b.C0006b.f95C
            if (r1 != 0) goto L_0x0702
            b.b r1 = p001b.C0006b.f96D
            if (r1 != 0) goto L_0x0702
            k.n r1 = p018i.C0145a.f2625c0
            g.k r2 = f1970h1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0702
            super.mo341d(r28)
        L_0x0702:
            m901l1(r28)
            java.util.Vector r1 = p013g.C0114e.f1377h4
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0716
            k.i r1 = f2035u4
            int r1 = r1.size()
            int r1 = r1 * 12
            goto L_0x0717
        L_0x0716:
            r1 = 0
        L_0x0717:
            r2 = 100
            int r15 = r1 + 100
            g.e r1 = p013g.C0114e.m647e0()
            a.a r1 = r1.f1521Z
            if (r1 == 0) goto L_0x0802
            int r1 = p018i.C0145a.f2616W
            int r1 = r1 - r2
            int r1 = r1 + -60
            int r7 = r1 / 12
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x072d:
            k.i r1 = f1908S1
            int r1 = r1.size()
            if (r6 >= r1) goto L_0x0802
            k.i r1 = f1908S1
            java.lang.Object r1 = r1.elementAt(r6)
            r3 = r1
            g.e r3 = (p013g.C0114e) r3
            int r1 = r3.f1516Y
            r2 = -1
            if (r1 == r2) goto L_0x07ee
            g.e r2 = p013g.C0114e.m647e0()
            a.a r2 = r2.f1521Z
            int r2 = r2.f0a
            if (r1 != r2) goto L_0x07ee
            boolean r1 = r3.mo411W()
            if (r1 == 0) goto L_0x07aa
            int r1 = r3.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            if (r1 >= r2) goto L_0x07aa
            java.util.Vector r1 = p013g.C0114e.f1377h4
            int r1 = r1.size()
            if (r1 == 0) goto L_0x076e
            k.i r1 = f2035u4
            int r1 = r1.size()
            int r1 = r7 - r1
            goto L_0x076f
        L_0x076e:
            r1 = r7
        L_0x076f:
            if (r4 <= r1) goto L_0x0773
            goto L_0x07ee
        L_0x0773:
            k.m r1 = p020k.C0177m.f2928E
            java.lang.String r2 = r3.f1511X
            r16 = 20
            int r19 = r15 + -12
            int r20 = r4 * 12
            int r19 = r19 + r20
            r22 = 0
            k.m r23 = p020k.C0177m.f2925B
            r24 = r2
            r2 = r28
            r12 = r3
            r3 = r24
            r24 = r4
            r4 = r16
            r14 = r5
            r5 = r19
            r19 = r6
            r6 = r22
            r9 = r7
            r7 = r23
            r1.mo910b(r2, r3, r4, r5, r6, r7)
            int r20 = r15 + r20
            int r1 = r20 + -5
            r7 = 10
            r12.mo445p0(r8, r7, r1)
            int r4 = r24 + 1
            r5 = r14
            r26 = 10
            goto L_0x07f9
        L_0x07aa:
            r12 = r3
            r24 = r4
            r14 = r5
            r19 = r6
            r9 = r7
            r7 = 10
            boolean r1 = r12.mo411W()
            if (r1 == 0) goto L_0x07f4
            int r1 = r12.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            if (r1 <= r2) goto L_0x07f4
            if (r14 <= r9) goto L_0x07c6
            goto L_0x07f4
        L_0x07c6:
            k.m r1 = p020k.C0177m.f2928E
            java.lang.String r3 = r12.f1511X
            int r2 = p018i.C0145a.f2614V
            int r4 = r2 + -25
            int r2 = r15 + -12
            int r20 = r14 * 12
            int r5 = r2 + r20
            r6 = 1
            k.m r23 = p020k.C0177m.f2925B
            r2 = r28
            r26 = 10
            r7 = r23
            r1.mo910b(r2, r3, r4, r5, r6, r7)
            int r1 = p018i.C0145a.f2614V
            int r1 = r1 + -15
            int r20 = r15 + r20
            int r2 = r20 + -5
            r12.mo445p0(r8, r1, r2)
            int r5 = r14 + 1
            goto L_0x07f7
        L_0x07ee:
            r24 = r4
            r14 = r5
            r19 = r6
            r9 = r7
        L_0x07f4:
            r26 = 10
            r5 = r14
        L_0x07f7:
            r4 = r24
        L_0x07f9:
            int r6 = r19 + 1
            r7 = r9
            r9 = 0
            r12 = 90
            r14 = 3
            goto L_0x072d
        L_0x0802:
            k.c r1 = p020k.C0167c.m1522b()
            r1.mo823f(r8)
            boolean r1 = f1938Z3
            if (r1 == 0) goto L_0x082a
            g.y r1 = p018i.C0145a.f2629e0
            boolean r1 = r1.f2467a
            if (r1 != 0) goto L_0x082a
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r13
            if (r1 != 0) goto L_0x082a
            h.a.a.b r1 = p011e.C0078o.f962w
            e.d r2 = r0.f2062D
            int r3 = r2.f407h
            int r3 = r3 + 15
            int r2 = r2.f408i
            r4 = 30
            int r2 = r2 + r4
            r4 = 33
            r8.mo776e(r1, r3, r2, r4)
        L_0x082a:
            boolean r1 = r0.f2110b0
            if (r1 == 0) goto L_0x089a
            int r1 = r0.f2118f0
            int r1 = r1 + r11
            r0.f2118f0 = r1
            int r2 = r0.f2112c0
            if (r2 < 0) goto L_0x083a
            int r2 = r2 + r1
            r0.f2112c0 = r2
        L_0x083a:
            int r1 = r0.f2112c0
            if (r1 >= 0) goto L_0x084d
            int r1 = r1 - r10
            r0.f2112c0 = r1
            r2 = -20
            if (r1 != r2) goto L_0x089a
            r1 = 0
            r0.f2110b0 = r1
            r0.f2112c0 = r1
            r0.f2118f0 = r1
            goto L_0x089a
        L_0x084d:
            int r2 = r0.f2114d0
            int r2 = r2 - r1
            if (r2 > 0) goto L_0x085a
            int r2 = p013g.C0121h0.f1784c
            if (r1 >= r2) goto L_0x0857
            goto L_0x085a
        L_0x0857:
            r1 = -1
            r9 = 0
            goto L_0x0897
        L_0x085a:
            if (r1 <= 0) goto L_0x0895
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r8.mo772D(r1)
            boolean r1 = p018i.C0145a.m1339K()
            if (r1 != 0) goto L_0x088c
            int r1 = p019j.C0161h.f2758f
            r2 = 3
            if (r1 == r2) goto L_0x088c
            if (r1 == r11) goto L_0x088c
            int r1 = r0.f2114d0
            int r2 = r0.f2112c0
            int r3 = r1 - r2
            int r1 = r0.f2116e0
            int r4 = r1 - r2
            int r5 = r2 * 2
            int r6 = r2 * 2
            r7 = 0
            r9 = 360(0x168, float:5.04E-43)
            r1 = r28
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r1.mo782k(r2, r3, r4, r5, r6, r7)
            goto L_0x089a
        L_0x088c:
            int r1 = p018i.C0145a.f2614V
            int r2 = p018i.C0145a.f2616W
            r9 = 0
            r8.mo783l(r9, r9, r1, r2)
            goto L_0x089b
        L_0x0895:
            r9 = 0
            r1 = -1
        L_0x0897:
            r0.f2112c0 = r1
            goto L_0x089b
        L_0x089a:
            r9 = 0
        L_0x089b:
            r1 = 0
        L_0x089c:
            java.util.Vector r2 = p013g.C0114e.f1377h4
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x08bd
            java.util.Vector r2 = p013g.C0114e.f1377h4
            java.lang.Object r2 = r2.elementAt(r1)
            e.u r2 = (p011e.C0090u) r2
            e.d r3 = r0.f2062D
            int r3 = r3.f407h
            int r3 = r3 + 32
            int r4 = r1 * 24
            int r3 = r3 + r4
            r4 = 55
            r2.mo195g(r8, r3, r4)
            int r1 = r1 + 1
            goto L_0x089c
        L_0x08bd:
            r1 = 0
        L_0x08be:
            k.i r2 = f2035u4
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x08f5
            k.i r2 = f2035u4
            java.lang.Object r2 = r2.elementAt(r1)
            e.u r2 = (p011e.C0090u) r2
            e.d r3 = r0.f2062D
            int r3 = r3.f407h
            java.util.Vector r4 = p013g.C0114e.f1377h4
            int r4 = r4.size()
            if (r4 == 0) goto L_0x08dc
            r4 = 5
            goto L_0x08de
        L_0x08dc:
            r4 = 25
        L_0x08de:
            int r3 = r3 + r4
            java.util.Vector r4 = p013g.C0114e.f1377h4
            int r4 = r4.size()
            if (r4 == 0) goto L_0x08ea
            r4 = 90
            goto L_0x08ec
        L_0x08ea:
            r4 = 45
        L_0x08ec:
            int r5 = r1 * 12
            int r4 = r4 + r5
            r2.mo196h(r8, r3, r4)
            int r1 = r1 + 1
            goto L_0x08be
        L_0x08f5:
            r27.m890a1(r28)
            byte r1 = p011e.C0057d1.f680l5
            if (r1 != r10) goto L_0x091d
            long r1 = p019j.C0161h.m1490h()
            long r3 = f1934Y3
            long r1 = r1 + r3
            k.m r3 = p020k.C0177m.f2948p
            java.lang.String r4 = p012f.C0104c.m357b(r1)
            r5 = 10
            int r1 = p018i.C0145a.f2616W
            int r6 = r1 + -65
            r7 = 0
            k.m r10 = p020k.C0177m.f2951s
            r1 = r3
            r2 = r28
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo910b(r2, r3, r4, r5, r6, r7)
        L_0x091d:
            java.lang.String r1 = r0.f2113c1
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0941
        L_0x0927:
            java.lang.String[] r1 = r0.f2115d1
            int r2 = r1.length
            if (r9 >= r2) goto L_0x0941
            k.m r2 = p020k.C0177m.f2948p
            r3 = r1[r9]
            r4 = 5
            int r1 = r9 * 18
            int r5 = r1 + 85
            r6 = 0
            k.m r7 = p020k.C0177m.f2951s
            r1 = r2
            r2 = r28
            r1.mo910b(r2, r3, r4, r5, r6, r7)
            int r9 = r9 + 1
            goto L_0x0927
        L_0x0941:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.mo341d(j.f):void");
    }

    /* renamed from: d0 */
    public void mo517d0(int i, byte b) {
        if (f1928X1.size() == 0) {
            C0105d.m365M().mo243R((byte) 2, b);
            C0111c0.m584k("getFlag1");
            return;
        }
        int i2 = 0;
        if (i == C0114e.m647e0().f1638w) {
            C0111c0.m584k("my cflag: isme");
            if (C0114e.m647e0().mo399Q(b)) {
                C0111c0.m584k("my cflag: true");
                while (i2 < f1928X1.size()) {
                    C0056d0 d0Var = (C0056d0) f1928X1.elementAt(i2);
                    if (d0Var != null && d0Var.f417a == b) {
                        C0111c0.m584k("my cflag: cflag==");
                        C0114e.m647e0().f1448K1 = d0Var.f418b;
                    }
                    i2++;
                }
                return;
            } else if (C0114e.m647e0().mo399Q(b)) {
                return;
            }
        } else {
            C0111c0.m584k("my cflag: not me");
            if (m881V(i) == null) {
                return;
            }
            if (m881V(i).mo399Q(b)) {
                C0111c0.m584k("my cflag: true");
                while (i2 < f1928X1.size()) {
                    C0056d0 d0Var2 = (C0056d0) f1928X1.elementAt(i2);
                    if (d0Var2 != null && d0Var2.f417a == b) {
                        C0111c0.m584k("my cflag: cflag==");
                        m881V(i).f1448K1 = d0Var2.f418b;
                    }
                    i2++;
                }
                return;
            } else if (m881V(i).mo399Q(b)) {
                return;
            }
        }
        C0111c0.m584k("my cflag: false");
        C0105d.m365M().mo243R((byte) 2, b);
    }

    /* renamed from: d1 */
    public void mo518d1(int i, int i2, String str, byte b) {
        C0114e V = m881V(i);
        if (V != null) {
            if (b == 3) {
                mo561z1(str, new C0055d(C0057d1.f669k1, 2000, V), new C0055d(C0057d1.f606b1, 2009, V));
            }
            if (b == 4) {
                mo561z1(str, new C0055d(C0057d1.f669k1, 2005, V), new C0055d(C0057d1.f606b1, 2009, V));
            }
        }
    }

    /* renamed from: e1 */
    public void mo519e1() {
        DataInputStream dataInputStream;
        Exception e;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_arrow")));
            try {
                int readShort = dataInputStream.readShort();
                f1876K1 = new C0052c[readShort];
                for (int i = 0; i < readShort; i++) {
                    f1876K1[i] = new C0052c();
                    f1876K1[i].f379a = dataInputStream.readShort();
                    f1876K1[i].f380b[0] = dataInputStream.readShort();
                    f1876K1[i].f380b[1] = dataInputStream.readShort();
                    f1876K1[i].f380b[2] = dataInputStream.readShort();
                }
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    dataInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            dataInputStream = null;
            e = exc;
            e.printStackTrace();
            dataInputStream.close();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            dataInputStream = null;
            th = th3;
            dataInputStream.close();
            throw th;
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0113d0.f1360r = false;
        if (C0005a.m12e()) {
            C0175k.m1563p().mo862M();
        }
        C0170f.f2805J = false;
        C0114e.f1394y4 = false;
        if (!f1960f1) {
            C0105d.m365M().mo226I();
        }
        if (C0121h0.m827g()) {
            mo531m0();
        }
        f1862G3.f2188o = true;
        f1866H3.f2188o = true;
        f1965g1 = true;
        f1960f1 = false;
        this.f2060C = 0;
        super.mo342f();
    }

    /* renamed from: f1 */
    public void mo520f1() {
        DataInputStream dataInputStream;
        Exception e;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_dart")));
            try {
                int readShort = dataInputStream.readShort();
                f1880L1 = new C0058e[readShort];
                for (int i = 0; i < readShort; i++) {
                    C0058e[] eVarArr = f1880L1;
                    eVarArr[i] = new C0058e();
                    eVarArr[i].f779a = dataInputStream.readShort();
                    f1880L1[i].f787i = dataInputStream.readShort();
                    f1880L1[i].f788j = dataInputStream.readShort() * 256;
                    f1880L1[i].f786h = dataInputStream.readShort();
                    int readShort2 = dataInputStream.readShort();
                    f1880L1[i].f782d = new short[readShort2];
                    for (int i2 = 0; i2 < readShort2; i2++) {
                        f1880L1[i].f782d[i2] = dataInputStream.readShort();
                    }
                    int readShort3 = dataInputStream.readShort();
                    f1880L1[i].f783e = new short[readShort3];
                    for (int i3 = 0; i3 < readShort3; i3++) {
                        f1880L1[i].f783e[i3] = dataInputStream.readShort();
                    }
                    int readShort4 = dataInputStream.readShort();
                    f1880L1[i].f784f = new short[readShort4];
                    for (int i4 = 0; i4 < readShort4; i4++) {
                        f1880L1[i].f784f[i4] = dataInputStream.readShort();
                    }
                    int readShort5 = dataInputStream.readShort();
                    f1880L1[i].f785g = new short[readShort5];
                    for (int i5 = 0; i5 < readShort5; i5++) {
                        f1880L1[i].f785g[i5] = dataInputStream.readShort();
                    }
                    int readShort6 = dataInputStream.readShort();
                    f1880L1[i].f780b = new short[readShort6][];
                    for (int i6 = 0; i6 < readShort6; i6++) {
                        int readShort7 = dataInputStream.readShort();
                        f1880L1[i].f780b[i6] = new short[readShort7];
                        for (int i7 = 0; i7 < readShort7; i7++) {
                            f1880L1[i].f780b[i6][i7] = dataInputStream.readShort();
                        }
                    }
                    int readShort8 = dataInputStream.readShort();
                    f1880L1[i].f781c = new short[readShort8][];
                    for (int i8 = 0; i8 < readShort8; i8++) {
                        int readShort9 = dataInputStream.readShort();
                        f1880L1[i].f781c[i8] = new short[readShort9];
                        for (int i9 = 0; i9 < readShort9; i9++) {
                            f1880L1[i].f781c[i8][i9] = dataInputStream.readShort();
                        }
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    dataInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            dataInputStream = null;
            e = exc;
            e.printStackTrace();
            dataInputStream.close();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            dataInputStream = null;
            th = th3;
            dataInputStream.close();
            throw th;
        }
    }

    /* renamed from: g1 */
    public void mo521g1() {
        DataInputStream dataInputStream;
        Exception e;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_effect")));
            try {
                int readShort = dataInputStream.readShort();
                f1888N1 = new C0062g[readShort];
                for (int i = 0; i < readShort; i++) {
                    C0062g[] gVarArr = f1888N1;
                    gVarArr[i] = new C0062g();
                    gVarArr[i].f797a = dataInputStream.readShort();
                    f1888N1[i].f798b = new C0064h[dataInputStream.readByte()];
                    int i2 = 0;
                    while (true) {
                        C0062g[] gVarArr2 = f1888N1;
                        if (i2 >= gVarArr2[i].f798b.length) {
                            break;
                        }
                        gVarArr2[i].f798b[i2] = new C0064h();
                        gVarArr2[i].f798b[i2].f804c = dataInputStream.readShort();
                        f1888N1[i].f798b[i2].f802a = dataInputStream.readByte();
                        f1888N1[i].f798b[i2].f803b = dataInputStream.readByte();
                        i2++;
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    dataInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            dataInputStream = null;
            e = exc;
            e.printStackTrace();
            dataInputStream.close();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            dataInputStream = null;
            th = th3;
            dataInputStream.close();
            throw th;
        }
    }

    /* renamed from: h */
    public void mo343h() {
        int i = f1963f4;
        if (i > 0) {
            f1963f4 = i - 1;
        }
        if (C0145a.f2600O % 100 == 0 && C0121h0.f1803v == 137) {
            f2023r4 = 30;
        }
        if (f1950c4 && C0145a.f2600O % 20 == 0) {
            mo542q();
        }
        mo496K1();
        C0161h.m1487e();
        C0174j.m1561j();
        int i2 = this.f2060C + 1;
        this.f2060C = i2;
        if (i2 == 100) {
            this.f2060C = 0;
        }
        try {
            if (C0170f.f2805J) {
                C0170f.f2805J = false;
            }
            if (f1961f2 == 1) {
                f1968g4 = System.currentTimeMillis();
            }
            if (f1961f2 == 100) {
                f1961f2 = 0;
                long currentTimeMillis = System.currentTimeMillis();
                f1973h4 = currentTimeMillis;
                C0105d.m365M().mo307u(((int) (currentTimeMillis - f1968g4)) / 1000);
            }
            int i3 = f1892O1;
            if (i3 > 0) {
                int i4 = i3 - 1;
                f1892O1 = i4;
                if (i4 == 0) {
                    C0103b.f1145e = false;
                }
            }
            mo550u();
            C0145a.m1363r("E1", 0);
            m856A1();
            C0145a.m1363r("E2", 0);
            C0167c.m1522b().mo826i();
            C0145a.m1363r("E3", 0);
            for (int i5 = 0; i5 < f1908S1.size(); i5++) {
                ((C0114e) f1908S1.elementAt(i5)).mo135f1();
            }
            for (int i6 = 0; i6 < C0101z0.f1120u.size(); i6++) {
                ((C0101z0) C0101z0.f1120u.elementAt(i6)).mo200d();
            }
            C0114e.m647e0().mo135f1();
            if (C0114e.m647e0().f1628u == 1 && C0145a.f2600O % 100 == 0) {
                System.gc();
            }
            C0069j0 j0Var = this.f2081M0;
            if (j0Var != null) {
                j0Var.mo156c();
            }
            C0007c.m51i();
            C0145a.m1363r("E5x", 0);
            for (int i7 = 0; i7 < f1920V1.size(); i7++) {
                ((C0137v) f1920V1.elementAt(i7)).mo325G();
            }
            C0145a.m1363r("E6", 0);
            for (int i8 = 0; i8 < f1924W1.size(); i8++) {
                ((C0050b0) f1924W1.elementAt(i8)).mo135f1();
            }
            C0077n0[] n0VarArr = f1922V3;
            this.f2136p0 = n0VarArr.length;
            int length = n0VarArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (f1922V3[length] != null) {
                    this.f2136p0 = length + 1;
                    break;
                } else {
                    this.f2136p0--;
                    length--;
                }
            }
            if (this.f2136p0 == 1 && C0145a.f2659x) {
                f1867H4 = -200;
            } else if (f1867H4 < 0) {
                m903r1();
            }
            C0145a.m1363r("E7", 0);
            C0145a.m1368x().mo729e0();
            C0145a.m1363r("E8", 0);
            m863D1();
            C0067i0.m245i();
            m874J1();
            mo492I1();
            C0145a.m1355d0();
            C0145a.m1363r("E9", 0);
            m861C1();
            C0145a.m1363r("E10", 0);
            for (int i9 = 0; i9 < f1912T1.size(); i9++) {
                ((C0078o) f1912T1.elementAt(i9)).mo182m();
            }
            C0145a.m1363r("E11", 0);
            C0145a.m1363r("E13", 0);
            for (int size = C0008d.f125c.size() - 1; size >= 0; size--) {
                C0008d.f124b.removeElement(C0008d.f125c.elementAt(size));
                C0008d.f125c.removeElementAt(size);
            }
            for (int i10 = 0; i10 < C0008d.f124b.size(); i10++) {
                ((C0008d) C0008d.f124b.elementAt(i10)).mo13b();
            }
            for (int i11 = 0; i11 < C0008d.f126d.size(); i11++) {
                ((C0008d) C0008d.f126d.elementAt(i11)).mo13b();
            }
            for (int i12 = 0; i12 < C0008d.f127e.size(); i12++) {
                ((C0008d) C0008d.f127e.elementAt(i12)).mo13b();
            }
            for (int i13 = 0; i13 < C0008d.f128f.size(); i13++) {
                ((C0008d) C0008d.f128f.elementAt(i13)).mo13b();
            }
            for (int i14 = 0; i14 < C0008d.f123a.size(); i14++) {
                ((C0008d) C0008d.f123a.elementAt(i14)).mo13b();
            }
            C0005a.m22w();
            f1862G3.mo568g();
            f1866H3.mo568g();
            C0145a.m1363r("E15", 0);
            C0114e eVar = f1913T2;
            if (eVar != null && !eVar.equals(C0114e.m647e0())) {
                f1913T2.mo135f1();
            }
            int i15 = this.f2150w0 + 1;
            this.f2150w0 = i15;
            if (i15 > 3) {
                this.f2150w0 = 0;
            }
            if (this.f2067F0) {
                int i16 = this.f2065E0 + 1;
                this.f2065E0 = i16;
                if (i16 == 20) {
                    this.f2065E0 = 0;
                    this.f2067F0 = false;
                }
            } else if (this.f2063D0 > C0114e.m647e0().f1431H) {
                int i17 = (this.f2063D0 - C0114e.m647e0().f1431H) >> 1;
                if (i17 < 1) {
                    i17 = 1;
                }
                this.f2063D0 -= i17;
            } else {
                this.f2063D0 = C0114e.m647e0().f1431H;
            }
            if (this.f2061C0) {
                int i18 = this.f2059B0 + 1;
                this.f2059B0 = i18;
                if (i18 == 20) {
                    this.f2059B0 = 0;
                    this.f2061C0 = false;
                }
            } else if (this.f2057A0 > C0114e.m647e0().f1426G) {
                int i19 = (this.f2057A0 - C0114e.m647e0().f1426G) >> 1;
                if (i19 < 1) {
                    i19 = 1;
                }
                this.f2057A0 -= i19;
            } else {
                this.f2057A0 = C0114e.m647e0().f1426G;
            }
            int i20 = this.f2125k;
            if (i20 > 0) {
                this.f2125k = i20 - 1;
            }
            if (mo557x0()) {
                while (true) {
                    int i21 = this.f2126k0 - 100;
                    int i22 = f2032u1;
                    if (i21 >= i22) {
                        break;
                    }
                    f2032u1 = i22 - 1;
                }
            }
            for (int i23 = 0; i23 < C0114e.f1377h4.size(); i23++) {
                ((C0090u) C0114e.f1377h4.elementAt(i23)).mo197i();
            }
            for (int i24 = 0; i24 < f2035u4.size(); i24++) {
                ((C0090u) f2035u4.elementAt(i24)).mo197i();
            }
            mo486B1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C0145a.f2600O % 4000 == 1000) {
            m864E();
        }
    }

    /* renamed from: h0 */
    public void mo522h0(int i) {
        C0114e V = m881V(i);
        if (V != null) {
            mo561z1(V.f1511X + C0057d1.f700o4, new C0055d(C0057d1.f634f1, 11114, V), new C0055d(C0057d1.f641g1, 2009, V));
        }
    }

    /* renamed from: h1 */
    public void mo523h1() {
        DataInputStream dataInputStream;
        Exception e;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_part")));
            try {
                int readShort = dataInputStream.readShort();
                f1884M1 = new C0061f0[readShort];
                for (int i = 0; i < readShort; i++) {
                    f1884M1[i] = new C0061f0(dataInputStream.readByte());
                    int i2 = 0;
                    while (true) {
                        C0061f0[] f0VarArr = f1884M1;
                        if (i2 >= f0VarArr[i].f796a.length) {
                            break;
                        }
                        f0VarArr[i].f796a[i2] = new C0063g0();
                        f0VarArr[i].f796a[i2].f799a = dataInputStream.readShort();
                        f1884M1[i].f796a[i2].f800b = dataInputStream.readByte();
                        f1884M1[i].f796a[i2].f801c = dataInputStream.readByte();
                        i2++;
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    dataInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            dataInputStream = null;
            e = exc;
            e.printStackTrace();
            dataInputStream.close();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            dataInputStream = null;
            th = th3;
            dataInputStream.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0393, code lost:
        if ((p013g.C0114e.m647e0().f1598o - p013g.C0114e.m647e0().f1463N1) == 0) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r0 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0574, code lost:
        if (p013g.C0114e.m647e0().f1608q > 6) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05bd, code lost:
        if (p013g.C0114e.m647e0().f1608q > 6) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x060c, code lost:
        if ((p013g.C0114e.m647e0().f1598o - p013g.C0114e.m647e0().f1463N1) == 0) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0632, code lost:
        if (p013g.C0111c0.m574a(p013g.C0114e.m647e0().f1598o - p013g.C0114e.m647e0().f1463N1) <= 24) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0748, code lost:
        if (r0 != 53) goto L_0x074f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r0 != null) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo344i() {
        /*
            r15 = this;
            boolean r0 = p012f.C0103b.f1145e
            if (r0 != 0) goto L_0x083b
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1538c
            if (r0 == 0) goto L_0x000e
            goto L_0x083b
        L_0x000e:
            boolean r0 = p013g.C0130o.f2165e
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 == 0) goto L_0x0028
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            if (r0 != 0) goto L_0x0028
            g.u r0 = p018i.C0145a.f2627d0
            boolean r0 = r0.f2239a
            if (r0 != 0) goto L_0x0028
            r15.m872H1()
        L_0x0028:
            r15.m905t()
            java.lang.String r0 = "F2"
            r1 = 0
            p018i.C0145a.m1363r(r0, r1)
            b.b r0 = p001b.C0006b.f95C
            r2 = -1
            r3 = 5
            if (r0 == 0) goto L_0x0053
            e.d r0 = r0.f113r
            boolean[] r4 = p018i.C0145a.f2574B
            boolean r4 = r4[r3]
            if (r4 != 0) goto L_0x0045
            boolean r4 = p020k.C0178n.m1639c(r0)
            if (r4 == 0) goto L_0x0146
        L_0x0045:
            if (r0 == 0) goto L_0x0146
            p018i.C0145a.f2582F = r1
            boolean[] r4 = p018i.C0145a.f2574B
            r4[r3] = r1
            p020k.C0178n.f2969g = r2
            if (r0 == 0) goto L_0x0146
            goto L_0x00c3
        L_0x0053:
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            r4 = 13
            r5 = 12
            if (r0 != 0) goto L_0x00c5
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r5]
            if (r0 != 0) goto L_0x006f
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2971a
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x0082
        L_0x006f:
            e.d r0 = r15.f2971a
            if (r0 == 0) goto L_0x0082
            p018i.C0145a.f2582F = r1
            p018i.C0145a.f2580E = r1
            boolean[] r6 = p018i.C0145a.f2574B
            r6[r5] = r1
            p020k.C0178n.f2969g = r2
            if (r0 == 0) goto L_0x0082
            r0.mo139d()
        L_0x0082:
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r4]
            if (r0 != 0) goto L_0x0092
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2973c
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x00a5
        L_0x0092:
            e.d r0 = r15.f2973c
            if (r0 == 0) goto L_0x00a5
            p018i.C0145a.f2582F = r1
            p018i.C0145a.f2580E = r1
            boolean[] r5 = p018i.C0145a.f2574B
            r5[r4] = r1
            p020k.C0178n.f2969g = r2
            if (r0 == 0) goto L_0x00a5
            r0.mo139d()
        L_0x00a5:
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r3]
            if (r0 != 0) goto L_0x00b5
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2972b
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x0146
        L_0x00b5:
            e.d r0 = r15.f2972b
            if (r0 == 0) goto L_0x0146
            p018i.C0145a.f2582F = r1
            boolean[] r4 = p018i.C0145a.f2574B
            r4[r3] = r1
            p020k.C0178n.f2969g = r2
            if (r0 == 0) goto L_0x0146
        L_0x00c3:
            goto L_0x0143
        L_0x00c5:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            if (r0 == 0) goto L_0x00f0
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r5]
            if (r0 != 0) goto L_0x00df
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x00f0
        L_0x00df:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            if (r0 == 0) goto L_0x00f0
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            r0.mo139d()
        L_0x00f0:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            if (r0 == 0) goto L_0x011b
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r4]
            if (r0 != 0) goto L_0x010a
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x011b
        L_0x010a:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            if (r0 == 0) goto L_0x011b
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            r0.mo139d()
        L_0x011b:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2795g
            if (r0 == 0) goto L_0x0146
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r3]
            if (r0 != 0) goto L_0x0135
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2795g
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x0146
        L_0x0135:
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2795g
            if (r0 == 0) goto L_0x0146
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2795g
        L_0x0143:
            r0.mo139d()
        L_0x0146:
            java.lang.String r0 = "F6"
            p018i.C0145a.m1363r(r0, r1)
            r15.mo488F1()
            java.lang.String r0 = "F7"
            p018i.C0145a.m1363r(r0, r1)
            g.e r0 = p013g.C0114e.m647e0()
            e.z r0 = r0.f1541c2
            if (r0 == 0) goto L_0x0170
            r0 = 0
        L_0x015c:
            boolean[] r4 = p018i.C0145a.f2574B
            int r5 = r4.length
            if (r0 >= r5) goto L_0x0170
            boolean r4 = r4[r0]
            if (r4 == 0) goto L_0x016d
            g.e r0 = p013g.C0114e.m647e0()
            r4 = 0
            r0.f1541c2 = r4
            goto L_0x0170
        L_0x016d:
            int r0 = r0 + 1
            goto L_0x015c
        L_0x0170:
            java.lang.String r0 = "F8"
            p018i.C0145a.m1363r(r0, r1)
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            if (r0 == 0) goto L_0x018d
            int r0 = p018i.C0145a.f2615V0
            if (r0 == 0) goto L_0x018d
            k.c r0 = p020k.C0167c.m1522b()
            int r2 = p018i.C0145a.f2615V0
            r0.mo822d(r2)
            p018i.C0145a.f2615V0 = r1
            return
        L_0x018d:
            boolean r0 = r15.f2149w
            if (r0 == 0) goto L_0x0198
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
            return
        L_0x0198:
            g.u r0 = p018i.C0145a.f2627d0
            boolean r0 = r0.f2239a
            if (r0 != 0) goto L_0x083b
            boolean r0 = r15.mo551u0()
            if (r0 != 0) goto L_0x083b
            boolean r0 = p013g.C0114e.f1393x4
            if (r0 == 0) goto L_0x01aa
            goto L_0x083b
        L_0x01aa:
            boolean[] r0 = p018i.C0145a.f2574B
            r4 = 10
            boolean r5 = r0[r4]
            if (r5 == 0) goto L_0x01ba
            r0[r4] = r1
            r15.mo506R()
            p018i.C0145a.m1359n()
        L_0x01ba:
            boolean[] r0 = p018i.C0145a.f2574B
            r5 = 11
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x01ed
            g.v r0 = r15.f2056A
            if (r0 != 0) goto L_0x01ed
            e.j0 r0 = r15.f2081M0
            if (r0 == 0) goto L_0x01d0
            e.d r0 = r0.f844a
            r0.mo139d()
            goto L_0x01e6
        L_0x01d0:
            g.q r0 = f1866H3
            e.m r0 = r0.f2175b
            g.p r0 = r0.f897b
            if (r0 == 0) goto L_0x01e6
            g.e r0 = r0.f2168c
            if (r0 == 0) goto L_0x01e6
            g.y r0 = p018i.C0145a.f2629e0
            r0.mo669o2()
            g.y r0 = p018i.C0145a.f2629e0
            r0.mo689x2()
        L_0x01e6:
            boolean[] r0 = p018i.C0145a.f2574B
            r0[r5] = r1
            p018i.C0145a.m1359n()
        L_0x01ed:
            int r0 = p018i.C0145a.f2615V0
            if (r0 == 0) goto L_0x0203
            boolean r0 = p020k.C0176l.f2892C
            if (r0 == 0) goto L_0x0203
            int r0 = p018i.C0145a.f2615V0
            r5 = 32
            if (r0 != r5) goto L_0x0203
            r15.mo506R()
            p018i.C0145a.f2615V0 = r1
            p018i.C0145a.m1359n()
        L_0x0203:
            int r0 = p018i.C0145a.f2615V0
            if (r0 == 0) goto L_0x023b
            g.v r0 = r15.f2056A
            if (r0 != 0) goto L_0x023b
            boolean r0 = p020k.C0176l.f2892C
            if (r0 == 0) goto L_0x023b
            int r0 = p018i.C0145a.f2615V0
            r5 = 121(0x79, float:1.7E-43)
            if (r0 != r5) goto L_0x023b
            e.j0 r0 = r15.f2081M0
            if (r0 == 0) goto L_0x0224
            e.d r0 = r0.f844a
            r0.mo139d()
        L_0x021e:
            p018i.C0145a.f2615V0 = r1
            p018i.C0145a.m1359n()
            goto L_0x023b
        L_0x0224:
            g.q r0 = f1866H3
            e.m r0 = r0.f2175b
            g.p r0 = r0.f897b
            if (r0 == 0) goto L_0x023b
            g.e r0 = r0.f2168c
            if (r0 == 0) goto L_0x023b
            g.y r0 = p018i.C0145a.f2629e0
            r0.mo669o2()
            g.y r0 = p018i.C0145a.f2629e0
            r0.mo689x2()
            goto L_0x021e
        L_0x023b:
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r5 = r0[r4]
            if (r5 == 0) goto L_0x024f
            g.v r5 = r15.f2056A
            if (r5 != 0) goto L_0x024f
            r0[r4] = r1
            g.q r0 = f1866H3
            r0.mo564c(r4)
            p018i.C0145a.m1359n()
        L_0x024f:
            r15.m859C()
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1509W2
            if (r0 != 0) goto L_0x025d
            r15.m906v()
        L_0x025d:
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            if (r0 == 0) goto L_0x027a
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            boolean r0 = r0.mo137a()
            if (r0 == 0) goto L_0x027a
            g.e r0 = p013g.C0114e.m647e0()
            e.d r0 = r0.f1554f0
            r0.mo139d()
        L_0x027a:
            g.e r0 = p013g.C0114e.m647e0()
            e.q0 r0 = r0.f1479Q2
            if (r0 == 0) goto L_0x0283
            return
        L_0x0283:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            r5 = 8
            r6 = 6
            r7 = 3
            r8 = 4
            r9 = 2
            r10 = 1
            if (r0 != r10) goto L_0x0355
            java.lang.String r0 = "F10"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r11 = r0[r3]
            if (r11 == 0) goto L_0x02a4
            r0[r3] = r1
            r15.m878N(r1, r1)
            goto L_0x06c2
        L_0x02a4:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r3 = r0[r9]
            if (r3 == 0) goto L_0x02b7
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1493T1
            if (r0 != 0) goto L_0x06c2
            r15.mo541p1(r1)
            goto L_0x06c2
        L_0x02b7:
            boolean r3 = r0[r8]
            if (r3 == 0) goto L_0x030b
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1574j0 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x02d2
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r2
            goto L_0x0303
        L_0x02d2:
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1493T1
            if (r0 != 0) goto L_0x0303
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1458M1
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x02f0
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
        L_0x02f0:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r9
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = -r2
        L_0x0301:
            r0.f1603p = r2
        L_0x0303:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1440I3 = r1
            goto L_0x06c2
        L_0x030b:
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x06c2
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1574j0 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x0326
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r10
            goto L_0x0303
        L_0x0326:
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1493T1
            if (r0 != 0) goto L_0x0303
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1458M1
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x0344
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
        L_0x0344:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r9
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            goto L_0x0301
        L_0x0355:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            r11 = -10
            if (r0 != r9) goto L_0x03fd
            java.lang.String r0 = "F11"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r12 = r0[r3]
            if (r12 == 0) goto L_0x0371
            r0[r3] = r1
            r15.m878N(r1, r10)
            goto L_0x06c2
        L_0x0371:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r3 = r0[r9]
            if (r3 == 0) goto L_0x03b0
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1458M1
            int r0 = r0 - r2
            if (r0 != 0) goto L_0x0395
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1463N1
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x039c
        L_0x0395:
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
        L_0x039c:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1608q = r11
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r7
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1613r = r1
            goto L_0x06c2
        L_0x03b0:
            boolean r3 = r0[r8]
            if (r3 == 0) goto L_0x03dc
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x03c6
        L_0x03be:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r2
            goto L_0x06c2
        L_0x03c6:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = -r2
        L_0x03d1:
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1396A
            int r2 = r2 + r3
        L_0x03d8:
            r0.f1603p = r2
            goto L_0x06c2
        L_0x03dc:
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x06c2
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x03f2
        L_0x03ea:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r10
            goto L_0x06c2
        L_0x03f2:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            goto L_0x03d1
        L_0x03fd:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            if (r0 != r7) goto L_0x04ad
            f1950c4 = r1
            java.lang.String r0 = "F12"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r11 = r0[r3]
            if (r11 == 0) goto L_0x0417
            r0[r3] = r1
            r15.m878N(r1, r10)
        L_0x0417:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r3 = r0[r8]
            if (r3 != 0) goto L_0x044c
            boolean r3 = r0[r10]
            if (r3 == 0) goto L_0x0426
            g.v r3 = r15.f2056A
            if (r3 != 0) goto L_0x0426
            goto L_0x044c
        L_0x0426:
            boolean r3 = r0[r6]
            if (r3 != 0) goto L_0x0432
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x0468
            g.v r0 = r15.f2056A
            if (r0 != 0) goto L_0x0468
        L_0x0432:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x0441
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r10
            goto L_0x0468
        L_0x0441:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            goto L_0x0466
        L_0x044c:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x045b
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r2
            goto L_0x0468
        L_0x045b:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = -r2
        L_0x0466:
            r0.f1603p = r2
        L_0x0468:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r2 = r0[r9]
            if (r2 != 0) goto L_0x047a
            boolean r2 = r0[r10]
            if (r2 != 0) goto L_0x0476
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x06c2
        L_0x0476:
            g.v r0 = r15.f2056A
            if (r0 != 0) goto L_0x06c2
        L_0x047a:
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1559g0
            if (r0 == 0) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1426G
            if (r0 <= 0) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1613r
            if (r0 >= r5) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1608q
            r2 = -4
            if (r0 <= r2) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r2 = r0.f1613r
            int r2 = r2 + r10
            r0.f1613r = r2
            g.e r0 = p013g.C0114e.m647e0()
            r2 = -7
            r0.f1608q = r2
            goto L_0x06c2
        L_0x04ad:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            r12 = 24
            r13 = 96
            if (r0 != r8) goto L_0x05c0
            java.lang.String r0 = "F13"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r14 = r0[r3]
            if (r14 == 0) goto L_0x04c9
            r0[r3] = r1
            r15.m878N(r1, r10)
        L_0x04c9:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x053e
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1426G
            if (r0 <= 0) goto L_0x053e
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1559g0
            if (r0 == 0) goto L_0x053e
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r14 = p013g.C0114e.m647e0()
            int r14 = r14.f1458M1
            int r0 = r0 - r14
            if (r0 != 0) goto L_0x04ff
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            g.e r14 = p013g.C0114e.m647e0()
            int r14 = r14.f1463N1
            int r0 = r0 - r14
            if (r0 == 0) goto L_0x052c
        L_0x04ff:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r14 = p013g.C0114e.m647e0()
            int r14 = r14.f1458M1
            int r0 = r0 - r14
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 > r13) goto L_0x0525
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            g.e r13 = p013g.C0114e.m647e0()
            int r13 = r13.f1463N1
            int r0 = r0 - r13
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r12) goto L_0x052c
        L_0x0525:
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
        L_0x052c:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1608q = r11
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r7
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1613r = r1
        L_0x053e:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r11 = r0[r8]
            if (r11 == 0) goto L_0x058a
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x0550
            goto L_0x03be
        L_0x0550:
            g.e r0 = p013g.C0114e.m647e0()
            int r2 = r0.f1613r
            int r2 = r2 + r10
            r0.f1613r = r2
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = -r2
            r0.f1603p = r2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1613r
            if (r0 <= r3) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1608q
            if (r0 <= r6) goto L_0x06c2
        L_0x0576:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r4
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1613r = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1608q = r1
            goto L_0x06c2
        L_0x058a:
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x06c2
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x059a
            goto L_0x03ea
        L_0x059a:
            g.e r0 = p013g.C0114e.m647e0()
            int r2 = r0.f1613r
            int r2 = r2 + r10
            r0.f1613r = r2
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            r0.f1603p = r2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1613r
            if (r0 <= r3) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1608q
            if (r0 <= r6) goto L_0x06c2
            goto L_0x0576
        L_0x05c0:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            if (r0 != r4) goto L_0x066f
            java.lang.String r0 = "F14"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r14 = r0[r3]
            if (r14 == 0) goto L_0x05d8
            r0[r3] = r1
            r15.m878N(r1, r10)
        L_0x05d8:
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1559g0
            if (r0 == 0) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1426G
            if (r0 <= 0) goto L_0x06c2
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r3 = r0[r9]
            if (r3 == 0) goto L_0x0636
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1458M1
            int r0 = r0 - r2
            if (r0 != 0) goto L_0x060e
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1463N1
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x039c
        L_0x060e:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1458M1
            int r0 = r0 - r2
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 > r13) goto L_0x0395
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1463N1
            int r0 = r0 - r2
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r12) goto L_0x039c
            goto L_0x0395
        L_0x0636:
            boolean r3 = r0[r8]
            if (r3 == 0) goto L_0x0654
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x0646
            goto L_0x03be
        L_0x0646:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = r2 + r10
            int r2 = -r2
            goto L_0x03d8
        L_0x0654:
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x06c2
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x0662
            goto L_0x03ea
        L_0x0662:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = r2 + r10
            goto L_0x03d8
        L_0x066f:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            r11 = 7
            if (r0 != r11) goto L_0x06c2
            java.lang.String r0 = "F15"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r11 = r0[r3]
            if (r11 == 0) goto L_0x0685
            r0[r3] = r1
        L_0x0685:
            boolean[] r0 = p018i.C0145a.f2576C
            boolean r3 = r0[r8]
            if (r3 == 0) goto L_0x06a5
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r10) goto L_0x0697
            goto L_0x03be
        L_0x0697:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = -r2
            int r2 = r2 + r9
            goto L_0x03d8
        L_0x06a5:
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x06c2
            f1950c4 = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1633v
            if (r0 != r2) goto L_0x06b5
            goto L_0x03ea
        L_0x06b5:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1401B
            int r2 = r2 - r9
            goto L_0x03d8
        L_0x06c2:
            java.lang.String r0 = "F17"
            p018i.C0145a.m1363r(r0, r1)
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r0 = r0[r5]
            r2 = 56
            if (r0 == 0) goto L_0x06dd
            int r0 = p018i.C0145a.f2615V0
            if (r0 == r2) goto L_0x06dd
            boolean[] r0 = p018i.C0145a.f2574B
            r0[r5] = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1546d2 = r1
        L_0x06dd:
            boolean[] r0 = p018i.C0145a.f2574B
            boolean r3 = r0[r4]
            if (r3 == 0) goto L_0x06e8
            r0[r4] = r1
            r15.mo506R()
        L_0x06e8:
            java.lang.String r0 = "F20"
            p018i.C0145a.m1363r(r0, r1)
            int r0 = p018i.C0145a.f2615V0
            if (r0 == 0) goto L_0x0833
            g.v r0 = r15.f2056A
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x07aa
            boolean r0 = p020k.C0176l.f2892C
            if (r0 == 0) goto L_0x074b
            int r0 = p018i.C0145a.f2615V0
            r2 = 113(0x71, float:1.58E-43)
            if (r0 != r2) goto L_0x070e
            e.n0[] r0 = f1918U3
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r1]
        L_0x0709:
            r15.mo500O(r0, r10)
            goto L_0x0831
        L_0x070e:
            r2 = 119(0x77, float:1.67E-43)
            if (r0 != r2) goto L_0x071b
            e.n0[] r0 = f1918U3
            r2 = r0[r10]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r10]
            goto L_0x0709
        L_0x071b:
            r2 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto L_0x0728
            e.n0[] r0 = f1918U3
            r2 = r0[r9]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r9]
            goto L_0x0709
        L_0x0728:
            r2 = 114(0x72, float:1.6E-43)
            if (r0 != r2) goto L_0x0735
            e.n0[] r0 = f1918U3
            r2 = r0[r7]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r7]
            goto L_0x0709
        L_0x0735:
            r2 = 116(0x74, float:1.63E-43)
            if (r0 != r2) goto L_0x0742
            e.n0[] r0 = f1918U3
            r2 = r0[r8]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r8]
            goto L_0x0709
        L_0x0742:
            r2 = 50
            if (r0 == r2) goto L_0x0831
            r2 = 53
            if (r0 == r2) goto L_0x0831
            goto L_0x074f
        L_0x074b:
            boolean r0 = p018i.C0145a.f2655v
            if (r0 != 0) goto L_0x075a
        L_0x074f:
            k.c r0 = p020k.C0167c.m1522b()
            int r2 = p018i.C0145a.f2615V0
            r0.mo824g(r2, r15, r3)
            goto L_0x0831
        L_0x075a:
            int r0 = p018i.C0145a.f2615V0
            r4 = 55
            if (r0 != r4) goto L_0x0769
            e.n0[] r0 = f1918U3
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r1]
            goto L_0x0709
        L_0x0769:
            if (r0 != r2) goto L_0x0774
            e.n0[] r0 = f1918U3
            r2 = r0[r10]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r10]
            goto L_0x0709
        L_0x0774:
            r2 = 57
            if (r0 != r2) goto L_0x0781
            e.n0[] r0 = f1918U3
            r2 = r0[r9]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r9]
            goto L_0x0709
        L_0x0781:
            r2 = 49
            if (r0 != r2) goto L_0x078f
            e.n0[] r0 = f1918U3
            r2 = r0[r7]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r7]
            goto L_0x0709
        L_0x078f:
            r2 = 51
            if (r0 != r2) goto L_0x079d
            e.n0[] r0 = f1918U3
            r2 = r0[r8]
            if (r2 == 0) goto L_0x0831
            r0 = r0[r8]
            goto L_0x0709
        L_0x079d:
            r2 = 48
            if (r0 != r2) goto L_0x0831
            k.c r0 = p020k.C0167c.m1522b()
            r0.mo825h(r15, r3)
            goto L_0x0831
        L_0x07aa:
            java.lang.String r0 = r15.f2154y0
            char[] r0 = r0.toCharArray()
            k.i r2 = new k.i
            r2.<init>(r3)
            r4 = 0
        L_0x07b6:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x07d0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            char r6 = r0[r4]
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r2.addElement(r5)
            int r4 = r4 + 1
            goto L_0x07b6
        L_0x07d0:
            r2.removeElementAt(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = p018i.C0145a.f2615V0
            char r4 = (char) r4
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r4 = r0.equals(r3)
            if (r4 != 0) goto L_0x07f5
            if (r0 == 0) goto L_0x07f5
            java.lang.String r4 = "\n"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x07f7
        L_0x07f5:
            java.lang.String r0 = "-"
        L_0x07f7:
            int r4 = r2.size()
            r2.insertElementAt(r0, r4)
            r15.f2154y0 = r3
            r0 = 0
        L_0x0801:
            int r3 = r2.size()
            if (r0 >= r3) goto L_0x0827
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r15.f2154y0
            r3.append(r4)
            java.lang.Object r4 = r2.elementAt(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.toUpperCase()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r15.f2154y0 = r3
            int r0 = r0 + 1
            goto L_0x0801
        L_0x0827:
            f.d r0 = p012f.C0105d.m365M()
            int r2 = p018i.C0145a.f2615V0
            char r2 = (char) r2
            r0.mo294n0(r2)
        L_0x0831:
            p018i.C0145a.f2615V0 = r1
        L_0x0833:
            p018i.C0145a.m1359n()
            java.lang.String r0 = "F23"
            p018i.C0145a.m1363r(r0, r1)
        L_0x083b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.mo344i():void");
    }

    /* renamed from: i0 */
    public void mo524i0() {
        this.f2106Z = false;
        C0007c.m50h(17);
        if (this.f2108a0) {
            this.f2108a0 = false;
            C0007c.m50h(25);
        }
    }

    /* renamed from: i1 */
    public void mo525i1() {
        DataInputStream dataInputStream;
        Exception e;
        C0083q0[] q0VarArr;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_skill")));
            try {
                short readShort = dataInputStream.readShort();
                f1872J1 = new C0083q0[C0087s0.f1035a.size()];
                for (int i = 0; i < readShort; i++) {
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 == 1111) {
                        readShort2 = (short) (readShort - 1);
                    }
                    C0083q0[] q0VarArr2 = f1872J1;
                    q0VarArr2[readShort2] = new C0083q0();
                    q0VarArr2[readShort2].f1009a = readShort2;
                    q0VarArr2[readShort2].f1010b = dataInputStream.readShort();
                    C0083q0[] q0VarArr3 = f1872J1;
                    if (q0VarArr3[readShort2].f1010b <= 0) {
                        q0VarArr3[readShort2].f1010b = 80;
                    }
                    q0VarArr3[readShort2].f1011c = dataInputStream.readByte();
                    f1872J1[readShort2].f1012d = new C0079o0[dataInputStream.readByte()];
                    int i2 = 0;
                    while (true) {
                        q0VarArr = f1872J1;
                        if (i2 >= q0VarArr[readShort2].f1012d.length) {
                            break;
                        }
                        q0VarArr[readShort2].f1012d[i2] = new C0079o0();
                        q0VarArr[readShort2].f1012d[i2].f988a = dataInputStream.readByte();
                        f1872J1[readShort2].f1012d[i2].f989b = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f990c = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f991d = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f992e = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f993f = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f994g = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f995h = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f996i = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f997j = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f998k = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f999l = dataInputStream.readShort();
                        f1872J1[readShort2].f1012d[i2].f1000m = dataInputStream.readShort();
                        i2++;
                    }
                    q0VarArr[readShort2].f1013e = new C0079o0[dataInputStream.readByte()];
                    int i3 = 0;
                    while (true) {
                        C0083q0[] q0VarArr4 = f1872J1;
                        if (i3 >= q0VarArr4[readShort2].f1013e.length) {
                            break;
                        }
                        q0VarArr4[readShort2].f1013e[i3] = new C0079o0();
                        q0VarArr4[readShort2].f1013e[i3].f988a = dataInputStream.readByte();
                        f1872J1[readShort2].f1013e[i3].f989b = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f990c = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f991d = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f992e = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f993f = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f994g = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f995h = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f996i = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f997j = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f998k = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f999l = dataInputStream.readShort();
                        f1872J1[readShort2].f1013e[i3].f1000m = dataInputStream.readShort();
                        i3++;
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    dataInputStream.close();
                    C0111c0.m584k("READ SKILL DONE");
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            dataInputStream = null;
            e = exc;
            e.printStackTrace();
            dataInputStream.close();
            C0111c0.m584k("READ SKILL DONE");
        } catch (Throwable th2) {
            Throwable th3 = th2;
            dataInputStream = null;
            th = th3;
            dataInputStream.close();
            throw th;
        }
        C0111c0.m584k("READ SKILL DONE");
    }

    /* renamed from: j0 */
    public void mo526j0() {
        this.f2119g0 = false;
        this.f2104Y = true;
        this.f2120h0 = false;
    }

    /* renamed from: k1 */
    public void mo527k1() {
        C0145a.f2627d0.f2239a = false;
        C0167c.m1522b().mo820a();
        C0167c.m1522b().f2795g = null;
        this.f2149w = false;
        this.f2143t = 0;
        f1944b2 = 0;
        f1936Z1 = 0;
        this.f2147v = -1;
        f1940a2 = -1;
        this.f2145u = 0;
        this.f2143t = 0;
        C0161h.m1491i();
        if (C0114e.m647e0().f1431H <= 0 || C0114e.m647e0().f1628u == 14 || C0114e.m647e0().f1628u == 5) {
            if (C0114e.m647e0().f1430G3) {
                C0055d dVar = new C0055d(C0057d1.f525P0[0], 11038);
                this.f2079L0 = dVar;
                this.f2972b = dVar;
                C0114e.m647e0().f1431H = 0;
            }
            f2001n2 = false;
        } else {
            f2001n2 = true;
        }
        f1952d2.mo157a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo528l() {
        C0145a.f2629e0.mo660l2();
        C0145a.f2629e0.mo689x2();
    }

    /* renamed from: l0 */
    public void mo529l0() {
        mo523h1();
        C0174j.m1558f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e0, code lost:
        r7.f2081M0 = null;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo530m(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PERFORM WITH ID = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            p013g.C0111c0.m584k(r0)
            r0 = 1
            if (r8 == r0) goto L_0x02a8
            r1 = 2
            r2 = 0
            if (r8 == r1) goto L_0x02a3
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 3
            r5 = 0
            r6 = -1
            if (r8 == r3) goto L_0x0288
            r3 = 2001(0x7d1, float:2.804E-42)
            if (r8 == r3) goto L_0x02a8
            r3 = 11120(0x2b70, float:1.5582E-41)
            if (r8 == r3) goto L_0x0266
            r3 = 11121(0x2b71, float:1.5584E-41)
            if (r8 == r3) goto L_0x0244
            r3 = 4
            switch(r8) {
                case 2003: goto L_0x022e;
                case 2004: goto L_0x021a;
                case 2005: goto L_0x0202;
                case 2006: goto L_0x01ee;
                case 2007: goto L_0x01e4;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r8) {
                case 2009: goto L_0x01e0;
                case 8002: goto L_0x01d5;
                case 11038: goto L_0x01d0;
                case 11057: goto L_0x019c;
                case 11059: goto L_0x018f;
                case 11067: goto L_0x0170;
                case 110001: goto L_0x0164;
                case 110004: goto L_0x02a3;
                case 110391: goto L_0x0153;
                case 888351: goto L_0x0149;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r8) {
                case 11000: goto L_0x0144;
                case 11001: goto L_0x013b;
                case 11002: goto L_0x0134;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r8) {
                case 11111: goto L_0x00e4;
                case 11112: goto L_0x00d7;
                case 11113: goto L_0x00c8;
                case 11114: goto L_0x00b6;
                case 11115: goto L_0x0090;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r8) {
                case 12000: goto L_0x0087;
                case 12001: goto L_0x02a8;
                case 12002: goto L_0x0075;
                case 12003: goto L_0x0063;
                case 12004: goto L_0x0055;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r8) {
                case 110382: goto L_0x004c;
                case 110383: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x02ab
        L_0x0043:
            f.d r8 = p012f.C0105d.m365M()
            r8.mo281g1()
            goto L_0x02ab
        L_0x004c:
            f.d r8 = p012f.C0105d.m365M()
            r8.mo221F0()
            goto L_0x02ab
        L_0x0055:
            e.n0 r9 = (p011e.C0077n0) r9
            r7.mo508S(r9, r0)
            g.e r8 = p013g.C0114e.m647e0()
            r8.mo372B0()
            goto L_0x02ab
        L_0x0063:
            a.d r9 = (p000a.C0003d) r9
            p018i.C0145a.m1366v()
            f.d r8 = p012f.C0105d.m365M()
            int r0 = r9.f31a
            int r9 = r9.f32b
            r8.mo313x(r1, r6, r0, r9)
            goto L_0x01e0
        L_0x0075:
            p018i.C0145a.m1366v()
            a.d r9 = (p000a.C0003d) r9
            f.d r8 = p012f.C0105d.m365M()
            int r1 = r9.f31a
            int r9 = r9.f32b
            r8.mo313x(r0, r6, r1, r9)
            goto L_0x01e0
        L_0x0087:
            f.d r8 = p012f.C0105d.m365M()
            r8.mo239P(r0, r6, r5)
            goto L_0x02ab
        L_0x0090:
            g.e r8 = p013g.C0114e.m647e0()
            g.e r8 = r8.f1472P0
            if (r8 != 0) goto L_0x0099
            return
        L_0x0099:
            p013g.C0130o.m1008d()
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            int r0 = r0.f1653z
            short r0 = (short) r0
            r8.mo308u0(r9, r0)
            goto L_0x02ab
        L_0x00b6:
            r7.f2081M0 = r5
            g.e r9 = (p013g.C0114e) r9
            if (r9 != 0) goto L_0x00bd
            return
        L_0x00bd:
            f.d r8 = p012f.C0105d.m365M()
            int r9 = r9.f1638w
            r8.mo257Y(r0, r9, r6, r6)
            goto L_0x02ab
        L_0x00c8:
            g.e r9 = (p013g.C0114e) r9
            if (r9 == 0) goto L_0x02ab
            f.d r8 = p012f.C0105d.m365M()
            int r9 = r9.f1638w
            r8.mo257Y(r2, r9, r6, r6)
            goto L_0x02ab
        L_0x00d7:
            g.e r9 = (p013g.C0114e) r9
            f.d r8 = p012f.C0105d.m365M()
            int r9 = r9.f1638w
            r8.mo230K(r0, r9)
            goto L_0x02ab
        L_0x00e4:
            g.e r8 = p013g.C0114e.m647e0()
            g.e r8 = r8.f1472P0
            if (r8 != 0) goto L_0x00ed
            return
        L_0x00ed:
            p013g.C0130o.m1008d()
            g.y r8 = p018i.C0145a.f2629e0
            k.i r8 = r8.f2474c0
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x00fb
            goto L_0x0104
        L_0x00fb:
            g.e r8 = p013g.C0114e.m647e0()
            g.e r8 = r8.f1472P0
            r7.mo516c1(r8)
        L_0x0104:
            g.y r8 = p018i.C0145a.f2629e0
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            r8.mo680s2(r9)
            g.y r8 = p018i.C0145a.f2629e0
            r8.mo689x2()
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo253W(r9)
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo291l0(r9)
            goto L_0x02ab
        L_0x0134:
            g.y r8 = p018i.C0145a.f2629e0
            r8.mo649h0()
            goto L_0x02ab
        L_0x013b:
            g.e r8 = p013g.C0114e.m647e0()
            r8.mo371B()
            goto L_0x02ab
        L_0x0144:
            r7.mo528l()
            goto L_0x02ab
        L_0x0149:
            f.d r8 = p012f.C0105d.m365M()
            r9 = 5
            r8.mo304s0(r9)
            goto L_0x02a8
        L_0x0153:
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo313x(r2, r9, r6, r6)
            goto L_0x02ab
        L_0x0164:
            g.y r8 = p018i.C0145a.f2629e0
            r8.mo660l2()
            g.y r8 = p018i.C0145a.f2629e0
            r8.mo689x2()
            goto L_0x02ab
        L_0x0170:
            int r8 = p013g.C0121h0.f1805x
            int r9 = f1936Z1
            if (r8 == r9) goto L_0x0186
            f.d r8 = p012f.C0105d.m365M()
            int r9 = f1936Z1
            int r0 = r7.f2147v
            r8.mo316y0(r9, r0)
            p013g.C0130o.m1008d()
            goto L_0x02ab
        L_0x0186:
            g.q r8 = f1862G3
            java.lang.String r9 = p011e.C0057d1.f511N0
            r8.mo562a(r9, r2)
            goto L_0x02ab
        L_0x018f:
            e.n0[] r8 = f1922V3
            int r9 = r7.f2138q0
            r8 = r8[r9]
            r7.mo508S(r8, r2)
            r7.f2972b = r5
            goto L_0x02ab
        L_0x019c:
            k.i r8 = p001b.C0008d.f126d
            r8.removeAllElements()
            k.i r8 = p001b.C0008d.f124b
            r8.removeAllElements()
            e.b0 r9 = (p011e.C0050b0) r9
            int r8 = r9.f370I4
            if (r8 != 0) goto L_0x01bf
            f.d r8 = p012f.C0105d.m365M()
            e.c0 r9 = r9.f362A4
            int r9 = r9.f381a
            short r9 = (short) r9
            g.u r0 = p018i.C0145a.f2627d0
            int r0 = r0.f2241c
            byte r0 = (byte) r0
            r8.mo218E(r9, r0)
            goto L_0x02ab
        L_0x01bf:
            g.u r8 = p018i.C0145a.f2627d0
            int r8 = r8.f2241c
            if (r8 != 0) goto L_0x02ab
            f.d r8 = p012f.C0105d.m365M()
            int r9 = r9.f370I4
            r8.mo306t0(r9)
            goto L_0x02ab
        L_0x01d0:
            r7.m899k()
            goto L_0x02ab
        L_0x01d5:
            r7.m878N(r2, r0)
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
            goto L_0x02ab
        L_0x01e0:
            r7.f2081M0 = r5
            goto L_0x02ab
        L_0x01e4:
            p018i.C0145a.m1366v()
            i.b r8 = p018i.C0146b.f2678f
            r8.mo736c()
            goto L_0x02ab
        L_0x01ee:
            p018i.C0145a.m1366v()
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo310v0(r1, r3, r9)
            goto L_0x02ab
        L_0x0202:
            p018i.C0145a.m1366v()
            r7.f2081M0 = r5
            g.e r9 = (p013g.C0114e) r9
            f.d r8 = p012f.C0105d.m365M()
            if (r9 != 0) goto L_0x0213
            r8.mo310v0(r0, r3, r6)
            return
        L_0x0213:
            int r9 = r9.f1638w
            r8.mo310v0(r0, r3, r9)
            goto L_0x02ab
        L_0x021a:
            p018i.C0145a.m1366v()
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo310v0(r2, r3, r9)
            goto L_0x02ab
        L_0x022e:
            p018i.C0145a.m1366v()
            p013g.C0130o.m1008d()
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            g.e r9 = r9.f1472P0
            int r9 = r9.f1638w
            r8.mo310v0(r2, r4, r9)
            goto L_0x02ab
        L_0x0244:
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r8 = r9[r2]
            e.n0 r8 = (p011e.C0077n0) r8
            r9 = r9[r0]
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
        L_0x0252:
            e.n0[] r0 = f1918U3
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0260
            r1 = r0[r2]
            if (r1 != r8) goto L_0x025d
            r0[r2] = r5
        L_0x025d:
            int r2 = r2 + 1
            goto L_0x0252
        L_0x0260:
            r0[r9] = r8
            r7.mo532m1()
            goto L_0x02ab
        L_0x0266:
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r8 = r9[r2]
            e.n0 r8 = (p011e.C0077n0) r8
            r9 = r9[r0]
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
        L_0x0274:
            e.n0[] r0 = f1922V3
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0282
            r1 = r0[r2]
            if (r1 != r8) goto L_0x027f
            r0[r2] = r5
        L_0x027f:
            int r2 = r2 + 1
            goto L_0x0274
        L_0x0282:
            r0[r9] = r8
            r7.mo535n1()
            goto L_0x02ab
        L_0x0288:
            r7.f2081M0 = r5
            g.e r9 = (p013g.C0114e) r9
            f.d r8 = p012f.C0105d.m365M()
            if (r9 != 0) goto L_0x0296
            r8.mo310v0(r0, r4, r6)
            return
        L_0x0296:
            int r9 = r9.f1638w
            r8.mo310v0(r0, r4, r9)
            f.d r8 = p012f.C0105d.m365M()
            r8.mo297p()
            goto L_0x02ab
        L_0x02a3:
            g.u r8 = p018i.C0145a.f2627d0
            r8.f2239a = r2
            goto L_0x02ab
        L_0x02a8:
            p018i.C0145a.m1366v()
        L_0x02ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.mo530m(int, java.lang.Object):void");
    }

    /* renamed from: m0 */
    public void mo531m0() {
        if (C0120h.f1748p) {
            C0120h.f1748p = false;
            this.f2973c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public void mo532m1() {
        byte[] bArr = new byte[f1918U3.length];
        int i = 0;
        while (true) {
            C0077n0[] n0VarArr = f1918U3;
            if (i < n0VarArr.length) {
                if (n0VarArr[i] == null) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = n0VarArr[i].f948a.f1017a;
                }
                i++;
            } else {
                C0105d.m365M().mo293n(bArr);
                return;
            }
        }
    }

    /* renamed from: n */
    public void mo533n(boolean z) {
        this.f2119g0 = true;
        this.f2104Y = true;
        this.f2120h0 = true;
        if (z) {
            C0007c.m43a(new C0009e(20, C0114e.m647e0().f1593n, C0114e.m647e0().f1598o - 77, 2, 8, 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0306  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo534n0() {
        /*
            r15 = this;
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            boolean r0 = r15.m908x(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            boolean r0 = r15.m908x(r0)
            if (r0 == 0) goto L_0x001b
            return r1
        L_0x001b:
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            boolean r0 = r15.m908x(r0)
            if (r0 == 0) goto L_0x0028
            return r1
        L_0x0028:
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            if (r0 == 0) goto L_0x0031
            return r1
        L_0x0031:
            boolean r0 = p013g.C0130o.f2165e
            if (r0 != 0) goto L_0x0754
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1498U1
            if (r0 != 0) goto L_0x0754
            boolean r0 = p013g.C0114e.f1393x4
            if (r0 == 0) goto L_0x0043
            goto L_0x0754
        L_0x0043:
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            r2 = 6
            if (r0 == 0) goto L_0x0064
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            e.r0 r0 = r0.f948a
            byte r0 = r0.f1017a
            if (r0 != r2) goto L_0x0064
            g.e r0 = p013g.C0114e.m647e0()
            e.o r0 = r0.f1477Q0
            if (r0 == 0) goto L_0x0064
            r15.m892b1()
            return r1
        L_0x0064:
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0096
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            e.r0 r0 = r0.f948a
            int r0 = r0.f1021e
            if (r0 != r3) goto L_0x0096
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            if (r0 != 0) goto L_0x0096
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            e.r0 r0 = r0.f948a
            byte r0 = r0.f1017a
            if (r0 == r2) goto L_0x0096
            boolean r0 = r15.m870H()
            if (r0 != 0) goto L_0x0095
            return r1
        L_0x0095:
            return r4
        L_0x0096:
            g.e r0 = p013g.C0114e.m647e0()
            e.q0 r0 = r0.f1479Q2
            if (r0 != 0) goto L_0x0754
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            if (r0 != 0) goto L_0x00c0
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            if (r0 != 0) goto L_0x00c0
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            if (r0 != 0) goto L_0x00c0
            g.e r0 = p013g.C0114e.m647e0()
            e.o r0 = r0.f1477Q0
            if (r0 != 0) goto L_0x00c0
            goto L_0x0754
        L_0x00c0:
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            r2 = 10
            r5 = 50
            r6 = 60
            r7 = 4
            r8 = 3
            r9 = 8002(0x1f42, float:1.1213E-41)
            r10 = 20
            r11 = -1
            r12 = 0
            if (r0 == 0) goto L_0x03b7
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            boolean r0 = r0.mo598q()
            if (r0 == 0) goto L_0x00f8
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            int r0 = r0.f2321o
            if (r0 != r7) goto L_0x00f8
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1452L0 = r12
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1541c2 = r12
        L_0x00f8:
            f1950c4 = r4
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            boolean r0 = r15.mo547s0(r0)
            if (r0 != 0) goto L_0x0107
            return r1
        L_0x0107:
            g.v r0 = r15.f2056A
            if (r0 == 0) goto L_0x010c
            return r1
        L_0x010c:
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            if (r0 != 0) goto L_0x0115
            return r1
        L_0x0115:
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.mo419a0()
            if (r0 == 0) goto L_0x0120
            return r1
        L_0x0120:
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            int r0 = r0.f2321o
            if (r0 == r4) goto L_0x03b6
            g.e r0 = p013g.C0114e.m647e0()
            g.v r0 = r0.f1452L0
            int r0 = r0.f2321o
            if (r0 == 0) goto L_0x03b6
            g.e r0 = p013g.C0114e.m647e0()
            e.n0 r0 = r0.f1639w0
            e.r0 r0 = r0.f948a
            int r0 = r0.f1021e
            if (r0 != r7) goto L_0x0142
            goto L_0x03b6
        L_0x0142:
            boolean r0 = r15.m870H()
            if (r0 != 0) goto L_0x0149
            return r1
        L_0x0149:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r13 = p013g.C0114e.m647e0()
            g.v r13 = r13.f1452L0
            int r13 = r13.mo176c()
            if (r0 >= r13) goto L_0x0162
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r4
            goto L_0x0168
        L_0x0162:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r11
        L_0x0168:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r13 = p013g.C0114e.m647e0()
            g.v r13 = r13.f1452L0
            int r13 = r13.mo176c()
            int r0 = r0 - r13
            int r0 = java.lang.Math.abs(r0)
            g.e r13 = p013g.C0114e.m647e0()
            int r13 = r13.f1598o
            g.e r14 = p013g.C0114e.m647e0()
            g.v r14 = r14.f1452L0
            int r14 = r14.mo179g()
            int r13 = r13 - r14
            int r13 = java.lang.Math.abs(r13)
            g.e r14 = p013g.C0114e.m647e0()
            r14.f1603p = r1
            g.e r14 = p013g.C0114e.m647e0()
            e.n0 r14 = r14.f1639w0
            int r14 = r14.f954g
            if (r0 > r14) goto L_0x0344
            g.e r14 = p013g.C0114e.m647e0()
            e.n0 r14 = r14.f1639w0
            int r14 = r14.f955h
            if (r13 > r14) goto L_0x0344
            g.e r5 = p013g.C0114e.m647e0()
            e.n0 r5 = r5.f1639w0
            e.r0 r5 = r5.f948a
            byte r5 = r5.f1017a
            if (r5 != r10) goto L_0x01b9
            return r4
        L_0x01b9:
            r5 = 30
            if (r13 <= r0) goto L_0x0216
            g.e r13 = p013g.C0114e.m647e0()
            int r13 = r13.f1598o
            g.e r14 = p013g.C0114e.m647e0()
            g.v r14 = r14.f1452L0
            int r14 = r14.mo179g()
            int r13 = r13 - r14
            int r13 = p013g.C0111c0.m574a(r13)
            if (r13 <= r5) goto L_0x0216
            g.e r13 = p013g.C0114e.m647e0()
            g.v r13 = r13.f1452L0
            e.y r13 = r13.mo597p()
            byte r13 = r13.f1106d
            if (r13 != r7) goto L_0x0216
            g.e r0 = p013g.C0114e.m647e0()
            e.z r2 = new e.z
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1593n
            g.e r4 = p013g.C0114e.m647e0()
            int r4 = r4.f1633v
            int r3 = r3 + r4
            g.e r4 = p013g.C0114e.m647e0()
            g.v r4 = r4.f1452L0
            int r4 = r4.mo179g()
            r2.<init>(r3, r4)
            r0.f1541c2 = r2
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
        L_0x020d:
            r0.f1619s0 = r2
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
            return r1
        L_0x0216:
            g.e r7 = p013g.C0114e.m647e0()
            g.v r7 = r7.f1452L0
            boolean r7 = r7 instanceof p013g.C0112d
            if (r7 != 0) goto L_0x022d
            g.e r7 = p013g.C0114e.m647e0()
            g.v r7 = r7.f1452L0
            boolean r7 = r7 instanceof p013g.C0110c
            if (r7 == 0) goto L_0x022b
            goto L_0x022d
        L_0x022b:
            r7 = 0
            goto L_0x022e
        L_0x022d:
            r7 = 1
        L_0x022e:
            g.e r13 = p013g.C0114e.m647e0()
            e.n0 r13 = r13.f1639w0
            int r13 = r13.f954g
            r14 = 100
            if (r13 <= r14) goto L_0x0250
            if (r0 >= r10) goto L_0x0252
            g.e r10 = p013g.C0114e.m647e0()
            g.e r13 = p013g.C0114e.m647e0()
            int r13 = r13.f1593n
            g.e r14 = p013g.C0114e.m647e0()
            int r14 = r14.f1598o
            r10.mo458w(r13, r14, r2)
            goto L_0x0252
        L_0x0250:
            r6 = 20
        L_0x0252:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "dt= "
            r2.append(r10)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            p013g.C0111c0.m584k(r2)
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r10 = p013g.C0114e.m647e0()
            int r10 = r10.f1598o
            int r10 = r10 + r8
            int r2 = p013g.C0121h0.m842v(r2, r10)
            r2 = r2 & r3
            if (r2 != r3) goto L_0x02ac
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r10 = p013g.C0114e.m647e0()
            g.v r10 = r10.f1452L0
            int r10 = r10.mo176c()
            if (r2 <= r10) goto L_0x028e
            r2 = 1
            goto L_0x028f
        L_0x028e:
            r2 = -1
        L_0x028f:
            g.e r10 = p013g.C0114e.m647e0()
            g.v r10 = r10.f1452L0
            int r10 = r10.mo176c()
            int r2 = r2 * r6
            int r10 = r10 + r2
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1598o
            int r2 = r2 + r8
            int r2 = p013g.C0121h0.m842v(r10, r2)
            r2 = r2 & r3
            if (r2 == r3) goto L_0x02ac
            r2 = 1
            goto L_0x02ad
        L_0x02ac:
            r2 = 0
        L_0x02ad:
            if (r0 > r6) goto L_0x033d
            if (r2 != 0) goto L_0x033d
            if (r0 >= r5) goto L_0x0306
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            int r2 = r2.mo176c()
            if (r0 <= r2) goto L_0x02e2
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            int r2 = r2.mo176c()
            int r2 = r2 + r6
            if (r7 == 0) goto L_0x02d8
            r1 = 30
        L_0x02d8:
            int r2 = r2 + r1
            r0.f1593n = r2
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r11
            goto L_0x02fe
        L_0x02e2:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            int r2 = r2.mo176c()
            int r2 = r2 - r6
            if (r7 == 0) goto L_0x02f5
            r1 = 30
        L_0x02f5:
            int r2 = r2 - r1
            r0.f1593n = r2
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r4
        L_0x02fe:
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
            goto L_0x033d
        L_0x0306:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            int r2 = r2.mo176c()
            if (r0 <= r2) goto L_0x0319
            goto L_0x031a
        L_0x0319:
            int r6 = -r6
        L_0x031a:
            g.e r0 = p013g.C0114e.m647e0()
            e.z r2 = new e.z
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1593n
            int r3 = r3 + r6
            g.e r4 = p013g.C0114e.m647e0()
            int r4 = r4.f1598o
            r2.<init>(r3, r4)
            r0.f1541c2 = r2
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
            goto L_0x020d
        L_0x033d:
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
            return r4
        L_0x0344:
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            boolean r2 = r2 instanceof p013g.C0112d
            if (r2 != 0) goto L_0x035b
            g.e r2 = p013g.C0114e.m647e0()
            g.v r2 = r2.f1452L0
            boolean r2 = r2 instanceof p013g.C0110c
            if (r2 == 0) goto L_0x0359
            goto L_0x035b
        L_0x0359:
            r2 = 0
            goto L_0x035c
        L_0x035b:
            r2 = 1
        L_0x035c:
            g.e r3 = p013g.C0114e.m647e0()
            e.n0 r3 = r3.f1639w0
            int r3 = r3.f954g
            if (r2 == 0) goto L_0x0367
            goto L_0x0369
        L_0x0367:
            r5 = 20
        L_0x0369:
            int r3 = r3 - r5
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            g.v r5 = r5.f1452L0
            int r5 = r5.mo176c()
            if (r2 <= r5) goto L_0x037d
            goto L_0x037e
        L_0x037d:
            r4 = -1
        L_0x037e:
            int r3 = r3 * r4
            g.e r2 = p013g.C0114e.m647e0()
            e.n0 r2 = r2.f1639w0
            int r2 = r2.f954g
            if (r0 > r2) goto L_0x038b
            r3 = 0
        L_0x038b:
            g.e r0 = p013g.C0114e.m647e0()
            e.z r2 = new e.z
            g.e r4 = p013g.C0114e.m647e0()
            g.v r4 = r4.f1452L0
            int r4 = r4.mo176c()
            int r4 = r4 + r3
            g.e r3 = p013g.C0114e.m647e0()
            g.v r3 = r3.f1452L0
            int r3 = r3.mo179g()
            r2.<init>(r4, r3)
            r0.f1541c2 = r2
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
            goto L_0x020d
        L_0x03b6:
            return r1
        L_0x03b7:
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            r13 = 40
            if (r0 == 0) goto L_0x04f2
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            boolean r0 = r0.f363B4
            if (r0 == 0) goto L_0x03cc
            return r1
        L_0x03cc:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            e.b0 r2 = r2.f1467O0
            int r2 = r2.f1593n
            if (r0 >= r2) goto L_0x03e3
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r4
            goto L_0x03e9
        L_0x03e3:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r11
        L_0x03e9:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            e.b0 r2 = r2.f1467O0
            int r2 = r2.f1593n
            if (r0 >= r2) goto L_0x0402
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            r0.f1633v = r11
            goto L_0x040a
        L_0x0402:
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            r0.f1633v = r4
        L_0x040a:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r2 = p013g.C0114e.m647e0()
            e.b0 r2 = r2.f1467O0
            int r2 = r2.f1593n
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1598o
            g.e r3 = p013g.C0114e.m647e0()
            e.b0 r3 = r3.f1467O0
            int r3 = r3.f1598o
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            if (r2 <= r13) goto L_0x0441
            g.e r2 = p013g.C0114e.m647e0()
            g.e r3 = p013g.C0114e.m647e0()
            e.b0 r3 = r3.f1467O0
            int r3 = r3.f1598o
            int r3 = r3 - r13
            r2.f1598o = r3
        L_0x0441:
            if (r0 >= r6) goto L_0x04ab
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
            int r0 = r15.f2125k
            if (r0 != 0) goto L_0x04f1
            g.e r0 = p013g.C0114e.m647e0()
            e.x0 r0 = r0.f1644x0
            if (r0 == 0) goto L_0x048d
            g.e r0 = p013g.C0114e.m647e0()
            e.x0 r0 = r0.f1644x0
            short r0 = r0.f1097c
            if (r0 != 0) goto L_0x048d
            g.e r0 = p013g.C0114e.m647e0()
            e.x0 r0 = r0.f1644x0
            int r0 = r0.f1095a
            if (r0 >= r7) goto L_0x0476
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            e.c0 r0 = r0.f362A4
            int r0 = r0.f381a
            if (r0 != r7) goto L_0x0476
            return r1
        L_0x0476:
            g.e r0 = p013g.C0114e.m647e0()
            e.x0 r0 = r0.f1644x0
            int r0 = r0.f1095a
            if (r0 >= r8) goto L_0x048d
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            e.c0 r0 = r0.f362A4
            int r0 = r0.f381a
            if (r0 != r8) goto L_0x048d
            return r1
        L_0x048d:
            r15.f2125k = r5
            p013g.C0130o.m1008d()
            f.d r0 = p012f.C0105d.m365M()
            r0.mo297p()
            f.d r0 = p012f.C0105d.m365M()
            g.e r2 = p013g.C0114e.m647e0()
            e.b0 r2 = r2.f1467O0
            e.c0 r2 = r2.f362A4
            int r2 = r2.f381a
            r0.mo298p0(r2)
            goto L_0x04f1
        L_0x04ab:
            java.util.Random r0 = p013g.C0111c0.f1307d
            int r0 = r0.nextInt(r10)
            int r0 = r0 + r10
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r3 = p013g.C0114e.m647e0()
            e.b0 r3 = r3.f1467O0
            int r3 = r3.f1593n
            if (r2 <= r3) goto L_0x04c3
            goto L_0x04c4
        L_0x04c3:
            r4 = -1
        L_0x04c4:
            int r0 = r0 * r4
            g.e r2 = p013g.C0114e.m647e0()
            e.z r3 = new e.z
            g.e r4 = p013g.C0114e.m647e0()
            e.b0 r4 = r4.f1467O0
            int r4 = r4.f1593n
            int r4 = r4 + r0
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1598o
            r3.<init>(r4, r0)
            r2.f1541c2 = r3
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
            r0.f1619s0 = r2
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
        L_0x04f1:
            return r1
        L_0x04f2:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            if (r0 == 0) goto L_0x0747
            g.v r0 = r15.f2056A
            if (r0 == 0) goto L_0x04ff
            return r1
        L_0x04ff:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            g.e r5 = r5.f1472P0
            int r5 = r5.f1593n
            if (r0 >= r5) goto L_0x0516
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r4
            goto L_0x051c
        L_0x0516:
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r11
        L_0x051c:
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            g.e r5 = r5.f1472P0
            int r5 = r5.f1593n
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            g.e r5 = p013g.C0114e.m647e0()
            int r5 = r5.f1598o
            g.e r7 = p013g.C0114e.m647e0()
            g.e r7 = r7.f1472P0
            int r7 = r7.f1598o
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            g.e r7 = p013g.C0114e.m647e0()
            g.e r14 = p013g.C0114e.m647e0()
            g.e r14 = r14.f1472P0
            boolean r7 = r7.mo409V(r14)
            if (r7 != 0) goto L_0x05ff
            g.e r7 = p013g.C0114e.m647e0()
            boolean r7 = r7.mo417Z()
            if (r7 == 0) goto L_0x055e
            goto L_0x05ff
        L_0x055e:
            if (r0 >= r6) goto L_0x05b6
            if (r5 >= r13) goto L_0x05b6
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            r15.mo516c1(r0)
            boolean r0 = p018i.C0145a.f2659x
            if (r0 != 0) goto L_0x05fe
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            int r0 = r0.f1638w
            if (r0 < 0) goto L_0x05fe
            int r0 = p013g.C0121h0.f1803v
            r2 = 51
            if (r0 == r2) goto L_0x05fe
            r2 = 52
            if (r0 == r2) goto L_0x05fe
            e.j0 r0 = r15.f2081M0
            if (r0 != 0) goto L_0x05fe
            g.y r0 = p018i.C0145a.f2629e0
            g.e r2 = p013g.C0114e.m647e0()
            g.e r2 = r2.f1472P0
            r0.mo680s2(r2)
            g.y r0 = p018i.C0145a.f2629e0
            r0.mo689x2()
            f.d r0 = p012f.C0105d.m365M()
            g.e r2 = p013g.C0114e.m647e0()
            g.e r2 = r2.f1472P0
            int r2 = r2.f1638w
            r0.mo253W(r2)
            f.d r0 = p012f.C0105d.m365M()
            g.e r2 = p013g.C0114e.m647e0()
            g.e r2 = r2.f1472P0
            int r2 = r2.f1638w
            r0.mo291l0(r2)
            goto L_0x05fe
        L_0x05b6:
            java.util.Random r0 = p013g.C0111c0.f1307d
            int r0 = r0.nextInt(r10)
            int r0 = r0 + r10
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r3 = p013g.C0114e.m647e0()
            g.e r3 = r3.f1472P0
            int r3 = r3.f1593n
            if (r2 <= r3) goto L_0x05ce
            goto L_0x05cf
        L_0x05ce:
            r4 = -1
        L_0x05cf:
            int r0 = r0 * r4
            g.e r2 = p013g.C0114e.m647e0()
            e.z r3 = new e.z
            g.e r4 = p013g.C0114e.m647e0()
            g.e r4 = r4.f1472P0
            int r4 = r4.f1593n
            int r4 = r4 + r0
            g.e r0 = p013g.C0114e.m647e0()
            g.e r0 = r0.f1472P0
            int r0 = r0.f1598o
            r3.<init>(r4, r0)
            r2.f1541c2 = r3
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
            r0.f1619s0 = r2
            p018i.C0145a.m1358m()
            p018i.C0145a.m1359n()
        L_0x05fe:
            return r1
        L_0x05ff:
            g.e r7 = p013g.C0114e.m647e0()
            e.n0 r7 = r7.f1639w0
            if (r7 != 0) goto L_0x0608
            return r1
        L_0x0608:
            boolean r7 = r15.m870H()
            if (r7 != 0) goto L_0x060f
            return r1
        L_0x060f:
            g.e r7 = p013g.C0114e.m647e0()
            int r7 = r7.f1593n
            g.e r13 = p013g.C0114e.m647e0()
            g.e r13 = r13.f1472P0
            int r13 = r13.f1593n
            if (r7 >= r13) goto L_0x0626
            g.e r7 = p013g.C0114e.m647e0()
            r7.f1633v = r4
            goto L_0x062c
        L_0x0626:
            g.e r7 = p013g.C0114e.m647e0()
            r7.f1633v = r11
        L_0x062c:
            g.e r7 = p013g.C0114e.m647e0()
            r7.f1603p = r1
            g.e r7 = p013g.C0114e.m647e0()
            e.n0 r7 = r7.f1639w0
            int r7 = r7.f954g
            if (r0 > r7) goto L_0x06f8
            g.e r7 = p013g.C0114e.m647e0()
            e.n0 r7 = r7.f1639w0
            int r7 = r7.f955h
            if (r5 > r7) goto L_0x06f8
            g.e r5 = p013g.C0114e.m647e0()
            e.n0 r5 = r5.f1639w0
            e.r0 r5 = r5.f948a
            byte r5 = r5.f1017a
            if (r5 != r10) goto L_0x0653
            return r4
        L_0x0653:
            g.e r5 = p013g.C0114e.m647e0()
            e.n0 r5 = r5.f1639w0
            int r5 = r5.f954g
            if (r5 <= r6) goto L_0x0673
            if (r0 >= r10) goto L_0x0675
            g.e r5 = p013g.C0114e.m647e0()
            g.e r7 = p013g.C0114e.m647e0()
            int r7 = r7.f1593n
            g.e r9 = p013g.C0114e.m647e0()
            int r9 = r9.f1598o
            r5.mo458w(r7, r9, r2)
            goto L_0x0675
        L_0x0673:
            r6 = 20
        L_0x0675:
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            int r5 = r5.f1598o
            int r5 = r5 + r8
            int r2 = p013g.C0121h0.m842v(r2, r5)
            r2 = r2 & r3
            if (r2 != r3) goto L_0x06b6
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            g.e r5 = r5.f1472P0
            int r5 = r5.f1593n
            if (r2 <= r5) goto L_0x069b
            r2 = 1
            goto L_0x069c
        L_0x069b:
            r2 = -1
        L_0x069c:
            g.e r5 = p013g.C0114e.m647e0()
            g.e r5 = r5.f1472P0
            int r5 = r5.f1593n
            int r2 = r2 * r6
            int r5 = r5 + r2
            g.e r2 = p013g.C0114e.m647e0()
            int r2 = r2.f1598o
            int r2 = r2 + r8
            int r2 = p013g.C0121h0.m842v(r5, r2)
            r2 = r2 & r3
            if (r2 == r3) goto L_0x06b6
            r1 = 1
        L_0x06b6:
            if (r0 > r6) goto L_0x033d
            if (r1 != 0) goto L_0x033d
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1593n
            g.e r1 = p013g.C0114e.m647e0()
            g.e r1 = r1.f1472P0
            int r1 = r1.f1593n
            if (r0 <= r1) goto L_0x06e1
            g.e r0 = p013g.C0114e.m647e0()
            g.e r1 = p013g.C0114e.m647e0()
            g.e r1 = r1.f1472P0
            int r1 = r1.f1593n
            int r1 = r1 + r6
            r0.f1593n = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r11
            goto L_0x02fe
        L_0x06e1:
            g.e r0 = p013g.C0114e.m647e0()
            g.e r1 = p013g.C0114e.m647e0()
            g.e r1 = r1.f1472P0
            int r1 = r1.f1593n
            int r1 = r1 - r6
            r0.f1593n = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1633v = r4
            goto L_0x02fe
        L_0x06f8:
            g.e r2 = p013g.C0114e.m647e0()
            e.n0 r2 = r2.f1639w0
            int r2 = r2.f954g
            int r2 = r2 - r10
            g.e r3 = p013g.C0114e.m647e0()
            int r3 = r3.f1593n
            g.e r5 = p013g.C0114e.m647e0()
            g.e r5 = r5.f1472P0
            int r5 = r5.f1593n
            if (r3 <= r5) goto L_0x0712
            goto L_0x0713
        L_0x0712:
            r4 = -1
        L_0x0713:
            int r2 = r2 * r4
            g.e r3 = p013g.C0114e.m647e0()
            e.n0 r3 = r3.f1639w0
            int r3 = r3.f954g
            if (r0 > r3) goto L_0x0720
            r2 = 0
        L_0x0720:
            g.e r0 = p013g.C0114e.m647e0()
            e.z r3 = new e.z
            g.e r4 = p013g.C0114e.m647e0()
            g.e r4 = r4.f1472P0
            int r4 = r4.f1593n
            int r4 = r4 + r2
            g.e r2 = p013g.C0114e.m647e0()
            g.e r2 = r2.f1472P0
            int r2 = r2.f1598o
            r3.<init>(r4, r2)
            r0.f1541c2 = r3
            g.e r0 = p013g.C0114e.m647e0()
            e.d r2 = new e.d
            r2.<init>((java.lang.String) r12, (p011e.C0072l) r12, (int) r9, (java.lang.Object) r12)
            goto L_0x020d
        L_0x0747:
            g.e r0 = p013g.C0114e.m647e0()
            e.o r0 = r0.f1477Q0
            if (r0 == 0) goto L_0x0753
            r15.m892b1()
            return r1
        L_0x0753:
            return r4
        L_0x0754:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0126k.mo534n0():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public void mo535n1() {
        byte[] bArr = new byte[f1922V3.length];
        int i = 0;
        while (true) {
            C0077n0[] n0VarArr = f1922V3;
            if (i < n0VarArr.length) {
                if (n0VarArr[i] == null) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = n0VarArr[i].f948a.f1017a;
                }
                i++;
            } else {
                C0105d.m365M().mo293n(bArr);
                return;
            }
        }
    }

    /* renamed from: o */
    public void mo536o(int i, int i2) {
        if (!this.f2110b0) {
            C0175k.m1563p().mo874d();
            C0111c0.m584k("ACTIVE SUPER POWER");
            this.f2110b0 = true;
            this.f2112c0 = 0;
            this.f2118f0 = 0;
            this.f2114d0 = i - f2028t1;
            this.f2116e0 = i2 - f2032u1;
        }
    }

    /* renamed from: o0 */
    public boolean mo537o0() {
        for (int length = C0114e.m647e0().f1397A0.length - 1; length >= 0; length--) {
            if (C0114e.m647e0().f1397A0[length] == null) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo538o1(byte b) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo539p() {
        C0050b0 b0Var = new C0050b0(5, 0, -100, 100, 5, f1862G3.f2174a[C0114e.m647e0().f1643x][2]);
        String str = "!null";
        C0111c0.m584k(C0114e.m647e0().f1467O0 != null ? str : "null");
        String str2 = C0057d1.f717r0;
        String[] strArr = {"Có", "Không"};
        if (C0114e.m647e0().f1467O0 == null) {
            str = "null";
        }
        C0111c0.m584k(str);
        b0Var.f370I4 = 673;
        m893c0().mo497L(strArr, b0Var);
        C0006b.m35g(str2, 100000, b0Var, 5820);
    }

    /* renamed from: p0 */
    public boolean mo540p0() {
        return C0114e.m647e0().f1509W2 || C0114e.m647e0().f1504V2 || C0114e.m647e0().f1514X2 || C0114e.m647e0().f1425F3 || this.f2110b0 || C0114e.m647e0().f1560g1;
    }

    /* renamed from: p1 */
    public void mo541p1(int i) {
        if (!(C0114e.m647e0().f1593n - C0114e.m647e0().f1458M1 == 0 && C0114e.m647e0().f1598o - C0114e.m647e0().f1463N1 == 0)) {
            C0105d.m365M().mo297p();
        }
        C0114e.m647e0().f1608q = -10;
        C0114e.m647e0().f1603p = i;
        C0114e.m647e0().f1628u = 3;
        C0114e.m647e0().f1613r = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo542q() {
        boolean z;
        C0077n0 n0Var;
        C0077n0 n0Var2;
        int i = this.f2134o0;
        if (i > 0) {
            this.f2134o0 = i - 1;
        }
        if (f1954d4 && !f1958e4 && C0114e.m647e0().f1628u != 14 && C0114e.m647e0().f1628u != 5 && !C0114e.m647e0().f1565h1 && !C0114e.m647e0().f1509W2 && !C0114e.m647e0().mo421b0()) {
            int i2 = 0;
            boolean z2 = false;
            for (int i3 = 0; i3 < f1920V1.size(); i3++) {
                int i4 = ((C0137v) f1920V1.elementAt(i3)).f2321o;
                if (!(i4 == 0 || i4 == 1)) {
                    z2 = true;
                }
            }
            if (z2) {
                int i5 = 0;
                while (true) {
                    if (i5 >= C0114e.m647e0().f1397A0.length) {
                        z = false;
                        break;
                    }
                    C0076n nVar = C0114e.m647e0().f1397A0[i5];
                    if (nVar != null && nVar.f923b.f1027b == 6) {
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z && C0145a.f2600O % 150 == 0) {
                    C0105d.m365M().mo217D0();
                }
                if (C0114e.m647e0().f1431H <= (C0114e.m647e0().f1461N * 20) / 100 || C0114e.m647e0().f1426G <= (C0114e.m647e0().f1466O * 20) / 100) {
                    mo506R();
                }
                C0077n0 n0Var3 = null;
                if (C0114e.m647e0().f1452L0 == null || (C0114e.m647e0().f1452L0 != null && C0114e.m647e0().f1452L0.f2282N)) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < f1920V1.size()) {
                            C0137v vVar = (C0137v) f1920V1.elementAt(i6);
                            int i7 = vVar.f2321o;
                            if (i7 != 0 && i7 != 1 && vVar.f2311i > 0 && !vVar.f2282N) {
                                C0114e.m647e0().f1593n = vVar.f2315k;
                                C0114e.m647e0().f1598o = vVar.f2317l;
                                C0114e.m647e0().f1452L0 = vVar;
                                C0105d.m365M().mo297p();
                                C0111c0.m584k("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                                break;
                            }
                            i6++;
                        } else {
                            break;
                        }
                    }
                } else if (C0114e.m647e0().f1452L0.f2311i <= 0 || C0114e.m647e0().f1452L0.f2321o == 1 || C0114e.m647e0().f1452L0.f2321o == 0) {
                    C0114e.m647e0().f1452L0 = null;
                }
                if (C0114e.m647e0().f1452L0 != null && this.f2134o0 == 0) {
                    if (C0114e.m647e0().mo418Z0() == null || C0114e.m647e0().f1399A2 >= C0114e.m647e0().mo418Z0().length || C0114e.m647e0().f1469O2 == null || C0114e.m647e0().f1464N2 == null) {
                        if (C0145a.f2659x) {
                            while (true) {
                                C0077n0[] n0VarArr = f1922V3;
                                if (i2 >= n0VarArr.length) {
                                    break;
                                }
                                if (!(n0VarArr[i2] == null || n0VarArr[i2].f958k || n0VarArr[i2].f948a.f1017a == 10 || n0VarArr[i2].f948a.f1017a == 11 || n0VarArr[i2].f948a.f1017a == 14 || n0VarArr[i2].f948a.f1017a == 23 || n0VarArr[i2].f948a.f1017a == 7 || C0114e.m647e0().mo418Z0() != null)) {
                                    C0077n0[] n0VarArr2 = f1922V3;
                                    if (C0114e.m647e0().f1426G >= (n0VarArr2[i2].f948a.f1020d == 2 ? 1 : n0VarArr2[i2].f948a.f1020d != 1 ? n0VarArr2[i2].f957j : (n0VarArr2[i2].f957j * C0114e.m647e0().f1466O) / 100)) {
                                        if (n0Var3 == null) {
                                            n0Var2 = f1922V3[i2];
                                        } else {
                                            int i8 = n0Var3.f952e;
                                            C0077n0[] n0VarArr3 = f1922V3;
                                            if (i8 < n0VarArr3[i2].f952e) {
                                                n0Var2 = n0VarArr3[i2];
                                            }
                                        }
                                        n0Var3 = n0Var2;
                                    }
                                }
                                i2++;
                            }
                            if (n0Var3 == null) {
                                return;
                            }
                        } else {
                            while (true) {
                                C0077n0[] n0VarArr4 = f1918U3;
                                if (i2 >= n0VarArr4.length) {
                                    break;
                                }
                                if (!(n0VarArr4[i2] == null || n0VarArr4[i2].f958k || n0VarArr4[i2].f948a.f1017a == 10 || n0VarArr4[i2].f948a.f1017a == 11 || n0VarArr4[i2].f948a.f1017a == 14 || n0VarArr4[i2].f948a.f1017a == 23 || n0VarArr4[i2].f948a.f1017a == 7 || C0114e.m647e0().mo418Z0() != null)) {
                                    C0077n0[] n0VarArr5 = f1918U3;
                                    if (C0114e.m647e0().f1426G >= (n0VarArr5[i2].f948a.f1020d == 2 ? 1 : n0VarArr5[i2].f948a.f1020d != 1 ? n0VarArr5[i2].f957j : (n0VarArr5[i2].f957j * C0114e.m647e0().f1466O) / 100)) {
                                        if (n0Var3 == null) {
                                            n0Var = f1918U3[i2];
                                        } else {
                                            int i9 = n0Var3.f952e;
                                            C0077n0[] n0VarArr6 = f1918U3;
                                            if (i9 < n0VarArr6[i2].f952e) {
                                                n0Var = n0VarArr6[i2];
                                            }
                                        }
                                        n0Var3 = n0Var;
                                    }
                                }
                                i2++;
                            }
                            if (n0Var3 == null) {
                                return;
                            }
                        }
                        mo500O(n0Var3, true);
                        m876M(C0114e.m647e0().f1452L0);
                    }
                }
            }
        }
    }

    /* renamed from: q0 */
    public boolean mo543q0() {
        int i = C0121h0.f1803v;
        return i >= 53 && i <= 62;
    }

    /* renamed from: r */
    public void mo544r(int i, int i2) {
        C0111c0.m584k("VE RONG THAN O VI TRI x= " + i + " y=" + i2);
        mo510U();
        C0007c.m43a(new C0009e(this.f2108a0 ? 25 : 17, i, i2 - 77, 2, -1, 1));
    }

    /* renamed from: r0 */
    public boolean mo545r0() {
        return C0121h0.f1803v >= 63;
    }

    /* renamed from: s */
    public void mo546s(String str) {
        if (!this.f2105Y0) {
            this.f2103X0 = C0177m.f2950r.mo914f(str);
            this.f2101W0 = C0145a.f2614V;
            this.f2105Y0 = true;
        }
        if (str.startsWith("!")) {
            str = str.substring(1, str.length());
            this.f2083N0 = true;
        }
        f2004n5.addElement(str);
    }

    /* renamed from: s0 */
    public boolean mo547s0(C0137v vVar) {
        if (vVar == null) {
            return false;
        }
        if (C0114e.m647e0().f1437I0 == 5) {
            return true;
        }
        if (C0114e.m647e0().mo394N() && !vVar.f2282N) {
            return false;
        }
        if (C0114e.m647e0().f1457M0 != null && vVar.equals(C0114e.m647e0().f1457M0)) {
            return false;
        }
        C0114e V = m881V(vVar.f2331y);
        return V == null || V.f1437I0 == 5 || C0114e.m647e0().mo409V(V);
    }

    /* renamed from: t0 */
    public boolean mo548t0() {
        return (!C0145a.f2661y && C0145a.f2625c0 == m893c0()) || !C0145a.f2659x || C0167c.m1522b().f2790b || C0130o.f2161a || C0145a.f2637i0 != null || C0006b.f95C != null || C0145a.f2627d0.f2239a || C0145a.f2629e0.f2467a || mo553v0();
    }

    /* renamed from: t1 */
    public void mo549t1(String str, String str2) {
        this.f2085O0 = new int[str.length()];
        this.f2087P0 = new int[str.length()];
        this.f2089Q0 = new int[str.length()];
        this.f2091R0 = new int[str.length()];
        this.f2093S0 = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            this.f2085O0[i] = Short.parseShort(String.valueOf(str.charAt(i)));
            this.f2087P0[i] = C0111c0.m587n(0, 11);
            this.f2089Q0[i] = 1;
            this.f2093S0[i] = 0;
        }
        this.f2099V0 = 100;
        this.f2095T0 = 0;
        this.f2097U0 = str2;
        long h = C0161h.m1490h();
        f1983j4 = h;
        f1978i4 = h;
    }

    /* renamed from: u */
    public void mo550u() {
    }

    /* renamed from: u0 */
    public boolean mo551u0() {
        return f1996m2 || f2006o2 || f2011p2 || f2016q2 || f2021r2 || f2025s2 || f2029t2 || f2033u2 || f2037v2 || f2041w2 || f2045x2 || f2049y2 || f2053z2 || f1837A2 || f1841B2 || f1845C2 || f1849D2 || f1853E2 || f1857F2 || f1861G2 || f1865H2 || f1869I2 || f1873J2 || f1877K2 || f1881L2 || f1885M2 || f1889N2 || f1897P2;
    }

    /* renamed from: u1 */
    public void mo552u1(String str) {
        this.f2113c1 = str;
        this.f2115d1 = C0177m.f2956x.mo916h(str, 500);
    }

    /* renamed from: v0 */
    public boolean mo553v0() {
        return f1996m2 || f2006o2 || f2011p2 || f1853E2 || f2016q2 || f2021r2 || f2025s2 || f2029t2 || f2033u2 || f2037v2 || f2041w2 || f2045x2 || f2049y2 || f2053z2 || f1837A2 || f1841B2 || f1845C2 || f1849D2 || f1857F2 || f1861G2 || f1865H2 || f1869I2 || f1873J2 || f1877K2 || f1889N2 || f1881L2 || f1885M2 || f1897P2 || f1966g2 || f1901Q2 || f1976i2 || f1909S2 || f1981j2 || f1971h2 || f1986k2 || f1991l2 || f1893O2 || f1905R2;
    }

    /* renamed from: v1 */
    public void mo554v1() {
        int i = 0;
        while (i < C0114e.m647e0().f1629u0.size() - 1) {
            C0077n0 n0Var = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i);
            int i2 = i + 1;
            for (int i3 = i2; i3 < C0114e.m647e0().f1629u0.size(); i3++) {
                C0077n0 n0Var2 = (C0077n0) C0114e.m647e0().f1629u0.elementAt(i3);
                if (n0Var2.f948a.f1017a < n0Var.f948a.f1017a) {
                    C0114e.m647e0().f1629u0.setElementAt(n0Var2, i);
                    C0114e.m647e0().f1629u0.setElementAt(n0Var, i3);
                    n0Var = n0Var2;
                }
            }
            i = i2;
        }
    }

    /* renamed from: w0 */
    public boolean mo555w0() {
        return f2011p2 || f1853E2 || f2016q2 || f2021r2 || f2025s2 || f2029t2 || f2033u2 || f2037v2 || f2041w2 || f2045x2 || f2049y2 || f2053z2 || f1837A2 || f1841B2 || f1845C2 || f1849D2 || f1857F2 || f1861G2 || f1865H2 || f1869I2 || f1873J2 || f1877K2 || f1889N2 || f1881L2 || f1885M2 || f1897P2;
    }

    /* renamed from: w1 */
    public void mo556w1() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f2071H0 = currentTimeMillis;
        this.f2069G0 = currentTimeMillis;
        this.f2073I0 = 180;
    }

    /* renamed from: x0 */
    public boolean mo557x0() {
        return this.f2120h0;
    }

    /* renamed from: y */
    public boolean mo558y() {
        if (this.f2056A == null) {
            return false;
        }
        int i = C0145a.f2614V;
        int i2 = f2013p4;
        return C0145a.m1336F((i - (i2 * 5)) / 2, C0145a.f2616W + -40, i2 * 5, f2013p4);
    }

    /* renamed from: y0 */
    public boolean mo559y0() {
        int i = C0121h0.f1803v;
        if (i != 130 && i != 51 && i != 112 && i != 113 && i != 129) {
            return false;
        }
        if (C0114e.m647e0().f1437I0 == 0) {
            return (C0121h0.f1803v != 130 || mo512W() == null || mo513X() == null) ? false : true;
        }
        return true;
    }

    /* renamed from: z0 */
    public boolean mo560z0() {
        return true;
    }

    /* renamed from: z1 */
    public void mo561z1(String str, C0055d dVar, C0055d dVar2) {
        C0069j0 j0Var = new C0069j0();
        this.f2081M0 = j0Var;
        j0Var.mo155b(str, dVar, dVar2);
    }
}
