package p011e;

import p001b.C0019o;
import p001b.C0021q;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0126k;
import p013g.C0128m;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;

/* renamed from: e.h0 */
public class C0065h0 {

    /* renamed from: a */
    public C0114e f805a;

    /* renamed from: b */
    public C0058e f806b;

    /* renamed from: c */
    public C0173i f807c = new C0173i("vDARTS");

    /* renamed from: d */
    public int f808d;

    /* renamed from: e */
    public int f809e;

    /* renamed from: f */
    public int f810f;

    /* renamed from: g */
    public int f811g;

    /* renamed from: h */
    public int f812h;

    /* renamed from: i */
    public int f813i;

    /* renamed from: j */
    int f814j;

    /* renamed from: k */
    int f815k = 0;

    /* renamed from: l */
    int f816l = 0;

    /* renamed from: m */
    public boolean f817m = false;

    /* renamed from: n */
    public boolean f818n = true;

    /* renamed from: o */
    public C0083q0 f819o;

    public C0065h0(C0114e eVar, int i, C0083q0 q0Var, int i2, int i3) {
        this.f819o = q0Var;
        this.f805a = eVar;
        C0058e eVar2 = C0126k.f1880L1[i];
        this.f806b = eVar2;
        this.f811g = eVar2.f788j;
        this.f812h = i2;
        this.f813i = i3;
        C0128m mVar = eVar.f1452L0;
        mVar = mVar == null ? eVar.f1472P0 : mVar;
        mo147c(C0111c0.m575b(mVar.mo176c() - i2, mVar.mo179g() - i3));
    }

    /* renamed from: a */
    private void m235a() {
        int i;
        int i2;
        int i3;
        C0111c0.m584k("END ME!");
        if (!this.f805a.f1504V2 && (i2 = this.f812h) >= (i3 = C0126k.f2028t1) && i2 <= i3 + C0145a.f2614V) {
            C0175k.m1563p().mo884n();
        }
        this.f805a.mo378E0();
        C0114e eVar = this.f805a;
        if (eVar.f1569i0) {
            eVar.mo372B0();
        }
        C0114e eVar2 = this.f805a;
        if (eVar2.f1504V2) {
            eVar2.f1504V2 = false;
            if (eVar2.f1493T1 && eVar2.f1569i0 && (i = eVar2.f1628u) != 14 && i != 5) {
                eVar2.f1493T1 = false;
            }
            C0126k.m893c0().mo536o(this.f812h, this.f813i);
        }
        C0114e eVar3 = this.f805a;
        eVar3.f1469O2 = null;
        eVar3.f1474P2 = false;
        eVar3.f1479Q2 = null;
        eVar3.f1484R2 = null;
    }

    /* renamed from: b */
    public void mo146b(C0159f fVar) {
        if (this.f818n) {
            int d = C0019o.m92d(360 - this.f808d);
            byte b = C0019o.f220A[d];
            int i = C0019o.f223z[d];
            for (int size = this.f807c.size() / 2; size < this.f807c.size(); size++) {
                C0021q qVar = (C0021q) this.f807c.elementAt(size);
                C0174j.m1555c(fVar, this.f806b.f783e[qVar.f252a], qVar.f253b, qVar.f254c, 0, 3);
            }
            int i2 = C0145a.f2600O;
            short[][] sArr = this.f806b.f781c;
            int length = i2 % sArr.length;
            C0174j.m1555c(fVar, sArr[length][b], this.f812h, this.f813i, i, 3);
            for (int i3 = 0; i3 < this.f807c.size(); i3++) {
                C0021q qVar2 = (C0021q) this.f807c.elementAt(i3);
                C0174j.m1555c(fVar, this.f806b.f782d[qVar2.f252a], qVar2.f253b, qVar2.f254c, 0, 3);
            }
            C0174j.m1555c(fVar, this.f806b.f780b[length][b], this.f812h, this.f813i, i, 3);
            for (int i4 = 0; i4 < this.f807c.size(); i4++) {
                C0021q qVar3 = (C0021q) this.f807c.elementAt(i4);
                int a = C0111c0.m574a(C0019o.f221x.nextInt(100));
                C0058e eVar = this.f806b;
                if (a < eVar.f786h) {
                    C0174j.m1555c(fVar, C0145a.f2600O % 2 == 0 ? eVar.f784f[qVar3.f252a] : eVar.f785g[qVar3.f252a], qVar3.f253b, qVar3.f254c, 0, 3);
                }
            }
            fVar.mo772D(16711680);
        }
    }

