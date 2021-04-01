package p018i;

import p011e.C0071k0;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0126k;
import p019j.C0159f;

/* renamed from: i.c */
public class C0147c {

    /* renamed from: a */
    int f2679a;

    /* renamed from: b */
    int f2680b;

    /* renamed from: c */
    int f2681c;

    /* renamed from: d */
    int f2682d;

    /* renamed from: e */
    int f2683e;

    /* renamed from: f */
    int f2684f;

    /* renamed from: g */
    int f2685g = 28;

    /* renamed from: h */
    int f2686h;

    /* renamed from: i */
    int f2687i;

    /* renamed from: j */
    int f2688j;

    /* renamed from: k */
    int f2689k;

    /* renamed from: l */
    int f2690l;

    /* renamed from: m */
    int f2691m;

    /* renamed from: n */
    int f2692n;

    /* renamed from: o */
    public int f2693o;

    /* renamed from: p */
    public int f2694p;

    /* renamed from: q */
    public int f2695q;

    /* renamed from: r */
    public int f2696r;

    /* renamed from: s */
    boolean f2697s = false;

    /* renamed from: t */
    public boolean f2698t;

    /* renamed from: u */
    public boolean f2699u;

    /* renamed from: v */
    public boolean f2700v;

    public C0147c() {
        int i;
        int i2 = C0145a.f2614V;
        if (i2 < 300) {
            this.f2698t = true;
            this.f2699u = false;
            this.f2700v = false;
        }
        if (i2 >= 300 && i2 <= 380) {
            this.f2698t = false;
            this.f2699u = true;
            this.f2700v = false;
        }
        if (i2 > 380) {
            this.f2698t = false;
            this.f2699u = false;
            this.f2700v = true;
        }
        boolean z = this.f2700v;
        this.f2693o = 0;
        int i3 = C0145a.f2621a0;
        if (!z) {
            this.f2695q = i3;
            this.f2694p = C0145a.f2623b0 >> 1;
            i = C0145a.f2616W - 80;
        } else {
            this.f2695q = ((i3 / 4) * 3) - 20;
            this.f2694p = C0145a.f2623b0 >> 1;
            i = C0145a.f2616W;
        }
        this.f2696r = i;
    }

