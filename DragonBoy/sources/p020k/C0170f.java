package p020k;

import p001b.C0006b;
import p001b.C0008d;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p012f.C0105d;
import p013g.C0111c0;
import p013g.C0113d0;
import p013g.C0121h0;
import p013g.C0122i;
import p013g.C0126k;
import p013g.C0139x;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: k.f */
public class C0170f extends C0178n implements C0072l {

    /* renamed from: J */
    public static boolean f2805J = false;

    /* renamed from: K */
    public static boolean f2806K;

    /* renamed from: L */
    public static boolean f2807L;

    /* renamed from: M */
    public static boolean f2808M;

    /* renamed from: N */
    public static boolean f2809N;

    /* renamed from: O */
    public static boolean f2810O;

    /* renamed from: P */
    public static String f2811P;

    /* renamed from: Q */
    public static C0143b f2812Q;

    /* renamed from: R */
    public static short f2813R;

    /* renamed from: S */
    public static long f2814S;

    /* renamed from: T */
    public static long f2815T;

    /* renamed from: U */
    public static boolean f2816U;

    /* renamed from: A */
    int f2817A;

    /* renamed from: B */
    int f2818B = (C0145a.f2623b0 - 30);

    /* renamed from: C */
    int f2819C;

    /* renamed from: D */
    int f2820D = -1;

    /* renamed from: E */
    public boolean f2821E = false;

    /* renamed from: F */
    int f2822F = 2;

    /* renamed from: G */
    int f2823G = 0;

    /* renamed from: H */
    int f2824H = -40;

    /* renamed from: I */
    int f2825I = 1;

    /* renamed from: i */
    public C0176l f2826i;

    /* renamed from: j */
    public C0176l f2827j;

    /* renamed from: k */
    int f2828k;

    /* renamed from: l */
    int f2829l;

    /* renamed from: m */
    int f2830m;

    /* renamed from: n */
    int f2831n;

    /* renamed from: o */
    public boolean f2832o = false;

    /* renamed from: p */
    public boolean f2833p = false;

    /* renamed from: q */
    C0055d f2834q;

    /* renamed from: r */
    C0055d f2835r;

    /* renamed from: s */
    C0055d f2836s;

    /* renamed from: t */
    C0055d f2837t;

    /* renamed from: u */
    C0055d f2838u;

    /* renamed from: v */
    String f2839v;

    /* renamed from: w */
    String f2840w;

    /* renamed from: x */
    C0055d f2841x;

    /* renamed from: y */
    int f2842y;

    /* renamed from: z */
    C0055d f2843z;

