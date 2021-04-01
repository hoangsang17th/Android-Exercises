package p011e;

import p001b.C0006b;
import p013g.C0114e;
import p013g.C0117f0;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0137v;
import p013g.C0140y;
import p018i.C0145a;
import p019j.C0159f;

/* renamed from: e.k */
public class C0070k {

    /* renamed from: a */
    public static int f854a;

    /* renamed from: b */
    public static int f855b;

    /* renamed from: c */
    public static int f856c;

    /* renamed from: d */
    public static int f857d;

    /* renamed from: e */
    public static boolean f858e;

    /* renamed from: f */
    public static boolean f859f;

    /* renamed from: g */
    public static boolean f860g;

    /* renamed from: h */
    public static boolean f861h;

    /* renamed from: i */
    public static boolean f862i;

    /* renamed from: j */
    public static int f863j;

    /* renamed from: k */
    public static boolean f864k;

    /* renamed from: l */
    public static boolean f865l;

    /* renamed from: a */
    public static void m254a() {
        boolean z;
        f856c = 1;
        if (C0145a.f2629e0.f2467a) {
            f861h = false;
        }
        int i = 0;
        while (true) {
            if (i >= C0126k.f1920V1.size()) {
                z = false;
                break;
            } else if (((C0137v) C0126k.f1920V1.elementAt(i)).f2299c) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        for (int i2 = 0; i2 < C0126k.f1920V1.size(); i2++) {
            C0137v vVar = (C0137v) C0126k.f1920V1.elementAt(i2);
            if (vVar.f2299c) {
                f854a = vVar.f2315k;
                f855b = vVar.f2317l + 5;
                f862i = true;
                if (vVar.f2321o == 0) {
                    vVar.f2299c = false;
                    return;
                }
                return;
            }
            if (!z) {
                if (vVar.f2321o == 0) {
                    vVar.f2299c = false;
                } else {
                    vVar.f2299c = true;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m255b() {
        if (C0145a.f2629e0.f2467a) {
            f861h = false;
        }
        if (C0126k.m894e0() != null) {
            f854a = C0126k.m894e0().f1593n;
            f855b = C0126k.m894e0().f1598o;
            f863j = 0;
            f862i = true;
            f856c = C0145a.f2659x ? 1 : 0;
        }
    }

    /* renamed from: c */
    public static void m256c() {
        int i;
        int i2;
        if (C0114e.m647e0().f1644x0 != null && C0145a.f2625c0 == C0126k.f1970h1) {
            short s = C0114e.m647e0().f1644x0.f1097c;
            int i3 = C0114e.m647e0().f1644x0.f1095a;
            f862i = false;
            f863j = 0;
            f856c = 0;
            f861h = true;
            f865l = true;
            if (C0145a.f2627d0.f2239a && s > 0) {
                f861h = false;
            }
            int i4 = 65;
            int i5 = 10;
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (C0114e.m647e0().f1644x0.f1097c == 9 && C0114e.m647e0().f1644x0.f1095a == 2) {
                            for (int i6 = 0; i6 < C0067i0.f825n.size(); i6++) {
                                C0067i0 i0Var = (C0067i0) C0067i0.f825n.elementAt(i6);
                                int i7 = i0Var.f834e;
                                if (i7 <= 24) {
                                    f854a = i0Var.f833d + (i0Var.f830a / 2);
                                    f855b = i7 + 30;
                                    f862i = true;
                                    f861h = false;
                                    f865l = true;
                                    return;
                                }
                            }
                        }
                    } else if (C0006b.f95C == null && C0114e.m647e0().f1628u != 14) {
                        if (i3 == 0) {
                            if (!C0121h0.m826f()) {
                                f859f = true;
                            }
                            C0140y yVar = C0145a.f2629e0;
                            if (!yVar.f2467a) {
                                if (!f859f) {
                                    f854a = C0126k.m893c0().f2062D.f407h;
                                    f855b = C0126k.m893c0().f2062D.f408i + 13;
                                    f863j = 1;
                                } else {
                                    if (C0126k.m895f0() != C0121h0.f1803v) {
                                        m259f(0);
                                    } else if (!m257d()) {
                                        m254a();
                                    }
                                    if (f859f) {
                                        f860g = true;
                                    }
                                }
                            } else if (!f859f) {
                                if (yVar.f2404F == 0) {
                                    if (C0145a.f2616W > 300) {
                                        i5 = 15;
                                    }
                                    C0140y yVar2 = C0145a.f2629e0;
                                    f854a = yVar2.f2510o0 + (yVar2.f2516q0 / 2);
                                    i4 = (yVar2.f2513p0 + yVar2.f2519r0) - i5;
                                } else {
                                    f854a = yVar.f2407G + 10;
                                }
                                f855b = i4;
                            } else if (!f860g) {
                                C0055d dVar = yVar.f2495j0;
                                f854a = dVar.f407h + 5;
                                f855b = dVar.f408i + 5;
                            } else {
                                f861h = false;
                            }
                            if (C0114e.m647e0().f1426G <= 0) {
                                f854a = C0126k.f1843B4 + 5;
                                f855b = C0126k.f1847C4 + 13;
                                f862i = false;
                            }
                        }
                        if (i3 != 1) {
                            return;
                        }
                    }
                } else if (C0006b.f95C == null && C0114e.m647e0().f1628u != 14) {
                    if (i3 == 0) {
                        if (C0121h0.m826f()) {
                            m259f(0);
                        } else {
                            m254a();
                        }
                    }
                    if (i3 != 1) {
                        return;
                    }
                    if (!C0121h0.m826f()) {
                        m259f(1);
                        return;
                    }
                }
                f854a = C0145a.f2614V / 2;
                f855b = C0145a.f2616W - 15;
                return;
            }
            if (C0006b.f95C == null && C0114e.m647e0().f1628u != 14) {
                if (i3 == 0 && C0121h0.f1766E.size() != 0) {
                    f854a = ((C0054c1) C0121h0.f1766E.elementAt(0)).f387a - 100;
                    f855b = ((C0054c1) C0121h0.f1766E.elementAt(0)).f388b + 40;
                    f862i = true;
                }
                if (i3 == 1) {
                    m259f(0);
                }
                if (i3 == 2) {
                    m255b();
                }
                if (i3 == 3) {
                    C0140y yVar3 = C0145a.f2629e0;
                    if (!yVar3.f2467a) {
                        m255b();
                    } else {
                        int i8 = yVar3.f2404F;
                        if (i8 == 0) {
                            if (yVar3.f2522s0 == null) {
                                f854a = yVar3.f2510o0 + (yVar3.f2516q0 / 2);
                                i2 = yVar3.f2513p0 + 20;
                            } else if (C0145a.f2627d0.f2250l != 0) {
                                C0140y yVar4 = C0145a.f2629e0;
                                f854a = yVar4.f2510o0 + 25;
                                i2 = yVar4.f2513p0 + 60;
                            }
                            f855b = i2;
                        } else if (i8 == 1) {
                            f854a = yVar3.f2407G + 10;
                            f855b = 65;
                        }
                    }
                }
                if (i3 == 4) {
                    C0140y yVar5 = C0145a.f2629e0;
                    if (yVar5.f2467a) {
                        C0055d dVar2 = yVar5.f2495j0;
                        f854a = dVar2.f407h + 5;
                        i = dVar2.f408i + 5;
                    } else if (C0145a.f2627d0.f2239a) {
                        f854a = C0145a.f2614V / 2;
                        i = C0145a.f2616W - 20;
                    } else {
                        m255b();
                    }
                    f855b = i;
                }
                if (i3 != 5) {
                    return;
                }
            }
            f854a = C0145a.f2614V / 2;
            f855b = C0145a.f2616W - 15;
            return;
            m255b();
            return;
        }
        f861h = false;
        f865l = false;
    }

    /* renamed from: d */
    public static boolean m257d() {
        if (C0145a.f2629e0.f2467a) {
            f861h = false;
        }
        for (int i = 0; i < C0126k.f1912T1.size(); i++) {
            C0078o oVar = (C0078o) C0126k.f1912T1.elementAt(i);
            if (oVar.f972g == C0114e.m647e0().f1638w && oVar.f974i.f1026a == 73) {
                f856c = 1;
                f854a = oVar.f966a;
                f855b = oVar.f967b + 5;
                f862i = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m258e(int i, int i2) {
        return C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1097c == i && C0114e.m647e0().f1644x0.f1095a == i2;
    }

    /* renamed from: f */
    public static void m259f(int i) {
        if (!C0145a.f2629e0.f2467a && C0067i0.f825n.size() - 1 >= i) {
            C0067i0 i0Var = (C0067i0) C0067i0.f825n.elementAt(i);
            f854a = i0Var.f833d + (i0Var.f830a / 2);
            f855b = i0Var.f834e + 30;
            if (i0Var.f842m || !i0Var.f841l) {
                f861h = false;
            } else {
                f861h = true;
            }
            f856c = 0;
            f862i = true;
            f863j = 0;
            if (!C0145a.f2659x) {
                f861h = false;
            }
        }
    }

    /* renamed from: g */
    public static void m260g(C0159f fVar) {
        if (C0006b.f96D == null && !C0114e.m647e0().f1543d && !C0114e.m647e0().f1538c) {
            m261h(fVar);
            if (C0145a.f2627d0.f2250l == 0 && f861h && C0006b.f99G == null && !C0114e.f1392w4 && C0145a.f2625c0 == C0126k.m893c0()) {
                C0140y yVar = C0145a.f2629e0;
                if (!yVar.f2467a || yVar.f2509o == 0) {
                    if (f862i) {
                        fVar.mo773E(-C0126k.f2028t1, -C0126k.f2032u1);
                    }
                    if (f863j == 0) {
                        fVar.mo776e(C0140y.f2363a2, f854a - 15, f855b, 0);
                    }
                    if (f863j == 1) {
                        fVar.mo779h(C0140y.f2363a2, 0, 0, 14, 16, 2, f854a + 15, f855b, C0117f0.f1676b);
                    }
                    if (f864k) {
                        fVar.mo776e(C0078o.f962w, f854a, f855b, 3);
                    }
                    fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad A[ADDED_TO_REGION, Catch:{ Exception -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00db A[ADDED_TO_REGION, Catch:{ Exception -> 0x0113 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m261h(p019j.C0159f r15) {
        /*
            boolean r0 = f865l     // Catch:{ Exception -> 0x0113 }
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = f854a     // Catch:{ Exception -> 0x0113 }
            int r1 = p013g.C0126k.f2028t1     // Catch:{ Exception -> 0x0113 }
            if (r0 <= r1) goto L_0x0020
            int r0 = f854a     // Catch:{ Exception -> 0x0113 }
            int r2 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0020
            int r0 = f855b     // Catch:{ Exception -> 0x0113 }
            int r1 = p013g.C0126k.f2032u1     // Catch:{ Exception -> 0x0113 }
            if (r0 <= r1) goto L_0x0020
            int r0 = f855b     // Catch:{ Exception -> 0x0113 }
            int r2 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            int r0 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x0113 }
            r1 = 10
            int r0 = r0 % r1
            r2 = 5
            if (r0 >= r2) goto L_0x0029
            return
        L_0x0029:
            b.b r0 = p001b.C0006b.f95C     // Catch:{ Exception -> 0x0113 }
            if (r0 == 0) goto L_0x002e
            return
        L_0x002e:
            b.b r0 = p001b.C0006b.f96D     // Catch:{ Exception -> 0x0113 }
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            g.y r0 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0113 }
            boolean r0 = r0.f2467a     // Catch:{ Exception -> 0x0113 }
            if (r0 == 0) goto L_0x003a
            return
        L_0x003a:
            boolean r0 = f862i     // Catch:{ Exception -> 0x0113 }
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            int r0 = f854a     // Catch:{ Exception -> 0x0113 }
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0113 }
            int r3 = r3.f1593n     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 - r3
            int r3 = f855b     // Catch:{ Exception -> 0x0113 }
            g.e r4 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0113 }
            int r4 = r4.f1598o     // Catch:{ Exception -> 0x0113 }
            int r3 = r3 - r4
            r4 = 6
            r5 = 0
            if (r0 <= 0) goto L_0x0080
            if (r3 < 0) goto L_0x0080
            int r6 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0113 }
            int r7 = p013g.C0111c0.m574a(r3)     // Catch:{ Exception -> 0x0113 }
            if (r6 < r7) goto L_0x0076
            int r6 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r6 = r6 - r1
            int r7 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r7 = r7 / 2
            int r7 = r7 + 30
            boolean r8 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0113 }
            if (r8 == 0) goto L_0x0073
            int r7 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r7 = r7 / 2
        L_0x0072:
            int r7 = r7 + r1
        L_0x0073:
            r5 = r6
            r6 = 0
            goto L_0x00aa
        L_0x0076:
            int r5 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r5 = r5 / 2
            int r6 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r6 = r6 - r1
            r7 = r6
            r6 = 5
            goto L_0x00aa
        L_0x0080:
            if (r0 < 0) goto L_0x00a8
            if (r3 >= 0) goto L_0x00a8
            int r6 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0113 }
            int r7 = p013g.C0111c0.m574a(r3)     // Catch:{ Exception -> 0x0113 }
            if (r6 < r7) goto L_0x00a0
            int r6 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r6 = r6 - r1
            int r7 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r7 = r7 / 2
            int r7 = r7 + 30
            boolean r8 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0113 }
            if (r8 == 0) goto L_0x0073
            int r7 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r7 = r7 / 2
            goto L_0x0072
        L_0x00a0:
            int r5 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r5 = r5 / 2
            r6 = 6
            r7 = 10
            goto L_0x00aa
        L_0x00a8:
            r6 = 0
            r7 = 0
        L_0x00aa:
            r8 = 3
            if (r0 >= 0) goto L_0x00d9
            if (r3 < 0) goto L_0x00d9
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0113 }
            int r3 = p013g.C0111c0.m574a(r3)     // Catch:{ Exception -> 0x0113 }
            if (r0 < r3) goto L_0x00cd
            int r0 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
            int r0 = r0 + 30
            boolean r2 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0113 }
            if (r2 == 0) goto L_0x00c8
            int r0 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
        L_0x00c7:
            int r0 = r0 + r1
        L_0x00c8:
            r13 = r0
            r11 = 3
            r12 = 10
            goto L_0x0102
        L_0x00cd:
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
            int r3 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r1 = r3 + -10
            r12 = r0
            r13 = r1
            r11 = 5
            goto L_0x0102
        L_0x00d9:
            if (r0 > 0) goto L_0x00ff
            if (r3 >= 0) goto L_0x00ff
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x0113 }
            int r2 = p013g.C0111c0.m574a(r3)     // Catch:{ Exception -> 0x0113 }
            if (r0 < r2) goto L_0x00f6
            int r0 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
            int r0 = r0 + 30
            boolean r2 = p018i.C0145a.f2659x     // Catch:{ Exception -> 0x0113 }
            if (r2 == 0) goto L_0x00c8
            int r0 = p013g.C0126k.f1980j1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
            goto L_0x00c7
        L_0x00f6:
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 / 2
            r12 = r0
            r11 = 6
            r13 = 10
            goto L_0x0102
        L_0x00ff:
            r12 = r5
            r11 = r6
            r13 = r7
        L_0x0102:
            p013g.C0126k.m901l1(r15)     // Catch:{ Exception -> 0x0113 }
            h.a.a.b r6 = p013g.C0126k.f2039v4     // Catch:{ Exception -> 0x0113 }
            r7 = 0
            r8 = 0
            r9 = 13
            r10 = 16
            int r14 = p013g.C0117f0.f1680f     // Catch:{ Exception -> 0x0113 }
            r5 = r15
            r5.mo779h(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0113 }
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0070k.m261h(j.f):void");
    }

    /* renamed from: i */
    public static void m262i() {
        m256c();
        int i = f863j == 0 ? 2 : -2;
        if (!f858e) {
            f864k = false;
            int i2 = f857d + 1;
            f857d = i2;
            if (i2 == 50) {
                f857d = 0;
                f858e = true;
                return;
            }
            return;
        }
        int i3 = f857d + 1;
        f857d = i3;
        int i4 = f856c;
        if (i4 == 0) {
            if (i3 == 2) {
                f854a += i * 2;
                f855b -= 4;
                f864k = true;
            }
            if (i3 == 4) {
                f854a -= i * 2;
                f855b += 4;
                f858e = false;
                f864k = false;
                f857d = 0;
            }
            if (f857d > 4) {
                f858e = false;
            }
        }
        if (i4 == 1) {
            if (f857d == 2) {
                if (C0145a.f2659x) {
                    C0126k.m909x1(C0057d1.f740u2, f854a, f855b + 10, 0, 20, 7);
                }
                f864k = true;
                f854a += i * 2;
                f855b -= 4;
            }
            int i5 = f857d;
            if (i5 == 4) {
                f864k = false;
                f854a -= i;
                f855b += 2;
            }
            if (i5 == 6) {
                f864k = true;
                f854a += i;
                f855b -= 2;
            }
            if (i5 == 8) {
                f864k = false;
                f854a -= i;
                f855b += 2;
            }
            if (i5 == 10) {
                f854a -= i;
                f855b += 2;
                f858e = false;
                f857d = 0;
            }
        }
    }
}
