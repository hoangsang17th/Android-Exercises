package p001b;

import p013g.C0111c0;
import p013g.C0121h0;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;

/* renamed from: b.a */
public class C0005a {

    /* renamed from: A */
    public static int[] f45A;

    /* renamed from: B */
    public static C0143b f46B;

    /* renamed from: C */
    public static C0143b f47C;

    /* renamed from: D */
    public static C0143b f48D;

    /* renamed from: E */
    public static C0143b f49E;

    /* renamed from: F */
    private static C0143b f50F;

    /* renamed from: G */
    private static C0143b f51G;

    /* renamed from: H */
    private static C0143b f52H;

    /* renamed from: I */
    private static C0143b f53I;

    /* renamed from: J */
    public static C0143b f54J = C0161h.m1494l("/mainImage/myTexture2dwater1.png");

    /* renamed from: K */
    public static C0143b f55K = C0161h.m1494l("/mainImage/myTexture2dwater2.png");

    /* renamed from: L */
    public static C0143b f56L;

    /* renamed from: M */
    public static C0143b f57M;

    /* renamed from: N */
    public static boolean f58N;

    /* renamed from: O */
    public static boolean f59O;

    /* renamed from: P */
    public static int f60P;

    /* renamed from: Q */
    public static C0143b f61Q;

    /* renamed from: R */
    public static C0143b f62R;

    /* renamed from: S */
    public static int f63S;

    /* renamed from: T */
    public static int f64T;

    /* renamed from: U */
    public static int f65U;

    /* renamed from: V */
    public static int f66V;

    /* renamed from: z */
    public static C0173i f67z = new C0173i("vBG Effect");

    /* renamed from: a */
    int[] f68a;

    /* renamed from: b */
    int[] f69b;

    /* renamed from: c */
    int[] f70c;

    /* renamed from: d */
    int[] f71d;

    /* renamed from: e */
    int f72e;

    /* renamed from: f */
    private int f73f;

    /* renamed from: g */
    private int f74g;

    /* renamed from: h */
    private int f75h;

    /* renamed from: i */
    private int f76i;

    /* renamed from: j */
    private int f77j;

    /* renamed from: k */
    private int f78k;

    /* renamed from: l */
    private int f79l;

    /* renamed from: m */
    private int f80m;

    /* renamed from: n */
    boolean f81n;

    /* renamed from: o */
    int[] f82o;

    /* renamed from: p */
    private int f83p;

    /* renamed from: q */
    public int f84q;

    /* renamed from: r */
    boolean[] f85r;

    /* renamed from: s */
    int[] f86s;

    /* renamed from: t */
    int[] f87t;

    /* renamed from: u */
    boolean[] f88u;

    /* renamed from: v */
    int f89v;

    /* renamed from: w */
    int f90w;

    /* renamed from: x */
    int[] f91x = {0, 1, 2, 1, 0, 0};

    /* renamed from: y */
    int[] f92y;

