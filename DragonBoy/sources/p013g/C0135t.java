package p013g;

import p001b.C0007c;
import p001b.C0009e;
import p001b.C0010f;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: g.t */
public class C0135t extends C0114e {

    /* renamed from: S4 */
    public static C0010f f2212S4;

    /* renamed from: T4 */
    public static C0010f f2213T4;

    /* renamed from: A4 */
    int f2214A4 = 0;

    /* renamed from: B4 */
    int f2215B4;

    /* renamed from: C4 */
    boolean f2216C4;

    /* renamed from: D4 */
    C0009e f2217D4;

    /* renamed from: E4 */
    C0114e f2218E4;

    /* renamed from: F4 */
    public int f2219F4;

    /* renamed from: G4 */
    public int f2220G4;

    /* renamed from: H4 */
    C0114e[] f2221H4;

    /* renamed from: I4 */
    int[] f2222I4;

    /* renamed from: J4 */
    int f2223J4;

    /* renamed from: K4 */
    public int[] f2224K4;

    /* renamed from: L4 */
    public int[] f2225L4;

    /* renamed from: M4 */
    public int[] f2226M4;

    /* renamed from: N4 */
    public int[] f2227N4;

    /* renamed from: O4 */
    public int[][] f2228O4;

    /* renamed from: P4 */
    public byte f2229P4;

    /* renamed from: Q4 */
    private int f2230Q4;

    /* renamed from: R4 */
    int f2231R4;

    public C0135t() {
        int[] iArr = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        this.f2224K4 = iArr;
        int[] iArr2 = {0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
        this.f2225L4 = iArr2;
        int[] iArr3 = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
        this.f2226M4 = iArr3;
        int[] iArr4 = {13, 13, 14, 14, 15, 15, 16, 16};
        this.f2227N4 = iArr4;
        this.f2228O4 = new int[][]{iArr, iArr2, iArr3, iArr4};
        this.f2229P4 = -1;
        mo581B1();
        mo582C1();
    }

    /* renamed from: A1 */
    public void mo580A1(int i) {
        C0009e eVar = new C0009e(105, this.f1593n, this.f1598o + 20, 2, 1, -1);
        this.f2217D4 = eVar;
        C0007c.m43a(eVar);
        this.f2218E4 = i == C0114e.m647e0().f1638w ? C0114e.m647e0() : C0126k.m881V(i);
    }

    /* renamed from: B1 */
    public void mo581B1() {
        f2212S4 = null;
        f2212S4 = new C0010f();
        try {
            f2212S4.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 102 + "/data");
            f2212S4.f153a = C0161h.m1495m("/effectdata/102/img.png");
        } catch (Exception unused) {
        }
    }

