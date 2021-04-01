package p013g;

import p001b.C0007c;
import p001b.C0009e;
import p001b.C0010f;
import p001b.C0020p;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: g.a */
public class C0106a extends C0137v implements C0128m {

    /* renamed from: J0 */
    public static C0143b f1155J0 = C0161h.m1494l("/mainImage/shadowBig.png");

    /* renamed from: K0 */
    public static C0010f f1156K0;

    /* renamed from: A0 */
    int f1157A0;

    /* renamed from: B0 */
    C0114e[] f1158B0;

    /* renamed from: C0 */
    int[] f1159C0;

    /* renamed from: D0 */
    byte f1160D0;

    /* renamed from: E0 */
    public int[] f1161E0 = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};

    /* renamed from: F0 */
    public int[] f1162F0 = {0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4, 4};

    /* renamed from: G0 */
    public int[] f1163G0 = {0, 0, 0, 4, 4, 4, 5, 5, 5, 6, 6, 6};

    /* renamed from: H0 */
    public int[] f1164H0 = {0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11};

    /* renamed from: I0 */
    private boolean f1165I0;

    /* renamed from: q0 */
    public int f1166q0;

    /* renamed from: r0 */
    public int f1167r0;

    /* renamed from: s0 */
    public int f1168s0;

    /* renamed from: t0 */
    public int f1169t0;

    /* renamed from: u0 */
    boolean f1170u0;

    /* renamed from: v0 */
    int f1171v0;

    /* renamed from: w0 */
    public boolean f1172w0 = true;

    /* renamed from: x0 */
    int f1173x0;

    /* renamed from: y0 */
    int f1174y0;

    /* renamed from: z0 */
    int f1175z0;

    static {
        C0161h.m1494l("/mainImage/myTexture2dmobHP.png");
    }

    public C0106a(int i, short s, short s2, int i2, int i3, int i4, int i5) {
        this.f2331y = i;
        int i6 = s + 20;
        this.f2315k = i6;
        this.f2317l = s2;
        this.f1166q0 = i6;
        this.f1167r0 = s2;
        mo329N();
        this.f2313j = i4;
        this.f2311i = i3;
        this.f2275G = i2;
        this.f2321o = 2;
    }

    /* renamed from: H */
    private void m476H() {
    }

    /* renamed from: J */
    private void m477J() {
        mo333i(this.f1161E0);
        int i = this.f2315k;
        int i2 = this.f1166q0;
        if (i != i2 || this.f2317l != this.f1167r0) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f1167r0 - i3) / 4);
        }
    }

    /* renamed from: L */
    private void m478L() {
        int i;
        byte b = C0121h0.f1796o;
        int i2 = this.f2315k;
        this.f1168s0 = i2;
        this.f1171v0 = 0;
        int i3 = this.f1169t0;
        if (i3 > 0 && !C0121h0.m841u(i2, i3, 2)) {
            if (C0121h0.m840t(this.f1168s0 / b, this.f1169t0 / b) == 0) {
                this.f1170u0 = true;
            } else if (C0121h0.m840t(this.f1168s0 / b, this.f1169t0 / b) != 0 && !C0121h0.m841u(this.f1168s0, this.f1169t0, 2)) {
                this.f1168s0 = this.f2315k;
                this.f1169t0 = this.f2317l;
                this.f1170u0 = false;
            }
            while (this.f1170u0 && (i = this.f1171v0) < 10) {
                this.f1171v0 = i + 1;
                int i4 = this.f1169t0 + 24;
                this.f1169t0 = i4;
                if (C0121h0.m841u(this.f1168s0, i4, 2)) {
                    int i5 = this.f1169t0;
                    if (i5 % 24 != 0) {
                        this.f1169t0 = i5 - (i5 % 24);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: Q */
    private void m479Q() {
        mo333i(this.f1161E0);
        if (C0145a.f2600O % 5 == 0) {
            C0020p.m96c(167, C0111c0.m587n(this.f2315k - (mo174a() / 2), this.f2315k + (mo174a() / 2)), C0111c0.m587n(mo179g() + (mo178f() / 2), mo179g() + mo178f()), 1);
        }
        int i = this.f2315k;
        int i2 = this.f1166q0;
        if (i != i2 || this.f2317l != this.f1167r0) {
            this.f2315k = i + ((i2 - i) / 4);
            int i3 = this.f2317l;
            this.f2317l = i3 + ((this.f1167r0 - i3) / 4);
        }
    }

    /* renamed from: y */
    private void m480y(C0159f fVar) {
        byte b = C0121h0.f1796o;
        fVar.mo776e(f1155J0, this.f1168s0, this.f2326t, 3);
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
        this.f1173x0 = 0;
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
            m478L();
            int i = this.f2321o;
            if (i == 0 || i == 1) {
                m479Q();
            } else if (i == 2) {
                m477J();
            } else if (i == 3) {
                mo326I();
            } else if (i == 5) {
                this.f2330x = 0;
                mo327K();
            } else if (i == 6) {
                this.f2330x = 0;
                int i2 = this.f2322p + 1;
                this.f2322p = i2;
                int i3 = this.f2317l + i2;
                this.f2317l = i3;
                int i4 = this.f2326t;
                if (i3 >= i4) {
                    this.f2317l = i4;
                    this.f2322p = 0;
                    this.f2321o = 5;
                }
            } else if (i == 7) {
                m476H();
            }
        }
    }

    /* renamed from: I */
    public void mo326I() {
        int i = -1;
        if (this.f1160D0 == 3) {
            int i2 = this.f1173x0;
            int[] iArr = this.f1163G0;
            if (i2 == iArr.length - 1) {
                this.f2321o = 2;
            }
            this.f2319m = this.f2315k < this.f1158B0[0].f1593n ? 1 : -1;
            mo333i(iArr);
            int i3 = this.f2315k;
            C0114e[] eVarArr = this.f1158B0;
            int i4 = i3 + ((eVarArr[0].f1593n - i3) / 4);
            this.f2315k = i4;
            int i5 = this.f2317l;
            this.f2317l = i5 + ((eVarArr[0].f1598o - i5) / 4);
            this.f1166q0 = i4;
            if (this.f1173x0 == 8) {
                int i6 = 0;
                while (true) {
                    C0114e[] eVarArr2 = this.f1158B0;
                    if (i6 >= eVarArr2.length) {
                        break;
                    }
                    eVarArr2[i6].mo467z(this.f1159C0[i6], 0, false, false);
                    C0114e[] eVarArr3 = this.f1158B0;
                    C0020p.m96c(102, eVarArr3[i6].f1593n, eVarArr3[i6].f1598o, 1);
                    i6++;
                }
            }
        }
        if (this.f1160D0 == 4) {
            int i7 = this.f1173x0;
            int[] iArr2 = this.f1164H0;
            if (i7 == iArr2.length - 1) {
                this.f2321o = 2;
            }
            if (this.f2315k < this.f1158B0[0].f1593n) {
                i = 1;
            }
            this.f2319m = i;
            mo333i(iArr2);
            if (this.f1173x0 == 8) {
                int i8 = 0;
                while (true) {
                    C0114e[] eVarArr4 = this.f1158B0;
                    if (i8 < eVarArr4.length) {
                        eVarArr4[i8].mo467z(this.f1159C0[i8], 0, false, false);
                        C0114e[] eVarArr5 = this.f1158B0;
                        C0020p.m96c(102, eVarArr5[i8].f1593n, eVarArr5[i8].f1598o, 1);
                        i8++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void mo327K() {
        mo333i(this.f1162F0);
        int i = this.f2315k;
        int i2 = this.f1166q0;
        int i3 = i + (i < i2 ? 2 : -2);
        this.f2315k = i3;
        this.f2317l = this.f1167r0;
        this.f2319m = i3 < i2 ? 1 : -1;
        if (C0111c0.m574a(i3 - i2) <= 1) {
            this.f2315k = this.f1166q0;
            this.f2321o = 2;
        }
    }

    /* renamed from: M */
    public void mo328M() {
    }

    /* renamed from: N */
    public void mo329N() {
        f1156K0 = null;
        f1156K0 = new C0010f();
        try {
            f1156K0.mo27f("/x" + C0159f.f2750b + "/effectdata/" + 108 + "/data");
            f1156K0.f153a = C0161h.m1495m("/effectdata/108/img.png");
        } catch (Exception unused) {
            C0105d.m365M().mo215C0(this.f2275G);
        }
        C0010f fVar = f1156K0;
        this.f2327u = fVar.f158f;
        this.f2328v = fVar.f159g;
    }

    /* renamed from: O */
    public void mo330O(short s) {
        this.f1166q0 = s;
        this.f2321o = 5;
    }

    /* renamed from: P */
    public void mo331P(C0114e[] eVarArr, int[] iArr, byte b) {
        this.f1158B0 = eVarArr;
        this.f1159C0 = iArr;
        this.f1160D0 = b;
        this.f2321o = 3;
    }

    /* renamed from: a */
    public int mo174a() {
        return 40;
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
        this.f1173x0 = 0;
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
        return this.f2317l - 40;
    }

    /* renamed from: i */
    public void mo333i(int[] iArr) {
        int i = this.f1173x0 + 1;
        this.f1173x0 = i;
        if (i > iArr.length - 1) {
            this.f1173x0 = 0;
        }
        this.f1174y0 = iArr[this.f1173x0];
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
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0106a.mo336u():boolean");
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
        if (f1156K0 != null) {
            if (this.f1172w0 && this.f2321o != 0) {
                m480y(fVar);
            }
            fVar2.mo773E(0, C0145a.f2595L0);
            f1156K0.mo23b(fVar, this.f1174y0, this.f2315k, this.f1175z0 + this.f2317l, this.f2319m == 1 ? 0 : 1, 2);
            fVar2.mo773E(0, -C0145a.f2595L0);
            int i = (int) ((((long) this.f2311i) * 50) / ((long) this.f2313j));
            if (i != 0) {
                fVar2.mo772D(0);
                fVar2.mo783l(this.f2315k - 27, this.f2317l - 82, 54, 8);
                fVar2.mo772D(16711680);
                fVar2.mo783l(this.f2315k - 25, this.f2317l - 80, i, 4);
            }
            if (this.f1165I0) {
                this.f1157A0++;
                C0007c.m43a(new C0009e(this.f1160D0 == 2 ? 19 : 22, (this.f1157A0 * 50) + this.f2315k, this.f2317l + 25, 2, 1, -1));
                C0007c.m43a(new C0009e(this.f1160D0 == 2 ? 19 : 22, this.f2315k - (this.f1157A0 * 50), this.f2317l + 25, 2, 1, -1));
                if (this.f1157A0 == 50) {
                    this.f1157A0 = 0;
                    this.f1165I0 = false;
                }
            }
        }
    }

    /* renamed from: z */
    public void mo340z() {
    }
}
