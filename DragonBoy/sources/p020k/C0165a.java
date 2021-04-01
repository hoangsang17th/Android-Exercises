package p020k;

import p013g.C0111c0;
import p013g.C0121h0;
import p014h.p015a.p016a.C0143b;
import p019j.C0149b;
import p019j.C0159f;

/* renamed from: k.a */
public class C0165a {

    /* renamed from: m */
    public static C0172h f2769m = new C0172h("imgNew");

    /* renamed from: n */
    public static C0173i f2770n = new C0173i("vKeyNew");

    /* renamed from: o */
    public static C0173i f2771o = new C0173i("vKeyLast");

    /* renamed from: p */
    public static int[] f2772p = {79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 95, 144, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 132, 133, 134, 139, 140, 141, 142, 143, 144, 145, 146, 147, 171, 175, 176, 121, 122, 229, 218};

    /* renamed from: q */
    public static int[] f2773q = {79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};

    /* renamed from: r */
    public static byte[] f2774r;

    /* renamed from: a */
    public int f2775a;

    /* renamed from: b */
    public int f2776b;

    /* renamed from: c */
    public short f2777c;

    /* renamed from: d */
    public int f2778d;

    /* renamed from: e */
    public int f2779e;

    /* renamed from: f */
    public int f2780f;

    /* renamed from: g */
    public int f2781g;

    /* renamed from: h */
    public byte f2782h;

    /* renamed from: i */
    public int[] f2783i;

    /* renamed from: j */
    public int[] f2784j;

    /* renamed from: k */
    public int f2785k = 0;

    /* renamed from: l */
    public int f2786l = 0;

    /* renamed from: b */
    public static void m1513b() {
    }

