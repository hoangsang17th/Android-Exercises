package p019j;

import com.blue.dragonball.MainActivity;
import p001b.C0016l;
import p001b.C0018n;
import p011e.C0057d1;
import p012f.C0103b;
import p013g.C0111c0;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p020k.C0168d;
import p020k.C0171g;
import p020k.C0177m;

/* renamed from: j.h */
public class C0161h {

    /* renamed from: a */
    public static boolean f2753a = false;

    /* renamed from: b */
    public static String f2754b = null;

    /* renamed from: c */
    public static String f2755c = null;

    /* renamed from: d */
    public static boolean f2756d = false;

    /* renamed from: e */
    public static String f2757e = null;

    /* renamed from: f */
    public static int f2758f = 2;

    /* renamed from: g */
    public static boolean f2759g = false;

    /* renamed from: a */
    public static void m1483a() {
        C0146b.f2678f.mo721b("http://ngocrongonline.com/");
    }

    /* renamed from: b */
    public static void m1484b() {
    }

    /* renamed from: c */
    public static void m1485c() {
    }

    /* renamed from: d */
    public static void m1486d() {
    }

    /* renamed from: e */
    public static void m1487e() {
        MainActivity.f303h.mo105b();
    }

    /* renamed from: f */
    public static void m1488f() {
    }

    /* renamed from: g */
    public static void m1489g() {
    }

    /* renamed from: h */
    public static long m1490h() {
        return System.currentTimeMillis();
    }

    /* renamed from: i */
    public static void m1491i() {
        C0163j jVar = MainActivity.f318w;
        if (jVar != null) {
            jVar.mo803c();
            MainActivity.f303h.mo107g();
        }
    }

    /* renamed from: j */
    public static C0016l m1492j(String str) {
        C0171g d = C0018n.m89d(str, C0018n.f219a);
        C0143b bVar = d.f2844a;
        if (bVar == null) {
            return null;
        }
        int e = bVar.mo716e() / d.f2847d;
        if (e < 1) {
            e = 1;
        }
        C0143b bVar2 = d.f2844a;
        return new C0016l(bVar2, bVar2.mo719i(), e);
    }

