package p013g;

import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0072l;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0178n;

/* renamed from: g.j0 */
public class C0125j0 extends C0178n implements C0072l {

    /* renamed from: x */
    public static C0125j0 f1818x;

    /* renamed from: y */
    public static C0143b f1819y = C0161h.m1494l("/mainImage/myTexture2dfutherShip.png");

    /* renamed from: z */
    public static C0143b f1820z = C0161h.m1494l("/mainImage/taungam.png");

    /* renamed from: i */
    public byte f1821i;

    /* renamed from: j */
    public int f1822j = 5;

    /* renamed from: k */
    public int[] f1823k = new int[20];

    /* renamed from: l */
    public int[] f1824l = new int[20];

    /* renamed from: m */
    public int[] f1825m;

    /* renamed from: n */
    public int[] f1826n;

    /* renamed from: o */
    int f1827o;

    /* renamed from: p */
    int f1828p = 20;

    /* renamed from: q */
    public short f1829q;

    /* renamed from: r */
    public short f1830r;

    /* renamed from: s */
    public long f1831s;

    /* renamed from: t */
    public long f1832t;

    /* renamed from: u */
    boolean f1833u;

    /* renamed from: v */
    boolean f1834v;

    /* renamed from: w */
    int f1835w;

    public C0125j0() {
        int i;
        int i2 = 0;
        while (true) {
            i = this.f1828p;
            if (i2 >= i) {
                break;
            }
            this.f1823k[i2] = C0111c0.m587n(0, C0145a.f2614V);
            this.f1824l[i2] = (C0145a.f2616W / this.f1828p) * i2;
            i2++;
        }
        this.f1825m = new int[i];
        this.f1826n = new int[i];
        for (int i3 = 0; i3 < this.f1828p; i3++) {
            this.f1825m[i3] = C0111c0.m587n(0, C0145a.f2614V);
            this.f1826n[i3] = (C0145a.f2616W / this.f1828p) * i3;
        }
    }