    /* renamed from: c */
    public void mo147c(int i) {
        this.f808d = i;
        this.f809e = (this.f811g * C0111c0.m578e(i)) >> 10;
        this.f810f = (this.f811g * C0111c0.m589p(i)) >> 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (((r4 * r4) + (r6 * r6)) > 4096) goto L_0x00b0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo148d() {
        /*
            r8 = this;
            boolean r0 = r8.f818n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            g.e r0 = r8.f805a
            g.v r1 = r0.f1452L0
            if (r1 != 0) goto L_0x0014
            g.e r2 = r0.f1472P0
            if (r2 != 0) goto L_0x0014
            r8.m235a()
            goto L_0x014d
        L_0x0014:
            if (r1 != 0) goto L_0x0018
            g.e r1 = r0.f1472P0
        L_0x0018:
            r0 = 0
            r2 = 0
        L_0x001a:
            e.e r3 = r8.f806b
            short r4 = r3.f787i
            if (r2 >= r4) goto L_0x0128
            short[] r3 = r3.f782d
            int r3 = r3.length
            if (r3 <= 0) goto L_0x0033
            k.i r3 = r8.f807c
            b.q r4 = new b.q
            int r5 = r8.f812h
            int r6 = r8.f813i
            r4.<init>(r5, r6)
            r3.addElement(r4)
        L_0x0033:
            g.e r3 = r8.f805a
            int r3 = r3.mo176c()
            int r4 = r1.mo176c()
            r5 = 10
            if (r3 <= r4) goto L_0x0044
            r3 = 10
            goto L_0x0046
        L_0x0044:
            r3 = -10
        L_0x0046:
            int r4 = r1.mo176c()
            int r4 = r4 + r3
            int r3 = r8.f812h
            int r4 = r4 - r3
            r8.f815k = r4
            int r3 = r1.mo179g()
            int r4 = r1.mo178f()
            int r4 = r4 / 2
            int r3 = r3 - r4
            int r4 = r8.f813i
            int r3 = r3 - r4
            r8.f816l = r3
            int r3 = r8.f814j
            int r3 = r3 + 1
            r8.f814j = r3
            int r3 = r8.f815k
            int r3 = p013g.C0111c0.m574a(r3)
            r4 = 20
            if (r3 >= r4) goto L_0x008f
            int r3 = r8.f816l
            int r3 = p013g.C0111c0.m574a(r3)
            if (r3 >= r4) goto L_0x008f
            g.e r1 = r8.f805a
            g.e r1 = r1.f1472P0
            if (r1 == 0) goto L_0x008b
            boolean r2 = r1.f1569i0
            if (r2 == 0) goto L_0x008b
            int r2 = r1.f1486S
            boolean r3 = r1.f1501V
            boolean r4 = r1.f1496U
            r1.mo467z(r2, r0, r3, r4)
        L_0x008b:
            r8.m235a()
            return
        L_0x008f:
            int r3 = r8.f815k
            int r4 = r8.f816l
            int r3 = p013g.C0111c0.m575b(r3, r4)
            int r4 = r8.f808d
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            r6 = 90
            if (r4 < r6) goto L_0x00b0
            int r4 = r8.f815k
            int r4 = r4 * r4
            int r6 = r8.f816l
            int r6 = r6 * r6
            int r4 = r4 + r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r4 <= r6) goto L_0x00da
        L_0x00b0:
            int r4 = r8.f808d
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            r6 = 15
            if (r4 >= r6) goto L_0x00bf
        L_0x00bc:
            r8.f808d = r3
            goto L_0x00da
        L_0x00bf:
            int r4 = r8.f808d
            int r6 = r3 - r4
            if (r6 < 0) goto L_0x00cb
            int r6 = r3 - r4
            r7 = 180(0xb4, float:2.52E-43)
            if (r6 < r7) goto L_0x00d0
        L_0x00cb:
            int r3 = r3 - r4
            r6 = -180(0xffffffffffffff4c, float:NaN)
            if (r3 >= r6) goto L_0x00d7
        L_0x00d0:
            int r4 = r4 + 15
        L_0x00d2:
            int r3 = p013g.C0111c0.m579f(r4)
            goto L_0x00bc
        L_0x00d7:
            int r4 = r4 + -15
            goto L_0x00d2
        L_0x00da:
            boolean r3 = r8.f817m
            if (r3 != 0) goto L_0x00e8
            int r3 = r8.f811g
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r3 >= r4) goto L_0x00e8
            int r3 = r3 + 1024
            r8.f811g = r3
        L_0x00e8:
            int r3 = r8.f811g
            int r4 = r8.f808d
            int r4 = p013g.C0111c0.m578e(r4)
            int r3 = r3 * r4
            int r3 = r3 >> r5
            r8.f809e = r3
            int r3 = r8.f811g
            int r4 = r8.f808d
            int r4 = p013g.C0111c0.m589p(r4)
            int r3 = r3 * r4
            int r3 = r3 >> r5
            r8.f810f = r3
            int r4 = r8.f815k
            int r5 = r8.f809e
            int r4 = r4 + r5
            r8.f815k = r4
            int r5 = r4 >> 10
            int r6 = r8.f812h
            int r6 = r6 + r5
            r8.f812h = r6
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r8.f815k = r4
            int r4 = r8.f816l
            int r4 = r4 + r3
            r8.f816l = r4
            int r3 = r4 >> 10
            int r5 = r8.f813i
            int r5 = r5 + r3
            r8.f813i = r5
            r3 = r4 & 1023(0x3ff, float:1.434E-42)
            r8.f816l = r3
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0128:
            k.i r1 = r8.f807c
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x014d
            k.i r1 = r8.f807c
            java.lang.Object r1 = r1.elementAt(r0)
            b.q r1 = (p001b.C0021q) r1
            int r2 = r1.f252a
            int r2 = r2 + 1
            r1.f252a = r2
            e.e r1 = r8.f806b
            short[] r1 = r1.f782d
            int r1 = r1.length
            if (r2 < r1) goto L_0x014a
            k.i r1 = r8.f807c
            r1.removeElementAt(r0)
        L_0x014a:
            int r0 = r0 + 1
            goto L_0x0128
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011e.C0065h0.mo148d():void");
    }
}
