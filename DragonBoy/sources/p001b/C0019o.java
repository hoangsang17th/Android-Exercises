package p001b;

import java.util.Random;
import p011e.C0058e;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0126k;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;

/* renamed from: b.o */
public class C0019o extends C0008d {

    /* renamed from: A */
    public static final byte[] f220A = {0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};

    /* renamed from: x */
    public static Random f221x = new Random(System.currentTimeMillis());

    /* renamed from: y */
    public static final int[] f222y = {0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};

    /* renamed from: z */
    public static final int[] f223z = {0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};

    /* renamed from: g */
    public int f224g;

    /* renamed from: h */
    C0058e f225h;

    /* renamed from: i */
    public int f226i;

    /* renamed from: j */
    public int f227j;

    /* renamed from: k */
    public int f228k;

    /* renamed from: l */
    public int f229l;

    /* renamed from: m */
    public int f230m;

    /* renamed from: n */
    public int f231n;

    /* renamed from: o */
    public int f232o;

    /* renamed from: p */
    int f233p;

    /* renamed from: q */
    public boolean f234q = false;

    /* renamed from: r */
    public int f235r;

    /* renamed from: s */
    public int f236s;

    /* renamed from: t */
    public C0114e f237t;

    /* renamed from: u */
    public C0173i f238u = new C0173i("vDarts");

    /* renamed from: v */
    int f239v = 0;

    /* renamed from: w */
    int f240w = 0;

    public C0019o(int i, int i2, boolean z, int i3, int i4, C0114e eVar, int i5) {
        C0058e eVar2 = C0126k.f1880L1[i5];
        this.f225h = eVar2;
        this.f229l = i;
        this.f230m = i2;
        this.f235r = i3;
        this.f236s = i4;
        this.f237t = eVar;
        this.f224g = eVar2.f788j;
        mo36f(C0111c0.m575b(eVar.f1593n - i, eVar.f1598o - i2));
        int i6 = C0126k.f2028t1;
        if (i >= i6 && i <= i6 + C0145a.f2614V) {
            C0175k.m1563p().mo850A(i5);
        }
    }

    /* renamed from: c */
    public static void m91c(int i, int i2, boolean z, int i3, int i4, C0114e eVar, int i5) {
        C0008d.f124b.addElement(new C0019o(i, i2, z, i3, i4, eVar, i5));
    }