    public C0005a(int i) {
        this.f84q = i;
        switch (i) {
            case 0:
            case 12:
                if (f46B == null) {
                    f46B = C0161h.m1496n("/bg/mua.png");
                }
                if (f47C == null) {
                    f47C = C0161h.m1496n("/bg/mua1.png");
                }
                if (f48D == null) {
                    f48D = C0161h.m1496n("/bg/mua2.png");
                }
                int i2 = C0145a.f2614V;
                int n = C0111c0.m587n(i2 / 3, i2 / 2);
                this.f83p = n;
                this.f68a = new int[n];
                this.f69b = new int[n];
                this.f70c = new int[n];
                this.f71d = new int[n];
                this.f82o = new int[n];
                this.f87t = new int[n];
                this.f86s = new int[n];
                this.f85r = new boolean[n];
                this.f88u = new boolean[n];
                for (int i3 = 0; i3 < this.f83p; i3++) {
                    this.f69b[i3] = C0111c0.m587n(-10, C0145a.f2616W + 100) + C0126k.f2032u1;
                    this.f68a[i3] = C0111c0.m587n(-10, C0145a.f2614V + 300) + C0126k.f2028t1;
                    this.f87t[i3] = C0111c0.m587n(0, 1);
                    this.f70c[i3] = -12;
                    this.f71d[i3] = 12;
                    this.f82o[i3] = C0111c0.m587n(1, 3);
                    boolean[] zArr = this.f85r;
                    zArr[i3] = false;
                    if (this.f82o[i3] == 2 && i3 % 2 == 0) {
                        zArr[i3] = true;
                    }
                    this.f88u[i3] = false;
                    this.f86s[i3] = C0111c0.m587n(1, 2);
                }
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 11:
                if (i == 1) {
                    f50F = C0161h.m1496n("/bg/lacay.png");
                }
                if (this.f84q == 2) {
                    f50F = C0161h.m1496n("/bg/lacay2.png");
                }
                if (this.f84q == 5) {
                    f50F = C0161h.m1496n("/bg/lacay3.png");
                }
                if (this.f84q == 6) {
                    f50F = C0161h.m1496n("/bg/lacay4.png");
                }
                if (this.f84q == 7) {
                    f50F = C0161h.m1496n("/bg/lacay5.png");
                }
                if (this.f84q == 11) {
                    f50F = C0161h.m1496n("/bg/tuyet.png");
                }
                this.f83p = C0111c0.m587n(15, 25);
                if (this.f84q == 11) {
                    this.f83p = 100;
                }
                int i4 = this.f83p;
                this.f68a = new int[i4];
                this.f69b = new int[i4];
                this.f70c = new int[i4];
                this.f71d = new int[i4];
                this.f87t = new int[i4];
                this.f86s = new int[i4];
                this.f88u = new boolean[i4];
                for (int i5 = 0; i5 < this.f83p; i5++) {
                    this.f68a[i5] = C0111c0.m587n(-10, C0121h0.f1784c + 10);
                    this.f69b[i5] = C0111c0.m587n(0, C0121h0.f1785d);
                    this.f86s[i5] = C0111c0.m587n(0, 1);
                    this.f87t[i5] = C0111c0.m587n(0, 1);
                    this.f70c[i5] = C0111c0.m587n(-3, 3);
                    this.f71d[i5] = C0111c0.m587n(1, 4);
                    if (this.f84q == 11) {
                        this.f86s[i5] = C0111c0.m587n(0, 2);
                        this.f70c[i5] = C0111c0.m574a(C0111c0.m587n(1, 3));
                        this.f71d[i5] = C0111c0.m574a(C0111c0.m587n(1, 3));
                    }
                }
                return;
            case 3:
                C0145a.f2587H0 = true;
                return;
            case 4:
                this.f83p = C0111c0.m587n(5, 10);
                if (f49E == null) {
                    f49E = C0161h.m1496n("/bg/sao.png");
                }
                int i6 = this.f83p;
                this.f68a = new int[i6];
                this.f69b = new int[i6];
                this.f86s = new int[i6];
                this.f87t = new int[i6];
                this.f92y = new int[i6];
                for (int i7 = 0; i7 < this.f83p; i7++) {
                    this.f68a[i7] = C0111c0.m587n(0, C0145a.f2614V);
                    this.f69b[i7] = C0111c0.m587n(0, 50);
                    if (i7 % 2 == 0) {
                        this.f92y[i7] = 0;
                    } else if (i7 % 3 == 0) {
                        this.f92y[i7] = 1;
                    } else if (i7 % 4 == 0) {
                        this.f92y[i7] = 2;
                    } else {
                        this.f92y[i7] = 3;
                    }
                    this.f87t[i7] = C0111c0.m587n(0, 10);
                }
                return;
            case 8:
                this.f79l = C0111c0.m587n(100, 300);
                if (f51G == null) {
                    f51G = C0161h.m1496n("/bg/ship.png");
                }
                if (f52H == null) {
                    f52H = C0161h.m1496n("/bg/fire1.png");
                }
                if (f53I == null) {
                    f53I = C0161h.m1496n("/bg/fire2.png");
                }
                this.f81n = false;
                m20t();
                return;
            case 9:
                if (f56L == null) {
                    f56L = C0161h.m1496n("/bg/cham-tron1.png");
                }
                if (f57M == null) {
                    f57M = C0161h.m1496n("/bg/cham-tron2.png");
                }
                this.f72e = 20;
                this.f68a = new int[20];
                this.f69b = new int[20];
                f45A = new int[20];
                this.f70c = new int[20];
                for (int i8 = 0; i8 < this.f72e; i8++) {
                    this.f68a[i8] = C0111c0.m574a(C0111c0.m587n(0, C0145a.f2614V));
                    this.f69b[i8] = C0111c0.m574a(C0111c0.m587n(10, 80));
                    f45A[i8] = C0111c0.m574a(C0111c0.m587n(1, 3));
                    this.f70c[i8] = f45A[i8];
                }
                return;
            case 10:
                this.f72e = 30;
                this.f68a = new int[30];
                this.f69b = new int[30];
                f45A = new int[30];
                this.f70c = new int[30];
                int i9 = 0;
                for (int i10 = 0; i10 < this.f72e; i10++) {
                    this.f68a[i10] = C0111c0.m574a(C0111c0.m587n(0, C0145a.f2614V)) + C0126k.f2028t1;
                    i9++;
                    if (i9 > this.f72e / 2) {
                        this.f69b[i10] = C0111c0.m574a(C0111c0.m587n(20, 60));
                        f45A[i10] = 10;
                    } else {
                        this.f69b[i10] = C0111c0.m574a(C0111c0.m587n(0, 20));
                        f45A[i10] = 7;
                    }
                    this.f70c[i10] = (f45A[i10] / 2) - 2;
                }
                return;
            case 13:
                if (C0111c0.m574a(C0111c0.m587n(0, 2)) == 0) {
                    if (C0111c0.m574a(C0111c0.m587n(0, 2)) == 0) {
                        f59O = true;
                    } else {
                        f59O = false;
                    }
                    f60P = C0111c0.m574a(C0111c0.m587n(2, 5));
                    break;
                } else {
                    return;
                }
            case 14:
                if (C0111c0.m574a(C0111c0.m587n(0, 2)) == 0) {
                    f58N = true;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        m11d();
    }

    /* renamed from: a */
    public static void m8a(int i) {
        C0111c0.m584k(" ADD EFFECT " + i);
        if (!C0145a.m1339K()) {
            f67z.addElement(new C0005a(i));
        }
    }

    /* renamed from: b */
    public static void m9b(int i, int i2) {
        C0005a aVar = new C0005a(10);
        aVar.f90w = i;
        aVar.f89v = i2;
        f67z.addElement(aVar);
    }

    /* renamed from: c */
    public static void m10c() {
        C0121h0.f1781T = 0;
    }

    /* renamed from: d */
    public static void m11d() {
        if (C0161h.f2758f != 1 && !C0145a.f2649s) {
            if (f60P <= 0) {
                f61Q = null;
            } else if (f61Q == null) {
                C0143b l = C0161h.m1494l("/bg/fog1.png");
                f61Q = l;
                f63S = l.mo719i();
            }
            if (!f58N) {
                f62R = null;
                return;
            }
            if (f62R == null) {
                f62R = C0161h.m1494l("/bg/fog0.png");
            }
            f66V = 287;
            return;
        }
        f61Q = null;
        f62R = null;
    }

    /* renamed from: e */
    public static boolean m12e() {
        for (int i = 0; i < f67z.size(); i++) {
            int i2 = ((C0005a) f67z.elementAt(i)).f84q;
            if (i2 == 0 || i2 == 12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m13g(C0159f fVar) {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo4f(fVar);
        }
    }

    /* renamed from: i */
    public static void m14i(C0159f fVar) {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo5h(fVar);
        }
    }

    /* renamed from: j */
    public static void m15j(C0159f fVar) {
        if (C0161h.f2758f != 1 && !C0145a.f2649s && f60P != 0 && f61Q != null) {
            for (int i = 0; i < f60P; i++) {
                if (i <= 3) {
                    int i2 = i;
                }
                fVar.mo775d(f61Q, (float) C0145a.f2573A0[i], (float) C0145a.f2575B0[i], 3, false);
            }
        }
    }

    /* renamed from: l */
    public static void m16l(C0159f fVar) {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo6k(fVar);
        }
    }

    /* renamed from: m */
    public static void m17m(C0159f fVar) {
        if (C0161h.f2758f != 1 && !C0145a.f2649s && f58N && f62R != null) {
            for (int i = f64T; i < C0121h0.f1784c; i += f66V) {
                if (i >= C0126k.f2028t1 - f66V) {
                    fVar.mo775d(f62R, (float) i, (float) f65U, 0, false);
                }
            }
        }
    }

    /* renamed from: o */
    public static void m18o(C0159f fVar) {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo7n(fVar);
        }
    }

    /* renamed from: s */
    public static void m19s(C0159f fVar) {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo10r(fVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0077, code lost:
        if (p013g.C0111c0.m587n(0, 2) == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        if (p013g.C0111c0.m587n(0, 2) == 0) goto L_0x0029;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20t() {
        /*
            r7 = this;
            int r0 = p013g.C0126k.f2028t1
            int r1 = p013g.C0126k.f2032u1
            r2 = 1
            r3 = 3
            int r4 = p013g.C0111c0.m587n(r2, r3)
            r7.f75h = r4
            r4 = 0
            r7.f81n = r4
            r5 = 5
            int r5 = p013g.C0111c0.m587n(r3, r5)
            r7.f80m = r5
            int r5 = r7.f75h
            r6 = -50
            if (r5 != r2) goto L_0x002c
            r7.f73f = r6
            int r0 = p018i.C0145a.f2616W
            int r0 = r0 + -100
            int r0 = r0 + r1
            int r0 = p013g.C0111c0.m587n(r1, r0)
            r7.f74g = r0
        L_0x0029:
            r7.f76i = r4
            goto L_0x007a
        L_0x002c:
            r2 = 2
            if (r5 != r2) goto L_0x0043
            int r0 = p013g.C0121h0.f1784c
            int r0 = r0 + 50
            r7.f73f = r0
            int r0 = p018i.C0145a.f2616W
            int r0 = r0 + -100
            int r0 = r0 + r1
            int r0 = p013g.C0111c0.m587n(r1, r0)
            r7.f74g = r0
            r7.f76i = r2
            goto L_0x007a
        L_0x0043:
            if (r5 != r3) goto L_0x005d
            int r1 = r0 + 50
            int r3 = p018i.C0145a.f2614V
            int r3 = r3 + -50
            int r3 = r3 + r0
            int r0 = p013g.C0111c0.m587n(r1, r3)
            r7.f73f = r0
            r7.f74g = r6
            int r0 = p013g.C0111c0.m587n(r4, r2)
            if (r0 != 0) goto L_0x005b
            goto L_0x0029
        L_0x005b:
            r4 = 2
            goto L_0x0029
        L_0x005d:
            r1 = 4
            if (r5 != r1) goto L_0x007a
            int r1 = r0 + 50
            int r3 = p018i.C0145a.f2614V
            int r3 = r3 + -50
            int r3 = r3 + r0
            int r0 = p013g.C0111c0.m587n(r1, r3)
            r7.f73f = r0
            int r0 = p013g.C0121h0.f1785d
            int r0 = r0 + 50
            r7.f74g = r0
            int r0 = p013g.C0111c0.m587n(r4, r2)
            if (r0 != 0) goto L_0x005b
            goto L_0x0029
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0005a.m20t():void");
    }

    /* renamed from: v */
    public static void m21v() {
        if (C0161h.f2758f != 1 && !C0145a.f2649s && f60P > 0) {
            int i = C0145a.f2625c0 == C0126k.m893c0() ? C0121h0.f1784c : C0126k.f2028t1 + C0145a.f2614V;
            int i2 = 0;
            while (i2 < f60P) {
                int i3 = i2 + 1;
                int[] iArr = C0145a.f2573A0;
                iArr[i2] = iArr[i2] - i3;
                if (iArr[i2] < (-f63S)) {
                    iArr[i2] = i + 100;
                }
                i2 = i3;
            }
        }
    }

    /* renamed from: w */
    public static void m22w() {
        for (int i = 0; i < f67z.size(); i++) {
            ((C0005a) f67z.elementAt(i)).mo11u();
        }
    }

    /* renamed from: x */
    public static void m23x() {
        if (C0161h.f2758f != 1 && !C0145a.f2649s && f58N) {
            int i = f64T - 1;
            f64T = i;
            if (i < (-f66V)) {
                f64T = 0;
            }
        }
    }

    /* renamed from: f */
    public void mo4f(C0159f fVar) {
        int i = this.f84q;
        if (i == 0) {
            int i2 = C0126k.f2028t1;
            int i3 = C0126k.f2032u1;
            fVar.mo772D(10742731);
            for (int i4 = 0; i4 < this.f83p; i4++) {
                if (this.f82o[i4] != 2) {
                    int[] iArr = this.f68a;
                    if (iArr[i4] >= C0126k.f2028t1 && iArr[i4] <= C0145a.f2614V + C0126k.f2028t1) {
                        int[] iArr2 = this.f69b;
                        if (iArr2[i4] >= C0126k.f2032u1 && iArr2[i4] <= C0145a.f2616W + C0126k.f2032u1) {
                            fVar.mo776e(f48D, iArr[i4], iArr2[i4], 0);
                        }
                    }
                }
            }
        } else if (i == 1 || i == 2 || i == 5 || i == 6 || i == 7 || i == 11) {
            mo9q(fVar, f50F);
        }
    }

    /* renamed from: h */
    public void mo5h(C0159f fVar) {
        int i = this.f84q;
        if (i == 8) {
            C0143b bVar = f51G;
            fVar.mo779h(bVar, 0, 0, bVar.mo719i(), f51G.mo716e(), this.f76i, this.f73f, this.f74g, 3);
            int i2 = this.f75h;
            if (i2 == 1 || i2 == 2) {
                int i3 = this.f76i;
                fVar.mo779h(f52H, 0, this.f77j * 8, 20, 8, i3, this.f73f + (i3 == 0 ? -25 : 25), this.f74g + 5, 3);
                return;
            }
            int i4 = this.f76i;
            fVar.mo779h(f53I, 0, this.f77j * 18, 8, 18, i4, this.f73f + (i4 == 0 ? 11 : -11), this.f74g + 22, 3);
        } else if (i == 13 && f59O) {
            m15j(fVar);
        }
    }

    /* renamed from: k */
    public void mo6k(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        if (this.f84q == 4) {
            for (int i = 0; i < this.f83p; i++) {
                fVar.mo779h(f49E, 0, this.f86s[i] * 16, 16, 16, 0, this.f68a[i], this.f69b[i], 0);
            }
        }
        if (this.f84q == 9) {
            fVar.mo772D(16777215);
            for (int i2 = 0; i2 < this.f72e; i2++) {
                fVar.mo776e(f45A[i2] == 1 ? f56L : f57M, this.f68a[i2], this.f69b[i2], 3);
            }
        }
    }

    /* renamed from: n */
    public void mo7n(C0159f fVar) {
        C0159f fVar2 = fVar;
        int i = this.f84q;
        if (i != 0) {
            if (!(i == 1 || i == 2 || i == 5 || i == 6 || i == 7)) {
                switch (i) {
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        if (!f59O) {
                            m15j(fVar);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            mo8p(fVar2, f50F);
            return;
        }
        int i2 = C0126k.f2028t1;
        int i3 = C0126k.f2032u1;
        for (int i4 = 0; i4 < this.f83p; i4++) {
            if (this.f82o[i4] == 2) {
                int[] iArr = this.f68a;
                if (iArr[i4] >= C0126k.f2028t1 && iArr[i4] <= C0145a.f2614V + C0126k.f2028t1) {
                    int[] iArr2 = this.f69b;
                    if (iArr2[i4] >= C0126k.f2032u1 && iArr2[i4] <= C0145a.f2616W + C0126k.f2032u1) {
                        if (this.f88u[i4]) {
                            fVar.mo779h(f46B, 0, this.f86s[i4] * 10, 13, 10, 0, iArr[i4], iArr2[i4] - 10, 0);
                        } else {
                            fVar2.mo776e(f47C, iArr[i4], iArr2[i4], 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void mo8p(C0159f fVar, C0143b bVar) {
        int i = this.f84q == 11 ? 3 : 4;
        for (int i2 = 0; i2 < this.f83p; i2++) {
            if (i2 % 3 == 0) {
                int[] iArr = this.f68a;
                if (iArr[i2] >= C0126k.f2028t1 && iArr[i2] <= C0145a.f2614V + C0126k.f2028t1) {
                    int[] iArr2 = this.f69b;
                    if (iArr2[i2] >= C0126k.f2032u1 && iArr2[i2] <= C0145a.f2616W + C0126k.f2032u1) {
                        fVar.mo779h(bVar, 0, (C0159f.m1450t(bVar) / i) * this.f86s[i2], C0159f.m1451u(bVar), C0159f.m1450t(bVar) / i, 0, this.f68a[i2], this.f69b[i2], 0);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo9q(C0159f fVar, C0143b bVar) {
        int i = this.f84q == 11 ? 3 : 4;
        for (int i2 = 0; i2 < this.f83p; i2++) {
            if (i2 % 3 != 0) {
                int[] iArr = this.f68a;
                if (iArr[i2] >= C0126k.f2028t1 && iArr[i2] <= C0145a.f2614V + C0126k.f2028t1) {
                    int[] iArr2 = this.f69b;
                    if (iArr2[i2] >= C0126k.f2032u1 && iArr2[i2] <= C0145a.f2616W + C0126k.f2032u1) {
                        fVar.mo779h(bVar, 0, (C0159f.m1450t(bVar) / i) * this.f86s[i2], C0159f.m1451u(bVar), C0159f.m1450t(bVar) / i, 0, this.f68a[i2], this.f69b[i2], 0);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo10r(C0159f fVar) {
        if (this.f84q == 10) {
            fVar.mo772D(this.f90w);
            int i = 0;
            while (true) {
                int i2 = this.f72e;
                if (i < i2) {
                    fVar.mo776e(i < i2 / 2 ? f55K : f54J, this.f68a[i], this.f69b[i] + this.f89v, 0);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r8 >= r0.f72e) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        r1 = r0.f68a;
        r2 = r1[r8];
        r3 = r0.f70c;
        r1[r8] = r2 - r3[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r1[r8] >= (-r3[r8])) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        f45A[r8] = p013g.C0111c0.m574a(p013g.C0111c0.m587n(1, 3));
        r1 = r0.f70c;
        r1[r8] = f45A[r8];
        r0.f68a[r8] = p018i.C0145a.f2614V + r1[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r8 >= r0.f72e) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r1 = r0.f68a;
        r2 = r1[r8];
        r3 = r0.f70c;
        r1[r8] = r2 - r3[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1[r8] >= ((-r3[r8]) + p013g.C0126k.f2028t1)) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r1[r8] = (p018i.C0145a.f2614V + r3[r8]) + p013g.C0126k.f2028t1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r8 = r8 + 1;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11u() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f84q
            r2 = 4
            r3 = 10
            r4 = -50
            r5 = -10
            r6 = 2
            r7 = 3
            r8 = 0
            r9 = 1
            switch(r1) {
                case 0: goto L_0x0207;
                case 1: goto L_0x0104;
                case 2: goto L_0x0104;
                case 3: goto L_0x0012;
                case 4: goto L_0x00d7;
                case 5: goto L_0x0104;
                case 6: goto L_0x0104;
                case 7: goto L_0x0104;
                case 8: goto L_0x007a;
                case 9: goto L_0x0044;
                case 10: goto L_0x001e;
                case 11: goto L_0x0104;
                case 12: goto L_0x0207;
                case 13: goto L_0x0019;
                case 14: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x02ae
        L_0x0014:
            m23x()
            goto L_0x02ae
        L_0x0019:
            m21v()
            goto L_0x02ae
        L_0x001e:
            int r1 = r0.f72e
            if (r8 >= r1) goto L_0x02ae
            int[] r1 = r0.f68a
            r2 = r1[r8]
            int[] r3 = r0.f70c
            r4 = r3[r8]
            int r2 = r2 - r4
            r1[r8] = r2
            r2 = r1[r8]
            r4 = r3[r8]
            int r4 = -r4
            int r5 = p013g.C0126k.f2028t1
            int r4 = r4 + r5
            if (r2 >= r4) goto L_0x0041
            int r2 = p018i.C0145a.f2614V
            r3 = r3[r8]
            int r2 = r2 + r3
            int r3 = p013g.C0126k.f2028t1
            int r2 = r2 + r3
            r1[r8] = r2
        L_0x0041:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0044:
            int r1 = r0.f72e
            if (r8 >= r1) goto L_0x02ae
            int[] r1 = r0.f68a
            r2 = r1[r8]
            int[] r3 = r0.f70c
            r4 = r3[r8]
            int r2 = r2 - r4
            r1[r8] = r2
            r1 = r1[r8]
            r2 = r3[r8]
            int r2 = -r2
            if (r1 >= r2) goto L_0x0077
            int[] r1 = f45A
            int r2 = p013g.C0111c0.m587n(r9, r7)
            int r2 = p013g.C0111c0.m574a(r2)
            r1[r8] = r2
            int[] r1 = r0.f70c
            int[] r2 = f45A
            r2 = r2[r8]
            r1[r8] = r2
            int[] r2 = r0.f68a
            int r3 = p018i.C0145a.f2614V
            r1 = r1[r8]
            int r3 = r3 + r1
            r2[r8] = r3
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x0044
        L_0x007a:
            int r1 = r0.f78k
            int r1 = r1 + r9
            r0.f78k = r1
            if (r1 != r7) goto L_0x008c
            r0.f78k = r8
            int r1 = r0.f77j
            int r1 = r1 + r9
            r0.f77j = r1
            if (r1 <= r9) goto L_0x008c
            r0.f77j = r8
        L_0x008c:
            int r1 = p018i.C0145a.f2600O
            int r3 = r0.f79l
            int r1 = r1 % r3
            if (r1 != 0) goto L_0x0095
            r0.f81n = r9
        L_0x0095:
            boolean r1 = r0.f81n
            if (r1 == 0) goto L_0x02ae
            int r1 = r0.f75h
            if (r1 != r9) goto L_0x00af
            int r1 = r0.f73f
            int r2 = r0.f80m
            int r1 = r1 + r2
            r0.f73f = r1
            int r2 = p013g.C0121h0.f1784c
            int r2 = r2 + 50
            if (r1 <= r2) goto L_0x02ae
        L_0x00aa:
            r16.m20t()
            goto L_0x02ae
        L_0x00af:
            if (r1 != r6) goto L_0x00bb
            int r1 = r0.f73f
            int r2 = r0.f80m
            int r1 = r1 - r2
            r0.f73f = r1
            if (r1 >= r4) goto L_0x02ae
            goto L_0x00aa
        L_0x00bb:
            if (r1 != r7) goto L_0x00cb
            int r1 = r0.f74g
            int r2 = r0.f80m
            int r1 = r1 + r2
            r0.f74g = r1
            int r2 = p013g.C0121h0.f1785d
            int r2 = r2 + 50
            if (r1 <= r2) goto L_0x02ae
            goto L_0x00aa
        L_0x00cb:
            if (r1 != r2) goto L_0x02ae
            int r1 = r0.f74g
            int r2 = r0.f80m
            int r1 = r1 - r2
            r0.f74g = r1
            if (r1 >= r4) goto L_0x02ae
            goto L_0x00aa
        L_0x00d7:
            r1 = 0
        L_0x00d8:
            int r2 = r0.f83p
            if (r1 >= r2) goto L_0x02ae
            int[] r2 = r0.f87t
            r4 = r2[r1]
            int r4 = r4 + r9
            r2[r1] = r4
            r4 = r2[r1]
            if (r4 <= r3) goto L_0x0101
            int[] r4 = r0.f92y
            r5 = r4[r1]
            int r5 = r5 + r9
            r4[r1] = r5
            r2[r1] = r8
            r2 = r4[r1]
            r5 = 5
            if (r2 <= r5) goto L_0x00f7
            r4[r1] = r8
        L_0x00f7:
            int[] r2 = r0.f86s
            int[] r5 = r0.f91x
            r4 = r4[r1]
            r4 = r5[r4]
            r2[r1] = r4
        L_0x0101:
            int r1 = r1 + 1
            goto L_0x00d8
        L_0x0104:
            r1 = 0
        L_0x0105:
            int r10 = r0.f83p
            if (r1 >= r10) goto L_0x02ae
            int r10 = r1 % 3
            if (r10 == 0) goto L_0x012a
            int[] r11 = r0.f68a
            r11 = r11[r1]
            int[] r12 = r0.f69b
            r12 = r12[r1]
            int r13 = p013g.C0121h0.f1786e
            r14 = 15
            if (r13 != r14) goto L_0x011e
            r13 = 10
            goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            int r12 = r12 + r13
            boolean r11 = p013g.C0121h0.m841u(r11, r12, r6)
            if (r11 == 0) goto L_0x012a
            boolean[] r11 = r0.f88u
            r11[r1] = r9
        L_0x012a:
            if (r10 != 0) goto L_0x0148
            int[] r10 = r0.f69b
            r10 = r10[r1]
            int r11 = p013g.C0121h0.f1785d
            if (r10 <= r11) goto L_0x0148
            int[] r10 = r0.f68a
            int r11 = p013g.C0121h0.f1784c
            int r11 = r11 + 50
            int r11 = p013g.C0111c0.m587n(r5, r11)
            r10[r1] = r11
            int[] r10 = r0.f69b
            int r11 = p013g.C0111c0.m587n(r4, r8)
            r10[r1] = r11
        L_0x0148:
            boolean[] r10 = r0.f88u
            boolean r10 = r10[r1]
            if (r10 != 0) goto L_0x01db
            r10 = 0
        L_0x014f:
            k.i r11 = p011e.C0101z0.f1120u
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0197
            k.i r11 = p011e.C0101z0.f1120u
            java.lang.Object r11 = r11.elementAt(r10)
            e.z0 r11 = (p011e.C0101z0) r11
            if (r11 == 0) goto L_0x0193
            boolean r12 = r11.f1135m
            if (r12 == 0) goto L_0x0193
            int[] r12 = r0.f68a
            r13 = r12[r1]
            int r14 = r11.f1123a
            int r15 = r14 + 80
            if (r13 >= r15) goto L_0x0193
            r13 = r12[r1]
            int r15 = r14 + -80
            if (r13 <= r15) goto L_0x0193
            int[] r13 = r0.f69b
            r15 = r13[r1]
            int r11 = r11.f1124b
            int r2 = r11 + 80
            if (r15 >= r2) goto L_0x0193
            r2 = r13[r1]
            int r11 = r11 + -80
            if (r2 <= r11) goto L_0x0193
            r2 = r12[r1]
            r11 = r12[r1]
            if (r11 >= r14) goto L_0x018e
            r11 = -10
            goto L_0x0190
        L_0x018e:
            r11 = 10
        L_0x0190:
            int r2 = r2 + r11
            r12[r1] = r2
        L_0x0193:
            int r10 = r10 + 1
            r2 = 4
            goto L_0x014f
        L_0x0197:
            int[] r2 = r0.f69b
            r10 = r2[r1]
            int[] r11 = r0.f71d
            r11 = r11[r1]
            int r10 = r10 + r11
            r2[r1] = r10
            int[] r2 = r0.f68a
            r10 = r2[r1]
            int[] r11 = r0.f70c
            r11 = r11[r1]
            int r10 = r10 + r11
            r2[r1] = r10
            int[] r2 = r0.f87t
            r10 = r2[r1]
            int r10 = r10 + r9
            r2[r1] = r10
            int r10 = r0.f84q
            r11 = 11
            if (r10 != r11) goto L_0x01bc
            r12 = 3
            goto L_0x01bd
        L_0x01bc:
            r12 = 4
        L_0x01bd:
            r13 = r2[r1]
            if (r10 == r6) goto L_0x01c3
            r14 = 2
            goto L_0x01c4
        L_0x01c3:
            r14 = 4
        L_0x01c4:
            if (r13 <= r14) goto L_0x0202
            if (r10 == r11) goto L_0x01cf
            int[] r10 = r0.f86s
            r11 = r10[r1]
            int r11 = r11 + r9
            r10[r1] = r11
        L_0x01cf:
            r2[r1] = r8
            int[] r2 = r0.f86s
            r10 = r2[r1]
            int r12 = r12 - r9
            if (r10 <= r12) goto L_0x0202
            r2[r1] = r8
            goto L_0x0202
        L_0x01db:
            int[] r2 = r0.f87t
            r10 = r2[r1]
            int r10 = r10 + r9
            r2[r1] = r10
            r10 = r2[r1]
            r11 = 100
            if (r10 != r11) goto L_0x0202
            r2[r1] = r8
            int[] r2 = r0.f68a
            int r10 = p013g.C0121h0.f1784c
            int r10 = r10 + 50
            int r10 = p013g.C0111c0.m587n(r5, r10)
            r2[r1] = r10
            int[] r2 = r0.f69b
            int r10 = p013g.C0111c0.m587n(r4, r8)
            r2[r1] = r10
            boolean[] r2 = r0.f88u
            r2[r1] = r8
        L_0x0202:
            int r1 = r1 + 1
            r2 = 4
            goto L_0x0105
        L_0x0207:
            r1 = 0
        L_0x0208:
            int r2 = r0.f83p
            if (r1 >= r2) goto L_0x02ae
            int r2 = r1 % 3
            if (r2 == 0) goto L_0x022b
            int r3 = r0.f84q
            r4 = 12
            if (r3 == r4) goto L_0x022b
            int[] r3 = r0.f68a
            r3 = r3[r1]
            int[] r4 = r0.f69b
            r4 = r4[r1]
            int r7 = p018i.C0145a.f2595L0
            int r4 = r4 - r7
            boolean r3 = p013g.C0121h0.m841u(r3, r4, r6)
            if (r3 == 0) goto L_0x022b
            boolean[] r3 = r0.f88u
            r3[r1] = r9
        L_0x022b:
            r3 = -100
            if (r2 != 0) goto L_0x0254
            int[] r2 = r0.f69b
            r2 = r2[r1]
            int r4 = p018i.C0145a.f2616W
            int r7 = p013g.C0126k.f2032u1
            int r4 = r4 + r7
            if (r2 <= r4) goto L_0x0254
            int[] r2 = r0.f68a
            int r4 = p018i.C0145a.f2614V
            int r4 = r4 + 300
            int r4 = p013g.C0111c0.m587n(r5, r4)
            int r7 = p013g.C0126k.f2028t1
            int r4 = r4 + r7
            r2[r1] = r4
            int[] r2 = r0.f69b
            int r4 = p013g.C0111c0.m587n(r3, r8)
            int r7 = p013g.C0126k.f2032u1
            int r4 = r4 + r7
            r2[r1] = r4
        L_0x0254:
            boolean[] r2 = r0.f88u
            boolean r4 = r2[r1]
            if (r4 != 0) goto L_0x0270
            int[] r4 = r0.f69b
            r7 = r4[r1]
            int[] r10 = r0.f71d
            r10 = r10[r1]
            int r7 = r7 + r10
            r4[r1] = r7
            int[] r4 = r0.f68a
            r7 = r4[r1]
            int[] r10 = r0.f70c
            r10 = r10[r1]
            int r7 = r7 + r10
            r4[r1] = r7
        L_0x0270:
            boolean r4 = r2[r1]
            if (r4 == 0) goto L_0x02aa
            int[] r4 = r0.f87t
            r7 = r4[r1]
            int r7 = r7 + r9
            r4[r1] = r7
            r7 = r4[r1]
            if (r7 <= r6) goto L_0x02aa
            int[] r7 = r0.f86s
            r10 = r7[r1]
            int r10 = r10 + r9
            r7[r1] = r10
            r4[r1] = r8
            r4 = r7[r1]
            if (r4 <= r9) goto L_0x02aa
            r7[r1] = r8
            r2[r1] = r8
            int[] r2 = r0.f68a
            int r4 = p018i.C0145a.f2614V
            int r4 = r4 + 300
            int r4 = p013g.C0111c0.m587n(r5, r4)
            int r7 = p013g.C0126k.f2028t1
            int r4 = r4 + r7
            r2[r1] = r4
            int[] r2 = r0.f69b
            int r3 = p013g.C0111c0.m587n(r3, r8)
            int r4 = p013g.C0126k.f2032u1
            int r3 = r3 + r4
            r2[r1] = r3
        L_0x02aa:
            int r1 = r1 + 1
            goto L_0x0208
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0005a.mo11u():void");
    }
}