    /* renamed from: C1 */
    public void mo582C1() {
        f2213T4 = null;
        f2213T4 = new C0010f();
        try {
            f2213T4.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 103 + "/data");
            f2213T4.f153a = C0161h.m1495m("/effectdata/103/img.png");
        } catch (Exception unused) {
        }
    }

    /* renamed from: D1 */
    public void mo583D1(byte b, short s, short s2, C0114e[] eVarArr, int[] iArr) {
        this.f2229P4 = b;
        this.f2219F4 = s;
        this.f2220G4 = s2;
        this.f2215B4 = this.f1633v;
        this.f1633v = s > this.f1593n ? 1 : -1;
        this.f2221H4 = eVarArr;
        this.f2222I4 = iArr;
    }

    /* renamed from: f1 */
    public void mo135f1() {
        C0114e eVar = this.f2218E4;
        int i = 30;
        if (eVar != null) {
            C0009e eVar2 = this.f2217D4;
            if (eVar2.f137f >= 30) {
                int i2 = eVar2.f139h;
                int i3 = i2 + ((this.f1593n - i2) / 4);
                eVar2.f139h = i3;
                int i4 = eVar2.f140i;
                int i5 = i4 + ((this.f1598o - i4) / 4);
                eVar2.f140i = i5;
                eVar.f1593n = i3;
                eVar.f1598o = i5;
                eVar.f1536b3 = true;
            } else {
                int i6 = eVar2.f139h;
                int i7 = eVar.f1593n;
                eVar2.f146o = i6 > i7 ? 1 : 0;
                eVar2.f139h = i6 + ((i7 - i6) / 3);
                int i8 = eVar2.f140i;
                eVar2.f140i = i8 + ((eVar.f1598o - i8) / 3);
            }
        }
        byte b = this.f2229P4;
        if (b != -1) {
            if (b == 0 && this.f2216C4 && C0145a.f2600O % 2 == 0) {
                int i9 = this.f2223J4;
                if (this.f2219F4 <= this.f1593n) {
                    i = -30;
                }
                this.f2223J4 = i9 + i;
                C0009e eVar3 = new C0009e(103, this.f1593n + this.f2223J4, this.f1598o + 20, 2, 1, -1);
                eVar3.f146o = this.f2219F4 > this.f1593n ? 0 : 1;
                C0007c.m43a(eVar3);
                int i10 = this.f1633v;
                if ((i10 == 1 && this.f1593n + this.f2223J4 >= this.f2219F4) || (i10 == -1 && this.f1593n + this.f2223J4 <= this.f2219F4)) {
                    this.f2216C4 = false;
                    this.f2229P4 = -1;
                    this.f2223J4 = 0;
                    this.f2214A4 = 0;
                    this.f1633v = this.f2215B4;
                    int i11 = 0;
                    while (true) {
                        C0114e[] eVarArr = this.f2221H4;
                        if (i11 >= eVarArr.length) {
                            break;
                        }
                        eVarArr[i11].mo467z(this.f2222I4[i11], 0, false, false);
                        i11++;
                    }
                }
            }
            if (this.f2229P4 == 3) {
                C0114e[] eVarArr2 = this.f2221H4;
                int i12 = this.f2231R4;
                int i13 = eVarArr2[i12].f1593n;
                this.f2219F4 = i13;
                int i14 = eVarArr2[i12].f1598o;
                this.f2220G4 = i14;
                int i15 = this.f1593n;
                this.f1593n = i15 + ((i13 - i15) / 3);
                int i16 = this.f1598o;
                this.f1598o = i16 + ((i14 - i16) / 3);
                if (C0145a.f2600O % 5 == 0) {
                    C0007c.m43a(new C0009e(19, this.f1593n, this.f1598o, 2, 1, -1));
                }
                if (C0111c0.m574a(this.f1593n - this.f2219F4) <= 20 && C0111c0.m574a(this.f1598o - this.f2220G4) <= 20) {
                    this.f1593n = this.f2219F4;
                    this.f1598o = this.f2220G4;
                    C0114e[] eVarArr3 = this.f2221H4;
                    int i17 = this.f2231R4;
                    eVarArr3[i17].mo467z(this.f2222I4[i17], 0, false, false);
                    int i18 = this.f2231R4 + 1;
                    this.f2231R4 = i18;
                    if (i18 == this.f2221H4.length) {
                        this.f2229P4 = -1;
                        this.f2231R4 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.mo135f1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r8.f1633v == 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r8.f1633v == 1) goto L_0x003e;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136g0(p019j.C0159f r9) {
        /*
            r8 = this;
            byte r0 = r8.f2229P4
            r1 = -1
            if (r0 == r1) goto L_0x004d
            r8.mo452t0(r9)
            int r0 = p018i.C0145a.f2595L0
            r7 = 0
            r9.mo773E(r7, r0)
            int[][] r0 = r8.f2228O4
            byte r1 = r8.f2229P4
            r0 = r0[r1]
            r8.mo444p(r0)
            byte r0 = r8.f2229P4
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            b.f r0 = f2213T4
            int r2 = r8.f2230Q4
            int r3 = r8.f1593n
            int r4 = r8.f1598o
            int r5 = r8.f1586l2
            int r4 = r4 + r5
            int r5 = r8.f1633v
            if (r5 != r1) goto L_0x0040
            goto L_0x003e
        L_0x002f:
            b.f r0 = f2212S4
            int r2 = r8.f2230Q4
            int r3 = r8.f1593n
            int r4 = r8.f1598o
            int r5 = r8.f1586l2
            int r4 = r4 + r5
            int r5 = r8.f1633v
            if (r5 != r1) goto L_0x0040
        L_0x003e:
            r5 = 0
            goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            r6 = 2
            r1 = r9
            r0.mo23b(r1, r2, r3, r4, r5, r6)
            int r0 = p018i.C0145a.f2595L0
            int r0 = -r0
            r9.mo773E(r7, r0)
            goto L_0x0050
        L_0x004d:
            super.mo136g0(r9)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0135t.mo136g0(j.f):void");
    }

    /* renamed from: p */
    public void mo444p(int[] iArr) {
        if (this.f2229P4 == 0) {
            if (this.f2214A4 == 11) {
                this.f2216C4 = true;
                C0007c.m43a(new C0009e(19, this.f1593n, this.f1598o + 20, 2, 1, -1));
            }
            if (this.f2214A4 >= iArr.length - 1) {
                this.f2229P4 = 2;
                return;
            }
        }
        if (this.f2229P4 == 1 && this.f2214A4 == iArr.length - 1) {
            this.f2229P4 = 3;
            this.f1598o -= 15;
            return;
        }
        int i = this.f2214A4 + 1;
        this.f2214A4 = i;
        if (i > iArr.length - 1) {
            this.f2214A4 = 0;
        }
        this.f2230Q4 = iArr[this.f2214A4];
    }
}
