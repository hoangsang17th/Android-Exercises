package p020k;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.reflect.Array;
import p011e.C0089t0;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0149b;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: k.j */
public class C0174j {

    /* renamed from: a */
    public static int[][] f2848a;

    /* renamed from: b */
    public static C0143b[] f2849b;

    /* renamed from: c */
    public static C0089t0[] f2850c;

    /* renamed from: d */
    public static C0173i f2851d = new C0173i("vKeys");

    /* renamed from: e */
    public static C0143b f2852e = null;

    /* renamed from: f */
    public static byte[] f2853f;

    /* renamed from: g */
    public static short f2854g;

    public C0174j() {
        mo849i();
    }

    /* renamed from: a */
    public static void m1553a() {
        f2851d.removeAllElements();
        f2850c = new C0089t0[f2854g];
    }

    /* renamed from: b */
    public static void m1554b(int i) {
        boolean z = true;
        if (C0159f.f2750b == 1) {
            C0143b l = C0161h.m1494l("/SmallImage/Small" + i + ".png");
            if (l != null) {
                f2850c[i] = new C0089t0(l, i);
                return;
            }
            f2850c[i] = new C0089t0(f2852e, i);
        } else {
            C0143b l2 = C0161h.m1494l("/SmallImage/Small" + i + ".png");
            if (l2 != null) {
                f2850c[i] = new C0089t0(l2, i);
                return;
            }
            byte[] c = C0149b.m1398c(C0159f.f2750b + "Small" + i);
            if (c != null) {
                byte[] bArr = f2853f;
                boolean z2 = (bArr == null || c.length % 127 == bArr[i]) ? false : true;
                if (!z2) {
                    C0143b b = C0143b.m1322b(c, 0, c.length);
                    if (b != null) {
                        f2850c[i] = new C0089t0(b, i);
                    }
                }
                z = z2;
            }
            if (z) {
                f2850c[i] = new C0089t0(f2852e, i);
            } else {
                return;
            }
        }
        C0105d.m365M().mo318z0(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        if (r2 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        if (r2 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        r2.mo188a(r18, r22, r20, r21, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1555c(p019j.C0159f r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r0 = r19
            h.a.a.b[] r1 = f2849b
            if (r1 != 0) goto L_0x002c
            e.t0[] r1 = f2850c
            r1 = r1[r0]
            if (r1 != 0) goto L_0x0010
            m1554b(r19)
            goto L_0x002b
        L_0x0010:
            h.a.a.b r3 = r1.f1037a
            r4 = 0
            r5 = 0
            int r6 = p019j.C0159f.m1451u(r3)
            h.a.a.b r0 = r1.f1037a
            int r7 = p019j.C0159f.m1450t(r0)
            r2 = r18
            r8 = r22
            r9 = r20
            r10 = r21
            r11 = r23
            r2.mo779h(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x002b:
            return
        L_0x002c:
            int[][] r2 = f2848a
            if (r2 == 0) goto L_0x00bc
            int r3 = r2.length
            if (r0 >= r3) goto L_0x00b5
            r3 = r2[r0]
            r4 = 1
            r3 = r3[r4]
            r2 = r2[r0]
            r5 = 0
            r2 = r2[r5]
            r1 = r1[r2]
            int r1 = p019j.C0159f.m1451u(r1)
            if (r3 >= r1) goto L_0x00b5
            int[][] r1 = f2848a
            r2 = r1[r0]
            r3 = 3
            r2 = r2[r3]
            h.a.a.b[] r6 = f2849b
            r1 = r1[r0]
            r1 = r1[r5]
            r1 = r6[r1]
            int r1 = p019j.C0159f.m1451u(r1)
            if (r2 >= r1) goto L_0x00b5
            int[][] r1 = f2848a
            r2 = r1[r0]
            r6 = 2
            r2 = r2[r6]
            h.a.a.b[] r7 = f2849b
            r1 = r1[r0]
            r1 = r1[r5]
            r1 = r7[r1]
            int r1 = p019j.C0159f.m1450t(r1)
            if (r2 >= r1) goto L_0x00b5
            int[][] r1 = f2848a
            r2 = r1[r0]
            r7 = 4
            r2 = r2[r7]
            h.a.a.b[] r8 = f2849b
            r1 = r1[r0]
            r1 = r1[r5]
            r1 = r8[r1]
            int r1 = p019j.C0159f.m1450t(r1)
            if (r2 < r1) goto L_0x0085
            goto L_0x00b5
        L_0x0085:
            h.a.a.b[] r1 = f2849b
            int[][] r2 = f2848a
            r8 = r2[r0]
            r8 = r8[r5]
            r8 = r1[r8]
            if (r8 == 0) goto L_0x00db
            r8 = r2[r0]
            r5 = r8[r5]
            r9 = r1[r5]
            r1 = r2[r0]
            r10 = r1[r4]
            r1 = r2[r0]
            r11 = r1[r6]
            r1 = r2[r0]
            r12 = r1[r3]
            r0 = r2[r0]
            r13 = r0[r7]
            r8 = r18
            r14 = r22
            r15 = r20
            r16 = r21
            r17 = r23
            r8.mo779h(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00db
        L_0x00b5:
            e.t0[] r1 = f2850c
            r2 = r1[r0]
            if (r2 != 0) goto L_0x00ce
            goto L_0x00ca
        L_0x00bc:
            k.n r1 = p018i.C0145a.f2625c0
            g.k r2 = p013g.C0126k.m893c0()
            if (r1 == r2) goto L_0x00db
            e.t0[] r1 = f2850c
            r2 = r1[r0]
            if (r2 != 0) goto L_0x00ce
        L_0x00ca:
            m1554b(r19)
            goto L_0x00db
        L_0x00ce:
            r3 = r18
            r4 = r22
            r5 = r20
            r6 = r21
            r7 = r23
            r2.mo188a(r3, r4, r5, r6, r7)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0174j.m1555c(j.f, int, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        r1.mo189b(r10, r17, r12, r13, r14, r15, r16, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1556d(p019j.C0159f r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
            r0 = r11
            h.a.a.b[] r1 = f2849b
            if (r1 != 0) goto L_0x0022
            e.t0[] r1 = f2850c
            r1 = r1[r0]
            if (r1 != 0) goto L_0x000f
            m1554b(r11)
            goto L_0x0021
        L_0x000f:
            h.a.a.b r1 = r1.f1037a
            r2 = 0
            int r3 = r12 * r15
            r0 = r10
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r13
            r8 = r14
            r9 = r18
            r0.mo779h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0021:
            return
        L_0x0022:
            int[][] r2 = f2848a
            if (r2 == 0) goto L_0x0080
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0079
            r3 = r2[r0]
            if (r3 == 0) goto L_0x0079
            r3 = r2[r0]
            r4 = 1
            r3 = r3[r4]
            r4 = 256(0x100, float:3.59E-43)
            if (r3 >= r4) goto L_0x0079
            r3 = r2[r0]
            r5 = 3
            r3 = r3[r5]
            if (r3 >= r4) goto L_0x0079
            r3 = r2[r0]
            r5 = 2
            r3 = r3[r5]
            if (r3 >= r4) goto L_0x0079
            r3 = r2[r0]
            r5 = 4
            r3 = r3[r5]
            if (r3 < r4) goto L_0x004c
            goto L_0x0079
        L_0x004c:
            r3 = r2[r0]
            r4 = 0
            r3 = r3[r4]
            if (r3 == r5) goto L_0x0072
            r3 = r2[r0]
            r3 = r3[r4]
            r3 = r1[r3]
            if (r3 == 0) goto L_0x0072
            r0 = r2[r0]
            r0 = r0[r4]
            r1 = r1[r0]
            r2 = 0
            int r3 = r12 * r15
            r0 = r10
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r13
            r8 = r14
            r9 = r18
            r0.mo779h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a1
        L_0x0072:
            e.t0[] r1 = f2850c
            r1 = r1[r0]
            if (r1 != 0) goto L_0x0092
            goto L_0x008e
        L_0x0079:
            e.t0[] r1 = f2850c
            r1 = r1[r0]
            if (r1 != 0) goto L_0x0092
            goto L_0x008e
        L_0x0080:
            k.n r1 = p018i.C0145a.f2625c0
            g.k r2 = p013g.C0126k.m893c0()
            if (r1 == r2) goto L_0x00a1
            e.t0[] r1 = f2850c
            r1 = r1[r0]
            if (r1 != 0) goto L_0x0092
        L_0x008e:
            m1554b(r11)
            goto L_0x00a1
        L_0x0092:
            r0 = r1
            r1 = r10
            r2 = r17
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r18
            r0.mo189b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0174j.m1556d(j.f, int, int, int, int, int, int, int, int):void");
    }

    /* renamed from: e */
    public static void m1557e(C0159f fVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        m1555c(fVar, i, i2, i3, i4, i5);
    }

    /* renamed from: f */
    public static void m1558f() {
        new C0174j();
    }

    /* renamed from: g */
    public static void m1559g() {
        System.gc();
        f2852e = C0143b.m1323c(new int[]{-2013265920}, 1, 1, true);
    }

    /* renamed from: h */
    public static void m1560h() {
        if (f2849b == null) {
            f2849b = new C0143b[]{C0161h.m1496n("/img/Big0.png"), C0161h.m1496n("/img/Big1.png"), C0161h.m1496n("/img/Big2.png"), C0161h.m1496n("/img/Big3.png"), C0161h.m1496n("/img/Big4.png")};
            System.gc();
        }
    }

    /* renamed from: j */
    public static void m1561j() {
        int i = 0;
        if (C0145a.f2600O % 1000 == 0) {
            int i2 = 0;
            while (true) {
                C0089t0[] t0VarArr = f2850c;
                if (i >= t0VarArr.length) {
                    break;
                }
                if (t0VarArr[i] != null) {
                    i2++;
                    t0VarArr[i].mo192e();
                }
                i++;
            }
            i = i2;
        }
        if (i > 200 && C0145a.f2649s) {
            f2850c = new C0089t0[f2854g];
        }
    }

    /* renamed from: i */
    public void mo849i() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(C0149b.m1398c("NR_image")));
            int readShort = dataInputStream.readShort();
            int[] iArr = new int[2];
            iArr[1] = 5;
            iArr[0] = readShort;
            f2848a = (int[][]) Array.newInstance(int.class, iArr);
            for (int i = 0; i < readShort; i++) {
                f2848a[i][0] = dataInputStream.readUnsignedByte();
                f2848a[i][1] = dataInputStream.readShort();
                f2848a[i][2] = dataInputStream.readShort();
                f2848a[i][3] = dataInputStream.readShort();
                f2848a[i][4] = dataInputStream.readShort();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
