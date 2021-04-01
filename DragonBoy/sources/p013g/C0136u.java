package p013g;

import p001b.C0006b;
import p001b.C0008d;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0059e0;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.u */
public class C0136u {

    /* renamed from: A */
    public static int[] f2232A;

    /* renamed from: B */
    public static int f2233B;

    /* renamed from: C */
    public static int f2234C;

    /* renamed from: D */
    public static int f2235D;

    /* renamed from: E */
    public static int f2236E;

    /* renamed from: F */
    public static C0143b f2237F = C0161h.m1494l("/mainImage/myTexture2dbtMenu1.png");

    /* renamed from: G */
    public static C0143b f2238G = C0161h.m1494l("/mainImage/myTexture2dbtMenu2.png");

    /* renamed from: a */
    public boolean f2239a;

    /* renamed from: b */
    public C0173i f2240b;

    /* renamed from: c */
    public int f2241c;

    /* renamed from: d */
    public int f2242d;

    /* renamed from: e */
    public int f2243e;

    /* renamed from: f */
    public int f2244f;

    /* renamed from: g */
    public int f2245g;

    /* renamed from: h */
    C0055d f2246h = new C0055d(C0057d1.f697o1, 0);

    /* renamed from: i */
    C0055d f2247i = new C0055d(C0057d1.f606b1, 0, C0145a.f2614V - 71, (C0145a.f2616W - C0178n.f2968f) + 1);

    /* renamed from: j */
    C0055d f2248j = null;

    /* renamed from: k */
    boolean f2249k;

    /* renamed from: l */
    public int f2250l;

    /* renamed from: m */
    public int f2251m;

    /* renamed from: n */
    private int f2252n;

    /* renamed from: o */
    private int f2253o;

    /* renamed from: p */
    private int[] f2254p = new int[3];

    /* renamed from: q */
    private boolean f2255q;

    /* renamed from: r */
    private boolean f2256r;

    /* renamed from: s */
    private int f2257s;

    /* renamed from: t */
    private int f2258t;

    /* renamed from: u */
    private boolean f2259u;

    /* renamed from: v */
    private boolean f2260v;

    /* renamed from: w */
    int f2261w;

    /* renamed from: x */
    int f2262x;

    /* renamed from: y */
    boolean f2263y;

    /* renamed from: z */
    public boolean[] f2264z;

