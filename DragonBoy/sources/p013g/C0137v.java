package p013g;

import p001b.C0010f;
import p001b.C0019o;
import p001b.C0020p;
import p011e.C0098y;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;

/* renamed from: g.v */
public class C0137v implements C0128m {

    /* renamed from: m0 */
    public static C0098y[] f2265m0;

    /* renamed from: n0 */
    public static C0173i f2266n0 = new C0173i("lastMob");

    /* renamed from: o0 */
    public static C0173i f2267o0 = new C0173i("newMob");

    /* renamed from: p0 */
    public static C0143b f2268p0 = C0161h.m1494l("/mainImage/myTexture2dmobHP.png");

    /* renamed from: A */
    public boolean f2269A;

    /* renamed from: B */
    public boolean f2270B;

    /* renamed from: C */
    public boolean f2271C;

    /* renamed from: D */
    public boolean f2272D;

    /* renamed from: E */
    public boolean f2273E;

    /* renamed from: F */
    public C0173i f2274F = new C0173i("vMobMove");

    /* renamed from: G */
    public int f2275G;

    /* renamed from: H */
    public C0114e f2276H;

    /* renamed from: I */
    public int f2277I;

    /* renamed from: J */
    public int f2278J;

    /* renamed from: K */
    public int f2279K;

    /* renamed from: L */
    public byte f2280L;

    /* renamed from: M */
    public boolean f2281M;

    /* renamed from: N */
    public boolean f2282N;

    /* renamed from: O */
    public int f2283O;

    /* renamed from: P */
    public int f2284P;

    /* renamed from: Q */
    boolean f2285Q;

    /* renamed from: R */
    int f2286R;

    /* renamed from: S */
    public boolean f2287S = true;

    /* renamed from: T */
    int f2288T;

    /* renamed from: U */
    int f2289U;

    /* renamed from: V */
    boolean f2290V;

    /* renamed from: W */
    int f2291W;

    /* renamed from: X */
    int f2292X;

    /* renamed from: Y */
    int f2293Y;

    /* renamed from: Z */
    public int f2294Z;

    /* renamed from: a */
    boolean f2295a;

    /* renamed from: a0 */
    public boolean f2296a0 = true;

    /* renamed from: b */
    short f2297b;

