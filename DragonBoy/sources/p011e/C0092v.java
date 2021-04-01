package p011e;

import p012f.C0105d;
import p013g.C0114e;
import p013g.C0117f0;
import p013g.C0137v;
import p014h.p015a.p016a.C0142a;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0174j;
import p020k.C0177m;

/* renamed from: e.v */
public class C0092v extends C0050b0 implements C0072l {

    /* renamed from: h5 */
    public static C0143b f1049h5 = C0161h.m1494l("/mainImage/myTexture2dhatdau.png");

    /* renamed from: i5 */
    public static boolean f1050i5 = true;

    /* renamed from: M4 */
    public int f1051M4;

    /* renamed from: N4 */
    public int f1052N4;

    /* renamed from: O4 */
    public int f1053O4;

    /* renamed from: P4 */
    public int f1054P4;

    /* renamed from: Q4 */
    public int f1055Q4;

    /* renamed from: R4 */
    public int f1056R4;

    /* renamed from: S4 */
    public int f1057S4;

    /* renamed from: T4 */
    public String f1058T4;

    /* renamed from: U4 */
    public String f1059U4;

    /* renamed from: V4 */
    public int f1060V4;

    /* renamed from: W4 */
    public boolean f1061W4;

    /* renamed from: X4 */
    public int[] f1062X4;

    /* renamed from: Y4 */
    public int[] f1063Y4;

    /* renamed from: Z4 */
    public C0067i0 f1064Z4;

    /* renamed from: a5 */
    public boolean f1065a5;

    /* renamed from: b5 */
    public boolean f1066b5;

    /* renamed from: c5 */
    public int f1067c5;

    /* renamed from: d5 */
    public long f1068d5;

    /* renamed from: e5 */
    public long f1069e5;

    /* renamed from: f5 */
    boolean f1070f5;

    /* renamed from: g5 */
    int f1071g5 = 0;

