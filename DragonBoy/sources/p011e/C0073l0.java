package p011e;

import p013g.C0111c0;
import p018i.C0145a;

/* renamed from: e.l0 */
public class C0073l0 {

    /* renamed from: a */
    public int f871a;

    /* renamed from: b */
    public int f872b;

    /* renamed from: c */
    public int f873c;

    /* renamed from: d */
    public int f874d;

    /* renamed from: e */
    public int f875e;

    /* renamed from: f */
    public int f876f;

    /* renamed from: g */
    public int f877g;

    /* renamed from: h */
    public int f878h;

    /* renamed from: i */
    public int f879i;

    /* renamed from: j */
    public int f880j;

    /* renamed from: k */
    public int f881k;

    /* renamed from: l */
    public int f882l;

    /* renamed from: m */
    public int f883m;

    /* renamed from: n */
    public int f884n;

    /* renamed from: o */
    private int f885o;

    /* renamed from: p */
    private int f886p;

    /* renamed from: q */
    private int[] f887q = new int[3];

    /* renamed from: r */
    public boolean f888r;

    /* renamed from: s */
    public boolean f889s;

    /* renamed from: t */
    private int f890t;

    /* renamed from: u */
    public int f891u;

    /* renamed from: v */
    public int f892v;

    /* renamed from: w */
    public int f893w;

    /* renamed from: x */
    public boolean f894x = true;

    /* renamed from: e */
    private C0075m0 m264e() {
        int i;
        int i2 = this.f879i;
        int i3 = this.f880j;
        int i4 = this.f881k;
        int i5 = this.f882l;
        boolean z = true;
        boolean z2 = false;
        if (C0145a.f2578D) {
            if (!this.f888r && C0145a.m1335E(i2, i3, i4, i5)) {
                int i6 = 0;
                while (true) {
                    int[] iArr = this.f887q;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    iArr[0] = C0145a.f2586H;
                    i6++;
                }
                this.f886p = C0145a.f2586H;
                this.f888r = true;
                this.f891u = -1;
                this.f889s = this.f890t != 0;
                this.f890t = 0;
            } else if (this.f888r) {
                int i7 = this.f885o + 1;
                this.f885o = i7;
                if (i7 > 5 && this.f886p == (i = C0145a.f2586H) && !this.f889s) {
                    this.f886p = -1000;
                    this.f891u = ((this.f871a + i) - i2) / this.f892v;
                }
                int i8 = C0145a.f2586H;
                int[] iArr2 = this.f887q;
                int i9 = i8 - iArr2[0];
                if (!(i9 == 0 || this.f891u == -1)) {
                    this.f891u = -1;
                }
                for (int length = iArr2.length - 1; length > 0; length--) {
                    int[] iArr3 = this.f887q;
                    iArr3[length] = iArr3[length - 1];
                }
                this.f887q[0] = C0145a.f2586H;
                int i10 = this.f871a - i9;
                this.f871a = i10;
                if (i10 < 0) {
                    this.f871a = 0;
                }
                int i11 = this.f871a;
                int i12 = this.f883m;
                if (i11 > i12) {
                    this.f871a = i12;
                }
                int i13 = this.f873c;
                if (i13 < 0 || i13 > i12) {
                    i9 /= 2;
                }
                this.f873c = i13 - i9;
            }
        }
        if (C0145a.f2582F && this.f888r) {
            C0145a.f2582F = false;
            if (C0111c0.m574a(C0145a.f2586H - this.f887q[0]) >= 20 || C0111c0.m574a(C0145a.f2586H - this.f886p) >= 20 || this.f889s) {
                int i14 = this.f891u;
                if (i14 == -1 || this.f885o <= 5) {
                    if (i14 == -1 && !this.f889s) {
                        int i15 = this.f873c;
                        if (i15 < 0) {
                            this.f871a = 0;
                        } else {
                            int i16 = this.f883m;
                            if (i15 > i16) {
                                this.f871a = i16;
                            } else {
                                int i17 = C0145a.f2586H;
                                int[] iArr4 = this.f887q;
                                int i18 = (i17 - iArr4[0]) + (iArr4[0] - iArr4[1]) + (iArr4[1] - iArr4[2]);
                                int i19 = -10;
                                if (i18 > 10) {
                                    i19 = 10;
                                } else if (i18 >= -10) {
                                    i19 = 0;
                                }
                                this.f890t = (-i19) * 100;
                            }
                        }
                    }
                    z = false;
                    this.f888r = false;
                    this.f885o = 0;
                    C0145a.f2582F = false;
                    z2 = z;
                }
            } else {
                this.f890t = 0;
                int i20 = this.f873c;
                this.f871a = i20;
                this.f886p = -1000;
                this.f891u = ((i20 + C0145a.f2586H) - i2) / this.f892v;
            }
            this.f885o = 0;
            this.f888r = false;
            this.f885o = 0;
            C0145a.f2582F = false;
            z2 = z;
        }
        C0075m0 m0Var = new C0075m0();
        m0Var.f912b = this.f891u;
        m0Var.f913c = z2;
        m0Var.f911a = this.f888r;
        return m0Var;
    }

