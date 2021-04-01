package p001b;

import p011e.C0050b0;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p011e.C0073l0;
import p011e.C0074m;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0117f0;
import p013g.C0126k;
import p013g.C0131p;
import p013g.C0132q;
import p013g.C0136u;
import p013g.C0140y;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0174j;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: b.b */
public class C0006b extends C0008d implements C0072l {

    /* renamed from: A */
    public static long f93A;

    /* renamed from: B */
    public static long f94B;

    /* renamed from: C */
    public static C0006b f95C;

    /* renamed from: D */
    public static C0006b f96D;

    /* renamed from: E */
    public static String f97E;

    /* renamed from: F */
    public static C0050b0 f98F;

    /* renamed from: G */
    public static C0073l0 f99G;

    /* renamed from: H */
    public static boolean f100H;

    /* renamed from: I */
    public static int f101I;

    /* renamed from: g */
    public int f102g = 100;

    /* renamed from: h */
    public int f103h;

    /* renamed from: i */
    public int f104i;

    /* renamed from: j */
    public String[] f105j;

    /* renamed from: k */
    public int f106k;

    /* renamed from: l */
    public int f107l;

    /* renamed from: m */
    public int f108m;

    /* renamed from: n */
    public int f109n;

    /* renamed from: o */
    public C0050b0 f110o;

    /* renamed from: p */
    int f111p;

    /* renamed from: q */
    String[] f112q;

    /* renamed from: r */
    public C0055d f113r;

    /* renamed from: s */
    public C0055d f114s;

    /* renamed from: t */
    public C0055d f115t;

    /* renamed from: u */
    public byte f116u = 0;

    /* renamed from: v */
    public byte f117v = 0;

    /* renamed from: w */
    public int f118w;

    /* renamed from: x */
    private int f119x;

    /* renamed from: y */
    public int f120y;

    /* renamed from: z */
    public int f121z;

    /* renamed from: c */
    public static void m32c(String str, int i, C0050b0 b0Var) {
        String[] strArr = {str};
        if (b0Var.f1638w != 5) {
            C0132q qVar = C0126k.f1862G3;
            if (qVar.f2187n) {
                qVar.f2188o = false;
            }
        }
        C0114e.f1393x4 = true;
        C0006b d = m33d(strArr[0], i, b0Var);
        f96D = d;
        d.f121z = 5;
        C0006b bVar = f96D;
        d.f106k = ((C0145a.f2614V / 2) - (bVar.f102g / 2)) - 1;
        C0006b bVar2 = f96D;
        int i2 = bVar2.f108m;
        bVar.f107l = (C0145a.f2616W - 20) - i2;
        bVar2.f111p = 0;
        bVar2.f112q = strArr;
        C0073l0 l0Var = new C0073l0();
        f99G = l0Var;
        l0Var.mo159c(bVar2.f105j.length, 12, bVar2.f106k, (bVar2.f107l - bVar2.f121z) + 12, bVar2.f102g + 2, i2 - 25, true, 1);
        C0175k.m1563p().mo855F();
    }

    /* renamed from: d */
    public static C0006b m33d(String str, int i, C0050b0 b0Var) {
        C0111c0.m584k("ADD POP");
        C0111c0.m584k(C0114e.m647e0().f1467O0 != null ? "!null" : "null");
        f101I = 10;
        C0006b bVar = new C0006b();
        int i2 = C0145a.f2614V - 30;
        C0136u uVar = C0145a.f2627d0;
        int i3 = i2 - (uVar.f2239a ? uVar.f2242d : 0);
        bVar.f102g = i3;
        if (i3 > 320) {
            bVar.f102g = 320;
        }
        if (str.length() < 10) {
            bVar.f102g = 64;
        }
        if (C0145a.f2614V == 128) {
            bVar.f102g = 128;
        }
        String[] h = C0177m.f2926C.mo916h(str, bVar.f102g - 10);
        bVar.f105j = h;
        bVar.f103h = i;
        bVar.f110o = b0Var;
        C0114e.f1372c4 = bVar;
        int length = (15 - bVar.f104i) + (h.length * 12) + 10;
        bVar.f108m = length;
        int i4 = C0145a.f2616W;
        if (length > i4 - 80) {
            bVar.f108m = i4 - 80;
        }
        boolean z = C0145a.f2627d0.f2239a;
        C0008d.f124b.addElement(bVar);
        f100H = false;
        if (b0Var != null && b0Var.f1638w == 5) {
            f100H = true;
            C0126k.f1862G3.mo562a("", 1);
        }
        long h2 = C0161h.m1490h();
        f94B = h2;
        f93A = h2;
        return bVar;
    }