    public C0092v(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        C0067i0 i0Var = new C0067i0("", 0, 0);
        this.f1064Z4 = i0Var;
        i0Var.f840k = new C0055d((String) null, (C0072l) this, 1, (Object) null);
        C0067i0.m240a(this.f1064Z4);
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1) {
            C0105d.m365M().mo280g0((byte) 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r11.f1067c5 == 0) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0114  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135f1() {
        /*
            r11 = this;
            e.i0 r0 = r11.f1064Z4
            boolean r1 = f1050i5
            r0.f841l = r1
            long r0 = java.lang.System.currentTimeMillis()
            r11.f1069e5 = r0
            long r2 = r11.f1068d5
            long r2 = r0 - r2
            r4 = 0
            r5 = 1
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0023
            int r2 = r11.f1067c5
            int r2 = r2 - r5
            r11.f1067c5 = r2
            r11.f1068d5 = r0
            if (r2 >= 0) goto L_0x0023
            r11.f1067c5 = r4
        L_0x0023:
            boolean r0 = r11.f1061W4
            if (r0 != 0) goto L_0x0032
            int r0 = r11.f1055Q4
            int r1 = r11.f1057S4
            if (r0 >= r1) goto L_0x003a
            int r0 = r11.f1067c5
            if (r0 != 0) goto L_0x003a
            goto L_0x0038
        L_0x0032:
            int r0 = r11.f1067c5
            if (r0 != 0) goto L_0x003a
            r11.f1061W4 = r4
        L_0x0038:
            r11.f1070f5 = r5
        L_0x003a:
            boolean r0 = r11.f1070f5
            r1 = 20
            r2 = 2
            if (r0 == 0) goto L_0x0053
            int r0 = r11.f1071g5
            int r0 = r0 + r5
            r11.f1071g5 = r0
            if (r0 != r1) goto L_0x0053
            r11.f1071g5 = r4
            r11.f1070f5 = r4
            f.d r0 = p012f.C0105d.m365M()
            r0.mo249U(r2)
        L_0x0053:
            int[] r0 = r11.f1062X4
            if (r0 == 0) goto L_0x005f
            int r0 = r0.length
            int r3 = r11.f1055Q4
            int r0 = r0 * r3
            int r3 = r11.f1057S4
            int r0 = r0 / r3
        L_0x005f:
            boolean r0 = r11.f1065a5
            r3 = 4
            if (r0 == 0) goto L_0x00f4
            r11.f1065a5 = r4
            int r0 = r11.f1067c5
            java.lang.String r6 = "/"
            if (r0 < 0) goto L_0x0072
            int r7 = r11.f1055Q4
            int r8 = r11.f1057S4
            if (r7 < r8) goto L_0x007c
        L_0x0072:
            if (r0 < 0) goto L_0x0078
            boolean r0 = r11.f1061W4
            if (r0 != 0) goto L_0x007c
        L_0x0078:
            boolean r0 = r11.f1066b5
            if (r0 == 0) goto L_0x00b9
        L_0x007c:
            e.i0 r0 = r11.f1064Z4
            java.lang.String[] r7 = new java.lang.String[r2]
            boolean r8 = r11.f1061W4
            if (r8 != 0) goto L_0x009b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r11.f1055Q4
            r8.append(r9)
            r8.append(r6)
            int r6 = r11.f1057S4
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x009d
        L_0x009b:
            java.lang.String r6 = p011e.C0057d1.f677l2
        L_0x009d:
            r7[r4] = r6
            int r6 = r11.f1067c5
            java.lang.String r6 = p012f.C0104c.m359d(r6)
            r7[r5] = r6
            int r6 = r11.f1593n
            int r8 = r11.f1598o
            int r8 = r8 - r1
            int[][] r1 = p020k.C0174j.f2848a
            int r9 = r11.f1051M4
            r1 = r1[r9]
            r1 = r1[r3]
            int r8 = r8 - r1
            r0.mo153j(r7, r6, r8)
            goto L_0x00f4
        L_0x00b9:
            int r0 = r11.f1055Q4
            int r7 = r11.f1057S4
            if (r0 != r7) goto L_0x00f4
            boolean r0 = r11.f1061W4
            if (r0 != 0) goto L_0x00f4
            e.i0 r0 = r11.f1064Z4
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r8 = p011e.C0057d1.f747v2
            r7[r4] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r11.f1055Q4
            r8.append(r9)
            r8.append(r6)
            int r6 = r11.f1057S4
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7[r5] = r6
            int r6 = r11.f1593n
            int r8 = r11.f1598o
            int r8 = r8 - r1
            int[][] r1 = p020k.C0174j.f2848a
            int r9 = r11.f1051M4
            r1 = r1[r9]
            r1 = r1[r3]
            int r8 = r8 - r1
            r0.mo153j(r7, r6, r8)
        L_0x00f4:
            int r0 = r11.f1067c5
            if (r0 < 0) goto L_0x00fe
            int r1 = r11.f1055Q4
            int r6 = r11.f1057S4
            if (r1 < r6) goto L_0x0104
        L_0x00fe:
            if (r0 < 0) goto L_0x0110
            boolean r1 = r11.f1061W4
            if (r1 == 0) goto L_0x0110
        L_0x0104:
            e.i0 r1 = r11.f1064Z4
            java.lang.String[] r1 = r1.f832c
            int r6 = r1.length
            int r6 = r6 - r5
            java.lang.String r0 = p012f.C0104c.m359d(r0)
            r1[r6] = r0
        L_0x0110:
            boolean r0 = r11.f1066b5
            if (r0 == 0) goto L_0x015f
            e.i0 r0 = r11.f1064Z4
            r0.f841l = r4
            r0 = 98
            int r1 = r11.f1593n
            int[] r6 = r11.f1062X4
            int r7 = r11.f1055Q4
            int r8 = r7 + -1
            r6 = r6[r8]
            int r1 = r1 + r6
            int[][] r6 = p020k.C0174j.f2848a
            int r8 = r11.f1051M4
            r9 = r6[r8]
            r10 = 3
            r9 = r9[r10]
            int r9 = r9 / r2
            int r1 = r1 - r9
            int r9 = r11.f1598o
            int[] r10 = r11.f1063Y4
            int r7 = r7 - r5
            r7 = r10[r7]
            int r9 = r9 + r7
            r6 = r6[r8]
            r3 = r6[r3]
            int r9 = r9 - r3
            p001b.C0020p.m96c(r0, r1, r9, r5)
            int r0 = r11.f1055Q4
            int r0 = r0 - r5
            r11.f1055Q4 = r0
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x0151
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo871a()
        L_0x0151:
            int r0 = r11.f1055Q4
            int r1 = r11.f1056R4
            if (r0 != r1) goto L_0x015f
            e.i0 r0 = r11.f1064Z4
            r0.f841l = r5
            r11.f1065a5 = r5
            r11.f1066b5 = r4
        L_0x015f:
            super.mo135f1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0092v.mo135f1():void");
    }

    /* renamed from: g0 */
    public void mo136g0(C0159f fVar) {
        C0062g gVar;
        int i = this.f1051M4;
        if (i != 0) {
            C0174j.m1555c(fVar, i, this.f1593n, this.f1598o, 0, C0117f0.f1677c);
            if (C0114e.m647e0().f1467O0 == null || !C0114e.m647e0().f1467O0.equals(this)) {
                String str = this.f1059U4;
                if (str != null) {
                    C0177m.f2924A.mo910b(fVar, str, this.f1593n, (this.f1598o - C0174j.f2848a[this.f1051M4][4]) - 17, 2, C0177m.f2925B);
                }
            } else {
                fVar.mo779h(C0137v.f2268p0, 0, 0, 9, 6, 0, this.f1593n, (this.f1598o - C0174j.f2848a[this.f1051M4][4]) - 1, C0142a.f2562f | C0142a.f2566j);
                String str2 = this.f1059U4;
                if (str2 != null) {
                    C0177m.f2924A.mo910b(fVar, str2, this.f1593n, (this.f1598o - C0174j.f2848a[this.f1051M4][4]) - 20, 2, C0177m.f2925B);
                }
            }
            int i2 = 0;
            while (i2 < this.f1055Q4) {
                try {
                    C0143b bVar = f1049h5;
                    int i3 = this.f1593n + this.f1062X4[i2];
                    int[][] iArr = C0174j.f2848a;
                    int i4 = this.f1051M4;
                    try {
                        fVar.mo776e(bVar, i3 - (iArr[i4][3] / 2), (this.f1598o + this.f1063Y4[i2]) - iArr[i4][4], 0);
                        i2++;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
            C0159f fVar2 = fVar;
            int i5 = this.f1646x2;
            if (i5 >= 0 && (gVar = this.f1656z2) != null && this.f1437I0 == 0) {
                C0064h[] hVarArr = gVar.f798b;
                C0174j.m1555c(fVar, hVarArr[i5].f804c, this.f1593n + hVarArr[i5].f802a + (C0174j.f2848a[this.f1051M4][3] / 2) + 5, (this.f1598o - 15) + hVarArr[i5].f803b, 0, C0142a.f2563g | C0142a.f2566j);
                if (C0145a.f2600O % 2 == 0) {
                    int i6 = this.f1646x2 + 1;
                    this.f1646x2 = i6;
                    if (i6 >= this.f1656z2.f798b.length) {
                        this.f1646x2 = 0;
                    }
                }
            }
        }
    }
}
