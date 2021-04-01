package p011e;

import p013g.C0111c0;
import p013g.C0117f0;
import p013g.C0121h0;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0175k;

/* renamed from: e.z0 */
public class C0101z0 {

    /* renamed from: u */
    public static C0173i f1120u = new C0173i("vTeleport");

    /* renamed from: v */
    public static C0143b[] f1121v = new C0143b[5];

    /* renamed from: w */
    public static C0143b f1122w;

    /* renamed from: a */
    public int f1123a;

    /* renamed from: b */
    public int f1124b;

    /* renamed from: c */
    public int f1125c;

    /* renamed from: d */
    public int f1126d;

    /* renamed from: e */
    public boolean f1127e;

    /* renamed from: f */
    public int f1128f;

    /* renamed from: g */
    public int f1129g;

    /* renamed from: h */
    public int f1130h;

    /* renamed from: i */
    public int f1131i;

    /* renamed from: j */
    public boolean f1132j;

    /* renamed from: k */
    public boolean f1133k;

    /* renamed from: l */
    private boolean f1134l = false;

    /* renamed from: m */
    public boolean f1135m;

    /* renamed from: n */
    boolean f1136n;

    /* renamed from: o */
    int f1137o;

    /* renamed from: p */
    int f1138p = 1;

    /* renamed from: q */
    int f1139q;

    /* renamed from: r */
    int f1140r;

    /* renamed from: s */
    boolean f1141s;

    /* renamed from: t */
    boolean f1142t;

    public C0101z0(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int i7 = 0;
        this.f1123a = i;
        this.f1124b = 5;
        this.f1128f = i2;
        C0111c0.m584k("TELEPORT x= " + i + " y= " + i2 + " type= " + i5);
        this.f1125c = i3;
        this.f1126d = i5;
        this.f1127e = z;
        this.f1130h = i4;
        this.f1131i = i6;
        this.f1137o = 0;
        while (true) {
            if (i7 >= 100) {
                break;
            }
            i7++;
            int i8 = this.f1128f + 12;
            this.f1128f = i8;
            if (C0121h0.m841u(i, i8, 2)) {
                int i9 = this.f1128f;
                if (i9 % 24 != 0) {
                    this.f1128f = i9 - (i9 % 24);
                }
            }
        }
        C0111c0.m584k("Y2= " + this.f1128f + "--------------------------------------------------------------");
        this.f1133k = true;
        if (this.f1131i > 2) {
            this.f1128f += 4;
            C0143b[] bVarArr = f1121v;
            if (bVarArr[3] == null) {
                bVarArr[3] = C0161h.m1495m("/mainImage/myTexture2dmaybay4a.png");
            }
            C0143b[] bVarArr2 = f1121v;
            if (bVarArr2[4] == null) {
                bVarArr2[4] = C0161h.m1495m("/mainImage/myTexture2dmaybay4b.png");
            }
            if (f1122w == null) {
                f1122w = C0161h.m1495m("/mainImage/hole.png");
            }
        } else {
            C0143b[] bVarArr3 = f1121v;
            if (bVarArr3[i6] == null) {
                bVarArr3[i6] = C0161h.m1494l("/mainImage/myTexture2dmaybay" + (i6 + 1) + ".png");
            }
        }
        int i10 = C0126k.f2028t1;
        if (i > i10 && i < i10 + C0145a.f2614V && this.f1128f > 100 && !C0175k.m1563p().mo892x() && !C0175k.m1563p().mo893y()) {
            this.f1134l = true;
            C0175k.m1563p().mo872b();
        }
    }