    /* renamed from: b0 */
    public int[] f2298b0 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};

    /* renamed from: c */
    public boolean f2299c;

    /* renamed from: c0 */
    public int[] f2300c0 = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};

    /* renamed from: d */
    public boolean f2301d = false;

    /* renamed from: d0 */
    public int[] f2302d0 = {1, 1, 2, 2, 3, 3, 2};

    /* renamed from: e */
    public int f2303e;

    /* renamed from: e0 */
    public int[] f2304e0 = {4, 5, 6};

    /* renamed from: f */
    public long f2305f;

    /* renamed from: f0 */
    public int[] f2306f0 = {7, 8, 9};

    /* renamed from: g */
    public long f2307g;

    /* renamed from: g0 */
    public C0114e f2308g0;

    /* renamed from: h */
    public int f2309h;

    /* renamed from: h0 */
    public boolean f2310h0 = false;

    /* renamed from: i */
    public int f2311i;

    /* renamed from: i0 */
    public C0137v f2312i0;

    /* renamed from: j */
    public int f2313j;

    /* renamed from: j0 */
    public int f2314j0;

    /* renamed from: k */
    public int f2315k;

    /* renamed from: k0 */
    public boolean f2316k0;

    /* renamed from: l */
    public int f2317l;

    /* renamed from: l0 */
    public boolean f2318l0;

    /* renamed from: m */
    public int f2319m = 1;

    /* renamed from: n */
    public int f2320n = 1;

    /* renamed from: o */
    public int f2321o;

    /* renamed from: p */
    public int f2322p;

    /* renamed from: q */
    public int f2323q;

    /* renamed from: r */
    public int f2324r;

    /* renamed from: s */
    public int f2325s;

    /* renamed from: t */
    public int f2326t;

    /* renamed from: u */
    public int f2327u;

    /* renamed from: v */
    public int f2328v;

    /* renamed from: w */
    public int f2329w;

    /* renamed from: x */
    public int f2330x;

    /* renamed from: y */
    public int f2331y;

    /* renamed from: z */
    public boolean f2332z;

    public C0137v() {
    }

    public C0137v(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, byte b, int i5, short s, short s2, byte b2, byte b3) {
        int i6 = i2;
        short s3 = s;
        short s4 = s2;
        this.f2269A = z2;
        this.f2271C = z4;
        this.f2272D = z5;
        this.f2279K = i3;
        this.f2331y = i;
        this.f2275G = i6;
        this.f2311i = i4;
        this.f2315k = s3;
        this.f2325s = s3;
        this.f2317l = s4;
        this.f2326t = s4;
        this.f2321o = b2;
        if (i6 != 70) {
            mo595h();
            mo596o();
        }
        if (!m1054r(i6 + "")) {
            C0173i iVar = f2267o0;
            iVar.addElement(i6 + "");
        }
        this.f2313j = i5;
        this.f2280L = b3;
        this.f2273E = false;
        this.f2283O = s3;
        this.f2284P = s4;
        if (mo600t()) {
            this.f2298b0 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.f2300c0 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.f2302d0 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
            this.f2304e0 = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
            this.f2306f0 = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
        } else if (mo599s()) {
            this.f2298b0 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.f2300c0 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
            this.f2302d0 = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
            this.f2304e0 = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
            this.f2306f0 = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
        } else if (mo337v()) {
            this.f2298b0 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.f2300c0 = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
            this.f2302d0 = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
            this.f2304e0 = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
            this.f2306f0 = new int[]{5, 12, 13, 14};
        } else {
            this.f2298b0 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            this.f2300c0 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
            this.f2302d0 = new int[]{1, 1, 2, 2, 3, 3, 2};
            this.f2304e0 = new int[]{4, 5, 6};
            this.f2306f0 = new int[]{7, 8, 9};
        }
        C0111c0.m584k("MOB ID= " + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r6.f2289U != 10) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r6.f2289U = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r6.f2289U != 10) goto L_0x002c;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1048H() {
        /*
            r6 = this;
            boolean r0 = r6.f2296a0
            r1 = 15
            r2 = 11
            r3 = 1
            if (r0 != 0) goto L_0x0047
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % 4
            if (r0 != 0) goto L_0x0047
            boolean r0 = r6.mo600t()
            if (r0 == 0) goto L_0x0020
            int[] r0 = r6.f2304e0
            int r4 = p018i.C0145a.f2600O
            int r5 = r0.length
            int r4 = r4 % r5
            r0 = r0[r4]
            r6.f2289U = r0
            goto L_0x0047
        L_0x0020:
            boolean r0 = r6.mo599s()
            r4 = 10
            if (r0 == 0) goto L_0x0032
            int r0 = r6.f2289U
            if (r0 == r4) goto L_0x002f
        L_0x002c:
            r6.f2289U = r4
            goto L_0x0047
        L_0x002f:
            r6.f2289U = r2
            goto L_0x0047
        L_0x0032:
            boolean r0 = r6.mo337v()
            if (r0 == 0) goto L_0x0042
            int r0 = r6.f2289U
            if (r0 == r3) goto L_0x003f
            r6.f2289U = r3
            goto L_0x0047
        L_0x003f:
            r6.f2289U = r1
            goto L_0x0047
        L_0x0042:
            int r0 = r6.f2289U
            if (r0 == r4) goto L_0x002f
            goto L_0x002c
        L_0x0047:
            int r0 = r6.f2330x
            int r0 = r0 - r3
            r6.f2330x = r0
            if (r0 > 0) goto L_0x00b2
            boolean r0 = r6.mo600t()
            if (r0 != 0) goto L_0x0072
            boolean r0 = r6.mo599s()
            if (r0 == 0) goto L_0x005e
            int r0 = r6.f2289U
            if (r0 == r2) goto L_0x0072
        L_0x005e:
            boolean r0 = r6.mo337v()
            if (r0 == 0) goto L_0x0068
            int r0 = r6.f2289U
            if (r0 == r1) goto L_0x0072
        L_0x0068:
            int r0 = r6.f2275G
            r1 = 58
            if (r0 >= r1) goto L_0x00b2
            int r0 = r6.f2289U
            if (r0 != r2) goto L_0x00b2
        L_0x0072:
            g.e r0 = r6.f2308g0
            r1 = 0
            if (r0 == 0) goto L_0x007b
            boolean r2 = r6.f2310h0
            if (r2 != 0) goto L_0x007f
        L_0x007b:
            int r2 = r6.f2311i
            if (r2 != 0) goto L_0x008c
        L_0x007f:
            r6.f2321o = r3
            int r0 = r0.f1633v
            int r0 = r0 << r3
            r6.f2323q = r0
            r0 = -3
            r6.f2322p = r0
            r6.f2324r = r1
            goto L_0x00ae
        L_0x008c:
            r2 = 5
            r6.f2321o = r2
            if (r0 == 0) goto L_0x00a6
            int r2 = r0.f1633v
            int r2 = -r2
            r6.f2319m = r2
            int r2 = r6.f2315k
            int r0 = r0.f1593n
            int r2 = r2 - r0
            int r0 = p013g.C0111c0.m574a(r2)
            r2 = 24
            if (r0 >= r2) goto L_0x00a6
            r0 = 2
            r6.f2321o = r0
        L_0x00a6:
            r6.f2324r = r1
            r6.f2323q = r1
            r6.f2322p = r1
            r6.f2330x = r1
        L_0x00ae:
            r0 = 0
            r6.f2308g0 = r0
            return
        L_0x00b2:
            e.y[] r0 = f2265m0
            int r1 = r6.f2275G
            r2 = r0[r1]
            byte r2 = r2.f1106d
            if (r2 == 0) goto L_0x00da
            g.e r2 = r6.f2308g0
            if (r2 == 0) goto L_0x00da
            int r2 = r2.f1633v
            int r2 = -r2
            int r2 = r2 << r3
            int r3 = r6.f2315k
            int r4 = r6.f2325s
            r5 = r0[r1]
            byte r5 = r5.f1104b
            int r5 = r4 - r5
            if (r3 <= r5) goto L_0x00da
            r0 = r0[r1]
            byte r0 = r0.f1104b
            int r4 = r4 + r0
            if (r3 >= r4) goto L_0x00da
            int r3 = r3 - r2
            r6.f2315k = r3
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0137v.m1048H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (p013g.C0111c0.m574a(r0.f1593n - r7.f2315k) > 80) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (p013g.C0111c0.m574a(r0.f2315k - r7.f2315k) > 80) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (p013g.C0111c0.m574a(r0.f1593n - r7.f2315k) > 80) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (p013g.C0111c0.m574a(r0.f2315k - r7.f2315k) > 80) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r0.f1593n > r7.f2315k) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r7.f2319m = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        if (r0.f2315k > r7.f2315k) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1049J() {
        /*
            r7 = this;
            int[] r0 = r7.f2298b0
            r7.mo333i(r0)
            e.y[] r0 = f2265m0
            int r1 = r7.f2275G
            r0 = r0[r1]
            byte r0 = r0.f1106d
            r1 = 2
            r2 = 5
            r3 = 80
            r4 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x004a
            if (r0 == r1) goto L_0x004a
            r5 = 3
            if (r0 == r5) goto L_0x004a
            r6 = 4
            if (r0 == r6) goto L_0x0021
            if (r0 == r2) goto L_0x0021
            goto L_0x0077
        L_0x0021:
            int r0 = r7.f2322p
            int r0 = r0 + r4
            r7.f2322p = r0
            int r6 = r7.f2331y
            int r6 = r6 % r5
            if (r0 <= r6) goto L_0x0077
            g.e r0 = r7.f2276H
            if (r0 == 0) goto L_0x003a
            int r0 = r0.f1593n
            int r5 = r7.f2315k
            int r0 = r0 - r5
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r3) goto L_0x0077
        L_0x003a:
            g.v r0 = r7.f2312i0
            if (r0 == 0) goto L_0x0075
            int r0 = r0.f2315k
            int r5 = r7.f2315k
            int r0 = r0 - r5
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r3) goto L_0x0077
            goto L_0x0075
        L_0x004a:
            int r0 = r7.f2322p
            int r0 = r0 + r4
            r7.f2322p = r0
            int r5 = r7.f2331y
            int r5 = r5 % 10
            int r5 = r5 + 10
            if (r0 <= r5) goto L_0x0077
            g.e r0 = r7.f2276H
            if (r0 == 0) goto L_0x0066
            int r0 = r0.f1593n
            int r5 = r7.f2315k
            int r0 = r0 - r5
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r3) goto L_0x0077
        L_0x0066:
            g.v r0 = r7.f2312i0
            if (r0 == 0) goto L_0x0075
            int r0 = r0.f2315k
            int r5 = r7.f2315k
            int r0 = r0 - r5
            int r0 = p013g.C0111c0.m574a(r0)
            if (r0 <= r3) goto L_0x0077
        L_0x0075:
            r7.f2321o = r2
        L_0x0077:
            g.e r0 = r7.f2276H
            r2 = -1
            if (r0 == 0) goto L_0x0093
            int r3 = p018i.C0145a.f2600O
            int r5 = r7.f2322p
            int r5 = r5 % 20
            int r5 = r5 + 10
            int r3 = r3 % r5
            if (r3 != 0) goto L_0x0093
            int r0 = r0.f1593n
            int r3 = r7.f2315k
            if (r0 <= r3) goto L_0x0090
        L_0x008d:
            r7.f2319m = r4
            goto L_0x00a9
        L_0x0090:
            r7.f2319m = r2
            goto L_0x00a9
        L_0x0093:
            g.v r0 = r7.f2312i0
            if (r0 == 0) goto L_0x00a9
            int r3 = p018i.C0145a.f2600O
            int r5 = r7.f2322p
            int r5 = r5 % 20
            int r5 = r5 + 10
            int r3 = r3 % r5
            if (r3 != 0) goto L_0x00a9
            int r0 = r0.f2315k
            int r3 = r7.f2315k
            if (r0 <= r3) goto L_0x0090
            goto L_0x008d
        L_0x00a9:
            int r0 = r7.f2314j0
            if (r0 <= 0) goto L_0x00b2
            int r0 = r0 - r4
            r7.f2314j0 = r0
            r7.f2321o = r1
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0137v.m1049J():void");
    }

    /* renamed from: L */
    private void m1050L() {
        int i;
        byte b = C0121h0.f1796o;
        int i2 = this.f2315k;
        this.f2283O = i2;
        this.f2286R = 0;
        int i3 = this.f2284P;
        if (i3 > 0 && !C0121h0.m841u(i2, i3, 2)) {
            if (C0121h0.m840t(this.f2283O / b, this.f2284P / b) == 0) {
                this.f2285Q = true;
            } else if (C0121h0.m840t(this.f2283O / b, this.f2284P / b) != 0 && !C0121h0.m841u(this.f2283O, this.f2284P, 2)) {
                this.f2283O = this.f2315k;
                this.f2284P = this.f2317l;
                this.f2285Q = false;
            }
            while (this.f2285Q && (i = this.f2286R) < 10) {
                this.f2286R = i + 1;
                int i4 = this.f2284P + 24;
                this.f2284P = i4;
                if (C0121h0.m841u(this.f2283O, i4, 2)) {
                    int i5 = this.f2284P;
                    if (i5 % 24 != 0) {
                        this.f2284P = i5 - (i5 % 24);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public static C0106a m1051l() {
        for (int i = 0; i < C0126k.f1920V1.size(); i++) {
            C0137v vVar = (C0137v) C0126k.f1920V1.elementAt(i);
            if (vVar instanceof C0106a) {
                return (C0106a) vVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static C0112d m1052m() {
        for (int i = 0; i < C0126k.f1920V1.size(); i++) {
            C0137v vVar = (C0137v) C0126k.f1920V1.elementAt(i);
            if (vVar instanceof C0112d) {
                return (C0112d) vVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static C0110c m1053n() {
        for (int i = 0; i < C0126k.f1920V1.size(); i++) {
            C0137v vVar = (C0137v) C0126k.f1920V1.elementAt(i);
            if (vVar instanceof C0110c) {
                return (C0110c) vVar;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m1054r(String str) {
        for (int i = 0; i < f2267o0.size(); i++) {
            if (((String) f2267o0.elementAt(i)).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private void m1055y(C0159f fVar) {
        int i;
        byte b = C0121h0.f1796o;
        int i2 = b / 2;
        if (!C0121h0.m841u(this.f2283O + i2, this.f2284P + 1, 4)) {
            if (C0121h0.m840t((this.f2283O - i2) / b, (this.f2284P + 1) / b) == 0) {
                fVar.mo771C((this.f2283O / b) * b, ((this.f2284P - 30) / b) * b, 100, 100);
                fVar.mo770B();
                fVar.mo774a((this.f2283O / b) * b, ((this.f2284P - 30) / b) * b, 100, 100);
            } else if (C0121h0.m840t((this.f2283O + i2) / b, (this.f2284P + 1) / b) != 0) {
                if (C0121h0.m841u(this.f2283O - i2, this.f2284P + 1, 8)) {
                    fVar.mo771C((this.f2283O / 24) * b, ((this.f2284P - 30) / b) * b, b, 100);
                    fVar.mo770B();
                    i = this.f2283O / 24;
                    fVar.mo774a(i * b, ((this.f2284P - 30) / b) * b, b, 100);
                }
            }
            fVar.mo776e(C0121h0.f1770I, this.f2283O, this.f2284P, 3);
            if (C0121h0.m841u(this.f2283O + i2, this.f2284P + 1, 4) || C0121h0.m840t((this.f2283O - i2) / b, (this.f2284P + 1) / b) == 0 || C0121h0.m840t((this.f2283O + i2) / b, (this.f2284P + 1) / b) == 0 || C0121h0.m841u(this.f2283O - i2, this.f2284P + 1, 8)) {
                fVar.mo769A();
            }
            fVar.mo771C(C0126k.f2028t1, C0126k.f2032u1 - C0145a.f2595L0, C0126k.f1975i1, C0126k.f1980j1 + (C0145a.f2595L0 * 2));
        }
        fVar.mo771C((this.f2283O / b) * b, ((this.f2284P - 30) / b) * b, b, 100);
        fVar.mo770B();
        i = this.f2283O / b;
        fVar.mo774a(i * b, ((this.f2284P - 30) / b) * b, b, 100);
        fVar.mo776e(C0121h0.f1770I, this.f2283O, this.f2284P, 3);
        fVar.mo769A();
        fVar.mo771C(C0126k.f2028t1, C0126k.f2032u1 - C0145a.f2595L0, C0126k.f1975i1, C0126k.f1980j1 + (C0145a.f2595L0 * 2));
    }

    /* renamed from: A */
    public void mo319A() {
        if (this.f2309h != 0) {
            this.f2309h = 0;
        }
    }

    /* renamed from: B */
    public void mo320B() {
        this.f2318l0 = false;
    }

    /* renamed from: C */
    public void mo321C(C0114e eVar) {
        this.f2296a0 = true;
        this.f2312i0 = null;
        this.f2276H = eVar;
        this.f2322p = 0;
        this.f2323q = 0;
        this.f2321o = 3;
        this.f2288T = 0;
        int i = eVar.f1593n;
        int i2 = this.f2315k;
        this.f2319m = i > i2 ? 1 : -1;
        int i3 = eVar.f1598o;
        if (C0111c0.m574a(i - i2) >= this.f2327u * 2 || C0111c0.m574a(i3 - this.f2317l) >= this.f2328v * 2) {
            this.f2324r = 1;
            return;
        }
        this.f2315k = this.f2315k < i ? i - this.f2327u : i + this.f2327u;
        this.f2324r = 0;
    }

    /* renamed from: D */
    public void mo322D(short s) {
        this.f2295a = true;
        this.f2297b = s;
    }

    /* renamed from: E */
    public void mo323E() {
        if (this.f2311i > 0 && this.f2321o != 3) {
            this.f2330x = 4;
            this.f2321o = 7;
            if (mo597p().f1106d != 0 && C0111c0.m574a(this.f2315k - this.f2325s) < 30) {
                this.f2315k -= this.f2319m * 10;
            }
        }
    }

    /* renamed from: F */
    public void mo324F() {
        this.f2311i = 0;
        this.f2310h0 = true;
        this.f2311i = 0;
        this.f2321o = 1;
        this.f2322p = -3;
        this.f2323q = -this.f2319m;
        this.f2324r = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
        if ((p018i.C0145a.f2600O % 20) > 5) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        r0.f2289U = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if ((p018i.C0145a.f2600O % 20) > 5) goto L_0x0158;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo325G() {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.f2316k0
            r2 = 113(0x71, float:1.58E-43)
            r3 = 5
            r4 = 1
            if (r1 == 0) goto L_0x0016
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r3
            if (r1 != 0) goto L_0x0016
            int r1 = r0.f2315k
            int r5 = r0.f2317l
            p001b.C0020p.m96c(r2, r1, r5, r4)
        L_0x0016:
            boolean r1 = r0.f2318l0
            r5 = 10
            if (r1 == 0) goto L_0x0033
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r5
            if (r1 != 0) goto L_0x0033
            b.e r1 = new b.e
            r7 = 41
            int r8 = r0.f2315k
            int r9 = r0.f2317l
            r10 = 3
            r11 = 1
            r12 = 1
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            p001b.C0007c.m43a(r1)
        L_0x0033:
            boolean r1 = p018i.C0145a.m1339K()
            r6 = 15
            r7 = 2
            r8 = 0
            if (r1 != 0) goto L_0x00f1
            int r1 = r0.f2321o
            if (r1 == r4) goto L_0x00f1
            if (r1 == 0) goto L_0x00f1
            boolean r1 = p018i.C0145a.m1339K()
            if (r1 != 0) goto L_0x00f1
            int r1 = p018i.C0145a.f2600O
            int r9 = r0.f2331y
            int r9 = r9 * 2
            int r9 = r9 + r6
            int r1 = r1 % r9
            if (r1 != 0) goto L_0x00f1
            r1 = 0
        L_0x0054:
            k.i r9 = p013g.C0126k.f1908S1
            int r9 = r9.size()
            r10 = 32
            if (r1 >= r9) goto L_0x00a2
            k.i r9 = p013g.C0126k.f1908S1
            java.lang.Object r9 = r9.elementAt(r1)
            g.e r9 = (p013g.C0114e) r9
            if (r9 == 0) goto L_0x009f
            boolean r11 = r9.f1509W2
            if (r11 == 0) goto L_0x009f
            int r11 = r9.f1584l0
            if (r11 != r10) goto L_0x009f
            g.e r10 = new g.e
            r10.<init>()
            int r11 = r9.f1593n
            r10.f1593n = r11
            int r11 = r9.f1598o
            int r12 = r9.f1539c0
            int r11 = r11 - r12
            r10.f1598o = r11
            int r9 = r9.f1643x
            if (r9 != 0) goto L_0x009f
            int r9 = r0.f2315k
            int r11 = r0.f2319m
            int r12 = r0.f2327u
            int r11 = r11 * r12
            int r12 = r9 + r11
            int r13 = r0.f2317l
            boolean r14 = r19.mo334j()
            r15 = -100
            r16 = -100
            r18 = 25
            r17 = r10
            p001b.C0019o.m91c(r12, r13, r14, r15, r16, r17, r18)
        L_0x009f:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x00a2:
            g.e r1 = p013g.C0114e.m647e0()
            boolean r1 = r1.f1509W2
            if (r1 == 0) goto L_0x00f1
            g.e r1 = p013g.C0114e.m647e0()
            int r1 = r1.f1584l0
            if (r1 != r10) goto L_0x00f1
            g.e r1 = new g.e
            r1.<init>()
            g.e r9 = p013g.C0114e.m647e0()
            int r9 = r9.f1593n
            r1.f1593n = r9
            g.e r9 = p013g.C0114e.m647e0()
            int r9 = r9.f1598o
            g.e r10 = p013g.C0114e.m647e0()
            int r10 = r10.f1539c0
            int r9 = r9 - r10
            r1.f1598o = r9
            g.e r9 = p013g.C0114e.m647e0()
            int r9 = r9.f1643x
            if (r9 != 0) goto L_0x00f1
            int r9 = r0.f2315k
            int r10 = r0.f2319m
            int r11 = r0.f2327u
            int r10 = r10 * r11
            int r11 = r9 + r10
            int r12 = r0.f2317l
            boolean r13 = r19.mo334j()
            r14 = -100
            r15 = -100
            r17 = 25
            r16 = r1
            p001b.C0019o.m91c(r11, r12, r13, r14, r15, r16, r17)
        L_0x00f1:
            int r1 = r0.f2309h
            if (r1 == 0) goto L_0x010e
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r3
            if (r1 != 0) goto L_0x010e
            b.e r1 = new b.e
            int r10 = r0.f2309h
            int r11 = r0.f2315k
            int r9 = r0.f2317l
            int r12 = r9 + 24
            r13 = 3
            r14 = 5
            r15 = 1
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            p001b.C0007c.m43a(r1)
        L_0x010e:
            boolean r1 = r0.f2301d
            r9 = 11
            if (r1 == 0) goto L_0x0177
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r3
            if (r1 != 0) goto L_0x0120
            int r1 = r0.f2315k
            int r10 = r0.f2317l
            p001b.C0020p.m96c(r2, r1, r10, r4)
        L_0x0120:
            long r1 = java.lang.System.currentTimeMillis()
            long r10 = r0.f2305f
            long r10 = r1 - r10
            r12 = 1000(0x3e8, double:4.94E-321)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x013b
            int r10 = r0.f2303e
            int r10 = r10 - r4
            r0.f2303e = r10
            r0.f2305f = r1
            if (r10 >= 0) goto L_0x013b
            r0.f2301d = r8
            r0.f2303e = r8
        L_0x013b:
            boolean r1 = r19.mo600t()
            if (r1 == 0) goto L_0x014c
            int[] r1 = r0.f2304e0
            int r2 = p018i.C0145a.f2600O
            int r10 = r1.length
            int r2 = r2 % r10
            r1 = r1[r2]
            r0.f2289U = r1
            goto L_0x0177
        L_0x014c:
            boolean r1 = r19.mo599s()
            if (r1 == 0) goto L_0x015e
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 20
            if (r1 <= r3) goto L_0x015b
        L_0x0158:
            r0.f2289U = r9
            goto L_0x0177
        L_0x015b:
            r0.f2289U = r5
            goto L_0x0177
        L_0x015e:
            boolean r1 = r19.mo337v()
            if (r1 == 0) goto L_0x0170
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 20
            if (r1 <= r3) goto L_0x016d
            r0.f2289U = r4
            goto L_0x0177
        L_0x016d:
            r0.f2289U = r6
            goto L_0x0177
        L_0x0170:
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % 20
            if (r1 <= r3) goto L_0x015b
            goto L_0x0158
        L_0x0177:
            boolean r1 = r19.mo338w()
            if (r1 != 0) goto L_0x017e
            return
        L_0x017e:
            boolean r1 = r0.f2287S
            if (r1 == 0) goto L_0x0185
            r19.m1050L()
        L_0x0185:
            k.i r1 = r0.f2274F
            if (r1 != 0) goto L_0x0194
            e.y[] r1 = f2265m0
            int r2 = r0.f2275G
            r1 = r1[r2]
            byte r1 = r1.f1104b
            if (r1 == 0) goto L_0x0194
            return
        L_0x0194:
            int r1 = r0.f2321o
            r2 = 3
            if (r1 == r2) goto L_0x01b2
            boolean r1 = r0.f2296a0
            if (r1 == 0) goto L_0x01b2
            g.e r1 = r0.f2276H
            if (r1 == 0) goto L_0x01a9
            int r2 = r0.f2277I
            int r10 = r0.f2278J
            r1.mo467z(r2, r10, r8, r4)
            goto L_0x01b0
        L_0x01a9:
            g.v r1 = r0.f2312i0
            if (r1 == 0) goto L_0x01b0
            r1.mo323E()
        L_0x01b0:
            r0.f2296a0 = r8
        L_0x01b2:
            byte r1 = r0.f2280L
            if (r1 <= 0) goto L_0x01b9
            r19.mo328M()
        L_0x01b9:
            int r1 = r0.f2321o
            r2 = 4
            r10 = -1
            switch(r1) {
                case 1: goto L_0x0281;
                case 2: goto L_0x0266;
                case 3: goto L_0x024d;
                case 4: goto L_0x0220;
                case 5: goto L_0x01df;
                case 6: goto L_0x01c7;
                case 7: goto L_0x01c2;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            goto L_0x0333
        L_0x01c2:
            r19.m1048H()
            goto L_0x0333
        L_0x01c7:
            r0.f2330x = r8
            int r1 = r0.f2322p
            int r1 = r1 + r4
            r0.f2322p = r1
            int r2 = r0.f2317l
            int r2 = r2 + r1
            r0.f2317l = r2
            int r1 = r0.f2326t
            if (r2 < r1) goto L_0x0333
            r0.f2317l = r1
            r0.f2322p = r8
            r0.f2321o = r3
            goto L_0x0333
        L_0x01df:
            int r1 = r0.f2309h
            if (r1 == 0) goto L_0x01e4
            return
        L_0x01e4:
            boolean r1 = r0.f2316k0
            if (r1 == 0) goto L_0x01e9
            return
        L_0x01e9:
            boolean r1 = r0.f2318l0
            if (r1 == 0) goto L_0x01ee
            return
        L_0x01ee:
            boolean r1 = r0.f2301d
            if (r1 == 0) goto L_0x0219
            e.y[] r1 = f2265m0
            int r3 = r0.f2275G
            r1 = r1[r3]
            byte r1 = r1.f1106d
            if (r1 != r2) goto L_0x0218
            int r1 = r0.f2293Y
            int r1 = r1 + r4
            r0.f2293Y = r1
            int r1 = r0.f2291W
            int r1 = r1 + r4
            r0.f2291W = r1
            int r2 = r0.f2292X
            boolean r3 = r0.f2290V
            if (r3 != 0) goto L_0x020d
            r10 = 1
        L_0x020d:
            int r2 = r2 + r10
            r0.f2292X = r2
            if (r1 != r5) goto L_0x0218
            r0.f2291W = r8
            r1 = r3 ^ 1
            r0.f2290V = r1
        L_0x0218:
            return
        L_0x0219:
            r0.f2330x = r8
            r19.mo327K()
            goto L_0x0333
        L_0x0220:
            int r1 = r0.f2309h
            if (r1 == 0) goto L_0x0225
            return
        L_0x0225:
            boolean r1 = r0.f2316k0
            if (r1 == 0) goto L_0x022a
            return
        L_0x022a:
            boolean r1 = r0.f2318l0
            if (r1 == 0) goto L_0x022f
            return
        L_0x022f:
            boolean r1 = r0.f2301d
            if (r1 == 0) goto L_0x0234
            return
        L_0x0234:
            r0.f2330x = r8
            int r1 = r0.f2322p
            int r1 = r1 + r4
            r0.f2322p = r1
            int r2 = r0.f2331y
            int r2 = r2 % r3
            int r2 = r2 + 40
            if (r1 <= r2) goto L_0x0333
            int r1 = r0.f2317l
            int r1 = r1 - r7
            r0.f2317l = r1
            r0.f2321o = r3
            r0.f2322p = r8
            goto L_0x0333
        L_0x024d:
            int r1 = r0.f2309h
            if (r1 == 0) goto L_0x0252
            return
        L_0x0252:
            boolean r1 = r0.f2316k0
            if (r1 == 0) goto L_0x0257
            return
        L_0x0257:
            boolean r1 = r0.f2318l0
            if (r1 == 0) goto L_0x025c
            return
        L_0x025c:
            boolean r1 = r0.f2301d
            if (r1 == 0) goto L_0x0261
            return
        L_0x0261:
            r19.mo326I()
            goto L_0x0333
        L_0x0266:
            int r1 = r0.f2309h
            if (r1 == 0) goto L_0x026b
            return
        L_0x026b:
            boolean r1 = r0.f2301d
            if (r1 == 0) goto L_0x0270
            return
        L_0x0270:
            boolean r1 = r0.f2316k0
            if (r1 == 0) goto L_0x0275
            return
        L_0x0275:
            boolean r1 = r0.f2318l0
            if (r1 == 0) goto L_0x027a
            return
        L_0x027a:
            r0.f2330x = r8
            r19.m1049J()
            goto L_0x0333
        L_0x0281:
            r0.f2269A = r8
            r0.f2271C = r8
            r0.f2272D = r8
            int r1 = r0.f2317l
            int r3 = r0.f2322p
            int r1 = r1 + r3
            r0.f2317l = r1
            int r1 = p018i.C0145a.f2600O
            int r1 = r1 % r7
            if (r1 != 0) goto L_0x029f
            int r1 = r0.f2323q
            if (r1 <= r4) goto L_0x029b
            int r1 = r1 - r4
        L_0x0298:
            r0.f2323q = r1
            goto L_0x029f
        L_0x029b:
            if (r1 >= r10) goto L_0x029f
            int r1 = r1 + r4
            goto L_0x0298
        L_0x029f:
            int r1 = r0.f2315k
            int r3 = r0.f2323q
            int r1 = r1 + r3
            r0.f2315k = r1
            boolean r1 = r19.mo600t()
            if (r1 == 0) goto L_0x02b7
            int[] r1 = r0.f2304e0
            int r3 = p018i.C0145a.f2600O
            int r5 = r1.length
            int r3 = r3 % r5
            r1 = r1[r3]
            r0.f2289U = r1
            goto L_0x02c8
        L_0x02b7:
            boolean r1 = r19.mo599s()
            if (r1 == 0) goto L_0x02c0
        L_0x02bd:
            r0.f2289U = r9
            goto L_0x02c8
        L_0x02c0:
            boolean r1 = r19.mo337v()
            if (r1 == 0) goto L_0x02bd
            r0.f2289U = r6
        L_0x02c8:
            boolean r1 = r0.f2273E
            if (r1 == 0) goto L_0x0306
            r0.f2273E = r8
            boolean r1 = r0.f2282N
            if (r1 == 0) goto L_0x02f1
            r1 = 0
        L_0x02d3:
            k.i r2 = p013g.C0126k.f1920V1
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x02f1
            k.i r2 = p013g.C0126k.f1920V1
            java.lang.Object r2 = r2.elementAt(r1)
            g.v r2 = (p013g.C0137v) r2
            int r2 = r2.f2331y
            int r3 = r0.f2331y
            if (r2 != r3) goto L_0x02ee
            k.i r2 = p013g.C0126k.f1920V1
            r2.removeElementAt(r1)
        L_0x02ee:
            int r1 = r1 + 1
            goto L_0x02d3
        L_0x02f1:
            r0.f2322p = r8
            r0.f2323q = r8
            r0.f2317l = r8
            r0.f2315k = r8
            e.y r1 = r19.mo597p()
            int r1 = r1.f1107e
            r0.f2311i = r1
            r0.f2321o = r8
            r0.f2330x = r8
            return
        L_0x0306:
            int r1 = r0.f2315k
            int r3 = r0.f2317l
            int r1 = p013g.C0121h0.m842v(r1, r3)
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0323
            int r1 = r0.f2322p
            if (r1 <= r2) goto L_0x0317
            r1 = -4
            goto L_0x0318
        L_0x0317:
            int r1 = -r1
        L_0x0318:
            r0.f2322p = r1
            int r1 = r0.f2324r
            if (r1 != 0) goto L_0x0328
            r1 = 16
            r0.f2324r = r1
            goto L_0x0328
        L_0x0323:
            int r1 = r0.f2322p
            int r1 = r1 + r4
            r0.f2322p = r1
        L_0x0328:
            int r1 = r0.f2324r
            if (r1 <= 0) goto L_0x0333
            int r1 = r1 - r4
            r0.f2324r = r1
            if (r1 != 0) goto L_0x0333
            r0.f2273E = r4
        L_0x0333:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0137v.mo325G():void");
    }

    /* renamed from: I */
    public void mo326I() {
        if (this.f2288T < 2) {
            mo333i(this.f2324r == 0 ? this.f2304e0 : this.f2306f0);
            int i = this.f2315k;
            int i2 = C0126k.f2028t1;
            if (i >= i2 && i <= i2 + C0145a.f2614V && this.f2324r == 0 && C0145a.f2600O % 2 == 0) {
                C0175k.m1563p().mo880j(false, 0.05f);
            }
        }
        int i3 = this.f2322p;
        int i4 = 1;
        if (i3 == 0) {
            C0114e eVar = this.f2276H;
            int i5 = eVar != null ? eVar.f1593n : this.f2312i0.f2315k;
            int i6 = eVar != null ? eVar.f1598o : this.f2312i0.f2317l;
            int i7 = this.f2315k;
            int i8 = this.f2325s;
            C0098y[] yVarArr = f2265m0;
            int i9 = this.f2275G;
            if (i7 > yVarArr[i9].f1104b + i8) {
                this.f2322p = 1;
            }
            if (i7 < i8 - yVarArr[i9].f1104b) {
                this.f2322p = 1;
            }
            if ((yVarArr[i9].f1106d == 4 || yVarArr[i9].f1106d == 5) && !this.f2269A) {
                int i10 = this.f2317l;
                this.f2317l = i10 + ((i6 - i10) / 20);
            }
            int i11 = this.f2323q + 1;
            this.f2323q = i11;
            if (i11 > 3 || this.f2322p == 1) {
                this.f2322p = 1;
                if (this.f2324r == 0) {
                    if (eVar != null) {
                        eVar.mo467z(this.f2277I, this.f2278J, false, true);
                    } else {
                        this.f2312i0.mo323E();
                    }
                } else if (eVar != null) {
                    C0019o.m91c(i7 + (this.f2319m * this.f2327u), this.f2317l, mo334j(), this.f2277I, this.f2278J, this.f2276H, mo597p().f1110h);
                } else {
                    C0114e eVar2 = new C0114e();
                    C0137v vVar = this.f2312i0;
                    eVar2.f1593n = vVar.f2315k;
                    eVar2.f1598o = vVar.f2317l;
                    eVar2.f1638w = -100;
                    C0019o.m91c(this.f2315k + (this.f2319m * this.f2327u), this.f2317l, mo334j(), this.f2277I, this.f2278J, eVar2, mo597p().f1110h);
                }
                this.f2296a0 = false;
            }
            if (this.f2315k >= i5) {
                i4 = -1;
            }
            this.f2319m = i4;
        } else if (i3 == 1) {
            if (f2265m0[this.f2275G].f1106d != 0 && !this.f2269A && !this.f2271C && !this.f2272D) {
                int i12 = this.f2315k;
                this.f2315k = i12 + ((this.f2325s - i12) / 4);
                int i13 = this.f2317l;
                this.f2317l = i13 + ((this.f2326t - i13) / 4);
            }
            if (C0111c0.m574a(this.f2325s - this.f2315k) < 5 && C0111c0.m574a(this.f2326t - this.f2317l) < 5 && this.f2288T == 2) {
                this.f2321o = 2;
                this.f2322p = 0;
                this.f2323q = 0;
                this.f2288T = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e A[Catch:{ Exception -> 0x01cd }] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo327K() {
        /*
            r13 = this;
            boolean r0 = r13.f2310h0     // Catch:{ Exception -> 0x01cd }
            r1 = 3
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0015
            r13.f2321o = r3     // Catch:{ Exception -> 0x01cd }
            g.e r0 = r13.f2308g0     // Catch:{ Exception -> 0x01cd }
            int r0 = r0.f1633v     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 << r1
            r13.f2323q = r0     // Catch:{ Exception -> 0x01cd }
            r0 = -5
            r13.f2322p = r0     // Catch:{ Exception -> 0x01cd }
            r13.f2324r = r2     // Catch:{ Exception -> 0x01cd }
        L_0x0015:
            boolean r0 = r13.f2271C     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            boolean r0 = r13.f2269A     // Catch:{ Exception -> 0x01cd }
            if (r0 != 0) goto L_0x01c8
            boolean r0 = r13.f2272D     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x0024
            goto L_0x01c8
        L_0x0024:
            e.y[] r0 = f2265m0     // Catch:{ Exception -> 0x01cd }
            int r4 = r13.f2275G     // Catch:{ Exception -> 0x01cd }
            r5 = r0[r4]     // Catch:{ Exception -> 0x01cd }
            byte r5 = r5.f1106d     // Catch:{ Exception -> 0x01cd }
            if (r5 == 0) goto L_0x01b4
            r6 = -1
            r7 = 20
            r8 = 2
            if (r5 == r3) goto L_0x011d
            if (r5 == r8) goto L_0x011d
            if (r5 == r1) goto L_0x011d
            r1 = 4
            if (r5 == r1) goto L_0x00ba
            r9 = 5
            if (r5 == r9) goto L_0x0040
            goto L_0x01cd
        L_0x0040:
            r0 = r0[r4]     // Catch:{ Exception -> 0x01cd }
            byte r0 = r0.f1105c     // Catch:{ Exception -> 0x01cd }
            int r5 = r13.f2331y     // Catch:{ Exception -> 0x01cd }
            int r10 = r5 % 2
            int r0 = r0 + r10
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x01cd }
            int r10 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            int r11 = r13.f2319m     // Catch:{ Exception -> 0x01cd }
            int r11 = r11 * r0
            int r10 = r10 + r11
            r13.f2315k = r10     // Catch:{ Exception -> 0x01cd }
            int r11 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r5 = r5 + r11
            int r5 = r5 % r8
            int r0 = r0 + r5
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x01cd }
            int r5 = r11 % 10
            if (r5 <= r8) goto L_0x0066
            int r5 = r13.f2317l     // Catch:{ Exception -> 0x01cd }
            int r12 = r13.f2320n     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 * r12
            int r5 = r5 + r0
            r13.f2317l = r5     // Catch:{ Exception -> 0x01cd }
        L_0x0066:
            int r0 = r13.f2325s     // Catch:{ Exception -> 0x01cd }
            e.y[] r5 = f2265m0     // Catch:{ Exception -> 0x01cd }
            r12 = r5[r4]     // Catch:{ Exception -> 0x01cd }
            byte r12 = r12.f1104b     // Catch:{ Exception -> 0x01cd }
            int r12 = r12 + r0
            if (r10 <= r12) goto L_0x007d
            r13.f2319m = r6     // Catch:{ Exception -> 0x01cd }
            r13.f2321o = r8     // Catch:{ Exception -> 0x01cd }
            int r0 = r11 % 20
        L_0x0077:
            int r0 = r0 + r7
            r13.f2314j0 = r0     // Catch:{ Exception -> 0x01cd }
            r13.f2322p = r2     // Catch:{ Exception -> 0x01cd }
            goto L_0x008b
        L_0x007d:
            r4 = r5[r4]     // Catch:{ Exception -> 0x01cd }
            byte r4 = r4.f1104b     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 - r4
            if (r10 >= r0) goto L_0x008b
            r13.f2319m = r3     // Catch:{ Exception -> 0x01cd }
            r13.f2321o = r8     // Catch:{ Exception -> 0x01cd }
            int r0 = r11 % 20
            goto L_0x0077
        L_0x008b:
            int r0 = r13.f2317l     // Catch:{ Exception -> 0x01cd }
            int r4 = r13.f2326t     // Catch:{ Exception -> 0x01cd }
            int r5 = r4 + 24
            if (r0 <= r5) goto L_0x0096
            r13.f2320n = r6     // Catch:{ Exception -> 0x01cd }
            goto L_0x009e
        L_0x0096:
            int r11 = r11 % 10
            int r11 = r11 + r7
            int r4 = r4 - r11
            if (r0 >= r4) goto L_0x009e
            r13.f2320n = r3     // Catch:{ Exception -> 0x01cd }
        L_0x009e:
            boolean r0 = p013g.C0121h0.m841u(r10, r0, r8)     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x01cd
            int r0 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 % 10
            if (r0 <= r9) goto L_0x00b6
            int r0 = r13.f2317l     // Catch:{ Exception -> 0x01cd }
            int r0 = p013g.C0121h0.m844x(r0)     // Catch:{ Exception -> 0x01cd }
            r13.f2317l = r0     // Catch:{ Exception -> 0x01cd }
            r13.f2321o = r1     // Catch:{ Exception -> 0x01cd }
            r13.f2322p = r2     // Catch:{ Exception -> 0x01cd }
        L_0x00b6:
            r13.f2320n = r6     // Catch:{ Exception -> 0x01cd }
            goto L_0x01cd
        L_0x00ba:
            r0 = r0[r4]     // Catch:{ Exception -> 0x01cd }
            byte r0 = r0.f1105c     // Catch:{ Exception -> 0x01cd }
            int r1 = r13.f2331y     // Catch:{ Exception -> 0x01cd }
            int r5 = r1 % 2
            int r0 = r0 + r5
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x01cd }
            int r5 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            int r9 = r13.f2319m     // Catch:{ Exception -> 0x01cd }
            int r9 = r9 * r0
            int r5 = r5 + r9
            r13.f2315k = r5     // Catch:{ Exception -> 0x01cd }
            int r9 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r10 = r9 % 10
            if (r10 <= r8) goto L_0x00dc
            int r10 = r13.f2317l     // Catch:{ Exception -> 0x01cd }
            int r11 = r13.f2320n     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 * r11
            int r10 = r10 + r0
            r13.f2317l = r10     // Catch:{ Exception -> 0x01cd }
        L_0x00dc:
            int r1 = r1 + r9
            int r1 = r1 % r8
            int r0 = r13.f2325s     // Catch:{ Exception -> 0x01cd }
            e.y[] r1 = f2265m0     // Catch:{ Exception -> 0x01cd }
            r10 = r1[r4]     // Catch:{ Exception -> 0x01cd }
            byte r10 = r10.f1104b     // Catch:{ Exception -> 0x01cd }
            int r10 = r10 + r0
            if (r5 <= r10) goto L_0x00f5
            r13.f2319m = r6     // Catch:{ Exception -> 0x01cd }
            r13.f2321o = r8     // Catch:{ Exception -> 0x01cd }
            int r0 = r9 % 20
        L_0x00ef:
            int r0 = r0 + r7
            r13.f2314j0 = r0     // Catch:{ Exception -> 0x01cd }
            r13.f2322p = r2     // Catch:{ Exception -> 0x01cd }
            goto L_0x0103
        L_0x00f5:
            r1 = r1[r4]     // Catch:{ Exception -> 0x01cd }
            byte r1 = r1.f1104b     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 - r1
            if (r5 >= r0) goto L_0x0103
            r13.f2319m = r3     // Catch:{ Exception -> 0x01cd }
            r13.f2321o = r8     // Catch:{ Exception -> 0x01cd }
            int r0 = r9 % 20
            goto L_0x00ef
        L_0x0103:
            int r0 = r13.f2317l     // Catch:{ Exception -> 0x01cd }
            int r1 = r13.f2326t     // Catch:{ Exception -> 0x01cd }
            int r2 = r1 + 24
            if (r0 <= r2) goto L_0x010e
            r13.f2320n = r6     // Catch:{ Exception -> 0x01cd }
            goto L_0x0116
        L_0x010e:
            int r9 = r9 % 10
            int r9 = r9 + r7
            int r1 = r1 - r9
            if (r0 >= r1) goto L_0x0116
            r13.f2320n = r3     // Catch:{ Exception -> 0x01cd }
        L_0x0116:
            int[] r0 = r13.f2300c0     // Catch:{ Exception -> 0x01cd }
            r13.mo333i(r0)     // Catch:{ Exception -> 0x01cd }
            goto L_0x01cd
        L_0x011d:
            r0 = r0[r4]     // Catch:{ Exception -> 0x01cd }
            byte r0 = r0.f1105c     // Catch:{ Exception -> 0x01cd }
            if (r0 != r3) goto L_0x012a
            int r1 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 % r8
            if (r1 != r3) goto L_0x013a
            goto L_0x01cd
        L_0x012a:
            if (r0 <= r8) goto L_0x0132
            int r1 = r13.f2331y     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 % r8
            int r0 = r0 + r1
        L_0x0130:
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x01cd }
            goto L_0x013a
        L_0x0132:
            int r1 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 % r8
            if (r1 != r3) goto L_0x013a
            int r0 = r0 + -1
            goto L_0x0130
        L_0x013a:
            int r1 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            int r2 = r13.f2319m     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 * r2
            int r1 = r1 + r0
            r13.f2315k = r1     // Catch:{ Exception -> 0x01cd }
            int r0 = r13.f2325s     // Catch:{ Exception -> 0x01cd }
            e.y[] r2 = f2265m0     // Catch:{ Exception -> 0x01cd }
            r5 = r2[r4]     // Catch:{ Exception -> 0x01cd }
            byte r5 = r5.f1104b     // Catch:{ Exception -> 0x01cd }
            int r5 = r5 + r0
            if (r1 <= r5) goto L_0x0151
            r13.f2319m = r6     // Catch:{ Exception -> 0x01cd }
            goto L_0x015a
        L_0x0151:
            r2 = r2[r4]     // Catch:{ Exception -> 0x01cd }
            byte r2 = r2.f1104b     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x015a
            r13.f2319m = r3     // Catch:{ Exception -> 0x01cd }
        L_0x015a:
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x01cd }
            int r0 = r0.f1593n     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 - r0
            int r0 = p013g.C0111c0.m574a(r1)     // Catch:{ Exception -> 0x01cd }
            r1 = 40
            if (r0 >= r1) goto L_0x01a5
            int r0 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            int r1 = r13.f2325s     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 - r1
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x01cd }
            e.y[] r1 = f2265m0     // Catch:{ Exception -> 0x01cd }
            int r2 = r13.f2275G     // Catch:{ Exception -> 0x01cd }
            r1 = r1[r2]     // Catch:{ Exception -> 0x01cd }
            byte r1 = r1.f1104b     // Catch:{ Exception -> 0x01cd }
            if (r0 >= r1) goto L_0x01a5
            int r0 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x01cd }
            int r1 = r1.f1593n     // Catch:{ Exception -> 0x01cd }
            if (r0 <= r1) goto L_0x0187
            r3 = -1
        L_0x0187:
            r13.f2319m = r3     // Catch:{ Exception -> 0x01cd }
            int r0 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x01cd }
            int r1 = r1.f1593n     // Catch:{ Exception -> 0x01cd }
            int r0 = r0 - r1
            int r0 = p013g.C0111c0.m574a(r0)     // Catch:{ Exception -> 0x01cd }
            if (r0 >= r7) goto L_0x01a1
            int r0 = r13.f2315k     // Catch:{ Exception -> 0x01cd }
            int r1 = r13.f2319m     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 * 10
            int r0 = r0 - r1
            r13.f2315k = r0     // Catch:{ Exception -> 0x01cd }
        L_0x01a1:
            r13.f2321o = r8     // Catch:{ Exception -> 0x01cd }
            r13.f2314j0 = r7     // Catch:{ Exception -> 0x01cd }
        L_0x01a5:
            int r0 = r13.f2327u     // Catch:{ Exception -> 0x01cd }
            r1 = 30
            if (r0 <= r1) goto L_0x01ae
            int[] r0 = r13.f2300c0     // Catch:{ Exception -> 0x01cd }
            goto L_0x01b0
        L_0x01ae:
            int[] r0 = r13.f2302d0     // Catch:{ Exception -> 0x01cd }
        L_0x01b0:
            r13.mo333i(r0)     // Catch:{ Exception -> 0x01cd }
            goto L_0x01cd
        L_0x01b4:
            boolean r0 = r13.mo600t()     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x01c5
            int[] r0 = r13.f2298b0     // Catch:{ Exception -> 0x01cd }
            int r1 = p018i.C0145a.f2600O     // Catch:{ Exception -> 0x01cd }
            int r2 = r0.length     // Catch:{ Exception -> 0x01cd }
            int r1 = r1 % r2
            r0 = r0[r1]     // Catch:{ Exception -> 0x01cd }
            r13.f2289U = r0     // Catch:{ Exception -> 0x01cd }
            goto L_0x01cd
        L_0x01c5:
            r13.f2289U = r2     // Catch:{ Exception -> 0x01cd }
            goto L_0x01cd
        L_0x01c8:
            int[] r0 = r13.f2298b0     // Catch:{ Exception -> 0x01cd }
            r13.mo333i(r0)     // Catch:{ Exception -> 0x01cd }
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0137v.mo327K():void");
    }

    /* renamed from: M */
    public void mo328M() {
        if (this.f2294Z == 0 && C0145a.f2600O % 25 == 0) {
            C0020p.m99g(114, this, 1);
        }
        if (this.f2294Z == 1 && C0145a.f2600O % 4 == 0) {
            C0020p.m99g(132, this, 1);
        }
        if (this.f2294Z == 2 && C0145a.f2600O % 7 == 0) {
            C0020p.m99g(131, this, 1);
        }
    }

    /* renamed from: a */
    public int mo174a() {
        return this.f2327u;
    }

    /* renamed from: b */
    public void mo175b() {
        if (this.f2321o == 5) {
            this.f2321o = 2;
            this.f2324r = 0;
            this.f2323q = 0;
            this.f2322p = 0;
            this.f2314j0 = 50;
        }
    }

    /* renamed from: c */
    public int mo176c() {
        return this.f2315k;
    }

    /* renamed from: d */
    public boolean mo177d() {
        int i = this.f2321o;
        return i == 0 || i == 1;
    }

    /* renamed from: e */
    public void mo332e(C0137v vVar) {
        this.f2312i0 = vVar;
        this.f2296a0 = true;
        this.f2276H = null;
        this.f2322p = 0;
        this.f2323q = 0;
        this.f2321o = 3;
        this.f2288T = 0;
        int i = vVar.f2315k;
        int i2 = this.f2315k;
        this.f2319m = i > i2 ? 1 : -1;
        int i3 = vVar.f2317l;
        if (C0111c0.m574a(i - i2) >= this.f2327u * 2 || C0111c0.m574a(i3 - this.f2317l) >= this.f2328v * 2) {
            this.f2324r = 1;
            return;
        }
        this.f2315k = this.f2315k < i ? i - this.f2327u : i + this.f2327u;
        this.f2324r = 0;
    }

    /* renamed from: f */
    public int mo178f() {
        return this.f2328v;
    }

    /* renamed from: g */
    public int mo179g() {
        return this.f2317l;
    }

    /* renamed from: h */
    public void mo595h() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C0098y[] yVarArr = f2265m0;
            if (i2 >= yVarArr.length) {
                break;
            }
            if (yVarArr[i2].f1109g != null) {
                i3++;
            }
            i2++;
        }
        if (i3 >= 10) {
            while (true) {
                C0098y[] yVarArr2 = f2265m0;
                if (i < yVarArr2.length) {
                    if (yVarArr2[i].f1109g != null && i3 > 5) {
                        yVarArr2[i].f1109g = null;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public void mo333i(int[] iArr) {
        int i = this.f2288T + 1;
        this.f2288T = i;
        if (i > iArr.length - 1) {
            this.f2288T = 0;
        }
        this.f2289U = iArr[this.f2288T];
    }

    /* renamed from: j */
    public boolean mo334j() {
        return this.f2281M || this.f2280L > 0;
    }

    /* renamed from: k */
    public void mo335k() {
        this.f2295a = false;
    }

    /* renamed from: o */
    public void mo596o() {
        C0098y[] yVarArr = f2265m0;
        int i = this.f2275G;
        if (yVarArr[i].f1109g == null) {
            yVarArr[i].f1109g = new C0010f();
            String str = "/Mob/" + this.f2275G;
            if ("".getClass().getResourceAsStream(str) != null) {
                f2265m0[this.f2275G].f1109g.mo25d(str + "/data");
                f2265m0[this.f2275G].f1109g.f153a = C0161h.m1494l(str + "/img.png");
            } else {
                C0105d.m365M().mo215C0(this.f2275G);
            }
            f2266n0.addElement(this.f2275G + "");
            return;
        }
        this.f2327u = yVarArr[i].f1109g.f158f;
        this.f2328v = yVarArr[i].f1109g.f159g;
    }

    /* renamed from: p */
    public C0098y mo597p() {
        return f2265m0[this.f2275G];
    }

    /* renamed from: q */
    public boolean mo598q() {
        return (this instanceof C0106a) || (this instanceof C0110c) || (this instanceof C0112d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo599s() {
        return this.f2275G >= 73 && !mo600t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo600t() {
        return this.f2275G == 76;
    }

    /* renamed from: u */
    public boolean mo336u() {
        int i;
        int i2;
        int i3 = this.f2315k;
        int i4 = C0126k.f2028t1;
        if (i3 < i4 || i3 > i4 + C0126k.f1975i1 || (i = this.f2317l) < (i2 = C0126k.f2032u1) || i > i2 + C0126k.f1980j1 + 30) {
            return false;
        }
        C0098y[] yVarArr = f2265m0;
        int i5 = this.f2275G;
        return (yVarArr[i5] == null || yVarArr[i5].f1109g == null || yVarArr[i5].f1109g.f153a == null || this.f2321o == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo337v() {
        int i = this.f2275G;
        return (i >= 58 && i <= 65) || i == 67 || i == 68;
    }

    /* renamed from: w */
    public boolean mo338w() {
        C0098y[] yVarArr = f2265m0;
        int i = this.f2275G;
        return (yVarArr[i] == null || yVarArr[i].f1109g == null || this.f2321o == 0) ? false : true;
    }

    /* renamed from: x */
    public void mo339x(C0159f fVar) {
        if (this.f2287S && this.f2321o != 0) {
            m1055y(fVar);
        }
        if (mo336u()) {
            if (this.f2321o != 1 || this.f2324r <= 0 || C0145a.f2600O % 3 != 0) {
                int i = 0;
                fVar.mo773E(0, C0145a.f2595L0);
                if (!this.f2295a) {
                    f2265m0[this.f2275G].f1109g.mo23b(fVar, this.f2289U, this.f2315k, this.f2292X + this.f2317l, this.f2319m == 1 ? 0 : 1, 2);
                } else {
                    C0174j.m1555c(fVar, this.f2297b, this.f2315k, (this.f2317l + this.f2292X) - 14, 0, 3);
                }
                fVar.mo773E(0, -C0145a.f2595L0);
                if (C0114e.m647e0().f1452L0 != null && C0114e.m647e0().f1452L0.equals(this) && this.f2321o != 1) {
                    int i2 = (((int) ((((long) this.f2311i) * 100) / ((long) this.f2313j))) / 10) - 1;
                    if (i2 >= 0) {
                        i = i2;
                    }
                    if (i > 9) {
                        i = 9;
                    }
                    fVar.mo779h(f2268p0, 0, (9 - i) * 6, 9, 6, 0, this.f2315k, (this.f2317l - this.f2328v) - 10, 3);
                }
            }
        }
    }

    /* renamed from: z */
    public void mo340z() {
        this.f2316k0 = false;
    }
}
