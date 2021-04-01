package p020k;

import p001b.C0006b;
import p011e.C0055d;
import p013g.C0122i;
import p018i.C0145a;
import p019j.C0159f;

/* renamed from: k.n */
public class C0178n {

    /* renamed from: d */
    public static int f2966d = (C0177m.f2930G.mo913e() + 8);

    /* renamed from: e */
    public static int f2967e = 68;

    /* renamed from: f */
    public static int f2968f = 26;

    /* renamed from: g */
    public static int f2969g = -1;

    /* renamed from: h */
    public static boolean f2970h;

    /* renamed from: a */
    public C0055d f2971a;

    /* renamed from: b */
    public C0055d f2972b;

    /* renamed from: c */
    public C0055d f2973c;

    /* renamed from: c */
    public static boolean m1639c(C0055d dVar) {
        if (dVar == null) {
            return false;
        }
        if (dVar.f407h >= 0 && dVar.f408i != 0) {
            return dVar.mo137a();
        }
        C0122i iVar = C0145a.f2637i0;
        if (iVar != null) {
            if (iVar.f1809b != null) {
                int i = C0145a.f2616W;
                int i2 = f2968f;
                if (C0145a.m1336F((C0145a.f2614V - f2967e) >> 1, (i - i2) - 5, f2967e, i2 + 10)) {
                    f2969g = 1;
                    if (dVar == C0145a.f2637i0.f1809b && C0145a.f2580E && C0145a.f2582F) {
                        return true;
                    }
                }
            }
            if (C0145a.f2637i0.f1808a != null) {
                int i3 = C0145a.f2616W;
                int i4 = f2968f;
                if (C0145a.m1336F(0, (i3 - i4) - 5, f2967e, i4 + 10)) {
                    f2969g = 0;
                    if (dVar == C0145a.f2637i0.f1808a && C0145a.f2580E && C0145a.f2582F) {
                        return true;
                    }
                }
            }
            if (C0145a.f2637i0.f1810c != null) {
                int i5 = C0145a.f2614V - f2967e;
                int i6 = C0145a.f2616W;
                int i7 = f2968f;
                if (C0145a.m1336F(i5, (i6 - i7) - 5, f2967e, i7 + 10)) {
                    f2969g = 2;
                    if ((dVar == C0145a.f2637i0.f1810c || dVar == C0167c.m1522b().f2794f) && C0145a.f2580E && C0145a.f2582F) {
                        return true;
                    }
                }
            }
        } else {
            if (dVar == C0145a.f2625c0.f2971a) {
                int i8 = C0145a.f2616W;
                int i9 = f2968f;
                if (C0145a.m1336F(0, (i8 - i9) - 5, f2967e, i9 + 10)) {
                    f2969g = 0;
                    if (C0145a.f2580E && C0145a.f2582F) {
                        return true;
                    }
                }
            }
            if (dVar == C0145a.f2625c0.f2973c) {
                int i10 = C0145a.f2614V - f2967e;
                int i11 = C0145a.f2616W;
                int i12 = f2968f;
                if (C0145a.m1336F(i10, (i11 - i12) - 5, f2967e, i12 + 10)) {
                    f2969g = 2;
                    if (C0145a.f2580E && C0145a.f2582F) {
                        return true;
                    }
                }
            }
            if (dVar == C0145a.f2625c0.f2972b || C0006b.f95C != null) {
                int i13 = C0145a.f2616W;
                int i14 = f2968f;
                if (C0145a.m1336F((C0145a.f2614V - f2967e) >> 1, (i13 - i14) - 5, f2967e, i14 + 10)) {
                    f2969g = 1;
                    return C0145a.f2580E && C0145a.f2582F;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        fVar.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W + 1);
        if (!C0167c.m1522b().f2790b && C0145a.f2637i0 == null && !C0145a.f2627d0.f2239a) {
            C0145a.f2642l0.mo141a(fVar, this.f2971a, this.f2972b, this.f2973c);
        }
    }

    /* renamed from: f */
    public void mo342f() {
        f2970h = true;
        C0145a.m1359n();
        C0145a.m1358m();
        C0178n nVar = C0145a.f2625c0;
        if (nVar != null) {
            nVar.mo348g();
        }
        C0145a.f2625c0 = this;
        C0145a.f2572A.setFullScreenMode(true);
    }

    /* renamed from: g */
    public void mo348g() {
    }

    /* renamed from: h */
    public void mo343h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0 != null) goto L_0x0057;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo344i() {
        /*
            r4 = this;
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 5
            boolean r0 = r0[r1]
            r2 = -1
            r3 = 0
            if (r0 != 0) goto L_0x0013
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2972b
            boolean r0 = m1639c(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0013:
            boolean[] r0 = p018i.C0145a.f2574B
            r0[r1] = r3
            f2969g = r2
            p018i.C0145a.f2582F = r3
            e.d r0 = r4.f2972b
            if (r0 == 0) goto L_0x0022
            r0.mo139d()
        L_0x0022:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 12
            boolean r0 = r0[r1]
            if (r0 != 0) goto L_0x0034
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2971a
            boolean r0 = m1639c(r0)
            if (r0 == 0) goto L_0x005a
        L_0x0034:
            boolean[] r0 = p018i.C0145a.f2574B
            r0[r1] = r3
            f2969g = r2
            p018i.C0145a.f2582F = r3
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            if (r0 == 0) goto L_0x0053
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            if (r0 == 0) goto L_0x005a
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2793e
            goto L_0x0057
        L_0x0053:
            e.d r0 = r4.f2971a
            if (r0 == 0) goto L_0x005a
        L_0x0057:
            r0.mo139d()
        L_0x005a:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 13
            boolean r0 = r0[r1]
            if (r0 != 0) goto L_0x006c
            k.n r0 = p018i.C0145a.f2625c0
            e.d r0 = r0.f2973c
            boolean r0 = m1639c(r0)
            if (r0 == 0) goto L_0x0092
        L_0x006c:
            boolean[] r0 = p018i.C0145a.f2574B
            r0[r1] = r3
            f2969g = r2
            p018i.C0145a.f2582F = r3
            k.c r0 = p020k.C0167c.m1522b()
            boolean r0 = r0.f2790b
            if (r0 == 0) goto L_0x008b
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            if (r0 == 0) goto L_0x0092
            k.c r0 = p020k.C0167c.m1522b()
            e.d r0 = r0.f2794f
            goto L_0x008f
        L_0x008b:
            e.d r0 = r4.f2973c
            if (r0 == 0) goto L_0x0092
        L_0x008f:
            r0.mo139d()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020k.C0178n.mo344i():void");
    }
}