    /* renamed from: f */
    public static void m34f(String str, int i, C0050b0 b0Var) {
        C0111c0.m584k("chat= " + str);
        String[] q = C0111c0.m590q(str, "\n", 0);
        C0114e.f1393x4 = true;
        C0006b d = m33d(q[0], i, b0Var);
        f95C = d;
        d.f111p = 0;
        d.f112q = q;
        String str2 = C0057d1.f620d1;
        if (q.length == 1) {
            str2 = C0057d1.f606b1;
        }
        f95C.f113r = new C0055d(str2, (C0072l) f95C, 8000, (Object) null);
        f95C.f113r.f407h = (C0145a.f2614V / 2) - 35;
        f95C.f113r.f408i = C0145a.f2616W - 35;
        C0175k.m1563p().mo855F();
    }

    /* renamed from: g */
    public static C0006b m35g(String str, int i, C0050b0 b0Var, int i2) {
        C0111c0.m584k("ADD POP");
        C0111c0.m584k(C0114e.m647e0().f1467O0 != null ? "!null" : "null");
        f101I = 10;
        C0006b bVar = new C0006b();
        int i3 = C0145a.f2614V - 30;
        C0136u uVar = C0145a.f2627d0;
        int i4 = i3 - (uVar.f2239a ? uVar.f2242d : 0);
        bVar.f102g = i4;
        if (i4 > 320) {
            bVar.f102g = 320;
        }
        if (str.length() < 10) {
            bVar.f102g = 64;
        }
        if (C0145a.f2614V == 128) {
            bVar.f102g = 128;
        }
        String[] h = C0177m.f2926C.mo916h(str, bVar.f102g - 10);
        bVar.f105j = h;
        bVar.f103h = i;
        bVar.f110o = b0Var;
        bVar.f119x = i2;
        C0114e.f1372c4 = bVar;
        int length = (15 - bVar.f104i) + (h.length * 12) + 10;
        bVar.f108m = length;
        int i5 = C0145a.f2616W;
        if (length > i5 - 80) {
            bVar.f108m = i5 - 80;
        }
        boolean z = C0145a.f2627d0.f2239a;
        C0008d.f124b.addElement(bVar);
        f100H = false;
        if (b0Var != null && b0Var.f1638w == 5) {
            f100H = true;
            C0126k.f1862G3.mo562a("", 1);
        }
        bVar.f108m += 15;
        long h2 = C0161h.m1490h();
        f94B = h2;
        f93A = h2;
        return bVar;
    }

    /* renamed from: h */
    public static void m36h(String str, C0050b0 b0Var) {
        f97E = str;
        f98F = b0Var;
        if (f95C == null) {
            m34f(str, 100000, b0Var);
            f97E = null;
            f98F = null;
        }
    }