    /* renamed from: d */
    public static int m92d(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f222y;
            if (i2 >= iArr.length - 1) {
                return 0;
            }
            if (i < iArr[i2] || i > iArr[i2 + 1]) {
                i2++;
            } else if (i2 >= 16) {
                return 0;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: a */
    public void mo12a(C0159f fVar) {
        int d = m92d(360 - this.f226i);
        byte b = f220A[d];
        int i = f223z[d];
        for (int size = this.f238u.size() / 2; size < this.f238u.size(); size++) {
            C0021q qVar = (C0021q) this.f238u.elementAt(size);
            C0174j.m1555c(fVar, this.f225h.f783e[qVar.f252a], qVar.f253b, qVar.f254c, 0, 3);
        }
        int i2 = C0145a.f2600O;
        short[][] sArr = this.f225h.f781c;
        int length = i2 % sArr.length;
        C0174j.m1555c(fVar, sArr[length][b], this.f229l, this.f230m, i, 3);
        for (int i3 = 0; i3 < this.f238u.size(); i3++) {
            C0021q qVar2 = (C0021q) this.f238u.elementAt(i3);
            C0174j.m1555c(fVar, this.f225h.f782d[qVar2.f252a], qVar2.f253b, qVar2.f254c, 0, 3);
        }
        C0174j.m1555c(fVar, this.f225h.f780b[length][b], this.f229l, this.f230m, i, 3);
        for (int i4 = 0; i4 < this.f238u.size(); i4++) {
            C0021q qVar3 = (C0021q) this.f238u.elementAt(i4);
            int a = C0111c0.m574a(f221x.nextInt(100));
            C0058e eVar = this.f225h;
            if (a < eVar.f786h) {
                C0174j.m1555c(fVar, C0145a.f2600O % 2 == 0 ? eVar.f784f[qVar3.f252a] : eVar.f785g[qVar3.f252a], qVar3.f253b, qVar3.f254c, 0, 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (((r3 * r3) + (r4 * r4)) > 4096) goto L_0x00e0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13b() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            e.e r2 = r10.f225h
            short r3 = r2.f787i
            r4 = 1
            if (r1 >= r3) goto L_0x015a
            short[] r2 = r2.f782d
            int r2 = r2.length
            if (r2 <= 0) goto L_0x001c
            k.i r2 = r10.f238u
            b.q r3 = new b.q
            int r5 = r10.f229l
            int r6 = r10.f230m
            r3.<init>(r5, r6)
            r2.addElement(r3)
        L_0x001c:
            g.e r2 = r10.f237t
            if (r2 == 0) goto L_0x0023
            int r3 = r2.f1593n
            goto L_0x0025
        L_0x0023:
            int r3 = r10.f231n
        L_0x0025:
            int r5 = r10.f229l
            int r3 = r3 - r5
            r10.f239v = r3
            if (r2 == 0) goto L_0x002f
            int r6 = r2.f1598o
            goto L_0x0031
        L_0x002f:
            int r6 = r10.f232o
        L_0x0031:
            int r6 = r6 + -10
            int r7 = r10.f230m
            int r6 = r6 - r7
            r10.f240w = r6
            r6 = 60
            int r8 = p013g.C0121h0.f1803v
            if (r8 != 0) goto L_0x0040
            r6 = 600(0x258, float:8.41E-43)
        L_0x0040:
            int r8 = r10.f233p
            int r8 = r8 + r4
            r10.f233p = r8
            if (r2 == 0) goto L_0x0050
            int r8 = r2.f1628u
            r9 = 5
            if (r8 == r9) goto L_0x0052
            r9 = 14
            if (r8 == r9) goto L_0x0052
        L_0x0050:
            if (r2 != 0) goto L_0x006c
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            int r8 = r2.f1593n
            goto L_0x0059
        L_0x0057:
            int r8 = r10.f231n
        L_0x0059:
            int r8 = r8 - r5
            int r8 = r8 / 2
            int r5 = r5 + r8
            r10.f229l = r5
            if (r2 == 0) goto L_0x0064
            int r2 = r2.f1598o
            goto L_0x0066
        L_0x0064:
            int r2 = r10.f232o
        L_0x0066:
            int r2 = r2 - r7
            int r2 = r2 / 2
            int r7 = r7 + r2
            r10.f230m = r7
        L_0x006c:
            int r2 = p013g.C0111c0.m574a(r3)
            r3 = 16
            if (r2 >= r3) goto L_0x007c
            int r2 = r10.f240w
            int r2 = p013g.C0111c0.m574a(r2)
            if (r2 < r3) goto L_0x0080
        L_0x007c:
            int r2 = r10.f233p
            if (r2 <= r6) goto L_0x00bf
        L_0x0080:
            g.e r1 = r10.f237t
            r2 = -100
            if (r1 == 0) goto L_0x009c
            int r3 = r1.f1638w
            if (r3 < 0) goto L_0x009c
            int r3 = r10.f236s
            r5 = -1
            if (r3 == r5) goto L_0x009c
            if (r3 == r2) goto L_0x0097
            int r5 = r10.f235r
            r1.mo467z(r5, r3, r0, r4)
            goto L_0x009c
        L_0x0097:
            r0 = 80
            p001b.C0020p.m98f(r0, r1, r4)
        L_0x009c:
            k.i r0 = p001b.C0008d.f124b
            r0.removeElement(r10)
            int r0 = r10.f236s
            if (r0 == r2) goto L_0x00be
            r0 = 81
            g.e r1 = r10.f237t
            p001b.C0020p.m98f(r0, r1, r4)
            int r0 = r10.f229l
            int r1 = p013g.C0126k.f2028t1
            if (r0 < r1) goto L_0x00be
            int r2 = p018i.C0145a.f2614V
            int r1 = r1 + r2
            if (r0 > r1) goto L_0x00be
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo885o()
        L_0x00be:
            return
        L_0x00bf:
            int r2 = r10.f239v
            int r3 = r10.f240w
            int r2 = p013g.C0111c0.m575b(r2, r3)
            int r3 = r10.f226i
            int r3 = r2 - r3
            int r3 = java.lang.Math.abs(r3)
            r4 = 90
            if (r3 < r4) goto L_0x00e0
            int r3 = r10.f239v
            int r3 = r3 * r3
            int r4 = r10.f240w
            int r4 = r4 * r4
            int r3 = r3 + r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 <= r4) goto L_0x010a
        L_0x00e0:
            int r3 = r10.f226i
            int r3 = r2 - r3
            int r3 = java.lang.Math.abs(r3)
            r4 = 15
            if (r3 >= r4) goto L_0x00ef
        L_0x00ec:
            r10.f226i = r2
            goto L_0x010a
        L_0x00ef:
            int r3 = r10.f226i
            int r4 = r2 - r3
            if (r4 < 0) goto L_0x00fb
            int r4 = r2 - r3
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 < r5) goto L_0x0100
        L_0x00fb:
            int r2 = r2 - r3
            r4 = -180(0xffffffffffffff4c, float:NaN)
            if (r2 >= r4) goto L_0x0107
        L_0x0100:
            int r3 = r3 + 15
        L_0x0102:
            int r2 = p013g.C0111c0.m579f(r3)
            goto L_0x00ec
        L_0x0107:
            int r3 = r3 + -15
            goto L_0x0102
        L_0x010a:
            boolean r2 = r10.f234q
            if (r2 != 0) goto L_0x0118
            int r2 = r10.f224g
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 >= r3) goto L_0x0118
            int r2 = r2 + 1024
            r10.f224g = r2
        L_0x0118:
            int r2 = r10.f224g
            int r3 = r10.f226i
            int r3 = p013g.C0111c0.m578e(r3)
            int r2 = r2 * r3
            int r2 = r2 >> 10
            r10.f227j = r2
            int r2 = r10.f224g
            int r3 = r10.f226i
            int r3 = p013g.C0111c0.m589p(r3)
            int r2 = r2 * r3
            int r2 = r2 >> 10
            r10.f228k = r2
            int r3 = r10.f239v
            int r4 = r10.f227j
            int r3 = r3 + r4
            r10.f239v = r3
            int r4 = r3 >> 10
            int r5 = r10.f229l
            int r5 = r5 + r4
            r10.f229l = r5
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r10.f239v = r3
            int r3 = r10.f240w
            int r3 = r3 + r2
            r10.f240w = r3
            int r2 = r3 >> 10
            int r4 = r10.f230m
            int r4 = r4 + r2
            r10.f230m = r4
            r2 = r3 & 1023(0x3ff, float:1.434E-42)
            r10.f240w = r2
            int r1 = r1 + 1
            goto L_0x0002
        L_0x015a:
            k.i r1 = r10.f238u
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x017e
            k.i r1 = r10.f238u
            java.lang.Object r1 = r1.elementAt(r0)
            b.q r1 = (p001b.C0021q) r1
            int r2 = r1.f252a
            int r2 = r2 + r4
            r1.f252a = r2
            e.e r1 = r10.f225h
            short[] r1 = r1.f782d
            int r1 = r1.length
            if (r2 < r1) goto L_0x017b
            k.i r1 = r10.f238u
            r1.removeElementAt(r0)
        L_0x017b:
            int r0 = r0 + 1
            goto L_0x015a
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0019o.mo13b():void");
    }

    /* renamed from: f */
    public void mo36f(int i) {
        this.f226i = i;
        this.f227j = (this.f224g * C0111c0.m578e(i)) >> 10;
        this.f228k = (this.f224g * C0111c0.m589p(i)) >> 10;
    }
}