    /* renamed from: a */
    public static void m328a(C0101z0 z0Var) {
        f1120u.addElement(z0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (r0.f1130h == 1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        if (r0.f1130h == 1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        r17 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0130, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        r22.mo779h(r12, r13, r14, r15, r16, r17, r0.f1123a, r0.f1124b, p013g.C0117f0.f1677c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo198b(p019j.C0159f r22) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = p013g.C0114e.f1394y4
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            int r1 = r0.f1123a
            int r2 = p013g.C0126k.f2028t1
            if (r1 < r2) goto L_0x0141
            int r3 = p018i.C0145a.f2614V
            int r2 = r2 + r3
            if (r1 <= r2) goto L_0x0014
            goto L_0x0141
        L_0x0014:
            e.f0[] r2 = p013g.C0126k.f1884M1
            int r3 = r0.f1125c
            r2 = r2[r3]
            int r3 = r0.f1131i
            r4 = 0
            if (r3 != 0) goto L_0x0024
            r5 = 15
            r6 = 40
            goto L_0x0026
        L_0x0024:
            r5 = 0
            r6 = 0
        L_0x0026:
            r7 = 1
            if (r3 != r7) goto L_0x002c
            r5 = 7
            r6 = 55
        L_0x002c:
            r8 = 2
            if (r3 != r8) goto L_0x0033
            r5 = 18
            r6 = 52
        L_0x0033:
            boolean r9 = r0.f1136n
            r10 = 3
            if (r9 == 0) goto L_0x0060
            if (r3 >= r10) goto L_0x0060
            e.g0[] r2 = r2.f796a
            int[][][] r3 = p013g.C0114e.f1389t4
            r3 = r3[r4]
            r3 = r3[r4]
            r3 = r3[r4]
            r2 = r2[r3]
            short r12 = r2.f799a
            int r2 = r0.f1130h
            if (r2 != r7) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            int r5 = -r5
        L_0x004e:
            int r13 = r1 + r5
            int r1 = r0.f1124b
            int r14 = r1 - r6
            if (r2 != r7) goto L_0x0058
            r15 = 0
            goto L_0x0059
        L_0x0058:
            r15 = 2
        L_0x0059:
            int r16 = p013g.C0117f0.f1675a
            r11 = r22
            p020k.C0174j.m1555c(r11, r12, r13, r14, r15, r16)
        L_0x0060:
            int r1 = r0.f1131i
            if (r1 >= r10) goto L_0x0092
            h.a.a.b[] r2 = f1121v
            r10 = r2[r1]
            r11 = 0
            r12 = 0
            r1 = r2[r1]
            int r13 = p019j.C0159f.m1451u(r1)
            h.a.a.b[] r1 = f1121v
            int r2 = r0.f1131i
            r1 = r1[r2]
            int r14 = p019j.C0159f.m1450t(r1)
            int r1 = r0.f1130h
            if (r1 != r7) goto L_0x0080
            r15 = 2
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            int r1 = r0.f1123a
            int r2 = r0.f1124b
            int r18 = p013g.C0117f0.f1677c
            r9 = r22
            r16 = r1
            r17 = r2
        L_0x008d:
            r9.mo779h(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0141
        L_0x0092:
            boolean r1 = r0.f1133k
            r2 = 4
            if (r1 == 0) goto L_0x00dd
            int r1 = r0.f1137o
            r3 = 10
            if (r1 <= r3) goto L_0x00c4
            h.a.a.b[] r1 = f1121v
            r10 = r1[r2]
            r11 = 0
            r12 = 0
            r1 = r1[r2]
            int r13 = p019j.C0159f.m1451u(r1)
            h.a.a.b[] r1 = f1121v
            r1 = r1[r2]
            int r14 = p019j.C0159f.m1450t(r1)
            int r1 = r0.f1130h
            if (r1 != r7) goto L_0x00b7
            r15 = 2
            goto L_0x00b8
        L_0x00b7:
            r15 = 0
        L_0x00b8:
            if (r1 != r7) goto L_0x00bf
            int r1 = r0.f1123a
            int r1 = r1 + -11
            goto L_0x0109
        L_0x00bf:
            int r1 = r0.f1123a
            int r1 = r1 + 11
            goto L_0x0109
        L_0x00c4:
            h.a.a.b[] r1 = f1121v
            r12 = r1[r10]
            r13 = 0
            r14 = 0
            r1 = r1[r10]
            int r15 = p019j.C0159f.m1451u(r1)
            h.a.a.b[] r1 = f1121v
            r1 = r1[r10]
            int r16 = p019j.C0159f.m1450t(r1)
            int r1 = r0.f1130h
            if (r1 != r7) goto L_0x0130
            goto L_0x012d
        L_0x00dd:
            int r1 = r0.f1137o
            r3 = 20
            if (r1 >= r3) goto L_0x0115
            h.a.a.b[] r1 = f1121v
            r10 = r1[r2]
            r11 = 0
            r12 = 0
            r1 = r1[r2]
            int r13 = p019j.C0159f.m1451u(r1)
            h.a.a.b[] r1 = f1121v
            r1 = r1[r2]
            int r14 = p019j.C0159f.m1450t(r1)
            int r1 = r0.f1130h
            if (r1 != r7) goto L_0x00fd
            r15 = 2
            goto L_0x00fe
        L_0x00fd:
            r15 = 0
        L_0x00fe:
            if (r1 != r7) goto L_0x0105
            int r1 = r0.f1123a
            int r1 = r1 + -11
            goto L_0x0109
        L_0x0105:
            int r1 = r0.f1123a
            int r1 = r1 + 11
        L_0x0109:
            r16 = r1
            int r1 = r0.f1124b
            int r17 = r1 + 2
            int r18 = p013g.C0117f0.f1677c
            r9 = r22
            goto L_0x008d
        L_0x0115:
            h.a.a.b[] r1 = f1121v
            r12 = r1[r10]
            r13 = 0
            r14 = 0
            r1 = r1[r10]
            int r15 = p019j.C0159f.m1451u(r1)
            h.a.a.b[] r1 = f1121v
            r1 = r1[r10]
            int r16 = p019j.C0159f.m1450t(r1)
            int r1 = r0.f1130h
            if (r1 != r7) goto L_0x0130
        L_0x012d:
            r17 = 2
            goto L_0x0132
        L_0x0130:
            r17 = 0
        L_0x0132:
            int r1 = r0.f1123a
            int r2 = r0.f1124b
            int r20 = p013g.C0117f0.f1677c
            r11 = r22
            r18 = r1
            r19 = r2
            r11.mo779h(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0101z0.mo198b(j.f):void");
    }

    /* renamed from: c */
    public void mo199c(C0159f fVar) {
        if (this.f1131i > 2 && this.f1141s) {
            fVar.mo776e(f1122w, this.f1123a, this.f1128f + 20, C0117f0.f1677c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo200d() {
        /*
            r12 = this;
            int r0 = r12.f1131i
            r1 = -80
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 <= r2) goto L_0x0035
            boolean r0 = r12.f1135m
            if (r0 == 0) goto L_0x0035
            int r0 = r12.f1124b
            if (r0 == r1) goto L_0x0035
            boolean r6 = r12.f1133k
            if (r6 == 0) goto L_0x0025
            int r6 = r12.f1137o
            if (r6 != 0) goto L_0x0025
            int r6 = p018i.C0145a.f2600O
            int r6 = r6 % r3
            if (r6 != 0) goto L_0x0035
            int r6 = r12.f1123a
            p001b.C0020p.m97d(r5, r6, r0, r5, r4)
            goto L_0x0035
        L_0x0025:
            boolean r6 = r12.f1132j
            if (r6 == 0) goto L_0x0035
            int r6 = p018i.C0145a.f2600O
            int r6 = r6 % r3
            if (r6 != 0) goto L_0x0035
            int r6 = r12.f1123a
            int r0 = r0 + 16
            p001b.C0020p.m97d(r5, r6, r0, r5, r5)
        L_0x0035:
            int r0 = r12.f1139q
            int r0 = r0 + r5
            r12.f1139q = r0
            if (r0 <= r3) goto L_0x003e
            r12.f1139q = r4
        L_0x003e:
            boolean r0 = r12.f1133k
            r6 = 50
            r7 = 14
            r8 = 30
            if (r0 == 0) goto L_0x0190
            r12.f1135m = r5
            int r0 = r12.f1126d
            if (r0 != 0) goto L_0x0050
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            r12.f1136n = r1
            int r1 = r12.f1131i
            if (r1 >= r3) goto L_0x0066
            int r1 = r12.f1128f
            int r9 = r12.f1124b
            int r1 = r1 - r9
            int r1 = r1 >> r3
            if (r1 >= r5) goto L_0x0062
            r12.f1135m = r4
            r1 = 1
        L_0x0062:
            int r9 = r9 + r1
        L_0x0063:
            r12.f1124b = r9
            goto L_0x0081
        L_0x0066:
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r2
            if (r1 != 0) goto L_0x0070
            int r1 = r12.f1138p
            int r1 = r1 + r5
            r12.f1138p = r1
        L_0x0070:
            int r1 = r12.f1128f
            int r9 = r12.f1124b
            int r10 = r1 - r9
            int r11 = r12.f1138p
            if (r10 >= r11) goto L_0x007f
            r12.f1124b = r1
            r12.f1135m = r4
            goto L_0x0081
        L_0x007f:
            int r9 = r9 + r11
            goto L_0x0063
        L_0x0081:
            boolean r1 = r12.f1127e
            r9 = 4
            if (r1 == 0) goto L_0x00b9
            if (r0 != r5) goto L_0x00b9
            g.e r0 = p013g.C0114e.m647e0()
            boolean r0 = r0.f1538c
            if (r0 == 0) goto L_0x00b9
            g.e r0 = p013g.C0114e.m647e0()
            int r1 = r12.f1123a
            r0.f1593n = r1
            g.e r0 = p013g.C0114e.m647e0()
            int r1 = r12.f1124b
            int r1 = r1 - r8
            r0.f1598o = r1
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r9
            int r0 = r12.f1123a
            int r1 = p013g.C0126k.f1985k1
            int r0 = r0 - r1
            p013g.C0126k.f2052z1 = r0
            int r0 = r12.f1124b
            int r1 = p013g.C0126k.f2000n1
            int r0 = r0 - r1
            p013g.C0126k.f1836A1 = r0
            g.q r0 = p013g.C0126k.f1862G3
            r0.f2188o = r4
        L_0x00b9:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r12.f1127e
            if (r0 != 0) goto L_0x00f0
            int r0 = r12.f1126d
            if (r0 != r5) goto L_0x00f0
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            boolean r0 = r0.f1538c
            if (r0 == 0) goto L_0x00f0
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            int r1 = r12.f1123a
            r0.f1593n = r1
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            int r1 = r12.f1124b
            int r1 = r1 - r8
            r0.f1598o = r1
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            r0.f1628u = r9
        L_0x00f0:
            int r0 = r12.f1124b
            int r1 = r12.f1128f
            int r0 = r0 - r1
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 >= r6) goto L_0x02a3
            int r0 = r12.f1123a
            int r1 = r12.f1124b
            boolean r0 = p013g.C0121h0.m841u(r0, r1, r2)
            if (r0 == 0) goto L_0x02a3
            r12.f1141s = r5
            int r0 = r12.f1131i
            r1 = 10
            if (r0 >= r3) goto L_0x014a
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo859J()
            int r0 = r12.f1124b
            int r2 = r0 % 24
            if (r2 == 0) goto L_0x011f
            int r2 = r0 % 24
            int r0 = r0 - r2
            r12.f1124b = r0
        L_0x011f:
            int r0 = r12.f1137o
            int r0 = r0 + r5
            r12.f1137o = r0
            if (r0 <= r1) goto L_0x012e
            r12.f1137o = r4
            r12.f1133k = r4
            r12.f1132j = r5
            r12.f1135m = r4
        L_0x012e:
            int r0 = r12.f1126d
            if (r0 != r5) goto L_0x02a3
            boolean r0 = r12.f1127e
            if (r0 == 0) goto L_0x013b
            g.e r0 = p013g.C0114e.m647e0()
            goto L_0x017a
        L_0x013b:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x018c
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            goto L_0x017a
        L_0x014a:
            int r0 = r12.f1128f
            r12.f1124b = r0
            boolean r2 = r12.f1142t
            if (r2 != 0) goto L_0x015f
            r2 = 92
            int r10 = r12.f1123a
            int r10 = r10 + r9
            int r0 = r0 + r7
            p001b.C0020p.m97d(r2, r10, r0, r5, r4)
            p013g.C0126k.f2023r4 = r1
            r12.f1142t = r5
        L_0x015f:
            int r0 = r12.f1137o
            int r0 = r0 + r5
            r12.f1137o = r0
            if (r0 <= r8) goto L_0x016e
            r12.f1137o = r4
            r12.f1133k = r4
            r12.f1132j = r5
            r12.f1135m = r4
        L_0x016e:
            int r0 = r12.f1126d
            if (r0 != r5) goto L_0x02a3
            boolean r0 = r12.f1127e
            if (r0 == 0) goto L_0x017d
            g.e r0 = p013g.C0114e.m647e0()
        L_0x017a:
            r0.f1538c = r4
            goto L_0x018c
        L_0x017d:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x018c
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            goto L_0x017a
        L_0x018c:
            r12.f1136n = r4
            goto L_0x02a3
        L_0x0190:
            boolean r0 = r12.f1132j
            if (r0 == 0) goto L_0x02a3
            int r0 = r12.f1137o
            int r0 = r0 + r5
            r12.f1137o = r0
            if (r0 <= r8) goto L_0x01ae
            int r0 = r12.f1128f
            int r0 = r0 + 24
            int r2 = r12.f1124b
            int r0 = r0 - r2
            int r0 = r0 >> r3
            if (r0 <= r8) goto L_0x01a6
            goto L_0x01a7
        L_0x01a6:
            r8 = r0
        L_0x01a7:
            int r2 = r2 - r8
            r12.f1124b = r2
            r12.f1135m = r5
            goto L_0x0248
        L_0x01ae:
            if (r0 != r7) goto L_0x01bb
            boolean r0 = r12.f1134l
            if (r0 == 0) goto L_0x01bb
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo863N()
        L_0x01bb:
            int r0 = r12.f1137o
            if (r0 <= 0) goto L_0x020e
            int r0 = r12.f1126d
            if (r0 != 0) goto L_0x020e
            boolean r0 = r12.f1127e
            r2 = -3
            if (r0 == 0) goto L_0x01e3
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1538c = r4
            g.e r0 = p013g.C0114e.m647e0()
            int r0 = r0.f1628u
            if (r0 == r7) goto L_0x01dc
            g.e r0 = p013g.C0114e.m647e0()
            r0.f1628u = r3
        L_0x01dc:
            g.e r0 = p013g.C0114e.m647e0()
        L_0x01e0:
            r0.f1608q = r2
            goto L_0x020c
        L_0x01e3:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x020c
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            r0.f1538c = r4
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            int r0 = r0.f1628u
            if (r0 == r7) goto L_0x0205
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            r0.f1628u = r3
        L_0x0205:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            goto L_0x01e0
        L_0x020c:
            r12.f1136n = r4
        L_0x020e:
            int r0 = r12.f1137o
            r2 = 12
            if (r0 <= r2) goto L_0x0248
            int r0 = r12.f1126d
            if (r0 != 0) goto L_0x0248
            boolean r0 = r12.f1127e
            if (r0 == 0) goto L_0x0223
            g.e r0 = p013g.C0114e.m647e0()
        L_0x0220:
            r0.f1538c = r5
            goto L_0x0246
        L_0x0223:
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x0246
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            int r2 = r12.f1123a
            r0.f1593n = r2
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            int r2 = r12.f1124b
            r0.f1598o = r2
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            goto L_0x0220
        L_0x0246:
            r12.f1136n = r5
        L_0x0248:
            boolean r0 = r12.f1127e
            if (r0 == 0) goto L_0x0264
            int r2 = r12.f1126d
            if (r2 != 0) goto L_0x025e
            int r7 = r12.f1123a
            int r8 = p013g.C0126k.f1985k1
            int r7 = r7 - r8
            p013g.C0126k.f2052z1 = r7
            int r7 = r12.f1124b
            int r8 = p013g.C0126k.f2000n1
            int r7 = r7 - r8
            p013g.C0126k.f1836A1 = r7
        L_0x025e:
            if (r2 != r5) goto L_0x0264
            g.q r2 = p013g.C0126k.f1862G3
            r2.f2188o = r5
        L_0x0264:
            int r2 = r12.f1124b
            if (r2 > r1) goto L_0x02a3
            if (r0 == 0) goto L_0x0272
            int r2 = r12.f1126d
            if (r2 != 0) goto L_0x0272
            p012f.C0103b.f1145e = r4
            p013g.C0114e.f1392w4 = r5
        L_0x0272:
            if (r0 != 0) goto L_0x028b
            int r0 = r12.f1129g
            g.e r0 = p013g.C0126k.m881V(r0)
            if (r0 == 0) goto L_0x028b
            int r0 = r12.f1126d
            if (r0 != 0) goto L_0x028b
            k.i r0 = p013g.C0126k.f1908S1
            int r2 = r12.f1129g
            g.e r2 = p013g.C0126k.m881V(r2)
            r0.removeElement(r2)
        L_0x028b:
            int r0 = r12.f1131i
            if (r0 >= r3) goto L_0x0295
        L_0x028f:
            k.i r0 = f1120u
            r0.removeElement(r12)
            goto L_0x02a3
        L_0x0295:
            r12.f1124b = r1
            int r0 = r12.f1140r
            int r0 = r0 + r5
            r12.f1140r = r0
            r1 = 80
            if (r0 <= r1) goto L_0x02a3
            r12.f1140r = r4
            goto L_0x028f
        L_0x02a3:
            boolean r0 = r12.f1135m
            if (r0 == 0) goto L_0x02d0
            int r0 = r12.f1131i
            if (r0 >= r3) goto L_0x02d0
            int r0 = r12.f1124b
            int r1 = r12.f1128f
            int r0 = r0 - r1
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 > r6) goto L_0x02d0
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % 5
            if (r0 != 0) goto L_0x02d0
            b.e r0 = new b.e
            r2 = 19
            int r3 = r12.f1123a
            int r1 = r12.f1128f
            int r4 = r1 + 20
            r5 = 2
            r6 = 1
            r7 = -1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            p001b.C0007c.m43a(r0)
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0101z0.mo200d():void");
    }
}