    public C0170f() {
        byte currentTimeMillis = (byte) ((int) (System.currentTimeMillis() % 9));
        C0121h0.f1806y = currentTimeMillis;
        if (currentTimeMillis == 5 || currentTimeMillis == 6) {
            C0121h0.f1806y = 4;
        }
        C0126k.m855A0(true, -1, -1);
        C0126k.f2028t1 = 100;
        C0126k.f2032u1 = 200;
        this.f2831n = C0145a.f2616W > 200 ? C0145a.f2623b0 - 80 : C0145a.f2623b0 - 65;
        mo838r();
        this.f2829l = C0145a.f2614V >= 200 ? 160 : 140;
        if (this.f2841x == null) {
            C0055d dVar = new C0055d("Gọi hotline", (C0072l) this, 13, (Object) null);
            this.f2841x = dVar;
            dVar.f407h = C0145a.f2614V - 75;
            if (C0161h.f2758f != 1 || C0145a.f2659x) {
                dVar.f408i = (C0161h.f2753a ? 19 : 2) + 6;
            } else {
                dVar.f408i = C0145a.f2616W - 20;
            }
        }
        this.f2842y = (C0145a.f2623b0 - C0178n.f2966d) - 5;
        if (C0145a.f2616W <= 160) {
            this.f2842y = 20;
        }
        C0176l lVar = new C0176l();
        this.f2826i = lVar;
        int i = C0145a.f2623b0;
        int i2 = C0178n.f2966d;
        lVar.f2900b = (i - i2) - 9;
        lVar.f2901c = this.f2829l;
        lVar.f2902d = i2 + 2;
        lVar.f2903e = true;
        lVar.mo903n(0);
        this.f2826i.f2905g = C0057d1.f598a0 + "/" + C0057d1.f605b0;
        C0176l lVar2 = new C0176l();
        this.f2827j = lVar2;
        lVar2.f2900b = C0145a.f2623b0 - 4;
        lVar2.mo903n(2);
        C0176l lVar3 = this.f2827j;
        lVar3.f2901c = this.f2829l;
        lVar3.f2902d = C0178n.f2966d + 2;
        this.f2842y += 35;
        this.f2832o = true;
        int d = C0149b.m1399d("check");
        if (d == 1) {
            this.f2832o = true;
        } else if (d == 2) {
            this.f2832o = false;
        }
        this.f2826i.mo906r(C0149b.m1400e("acc"));
        this.f2827j.mo906r(C0149b.m1400e("pass"));
        this.f2826i.mo906r(this.f2839v);
        this.f2827j.mo906r(this.f2840w);
        this.f2828k = 0;
        this.f2834q = new C0055d(C0145a.f2614V > 200 ? C0057d1.f696o0 : C0057d1.f703p0, (C0072l) C0145a.f2572A, 888393, (Object) null);
        new C0055d(C0057d1.f676l1, (C0072l) this, 2001, (Object) null);
        this.f2836s = new C0055d(C0057d1.f710q0, (C0072l) this, 2002, (Object) null);
        this.f2838u = new C0055d(C0057d1.f690n1, (C0072l) this, 10021, (Object) null);
        C0055d dVar2 = new C0055d(C0057d1.f599a1, (C0072l) this, 2003, (Object) null);
        this.f2837t = dVar2;
        this.f2971a = dVar2;
        if (C0145a.f2659x) {
            C0055d dVar3 = this.f2834q;
            int i3 = C0145a.f2614V;
            dVar3.f407h = (i3 / 2) + 8;
            dVar2.f407h = ((i3 / 2) - C0178n.f2967e) - 8;
            if (C0145a.f2616W >= 200) {
                int i4 = this.f2818B;
                dVar3.f408i = i4 + 110;
                dVar2.f408i = i4 + 110;
            }
            C0055d dVar4 = this.f2838u;
            int i5 = C0145a.f2614V;
            dVar4.f407h = (i5 / 2) + 3;
            dVar4.f408i = this.f2818B + 110;
            C0055d dVar5 = this.f2836s;
            dVar5.f407h = (i5 / 2) - 84;
            dVar5.f408i = dVar2.f408i;
        }
        this.f2819C = 170;
        int i6 = C0145a.f2621a0;
        int i7 = 170 / 2;
        C0176l lVar4 = this.f2826i;
        int i8 = lVar4.f2900b;
        int i9 = 184;
        int i10 = C0145a.f2614V;
        int i11 = (i10 / 2) - ((184 >= i10 ? 152 : i9) / 2);
        this.f2817A = i11;
        int i12 = C0145a.f2623b0 - 30;
        this.f2818B = i12;
        int i13 = C0145a.f2614V;
        lVar4.f2899a = i11 + 10;
        lVar4.f2900b = i12 + 20;
        C0055d dVar6 = new C0055d(C0057d1.f669k1, (C0072l) this, 2008, (Object) null);
        this.f2843z = dVar6;
        dVar6.f407h = (C0145a.f2614V / 2) - 84;
        dVar6.f408i = this.f2834q.f408i;
        C0055d dVar7 = new C0055d(C0057d1.f552T, (C0072l) this, 1003, (Object) null);
        this.f2835r = dVar7;
        dVar7.f407h = (C0145a.f2614V / 2) + 3;
        dVar7.f408i = this.f2834q.f408i;
        this.f2972b = this.f2843z;
        this.f2971a = dVar7;
    }