    /* renamed from: f */
    private C0075m0 m265f(boolean z) {
        int i;
        int i2;
        int i3 = this.f879i;
        int i4 = this.f880j;
        int i5 = this.f881k;
        int i6 = this.f882l;
        boolean z2 = true;
        boolean z3 = false;
        if (C0145a.f2578D) {
            if (!this.f888r && C0145a.m1335E(i3, i4, i5, i6)) {
                int i7 = 0;
                while (true) {
                    int[] iArr = this.f887q;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    iArr[0] = C0145a.f2588I;
                    i7++;
                }
                this.f886p = C0145a.f2588I;
                this.f888r = true;
                if (!z) {
                    this.f891u = -1;
                }
                this.f889s = this.f890t != 0;
                this.f890t = 0;
            } else if (this.f888r) {
                int i8 = this.f885o + 1;
                this.f885o = i8;
                if (i8 > 5 && this.f886p == (i2 = C0145a.f2588I) && !this.f889s) {
                    this.f886p = -1000;
                    int i9 = this.f893w;
                    if (i9 > 1) {
                        int i10 = this.f892v;
                        this.f891u = ((((this.f872b + i2) - i4) / i10) * i9) + (((this.f871a + C0145a.f2586H) - i3) / i10);
                    } else {
                        this.f891u = ((this.f872b + i2) - i4) / this.f892v;
                    }
                }
                int i11 = C0145a.f2588I;
                int[] iArr2 = this.f887q;
                int i12 = i11 - iArr2[0];
                if (z) {
                    this.f891u = ((this.f872b + i11) - i4) / this.f892v;
                } else if (!(i12 == 0 || this.f891u == -1)) {
                    this.f891u = -1;
                }
                for (int length = iArr2.length - 1; length > 0; length--) {
                    int[] iArr3 = this.f887q;
                    iArr3[length] = iArr3[length - 1];
                }
                this.f887q[0] = C0145a.f2588I;
                int i13 = this.f872b - i12;
                this.f872b = i13;
                if (i13 < 0) {
                    this.f872b = 0;
                }
                int i14 = this.f872b;
                int i15 = this.f884n;
                if (i14 > i15) {
                    this.f872b = i15;
                }
                int i16 = this.f874d;
                if (i16 < 0 || i16 > i15) {
                    i12 /= 2;
                }
                this.f874d = i16 - i12;
            }
        }
        if (C0145a.f2582F && this.f888r) {
            C0145a.f2582F = false;
            if (C0111c0.m574a(C0145a.f2588I - this.f887q[0]) >= 20 || C0111c0.m574a(C0145a.f2588I - this.f886p) >= 20 || this.f889s) {
                int i17 = this.f891u;
                if (i17 == -1 || this.f885o <= 5) {
                    if ((i17 == -1 && !this.f889s) || (z && i17 != -1 && !this.f889s)) {
                        int i18 = this.f874d;
                        if (i18 < 0) {
                            this.f872b = 0;
                        } else {
                            int i19 = this.f884n;
                            if (i18 > i19) {
                                this.f872b = i19;
                            } else {
                                int i20 = C0145a.f2588I;
                                int[] iArr4 = this.f887q;
                                int i21 = (i20 - iArr4[0]) + (iArr4[0] - iArr4[1]) + (iArr4[1] - iArr4[2]);
                                int i22 = -10;
                                if (i21 > 10) {
                                    i22 = 10;
                                } else if (i21 >= -10) {
                                    i22 = 0;
                                }
                                this.f890t = (-i22) * 100;
                            }
                        }
                    }
                    z2 = false;
                    this.f888r = false;
                    this.f885o = 0;
                    C0145a.f2582F = false;
                    z3 = z2;
                }
            } else {
                this.f890t = 0;
                int i23 = this.f874d;
                this.f872b = i23;
                this.f886p = -1000;
                int i24 = this.f893w;
                if (i24 > 1) {
                    int i25 = (i23 + C0145a.f2588I) - i4;
                    int i26 = this.f892v;
                    i = ((i25 / i26) * i24) + (((this.f871a + C0145a.f2586H) - i3) / i26);
                } else {
                    i = ((i23 + C0145a.f2588I) - i4) / this.f892v;
                }
                this.f891u = i;
            }
            this.f885o = 0;
            this.f888r = false;
            this.f885o = 0;
            C0145a.f2582F = false;
            z3 = z2;
        }
        C0075m0 m0Var = new C0075m0();
        m0Var.f912b = this.f891u;
        m0Var.f913c = z3;
        m0Var.f911a = this.f888r;
        return m0Var;
    }