    /* renamed from: c */
    public static boolean m1514c(String str) {
        for (int i = 0; i < f2770n.size(); i++) {
            if (((String) f2770n.elementAt(i)).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo816a() {
        byte b;
        String str;
        C0172h hVar;
        C0143b bVar;
        if (!mo818e() && (b = this.f2782h) != 2 && b != 4) {
            if (!f2769m.containsKey(this.f2777c + "blend" + this.f2782h)) {
                C0143b bVar2 = (C0143b) f2769m.get(this.f2777c + "");
                if (bVar2 != null && bVar2.mo718h() > 4) {
                    byte[] c = C0149b.m1398c("x" + C0159f.f2750b + "blend" + this.f2777c + "layer" + this.f2782h);
                    StringBuilder sb = new StringBuilder();
                    sb.append("str load = ");
                    sb.append("blend");
                    sb.append(this.f2777c);
                    sb.append("layer");
                    sb.append(this.f2782h);
                    C0111c0.m584k(sb.toString());
                    if (c == null) {
                        hVar = f2769m;
                        str = this.f2777c + "blend" + this.f2782h;
                        bVar = C0166b.m1519a(bVar2, this.f2782h, this.f2777c);
                    } else {
                        bVar = C0143b.m1322b(c, 0, c.length);
                        C0111c0.m584k("load image lent = " + c.length + "img width= " + bVar.mo718h());
                        hVar = f2769m;
                        str = this.f2777c + "blend" + this.f2782h;
                    }
                    hVar.put(str, bVar);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo817d() {
        int i = 0;
        while (true) {
            int[] iArr = f2773q;
            if (i >= iArr.length) {
                return false;
            }
            if (this.f2777c == iArr[i]) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: e */
    public boolean mo818e() {
        if (C0159f.f2750b == 1 || C0121h0.m825e()) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = f2772p;
            if (i >= iArr.length) {
                return false;
            }
            if (this.f2777c == iArr[i]) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo819f(p019j.C0159f r21) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            short r1 = r0.f2777c
            r2 = 279(0x117, float:3.91E-43)
            if (r1 != r2) goto L_0x0015
            g.k r1 = p013g.C0126k.m893c0()
            int r1 = r1.f2111b1
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 < r2) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = p013g.C0114e.f1394y4
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            int r12 = p013g.C0126k.f2028t1
            int r13 = p013g.C0126k.f2032u1
            byte r1 = r0.f2782h
            java.lang.String r2 = ""
            r3 = 4
            r14 = 2
            if (r1 == r14) goto L_0x0052
            if (r1 != r3) goto L_0x0029
            goto L_0x0052
        L_0x0029:
            boolean r1 = r20.mo818e()
            if (r1 != 0) goto L_0x004a
            k.h r1 = f2769m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short r4 = r0.f2777c
            r2.append(r4)
            java.lang.String r4 = "blend"
            r2.append(r4)
            byte r4 = r0.f2782h
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x0065
        L_0x004a:
            k.h r1 = f2769m
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0059
        L_0x0052:
            k.h r1 = f2769m
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0059:
            short r5 = r0.f2777c
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x0065:
            java.lang.Object r1 = r1.get(r2)
            h.a.a.b r1 = (p014h.p015a.p016a.C0143b) r1
            r15 = r1
            if (r15 == 0) goto L_0x021a
            short r1 = r0.f2777c
            r2 = 96
            if (r1 != r2) goto L_0x0075
            return
        L_0x0075:
            byte r2 = r0.f2782h
            if (r2 != r3) goto L_0x007f
            int r4 = -r12
            int r4 = r4 / r14
            int r4 = r4 + 100
            r0.f2785k = r4
        L_0x007f:
            r4 = 28
            r5 = 3
            if (r1 != r4) goto L_0x008c
            if (r2 != r5) goto L_0x008c
            int r4 = -r12
            int r4 = r4 / r5
            int r4 = r4 + 200
            r0.f2785k = r4
        L_0x008c:
            r4 = 67
            if (r1 == r4) goto L_0x009c
            r4 = 68
            if (r1 == r4) goto L_0x009c
            r4 = 69
            if (r1 == r4) goto L_0x009c
            r4 = 70
            if (r1 != r4) goto L_0x00a4
        L_0x009c:
            if (r2 != r5) goto L_0x00a4
            int r1 = -r12
            int r1 = r1 / r5
            int r1 = r1 + 200
            r0.f2785k = r1
        L_0x00a4:
            boolean r1 = r20.mo817d()
            if (r1 == 0) goto L_0x00bb
            byte r1 = r0.f2782h
            if (r1 >= r3) goto L_0x00bb
            int r1 = r12 >> 4
            int r1 = -r1
            int r1 = r1 + 50
            r0.f2785k = r1
            int r1 = r13 >> 5
            int r1 = r1 + -15
            r0.f2786l = r1
        L_0x00bb:
            int r1 = r0.f2778d
            int r2 = r0.f2780f
            int r3 = r1 + r2
            int r4 = r0.f2785k
            int r10 = r3 + r4
            int r3 = r0.f2779e
            int r4 = r0.f2781g
            int r3 = r3 + r4
            int r4 = r0.f2786l
            int r16 = r3 + r4
            int r1 = r1 + r2
            int r2 = r15.mo718h()
            int r1 = r1 + r2
            int r2 = r0.f2785k
            int r1 = r1 + r2
            if (r1 < r12) goto L_0x017c
            int r1 = r0.f2778d
            int r3 = r0.f2780f
            int r1 = r1 + r3
            int r1 = r1 + r2
            int r2 = p018i.C0145a.f2614V
            int r2 = r2 + r12
            if (r1 > r2) goto L_0x017c
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r1 = r1 + r2
            int r2 = r15.mo715d()
            int r1 = r1 + r2
            if (r1 < r13) goto L_0x017c
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r1 = r1 + r2
            int r2 = p018i.C0145a.f2616W
            int r2 = r2 + r13
            if (r1 > r2) goto L_0x017c
            r3 = 0
            r4 = 0
            int r5 = p019j.C0159f.m1451u(r15)
            int r6 = p019j.C0159f.m1450t(r15)
            int r7 = r0.f2776b
            int r1 = r0.f2778d
            int r2 = r0.f2780f
            int r1 = r1 + r2
            int r2 = r0.f2785k
            int r8 = r1 + r2
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r9 = r1 + r2
            r17 = 0
            r1 = r21
            r2 = r15
            r14 = r10
            r10 = r17
            r1.mo779h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            short r1 = r0.f2777c
            r2 = 11
            if (r1 != r2) goto L_0x017c
            int r10 = r16 + 24
            r1 = 48
            r2 = 14
            r11.mo771C(r14, r10, r1, r2)
            r21.mo770B()
            r11.mo774a(r14, r10, r1, r2)
            r1 = 0
            r8 = 2
            r9 = 0
        L_0x0141:
            if (r9 >= r8) goto L_0x016e
            h.a.a.b r2 = p013g.C0121h0.f1793l
            r3 = 0
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 8
            int r1 = r1 >> r8
            int r4 = r1 * 24
            r5 = 24
            r6 = 24
            r7 = 0
            int r1 = r9 * 24
            int r16 = r14 + r1
            r17 = 0
            r1 = r21
            r18 = 2
            r8 = r16
            r16 = r9
            r9 = r10
            r19 = r10
            r10 = r17
            r1.mo779h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r9 = r16 + 1
            r10 = r19
            r8 = 2
            goto L_0x0141
        L_0x016e:
            r21.mo769A()
            int r1 = p013g.C0126k.f2028t1
            int r2 = p013g.C0126k.f2032u1
            int r3 = p013g.C0126k.f1975i1
            int r4 = p013g.C0126k.f1980j1
            r11.mo771C(r1, r2, r3, r4)
        L_0x017c:
            boolean r1 = p013g.C0121h0.m823c()
            if (r1 == 0) goto L_0x021a
            short r1 = r0.f2777c
            r2 = 137(0x89, float:1.92E-43)
            if (r1 <= r2) goto L_0x021a
            r2 = 156(0x9c, float:2.19E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 159(0x9f, float:2.23E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 157(0x9d, float:2.2E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 165(0xa5, float:2.31E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 167(0xa7, float:2.34E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 168(0xa8, float:2.35E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 169(0xa9, float:2.37E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 170(0xaa, float:2.38E-43)
            if (r1 == r2) goto L_0x021a
            r2 = 238(0xee, float:3.34E-43)
            if (r1 == r2) goto L_0x021a
            int r1 = p013g.C0121h0.f1784c
            int r2 = r0.f2778d
            int r3 = r0.f2780f
            int r4 = r2 + r3
            int r5 = r0.f2785k
            int r4 = r4 + r5
            int r4 = r1 - r4
            if (r4 < r12) goto L_0x021a
            int r2 = r2 + r3
            int r2 = r2 + r5
            int r3 = r15.mo718h()
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = p018i.C0145a.f2614V
            int r12 = r12 + r2
            if (r1 > r12) goto L_0x021a
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r1 = r1 + r2
            int r2 = r15.mo715d()
            int r1 = r1 + r2
            if (r1 < r13) goto L_0x021a
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r1 = r1 + r2
            int r2 = p018i.C0145a.f2616W
            int r13 = r13 + r2
            if (r1 > r13) goto L_0x021a
            short r1 = r0.f2777c
            r2 = 241(0xf1, float:3.38E-43)
            if (r1 < r2) goto L_0x01ee
            r2 = 266(0x10a, float:3.73E-43)
            if (r1 < r2) goto L_0x021a
        L_0x01ee:
            r3 = 0
            r4 = 0
            int r5 = p019j.C0159f.m1451u(r15)
            int r6 = p019j.C0159f.m1450t(r15)
            r7 = 2
            int r1 = p013g.C0121h0.f1784c
            int r2 = r0.f2778d
            int r8 = r0.f2780f
            int r2 = r2 + r8
            int r8 = r0.f2785k
            int r2 = r2 + r8
            int r1 = r1 - r2
            int r2 = p019j.C0159f.m1451u(r15)
            int r8 = r1 - r2
            int r1 = r0.f2779e
            int r2 = r0.f2781g
            int r1 = r1 + r2
            int r2 = r0.f2786l
            int r9 = r1 + r2
            r10 = 0
            r1 = r21
            r2 = r15
            r1.mo779h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0165a.mo819f(j.f):void");
    }
}
