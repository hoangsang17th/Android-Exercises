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

/* renamed from: g.d */
public class C0112d extends C0137v implements C0128m {

    /* renamed from: S0 */
    public static C0143b f1310S0 = C0161h.m1494l("/mainImage/shadowBig.png");

    /* renamed from: T0 */
    public static C0010f f1311T0;

    /* renamed from: A0 */
    int f1312A0;

    /* renamed from: B0 */
    boolean f1313B0;

    /* renamed from: C0 */
    boolean f1314C0;

    /* renamed from: D0 */
    int f1315D0;

    /* renamed from: E0 */
    int f1316E0;

    /* renamed from: F0 */
    C0114e[] f1317F0;

    /* renamed from: G0 */
    int[] f1318G0;

    /* renamed from: H0 */
    byte f1319H0;

    /* renamed from: I0 */
    public int[] f1320I0 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};

    /* renamed from: J0 */
    public int[] f1321J0 = {37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};

    /* renamed from: K0 */
    public int[] f1322K0 = {0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 1, 1};

    /* renamed from: L0 */
    public int[] f1323L0 = {0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 21, 23, 23};

    /* renamed from: M0 */
    public int[] f1324M0 = {0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};

    /* renamed from: N0 */
    public int[] f1325N0 = {37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};

    /* renamed from: O0 */
    public int[] f1326O0 = {37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};

    /* renamed from: P0 */
    public int[] f1327P0 = {8, 8, 9, 9, 10, 10, 12, 12};

    /* renamed from: Q0 */
    public int[] f1328Q0 = {0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};

    /* renamed from: R0 */
    private boolean f1329R0;

    /* renamed from: q0 */
    public int f1330q0;

    /* renamed from: r0 */
    public int f1331r0;

    /* renamed from: s0 */
    public boolean f1332s0;

    /* renamed from: t0 */
    public int f1333t0;

    /* renamed from: u0 */
    public int f1334u0;

    /* renamed from: v0 */
    boolean f1335v0;

    /* renamed from: w0 */
    int f1336w0;

    /* renamed from: x0 */
    public boolean f1337x0 = true;

    /* renamed from: y0 */
    int f1338y0;

    /* renamed from: z0 */
    int f1339z0;

    static {
        C0161h.m1494l("/mainImage/myTexture2dmobHP.png");
    }

    public C0112d(int i, short s, short s2, int i2, int i3, int i4, int i5) {
        int i6 = s + 20;
        this.f2315k = i6;
        this.f2325s = i6;
        this.f2317l = s2;
        this.f2326t = s2;
        this.f2331y = i;
        if (i5 == 0) {
            mo359N();
        }
        if (i5 == 1) {
            mo360O();
        }
        if (i5 == 2) {
            mo360O();
            this.f1332s0 = true;
        }
        this.f2311i = i3;
        this.f2313j = i4;
        this.f2275G = i2;
        this.f2321o = 2;
    }

    /* renamed from: H */
    private void m593H() {
    }

    /* renamed from: J */
    private void m594J() {
        mo333i(this.f1332s0 ? this.f1321J0 : this.f1320I0);
        int i = this.f2315k;
        int i2 = this.f2325s;
        if (i != i2 || this.f2317l != this.f2326t) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f2326t - i3) / 4);
        }
    }

    /* renamed from: L */
    private void m595L() {
        int i;
        byte b = C0121h0.f1796o;
        int i2 = this.f2315k;
        this.f1333t0 = i2;
        this.f1336w0 = 0;
        int i3 = this.f1334u0;
        if (i3 > 0 && !C0121h0.m841u(i2, i3, 2)) {
            if (C0121h0.m840t(this.f1333t0 / b, this.f1334u0 / b) == 0) {
                this.f1335v0 = true;
            } else if (C0121h0.m840t(this.f1333t0 / b, this.f1334u0 / b) != 0 && !C0121h0.m841u(this.f1333t0, this.f1334u0, 2)) {
                this.f1333t0 = this.f2315k;
                this.f1334u0 = this.f2317l;
                this.f1335v0 = false;
            }
            while (this.f1335v0 && (i = this.f1336w0) < 10) {
                this.f1336w0 = i + 1;
                int i4 = this.f1334u0 + 24;
                this.f1334u0 = i4;
                if (C0121h0.m841u(this.f1333t0, i4, 2)) {
                    int i5 = this.f1334u0;
                    if (i5 % 24 != 0) {
                        this.f1334u0 = i5 - (i5 % 24);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: R */
    private void m596R() {
        mo333i(this.f1332s0 ? this.f1321J0 : this.f1320I0);
        if (C0145a.f2600O % 5 == 0) {
            C0020p.m96c(167, C0111c0.m587n(this.f2315k - (mo174a() / 2), this.f2315k + (mo174a() / 2)), C0111c0.m587n(mo179g() + (mo178f() / 2), mo179g() + mo178f()), 1);
        }
        int i = this.f2315k;
        int i2 = this.f2325s;
        if (i != i2 || this.f2317l != this.f2326t) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f2326t - i3) / 4);
        }
    }

    /* renamed from: S */
    private void m597S() {
        if (this.f1313B0) {
            int i = this.f1315D0 + 1;
            this.f1315D0 = i;
            this.f2317l -= i;
            mo333i(this.f1327P0);
            if (this.f2317l <= -500) {
                this.f1313B0 = false;
                this.f1314C0 = true;
                this.f1315D0 = 0;
            }
        }
        if (this.f1314C0) {
            this.f2315k = this.f1330q0;
            int i2 = this.f1315D0 + 2;
            this.f1315D0 = i2;
            this.f2317l += i2;
            mo333i(this.f1328Q0);
            int i3 = this.f2317l;
            int i4 = this.f2326t;
            if (i3 > i4) {
                this.f2317l = i4;
                this.f1314C0 = false;
                this.f1315D0 = 0;
                this.f2321o = 2;
                C0126k.f2023r4 = 10;
                this.f1329R0 = true;
            }
        }
    }

    /* renamed from: y */
    private void m598y(C0159f fVar) {
        byte b = C0121h0.f1796o;
        fVar.mo776e(f1310S0, this.f1333t0, this.f2326t, 3);
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
        this.f1338y0 = 0;
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
            m595L();
            switch (this.f2321o) {
                case 0:
                case 1:
                    m596R();
                    return;
                case 2:
                    m594J();
                    return;
                case 3:
                    mo326I();
                    return;
                case 4:
                    this.f2330x = 0;
                    m597S();
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
                    m593H();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: I */
    public void mo326I() {
        if (this.f1319H0 == 7) {
            if (this.f1338y0 > 8) {
                this.f1338y0 = 8;
            }
            mo333i(this.f1322K0);
            if (C0145a.f2600O % 4 == 0) {
                C0020p.m96c(70, this.f2315k + (this.f2319m == 1 ? 15 : -15), this.f2317l - 40, 1);
            }
        }
        int i = -1;
        if (this.f1319H0 == 0) {
            int i2 = this.f1338y0;
            int[] iArr = this.f1322K0;
            if (i2 == iArr.length - 1) {
                this.f2321o = 2;
            }
            this.f2319m = this.f2315k < this.f1317F0[0].f1593n ? 1 : -1;
            mo333i(iArr);
            if (this.f1338y0 == 8) {
                int i3 = 0;
                while (true) {
                    C0114e[] eVarArr = this.f1317F0;
                    if (i3 >= eVarArr.length) {
                        break;
                    }
                    C0019o.m91c(this.f2315k + (this.f2319m == 1 ? 45 : -45), this.f2317l - 30, true, this.f1318G0[i3], 0, eVarArr[i3], 24);
                    i3++;
                }
            }
        }
        if (this.f1319H0 == 1) {
            int i4 = this.f1338y0;
            boolean z = this.f1332s0;
            if (i4 == (z ? this.f1325N0.length : this.f1323L0.length) - 1) {
                this.f2321o = 2;
            }
            this.f2319m = this.f2315k < this.f1317F0[0].f1593n ? 1 : -1;
            mo333i(z ? this.f1325N0 : this.f1323L0);
            int i5 = this.f2315k;
            C0114e[] eVarArr2 = this.f1317F0;
            this.f2315k = i5 + ((eVarArr2[0].f1593n - i5) / 4);
            int i6 = this.f2317l;
            this.f2317l = i6 + ((eVarArr2[0].f1598o - i6) / 4);
            if (this.f1338y0 == 18) {
                int i7 = 0;
                while (true) {
                    C0114e[] eVarArr3 = this.f1317F0;
                    if (i7 >= eVarArr3.length) {
                        break;
                    }
                    eVarArr3[i7].mo467z(this.f1318G0[i7], 0, false, false);
                    C0114e[] eVarArr4 = this.f1317F0;
                    C0020p.m96c(102, eVarArr4[i7].f1593n, eVarArr4[i7].f1598o, 1);
                    i7++;
                }
            }
        }
        if (this.f1319H0 == 2) {
            int i8 = this.f1338y0;
            boolean z2 = this.f1332s0;
            if (i8 == (z2 ? this.f1326O0.length : this.f1324M0.length) - 1) {
                this.f2321o = 2;
            }
            if (this.f2315k < this.f1317F0[0].f1593n) {
                i = 1;
            }
            this.f2319m = i;
            mo333i(z2 ? this.f1326O0 : this.f1324M0);
            if (this.f1338y0 == 13) {
                C0126k.f2023r4 = 10;
                this.f1329R0 = true;
                int i9 = 0;
                while (true) {
                    C0114e[] eVarArr5 = this.f1317F0;
                    if (i9 < eVarArr5.length) {
                        eVarArr5[i9].mo467z(this.f1318G0[i9], 0, false, false);
                        i9++;
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
    public void mo359N() {
        f1311T0 = null;
        f1311T0 = new C0010f();
        try {
            f1311T0.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 101 + "/data");
            f1311T0.f153a = C0161h.m1495m("/effectdata/101/img.png");
        } catch (Exception unused) {
            C0105d.m365M().mo215C0(this.f2275G);
        }
        C0010f fVar = f1311T0;
        this.f2327u = fVar.f158f;
        this.f2328v = fVar.f159g;
    }

    /* renamed from: O */
    public void mo360O() {
        f1311T0 = null;
        f1311T0 = new C0010f();
        try {
            f1311T0.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 100 + "/data");
            f1311T0.f153a = C0161h.m1495m("/effectdata/100/img.png");
        } catch (Exception unused) {
            C0105d.m365M().mo215C0(this.f2275G);
        }
        this.f2321o = 2;
        C0010f fVar = f1311T0;
        this.f2327u = fVar.f158f;
        this.f2328v = fVar.f159g;
    }

    /* renamed from: P */
    public void mo361P(C0114e[] eVarArr, int[] iArr, byte b) {
        this.f1317F0 = eVarArr;
        this.f1318G0 = iArr;
        this.f1319H0 = b;
        this.f1338y0 = 0;
        if (b < 3) {
            this.f2321o = 3;
        }
        if (b == 3) {
            this.f1313B0 = true;
            this.f2321o = 4;
        }
        if (b == 4) {
            int i = 0;
            while (true) {
                C0114e[] eVarArr2 = this.f1317F0;
                if (i >= eVarArr2.length) {
                    break;
                }
                eVarArr2[i].mo467z(this.f1318G0[i], 0, false, false);
                i++;
            }
        }
        if (b == 7) {
            this.f2321o = 3;
        }
    }

    /* renamed from: Q */
    public void mo362Q() {
        this.f2321o = 4;
        this.f1313B0 = true;
    }

    /* renamed from: a */
    public int mo174a() {
        return 60;
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
        this.f1338y0 = 0;
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
        return this.f1332s0 ? this.f2317l - 20 : this.f2317l - 60;
    }

    /* renamed from: i */
    public void mo333i(int[] iArr) {
        int i = this.f1338y0 + 1;
        this.f1338y0 = i;
        if (i > iArr.length - 1) {
            this.f1338y0 = 0;
        }
        this.f1339z0 = iArr[this.f1338y0];
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
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0112d.mo336u():boolean");
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
        if (f1311T0 != null) {
            if (this.f1337x0 && this.f2321o != 0) {
                m598y(fVar);
            }
            fVar2.mo773E(0, C0145a.f2595L0);
            f1311T0.mo23b(fVar, this.f1339z0, this.f2315k, this.f1312A0 + this.f2317l, this.f2319m == 1 ? 0 : 1, 2);
            fVar2.mo773E(0, -C0145a.f2595L0);
            int i = (int) ((((long) this.f2311i) * 50) / ((long) this.f2313j));
            if (i != 0) {
                fVar2.mo772D(0);
                fVar2.mo783l(this.f2315k - 27, this.f2317l - 112, 54, 8);
                fVar2.mo772D(16711680);
                fVar2.mo783l(this.f2315k - 25, this.f2317l - 110, i, 4);
            }
            if (this.f1329R0) {
                this.f1316E0++;
                C0007c.m43a(new C0009e(this.f1319H0 == 2 ? 19 : 22, (this.f1316E0 * 50) + this.f2315k, this.f2317l + 25, 2, 1, -1));
                C0007c.m43a(new C0009e(this.f1319H0 == 2 ? 19 : 22, this.f2315k - (this.f1316E0 * 50), this.f2317l + 25, 2, 1, -1));
                if (this.f1316E0 == 50) {
                    this.f1316E0 = 0;
                    this.f1329R0 = false;
                }
            }
        }
    }

    /* renamed from: z */
    public void mo340z() {
    }
}