    /* renamed from: m */
    private void m1536m() {
        int i = this.f2820D + 1;
        this.f2820D = i;
        if (i >= C0057d1.f532Q0.length) {
            this.f2820D = 0;
        }
        C0122i iVar = C0145a.f2637i0;
        C0139x xVar = C0145a.f2639j0;
        if (iVar == xVar && xVar.f2343e) {
            xVar.mo603d(C0057d1.f532Q0[this.f2820D]);
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        int i;
        int i2;
        C0177m mVar;
        C0143b bVar;
        C0145a.m1363r("PLG1", 1);
        C0145a.m1340L(fVar);
        C0145a.m1363r("PLG2", 2);
        int i3 = this.f2826i.f2900b - 50;
        if (C0145a.f2616W <= 220) {
            i3 += 5;
        }
        int i4 = i3;
        C0177m.f2929F.mo910b(fVar, "v1.9.3", C0145a.f2614V - 2, 17, 1, C0177m.f2925B);
        if (C0161h.f2758f != 1 || C0145a.f2659x) {
            mVar = C0177m.f2929F;
            i2 = C0145a.f2614V - 2;
            i = 2;
        } else {
            mVar = C0177m.f2929F;
            i2 = C0145a.f2614V - 2;
            i = C0145a.f2616W - 15;
        }
        mVar.mo910b(fVar, "http://ngocrongonline.com", i2, i, 1, C0177m.f2925B);
        if (C0006b.f95C == null && C0006b.f96D == null) {
            if (C0145a.f2637i0 == null) {
                C0067i0.m243g(fVar, this.f2817A, this.f2818B - 10, C0145a.f2614V >= 200 ? 180 : 160, 105, -1, true);
                if (C0145a.f2616W > 160 && (bVar = f2812Q) != null) {
                    fVar.mo776e(bVar, C0145a.f2621a0, i4, 3);
                }
                C0145a.m1363r("PLG4", 1);
                int i5 = 184;
                int i6 = C0145a.f2614V;
                if (184 >= i6) {
                    i5 = 152;
                }
                int i7 = (i6 / 2) - (i5 / 2);
                this.f2817A = i7;
                C0176l lVar = this.f2826i;
                lVar.f2899a = i7 + 10;
                int i8 = this.f2818B;
                lVar.f2900b = i8 + 20;
                C0176l lVar2 = this.f2827j;
                lVar2.f2899a = i7 + 10;
                lVar2.f2900b = i8 + 55;
                lVar.mo901l(fVar);
                this.f2827j.mo901l(fVar);
                if (C0145a.f2614V < 176) {
                    C0176l lVar3 = this.f2826i;
                    C0177m.f2952t.mo909a(fVar, C0057d1.f612c0 + ":", lVar3.f2899a - 35, lVar3.f2900b + 7, 0);
                    C0176l lVar4 = this.f2827j;
                    C0177m.f2952t.mo909a(fVar, C0057d1.f619d0 + ":", lVar4.f2899a - 35, lVar4.f2900b + 7, 0);
                    C0177m.f2952t.mo909a(fVar, C0057d1.f420A0 + ": " + f2811P, C0145a.f2614V / 2, this.f2827j.f2900b + 32, 2);
                }
            }
            super.mo341d(fVar);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i != 13) {
            if (i == 2008) {
                C0149b.m1404i("acc", this.f2826i.mo899f().trim());
                C0149b.m1404i("pass", this.f2827j.mo899f().trim());
                if (!C0113d0.f1353N) {
                    C0145a.f2638i1.mo367t();
                    return;
                }
            } else if (i == 4000) {
                mo837q(this.f2826i.mo899f());
                return;
            } else if (i != 10021) {
                if (i == 10041) {
                    C0149b.m1403h("lowGraphic", 0);
                } else if (i != 10042) {
                    switch (i) {
                        case 1000:
                            try {
                                C0146b.f2678f.mo721b((String) obj);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            C0145a.m1366v();
                            return;
                        case 1001:
                            C0145a.m1366v();
                            this.f2833p = false;
                            return;
                        case 1002:
                            C0145a.m1351Z();
                            String e2 = C0149b.m1400e("userAo" + C0113d0.f1343D);
                            if (e2 == null || e2.equals("")) {
                                C0105d.m365M().mo277f0("");
                                return;
                            }
                            C0145a.f2633g0.f2821E = true;
                            C0145a.m1360o();
                            C0105d.m365M().mo246S0();
                            C0105d.m365M().mo274e0(e2, "", "1.9.3", (byte) 1);
                            return;
                        case 1003:
                            C0145a.m1349X(C0057d1.f626e0);
                            return;
                        case 1004:
                            C0113d0.m628k();
                            break;
                        case 1005:
                            try {
                                C0146b.f2678f.mo721b("http://ngocrongonline.com");
                                return;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                return;
                            }
                        default:
                            switch (i) {
                                case 2001:
                                    if (this.f2832o) {
                                        this.f2832o = false;
                                        return;
                                    } else {
                                        this.f2832o = true;
                                        return;
                                    }
                                case 2002:
                                    mo836p();
                                    return;
                                case 2003:
                                    mo835o();
                                    return;
                                case 2004:
                                    mo831j();
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    C0149b.m1403h("lowGraphic", 1);
                }
                C0145a.m1348W(C0057d1.f768y2, 8885, (Object) null);
                return;
            } else {
                mo832k();
                return;
            }
            C0145a.f2638i1.mo342f();
            return;
        }
        int i2 = C0161h.f2758f;
        if (i2 == 1) {
            C0161h.m1485c();
        } else if (i2 == 2) {
            C0161h.m1483a();
        } else if (i2 == 3 || i2 == 5) {
            C0161h.m1484b();
        } else if (i2 == 6) {
            C0161h.m1486d();
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0175k.m1563p().mo865P();
        C0176l lVar = this.f2826i;
        lVar.f2903e = true;
        this.f2827j.f2903e = false;
        if (C0145a.f2659x) {
            lVar.f2903e = false;
        }
        C0145a.m1338H(0);
        super.mo342f();
    }

    /* renamed from: g */
    public void mo348g() {
        super.mo348g();
    }

    /* renamed from: h */
    public void mo343h() {
        C0176l lVar;
        C0055d dVar;
        if (f2813R > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            f2815T = currentTimeMillis;
            if (currentTimeMillis - f2814S >= 1000) {
                short s = (short) (f2813R - 1);
                f2813R = s;
                if (s == 0) {
                    C0145a.f2633g0.mo834n();
                }
                f2814S = f2815T;
            }
        }
        if (!this.f2821E || this.f2833p) {
            this.f2826i.f2905g = C0057d1.f598a0 + "/" + C0057d1.f605b0;
            this.f2827j.f2905g = C0057d1.f559U;
            this.f2826i.mo908t();
        } else {
            this.f2826i.f2905g = C0057d1.f598a0 + "/" + C0057d1.f605b0;
            C0176l lVar2 = this.f2827j;
            lVar2.f2905g = C0057d1.f559U;
            C0176l lVar3 = this.f2826i;
            lVar3.f2923y = false;
            lVar2.f2923y = false;
            lVar3.mo908t();
        }
        this.f2827j.mo908t();
        for (int i = 0; i < C0008d.f124b.size(); i++) {
            ((C0008d) C0008d.f124b.elementAt(i)).mo13b();
        }
        if (f2806K && !f2807L && !f2810O && !f2808M && !f2809N) {
            f2806K = false;
            System.gc();
            C0105d.m365M().mo228J();
        }
        int i2 = C0126k.f2028t1 + 1;
        C0126k.f2028t1 = i2;
        if (i2 > (C0145a.f2614V * 3) + 100) {
            C0126k.f2028t1 = 100;
        }
        if (C0006b.f95C == null) {
            C0145a.m1363r("LGU1", 0);
            C0145a.m1363r("LGU2", 0);
            C0145a.m1363r("LGU3", 0);
            mo840t();
            C0145a.m1363r("LGU4", 0);
            C0145a.m1363r("LGU5", 0);
            int i3 = this.f2823G;
            if (i3 >= 0) {
                int i4 = this.f2824H;
                int i5 = this.f2825I;
                int i6 = i4 + (i5 * i3);
                this.f2824H = i6;
                int i7 = this.f2822F;
                int i8 = i3 + (i5 * i7);
                this.f2823G = i8;
                if (i8 <= 0) {
                    this.f2825I = i5 * -1;
                }
                if (i6 > 0) {
                    this.f2825I *= -1;
                    this.f2823G = i8 - (i7 * 2);
                }
            }
            C0145a.m1363r("LGU6", 0);
            if (this.f2820D >= 0 && C0145a.f2600O % 100 == 0) {
                m1536m();
            }
            if (!this.f2821E || this.f2833p) {
                this.f2826i.f2905g = C0057d1.f598a0 + "/" + C0057d1.f605b0;
                this.f2827j.f2905g = C0057d1.f559U;
                lVar = this.f2826i;
            } else {
                lVar = this.f2826i;
                lVar.f2923y = false;
                this.f2827j.f2923y = false;
            }
            lVar.mo908t();
            this.f2827j.mo908t();
            if (!C0145a.f2659x ? !this.f2833p : !this.f2833p) {
                this.f2972b = this.f2843z;
                dVar = this.f2835r;
            } else {
                this.f2972b = this.f2836s;
                dVar = this.f2838u;
            }
            this.f2971a = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 < 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r2 > 1) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00be  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo344i() {
        /*
            r6 = this;
            boolean r0 = f2805J
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 == 0) goto L_0x0018
            e.d r0 = r6.f2841x
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.mo137a()
            if (r0 == 0) goto L_0x0018
            e.d r0 = r6.f2841x
            r0.mo139d()
        L_0x0018:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 != 0) goto L_0x0029
            k.l r0 = r6.f2826i
            boolean r1 = r0.f2903e
            if (r1 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            k.l r0 = r6.f2827j
        L_0x0025:
            e.d r0 = r0.f2922x
            r6.f2973c = r0
        L_0x0029:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 2
            boolean r2 = r0[r1]
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L_0x003d
            int r2 = r6.f2828k
            int r2 = r2 - r4
            r6.f2828k = r2
            if (r2 >= 0) goto L_0x0049
        L_0x003a:
            r6.f2828k = r4
            goto L_0x0049
        L_0x003d:
            boolean r2 = r0[r3]
            if (r2 == 0) goto L_0x0049
            int r2 = r6.f2828k
            int r2 = r2 + r4
            r6.f2828k = r2
            if (r2 <= r4) goto L_0x0049
            goto L_0x003a
        L_0x0049:
            boolean r1 = r0[r1]
            r2 = 0
            if (r1 != 0) goto L_0x0052
            boolean r0 = r0[r3]
            if (r0 == 0) goto L_0x007a
        L_0x0052:
            p018i.C0145a.m1359n()
            boolean r0 = r6.f2821E
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.f2833p
            if (r0 != 0) goto L_0x005e
            goto L_0x007a
        L_0x005e:
            int r0 = r6.f2828k
            if (r0 != r4) goto L_0x006b
            k.l r0 = r6.f2826i
            r0.f2903e = r2
            k.l r0 = r6.f2827j
            r0.f2903e = r4
            goto L_0x007a
        L_0x006b:
            if (r0 != 0) goto L_0x0072
            k.l r0 = r6.f2826i
            r0.f2903e = r4
            goto L_0x0076
        L_0x0072:
            k.l r0 = r6.f2826i
            r0.f2903e = r2
        L_0x0076:
            k.l r0 = r6.f2827j
            r0.f2903e = r2
        L_0x007a:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6.f2833p
            if (r0 == 0) goto L_0x008e
            goto L_0x0087
        L_0x0083:
            boolean r0 = r6.f2833p
            if (r0 == 0) goto L_0x008e
        L_0x0087:
            e.d r0 = r6.f2836s
            r6.f2972b = r0
            e.d r0 = r6.f2838u
            goto L_0x0094
        L_0x008e:
            e.d r0 = r6.f2843z
            r6.f2972b = r0
            e.d r0 = r6.f2835r
        L_0x0094:
            r6.f2971a = r0
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r6.f2821E
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r6.f2833p
            if (r0 != 0) goto L_0x00a3
            goto L_0x00d7
        L_0x00a3:
            k.l r0 = r6.f2826i
            int r1 = r0.f2899a
            int r3 = r0.f2900b
            int r5 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r3, r5, r0)
            if (r0 == 0) goto L_0x00be
            r6.f2828k = r2
            k.l r0 = r6.f2826i
            r0.f2903e = r4
            k.l r0 = r6.f2827j
        L_0x00bb:
            r0.f2903e = r2
            goto L_0x00d7
        L_0x00be:
            k.l r0 = r6.f2827j
            int r1 = r0.f2899a
            int r3 = r0.f2900b
            int r5 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r3, r5, r0)
            if (r0 == 0) goto L_0x00d7
            r6.f2828k = r4
            k.l r0 = r6.f2827j
            r0.f2903e = r4
            k.l r0 = r6.f2826i
            goto L_0x00bb
        L_0x00d7:
            super.mo344i()
            p018i.C0145a.m1359n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0170f.mo344i():void");
    }

    /* renamed from: j */
    public void mo831j() {
        C0145a.m1366v();
        C0145a.m1349X(C0057d1.f467G5);
        this.f2833p = true;
        this.f2827j.f2903e = false;
        this.f2826i.f2903e = true;
    }

    /* renamed from: k */
    public void mo832k() {
        if (this.f2821E) {
            mo834n();
            return;
        }
        this.f2833p = false;
        this.f2827j.f2903e = false;
        this.f2826i.f2903e = true;
        this.f2971a = this.f2837t;
    }

    /* renamed from: l */
    public void mo833l() {
        if (C0145a.f2633g0.f2821E) {
            C0145a.m1354c0(C0057d1.f460F5, new C0055d(C0057d1.f634f1, (C0072l) C0145a.f2629e0, 10019, (Object) null), new C0055d(C0057d1.f641g1, (C0072l) C0145a.f2629e0, 10020, (Object) null));
            return;
        }
        C0145a.f2572A.mo734s(C0145a.f2633g0);
        C0150c.m1414n().mo744k();
    }

    /* renamed from: n */
    public void mo834n() {
        StringBuilder sb = new StringBuilder();
        sb.append("user ao= ");
        sb.append(C0149b.m1400e("userAo" + C0113d0.f1343D));
        C0111c0.m584k(sb.toString());
        String e = C0149b.m1400e("acc");
        String e2 = C0149b.m1400e("pass");
        if (e == null || e.equals("")) {
            if (C0149b.m1400e("userAo" + C0113d0.f1343D) != null) {
                if (!C0149b.m1400e("userAo" + C0113d0.f1343D).equals("")) {
                    this.f2821E = true;
                    C0111c0.m584k("isLogin 2= " + this.f2821E);
                    if ((e == null || e.equals("")) && this.f2821E) {
                        e = C0149b.m1400e("userAo" + C0113d0.f1343D);
                        e2 = "a";
                    }
                    C0111c0.m584k("user = " + e + " pass= " + e2);
                    if (e != null && e2 != null && !e.equals("")) {
                        if (e2.equals("")) {
                            this.f2828k = 1;
                            this.f2826i.f2903e = false;
                            C0176l lVar = this.f2827j;
                            lVar.f2903e = true;
                            if (!C0145a.f2659x) {
                                this.f2973c = lVar.f2922x;
                                return;
                            }
                            return;
                        }
                        C0145a.m1360o();
                        C0105d.m365M().mo274e0(e, e2, "1.9.3", this.f2821E ? (byte) 1 : 0);
                        if (C0150c.m1414n().f2708e) {
                            C0145a.m1351Z();
                        } else {
                            C0145a.m1349X(C0057d1.f716r);
                        }
                        this.f2828k = 0;
                        if (!this.f2821E) {
                            mo832k();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        this.f2821E = false;
        C0111c0.m584k("isLogin 2= " + this.f2821E);
        e = C0149b.m1400e("userAo" + C0113d0.f1343D);
        e2 = "a";
        C0111c0.m584k("user = " + e + " pass= " + e2);
        if (e != null) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo835o() {
        C0173i iVar = new C0173i("vMenu Login");
        iVar.addElement(new C0055d(C0057d1.f538R, (C0072l) this, 2004, (Object) null));
        if (!this.f2821E) {
            iVar.addElement(new C0055d(C0057d1.f545S, (C0072l) this, 1004, (Object) null));
        }
        iVar.addElement(new C0055d(C0057d1.f552T, (C0072l) this, 1003, (Object) null));
        iVar.addElement(new C0055d(C0057d1.f773z0, (C0072l) this, 1005, (Object) null));
        iVar.addElement(C0149b.m1399d("lowGraphic") == 1 ? new C0055d(C0057d1.f512N1, (C0072l) this, 10041, (Object) null) : new C0055d(C0057d1.f519O1, (C0072l) this, 10042, (Object) null));
        iVar.addElement(new C0055d(C0057d1.f648h1, (C0072l) C0145a.f2572A, 8885, (Object) null));
        C0145a.f2627d0.mo590g(iVar, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo836p() {
        /*
            r8 = this;
            k.l r0 = r8.f2826i
            java.lang.String r0 = r0.mo899f()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = p011e.C0057d1.f503M
            p018i.C0145a.m1349X(r0)
            return
        L_0x0014:
            k.l r0 = r8.f2826i
            java.lang.String r0 = r0.mo899f()
            r0.toCharArray()
            k.l r0 = r8.f2827j
            java.lang.String r0 = r0.mo899f()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = p011e.C0057d1.f510N
            p018i.C0145a.m1349X(r0)
            return
        L_0x002f:
            k.l r0 = r8.f2826i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.length()
            r1 = 5
            if (r0 >= r1) goto L_0x0042
            java.lang.String r0 = p011e.C0057d1.f517O
            p018i.C0145a.m1349X(r0)
            return
        L_0x0042:
            r0 = 1
            r1 = 0
            k.l r2 = r8.f2826i     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.mo899f()     // Catch:{ Exception -> 0x008c }
            java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x008c }
            k.l r2 = r8.f2826i     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.mo899f()     // Catch:{ Exception -> 0x008c }
            int r2 = r2.length()     // Catch:{ Exception -> 0x008c }
            r3 = 8
            if (r2 < r3) goto L_0x0088
            k.l r2 = r8.f2826i     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.mo899f()     // Catch:{ Exception -> 0x008c }
            int r2 = r2.length()     // Catch:{ Exception -> 0x008c }
            r3 = 12
            if (r2 > r3) goto L_0x0088
            k.l r2 = r8.f2826i     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.mo899f()     // Catch:{ Exception -> 0x008c }
            java.lang.String r3 = "0"
            boolean r2 = r2.startsWith(r3)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0086
            k.l r2 = r8.f2826i     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.mo899f()     // Catch:{ Exception -> 0x008c }
            java.lang.String r3 = "84"
            boolean r2 = r2.startsWith(r3)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r2 = r1
            goto L_0x008a
        L_0x0088:
            java.lang.String r2 = p011e.C0057d1.f524P     // Catch:{ Exception -> 0x008c }
        L_0x008a:
            r3 = 1
            goto L_0x00b0
        L_0x008c:
            k.l r2 = r8.f2826i
            java.lang.String r2 = r2.mo899f()
            java.lang.String r3 = "@"
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x00ad
            k.l r2 = r8.f2826i
            java.lang.String r2 = r2.mo899f()
            java.lang.String r4 = "."
            int r2 = r2.indexOf(r4)
            if (r2 != r3) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r2 = r1
            goto L_0x00af
        L_0x00ad:
            java.lang.String r2 = p011e.C0057d1.f531Q
        L_0x00af:
            r3 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00b6
            p018i.C0145a.m1349X(r2)
            goto L_0x011c
        L_0x00b6:
            g.x r2 = p018i.C0145a.f2639j0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = p011e.C0057d1.f591Z
            r4.append(r5)
            java.lang.String r5 = ": "
            if (r3 != r0) goto L_0x00ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = p011e.C0057d1.f598a0
            goto L_0x00d5
        L_0x00ce:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = p011e.C0057d1.f605b0
        L_0x00d5:
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            k.l r0 = r8.f2826i
            java.lang.String r0 = r0.mo899f()
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            java.lang.String r0 = p011e.C0057d1.f559U
            r4.append(r0)
            r4.append(r5)
            k.l r0 = r8.f2827j
            java.lang.String r0 = r0.mo899f()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            e.d r3 = new e.d
            java.lang.String r4 = p011e.C0057d1.f683m1
            r5 = 4000(0xfa0, float:5.605E-42)
            r3.<init>((java.lang.String) r4, (p011e.C0072l) r8, (int) r5, (java.lang.Object) r1)
            e.d r4 = new e.d
            java.lang.String r5 = p011e.C0057d1.f641g1
            i.a r6 = p018i.C0145a.f2572A
            r7 = 8882(0x22b2, float:1.2446E-41)
            r4.<init>((java.lang.String) r5, (p011e.C0072l) r6, (int) r7, (java.lang.Object) r1)
            r2.mo604e(r0, r3, r1, r4)
        L_0x011c:
            g.x r0 = p018i.C0145a.f2639j0
            p018i.C0145a.f2637i0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0170f.mo836p():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo837q(String str) {
        C0145a.m1352a0(C0057d1.f731t0);
        C0145a.m1360o();
        C0145a.m1352a0(C0057d1.f426B);
        this.f2827j.mo899f();
        C0105d M = C0105d.m365M();
        String f = this.f2827j.mo899f();
        M.mo219E0(str, f, C0149b.m1400e("userAo" + C0113d0.f1343D), C0149b.m1400e("passAo"), "1.9.3");
        C0149b.m1404i("acc", str);
        C0149b.m1404i("pass", this.f2827j.mo899f());
    }

    /* renamed from: r */
    public void mo838r() {
        this.f2830m = -50;
    }

    /* renamed from: s */
    public void mo839s() {
        String str;
        if (this.f2832o) {
            C0149b.m1403h("check", 1);
            C0149b.m1404i("acc", this.f2826i.mo899f().toLowerCase().trim());
            str = this.f2827j.mo899f().toLowerCase().trim();
        } else {
            C0149b.m1403h("check", 2);
            str = "";
            C0149b.m1404i("acc", str);
        }
        C0149b.m1404i("pass", str);
    }

    /* renamed from: t */
    public void mo840t() {
        int i = this.f2831n;
        int i2 = this.f2830m;
        if (i != i2) {
            this.f2830m = i2 + ((i - i2) >> 1);
        }
    }
}
