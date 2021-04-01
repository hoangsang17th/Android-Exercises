package p013g;

import p000a.C0000a;
import p000a.C0001b;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0072l;
import p011e.C0073l0;
import p011e.C0076n;
import p012f.C0105d;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0178n;

/* renamed from: g.g0 */
public class C0119g0 implements C0072l {

    /* renamed from: v */
    public static C0073l0 f1725v;

    /* renamed from: a */
    int f1726a;

    /* renamed from: b */
    int f1727b;

    /* renamed from: c */
    int f1728c;

    /* renamed from: d */
    int f1729d;

    /* renamed from: e */
    C0055d f1730e = new C0055d(C0057d1.f697o1, (C0072l) this, 1, (Object) null);

    /* renamed from: f */
    C0055d f1731f = new C0055d(C0057d1.f606b1, (C0072l) this, 2, (Object) null);

    /* renamed from: g */
    C0055d f1732g;

    /* renamed from: h */
    int f1733h = 24;

    /* renamed from: i */
    public int f1734i = 0;

    /* renamed from: j */
    int f1735j = 50;

    /* renamed from: k */
    public int f1736k;

    /* renamed from: l */
    public int f1737l;

    /* renamed from: m */
    public int f1738m;

    /* renamed from: n */
    public int f1739n;

    /* renamed from: o */
    public boolean f1740o;

    /* renamed from: p */
    public boolean f1741p;

    /* renamed from: q */
    public String f1742q;

    /* renamed from: r */
    boolean f1743r;

    /* renamed from: s */
    public C0173i f1744s = new C0173i("vItems");

    /* renamed from: t */
    int f1745t;

    /* renamed from: u */
    int f1746u;

    /* renamed from: a */
    public void mo474a() {
        this.f1736k = this.f1726a + this.f1728c;
        C0174j.m1553a();
    }

    /* renamed from: b */
    public void mo475b() {
        boolean z = this.f1741p;
        this.f1728c = 170;
        if (z) {
            this.f1729d = 118;
            this.f1726a = (C0145a.f2614V / 2) - (170 / 2);
            this.f1727b = (C0145a.f2616W / 2) - (118 / 2);
        } else {
            this.f1729d = 170;
            this.f1726a = (C0145a.f2614V / 2) - (170 / 2);
            int i = C0145a.f2616W;
            int i2 = (i / 2) - (170 / 2);
            this.f1727b = i2;
            if (i < 240) {
                this.f1727b = i2 - 10;
            }
        }
        this.f1737l = this.f1726a;
        this.f1736k = 0;
        this.f1734i = (!this.f1743r ? C0001b.f11f : this.f1744s).size();
        if (C0145a.f2659x) {
            C0055d dVar = this.f1730e;
            int i3 = this.f1726a;
            dVar.f407h = i3;
            int i4 = this.f1727b;
            int i5 = this.f1729d;
            dVar.f408i = i4 + i5 + 5;
            C0055d dVar2 = this.f1731f;
            dVar2.f407h = (i3 + this.f1728c) - 68;
            dVar2.f408i = i4 + i5 + 5;
        }
        C0073l0 l0Var = new C0073l0();
        f1725v = l0Var;
        int i6 = this.f1734i;
        int i7 = this.f1733h;
        int i8 = this.f1726a;
        int i9 = this.f1727b;
        int i10 = this.f1735j;
        l0Var.mo159c(i6, i7, i8, i9 + i10, this.f1728c, this.f1729d - i10, true, 1);
    }