    /* renamed from: k */
    public static void m1493k() {
        while (C0103b.f1145e) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: l */
    public static C0143b m1494l(String str) {
        try {
            return C0168d.m1531a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static C0143b m1495m(String str) {
        try {
            return C0143b.m1321a("/x" + C0159f.f2750b + str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static C0143b m1496n(String str) {
        String str2 = "/x" + C0159f.f2750b + str;
        C0111c0.m584k("path load rms= " + str);
        C0143b a = C0168d.m1531a(str);
        if (a != null) {
            return a;
        }
        String[] q = C0111c0.m590q(C0111c0.m590q(str2, ".", 0)[0], "/", 0);
        byte[] c = C0149b.m1398c("x" + C0159f.f2750b + q[q.length - 1]);
        return c != null ? C0143b.m1322b(c, 0, c.length) : a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r6 > r0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r6 > r0) goto L_0x0030;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1497o(boolean r6) {
        /*
            k.n r0 = p018i.C0145a.f2625c0
            g.e0 r1 = p013g.C0115e0.f1661m
            boolean r0 = r0.equals(r1)
            r1 = 8885(0x22b5, float:1.245E-41)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x005b
            boolean[] r6 = p013g.C0113d0.f1357o
            if (r6 == 0) goto L_0x0055
            boolean r0 = r6[r3]
            java.lang.String r5 = "svselect"
            if (r0 != 0) goto L_0x0039
            r6[r3] = r4
            p013g.C0113d0.f1343D = r3
            java.lang.String[] r6 = p013g.C0113d0.f1355m
            int r0 = p013g.C0113d0.f1343D
            r6 = r6[r0]
            p018i.C0146b.f2673a = r6
            int r6 = p013g.C0113d0.f1343D
            p019j.C0149b.m1403h(r5, r6)
            int r6 = p013g.C0113d0.f1343D
            byte r0 = p013g.C0113d0.f1356n
            if (r6 <= r0) goto L_0x0035
        L_0x0030:
            p013g.C0113d0.f1343D = r0
            p019j.C0149b.m1403h(r5, r0)
        L_0x0035:
            p018i.C0145a.m1360o()
            goto L_0x005a
        L_0x0039:
            boolean r0 = r6[r4]
            if (r0 != 0) goto L_0x0055
            r6[r4] = r4
            p013g.C0113d0.f1343D = r4
            java.lang.String[] r6 = p013g.C0113d0.f1355m
            int r0 = p013g.C0113d0.f1343D
            r6 = r6[r0]
            p018i.C0146b.f2673a = r6
            int r6 = p013g.C0113d0.f1343D
            p019j.C0149b.m1403h(r5, r6)
            int r6 = p013g.C0113d0.f1343D
            byte r0 = p013g.C0113d0.f1356n
            if (r6 <= r0) goto L_0x0035
            goto L_0x0030
        L_0x0055:
            java.lang.String r6 = p011e.C0057d1.f745v0
            p018i.C0145a.m1348W(r6, r1, r2)
        L_0x005a:
            return
        L_0x005b:
            if (r6 == 0) goto L_0x0062
            j.c r6 = p019j.C0150c.m1414n()
            goto L_0x0066
        L_0x0062:
            j.c r6 = p019j.C0150c.m1415o()
        L_0x0066:
            r6.mo743j()
            p013g.C0113d0.f1360r = r3
            boolean r6 = p012f.C0103b.f1144d
            if (r6 == 0) goto L_0x0075
            java.lang.String r6 = p011e.C0057d1.f745v0
            p018i.C0145a.m1348W(r6, r1, r2)
            return
        L_0x0075:
            p018i.C0145a.f2634g1 = r4
            p020k.C0170f.f2805J = r3
            k.f r6 = p018i.C0145a.f2633g0
            if (r6 == 0) goto L_0x0083
            i.a r6 = p018i.C0145a.f2572A
            r6.mo726S()
            goto L_0x00a3
        L_0x0083:
            k.f r6 = new k.f
            r6.<init>()
            p018i.C0145a.f2633g0 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = p011e.C0057d1.f752w0
            r6.append(r0)
            java.lang.String r0 = p020k.C0170f.f2811P
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 888395(0xd8e4b, float:1.244907E-39)
            p018i.C0145a.m1348W(r6, r0, r2)
        L_0x00a3:
            m1491i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p019j.C0161h.m1497o(boolean):void");
    }

    /* renamed from: p */
    public static void m1498p(boolean z) {
        C0145a.f2634g1 = true;
        (z ? C0150c.m1414n() : C0150c.m1415o()).mo743j();
        if (C0103b.f1144d) {
            C0145a.m1348W(C0057d1.f745v0, 8885, (Object) null);
            return;
        }
        C0145a.m1349X(C0057d1.f716r);
        C0145a.f2572A.mo726S();
        m1491i();
    }

    /* renamed from: q */
    public static void m1499q(C0159f fVar) {
        C0177m mVar;
        String str;
        int i;
        int i2;
        int i3;
        C0177m mVar2;
        C0177m mVar3;
        String str2;
        int i4;
        int i5;
        C0177m mVar4;
        String str3;
        int i6;
        int i7;
        int i8;
        C0177m mVar5;
        C0177m mVar6;
        String str4;
        int i9;
        int i10;
        for (int i11 = 0; i11 < 5; i11++) {
            if (C0126k.f1903Q4[i11] != -1 && C0145a.m1334D(C0126k.f1883L4[i11], C0126k.f1887M4[i11])) {
                int[] iArr = C0126k.f1907R4;
                if (iArr[i11] == 0) {
                    mVar3 = C0177m.f2932I;
                    str2 = C0126k.f1879K4[i11];
                    i4 = C0126k.f1883L4[i11];
                    i5 = C0126k.f1887M4[i11];
                } else {
                    if (iArr[i11] == 1) {
                        mVar6 = C0177m.f2933J;
                        str4 = C0126k.f1879K4[i11];
                        i9 = C0126k.f1883L4[i11];
                        i10 = C0126k.f1887M4[i11];
                    } else if (iArr[i11] == 2) {
                        mVar6 = C0177m.f2934K;
                        str4 = C0126k.f1879K4[i11];
                        i9 = C0126k.f1883L4[i11];
                        i10 = C0126k.f1887M4[i11];
                    } else {
                        if (iArr[i11] == 3) {
                            mVar4 = C0177m.f2933J;
                            str3 = C0126k.f1879K4[i11];
                            i6 = C0126k.f1883L4[i11];
                            i7 = C0126k.f1887M4[i11];
                            i8 = 2;
                            mVar5 = C0177m.f2934K;
                        } else if (iArr[i11] == 8) {
                            mVar4 = C0177m.f2928E;
                            str3 = C0126k.f1879K4[i11];
                            i6 = C0126k.f1883L4[i11];
                            i7 = C0126k.f1887M4[i11];
                            i8 = 2;
                            mVar5 = C0177m.f2951s;
                        } else if (iArr[i11] == 4) {
                            mVar4 = C0177m.f2929F;
                            str3 = C0126k.f1879K4[i11];
                            i6 = C0126k.f1883L4[i11];
                            i7 = C0126k.f1887M4[i11];
                            i8 = 2;
                            mVar5 = C0177m.f2925B;
                        } else if (iArr[i11] == 5) {
                            mVar3 = C0177m.f2935L;
                            str2 = C0126k.f1879K4[i11];
                            i4 = C0126k.f1883L4[i11];
                            i5 = C0126k.f1887M4[i11];
                        } else {
                            if (iArr[i11] == 6) {
                                mVar = C0177m.f2933J;
                                str = C0126k.f1879K4[i11];
                                i = C0126k.f1883L4[i11];
                                i2 = C0126k.f1887M4[i11];
                                i3 = 2;
                                mVar2 = C0177m.f2932I;
                            } else {
                                if (iArr[i11] == 7) {
                                    mVar = C0177m.f2948p;
                                    str = C0126k.f1879K4[i11];
                                    i = C0126k.f1883L4[i11];
                                    i2 = C0126k.f1887M4[i11];
                                } else if (iArr[i11] == 9) {
                                    mVar = C0177m.f2926C;
                                    str = C0126k.f1879K4[i11];
                                    i = C0126k.f1883L4[i11];
                                    i2 = C0126k.f1887M4[i11];
                                } else if (iArr[i11] == 10) {
                                    C0177m.f2957y.mo912d(fVar, C0126k.f1879K4[i11], C0126k.f1883L4[i11], C0126k.f1887M4[i11], 2, C0177m.f2951s);
                                }
                                i3 = 2;
                                mVar2 = C0177m.f2951s;
                            }
                            mVar.mo912d(fVar, str, i, i2, i3, mVar2);
                        }
                        mVar4.mo912d(fVar, str3, i6, i7, i8, mVar5);
                    }
                    mVar6.mo911c(fVar, str4, i9, i10, 2);
                }
                mVar3.mo911c(fVar, str2, i4, i5, 2);
            }
        }
    }

    /* renamed from: r */
    public static void m1500r(C0159f fVar, int i, int i2, int i3, int i4) {
        fVar.mo784m(i, i2, i3 + 10, i4, 0, 90);
    }

    /* renamed from: s */
    public static void m1501s() {
    }
}