    /* renamed from: a */
    public void mo157a() {
        this.f871a = 0;
        this.f872b = 0;
        this.f873c = 0;
        this.f874d = 0;
        this.f875e = 0;
        this.f876f = 0;
        this.f877g = 0;
        this.f878h = 0;
        this.f883m = 0;
        this.f884n = 0;
        this.f881k = 0;
        this.f882l = 0;
    }

    /* renamed from: b */
    public void mo158b(int i) {
        if (this.f894x) {
            int i2 = i - ((this.f882l - this.f892v) / 2);
            this.f872b = i2;
            if (i2 < 0) {
                this.f872b = 0;
            }
            int i3 = this.f872b;
            int i4 = this.f884n;
            if (i3 > i4) {
                this.f872b = i4;
                return;
            }
            return;
        }
        int i5 = i - ((this.f881k - this.f892v) / 2);
        this.f871a = i5;
        if (i5 < 0) {
            this.f871a = 0;
        }
        int i6 = this.f871a;
        int i7 = this.f883m;
        if (i6 > i7) {
            this.f871a = i7;
        }
    }

    /* renamed from: c */
    public void mo159c(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        this.f879i = i3;
        this.f880j = i4;
        this.f892v = i2;
        this.f881k = i5;
        this.f882l = i6;
        this.f894x = z;
        this.f893w = i7;
        if (z) {
            int i8 = i / i7;
            if (i % i7 != 0) {
                i8++;
            }
            this.f884n = (i8 * i2) - i6;
        } else {
            this.f883m = (i7 * i2) - i5;
        }
        if (this.f884n < 0) {
            this.f884n = 0;
        }
        if (this.f883m < 0) {
            this.f883m = 0;
        }
    }

    /* renamed from: d */
    public C0075m0 mo160d() {
        return this.f894x ? m265f(false) : m264e();
    }

    /* renamed from: g */
    public void mo161g() {
        int i = this.f890t;
        if (i != 0 && !this.f888r) {
            if (this.f894x) {
                int i2 = this.f872b + (i / 100);
                this.f872b = i2;
                if (i2 < 0) {
                    this.f872b = 0;
                } else {
                    int i3 = this.f884n;
                    if (i2 > i3) {
                        this.f872b = i3;
                    } else {
                        this.f874d = i2;
                    }
                }
            } else {
                int i4 = this.f871a + (i / 100);
                this.f871a = i4;
                if (i4 < 0) {
                    this.f871a = 0;
                } else {
                    int i5 = this.f883m;
                    if (i4 > i5) {
                        this.f871a = i5;
                    } else {
                        this.f873c = i4;
                    }
                }
            }
            int i6 = (i * 9) / 10;
            this.f890t = i6;
            if (i6 < 100 && i6 > -100) {
                this.f890t = 0;
            }
        }
        int i7 = this.f873c;
        int i8 = this.f871a;
        if (i7 != i8 && !this.f888r) {
            int i9 = (i8 - i7) << 2;
            this.f875e = i9;
            int i10 = this.f877g + i9;
            this.f877g = i10;
            this.f873c = i7 + (i10 >> 4);
            this.f877g = i10 & 15;
        }
        int i11 = this.f874d;
        int i12 = this.f872b;
        if (i11 != i12 && !this.f888r) {
            int i13 = (i12 - i11) << 2;
            this.f876f = i13;
            int i14 = this.f878h + i13;
            this.f878h = i14;
            this.f874d = i11 + (i14 >> 4);
            this.f878h = i14 & 15;
        }
    }
}