    /* renamed from: j */
    public static C0125j0 m848j() {
        if (f1818x == null) {
            f1818x = new C0125j0();
        }
        return f1818x;
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        fVar.mo772D(this.f1821i == 0 ? 0 : 3056895);
        fVar.mo783l(0, 0, C0145a.f2614V, C0145a.f2616W);
        for (int i = 0; i < this.f1828p; i++) {
            fVar.mo772D(this.f1821i == 0 ? 14802654 : 11140863);
            fVar.mo783l(this.f1823k[i], this.f1824l[i], 10, 2);
        }
        if (this.f1821i == 0) {
            fVar.mo779h(f1819y, 0, 0, 72, 95, 7, this.f1827o + this.f1835w, C0145a.f2616W / 2, 3);
        }
        if (this.f1821i == 1) {
            fVar.mo779h(f1820z, 0, 0, 144, 79, 2, this.f1827o + this.f1835w, C0145a.f2616W / 2, 3);
        }
        for (int i2 = 0; i2 < this.f1828p; i2++) {
            fVar.mo772D(this.f1821i == 0 ? 14935011 : 7536127);
            fVar.mo783l(this.f1825m[i2], this.f1826n[i2], 18, 3);
        }
        super.mo341d(fVar);
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1) {
            C0145a.m1354c0(C0057d1.f502L5, new C0055d(C0057d1.f634f1, (C0072l) this, 2, (Object) null), new C0055d(C0057d1.f641g1, (C0072l) this, 3, (Object) null));
        }
        if (i == 2 && C0114e.m647e0().f1609q0 > 0) {
            this.f1833u = true;
            C0145a.m1366v();
            this.f2972b = null;
        }
        if (i == 3) {
            C0145a.m1366v();
        }
    }

    /* renamed from: f */
    public void mo342f() {
        this.f1833u = false;
        this.f1834v = false;
        if (C0114e.m647e0().f1609q0 <= 0 || this.f1821i != 0) {
            this.f2972b = null;
        } else {
            this.f2972b = new C0055d(C0057d1.f495K5, (C0072l) this, 1, (Object) null);
        }
        this.f1835w = 0;
        super.mo342f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo343h() {
        /*
            r10 = this;
            byte r0 = r10.f1821i
            r1 = 2
            if (r0 != 0) goto L_0x0014
            boolean r2 = r10.f1833u
            if (r2 != 0) goto L_0x0019
            int r2 = p018i.C0145a.f2614V
            int r2 = r2 / r1
            short r3 = r10.f1829q
            int r2 = r2 * r3
            short r3 = r10.f1830r
            int r2 = r2 / r3
            goto L_0x0017
        L_0x0014:
            int r2 = r10.f1835w
            int r2 = r2 + r1
        L_0x0017:
            r10.f1835w = r2
        L_0x0019:
            r2 = 0
            p012f.C0103b.f1145e = r2
            int r3 = p018i.C0145a.f2614V
            int r3 = r3 / r1
            int r4 = r10.f1827o
            int r3 = r3 + r4
            int r3 = r3 / r1
            int r3 = r3 + r4
            int r3 = r3 / r1
            int r3 = r3 + r4
            int r3 = r3 / r1
            r10.f1827o = r3
            r3 = 1
            if (r0 != r3) goto L_0x002e
            r10.f1827o = r2
        L_0x002e:
            r0 = 0
        L_0x002f:
            int r4 = r10.f1828p
            r5 = -20
            if (r0 >= r4) goto L_0x004a
            int[] r4 = r10.f1823k
            r6 = r4[r0]
            int r7 = r10.f1822j
            int r7 = r7 / r1
            int r6 = r6 - r7
            r4[r0] = r6
            r6 = r4[r0]
            if (r6 >= r5) goto L_0x0047
            int r5 = p018i.C0145a.f2614V
            r4[r0] = r5
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x004a:
            int r0 = r10.f1828p
            if (r2 >= r0) goto L_0x0062
            int[] r0 = r10.f1825m
            r4 = r0[r2]
            int r6 = r10.f1822j
            int r4 = r4 - r6
            r0[r2] = r4
            r4 = r0[r2]
            if (r4 >= r5) goto L_0x005f
            int r4 = p018i.C0145a.f2614V
            r0[r2] = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0062:
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % 3
            if (r0 != 0) goto L_0x0074
            int r0 = r10.f1822j
            boolean r2 = r10.f1833u
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x0070:
            r2 = 1
        L_0x0071:
            int r0 = r0 + r2
            r10.f1822j = r0
        L_0x0074:
            int r0 = r10.f1822j
            boolean r2 = r10.f1833u
            r4 = 80
            r5 = 25
            if (r2 == 0) goto L_0x0081
            r6 = 80
            goto L_0x0083
        L_0x0081:
            r6 = 25
        L_0x0083:
            if (r0 <= r6) goto L_0x008c
            if (r2 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r4 = 25
        L_0x008a:
            r10.f1822j = r4
        L_0x008c:
            long r4 = java.lang.System.currentTimeMillis()
            r10.f1832t = r4
            long r6 = r10.f1831s
            long r6 = r4 - r6
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00a4
            short r0 = r10.f1829q
            int r0 = r0 + r3
            short r0 = (short) r0
            r10.f1829q = r0
            r10.f1831s = r4
        L_0x00a4:
            boolean r0 = r10.f1833u
            if (r0 == 0) goto L_0x00ae
            int r0 = r10.f1835w
            int r0 = r0 + 3
            r10.f1835w = r0
        L_0x00ae:
            int r0 = r10.f1835w
            int r2 = p018i.C0145a.f2614V
            int r2 = r2 / r1
            int r2 = r2 + 30
            if (r0 < r2) goto L_0x00c4
            boolean r0 = r10.f1834v
            if (r0 != 0) goto L_0x00c4
            r10.f1834v = r3
            f.d r0 = p012f.C0105d.m365M()
            r0.mo258Y0()
        L_0x00c4:
            super.mo343h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0125j0.mo343h():void");
    }

    /* renamed from: i */
    public void mo344i() {
        super.mo344i();
    }
}
