package p013g;

import p001b.C0007c;
import p001b.C0009e;
import p001b.C0010f;
import p001b.C0019o;
import p001b.C0020p;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: g.c */
public class C0110c extends C0137v implements C0128m {

    /* renamed from: N0 */
    public static C0143b f1279N0 = C0161h.m1494l("/mainImage/shadowBig.png");

    /* renamed from: O0 */
    public static C0010f f1280O0;

    /* renamed from: A0 */
    boolean f1281A0;

    /* renamed from: B0 */
    boolean f1282B0;

    /* renamed from: C0 */
    int f1283C0;

    /* renamed from: D0 */
    int f1284D0;

    /* renamed from: E0 */
    C0114e[] f1285E0;

    /* renamed from: F0 */
    int[] f1286F0;

    /* renamed from: G0 */
    byte f1287G0;

    /* renamed from: H0 */
    public int[] f1288H0 = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};

    /* renamed from: I0 */
    public int[] f1289I0 = {0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};

    /* renamed from: J0 */
    public int[] f1290J0 = {0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};

    /* renamed from: K0 */
    public int[] f1291K0 = {4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};

    /* renamed from: L0 */
    public int[] f1292L0 = {6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};

    /* renamed from: M0 */
    private boolean f1293M0;

    /* renamed from: q0 */
    public int f1294q0;

    /* renamed from: r0 */
    public int f1295r0;

    /* renamed from: s0 */
    public int f1296s0;

    /* renamed from: t0 */
    public int f1297t0;

    /* renamed from: u0 */
    boolean f1298u0;

    /* renamed from: v0 */
    int f1299v0;

    /* renamed from: w0 */
    public boolean f1300w0 = true;

    /* renamed from: x0 */
    int f1301x0;

    /* renamed from: y0 */
    int f1302y0;

    /* renamed from: z0 */
    int f1303z0;

    static {
        C0161h.m1494l("/mainImage/myTexture2dmobHP.png");
    }

    public C0110c(int i, short s, short s2, int i2, int i3, int i4, int i5) {
        this.f2331y = i;
        int i6 = s + 20;
        this.f2315k = i6;
        this.f1294q0 = i6;
        this.f2317l = s2;
        this.f1295r0 = s2;
        this.f2326t = s2;
        mo357N();
        this.f2311i = i3;
        this.f2313j = i4;
        this.f2275G = i2;
        this.f2321o = 2;
    }

    /* renamed from: H */
    private void m541H() {
    }

    /* renamed from: J */
    private void m542J() {
        mo333i(this.f1288H0);
        int i = this.f2315k;
        int i2 = this.f1294q0;
        if (i != i2 || this.f2317l != this.f1295r0) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f1295r0 - i3) / 4);
        }
    }

    /* renamed from: L */
    private void m543L() {
        int i;
        byte b = C0121h0.f1796o;
        int i2 = this.f2315k;
        this.f1296s0 = i2;
        this.f1299v0 = 0;
        int i3 = this.f1297t0;
        if (i3 > 0 && !C0121h0.m841u(i2, i3, 2)) {
            if (C0121h0.m840t(this.f1296s0 / b, this.f1297t0 / b) == 0) {
                this.f1298u0 = true;
            } else if (C0121h0.m840t(this.f1296s0 / b, this.f1297t0 / b) != 0 && !C0121h0.m841u(this.f1296s0, this.f1297t0, 2)) {
                this.f1296s0 = this.f2315k;
                this.f1297t0 = this.f2317l;
                this.f1298u0 = false;
            }
            while (this.f1298u0 && (i = this.f1299v0) < 10) {
                this.f1299v0 = i + 1;
                int i4 = this.f1297t0 + 24;
                this.f1297t0 = i4;
                if (C0121h0.m841u(this.f1296s0, i4, 2)) {
                    int i5 = this.f1297t0;
                    if (i5 % 24 != 0) {
                        this.f1297t0 = i5 - (i5 % 24);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: P */
    private void m544P() {
        mo333i(this.f1288H0);
        if (C0145a.f2600O % 5 == 0) {
            C0020p.m96c(167, C0111c0.m587n(this.f2315k - (mo174a() / 2), this.f2315k + (mo174a() / 2)), C0111c0.m587n(mo179g() + (mo178f() / 2), mo179g() + mo178f()), 1);
        }
        int i = this.f2315k;
        int i2 = this.f1294q0;
        if (i != i2 || this.f2317l != this.f1295r0) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f1295r0 - i3) / 4);
        }
    }

    /* renamed from: Q */
    private void m545Q() {
        if (this.f1281A0) {
            int i = this.f1283C0 + 1;
            this.f1283C0 = i;
            this.f2317l -= i;
            mo333i(this.f1291K0);
            if (this.f2317l <= -500) {
                this.f1281A0 = false;
                this.f1282B0 = true;
                this.f1283C0 = 0;
            }
        }
        if (this.f1282B0) {
            this.f2315k = this.f1294q0;
            int i2 = this.f1283C0 + 2;
            this.f1283C0 = i2;
            this.f2317l += i2;
            mo333i(this.f1292L0);
            int i3 = this.f2317l;
            int i4 = this.f2326t;
            if (i3 > i4) {
                this.f2317l = i4;
                this.f1282B0 = false;
                this.f1283C0 = 0;
                this.f2321o = 2;
                C0126k.f2023r4 = 10;
                this.f1293M0 = true;
            }
        }
    }

    /* renamed from: y */
    private void m546y(C0159f fVar) {
        byte b = C0121h0.f1796o;
        fVar.mo776e(f1279N0, this.f1296s0, this.f2326t, 3);
        fVar.mo771C(C0126k.f2028t1, C0126k.f2032u1 - C0145a.f2595L0, C0126k.f1975i1, C0126k.f1980j1 + (C0145a.f2595L0 * 2));
    }

    /* renamed from: A */
    public void mo319A() {
        if (this.f2309h != 0) {
            this.f2309h = 0;
        }
    }

    /* renamed from: B */
    public void mo320B() {
    }

    /* renamed from: C */
    public void mo321C(C0114e eVar) {
        this.f2276H = eVar;
        this.f2322p = 0;
        this.f2323q = 0;
        this.f2321o = 3;
        this.f1301x0 = 0;
        int i = eVar.f1593n;
        int i2 = this.f2315k;
        this.f2319m = i > i2 ? 1 : -1;
        int i3 = eVar.f1598o;
        if (C0111c0.m574a(i - i2) >= this.f2327u * 2 || C0111c0.m574a(i3 - this.f2317l) >= this.f2328v * 2) {
            this.f2324r = 1;
            return;
        }
        this.f2315k = this.f2315k < i ? i - this.f2327u : i + this.f2327u;
        this.f2324r = 0;
    }

    /* renamed from: D */
    public void mo322D(short s) {
        this.f2295a = true;
        this.f2297b = s;
    }

    /* renamed from: E */
    public void mo323E() {
    }

    /* renamed from: F */
    public void mo324F() {
        this.f2311i = 0;
        this.f2311i = 0;
        this.f2321o = 1;
        this.f2322p = -3;
        this.f2323q = -this.f2319m;
        this.f2324r = 0;
    }

    /* renamed from: G */
    public void mo325G() {
        if (mo338w()) {
            m543L();
            switch (this.f2321o) {
                case 0:
                case 1:
                    m544P();
                    return;
                case 2:
                    m542J();
                    return;
                case 3:
                    mo326I();
                    return;
                case 4:
                    this.f2330x = 0;
                    m545Q();
                    return;
                case 5:
                    this.f2330x = 0;
                    mo327K();
                    return;
                case 6:
                    this.f2330x = 0;
                    int i = this.f2322p + 1;
                    this.f2322p = i;
                    int i2 = this.f2317l + i;
                    this.f2317l = i2;
                    int i3 = this.f2326t;
                    if (i2 >= i3) {
                        this.f2317l = i3;
                        this.f2322p = 0;
                        this.f2321o = 5;
                        return;
                    }
                    return;
                case 7:
                    m541H();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: I */
    public void mo326I() {
        int i = -1;
        if (this.f1287G0 == 0) {
            int i2 = this.f1301x0;
            int[] iArr = this.f1289I0;
            if (i2 == iArr.length - 1) {
                this.f2321o = 2;
            }
            this.f2319m = this.f2315k < this.f1285E0[0].f1593n ? 1 : -1;
            mo333i(iArr);
            int i3 = this.f2315k;
            C0114e[] eVarArr = this.f1285E0;
            int i4 = i3 + ((eVarArr[0].f1593n - i3) / 4);
            this.f2315k = i4;
            int i5 = this.f2317l;
            this.f2317l = i5 + ((eVarArr[0].f1598o - i5) / 4);
            this.f1294q0 = i4;
            if (this.f1301x0 == 8) {
                int i6 = 0;
                while (true) {
                    C0114e[] eVarArr2 = this.f1285E0;
                    if (i6 >= eVarArr2.length) {
                        break;
                    }
                    eVarArr2[i6].mo467z(this.f1286F0[i6], 0, false, false);
                    C0114e[] eVarArr3 = this.f1285E0;
                    C0020p.m96c(102, eVarArr3[i6].f1593n, eVarArr3[i6].f1598o, 1);
                    i6++;
                }
            }
        }
        if (this.f1287G0 == 1) {
            int i7 = this.f1301x0;
            int[] iArr2 = this.f1290J0;
            if (i7 == iArr2.length - 1) {
                this.f2321o = 2;
            }
            this.f2319m = this.f2315k < this.f1285E0[0].f1593n ? 1 : -1;
            mo333i(iArr2);
            if (this.f1301x0 == 8) {
                int i8 = 0;
                while (true) {
                    C0114e[] eVarArr4 = this.f1285E0;
                    if (i8 >= eVarArr4.length) {
                        break;
                    }
                    C0019o.m91c(this.f2315k + (this.f2319m == 1 ? 45 : -45), this.f2317l - 25, true, this.f1286F0[i8], 0, eVarArr4[i8], 24);
                    i8++;
                }
            }
        }
        if (this.f1287G0 == 2) {
            int i9 = this.f1301x0;
            int[] iArr3 = this.f1291K0;
            if (i9 == iArr3.length - 1) {
                this.f2321o = 2;
            }
            if (this.f2315k < this.f1285E0[0].f1593n) {
                i = 1;
            }
            this.f2319m = i;
            mo333i(iArr3);
            int i10 = this.f2315k;
            int i11 = i10 + ((this.f1285E0[0].f1593n - i10) / 4);
            this.f2315k = i11;
            this.f1294q0 = i11;
            this.f1295r0 = this.f2317l;
            if (this.f1301x0 == 12) {
                int i12 = 0;
                while (true) {
                    C0114e[] eVarArr5 = this.f1285E0;
                    if (i12 < eVarArr5.length) {
                        eVarArr5[i12].mo467z(this.f1286F0[i12], 0, false, false);
                        C0114e[] eVarArr6 = this.f1285E0;
                        C0020p.m96c(102, eVarArr6[i12].f1593n, eVarArr6[i12].f1598o, 1);
                        i12++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void mo327K() {
    }

    /* renamed from: M */
    public void mo328M() {
    }

    /* renamed from: N */
    public void mo357N() {
        f1280O0 = null;
        f1280O0 = new C0010f();
        try {
            f1280O0.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 109 + "/data");
            f1280O0.f153a = C0161h.m1495m("/effectdata/109/img.png");
        } catch (Exception unused) {
            C0105d.m365M().mo215C0(this.f2275G);
        }
        C0010f fVar = f1280O0;
        this.f2327u = fVar.f158f;
        this.f2328v = fVar.f159g;
    }

    /* renamed from: O */
    public void mo358O(C0114e[] eVarArr, int[] iArr, byte b) {
        this.f2321o = 3;
        this.f1285E0 = eVarArr;
        this.f1286F0 = iArr;
        this.f1287G0 = b;
        this.f1301x0 = 0;
    }

    /* renamed from: a */
    public int mo174a() {
        return 50;
    }

    /* renamed from: b */
    public void mo175b() {
        if (this.f2321o == 5) {
            this.f2321o = 2;
            this.f2324r = 0;
            this.f2323q = 0;
            this.f2322p = 0;
        }
    }

    /* renamed from: c */
    public int mo176c() {
        return this.f2315k;
    }

    /* renamed from: d */
    public boolean mo177d() {
        int i = this.f2321o;
        return i == 0 || i == 1;
    }

    /* renamed from: e */
    public void mo332e(C0137v vVar) {
        this.f2276H = null;
        this.f2322p = 0;
        this.f2323q = 0;
        this.f2321o = 3;
        this.f1301x0 = 0;
        int i = vVar.f2315k;
        int i2 = this.f2315k;
        this.f2319m = i > i2 ? 1 : -1;
        int i3 = vVar.f2317l;
        if (C0111c0.m574a(i - i2) >= this.f2327u * 2 || C0111c0.m574a(i3 - this.f2317l) >= this.f2328v * 2) {
            this.f2324r = 1;
            return;
        }
        this.f2315k = this.f2315k < i ? i - this.f2327u : i + this.f2327u;
        this.f2324r = 0;
    }

    /* renamed from: f */
    public int mo178f() {
        return 40;
    }

    /* renamed from: g */
    public int mo179g() {
        return this.f2317l - 50;
    }

    /* renamed from: i */
    public void mo333i(int[] iArr) {
        int i = this.f1301x0 + 1;
        this.f1301x0 = i;
        if (i > iArr.length - 1) {
            this.f1301x0 = 0;
        }
        this.f1302y0 = iArr[this.f1301x0];
    }

    /* renamed from: j */
    public boolean mo334j() {
        return this.f2281M || this.f2280L > 0;
    }

    /* renamed from: k */
    public void mo335k() {
        this.f2295a = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = r4.f2317l;
        r1 = p013g.C0126k.f2032u1;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo336u() {
        /*
            r4 = this;
            int r0 = r4.f2315k
            int r1 = p013g.C0126k.f2028t1
            r2 = 0
            if (r0 >= r1) goto L_0x0008
            return r2
        L_0x0008:
            int r3 = p013g.C0126k.f1975i1
            int r1 = r1 + r3
            if (r0 <= r1) goto L_0x000e
            return r2
        L_0x000e:
            int r0 = r4.f2317l
            int r1 = p013g.C0126k.f2032u1
            if (r0 >= r1) goto L_0x0015
            return r2
        L_0x0015:
            int r3 = p013g.C0126k.f1980j1
            int r1 = r1 + r3
            int r1 = r1 + 30
            if (r0 <= r1) goto L_0x001d
            return r2
        L_0x001d:
            int r0 = r4.f2321o
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0110c.mo336u():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo337v() {
        int i = this.f2275G;
        return (i >= 58 && i <= 65) || i == 67 || i == 68;
    }

    /* renamed from: w */
    public boolean mo338w() {
        return this.f2321o != 0;
    }

    /* renamed from: x */
    public void mo339x(C0159f fVar) {
        C0159f fVar2 = fVar;
        if (f1280O0 != null) {
            if (this.f1300w0 && this.f2321o != 0) {
                m546y(fVar);
            }
            fVar2.mo773E(0, C0145a.f2595L0);
            f1280O0.mo23b(fVar, this.f1302y0, this.f2315k, this.f1303z0 + this.f2317l, this.f2319m == 1 ? 0 : 1, 2);
            fVar2.mo773E(0, -C0145a.f2595L0);
            int i = (int) ((((long) this.f2311i) * 50) / ((long) this.f2313j));
            if (i != 0) {
                fVar2.mo772D(0);
                fVar2.mo783l(this.f2315k - 27, this.f2317l - 112, 54, 8);
                fVar2.mo772D(16711680);
                fVar2.mo783l(this.f2315k - 25, this.f2317l - 110, i, 4);
            }
            if (this.f1293M0) {
                this.f1284D0++;
                C0007c.m43a(new C0009e(this.f1287G0 == 2 ? 19 : 22, (this.f1284D0 * 50) + this.f2315k, this.f2317l + 25, 2, 1, -1));
                C0007c.m43a(new C0009e(this.f1287G0 == 2 ? 19 : 22, this.f2315k - (this.f1284D0 * 50), this.f2317l + 25, 2, 1, -1));
                if (this.f1284D0 == 50) {
                    this.f1284D0 = 0;
                    this.f1293M0 = false;
                }
            }
        }
    }

    /* renamed from: z */
    public void mo340z() {
    }
}
