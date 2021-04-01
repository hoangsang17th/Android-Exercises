package p011e;

import p001b.C0006b;
import p013g.C0114e;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0177m;

/* renamed from: e.i0 */
public class C0067i0 {

    /* renamed from: n */
    public static C0173i f825n = new C0173i("vPopups");

    /* renamed from: o */
    public static C0143b f826o;

    /* renamed from: p */
    public static C0143b f827p;

    /* renamed from: q */
    public static C0143b f828q;

    /* renamed from: r */
    public static C0143b f829r;

    /* renamed from: a */
    public int f830a = 100;

    /* renamed from: b */
    public int f831b;

    /* renamed from: c */
    public String[] f832c;

    /* renamed from: d */
    public int f833d;

    /* renamed from: e */
    public int f834e;

    /* renamed from: f */
    public int f835f;

    /* renamed from: g */
    public int f836g;

    /* renamed from: h */
    public boolean f837h = false;

    /* renamed from: i */
    public int f838i = 0;

    /* renamed from: j */
    private int f839j;

    /* renamed from: k */
    public C0055d f840k;

    /* renamed from: l */
    public boolean f841l = true;

    /* renamed from: m */
    public boolean f842m = false;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0067i0(java.lang.String r6, int r7, int r8) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f837h = r0
            r5.f838i = r0
            r1 = 1
            r5.f841l = r1
            r5.f842m = r0
            r0 = 100
            r5.f830a = r0
            int r0 = r6.length()
            r2 = 10
            if (r0 >= r2) goto L_0x001d
            r0 = 60
            r5.f830a = r0
        L_0x001d:
            int r0 = p018i.C0145a.f2614V
            r3 = 128(0x80, float:1.794E-43)
            if (r0 != r3) goto L_0x0025
            r5.f830a = r3
        L_0x0025:
            k.m r0 = p020k.C0177m.f2951s
            int r3 = r5.f830a
            int r3 = r3 - r2
            java.lang.String[] r6 = r0.mo916h(r6, r3)
            r5.f832c = r6
            r0 = 7
            r5.f831b = r0
            int r3 = r5.f830a
            int r4 = r3 / 2
            int r4 = r7 - r4
            int r4 = r4 - r1
            r5.f833d = r4
            int r8 = r8 + -15
            int r8 = r8 + r0
            int r0 = r6.length
            int r0 = r0 * 12
            int r8 = r8 - r0
            int r8 = r8 - r2
            r5.f834e = r8
            int r3 = r3 + 2
            r5.f835f = r3
            int r6 = r6.length
            int r6 = r6 + r1
            int r6 = r6 * 12
            int r6 = r6 + r1
            r5.f836g = r6
        L_0x0051:
            int r6 = r5.f835f
            int r8 = r6 % 10
            if (r8 == 0) goto L_0x005c
            int r6 = r6 + 1
            r5.f835f = r6
            goto L_0x0051
        L_0x005c:
            int r6 = r5.f836g
            int r8 = r6 % 10
            if (r8 == 0) goto L_0x0067
            int r6 = r6 + 1
            r5.f836g = r6
            goto L_0x005c
        L_0x0067:
            r6 = 30
            r8 = 24
            if (r7 < 0) goto L_0x0079
            if (r7 > r8) goto L_0x0079
            int r0 = r5.f833d
            int r1 = r5.f835f
            int r1 = r1 / 2
            int r1 = r1 + r6
            int r0 = r0 + r1
            r5.f833d = r0
        L_0x0079:
            int r0 = p013g.C0121h0.f1782a
            int r1 = r0 * 24
            if (r7 > r1) goto L_0x008e
            int r0 = r0 * 24
            int r0 = r0 - r8
            if (r7 < r0) goto L_0x008e
            int r7 = r5.f833d
            int r0 = r5.f835f
            int r0 = r0 / 2
            int r0 = r0 + 6
            int r7 = r7 - r0
            goto L_0x0094
        L_0x008e:
            int r7 = r5.f833d
            if (r7 > r6) goto L_0x0097
            int r7 = r7 + 2
        L_0x0094:
            r5.f833d = r7
            goto L_0x008e
        L_0x0097:
            int r7 = r5.f833d
            int r0 = r5.f835f
            int r0 = r0 + r7
            int r1 = p013g.C0121h0.f1782a
            int r1 = r1 * 24
            int r1 = r1 - r6
            if (r0 < r1) goto L_0x00a8
            int r7 = r7 + -2
            r5.f833d = r7
            goto L_0x0097
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0067i0.<init>(java.lang.String, int, int):void");
    }

    /* renamed from: a */
    public static void m240a(C0067i0 i0Var) {
        f825n.addElement(i0Var);
    }

    /* renamed from: c */
    public static void m241c() {
        if (f826o == null) {
            f826o = C0161h.m1494l("/mainImage/myTexture2dbd3.png");
        }
        if (f828q == null) {
            f828q = C0161h.m1494l("/mainImage/myTexture2dimgPopup.png");
        }
        if (f829r == null) {
            f829r = C0161h.m1494l("/mainImage/myTexture2dimgPopup2.png");
        }
        if (f827p == null && C0161h.f2758f == 1) {
            f827p = C0161h.m1494l("/mainImage/portal.png");
        }
    }

    /* renamed from: e */
    public static void m242e(C0159f fVar) {
        for (int i = 0; i < f825n.size(); i++) {
            ((C0067i0) f825n.elementAt(i)).mo151d(fVar);
        }
    }

    /* renamed from: g */
    public static void m243g(C0159f fVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        C0159f fVar2 = fVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        if (!z) {
            fVar2.mo772D(0);
            int i13 = i8 + 6;
            fVar2.mo783l(i13, i9, (i10 - 14) + 1, i11);
            int i14 = i9 + 6;
            int i15 = i11 - 12;
            fVar2.mo783l(i8, i14, i10, i15 + 1);
            fVar2.mo772D(i12);
            fVar2.mo783l(i13, i9 + 1, i10 - 12, i11 - 2);
            fVar2.mo783l(i8 + 1, i14, i10 - 2, i15);
            int i16 = i2;
            fVar.mo779h(f826o, 0, 0, 7, 6, 0, i, i16, 0);
            int i17 = (i8 + i10) - 7;
            C0159f fVar3 = fVar;
            fVar3.mo779h(f826o, 0, 0, 7, 6, 2, i17, i16, 0);
            int i18 = i9 + i11;
            fVar3.mo779h(f826o, 0, 0, 7, 6, 6, i, i18 - 7, 0);
            fVar3.mo779h(f826o, 0, 0, 7, 6, 3, i17, i18 - 6, 0);
            return;
        }
        C0143b bVar = i12 == 1 ? f829r : f828q;
        C0143b bVar2 = bVar;
        int i19 = i2;
        fVar.mo779h(bVar2, 0, 0, 10, 10, 0, i, i19, 0);
        int i20 = (i8 + i10) - 10;
        fVar.mo779h(bVar2, 0, 20, 10, 10, 0, i20, i19, 0);
        int i21 = (i9 + i11) - 10;
        C0159f fVar4 = fVar;
        int i22 = i21;
        fVar4.mo779h(bVar2, 0, 50, 10, 10, 0, i, i22, 0);
        fVar4.mo779h(bVar2, 0, 70, 10, 10, 0, i20, i22, 0);
        int i23 = i10 - 20;
        if (i23 % 10 == 0) {
            i7 = i23 / 10;
            i6 = 1;
        } else {
            i6 = 1;
            i7 = (i23 / 10) + 1;
        }
        int i24 = i11 - 20;
        int i25 = i24 % 10 == 0 ? i24 / 10 : (i24 / 10) + i6;
        int i26 = 0;
        while (i26 < i7) {
            fVar.mo779h(bVar, 0, 10, 10, 10, 0, i8 + 10 + (i26 * 10), i2, 0);
            i26++;
            i23 = i23;
            i25 = i25;
            i7 = i7;
        }
        int i27 = i7;
        int i28 = i23;
        int i29 = i25;
        int i30 = 0;
        while (i30 < i29) {
            fVar.mo779h(bVar, 0, 30, 10, 10, 0, i, i9 + 10 + (i30 * 10), 0);
            i30++;
            i29 = i29;
        }
        int i31 = i29;
        int i32 = 0;
        for (int i33 = i27; i32 < i33; i33 = i33) {
            fVar.mo779h(bVar, 0, 60, 10, 10, 0, i8 + 10 + (i32 * 10), i21, 0);
            i32++;
        }
        for (int i34 = 0; i34 < i31; i34++) {
            fVar.mo779h(bVar, 0, 40, 10, 10, 0, i20, i9 + 10 + (i34 * 10), 0);
        }
        fVar2.mo772D(i12 == 1 ? 12052656 : 16770503);
        fVar2.mo783l(i8 + 10, i9 + 10, i28, i24);
    }

    /* renamed from: h */
    private void m244h() {
        C0055d dVar;
        if (C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1097c == 0) {
            int i = this.f833d;
            if (this.f835f + i >= C0126k.f2028t1 && i <= C0145a.f2614V + C0126k.f2028t1) {
                int i2 = this.f834e;
                if (this.f836g + i2 >= C0126k.f2032u1 && i2 <= C0145a.f2616W + C0126k.f2032u1) {
                    this.f842m = false;
                }
            }
            this.f842m = true;
        }
        if (C0114e.m647e0().f1644x0 == null || !(C0114e.m647e0().f1644x0 == null || C0114e.m647e0().f1644x0.f1097c == 0)) {
            if (this.f833d + (this.f835f / 2) >= C0114e.m647e0().f1593n - 100 && this.f833d + (this.f835f / 2) <= C0114e.m647e0().f1593n + 100) {
                int i3 = this.f834e;
                if (this.f836g + i3 >= C0126k.f2032u1 && i3 <= C0145a.f2616W + C0126k.f2032u1) {
                    this.f842m = false;
                }
            }
            this.f842m = true;
        }
        int i4 = this.f839j;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.f839j = i5;
            if (i5 == 0 && (dVar = this.f840k) != null) {
                dVar.mo139d();
            }
        }
        if (!this.f837h) {
            return;
        }
        if (C0114e.m647e0().f1644x0 != null) {
            if (C0114e.m647e0().f1644x0.f1097c == 0) {
                if (C0114e.m647e0().f1644x0.f1095a == 0) {
                    this.f841l = false;
                }
                if (C0114e.m647e0().f1644x0.f1095a == 1) {
                    this.f841l = true;
                }
                if (C0114e.m647e0().f1644x0.f1095a > 1 && C0114e.m647e0().f1644x0.f1095a < 6) {
                    this.f841l = false;
                }
            } else if (!this.f841l) {
                int i6 = this.f838i + 1;
                this.f838i = i6;
                if (i6 == 50) {
                    this.f841l = true;
                }
            }
        } else if (!this.f841l) {
            C0070k.f861h = false;
            int i7 = this.f838i + 1;
            this.f838i = i7;
            if (i7 == 50) {
                this.f841l = true;
                C0070k.f861h = true;
            }
        }
    }

    /* renamed from: i */
    public static void m245i() {
        for (int i = 0; i < f825n.size(); i++) {
            ((C0067i0) f825n.elementAt(i)).m244h();
        }
    }

    /* renamed from: b */
    public void mo150b(int i) {
        this.f839j = i;
    }

    /* renamed from: d */
    public void mo151d(C0159f fVar) {
        if (this.f841l && this.f832c != null && C0006b.f95C == null && !this.f842m) {
            int i = 0;
            if (C0161h.f2758f == 1) {
                int i2 = this.f833d;
                int i3 = this.f834e - C0145a.f2595L0;
                fVar.mo771C(i2, i3, this.f835f, this.f836g);
                fVar.mo770B();
                fVar.mo774a(i2, i3, this.f835f, this.f836g);
                fVar.mo776e(f827p, i2, i3, 0);
                if (this.f835f > 70) {
                    fVar.mo776e(f827p, i2 + 70, i3, 0);
                }
                if (this.f836g > 30) {
                    int i4 = i3 + 30;
                    fVar.mo776e(f827p, i2, i4, 0);
                    if (this.f835f > 70) {
                        fVar.mo776e(f827p, i2 + 70, i4, 0);
                    }
                }
                C0159f.m1454z(fVar);
                fVar.mo769A();
                fVar.mo771C(C0126k.f2028t1, C0126k.f2032u1, C0145a.f2614V, C0145a.f2616W);
            } else {
                mo152f(fVar, this.f833d, this.f834e - C0145a.f2595L0, this.f835f, this.f836g, this.f839j == 0 ? 0 : 1, true);
            }
            while (true) {
                String[] strArr = this.f832c;
                if (i < strArr.length) {
                    (this.f839j == 0 ? C0177m.f2948p : C0177m.f2952t).mo909a(fVar, strArr[i], this.f833d + (this.f835f / 2), ((this.f834e + ((this.f836g / 2) - ((strArr.length * 12) / 2))) + (i * 12)) - C0145a.f2595L0, 2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo152f(C0159f fVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (i5 == 1) {
            fVar.mo784m(i, i2, i3, i4, 16777215, 90);
        } else {
            fVar.mo784m(i, i2, i3, i4, 0, 90);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153j(java.lang.String[] r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            r4.f830a = r0
        L_0x0003:
            int r1 = r5.length
            if (r0 >= r1) goto L_0x001f
            int r1 = r4.f830a
            k.m r2 = p020k.C0177m.f2951s
            r3 = r5[r0]
            int r2 = r2.mo914f(r3)
            if (r1 >= r2) goto L_0x001c
            k.m r1 = p020k.C0177m.f2951s
            r2 = r5[r0]
            int r1 = r1.mo914f(r2)
            r4.f830a = r1
        L_0x001c:
            int r0 = r0 + 1
            goto L_0x0003
        L_0x001f:
            int r0 = r4.f830a
            int r0 = r0 + 20
            r4.f830a = r0
            r4.f832c = r5
            r1 = 7
            r4.f831b = r1
            int r2 = r0 / 2
            int r2 = r6 - r2
            int r2 = r2 + -1
            r4.f833d = r2
            int r7 = r7 + -15
            int r7 = r7 + r1
            int r1 = r5.length
            int r1 = r1 * 12
            int r7 = r7 - r1
            int r7 = r7 + -10
            r4.f834e = r7
            int r0 = r0 + 2
            r4.f835f = r0
            int r5 = r5.length
            int r5 = r5 + 1
            int r5 = r5 * 12
            int r5 = r5 + 1
            r4.f836g = r5
        L_0x004a:
            int r5 = r4.f835f
            int r7 = r5 % 10
            if (r7 == 0) goto L_0x0055
            int r5 = r5 + 1
            r4.f835f = r5
            goto L_0x004a
        L_0x0055:
            int r5 = r4.f836g
            int r7 = r5 % 10
            if (r7 == 0) goto L_0x0060
            int r5 = r5 + 1
            r4.f836g = r5
            goto L_0x0055
        L_0x0060:
            r5 = 30
            r7 = 24
            if (r6 < 0) goto L_0x0072
            if (r6 > r7) goto L_0x0072
            int r0 = r4.f833d
            int r1 = r4.f835f
            int r1 = r1 / 2
            int r1 = r1 + r5
            int r0 = r0 + r1
            r4.f833d = r0
        L_0x0072:
            int r0 = p013g.C0121h0.f1782a
            int r1 = r0 * 24
            if (r6 > r1) goto L_0x0087
            int r0 = r0 * 24
            int r0 = r0 - r7
            if (r6 < r0) goto L_0x0087
            int r6 = r4.f833d
            int r0 = r4.f835f
            int r0 = r0 / 2
            int r0 = r0 + 6
            int r6 = r6 - r0
            goto L_0x008d
        L_0x0087:
            int r6 = r4.f833d
            if (r6 > r5) goto L_0x0090
            int r6 = r6 + 2
        L_0x008d:
            r4.f833d = r6
            goto L_0x0087
        L_0x0090:
            int r6 = r4.f833d
            int r0 = r4.f835f
            int r0 = r0 + r6
            int r1 = p013g.C0121h0.f1782a
            int r1 = r1 * 24
            int r1 = r1 - r5
            if (r0 < r1) goto L_0x00a1
            int r6 = r6 + -2
            r4.f833d = r6
            goto L_0x0090
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0067i0.mo153j(java.lang.String[], int, int):void");
    }
}