    /* renamed from: c */
    public void mo476c(C0159f fVar) {
        if (!this.f1743r) {
            mo477d(fVar);
        } else {
            mo478f(fVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013f A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo477d(p019j.C0159f r13) {
        /*
            r12 = this;
            int r0 = r12.f1737l
            int r0 = -r0
            r7 = 0
            r13.mo773E(r0, r7)
            int r1 = r12.f1726a
            int r0 = r12.f1727b
            int r2 = r0 + -17
            int r3 = r12.f1728c
            int r0 = r12.f1729d
            int r4 = r0 + 17
            r5 = -1
            r6 = 1
            r0 = r13
            p011e.C0067i0.m243g(r0, r1, r2, r3, r4, r5, r6)
            k.m r0 = p020k.C0177m.f2951s
            java.lang.String r2 = p011e.C0057d1.f678l3
            int r1 = r12.f1726a
            int r3 = r12.f1728c
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r1 = r12.f1727b
            int r4 = r1 + -7
            r5 = 2
            r1 = r13
            r0.mo909a(r1, r2, r3, r4, r5)
            int r0 = r12.f1746u
            if (r0 < 0) goto L_0x005e
            k.i r1 = p000a.C0001b.f11f
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r0 > r1) goto L_0x005e
            k.i r0 = p000a.C0001b.f11f
            int r1 = r12.f1746u
            java.lang.Object r0 = r0.elementAt(r1)
            a.b r0 = (p000a.C0001b) r0
            short[] r1 = r0.f15c
            if (r1 == 0) goto L_0x005e
            g.e r1 = p013g.C0114e.m647e0()
            short[] r2 = r0.f15c
            int r0 = p018i.C0145a.f2614V
            int r3 = r0 / 2
            int r0 = r12.f1727b
            int r4 = r0 + 45
            r5 = 1
            r6 = 0
            r0 = r1
            r1 = r13
            r0.mo427h0(r1, r2, r3, r4, r5, r6)
        L_0x005e:
            g.e r0 = p013g.C0114e.m647e0()
            int r1 = p018i.C0145a.f2614V
            int r2 = r1 / 2
            int r1 = r12.f1727b
            int r3 = r1 + 45
            r4 = 1
            g.e r1 = p013g.C0114e.m647e0()
            int r5 = r1.f1584l0
            r6 = 0
            r1 = r13
            r0.mo429i0(r1, r2, r3, r4, r5, r6)
            int r0 = r12.f1726a
            int r1 = r12.f1727b
            int r2 = r12.f1735j
            int r1 = r1 + r2
            int r3 = r12.f1728c
            int r4 = r12.f1729d
            int r4 = r4 - r2
            int r4 = r4 + -10
            r13.mo771C(r0, r1, r3, r4)
            r13.mo770B()
            int r0 = r12.f1726a
            int r1 = r12.f1727b
            int r2 = r12.f1735j
            int r1 = r1 + r2
            int r3 = r12.f1728c
            int r4 = r12.f1729d
            int r4 = r4 - r2
            int r4 = r4 + -10
            r13.mo774a(r0, r1, r3, r4)
            e.l0 r0 = f1725v
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.f874d
            int r0 = -r0
            r13.mo773E(r7, r0)
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            int r0 = r12.f1734i
            if (r6 >= r0) goto L_0x0143
            int r0 = r12.f1726a
            int r8 = r0 + 10
            int r0 = r12.f1727b
            int r1 = r12.f1733h
            int r2 = r6 * r1
            int r2 = r2 + r0
            int r3 = r12.f1735j
            int r9 = r2 + r3
            int r1 = r1 + r9
            e.l0 r2 = f1725v
            if (r2 == 0) goto L_0x00c1
            int r4 = r2.f874d
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            int r1 = r1 - r4
            int r4 = r0 + r3
            if (r1 < r4) goto L_0x013f
            if (r2 == 0) goto L_0x00cc
            int r1 = r2.f874d
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            int r1 = r9 - r1
            int r0 = r0 + r3
            int r2 = r12.f1729d
            int r0 = r0 + r2
            if (r1 > r0) goto L_0x013f
            k.i r0 = p000a.C0001b.f11f
            java.lang.Object r0 = r0.elementAt(r6)
            r10 = r0
            a.b r10 = (p000a.C0001b) r10
            k.m r0 = p020k.C0177m.f2925B
            int r1 = r12.f1746u
            if (r6 != r1) goto L_0x00e6
            k.m r0 = p020k.C0177m.f2927D
        L_0x00e6:
            r11 = r0
            java.lang.String r2 = r10.f14b
            if (r2 == 0) goto L_0x00f4
            int r3 = r8 + 20
            r5 = 0
            r0 = r11
            r1 = r13
            r4 = r9
            r0.mo909a(r1, r2, r3, r4, r5)
        L_0x00f4:
            int r0 = r10.f16d
            java.lang.String r1 = " "
            if (r0 <= 0) goto L_0x011d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r10.f16d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = p011e.C0057d1.f753w1
        L_0x0109:
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            int r0 = r12.f1728c
            int r0 = r0 + r8
            int r3 = r0 + -20
            r5 = 1
            r0 = r11
            r1 = r13
            r4 = r9
            r0.mo909a(r1, r2, r3, r4, r5)
            goto L_0x0131
        L_0x011d:
            int r0 = r10.f17e
            if (r0 <= 0) goto L_0x0131
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r10.f17e
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = p011e.C0057d1.f760x1
            goto L_0x0109
        L_0x0131:
            short[] r0 = r10.f15c
            if (r0 == 0) goto L_0x013f
            short r1 = r0[r7]
            r4 = 0
            r5 = 0
            r0 = r13
            r2 = r8
            r3 = r9
            p020k.C0174j.m1555c(r0, r1, r2, r3, r4, r5)
        L_0x013f:
            int r6 = r6 + 1
            goto L_0x00a6
        L_0x0143:
            int r0 = r13.mo792y()
            int r0 = -r0
            r13.mo773E(r7, r0)
            p019j.C0159f.m1454z(r13)
            r13.mo769A()
            int r0 = p018i.C0145a.f2614V
            int r1 = p018i.C0145a.f2616W
            r13.mo771C(r7, r7, r0, r1)
            e.e0 r0 = p018i.C0145a.f2642l0
            e.d r1 = r12.f1730e
            e.d r2 = r12.f1732g
            e.d r3 = r12.f1731f
            r0.mo141a(r13, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0119g0.mo477d(j.f):void");
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        C0105d dVar;
        String str;
        byte b;
        byte b2 = 2;
        if (i == 2) {
            mo474a();
        }
        if (i == 1 && !this.f1741p) {
            if (!this.f1743r) {
                if (this.f1746u >= 0) {
                    mo474a();
                    if (C0114e.m647e0().f1521Z == null) {
                        dVar = C0105d.m365M();
                        b = (byte) ((C0001b) C0001b.f11f.elementAt(this.f1746u)).f13a;
                        str = this.f1742q;
                    } else {
                        dVar = C0105d.m365M();
                        b2 = 4;
                        b = (byte) ((C0001b) C0001b.f11f.elementAt(this.f1746u)).f13a;
                        str = "";
                    }
                    dVar.mo239P(b2, b, str);
                }
            } else if (this.f1746u >= 0) {
                C0076n nVar = (C0076n) this.f1744s.elementAt(this.f1745t);
            }
        }
    }

    /* renamed from: f */
    public void mo478f(C0159f fVar) {
    }

    /* renamed from: g */
    public void mo479g(boolean z) {
        C0000a aVar = C0114e.m647e0().f1521Z;
        this.f1740o = true;
        this.f1741p = z;
        mo475b();
    }

    /* renamed from: h */
    public void mo480h() {
        C0073l0 l0Var = f1725v;
        if (l0Var != null) {
            l0Var.mo161g();
        }
        int i = this.f1737l;
        int i2 = this.f1736k;
        if (i != i2) {
            int i3 = (i2 - i) << 2;
            this.f1738m = i3;
            int i4 = this.f1739n + i3;
            this.f1739n = i4;
            this.f1737l = i + (i4 >> 3);
            this.f1739n = i4 & 15;
        }
        if (Math.abs(i2 - this.f1737l) < 10) {
            this.f1737l = this.f1736k;
        }
        int i5 = this.f1737l;
        int i6 = this.f1726a;
        int i7 = this.f1728c;
        if (i5 >= (i6 + i7) - 10 && this.f1736k >= (i6 + i7) - 10) {
            this.f1740o = false;
        }
    }

    /* renamed from: i */
    public void mo481i() {
        C0055d dVar = this.f1730e;
        if (dVar != null && (C0145a.f2574B[12] || C0178n.m1639c(dVar))) {
            this.f1730e.mo139d();
        }
        C0055d dVar2 = this.f1731f;
        if (dVar2 != null && (C0145a.f2574B[13] || C0178n.m1639c(dVar2))) {
            this.f1731f.mo139d();
        }
        C0055d dVar3 = this.f1732g;
        if (dVar3 != null && (C0145a.f2574B[5] || C0178n.m1639c(dVar3))) {
            this.f1732g.mo139d();
        }
        if (!this.f1741p) {
            if (f1725v != null) {
                if (C0145a.f2659x) {
                    f1725v.mo160d();
                    this.f1745t = f1725v.f891u;
                }
                boolean[] zArr = C0145a.f2574B;
                if (zArr[2]) {
                    zArr[2] = false;
                    int i = this.f1745t - 1;
                    this.f1745t = i;
                    if (i < 0) {
                        this.f1745t = this.f1734i - 1;
                    }
                    C0073l0 l0Var = f1725v;
                    l0Var.mo158b(this.f1745t * l0Var.f892v);
                }
                boolean[] zArr2 = C0145a.f2574B;
                if (zArr2[8]) {
                    zArr2[8] = false;
                    int i2 = this.f1745t + 1;
                    this.f1745t = i2;
                    if (i2 > this.f1734i - 1) {
                        this.f1745t = 0;
                    }
                    C0073l0 l0Var2 = f1725v;
                    l0Var2.mo158b(this.f1745t * l0Var2.f892v);
                }
                int i3 = this.f1745t;
                if (i3 != -1) {
                    this.f1746u = i3;
                }
            } else {
                return;
            }
        }
        C0145a.m1358m();
        C0145a.m1359n();
    }
}