    /* renamed from: a */
    private boolean m1389a(int i) {
        if (C0126k.f1906R3 == 0) {
            return false;
        }
        if (C0114e.m647e0().f1628u == 3) {
            return true;
        }
        for (int i2 = 2; i2 > 0; i2--) {
            C0071k0[] k0VarArr = C0145a.f2598N;
            int i3 = i2 - 1;
            int i4 = k0VarArr[i2].f866a - k0VarArr[i3].f866a;
            int i5 = k0VarArr[i2].f867b - k0VarArr[i3].f867b;
            if (C0111c0.m574a(i4) > i && C0111c0.m574a(i5) > i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m1390e() {
        C0145a.m1358m();
    }

    /* renamed from: b */
    public boolean mo739b() {
        if (C0126k.f1906R3 == 0) {
            return false;
        }
        return this.f2697s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r0 = p018i.C0145a.f2588I;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo740c() {
        /*
            r3 = this;
            int r0 = p013g.C0126k.f1906R3
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = p018i.C0145a.f2586H
            int r2 = r3.f2693o
            if (r0 < r2) goto L_0x001a
            int r2 = r3.f2695q
            if (r0 > r2) goto L_0x001a
            int r0 = p018i.C0145a.f2588I
            int r2 = r3.f2694p
            if (r0 < r2) goto L_0x001a
            int r2 = r3.f2696r
            if (r0 <= r2) goto L_0x0022
        L_0x001a:
            int r0 = p018i.C0145a.f2586H
            int r2 = p018i.C0145a.f2614V
            int r2 = r2 + -50
            if (r0 < r2) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0147c.mo740c():boolean");
    }

    /* renamed from: d */
    public void mo741d(C0159f fVar) {
        if (C0126k.f1906R3 != 0) {
            fVar.mo776e(C0126k.f1850D3, this.f2679a, this.f2680b, 3);
            fVar.mo776e(C0126k.f1854E3, this.f2681c, this.f2682d, 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo742f() {
        /*
            r13 = this;
            int r0 = p013g.C0126k.f1906R3
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = p018i.C0145a.f2578D
            if (r0 == 0) goto L_0x016c
            boolean r0 = p018i.C0145a.f2582F
            if (r0 != 0) goto L_0x016c
            int r0 = p018i.C0145a.f2590J
            r13.f2687i = r0
            int r1 = p018i.C0145a.f2592K
            r13.f2688j = r1
            int r2 = r13.f2693o
            if (r0 < r2) goto L_0x018c
            int r2 = r13.f2695q
            if (r0 > r2) goto L_0x018c
            int r2 = r13.f2694p
            if (r1 < r2) goto L_0x018c
            int r2 = r13.f2696r
            if (r1 > r2) goto L_0x018c
            boolean r2 = r13.f2697s
            if (r2 != 0) goto L_0x0031
            r13.f2681c = r0
            r13.f2679a = r0
            r13.f2682d = r1
            r13.f2680b = r1
        L_0x0031:
            r0 = 1
            r13.f2697s = r0
            int r1 = p018i.C0145a.f2586H
            int r2 = r13.f2679a
            int r1 = r1 - r2
            r13.f2689k = r1
            int r2 = p018i.C0145a.f2588I
            int r3 = r13.f2680b
            int r2 = r2 - r3
            r13.f2690l = r2
            r2 = 2
            int r1 = p013g.C0111c0.m586m(r1, r2)
            int r3 = r13.f2690l
            int r3 = p013g.C0111c0.m586m(r3, r2)
            int r1 = r1 + r3
            r13.f2691m = r1
            int r1 = p013g.C0111c0.m591r(r1)
            r13.f2686h = r1
            int r1 = r13.f2689k
            int r1 = p013g.C0111c0.m574a(r1)
            r3 = 4
            if (r1 > r3) goto L_0x0067
            int r1 = r13.f2690l
            int r1 = p013g.C0111c0.m574a(r1)
            if (r1 <= r3) goto L_0x018c
        L_0x0067:
            int r1 = r13.f2689k
            int r4 = r13.f2690l
            int r1 = p013g.C0111c0.m575b(r1, r4)
            r13.f2692n = r1
            int r1 = r13.f2679a
            int r4 = r13.f2685g
            int r1 = r1 - r4
            int r5 = r13.f2680b
            int r5 = r5 - r4
            int r6 = r4 * 2
            int r4 = r4 * 2
            boolean r1 = p018i.C0145a.m1336F(r1, r5, r6, r4)
            if (r1 != 0) goto L_0x00c2
            int r1 = r13.f2686h
            if (r1 == 0) goto L_0x00bb
            int r4 = r13.f2690l
            int r5 = r13.f2685g
            int r4 = r4 * r5
            int r4 = r4 / r1
            r13.f2682d = r4
            int r6 = r13.f2689k
            int r6 = r6 * r5
            int r6 = r6 / r1
            r13.f2681c = r6
            int r1 = r13.f2679a
            int r11 = r6 + r1
            r13.f2681c = r11
            int r6 = r13.f2680b
            int r12 = r4 + r6
            r13.f2682d = r12
            int r7 = r1 - r5
            int r8 = r6 - r5
            int r9 = r5 * 2
            int r10 = r5 * 2
            boolean r1 = p013g.C0111c0.m582i(r7, r8, r9, r10, r11, r12)
            if (r1 != 0) goto L_0x00b2
            goto L_0x00bb
        L_0x00b2:
            int r1 = r13.f2681c
            r13.f2683e = r1
            int r1 = r13.f2682d
            r13.f2684f = r1
            goto L_0x00ca
        L_0x00bb:
            int r1 = r13.f2683e
            r13.f2681c = r1
            int r1 = r13.f2684f
            goto L_0x00c8
        L_0x00c2:
            int r1 = p018i.C0145a.f2586H
            r13.f2681c = r1
            int r1 = p018i.C0145a.f2588I
        L_0x00c8:
            r13.f2682d = r1
        L_0x00ca:
            r13.m1390e()
            boolean r1 = r13.m1389a(r2)
            if (r1 == 0) goto L_0x0189
            int r1 = r13.f2692n
            r4 = 360(0x168, float:5.04E-43)
            r5 = 340(0x154, float:4.76E-43)
            r6 = 6
            if (r1 > r4) goto L_0x00de
            if (r1 >= r5) goto L_0x00e4
        L_0x00de:
            if (r1 < 0) goto L_0x00ee
            r4 = 20
            if (r1 > r4) goto L_0x00ee
        L_0x00e4:
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r6] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r6] = r0
            goto L_0x018c
        L_0x00ee:
            r4 = 40
            r7 = 70
            if (r1 <= r4) goto L_0x0100
            if (r1 >= r7) goto L_0x0100
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r6] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r6] = r0
            goto L_0x018c
        L_0x0100:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 < r7) goto L_0x0112
            if (r1 > r4) goto L_0x0112
            boolean[] r1 = p018i.C0145a.f2576C
            r2 = 8
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r2] = r0
            goto L_0x018c
        L_0x0112:
            r7 = 120(0x78, float:1.68E-43)
            if (r1 <= r4) goto L_0x0122
            if (r1 >= r7) goto L_0x0122
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r3] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r3] = r0
            goto L_0x018c
        L_0x0122:
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 < r7) goto L_0x0131
            if (r1 > r4) goto L_0x0131
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r3] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r3] = r0
            goto L_0x018c
        L_0x0131:
            r7 = 250(0xfa, float:3.5E-43)
            if (r1 <= r4) goto L_0x0148
            if (r1 >= r7) goto L_0x0148
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r3] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r3] = r0
            goto L_0x018c
        L_0x0148:
            r3 = 290(0x122, float:4.06E-43)
            if (r1 < r7) goto L_0x0157
            if (r1 > r3) goto L_0x0157
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r2] = r0
            goto L_0x018c
        L_0x0157:
            if (r1 <= r3) goto L_0x018c
            if (r1 >= r5) goto L_0x018c
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r2] = r0
            boolean[] r1 = p018i.C0145a.f2576C
            r1[r6] = r0
            boolean[] r1 = p018i.C0145a.f2574B
            r1[r6] = r0
            goto L_0x018c
        L_0x016c:
            r0 = 45
            r13.f2679a = r0
            r13.f2681c = r0
            boolean r1 = r13.f2700v
            if (r1 != 0) goto L_0x017f
            int r0 = p018i.C0145a.f2616W
            int r0 = r0 + -90
            r13.f2680b = r0
            r13.f2682d = r0
            goto L_0x0186
        L_0x017f:
            int r1 = p018i.C0145a.f2616W
            int r1 = r1 - r0
            r13.f2680b = r1
            r13.f2682d = r1
        L_0x0186:
            r0 = 0
            r13.f2697s = r0
        L_0x0189:
            r13.m1390e()
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0147c.mo742f():void");
    }
}