    /* renamed from: a */
    public void mo12a(C0159f fVar) {
        String str;
        int i;
        int i2;
        C0177m mVar;
        int i3;
        int i4;
        String str2;
        C0159f fVar2;
        C0177m mVar2;
        int i5;
        C0177m mVar3;
        int i6;
        C0159f fVar3 = fVar;
        if (!C0126k.m893c0().f2119g0 || !C0126k.m893c0().f2104Y) {
            C0145a.m1346T(fVar);
            int i7 = this.f106k;
            int i8 = this.f107l;
            int i9 = this.f102g + 2;
            int i10 = this.f108m;
            if ((i7 > 0 && i8 > 0) || C0145a.f2629e0.f2467a) {
                C0067i0.m243g(fVar, i7, i8, i9, i10, 16777215, false);
                C0050b0 b0Var = this.f110o;
                if (b0Var != null) {
                    C0174j.m1555c(fVar, b0Var.f1442J0, this.f106k + 14, this.f107l, 0, C0117f0.f1678d);
                }
                int i11 = this.f119x;
                if (i11 != 0) {
                    C0174j.m1555c(fVar, i11, (i9 / 2) + this.f106k, (this.f107l + this.f108m) - 15, 0, C0117f0.f1680f);
                }
                if (f99G != null) {
                    int i12 = i10 - 16;
                    fVar3.mo771C(i7, i8, i9, i12);
                    fVar.mo770B();
                    fVar3.mo774a(i7, i8, i9, i12);
                    fVar3.mo773E(0, -f99G.f874d);
                }
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    String[] strArr = this.f105j;
                    if (i14 < strArr.length) {
                        if (strArr[i14].startsWith("--")) {
                            fVar3.mo772D(0);
                            fVar3.mo783l(i7 + 10, this.f107l + this.f104i + (i14 * 12) + 6, i9 - 20, 1);
                        } else {
                            C0177m mVar4 = C0177m.f2956x;
                            String[] strArr2 = this.f105j;
                            String str3 = strArr2[i14];
                            if (strArr2[i14].startsWith("|")) {
                                String[] q = C0111c0.m590q(this.f105j[i14], "|", 0);
                                if (q.length == 3) {
                                    str3 = q[2];
                                }
                                if (q.length == 4) {
                                    str3 = q[3];
                                    i6 = Integer.parseInt(q[2]);
                                } else {
                                    i6 = 2;
                                }
                                i = Integer.parseInt(q[1]);
                                i2 = i6;
                                str = str3;
                            } else {
                                i = i13;
                                str = str3;
                                i2 = 2;
                            }
                            switch (i) {
                                case -1:
                                    mVar3 = C0177m.f2956x;
                                    break;
                                case 0:
                                    mVar3 = C0177m.f2951s;
                                    break;
                                case 1:
                                    mVar3 = C0177m.f2953u;
                                    break;
                                case 2:
                                    mVar3 = C0177m.f2947o;
                                    break;
                                case 3:
                                    mVar3 = C0177m.f2926C;
                                    break;
                                case 4:
                                    mVar3 = C0177m.f2928E;
                                    break;
                                case 5:
                                    mVar3 = C0177m.f2927D;
                                    break;
                                case 7:
                                    mVar3 = C0177m.f2946n;
                                    break;
                                default:
                                    mVar = mVar4;
                                    break;
                            }
                            mVar = mVar3;
                            if (this.f105j[i14].startsWith("<")) {
                                String[] q2 = C0111c0.m590q(C0111c0.m590q(this.f105j[i14], "<", 0)[1], ">", 1);
                                if (this.f120y == 0) {
                                    i5 = Integer.parseInt(q2[1]);
                                } else {
                                    long h = C0161h.m1490h();
                                    f93A = h;
                                    if (h - f94B >= 1000) {
                                        f94B = h;
                                        i5 = this.f120y - 1;
                                    }
                                    str2 = this.f120y + " " + q2[2];
                                    i4 = this.f106k + (this.f102g / 2);
                                    i3 = (((this.f107l + this.f104i) + (i14 * 12)) - this.f121z) + 12;
                                    mVar2 = mVar;
                                    fVar2 = fVar;
                                }
                                this.f120y = i5;
                                str2 = this.f120y + " " + q2[2];
                                i4 = this.f106k + (this.f102g / 2);
                                i3 = (((this.f107l + this.f104i) + (i14 * 12)) - this.f121z) + 12;
                                mVar2 = mVar;
                                fVar2 = fVar;
                            } else {
                                if (i2 == 2) {
                                    int i15 = i2;
                                    mVar.mo909a(fVar, str, this.f106k + (this.f102g / 2), (((this.f107l + this.f104i) + (i14 * 12)) - this.f121z) + 12, i2);
                                }
                                if (i2 == 1) {
                                    i4 = (this.f106k + this.f102g) - 5;
                                    i3 = (((this.f107l + this.f104i) + (i14 * 12)) - this.f121z) + 12;
                                    mVar2 = mVar;
                                    fVar2 = fVar;
                                    str2 = str;
                                }
                                i13 = i;
                            }
                            mVar2.mo909a(fVar2, str2, i4, i3, i2);
                            i13 = i;
                        }
                        i14++;
                    } else {
                        if (this.f117v > 0) {
                            int i16 = 0;
                            while (true) {
                                byte b = this.f117v;
                                if (i16 < b) {
                                    fVar3.mo776e(C0140y.f2368f2, (((i9 / 2) + i7) - ((b * 20) / 2)) + (i16 * 20) + C0159f.m1451u(C0140y.f2367e2), (i8 + i10) - 13, 3);
                                    i16++;
                                }
                            }
                        }
                        if (this.f116u > 0) {
                            for (int i17 = 0; i17 < this.f116u; i17++) {
                                C0143b bVar = C0140y.f2367e2;
                                fVar3.mo776e(bVar, (((i9 / 2) + i7) - ((this.f117v * 20) / 2)) + (i17 * 20) + C0159f.m1451u(bVar), (i8 + i10) - 13, 3);
                            }
                        }
                        if (f99G != null) {
                            fVar.mo769A();
                        }
                        mo14i(fVar);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo13b() {
        int i;
        C0006b bVar;
        if (f99G != null) {
            C0126k.f1862G3.f2188o = false;
            f99G.mo161g();
        } else {
            C0126k.f1862G3.f2188o = true;
        }
        boolean z = C0145a.f2627d0.f2239a;
        this.f121z = 0;
        if (z) {
            this.f106k = ((C0145a.f2614V / 2) - (this.f102g / 2)) - 1;
            i = C0145a.f2627d0.f2243e;
        } else if (C0126k.m893c0().f2973c == null && C0126k.m893c0().f2971a == null && C0126k.m893c0().f2972b == null && this.f113r == null && this.f114s == null) {
            this.f106k = ((C0145a.f2614V / 2) - (this.f102g / 2)) - 1;
            i = C0145a.f2616W - 5;
        } else {
            this.f121z = 5;
            this.f106k = ((C0145a.f2614V / 2) - (this.f102g / 2)) - 1;
            i = C0145a.f2616W - 20;
        }
        this.f107l = i - this.f108m;
        int i2 = this.f103h;
        if (i2 > 0) {
            this.f103h = i2 - 1;
        }
        int i3 = f101I;
        if (i3 > 0) {
            f101I = i3 - 1;
        }
        int i4 = this.f104i;
        if (i4 > 1) {
            this.f104i = i4 - 1;
        }
        C0050b0 b0Var = this.f110o;
        if ((b0Var != null && (bVar = C0114e.f1372c4) != null && bVar != this) || ((b0Var != null && C0114e.f1372c4 == null) || this.f103h == 0)) {
            C0008d.f126d.removeElement(this);
            C0008d.f124b.removeElement(this);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1000) {
            try {
                C0146b.f2678f.mo721b((String) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C0146b.f2678f.mo720a();
            C0145a.m1366v();
        }
        if (i == 1001) {
            f99G = null;
            C0114e.f1372c4 = null;
            f96D = null;
            C0126k.f1862G3.f2188o = true;
            C0114e.f1393x4 = false;
            if (f100H) {
                C0074m mVar = C0126k.f1862G3.f2175b;
                mVar.f905j = 0;
                mVar.f897b.f2167b = 10;
            }
        }
        if (i == 8000 && f101I <= 0) {
            C0006b bVar = f95C;
            int i2 = bVar.f111p + 1;
            String[] strArr = bVar.f112q;
            if (i2 >= strArr.length) {
                C0114e.f1372c4 = null;
                f95C = null;
                C0126k.f1862G3.f2188o = true;
                C0114e.f1393x4 = false;
                String str = f97E;
                if (str != null) {
                    m34f(str, 100000, f98F);
                    f97E = null;
                    f98F = null;
                } else if (f100H) {
                    C0126k.f1862G3.f2175b.f905j = 0;
                    for (int i3 = 0; i3 < C0126k.f1862G3.f2175b.f896a.size(); i3++) {
                        if (((C0131p) C0126k.f1862G3.f2175b.f896a.elementAt(i3)).f2167b == 10000000) {
                            ((C0131p) C0126k.f1862G3.f2175b.f896a.elementAt(i3)).f2167b = 10;
                        }
                    }
                }
            } else {
                C0006b d = m33d(strArr[i2], bVar.f103h, bVar.f110o);
                d.f111p = i2;
                C0006b bVar2 = f95C;
                d.f112q = bVar2.f112q;
                d.f113r = bVar2.f113r;
                f95C = d;
            }
        }
    }

    /* renamed from: i */
    public void mo14i(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        fVar.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        C0145a.f2642l0.mo145e(fVar);
        C0055d dVar = this.f113r;
        if (dVar != null) {
            C0145a.f2642l0.mo141a(fVar, (C0055d) null, dVar, (C0055d) null);
        }
        C0055d dVar2 = this.f114s;
        if (dVar2 != null) {
            C0145a.f2642l0.mo141a(fVar, dVar2, (C0055d) null, this.f115t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15j(p019j.C0159f r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r7 = r23
            int r8 = r0.f106k
            int r1 = r0.f107l
            int r9 = r0.f102g
            int r10 = r23.mo791x()
            int r11 = r23.mo792y()
            r2 = r24
            int r2 = -r2
            r12 = 0
            r7.mo773E(r12, r2)
            if (r8 <= 0) goto L_0x001d
            if (r1 > 0) goto L_0x0024
        L_0x001d:
            g.y r1 = p018i.C0145a.f2629e0
            boolean r1 = r1.f2467a
            if (r1 != 0) goto L_0x0024
            return
        L_0x0024:
            r13 = -1
            r1 = -1
            r14 = 0
        L_0x0027:
            java.lang.String[] r2 = r0.f105j
            int r3 = r2.length
            if (r14 >= r3) goto L_0x0166
            r2 = r2[r14]
            java.lang.String r3 = "--"
            boolean r2 = r2.startsWith(r3)
            r15 = 1
            if (r2 == 0) goto L_0x0052
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r7.mo772D(r2)
            int r2 = r8 + 10
            int r3 = r0.f107l
            int r4 = r0.f104i
            int r3 = r3 + r4
            int r4 = r14 * 12
            int r3 = r3 + r4
            int r3 = r3 + -6
            int r4 = r9 + -20
            r7.mo783l(r2, r3, r4, r15)
            r18 = 0
            goto L_0x0161
        L_0x0052:
            k.m r2 = p020k.C0177m.f2929F
            java.lang.String[] r3 = r0.f105j
            r4 = r3[r14]
            r3 = r3[r14]
            java.lang.String r5 = "|"
            boolean r3 = r3.startsWith(r5)
            r6 = 2
            if (r3 == 0) goto L_0x008a
            java.lang.String[] r1 = r0.f105j
            r1 = r1[r14]
            java.lang.String[] r1 = p013g.C0111c0.m590q(r1, r5, r12)
            int r3 = r1.length
            r5 = 3
            if (r3 != r5) goto L_0x0071
            r4 = r1[r6]
        L_0x0071:
            int r3 = r1.length
            r12 = 4
            if (r3 != r12) goto L_0x007e
            r4 = r1[r5]
            r3 = r1[r6]
            int r3 = java.lang.Integer.parseInt(r3)
            goto L_0x007f
        L_0x007e:
            r3 = 2
        L_0x007f:
            r1 = r1[r15]
            int r1 = java.lang.Integer.parseInt(r1)
            r12 = r1
            r5 = r3
            r16 = r4
            goto L_0x008e
        L_0x008a:
            r12 = r1
            r16 = r4
            r5 = 2
        L_0x008e:
            if (r12 == r13) goto L_0x00a2
            if (r12 == 0) goto L_0x009f
            if (r12 == r15) goto L_0x009c
            if (r12 == r6) goto L_0x0099
            r17 = r2
            goto L_0x00a6
        L_0x0099:
            k.m r1 = p020k.C0177m.f2946n
            goto L_0x00a4
        L_0x009c:
            k.m r1 = p020k.C0177m.f2953u
            goto L_0x00a4
        L_0x009f:
            k.m r1 = p020k.C0177m.f2948p
            goto L_0x00a4
        L_0x00a2:
            k.m r1 = p020k.C0177m.f2929F
        L_0x00a4:
            r17 = r1
        L_0x00a6:
            java.lang.String[] r1 = r0.f105j
            r1 = r1[r14]
            java.lang.String r2 = "<"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x011b
            java.lang.String[] r1 = r0.f105j
            r1 = r1[r14]
            r4 = 0
            java.lang.String[] r1 = p013g.C0111c0.m590q(r1, r2, r4)
            r1 = r1[r15]
            java.lang.String r2 = ">"
            java.lang.String[] r1 = p013g.C0111c0.m590q(r1, r2, r15)
            int r2 = r0.f120y
            if (r2 != 0) goto L_0x00d0
            r2 = r1[r15]
            int r2 = java.lang.Integer.parseInt(r2)
        L_0x00cd:
            r0.f120y = r2
            goto L_0x00e6
        L_0x00d0:
            long r2 = p019j.C0161h.m1490h()
            f93A = r2
            long r18 = f94B
            long r18 = r2 - r18
            r20 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r16 < 0) goto L_0x00e6
            f94B = r2
            int r2 = r0.f120y
            int r2 = r2 - r15
            goto L_0x00cd
        L_0x00e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f120y
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r1 = r1[r6]
            r2.append(r1)
            java.lang.String r3 = r2.toString()
            int r1 = r0.f106k
            int r2 = r0.f102g
            int r2 = r2 / r6
            int r6 = r1 + r2
            int r1 = r0.f107l
            int r2 = r0.f104i
            int r1 = r1 + r2
            int r2 = r14 * 12
            int r1 = r1 + r2
            int r2 = r0.f121z
            int r15 = r1 - r2
            r1 = r17
            r2 = r23
            r18 = 0
            r4 = r6
            r6 = r5
            r5 = r15
            goto L_0x015d
        L_0x011b:
            r18 = 0
            if (r5 != r6) goto L_0x0141
            int r1 = r0.f106k
            int r2 = r0.f102g
            int r2 = r2 / r6
            int r4 = r1 + r2
            int r1 = r0.f107l
            int r2 = r0.f104i
            int r1 = r1 + r2
            int r2 = r14 * 12
            int r1 = r1 + r2
            int r2 = r0.f121z
            int r6 = r1 - r2
            r1 = r17
            r2 = r23
            r3 = r16
            r24 = r5
            r5 = r6
            r6 = r24
            r1.mo909a(r2, r3, r4, r5, r6)
            goto L_0x0142
        L_0x0141:
            r6 = r5
        L_0x0142:
            if (r6 != r15) goto L_0x0160
            int r1 = r0.f106k
            int r2 = r0.f102g
            int r1 = r1 + r2
            int r4 = r1 + -5
            int r1 = r0.f107l
            int r2 = r0.f104i
            int r1 = r1 + r2
            int r2 = r14 * 12
            int r1 = r1 + r2
            int r2 = r0.f121z
            int r5 = r1 - r2
            r1 = r17
            r2 = r23
            r3 = r16
        L_0x015d:
            r1.mo909a(r2, r3, r4, r5, r6)
        L_0x0160:
            r1 = r12
        L_0x0161:
            int r14 = r14 + 1
            r12 = 0
            goto L_0x0027
        L_0x0166:
            p018i.C0145a.m1346T(r23)
            r7.mo773E(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0006b.mo15j(j.f, int):void");
    }

    /* renamed from: k */
    public void mo16k() {
        if (f99G != null) {
            if (C0145a.f2659x) {
                f99G.mo160d();
            }
            boolean[] zArr = C0145a.f2576C;
            if (zArr[2]) {
                C0073l0 l0Var = f99G;
                int i = l0Var.f872b - 12;
                l0Var.f872b = i;
                if (i < 0) {
                    l0Var.f872b = 0;
                }
            }
            if (zArr[8]) {
                C0145a.f2574B[8] = false;
                C0073l0 l0Var2 = f99G;
                int i2 = l0Var2.f872b + 12;
                l0Var2.f872b = i2;
                int i3 = l0Var2.f884n;
                if (i2 > i3) {
                    l0Var2.f872b = i3;
                }
            }
        }
        if (C0145a.f2574B[5] || C0178n.m1639c(C0145a.f2625c0.f2972b)) {
            C0145a.f2574B[5] = false;
            C0178n.f2969g = -1;
            C0055d dVar = this.f113r;
            if (!(dVar == null && (dVar = this.f114s) == null && (dVar = this.f115t) == null)) {
                dVar.mo139d();
            }
        }
        C0073l0 l0Var3 = f99G;
        if (l0Var3 == null || !l0Var3.f888r) {
            C0055d dVar2 = this.f114s;
            if (dVar2 != null) {
                boolean[] zArr2 = C0145a.f2574B;
                if (zArr2[12] || zArr2[5] || C0178n.m1639c(dVar2)) {
                    boolean[] zArr3 = C0145a.f2574B;
                    zArr3[12] = false;
                    zArr3[5] = false;
                    C0145a.f2580E = false;
                    C0145a.f2582F = false;
                    this.f114s.mo139d();
                    C0178n.f2969g = -1;
                }
            }
            C0055d dVar3 = this.f115t;
            if (dVar3 == null) {
                return;
            }
            if (C0145a.f2574B[13] || C0178n.m1639c(dVar3)) {
                C0145a.f2574B[13] = false;
                C0145a.f2580E = false;
                C0145a.f2582F = false;
                this.f115t.mo139d();
                C0178n.f2969g = -1;
            }
        }
    }
}