    /* renamed from: a */
    public void mo584a() {
        C0055d dVar;
        this.f2263y = false;
        this.f2239a = false;
        C0130o.m1005a();
        if (this.f2260v) {
            C0145a.f2629e0.f2522s0 = null;
            C0114e.f1372c4 = null;
            C0140y yVar = C0145a.f2631f0;
            if (yVar != null && yVar.f2522s0 != null) {
                yVar.f2522s0 = null;
            }
        } else if (this.f2259u) {
            C0145a.f2629e0.f2522s0 = null;
            C0140y yVar2 = C0145a.f2631f0;
            if (!(yVar2 == null || yVar2.f2522s0 == null)) {
                yVar2.f2522s0 = null;
            }
            int i = this.f2241c;
            if (i >= 0 && (dVar = (C0055d) this.f2240b.elementAt(i)) != null) {
                C0175k.m1563p().mo876f();
                dVar.mo139d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2[r2.length - 1] <= r4.f2243e) goto L_0x000f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo585b() {
        /*
            r4 = this;
            boolean r0 = r4.f2263y
            r1 = 1
            if (r0 != 0) goto L_0x000f
            int[] r2 = f2232A
            int r3 = r2.length
            int r3 = r3 - r1
            r2 = r2[r3]
            int r3 = r4.f2243e
            if (r2 > r3) goto L_0x001b
        L_0x000f:
            if (r0 == 0) goto L_0x001c
            int[] r0 = f2232A
            int r2 = r0.length
            int r2 = r2 - r1
            r0 = r0[r2]
            int r2 = p018i.C0145a.f2616W
            if (r0 >= r2) goto L_0x001c
        L_0x001b:
            return r1
        L_0x001c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0136u.mo585b():boolean");
    }

    /* renamed from: c */
    public void mo586c() {
        int i = this.f2258t;
        if (i != 0 && !this.f2255q) {
            int i2 = f2233B + (i / 100);
            f2233B = i2;
            if (i2 < 0) {
                f2233B = 0;
            } else {
                int i3 = f2235D;
                if (i2 > i3) {
                    f2233B = i3;
                } else {
                    f2234C = i2;
                }
            }
            int i4 = (i * 9) / 10;
            this.f2258t = i4;
            if (i4 < 100 && i4 > -100) {
                this.f2258t = 0;
            }
        }
        int i5 = f2234C;
        int i6 = f2233B;
        if (i5 != i6 && !this.f2255q) {
            int i7 = (i6 - i5) << 2;
            this.f2261w = i7;
            int i8 = this.f2262x + i7;
            this.f2262x = i8;
            f2234C = i5 + (i8 >> 4);
            this.f2262x = i8 & 15;
        }
    }

    /* renamed from: d */
    public void mo587d(C0159f fVar) {
        int i;
        int i2;
        C0143b bVar;
        String str;
        C0177m mVar;
        if (!C0126k.m893c0().f2119g0 || !C0126k.m893c0().f2104Y) {
            fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
            fVar.mo773E(-f2234C, 0);
            for (int i3 = 0; i3 < this.f2240b.size(); i3++) {
                if (i3 == this.f2241c) {
                    bVar = f2238G;
                    i2 = this.f2242d + (this.f2244f * i3) + 1;
                    i = f2232A[i3];
                } else {
                    bVar = f2237F;
                    i2 = this.f2242d + (this.f2244f * i3) + 1;
                    i = f2232A[i3];
                }
                fVar.mo776e(bVar, i2, i + 1, 0);
                String[] strArr = ((C0055d) this.f2240b.elementAt(i3)).f401b;
                if (strArr == null) {
                    strArr = new String[]{((C0055d) this.f2240b.elementAt(i3)).f400a};
                }
                String[] strArr2 = strArr;
                int length = f2232A[i3] + ((this.f2245g - (strArr2.length * 14)) / 2) + 1;
                for (int i4 = 0; i4 < strArr2.length; i4++) {
                    if (i3 == this.f2241c) {
                        mVar = C0177m.f2952t;
                        str = strArr2[i4];
                    } else {
                        mVar = C0177m.f2951s;
                        str = strArr2[i4];
                    }
                    int i5 = this.f2242d;
                    int i6 = this.f2244f;
                    mVar.mo909a(fVar, str, (i6 / 2) + i5 + (i3 * i6), length + (i4 * 14), 2);
                }
            }
            fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        }
    }

    /* renamed from: e */
    public void mo588e(int i, Object obj) {
    }

    /* renamed from: f */
    public void mo589f() {
        C0055d dVar;
        C0130o.m1005a();
        int i = this.f2241c;
        if (i >= 0 && (dVar = (C0055d) this.f2240b.elementAt(i)) != null) {
            dVar.mo139d();
        }
    }

    /* renamed from: g */
    public void mo590g(C0173i iVar, int i) {
        if (!this.f2239a) {
            this.f2263y = false;
            this.f2259u = false;
            this.f2260v = false;
            this.f2250l = 0;
            if (iVar.size() == 1) {
                this.f2241c = 0;
                C0055d dVar = (C0055d) iVar.elementAt(0);
                if (dVar != null && dVar.f400a.equals(C0057d1.f712q2)) {
                    dVar.mo139d();
                    this.f2239a = false;
                    C0130o.m1008d();
                    return;
                }
            }
            C0175k.m1563p().mo856G();
            this.f2264z = new boolean[iVar.size()];
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f2264z;
                if (i2 >= zArr.length) {
                    break;
                }
                zArr[i2] = false;
                i2++;
            }
            this.f2249k = false;
            C0006b.f95C = null;
            C0008d.f124b.removeAllElements();
            C0008d.f126d.removeAllElements();
            C0130o.m1005a();
            if (iVar.size() != 0) {
                this.f2240b = iVar;
                this.f2244f = 60;
                this.f2245g = 60;
                for (int i3 = 0; i3 < iVar.size(); i3++) {
                    C0055d dVar2 = (C0055d) iVar.elementAt(i3);
                    dVar2.f404e = false;
                    C0177m.f2924A.mo914f(dVar2.f400a);
                    dVar2.f401b = C0177m.f2924A.mo916h(dVar2.f400a, this.f2244f - 10);
                }
                f2232A = new int[iVar.size()];
                int size = (C0145a.f2614V - (iVar.size() * this.f2244f)) / 2;
                this.f2242d = size;
                if (size < 1) {
                    this.f2242d = 1;
                }
                int i4 = ((C0145a.f2616W - this.f2245g) - (C0059e0.f791c + 1)) - 1;
                this.f2243e = i4;
                if (C0145a.f2659x) {
                    this.f2243e = i4 - 3;
                }
                this.f2243e += 27;
                int i5 = 0;
                while (true) {
                    int[] iArr = f2232A;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    iArr[i5] = C0145a.f2616W;
                    i5++;
                }
                this.f2239a = true;
                this.f2241c = 0;
                int size2 = (this.f2240b.size() * this.f2244f) - C0145a.f2614V;
                f2235D = size2;
                if (size2 < 0) {
                    f2235D = 0;
                }
                f2233B = 0;
                f2234C = 0;
                f2236E = 50;
                int size3 = (iVar.size() * this.f2244f) - 1;
                this.f2251m = size3;
                int i6 = C0145a.f2614V;
                if (size3 > i6 - 2) {
                    this.f2251m = i6 - 2;
                }
                if (C0145a.f2659x) {
                    this.f2241c = -1;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo591h(C0173i iVar, int i, int i2) {
        mo590g(iVar, 0);
        this.f2242d = i;
        this.f2243e = i2;
        while (true) {
            int i3 = this.f2243e;
            if (this.f2245g + i3 > C0145a.f2616W) {
                this.f2243e = i3 - 2;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public void mo592i(C0173i iVar, int i) {
        mo590g(iVar, i);
        this.f2249k = true;
    }

    /* renamed from: j */
    public void mo593j() {
        int i;
        int[] iArr;
        int[] iArr2;
        mo586c();
        if (!this.f2263y) {
            this.f2250l++;
            int i2 = 0;
            while (true) {
                iArr2 = f2232A;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i3 = iArr2[i2];
                int i4 = this.f2243e;
                if (i3 > i4) {
                    int i5 = (iArr2[i2] - i4) >> 1;
                    if (i5 < 1) {
                        i5 = 1;
                    }
                    if (this.f2250l > i2) {
                        iArr2[i2] = iArr2[i2] - i5;
                    }
                }
                i2++;
            }
            if (iArr2[iArr2.length - 1] <= this.f2243e) {
                this.f2250l = 0;
            }
        } else {
            this.f2250l++;
            int i6 = 0;
            while (true) {
                iArr = f2232A;
                if (i6 >= iArr.length) {
                    break;
                }
                int i7 = iArr[i6];
                int i8 = C0145a.f2616W;
                if (i7 < i8) {
                    int[] iArr3 = f2232A;
                    int i9 = ((i8 - iArr3[i6]) >> 1) + 2;
                    if (i9 < 1) {
                        i9 = 1;
                    }
                    if (this.f2250l > i6) {
                        iArr3[i6] = iArr3[i6] + i9;
                    }
                }
                i6++;
            }
            if (iArr[iArr.length - 1] >= C0145a.f2616W) {
                this.f2250l = 0;
                mo584a();
            }
        }
        int i10 = f2236E;
        if (i10 != 0) {
            int i11 = i10 >> 1;
            f2236E = i11;
            if (i11 < 0) {
                f2236E = 0;
            }
        }
        if (!mo585b() && (i = this.f2257s) > 0) {
            int i12 = i - 1;
            this.f2257s = i12;
            if (i12 == 0) {
                int i13 = this.f2241c;
                if (i13 < 0 || this.f2264z[i13]) {
                    mo589f();
                    return;
                }
                this.f2263y = true;
                this.f2259u = true;
                C0145a.f2629e0.f2522s0 = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0155  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo594k() {
        /*
            r10 = this;
            g.k r0 = p013g.C0126k.m893c0()
            boolean r0 = r0.f2119g0
            if (r0 == 0) goto L_0x0011
            g.k r0 = p013g.C0126k.m893c0()
            boolean r0 = r0.f2104Y
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r10.f2239a
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            boolean r0 = r10.mo585b()
            if (r0 == 0) goto L_0x001d
            return
        L_0x001d:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 2
            boolean r2 = r0[r1]
            r3 = 5
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x00d8
            r2 = 4
            boolean r2 = r0[r2]
            if (r2 == 0) goto L_0x002e
            goto L_0x00d8
        L_0x002e:
            r2 = 8
            boolean r2 = r0[r2]
            if (r2 != 0) goto L_0x00c7
            r2 = 6
            boolean r2 = r0[r2]
            if (r2 == 0) goto L_0x003b
            goto L_0x00c7
        L_0x003b:
            boolean r2 = r0[r3]
            if (r2 == 0) goto L_0x006a
            e.d r0 = r10.f2248j
            if (r0 == 0) goto L_0x0067
            int r2 = r0.f403d
            if (r2 <= 0) goto L_0x00c5
            e.l r0 = r0.f402c
            g.k r2 = p013g.C0126k.m893c0()
            if (r0 != r2) goto L_0x005d
            g.k r0 = p013g.C0126k.m893c0()
            e.d r2 = r10.f2248j
            int r6 = r2.f403d
            java.lang.Object r2 = r2.f413n
            r0.mo530m(r6, r2)
            goto L_0x00c5
        L_0x005d:
            e.d r0 = r10.f2248j
            int r2 = r0.f403d
            java.lang.Object r0 = r0.f413n
            r10.mo588e(r2, r0)
            goto L_0x00c5
        L_0x0067:
            r10.f2257s = r1
            goto L_0x00c5
        L_0x006a:
            r2 = 12
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0097
            g.k r0 = p013g.C0126k.m893c0()
            boolean r0 = r0.mo557x0()
            if (r0 != 0) goto L_0x0097
            boolean r0 = r10.mo585b()
            if (r0 == 0) goto L_0x0081
            return
        L_0x0081:
            e.d r0 = r10.f2246h
            int r2 = r0.f403d
            if (r2 <= 0) goto L_0x008d
            java.lang.Object r0 = r0.f413n
            r10.mo588e(r2, r0)
            goto L_0x008f
        L_0x008d:
            r10.f2257s = r1
        L_0x008f:
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo876f()
            goto L_0x00c5
        L_0x0097:
            g.k r0 = p013g.C0126k.m893c0()
            boolean r0 = r0.mo557x0()
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r10.f2249k
            if (r0 != 0) goto L_0x00c5
            boolean[] r0 = p018i.C0145a.f2574B
            r2 = 13
            boolean r0 = r0[r2]
            if (r0 != 0) goto L_0x00b5
            e.d r0 = r10.f2247i
            boolean r0 = p020k.C0178n.m1639c(r0)
            if (r0 == 0) goto L_0x00c5
        L_0x00b5:
            boolean r0 = r10.mo585b()
            if (r0 == 0) goto L_0x00bc
            return
        L_0x00bc:
            boolean r0 = r10.f2260v
            if (r0 != 0) goto L_0x00c2
            r10.f2260v = r4
        L_0x00c2:
            r10.f2263y = r4
            goto L_0x008f
        L_0x00c5:
            r0 = 0
            goto L_0x00e9
        L_0x00c7:
            int r0 = r10.f2241c
            int r0 = r0 + r4
            r10.f2241c = r0
            k.i r2 = r10.f2240b
            int r2 = r2.size()
            int r2 = r2 - r4
            if (r0 <= r2) goto L_0x00e8
            r10.f2241c = r5
            goto L_0x00e8
        L_0x00d8:
            int r0 = r10.f2241c
            int r0 = r0 - r4
            r10.f2241c = r0
            if (r0 >= 0) goto L_0x00e8
            k.i r0 = r10.f2240b
            int r0 = r0.size()
            int r0 = r0 - r4
            r10.f2241c = r0
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            if (r0 == 0) goto L_0x0115
            int r0 = r10.f2241c
            int r2 = r10.f2244f
            int r6 = r0 * r2
            int r6 = r6 + r2
            int r2 = p018i.C0145a.f2614V
            int r2 = r2 / r1
            int r6 = r6 - r2
            f2233B = r6
            int r2 = f2235D
            if (r6 <= r2) goto L_0x00fe
            f2233B = r2
        L_0x00fe:
            int r2 = f2233B
            if (r2 >= 0) goto L_0x0104
            f2233B = r5
        L_0x0104:
            k.i r2 = r10.f2240b
            int r2 = r2.size()
            int r2 = r2 - r4
            if (r0 == r2) goto L_0x0111
            int r0 = r10.f2241c
            if (r0 != 0) goto L_0x0115
        L_0x0111:
            int r0 = f2233B
            f2234C = r0
        L_0x0115:
            boolean r0 = r10.f2249k
            if (r0 != 0) goto L_0x0155
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x0155
            int r0 = r10.f2242d
            int r2 = r10.f2243e
            int r6 = r10.f2251m
            int r7 = r10.f2245g
            boolean r0 = p018i.C0145a.m1335E(r0, r2, r6, r7)
            if (r0 != 0) goto L_0x0155
            boolean r0 = r10.f2255q
            if (r0 != 0) goto L_0x0155
            g.k r0 = p013g.C0126k.m893c0()
            boolean r0 = r0.mo557x0()
            if (r0 != 0) goto L_0x0155
            boolean r0 = r10.mo585b()
            if (r0 == 0) goto L_0x0140
            return
        L_0x0140:
            r10.f2253o = r5
            r10.f2252n = r5
            r10.f2255q = r5
            p018i.C0145a.m1357l()
            r10.f2263y = r4
            r10.f2260v = r4
            k.k r0 = p020k.C0175k.m1563p()
            r0.mo876f()
            return
        L_0x0155:
            boolean r0 = p018i.C0145a.f2578D
            r2 = -1000(0xfffffffffffffc18, float:NaN)
            r6 = -1
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r10.f2255q
            if (r0 != 0) goto L_0x018d
            int r0 = r10.f2242d
            int r7 = r10.f2243e
            int r8 = r10.f2251m
            int r9 = r10.f2245g
            boolean r0 = p018i.C0145a.m1335E(r0, r7, r8, r9)
            if (r0 == 0) goto L_0x018d
            r0 = 0
        L_0x016f:
            int[] r7 = r10.f2254p
            int r8 = r7.length
            if (r0 >= r8) goto L_0x017b
            int r8 = p018i.C0145a.f2586H
            r7[r5] = r8
            int r0 = r0 + 1
            goto L_0x016f
        L_0x017b:
            int r0 = p018i.C0145a.f2586H
            r10.f2253o = r0
            r10.f2255q = r4
            int r0 = r10.f2258t
            if (r0 == 0) goto L_0x0187
            r0 = 1
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            r10.f2256r = r0
            r10.f2258t = r5
            goto L_0x01f4
        L_0x018d:
            boolean r0 = r10.f2255q
            if (r0 == 0) goto L_0x01f4
            int r0 = r10.f2252n
            int r0 = r0 + r4
            r10.f2252n = r0
            if (r0 <= r3) goto L_0x01af
            int r0 = r10.f2253o
            int r7 = p018i.C0145a.f2586H
            if (r0 != r7) goto L_0x01af
            boolean r0 = r10.f2256r
            if (r0 != 0) goto L_0x01af
            r10.f2253o = r2
            int r0 = f2233B
            int r0 = r0 + r7
            int r7 = r10.f2242d
            int r0 = r0 - r7
            int r7 = r10.f2244f
            int r0 = r0 / r7
            r10.f2241c = r0
        L_0x01af:
            int r0 = p018i.C0145a.f2586H
            int[] r7 = r10.f2254p
            r8 = r7[r5]
            int r0 = r0 - r8
            if (r0 == 0) goto L_0x01be
            int r8 = r10.f2241c
            if (r8 == r6) goto L_0x01be
            r10.f2241c = r6
        L_0x01be:
            int r7 = r7.length
            int r7 = r7 - r4
        L_0x01c0:
            if (r7 <= 0) goto L_0x01cd
            int[] r8 = r10.f2254p
            int r9 = r7 + -1
            r9 = r8[r9]
            r8[r7] = r9
            int r7 = r7 + -1
            goto L_0x01c0
        L_0x01cd:
            int[] r7 = r10.f2254p
            int r8 = p018i.C0145a.f2586H
            r7[r5] = r8
            int r7 = f2233B
            int r7 = r7 - r0
            f2233B = r7
            if (r7 >= 0) goto L_0x01dc
            f2233B = r5
        L_0x01dc:
            int r7 = f2233B
            int r8 = f2235D
            if (r7 <= r8) goto L_0x01e4
            f2233B = r8
        L_0x01e4:
            int r7 = f2234C
            if (r7 < 0) goto L_0x01ea
            if (r7 <= r8) goto L_0x01ec
        L_0x01ea:
            int r0 = r0 / 2
        L_0x01ec:
            int r7 = r7 - r0
            f2234C = r7
            int r0 = p018i.C0145a.f2616W
            int r0 = r0 / 3
            int r0 = -r0
        L_0x01f4:
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x0280
            boolean r0 = r10.f2255q
            if (r0 == 0) goto L_0x0280
            int r0 = p018i.C0145a.f2586H
            int[] r7 = r10.f2254p
            r7 = r7[r5]
            int r0 = r0 - r7
            p018i.C0145a.f2582F = r5
            int r0 = p013g.C0111c0.m574a(r0)
            r7 = 20
            r8 = 10
            if (r0 >= r7) goto L_0x0236
            int r0 = p018i.C0145a.f2586H
            int r9 = r10.f2253o
            int r0 = r0 - r9
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 >= r7) goto L_0x0236
            boolean r0 = r10.f2256r
            if (r0 != 0) goto L_0x0236
            r10.f2258t = r5
            int r0 = f2234C
            f2233B = r0
            r10.f2253o = r2
            int r1 = p018i.C0145a.f2586H
            int r0 = r0 + r1
            int r1 = r10.f2242d
            int r0 = r0 - r1
            int r1 = r10.f2244f
            int r0 = r0 / r1
            r10.f2241c = r0
            r10.f2252n = r5
            r10.f2257s = r8
            goto L_0x027a
        L_0x0236:
            int r0 = r10.f2241c
            if (r0 == r6) goto L_0x0243
            int r2 = r10.f2252n
            if (r2 <= r3) goto L_0x0243
            r10.f2252n = r5
            r10.f2257s = r4
            goto L_0x027a
        L_0x0243:
            if (r0 != r6) goto L_0x027a
            boolean r0 = r10.f2256r
            if (r0 != 0) goto L_0x027a
            int r0 = f2234C
            if (r0 >= 0) goto L_0x0250
            f2233B = r5
            goto L_0x027a
        L_0x0250:
            int r2 = f2235D
            if (r0 <= r2) goto L_0x0257
            f2233B = r2
            goto L_0x027a
        L_0x0257:
            int r0 = p018i.C0145a.f2586H
            int[] r2 = r10.f2254p
            r3 = r2[r5]
            int r0 = r0 - r3
            r3 = r2[r5]
            r6 = r2[r4]
            int r3 = r3 - r6
            int r0 = r0 + r3
            r3 = r2[r4]
            r1 = r2[r1]
            int r3 = r3 - r1
            int r0 = r0 + r3
            r1 = -10
            if (r0 <= r8) goto L_0x026f
            goto L_0x0275
        L_0x026f:
            if (r0 >= r1) goto L_0x0274
            r8 = -10
            goto L_0x0275
        L_0x0274:
            r8 = 0
        L_0x0275:
            int r0 = -r8
            int r0 = r0 * 100
            r10.f2258t = r0
        L_0x027a:
            r10.f2255q = r5
            r10.f2252n = r5
            p018i.C0145a.f2582F = r5
        L_0x0280:
            p018i.C0145a.m1359n()
            p018i.C0145a.m1358m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0136u.mo594k():void");
    }
}
