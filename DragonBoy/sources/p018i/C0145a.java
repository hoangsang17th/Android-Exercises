package p018i;

import android.content.Context;
import java.lang.reflect.Array;
import java.util.Random;
import p000a.C0002c;
import p001b.C0005a;
import p001b.C0006b;
import p001b.C0007c;
import p001b.C0008d;
import p001b.C0009e;
import p001b.C0012h;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0059e0;
import p011e.C0067i0;
import p011e.C0070k;
import p011e.C0071k0;
import p011e.C0072l;
import p012f.C0103b;
import p013g.C0109b0;
import p013g.C0111c0;
import p013g.C0113d0;
import p013g.C0114e;
import p013g.C0117f0;
import p013g.C0119g0;
import p013g.C0120h;
import p013g.C0121h0;
import p013g.C0122i;
import p013g.C0126k;
import p013g.C0130o;
import p013g.C0134s;
import p013g.C0136u;
import p013g.C0139x;
import p013g.C0140y;
import p014h.p015a.p016a.C0142a;
import p014h.p015a.p016a.C0143b;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0157e;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0167c;
import p020k.C0170f;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: i.a */
public class C0145a extends C0157e implements C0072l {

    /* renamed from: A */
    public static C0145a f2572A = null;

    /* renamed from: A0 */
    public static int[] f2573A0 = null;

    /* renamed from: B */
    public static boolean[] f2574B = new boolean[14];

    /* renamed from: B0 */
    public static int[] f2575B0 = null;

    /* renamed from: C */
    public static boolean[] f2576C = new boolean[14];

    /* renamed from: C0 */
    public static int f2577C0 = 0;

    /* renamed from: D */
    public static boolean f2578D = false;

    /* renamed from: D0 */
    public static int f2579D0 = 0;

    /* renamed from: E */
    public static boolean f2580E = false;

    /* renamed from: E0 */
    public static int[] f2581E0 = null;

    /* renamed from: F */
    public static boolean f2582F = false;

    /* renamed from: F0 */
    public static int[] f2583F0 = null;

    /* renamed from: G */
    public static boolean f2584G = false;

    /* renamed from: G0 */
    public static int[] f2585G0 = null;

    /* renamed from: H */
    public static int f2586H = 0;

    /* renamed from: H0 */
    public static boolean f2587H0 = false;

    /* renamed from: I */
    public static int f2588I = 0;

    /* renamed from: I0 */
    public static boolean f2589I0 = false;

    /* renamed from: J */
    public static int f2590J = 0;

    /* renamed from: J0 */
    public static int f2591J0 = 0;

    /* renamed from: K */
    public static int f2592K = 0;

    /* renamed from: K0 */
    public static int f2593K0 = -1;

    /* renamed from: L */
    public static int f2594L = 0;

    /* renamed from: L0 */
    public static int f2595L0 = 0;

    /* renamed from: M */
    public static int f2596M = 0;

    /* renamed from: M0 */
    public static int[] f2597M0 = new int[5];

    /* renamed from: N */
    public static C0071k0[] f2598N = new C0071k0[4];

    /* renamed from: N0 */
    public static int[] f2599N0 = null;

    /* renamed from: O */
    public static int f2600O = 0;

    /* renamed from: O0 */
    public static int[] f2601O0 = null;

    /* renamed from: P */
    public static int f2602P = 0;

    /* renamed from: P0 */
    public static int f2603P0 = 0;

    /* renamed from: Q */
    public static int f2604Q = 0;

    /* renamed from: Q0 */
    public static int[] f2605Q0 = {1, 4, 11};

    /* renamed from: R */
    public static boolean f2606R = false;

    /* renamed from: R0 */
    public static C0143b f2607R0 = null;

    /* renamed from: S */
    public static boolean f2608S = false;

    /* renamed from: S0 */
    public static C0143b f2609S0 = null;

    /* renamed from: T */
    public static long f2610T = 0;

    /* renamed from: T0 */
    public static boolean f2611T0 = false;

    /* renamed from: U */
    public static long f2612U = 0;

    /* renamed from: U0 */
    static long f2613U0 = 0;

    /* renamed from: V */
    public static int f2614V = 0;

    /* renamed from: V0 */
    public static int f2615V0 = 0;

    /* renamed from: W */
    public static int f2616W = 0;

    /* renamed from: W0 */
    public static C0143b f2617W0 = null;

    /* renamed from: X0 */
    public static int f2618X0 = 0;

    /* renamed from: Y0 */
    public static int f2619Y0 = 0;

    /* renamed from: Z0 */
    public static int f2620Z0 = 0;

    /* renamed from: a0 */
    public static int f2621a0 = 0;

    /* renamed from: a1 */
    public static C0173i f2622a1 = new C0173i("");

    /* renamed from: b0 */
    public static int f2623b0 = 0;

    /* renamed from: b1 */
    public static boolean f2624b1 = false;

    /* renamed from: c0 */
    public static C0178n f2625c0 = null;

    /* renamed from: c1 */
    public static int[] f2626c1 = null;

    /* renamed from: d0 */
    public static C0136u f2627d0 = null;

    /* renamed from: d1 */
    public static C0143b[] f2628d1 = null;

    /* renamed from: e0 */
    public static C0140y f2629e0 = null;

    /* renamed from: e1 */
    public static C0143b f2630e1 = null;

    /* renamed from: f0 */
    public static C0140y f2631f0 = null;

    /* renamed from: f1 */
    public static C0143b[][] f2632f1 = null;

    /* renamed from: g0 */
    public static C0170f f2633g0 = null;

    /* renamed from: g1 */
    public static boolean f2634g1 = false;

    /* renamed from: h0 */
    public static C0109b0 f2635h0 = null;

    /* renamed from: h1 */
    public static boolean f2636h1 = true;

    /* renamed from: i0 */
    public static C0122i f2637i0 = null;

    /* renamed from: i1 */
    public static C0113d0 f2638i1 = null;

    /* renamed from: j0 */
    public static C0139x f2639j0 = null;

    /* renamed from: j1 */
    public static boolean f2640j1 = false;

    /* renamed from: k0 */
    public static C0134s f2641k0 = null;

    /* renamed from: l0 */
    public static C0059e0 f2642l0 = null;

    /* renamed from: m0 */
    public static C0143b[] f2643m0 = null;

    /* renamed from: n0 */
    public static int f2644n0 = 0;

    /* renamed from: o0 */
    public static int f2645o0 = 0;

    /* renamed from: p0 */
    public static int[] f2646p0 = null;

    /* renamed from: q0 */
    public static int[] f2647q0 = null;

    /* renamed from: r0 */
    public static C0143b[] f2648r0 = new C0143b[7];

    /* renamed from: s */
    public static boolean f2649s = false;

    /* renamed from: s0 */
    public static C0143b[] f2650s0 = new C0143b[7];

    /* renamed from: t */
    public static boolean f2651t = false;

    /* renamed from: t0 */
    public static C0173i f2652t0 = null;

    /* renamed from: u */
    public static long f2653u = 0;

    /* renamed from: u0 */
    public static C0173i f2654u0 = null;

    /* renamed from: v */
    public static boolean f2655v = true;

    /* renamed from: v0 */
    public static C0173i f2656v0 = null;

    /* renamed from: w */
    public static boolean f2657w = false;

    /* renamed from: w0 */
    public static boolean f2658w0 = false;

    /* renamed from: x */
    public static boolean f2659x = false;

    /* renamed from: x0 */
    public static C0143b f2660x0;

    /* renamed from: y */
    public static boolean f2661y;

    /* renamed from: y0 */
    public static C0143b f2662y0;

    /* renamed from: z */
    public static boolean f2663z;

    /* renamed from: z0 */
    public static C0143b[] f2664z0 = new C0143b[3];

    /* renamed from: k */
    public C0159f f2665k = new C0159f();

    /* renamed from: l */
    int f2666l = 0;

    /* renamed from: m */
    long f2667m = (System.currentTimeMillis() + 1000);

    /* renamed from: n */
    long f2668n = (System.currentTimeMillis() + 1000);

    /* renamed from: o */
    public int[] f2669o;

    /* renamed from: p */
    public int[] f2670p;

    /* renamed from: q */
    public int[] f2671q;

    /* renamed from: r */
    public boolean f2672r;

    static {
        new C0173i("vFlyText");
        new Random();
    }

    public C0145a() {
        mo735z();
    }

    public C0145a(Context context) {
        super(context);
        mo735z();
    }

    /* renamed from: B */
    public static boolean m1332B() {
        return true;
    }

    /* renamed from: C */
    public static boolean m1333C() {
        return C0159f.f2750b > 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r3 = p013g.C0126k.f2032u1;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1334D(int r3, int r4) {
        /*
            int r0 = p013g.C0126k.f2028t1
            r1 = 0
            if (r3 >= r0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = p013g.C0126k.f1975i1
            int r0 = r0 + r2
            if (r3 <= r0) goto L_0x000c
            return r1
        L_0x000c:
            int r3 = p013g.C0126k.f2032u1
            if (r4 >= r3) goto L_0x0011
            return r1
        L_0x0011:
            int r0 = p013g.C0126k.f1980j1
            int r3 = r3 + r0
            int r3 = r3 + 30
            if (r4 <= r3) goto L_0x0019
            return r1
        L_0x0019:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.m1334D(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r0 = f2586H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r2 = f2588I;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1335E(int r2, int r3, int r4, int r5) {
        /*
            boolean r0 = f2578D
            r1 = 0
            if (r0 != 0) goto L_0x000a
            boolean r0 = f2582F
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = f2586H
            if (r0 < r2) goto L_0x001a
            int r2 = r2 + r4
            if (r0 > r2) goto L_0x001a
            int r2 = f2588I
            if (r2 < r3) goto L_0x001a
            int r3 = r3 + r5
            if (r2 > r3) goto L_0x001a
            r2 = 1
            return r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.m1335E(int, int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r0 = f2586H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r2 = f2588I;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1336F(int r2, int r3, int r4, int r5) {
        /*
            boolean r0 = f2578D
            r1 = 0
            if (r0 != 0) goto L_0x000a
            boolean r0 = f2582F
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = f2586H
            if (r0 < r2) goto L_0x001a
            int r2 = r2 + r4
            if (r0 > r2) goto L_0x001a
            int r2 = f2588I
            if (r2 < r3) goto L_0x001a
            int r3 = r3 + r5
            if (r2 > r3) goto L_0x001a
            r2 = 1
            return r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.m1336F(int, int, int, int):boolean");
    }

    /* renamed from: G */
    public static boolean m1337G() {
        if (C0130o.f2161a) {
            return true;
        }
        C0139x xVar = f2639j0;
        return (xVar != null && xVar.f2342d.equals(C0057d1.f724s0)) || C0114e.f1394y4 || C0170f.f2805J;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0575, code lost:
        if (p013g.C0121h0.f1803v >= 90) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0577, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun9");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0583, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0585, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0587, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0598, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun10");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x05b4, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x05b7, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05c8, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = (r0 / 2) - 30;
        r1 = f2597M0;
        f2579D0 = r1[3] + 60;
        r0 = r0 / 2;
        r0 = r1[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x05ef, code lost:
        if (r0 != 9) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x05f1, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun11");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x05fd, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x05ff, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0601, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0612, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun12");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x062e, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0631, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0642, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = r0 - (r0 / 3);
        r0 = f2597M0;
        f2579D0 = r0[4] + 20;
        r0 = r0[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0667, code lost:
        if (r0 != 10) goto L_0x06dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0669, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun13");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0675, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0677, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0679, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x068a, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun14");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x06a6, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x06a9, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x06ba, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = r0 - (r0 / 3);
        r0 = f2597M0;
        f2579D0 = r0[1] - 30;
        r0 = r0[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x06df, code lost:
        if (r0 != 11) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x06e1, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun15");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x06ed, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x06ef, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x06f1, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0702, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/b113");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x071e, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0721, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0732, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        f2577C0 = (p013g.C0126k.f1975i1 / 2) - 30;
        f2579D0 = f2597M0[2] - 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0754, code lost:
        if (r0 != 12) goto L_0x076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0756, code lost:
        f2575B0 = new int[]{200, 170, 220, 150, 250};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x076d, code lost:
        f2660x0 = null;
        f2662y0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0772, code lost:
        f2658w0 = false;
        f2658w0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a8, code lost:
        f2603P0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c8, code lost:
        f2603P0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d6, code lost:
        f2603P0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f9, code lost:
        f2603P0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0158, code lost:
        f2644n0 = p013g.C0117f0.f1681g[f2593K0];
        r4 = f2603P0;
        f2643m0 = new p014h.p015a.p016a.C0143b[r4];
        f2646p0 = new int[r4];
        f2647q0 = new int[r4];
        f2601O0 = new int[r4];
        f2599N0 = new int[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017e, code lost:
        if (p013g.C0121h0.f1807z != 100) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        f2643m0[0] = p019j.C0161h.m1496n("/bg/b100.png");
        f2643m0[1] = p019j.C0161h.m1496n("/bg/b100.png");
        f2643m0[2] = p019j.C0161h.m1496n("/bg/b82-1.png");
        f2643m0[3] = p019j.C0161h.m1496n("/bg/b93.png");
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a5, code lost:
        r4 = f2603P0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a7, code lost:
        if (r1 >= r4) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01a9, code lost:
        r16 = f2643m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ad, code lost:
        if (r16[r1] == null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01af, code lost:
        r4 = new int[1];
        r16[r1].mo717g(r4, 0, 1, p019j.C0159f.m1453w(r16[r1]) / 2, 0, 1, 1);
        f2599N0[r1] = r4[0];
        r4 = new int[1];
        r16 = f2643m0;
        r16[r1].mo717g(r4, 0, 1, p019j.C0159f.m1453w(r16[r1]) / 2, p019j.C0159f.m1452v(f2643m0[r1]) - 1, 1, 1);
        f2601O0[r1] = r4[0];
        f2646p0[r1] = p019j.C0159f.m1451u(f2643m0[r1]);
        f2647q0[r1] = p019j.C0159f.m1450t(f2643m0[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0214, code lost:
        if (r4 <= 1) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0216, code lost:
        r16[r1] = p019j.C0161h.m1496n("/bg/b" + f2593K0 + "0.png");
        f2646p0[r1] = p019j.C0159f.m1451u(f2643m0[r1]);
        f2647q0[r1] = p019j.C0159f.m1450t(f2643m0[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x024a, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0250, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0253, code lost:
        if (r1 >= f2603P0) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0257, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0259, code lost:
        p013g.C0111c0.m584k("name= /bg/b" + f2593K0 + r1 + ".png");
        f2643m0[r1] = p019j.C0161h.m1496n("/bg/b" + f2593K0 + r1 + ".png");
        p013g.C0111c0.m584k("done");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x029a, code lost:
        p013g.C0111c0.m584k("link type= /bg/b" + f2593K0 + r1 + "-" + p013g.C0121h0.f1807z + ".png");
        f2643m0[r1] = p019j.C0161h.m1496n("/bg/b" + f2593K0 + r1 + "-" + p013g.C0121h0.f1807z + ".png");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02e5, code lost:
        r4 = f2643m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02e9, code lost:
        if (r4[r1] == null) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02eb, code lost:
        r12 = new int[1];
        r4[r1].mo717g(r12, 0, 1, p019j.C0159f.m1453w(r4[r1]) / 2, 0, 1, 1);
        f2599N0[r1] = r12[0];
        r4 = new int[1];
        r12 = f2643m0;
        r12[r1].mo717g(r4, 0, 1, p019j.C0159f.m1453w(r12[r1]) / 2, p019j.C0159f.m1452v(f2643m0[r1]) - 1, 1, 1);
        f2601O0[r1] = r4[0];
        f2646p0[r1] = p019j.C0159f.m1451u(f2643m0[r1]);
        f2647q0[r1] = p019j.C0159f.m1450t(f2643m0[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0352, code lost:
        if (f2603P0 <= 1) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0354, code lost:
        r4[r1] = p019j.C0161h.m1496n("/bg/b" + f2593K0 + "0.png");
        f2646p0[r1] = p019j.C0159f.m1451u(f2643m0[r1]);
        f2647q0[r1] = p019j.C0159f.m1450t(f2643m0[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0388, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x038e, code lost:
        m1369y(f2593K0);
        p013g.C0111c0.m584k("5");
        r4 = p013g.C0126k.f1975i1;
        f2573A0 = new int[]{(r4 / 2) - 40, (r4 / 2) + 40, (r4 / 2) - 100, (r4 / 2) - 80, (r4 / 2) - 120};
        f2575B0 = new int[]{130, 100, 150, 140, 80};
        r1 = f2593K0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03d1, code lost:
        if (r1 != 0) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x03d5, code lost:
        if (r1 != 2) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x03d7, code lost:
        f2660x0 = p019j.C0161h.m1496n("/bg/sun0.png");
        f2577C0 = (p013g.C0126k.f1975i1 / 2) + 50;
        f2579D0 = f2597M0[4] - 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x03f0, code lost:
        if (r1 != 4) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x03f2, code lost:
        f2660x0 = p019j.C0161h.m1496n("/bg/sun2.png");
        f2577C0 = (p013g.C0126k.f1975i1 / 2) + 30;
        f2579D0 = f2597M0[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0409, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x040b, code lost:
        if (r1 != 7) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0419, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x041b, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x041d, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x042e, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun4");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x044a, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x044d, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x045e, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = r0 - (r0 / 3);
        r0 = f2597M0;
        f2579D0 = r0[3] - 80;
        r0 = r0[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0481, code lost:
        if (r1 != 6) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0483, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun5");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x048f, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0491, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0493, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x04a4, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun6");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x04c0, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x04c3, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x04d4, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = r0 - (r0 / 3);
        r0 = f2597M0;
        f2579D0 = r0[4];
        r0 = r0[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04f5, code lost:
        if (r0 != 5) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x04f7, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0503, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0505, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0507, code lost:
        r1 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0518, code lost:
        r0.append(r1);
        r0.append(".png");
        f2660x0 = p019j.C0161h.m1496n(r0.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("/bg/sun7");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0534, code lost:
        if (p013g.C0121h0.f1807z != 0) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0537, code lost:
        r6 = "-" + p013g.C0121h0.f1807z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0548, code lost:
        r0.append(r6);
        r0.append(".png");
        f2662y0 = p019j.C0161h.m1496n(r0.toString());
        r0 = p013g.C0126k.f1975i1;
        f2577C0 = (r0 / 2) - 50;
        r1 = f2597M0;
        f2579D0 = r1[3] + 20;
        r0 = r0 / 2;
        r0 = r1[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x056f, code lost:
        if (r1 != 8) goto L_0x05ed;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1338H(int r26) {
        /*
            r0 = r26
            java.lang.String r1 = "/bg/b100.png"
            r2 = 1
            r3 = 0
            f2611T0 = r2     // Catch:{ Exception -> 0x0777 }
            int r4 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r5 = 12
            r6 = 100
            if (r4 != r5) goto L_0x0016
            int r4 = p013g.C0121h0.f1785d     // Catch:{ Exception -> 0x0777 }
            int r4 = r4 - r6
            p001b.C0005a.f65U = r4     // Catch:{ Exception -> 0x0777 }
            goto L_0x001c
        L_0x0016:
            int r4 = p013g.C0121h0.f1785d     // Catch:{ Exception -> 0x0777 }
            int r4 = r4 + -160
            p001b.C0005a.f65U = r4     // Catch:{ Exception -> 0x0777 }
        L_0x001c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r4.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r7 = "load bg id= "
            r4.append(r7)     // Catch:{ Exception -> 0x0777 }
            r4.append(r0)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r7 = "map ID= "
            r4.append(r7)     // Catch:{ Exception -> 0x0777 }
            int r7 = p013g.C0121h0.f1803v     // Catch:{ Exception -> 0x0777 }
            r4.append(r7)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0777 }
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0777 }
            p001b.C0005a.m10c()     // Catch:{ Exception -> 0x0777 }
            m1344Q(r26)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1804w     // Catch:{ Exception -> 0x0777 }
            if (r4 != r0) goto L_0x004a
            int r4 = p013g.C0121h0.f1762A     // Catch:{ Exception -> 0x0777 }
            int r7 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r4 == r7) goto L_0x004d
        L_0x004a:
            r4 = -1
            if (r0 != r4) goto L_0x004e
        L_0x004d:
            return
        L_0x004e:
            f2595L0 = r5     // Catch:{ Exception -> 0x0777 }
            byte r7 = (byte) r0     // Catch:{ Exception -> 0x0777 }
            p013g.C0121h0.f1804w = r7     // Catch:{ Exception -> 0x0777 }
            int r7 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x0777 }
            p013g.C0121h0.f1762A = r7     // Catch:{ Exception -> 0x0777 }
            r7 = 5
            int[] r8 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r8[r3] = r2     // Catch:{ Exception -> 0x0777 }
            r9 = 2
            r8[r2] = r9     // Catch:{ Exception -> 0x0777 }
            r10 = 3
            r8[r9] = r10     // Catch:{ Exception -> 0x0777 }
            r11 = 7
            r8[r10] = r11     // Catch:{ Exception -> 0x0777 }
            r12 = 8
            r13 = 4
            r8[r13] = r12     // Catch:{ Exception -> 0x0777 }
            f2581E0 = r8     // Catch:{ Exception -> 0x0777 }
            int[] r8 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r8[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2583F0 = r8     // Catch:{ Exception -> 0x0777 }
            int[] r8 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r8[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r8[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2585G0 = r8     // Catch:{ Exception -> 0x0777 }
            f2593K0 = r0     // Catch:{ Exception -> 0x0777 }
            f2587H0 = r3     // Catch:{ Exception -> 0x0777 }
            int r8 = p013g.C0126k.f2032u1     // Catch:{ Exception -> 0x0777 }
            p013g.C0126k.f1926W3 = r8     // Catch:{ Exception -> 0x0777 }
            r8 = 0
            f2643m0 = r8     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r8     // Catch:{ Exception -> 0x0777 }
            f2607R0 = r8     // Catch:{ Exception -> 0x0777 }
            p013g.C0126k.f1926W3 = r4     // Catch:{ Exception -> 0x0777 }
            int r4 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r14 = 9
            switch(r4) {
                case 0: goto L_0x013c;
                case 1: goto L_0x0139;
                case 2: goto L_0x011c;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00da;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00a8;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ac;
                case 13: goto L_0x00a8;
                case 14: goto L_0x00a1;
                case 15: goto L_0x00a3;
                default: goto L_0x00a1;
            }     // Catch:{ Exception -> 0x0777 }
        L_0x00a1:
            goto L_0x0158
        L_0x00a3:
            java.lang.String r4 = "HELL"
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0777 }
        L_0x00a8:
            f2603P0 = r9     // Catch:{ Exception -> 0x0777 }
            goto L_0x0158
        L_0x00ac:
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2583F0 = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r9     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2585G0 = r4     // Catch:{ Exception -> 0x0777 }
        L_0x00c8:
            f2603P0 = r10     // Catch:{ Exception -> 0x0777 }
            goto L_0x0158
        L_0x00cc:
            f2595L0 = r11     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2581E0     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            goto L_0x00c8
        L_0x00d3:
            p001b.C0005a.m8a(r14)     // Catch:{ Exception -> 0x0777 }
        L_0x00d6:
            f2603P0 = r13     // Catch:{ Exception -> 0x0777 }
            goto L_0x0158
        L_0x00da:
            f2595L0 = r12     // Catch:{ Exception -> 0x0777 }
            goto L_0x00d6
        L_0x00dd:
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2583F0 = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r9     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2585G0 = r4     // Catch:{ Exception -> 0x0777 }
        L_0x00f9:
            f2603P0 = r7     // Catch:{ Exception -> 0x0777 }
            goto L_0x0158
        L_0x00fc:
            p001b.C0005a.m8a(r10)     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2583F0 = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2585G0 = r4     // Catch:{ Exception -> 0x0777 }
            goto L_0x00d6
        L_0x011c:
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2583F0 = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r9     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0777 }
            r4[r13] = r3     // Catch:{ Exception -> 0x0777 }
            f2585G0 = r4     // Catch:{ Exception -> 0x0777 }
            goto L_0x00f9
        L_0x0139:
            f2595L0 = r11     // Catch:{ Exception -> 0x0777 }
            goto L_0x00d6
        L_0x013c:
            java.lang.String r4 = "/bg/caycot.png"
            h.a.a.b r4 = p019j.C0161h.m1496n(r4)     // Catch:{ Exception -> 0x0777 }
            f2607R0 = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r13]     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r2     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r10     // Catch:{ Exception -> 0x0777 }
            r4[r9] = r7     // Catch:{ Exception -> 0x0777 }
            r4[r10] = r11     // Catch:{ Exception -> 0x0777 }
            f2581E0 = r4     // Catch:{ Exception -> 0x0777 }
            f2603P0 = r13     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r4 != r9) goto L_0x0158
            f2595L0 = r12     // Catch:{ Exception -> 0x0777 }
        L_0x0158:
            int[] r4 = p013g.C0117f0.f1681g     // Catch:{ Exception -> 0x0777 }
            int r15 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r4 = r4[r15]     // Catch:{ Exception -> 0x0777 }
            f2644n0 = r4     // Catch:{ Exception -> 0x0777 }
            int r4 = f2603P0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r15 = new p014h.p015a.p016a.C0143b[r4]     // Catch:{ Exception -> 0x0777 }
            f2643m0 = r15     // Catch:{ Exception -> 0x0777 }
            int[] r15 = new int[r4]     // Catch:{ Exception -> 0x0777 }
            f2646p0 = r15     // Catch:{ Exception -> 0x0777 }
            int[] r15 = new int[r4]     // Catch:{ Exception -> 0x0777 }
            f2647q0 = r15     // Catch:{ Exception -> 0x0777 }
            int[] r15 = new int[r4]     // Catch:{ Exception -> 0x0777 }
            f2601O0 = r15     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0777 }
            f2599N0 = r4     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            java.lang.String r15 = "/bg/b"
            java.lang.String r8 = "-"
            java.lang.String r5 = ".png"
            if (r4 != r6) goto L_0x0250
            h.a.a.b[] r4 = f2643m0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r16 = p019j.C0161h.m1496n(r1)     // Catch:{ Exception -> 0x0777 }
            r4[r3] = r16     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r4 = f2643m0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r1 = p019j.C0161h.m1496n(r1)     // Catch:{ Exception -> 0x0777 }
            r4[r2] = r1     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r1 = f2643m0     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = "/bg/b82-1.png"
            h.a.a.b r4 = p019j.C0161h.m1496n(r4)     // Catch:{ Exception -> 0x0777 }
            r1[r9] = r4     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r1 = f2643m0     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = "/bg/b93.png"
            h.a.a.b r4 = p019j.C0161h.m1496n(r4)     // Catch:{ Exception -> 0x0777 }
            r1[r10] = r4     // Catch:{ Exception -> 0x0777 }
            r1 = 0
        L_0x01a5:
            int r4 = f2603P0     // Catch:{ Exception -> 0x0777 }
            if (r1 >= r4) goto L_0x038e
            h.a.a.b[] r16 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r17 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            if (r17 == 0) goto L_0x0214
            int[] r4 = new int[r2]     // Catch:{ Exception -> 0x0777 }
            r18 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            r20 = 0
            r21 = 1
            r16 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            int r16 = p019j.C0159f.m1453w(r16)     // Catch:{ Exception -> 0x0777 }
            int r22 = r16 / 2
            r23 = 0
            r24 = 1
            r25 = 1
            r19 = r4
            r18.mo717g(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0777 }
            int[] r16 = f2599N0     // Catch:{ Exception -> 0x0777 }
            r4 = r4[r3]     // Catch:{ Exception -> 0x0777 }
            r16[r1] = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r2]     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r16 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r17 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            r19 = 0
            r20 = 1
            r16 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            int r16 = p019j.C0159f.m1453w(r16)     // Catch:{ Exception -> 0x0777 }
            int r21 = r16 / 2
            h.a.a.b[] r16 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r16 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            int r16 = p019j.C0159f.m1452v(r16)     // Catch:{ Exception -> 0x0777 }
            int r22 = r16 + -1
            r23 = 1
            r24 = 1
            r18 = r4
            r17.mo717g(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0777 }
            int[] r16 = f2601O0     // Catch:{ Exception -> 0x0777 }
            r4 = r4[r3]     // Catch:{ Exception -> 0x0777 }
            r16[r1] = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2646p0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r16 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r16 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            int r16 = p019j.C0159f.m1451u(r16)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r16     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2647q0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r16 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r16 = r16[r1]     // Catch:{ Exception -> 0x0777 }
            int r16 = p019j.C0159f.m1450t(r16)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r16     // Catch:{ Exception -> 0x0777 }
            goto L_0x024a
        L_0x0214:
            if (r4 <= r2) goto L_0x024a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r4.<init>()     // Catch:{ Exception -> 0x0777 }
            r4.append(r15)     // Catch:{ Exception -> 0x0777 }
            int r14 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r4.append(r14)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r14 = "0.png"
            r4.append(r14)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r4 = p019j.C0161h.m1496n(r4)     // Catch:{ Exception -> 0x0777 }
            r16[r1] = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2646p0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r14 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r14 = r14[r1]     // Catch:{ Exception -> 0x0777 }
            int r14 = p019j.C0159f.m1451u(r14)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r14     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2647q0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r14 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r14 = r14[r1]     // Catch:{ Exception -> 0x0777 }
            int r14 = p019j.C0159f.m1450t(r14)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r14     // Catch:{ Exception -> 0x0777 }
        L_0x024a:
            int r1 = r1 + 1
            r14 = 9
            goto L_0x01a5
        L_0x0250:
            r1 = 0
        L_0x0251:
            int r4 = f2603P0     // Catch:{ Exception -> 0x0777 }
            if (r1 >= r4) goto L_0x038e
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r4 != 0) goto L_0x029a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r4.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r14 = "name= /bg/b"
            r4.append(r14)     // Catch:{ Exception -> 0x0777 }
            int r14 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r4.append(r14)     // Catch:{ Exception -> 0x0777 }
            r4.append(r1)     // Catch:{ Exception -> 0x0777 }
            r4.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0777 }
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r4 = f2643m0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r14.<init>()     // Catch:{ Exception -> 0x0777 }
            r14.append(r15)     // Catch:{ Exception -> 0x0777 }
            int r12 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r14.append(r12)     // Catch:{ Exception -> 0x0777 }
            r14.append(r1)     // Catch:{ Exception -> 0x0777 }
            r14.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r12 = r14.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r12 = p019j.C0161h.m1496n(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = "done"
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0777 }
            goto L_0x02e5
        L_0x029a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r4.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r12 = "link type= /bg/b"
            r4.append(r12)     // Catch:{ Exception -> 0x0777 }
            int r12 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r4.append(r12)     // Catch:{ Exception -> 0x0777 }
            r4.append(r1)     // Catch:{ Exception -> 0x0777 }
            r4.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r12 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r4.append(r12)     // Catch:{ Exception -> 0x0777 }
            r4.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0777 }
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r4 = f2643m0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r12.<init>()     // Catch:{ Exception -> 0x0777 }
            r12.append(r15)     // Catch:{ Exception -> 0x0777 }
            int r14 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r12.append(r14)     // Catch:{ Exception -> 0x0777 }
            r12.append(r1)     // Catch:{ Exception -> 0x0777 }
            r12.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r14 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r12.append(r14)     // Catch:{ Exception -> 0x0777 }
            r12.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r12 = p019j.C0161h.m1496n(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
        L_0x02e5:
            h.a.a.b[] r4 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r4[r1]     // Catch:{ Exception -> 0x0777 }
            if (r12 == 0) goto L_0x0350
            int[] r12 = new int[r2]     // Catch:{ Exception -> 0x0777 }
            r18 = r4[r1]     // Catch:{ Exception -> 0x0777 }
            r20 = 0
            r21 = 1
            r4 = r4[r1]     // Catch:{ Exception -> 0x0777 }
            int r4 = p019j.C0159f.m1453w(r4)     // Catch:{ Exception -> 0x0777 }
            int r22 = r4 / 2
            r23 = 0
            r24 = 1
            r25 = 1
            r19 = r12
            r18.mo717g(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2599N0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r3]     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            int[] r4 = new int[r2]     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r18 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            r20 = 0
            r21 = 1
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1453w(r12)     // Catch:{ Exception -> 0x0777 }
            int r22 = r12 / 2
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1452v(r12)     // Catch:{ Exception -> 0x0777 }
            int r23 = r12 + -1
            r24 = 1
            r25 = 1
            r19 = r4
            r18.mo717g(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0777 }
            int[] r12 = f2601O0     // Catch:{ Exception -> 0x0777 }
            r4 = r4[r3]     // Catch:{ Exception -> 0x0777 }
            r12[r1] = r4     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2646p0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1451u(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2647q0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1450t(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            goto L_0x0388
        L_0x0350:
            int r12 = f2603P0     // Catch:{ Exception -> 0x0777 }
            if (r12 <= r2) goto L_0x0388
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r12.<init>()     // Catch:{ Exception -> 0x0777 }
            r12.append(r15)     // Catch:{ Exception -> 0x0777 }
            int r14 = f2593K0     // Catch:{ Exception -> 0x0777 }
            r12.append(r14)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r14 = "0.png"
            r12.append(r14)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r12 = p019j.C0161h.m1496n(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2646p0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1451u(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
            int[] r4 = f2647q0     // Catch:{ Exception -> 0x0777 }
            h.a.a.b[] r12 = f2643m0     // Catch:{ Exception -> 0x0777 }
            r12 = r12[r1]     // Catch:{ Exception -> 0x0777 }
            int r12 = p019j.C0159f.m1450t(r12)     // Catch:{ Exception -> 0x0777 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0777 }
        L_0x0388:
            int r1 = r1 + 1
            r12 = 8
            goto L_0x0251
        L_0x038e:
            int r1 = f2593K0     // Catch:{ Exception -> 0x0777 }
            m1369y(r1)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "5"
            p013g.C0111c0.m584k(r1)     // Catch:{ Exception -> 0x0777 }
            int[] r1 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r12 = r4 / 2
            int r12 = r12 + -40
            r1[r3] = r12     // Catch:{ Exception -> 0x0777 }
            int r12 = r4 / 2
            int r12 = r12 + 40
            r1[r2] = r12     // Catch:{ Exception -> 0x0777 }
            int r12 = r4 / 2
            int r12 = r12 - r6
            r1[r9] = r12     // Catch:{ Exception -> 0x0777 }
            int r12 = r4 / 2
            r14 = 80
            int r12 = r12 - r14
            r1[r10] = r12     // Catch:{ Exception -> 0x0777 }
            int r4 = r4 / r9
            int r4 = r4 + -120
            r1[r13] = r4     // Catch:{ Exception -> 0x0777 }
            f2573A0 = r1     // Catch:{ Exception -> 0x0777 }
            int[] r1 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r4 = 130(0x82, float:1.82E-43)
            r1[r3] = r4     // Catch:{ Exception -> 0x0777 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0777 }
            r4 = 150(0x96, float:2.1E-43)
            r1[r9] = r4     // Catch:{ Exception -> 0x0777 }
            r6 = 140(0x8c, float:1.96E-43)
            r1[r10] = r6     // Catch:{ Exception -> 0x0777 }
            r1[r13] = r14     // Catch:{ Exception -> 0x0777 }
            f2575B0 = r1     // Catch:{ Exception -> 0x0777 }
            int r1 = f2593K0     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x03d5
            goto L_0x0772
        L_0x03d5:
            if (r1 != r9) goto L_0x03f0
            java.lang.String r0 = "/bg/sun0.png"
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 / r9
            int r0 = r0 + 50
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r13]     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 + -40
            f2579D0 = r0     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x03f0:
            if (r1 != r13) goto L_0x0409
            java.lang.String r0 = "/bg/sun2.png"
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 / r9
            int r0 = r0 + 30
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x0777 }
            f2579D0 = r0     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x0409:
            java.lang.String r6 = ""
            if (r1 != r11) goto L_0x0480
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun3"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x041d
            r1 = r6
            goto L_0x042e
        L_0x041d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x042e:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun4"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x044d
            goto L_0x045e
        L_0x044d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x045e:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 3
            int r0 = r0 - r1
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r1 = r0[r10]     // Catch:{ Exception -> 0x0777 }
            int r1 = r1 - r14
            f2579D0 = r1     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x0480:
            r11 = 6
            if (r1 != r11) goto L_0x04f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun5"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0493
            r1 = r6
            goto L_0x04a4
        L_0x0493:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x04a4:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun6"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x04c3
            goto L_0x04d4
        L_0x04c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x04d4:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 3
            int r0 = r0 - r1
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r1 = r0[r13]     // Catch:{ Exception -> 0x0777 }
            f2579D0 = r1     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r13]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x04f5:
            if (r0 != r7) goto L_0x056d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun8"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0507
            r1 = r6
            goto L_0x0518
        L_0x0507:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0518:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun7"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0537
            goto L_0x0548
        L_0x0537:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0548:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 2
            int r1 = r1 + -50
            f2577C0 = r1     // Catch:{ Exception -> 0x0777 }
            int[] r1 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r4 = r1[r10]     // Catch:{ Exception -> 0x0777 }
            int r4 = r4 + 20
            f2579D0 = r4     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 / r9
            r0 = r1[r10]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x056d:
            r11 = 8
            if (r1 != r11) goto L_0x05ed
            int r1 = p013g.C0121h0.f1803v     // Catch:{ Exception -> 0x0777 }
            r11 = 90
            if (r1 >= r11) goto L_0x05ed
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun9"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0587
            r1 = r6
            goto L_0x0598
        L_0x0587:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0598:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun10"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x05b7
            goto L_0x05c8
        L_0x05b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x05c8:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 2
            int r1 = r1 + -30
            f2577C0 = r1     // Catch:{ Exception -> 0x0777 }
            int[] r1 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r4 = r1[r10]     // Catch:{ Exception -> 0x0777 }
            int r4 = r4 + 60
            f2579D0 = r4     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 / r9
            r0 = r1[r10]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x05ed:
            r1 = 9
            if (r0 != r1) goto L_0x0665
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun11"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0601
            r1 = r6
            goto L_0x0612
        L_0x0601:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0612:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun12"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0631
            goto L_0x0642
        L_0x0631:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0642:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 3
            int r0 = r0 - r1
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r1 = r0[r13]     // Catch:{ Exception -> 0x0777 }
            int r1 = r1 + 20
            f2579D0 = r1     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r13]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x0665:
            r1 = 10
            if (r0 != r1) goto L_0x06dd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun13"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0679
            r1 = r6
            goto L_0x068a
        L_0x0679:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x068a:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun14"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x06a9
            goto L_0x06ba
        L_0x06a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x06ba:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r1 = r0 / 3
            int r0 = r0 - r1
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r1 = r0[r2]     // Catch:{ Exception -> 0x0777 }
            int r1 = r1 + -30
            f2579D0 = r1     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r2]     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x06dd:
            r1 = 11
            if (r0 != r1) goto L_0x0752
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/sun15"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x06f1
            r1 = r6
            goto L_0x0702
        L_0x06f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0702:
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r0.<init>()     // Catch:{ Exception -> 0x0777 }
            java.lang.String r1 = "/bg/b113"
            r0.append(r1)     // Catch:{ Exception -> 0x0777 }
            int r1 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            if (r1 != 0) goto L_0x0721
            goto L_0x0732
        L_0x0721:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777 }
            r1.<init>()     // Catch:{ Exception -> 0x0777 }
            r1.append(r8)     // Catch:{ Exception -> 0x0777 }
            int r4 = p013g.C0121h0.f1807z     // Catch:{ Exception -> 0x0777 }
            r1.append(r4)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0777 }
        L_0x0732:
            r0.append(r6)     // Catch:{ Exception -> 0x0777 }
            r0.append(r5)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0777 }
            h.a.a.b r0 = p019j.C0161h.m1496n(r0)     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
            int r0 = p013g.C0126k.f1975i1     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 / r9
            int r0 = r0 + -30
            f2577C0 = r0     // Catch:{ Exception -> 0x0777 }
            int[] r0 = f2597M0     // Catch:{ Exception -> 0x0777 }
            r0 = r0[r9]     // Catch:{ Exception -> 0x0777 }
            int r0 = r0 + -30
            f2579D0 = r0     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x0752:
            r1 = 12
            if (r0 != r1) goto L_0x076d
            int[] r0 = new int[r7]     // Catch:{ Exception -> 0x0777 }
            r1 = 200(0xc8, float:2.8E-43)
            r0[r3] = r1     // Catch:{ Exception -> 0x0777 }
            r1 = 170(0xaa, float:2.38E-43)
            r0[r2] = r1     // Catch:{ Exception -> 0x0777 }
            r1 = 220(0xdc, float:3.08E-43)
            r0[r9] = r1     // Catch:{ Exception -> 0x0777 }
            r0[r10] = r4     // Catch:{ Exception -> 0x0777 }
            r1 = 250(0xfa, float:3.5E-43)
            r0[r13] = r1     // Catch:{ Exception -> 0x0777 }
            f2575B0 = r0     // Catch:{ Exception -> 0x0777 }
            goto L_0x0772
        L_0x076d:
            r0 = 0
            f2660x0 = r0     // Catch:{ Exception -> 0x0777 }
            f2662y0 = r0     // Catch:{ Exception -> 0x0777 }
        L_0x0772:
            f2658w0 = r3     // Catch:{ Exception -> 0x0777 }
            f2658w0 = r2     // Catch:{ Exception -> 0x0777 }
            goto L_0x0779
        L_0x0777:
            f2611T0 = r3
        L_0x0779:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.m1338H(int):void");
    }

    /* renamed from: K */
    public static boolean m1339K() {
        if (C0159f.f2750b <= 1 || !f2651t) {
            return f2649s;
        }
        return false;
    }

    /* renamed from: L */
    public static void m1340L(C0159f fVar) {
        int i;
        int i2;
        int i3;
        C0159f fVar2 = fVar;
        if (!f2611T0) {
            fVar2.mo772D(0);
            fVar2.mo783l(0, 0, f2614V, f2616W);
        }
        if (!C0114e.f1394y4) {
            int i4 = C0126k.f1975i1;
            int i5 = C0126k.f1980j1;
            fVar2.mo773E(-fVar.mo791x(), -fVar.mo792y());
            if (!f2658w0 || f2649s) {
                fVar2.mo772D(2315859);
                fVar2.mo783l(0, 0, f2614V, f2616W);
                if (f2609S0 != null) {
                    for (int i6 = -((C0126k.f2028t1 >> 2) % C0159f.m1451u(f2609S0)); i6 < C0126k.f1975i1; i6 += C0159f.m1451u(f2609S0)) {
                        fVar2.mo776e(f2609S0, i6, ((C0126k.f2032u1 >> 3) + (f2616W / 2)) - 50, 0);
                    }
                    fVar2.mo772D(5084791);
                    fVar2.mo783l(0, (((C0126k.f2032u1 >> 3) + (f2616W / 2)) - 50) + C0159f.m1450t(f2609S0), i4, f2616W);
                    return;
                }
                return;
            }
            if (f2625c0 == C0126k.m893c0()) {
                int i7 = C0121h0.f1803v;
                if (i7 == 137 || i7 == 115 || i7 == 117 || i7 == 118 || i7 == 120 || C0121h0.f1801t) {
                    fVar2.mo772D(0);
                } else if (C0121h0.f1803v == 138) {
                    fVar2.mo772D(6776679);
                }
                fVar2.mo783l(0, 0, f2614V, f2616W);
                return;
            }
            if (f2593K0 == 0) {
                m1341M(fVar2, 4, 6, f2599N0[3], f2601O0[3]);
                m1341M(fVar2, 3, 4, -1, f2601O0[2]);
                m1341M(fVar2, 2, 3, -1, f2601O0[1]);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
            }
            if (f2593K0 == 1) {
                m1341M(fVar2, 4, 6, -1, -1);
                m1341M(fVar2, 3, 3, -1, -1);
                int i8 = i4;
                i = 5;
                m1367w(fVar, f2599N0[2], 0, -(C0126k.f2032u1 >> 5), i8, f2597M0[2], 5);
                m1367w(fVar, f2601O0[2], 0, (f2597M0[2] + f2647q0[2]) - (C0126k.f2032u1 >> 3), i8, 70, 3);
                m1341M(fVar2, 2, 2, -1, -1);
                m1341M(fVar2, 1, 1, -1, f2601O0[0]);
            } else {
                i = 5;
            }
            if (f2593K0 == 2) {
                m1341M(fVar2, i, 10, f2599N0[4], f2601O0[4]);
                m1341M(fVar2, 4, 8, -1, f2599N0[2]);
                m1341M(fVar2, 3, i, -1, f2601O0[2]);
                m1341M(fVar2, 2, 2, -1, f2601O0[1]);
                m1341M(fVar2, 1, 1, -1, f2601O0[0]);
                m1342O(fVar);
            }
            if (f2593K0 == 3) {
                int i9 = C0126k.f2032u1 - (325 - C0126k.f2000n1);
                fVar2.mo773E(0, -i9);
                int i10 = (C0126k.m893c0().f2106Z || C0126k.m893c0().f2083N0) ? C0126k.m893c0().f2122i0 : f2599N0[2];
                int i11 = C0126k.f2032u1;
                m1367w(fVar, i10, 0, i9 - (i11 >> 3), i4, (f2597M0[2] - i9) + (i11 >> 3) + 100, 2);
                m1341M(fVar2, 3, 2, -1, f2601O0[2]);
                m1341M(fVar2, 2, 0, -1, -1);
                m1341M(fVar2, 1, 0, -1, f2601O0[0]);
                fVar2.mo773E(0, -fVar.mo792y());
            }
            if (f2593K0 == 4) {
                m1341M(fVar2, 4, 7, f2599N0[3], -1);
                m1341M(fVar2, 3, 3, -1, m1333C() ? f2601O0[2] : f2599N0[1]);
                m1341M(fVar2, 2, 2, f2599N0[1], f2601O0[1]);
                m1341M(fVar2, 1, 1, -1, f2601O0[0]);
            }
            if (f2593K0 == i) {
                m1341M(fVar2, 4, 15, f2599N0[3], -1);
                m1364t(fVar);
                i2 = 10;
                fVar2.mo773E(100, 10);
                m1364t(fVar);
                fVar2.mo773E(-100, -10);
                m1365u(fVar);
                m1341M(fVar2, 3, 10, -1, -1);
                m1341M(fVar2, 2, 6, -1, -1);
                m1341M(fVar2, 1, 4, -1, -1);
                fVar2.mo773E(0, 27);
                m1341M(fVar2, 1, 2, -1, -1);
                fVar2.mo773E(0, 20);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
                fVar2.mo773E(-fVar.mo791x(), -fVar.mo792y());
            } else {
                i2 = 10;
            }
            if (f2593K0 == 6) {
                m1341M(fVar2, i, i2, f2599N0[4], f2601O0[4]);
                m1364t(fVar);
                m1365u(fVar);
                fVar2.mo773E(60, 40);
                m1365u(fVar);
                fVar2.mo773E(-60, -40);
                m1341M(fVar2, 4, 7, -1, f2601O0[3]);
                C0005a.m16l(fVar);
                m1341M(fVar2, 3, 4, -1, -1);
                m1341M(fVar2, 2, 3, -1, f2601O0[1]);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
            }
            if (f2593K0 == 7) {
                m1341M(fVar2, 4, 6, f2599N0[3], f2601O0[3]);
                m1341M(fVar2, 3, i, -1, -1);
                m1341M(fVar2, 2, 4, -1, -1);
                m1341M(fVar2, 1, 3, -1, f2601O0[0]);
            }
            if (f2593K0 == 8) {
                m1341M(fVar2, 4, 8, f2599N0[3], f2601O0[3]);
                m1364t(fVar);
                m1365u(fVar);
                m1341M(fVar2, 3, 4, -1, f2601O0[2]);
                m1341M(fVar2, 2, 2, -1, f2601O0[1]);
                int i12 = C0121h0.f1803v;
                if (!((i12 >= 92 && i12 <= 96) || i12 == 51 || i12 == 52) || f2625c0 == f2633g0) {
                    m1341M(fVar2, 1, 1, -1, f2601O0[0]);
                }
            }
            if (f2593K0 == 9) {
                m1341M(fVar2, 4, 8, f2599N0[3], f2601O0[3]);
                m1364t(fVar);
                m1365u(fVar);
                fVar2.mo773E(-80, 20);
                m1365u(fVar);
                fVar2.mo773E(80, -20);
                C0005a.m16l(fVar);
                m1341M(fVar2, 3, i, -1, -1);
                m1341M(fVar2, 2, 3, -1, -1);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
            }
            if (f2593K0 == i2) {
                int i13 = C0126k.f2032u1 - (380 - C0126k.f2000n1);
                fVar2.mo773E(0, -i13);
                int i14 = C0126k.m893c0().f2106Z ? C0126k.m893c0().f2122i0 : f2599N0[1];
                int i15 = C0126k.f2032u1;
                i3 = 15;
                m1367w(fVar, i14, 0, i13 - (i15 >> 2), i4, (f2597M0[1] - i13) + (i15 >> 2) + 100, 2);
                m1341M(fVar2, 2, 2, -1, f2601O0[1]);
                m1364t(fVar);
                m1365u(fVar);
                m1341M(fVar2, 1, 0, -1, -1);
                fVar2.mo773E(0, -fVar.mo792y());
            } else {
                i3 = 15;
            }
            if (f2593K0 == 11) {
                m1341M(fVar2, 3, 6, f2599N0[2], f2601O0[2]);
                m1364t(fVar);
                m1341M(fVar2, 2, 3, -1, f2601O0[1]);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
            }
            if (f2593K0 == 12) {
                fVar2.mo772D(9161471);
                fVar2.mo783l(0, 0, f2614V, f2616W);
                m1341M(fVar2, 3, 4, -1, 14417919);
                m1341M(fVar2, 2, 3, -1, 14417919);
                m1341M(fVar2, 1, 2, -1, 14417919);
                m1342O(fVar);
            }
            if (f2593K0 == 13) {
                fVar2.mo772D(15268088);
                fVar2.mo783l(0, 0, f2614V, f2616W);
                m1341M(fVar2, 1, i, -1, 15268088);
            }
            if (f2593K0 == i3) {
                fVar2.mo772D(2631752);
                fVar2.mo783l(0, 0, f2614V, f2616W);
                m1341M(fVar2, 2, 3, -1, f2601O0[1]);
                m1341M(fVar2, 1, 2, -1, f2601O0[0]);
            }
        }
    }

    /* renamed from: M */
    public static void m1341M(C0159f fVar, int i, int i2, int i3, int i4) {
        C0159f fVar2 = fVar;
        int i5 = i;
        int i6 = i5 - 1;
        try {
            if (i6 != f2643m0.length - 1 || (!C0126k.m893c0().f2106Z && !C0126k.m893c0().f2083N0)) {
                C0143b[] bVarArr = f2643m0;
                if (bVarArr != null && bVarArr[i6] != null) {
                    int[] iArr = f2583F0;
                    if (iArr[i6] != 0) {
                        iArr[i6] = iArr[i6] + f2585G0[i6];
                    }
                    int i7 = C0126k.f2032u1;
                    int i8 = f2616W;
                    int i9 = i7 > i8 ? i8 : i7;
                    if (f2581E0[i6] != 0) {
                        for (int i10 = -(((C0126k.f2028t1 + f2583F0[i6]) >> f2581E0[i6]) % f2646p0[i6]); i10 < C0126k.f1975i1; i10 += f2646p0[i6]) {
                            fVar2.mo776e(f2643m0[i6], i10, f2597M0[i6] - (i2 > 0 ? i9 >> i2 : 0), 0);
                        }
                    } else {
                        for (int i11 = 0; i11 < C0126k.f1975i1; i11 += f2646p0[i6]) {
                            fVar2.mo776e(f2643m0[i6], i11, f2597M0[i6] - (i2 > 0 ? i9 >> i2 : 0), 0);
                        }
                    }
                    if (i3 != -1) {
                        if (i6 == f2603P0 - 1) {
                            m1367w(fVar, i3, 0, -(i9 >> i2), C0126k.f1975i1, f2597M0[i6], i2);
                        } else {
                            int i12 = i6 - 1;
                            int i13 = f2647q0[i12] + f2597M0[i12];
                            int i14 = C0126k.f1975i1;
                            int[] iArr2 = f2597M0;
                            m1367w(fVar, i3, 0, i13, i14, iArr2[i6] - (iArr2[i12] + f2647q0[i12]), i2);
                        }
                    }
                    if (i4 != -1) {
                        if (i6 == 0) {
                            m1367w(fVar, i4, 0, f2647q0[i6] + f2597M0[i6], C0126k.f1975i1, C0126k.f1980j1 - (f2597M0[i6] + f2647q0[i6]), i2);
                        } else {
                            int i15 = f2647q0[i6] + f2597M0[i6];
                            int i16 = C0126k.f1975i1;
                            int[] iArr3 = f2597M0;
                            m1367w(fVar, i4, 0, i15, i16, (iArr3[i6 - 1] - (iArr3[i6] + f2647q0[i6])) + 80, i2);
                        }
                    }
                    if (f2625c0 == C0126k.f1970h1) {
                        if (i5 == 1 && f2593K0 == 11 && C0121h0.f1807z == 0) {
                            fVar2.mo776e(f2662y0, (-(C0126k.f2028t1 >> f2581E0[0])) + 400, (f2597M0[0] + 30) - (i9 >> 2), C0117f0.f1677c);
                        }
                        if (i5 == 1 && f2593K0 == 13) {
                            int i17 = i9 >> 3;
                            fVar2.mo776e(f2643m0[1], (-(C0126k.f2028t1 >> f2581E0[0])) + 200, (f2597M0[0] - i17) + 30, 0);
                            fVar.mo779h(f2643m0[1], 0, 0, f2646p0[1], f2647q0[1], 2, f2646p0[1] + (-(C0126k.f2028t1 >> f2581E0[0])) + 200, (f2597M0[0] - i17) + 30, 0);
                        }
                        if (i5 == 3 && C0121h0.f1803v == 1) {
                            for (int i18 = 0; i18 < C0121h0.f1785d / C0159f.m1450t(f2607R0); i18++) {
                                fVar2.mo776e(f2607R0, (-(C0126k.f2028t1 >> f2581E0[2])) + 300, (C0159f.m1450t(f2607R0) * i18) - (i9 >> 3), 0);
                            }
                        }
                    }
                    C0007c.m45c(fVar2, -((C0126k.f2028t1 + f2583F0[i6]) >> f2581E0[i6]), (f2597M0[i6] + f2647q0[i6]) - (i9 >> i2), i6);
                    return;
                }
                return;
            }
            fVar2.mo772D(C0126k.m893c0().f2122i0);
            fVar2.mo783l(0, 0, f2614V, f2616W);
            int i19 = f2593K0;
            if (i19 == 2 || i19 == 4 || i19 == 7) {
                m1364t(fVar);
                m1365u(fVar);
            }
            if (C0126k.m893c0().f2083N0 && !m1339K()) {
                C0012h.m77d(fVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    public static void m1342O(C0159f fVar) {
    }

    /* renamed from: P */
    public static void m1343P(int i, int i2, C0159f fVar) {
        int i3 = f2604Q % (C0161h.f2758f == 7 ? 8 : 9);
        int i4 = f2604Q + 1;
        f2604Q = i4;
        if (i4 == 1000) {
            f2604Q = 0;
        }
        fVar.mo779h(f2630e1, 0, i3 * 16, 16, 16, 0, i, i2, 3);
    }

    /* renamed from: Q */
    private static void m1344Q(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f2605Q0;
            if (i2 >= iArr.length) {
                return;
            }
            if (i == iArr[i2] && C0111c0.m587n(0, 2) == 0) {
                C0005a.m8a(0);
                return;
            }
            i2++;
        }
    }

    /* renamed from: R */
    public static void m1345R() {
    }

    /* renamed from: T */
    public static void m1346T(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        fVar.mo771C(0, 0, f2614V, f2616W);
    }

    /* renamed from: U */
    public static void m1347U(int i, String str) {
    }

    /* renamed from: W */
    public static void m1348W(String str, int i, Object obj) {
        f2639j0.mo604e(str, (C0055d) null, new C0055d(C0057d1.f669k1, (C0072l) f2572A, i, obj), (C0055d) null);
        f2639j0.mo605f();
    }

    /* renamed from: X */
    public static void m1349X(String str) {
        f2639j0.mo604e(str, (C0055d) null, new C0055d(C0057d1.f669k1, (C0072l) f2572A, 8882, (Object) null), (C0055d) null);
        f2637i0 = f2639j0;
    }

    /* renamed from: Y */
    public static void m1350Y(String str, boolean z) {
        f2639j0.mo604e(str, (C0055d) null, new C0055d(C0057d1.f690n1, (C0072l) f2572A, 8882, (Object) null), (C0055d) null);
        C0139x xVar = f2639j0;
        f2637i0 = xVar;
        xVar.f2343e = true;
    }

    /* renamed from: Z */
    public static void m1351Z() {
        C0114e.f1394y4 = true;
    }

    /* renamed from: a0 */
    public static void m1352a0(String str) {
        f2639j0.mo604e(str, (C0055d) null, new C0055d(C0057d1.f690n1, (C0072l) f2572A, 8882, (Object) null), (C0055d) null);
        C0139x xVar = f2639j0;
        f2637i0 = xVar;
        xVar.f2343e = true;
    }

    /* renamed from: b0 */
    public static void m1353b0(String str, int i, Object obj, int i2, Object obj2) {
        f2639j0.mo604e(str, new C0055d(C0057d1.f634f1, (C0072l) f2572A, i, obj), new C0055d("", (C0072l) f2572A, i, obj), new C0055d(C0057d1.f641g1, (C0072l) f2572A, i2, obj2));
        f2639j0.mo605f();
    }

    /* renamed from: c0 */
    public static void m1354c0(String str, C0055d dVar, C0055d dVar2) {
        f2639j0.mo604e(str, dVar, (C0055d) null, dVar2);
        f2639j0.mo605f();
    }

    /* renamed from: d0 */
    public static void m1355d0() {
    }

    /* renamed from: k */
    public static void m1356k() {
        if (C0006b.f96D == null && C0006b.f95C == null) {
            m1354c0(C0057d1.f718r1, new C0055d(C0057d1.f634f1, (C0072l) f2572A, 8885, (Object) null), new C0055d(C0057d1.f641g1, (C0072l) f2572A, 8882, (Object) null));
        }
    }

    /* renamed from: l */
    public static void m1357l() {
        f2580E = false;
        f2578D = false;
        f2624b1 = false;
        f2582F = false;
        C0126k.m893c0().f2080M = 0;
        C0126k.m893c0().f2064E = false;
    }

    /* renamed from: m */
    public static void m1358m() {
        for (int i = 0; i < 14; i++) {
            f2576C[i] = false;
        }
    }

    /* renamed from: n */
    public static void m1359n() {
        for (int i = 0; i < 14; i++) {
            f2574B[i] = false;
        }
        f2582F = false;
    }

    /* renamed from: o */
    public static void m1360o() {
        if (!C0150c.m1414n().mo746p()) {
            C0150c.m1414n().mo745l(C0146b.f2673a, C0146b.f2674b);
        }
    }

    /* renamed from: p */
    public static void m1361p(String str, short s) {
        if (!C0150c.m1414n().mo746p()) {
            C0150c.m1414n().mo745l(str, s);
        }
    }

    /* renamed from: q */
    public static void m1362q() {
        if (!C0150c.m1415o().mo746p()) {
            C0111c0.m584k("IP2= " + C0146b.f2675c + " PORT 2= " + C0146b.f2676d);
            C0150c.m1415o().mo745l(C0146b.f2675c, C0146b.f2676d);
        }
    }

    /* renamed from: r */
    public static void m1363r(String str, int i) {
    }

    /* renamed from: t */
    public static void m1364t(C0159f fVar) {
        C0143b bVar = f2660x0;
        if (bVar != null) {
            fVar.mo776e(bVar, f2577C0, f2579D0, 0);
        }
        if (f2587H0) {
            if (f2600O % 200 == 0) {
                f2589I0 = true;
            }
            if (f2589I0) {
                int i = f2591J0 + 1;
                f2591J0 = i;
                if (i == 10) {
                    f2591J0 = 0;
                    f2589I0 = false;
                }
                if (f2591J0 % 2 == 0) {
                    fVar.mo772D(16777215);
                    fVar.mo783l(0, 0, f2614V, f2616W);
                }
            }
        }
    }

    /* renamed from: u */
    public static void m1365u(C0159f fVar) {
    }

    /* renamed from: v */
    public static void m1366v() {
        C0134s sVar = f2641k0;
        if (sVar != null) {
            sVar.f2211d.mo904o(500);
        }
        f2637i0 = null;
        C0130o.m1005a();
    }

    /* renamed from: w */
    public static void m1367w(C0159f fVar, int i, int i2, int i3, int i4, int i5, int i6) {
        fVar.mo772D(i);
        int i7 = C0126k.f2032u1;
        int i8 = f2616W;
        if (i7 > i8) {
            i7 = i8;
        }
        int i9 = 0;
        int i10 = i3 - (i6 != 0 ? i7 >> i6 : 0);
        if (i6 != 0) {
            i9 = i7 >> i6;
        }
        fVar.mo783l(i2, i10, i4, i5 + i9);
    }

    /* renamed from: x */
    public static C0145a m1368x() {
        return f2572A;
    }

    /* renamed from: y */
    public static void m1369y(int i) {
        int i2 = C0126k.f2000n1;
        switch (i) {
            case 0:
                int[] iArr = f2597M0;
                int[] iArr2 = f2647q0;
                iArr[0] = (i2 - iArr2[0]) + 70;
                iArr[1] = (iArr[0] - iArr2[1]) + 20;
                iArr[2] = (iArr[1] - iArr2[2]) + 30;
                iArr[3] = (iArr[2] - iArr2[3]) + 50;
                return;
            case 1:
                int[] iArr3 = f2597M0;
                int[] iArr4 = f2647q0;
                iArr3[0] = (i2 - iArr4[0]) + 120;
                iArr3[1] = (iArr3[0] - iArr4[1]) + 40;
                iArr3[2] = iArr3[1] - 90;
                iArr3[3] = iArr3[2] - 25;
                return;
            case 2:
                int[] iArr5 = f2597M0;
                int[] iArr6 = f2647q0;
                iArr5[0] = (i2 - iArr6[0]) + 150;
                iArr5[1] = (iArr5[0] - iArr6[1]) - 60;
                iArr5[2] = (iArr5[1] - iArr6[2]) - 40;
                iArr5[3] = (iArr5[2] - iArr6[3]) - 10;
                iArr5[4] = iArr5[3] - iArr6[4];
                return;
            case 3:
                int[] iArr7 = f2597M0;
                int[] iArr8 = f2647q0;
                iArr7[0] = (i2 - iArr8[0]) + 10;
                iArr7[1] = iArr7[0] + 80;
                iArr7[2] = (iArr7[1] - iArr8[2]) - 10;
                return;
            case 4:
                int[] iArr9 = f2597M0;
                int[] iArr10 = f2647q0;
                iArr9[0] = (i2 - iArr10[0]) + 130;
                iArr9[1] = iArr9[0] - iArr10[1];
                iArr9[2] = (iArr9[1] - iArr10[2]) - 20;
                iArr9[3] = (iArr9[1] - iArr10[2]) - 80;
                return;
            case 5:
                int[] iArr11 = f2597M0;
                int[] iArr12 = f2647q0;
                iArr11[0] = (i2 - iArr12[0]) + 40;
                iArr11[1] = (iArr11[0] - iArr12[1]) + 10;
                iArr11[2] = (iArr11[1] - iArr12[2]) + 15;
                iArr11[3] = (iArr11[2] - iArr12[3]) + 50;
                return;
            case 6:
                int[] iArr13 = f2597M0;
                int[] iArr14 = f2647q0;
                iArr13[0] = (i2 - iArr14[0]) + 100;
                iArr13[1] = (iArr13[0] - iArr14[1]) - 30;
                iArr13[2] = (iArr13[1] - iArr14[2]) + 10;
                iArr13[3] = (iArr13[2] - iArr14[3]) + 15;
                iArr13[4] = (iArr13[3] - iArr14[4]) + 15;
                return;
            case 7:
                int[] iArr15 = f2597M0;
                int[] iArr16 = f2647q0;
                iArr15[0] = (i2 - iArr16[0]) + 20;
                iArr15[1] = (iArr15[0] - iArr16[1]) + 15;
                iArr15[2] = (iArr15[1] - iArr16[2]) + 20;
                iArr15[3] = (iArr15[1] - iArr16[2]) - 10;
                return;
            case 8:
                f2597M0[0] = (i2 - 103) + 150;
                if (C0121h0.f1803v == 103) {
                    int[] iArr17 = f2597M0;
                    iArr17[0] = iArr17[0] - 100;
                }
                int[] iArr18 = f2597M0;
                int i3 = iArr18[0];
                int[] iArr19 = f2647q0;
                iArr18[1] = (i3 - iArr19[1]) - 10;
                iArr18[2] = (iArr18[1] - iArr19[2]) + 40;
                iArr18[3] = (iArr18[2] - iArr19[3]) + 10;
                return;
            case 9:
                int[] iArr20 = f2597M0;
                int[] iArr21 = f2647q0;
                iArr20[0] = (i2 - iArr21[0]) + 100;
                iArr20[1] = (iArr20[0] - iArr21[1]) + 22;
                iArr20[2] = (iArr20[1] - iArr21[2]) + 50;
                iArr20[3] = iArr20[2] - iArr21[3];
                return;
            case 10:
                int[] iArr22 = f2597M0;
                int[] iArr23 = f2647q0;
                iArr22[0] = (i2 - iArr23[0]) - 45;
                iArr22[1] = (iArr22[0] - iArr23[1]) - 10;
                return;
            case 11:
                int[] iArr24 = f2597M0;
                int[] iArr25 = f2647q0;
                iArr24[0] = (i2 - iArr25[0]) + 60;
                iArr24[1] = (iArr24[0] - iArr25[1]) + 5;
                iArr24[2] = (iArr24[1] - iArr25[2]) - 15;
                return;
            case 12:
                int[] iArr26 = f2597M0;
                iArr26[0] = i2 + 40;
                iArr26[1] = iArr26[0] - 40;
                iArr26[2] = iArr26[1] - 40;
                return;
            case 13:
                int[] iArr27 = f2597M0;
                iArr27[0] = i2 - 80;
                iArr27[1] = iArr27[0];
                return;
            case 15:
                int[] iArr28 = f2597M0;
                iArr28[0] = i2 - 20;
                iArr28[1] = iArr28[0] - 80;
                return;
            default:
                return;
        }
    }

    /* renamed from: A */
    public void mo722A() {
        f2642l0 = new C0059e0();
    }

    /* renamed from: I */
    public void mo723I() {
        if (!f2649s) {
            if (f2632f1 == null) {
                f2632f1 = (C0143b[][]) Array.newInstance(C0143b.class, new int[]{2, 5});
                for (int i = 0; i < 2; i++) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        C0143b[] bVarArr = f2632f1[i];
                        bVarArr[i2] = C0161h.m1494l("/e/d" + i + i2 + ".png");
                    }
                }
            }
            this.f2669o = new int[2];
            this.f2670p = new int[2];
            int[] iArr = new int[2];
            this.f2671q = iArr;
            iArr[1] = -1;
            iArr[0] = -1;
        }
    }

    /* renamed from: J */
    public void mo724J() {
        if (!f2649s) {
            f2628d1 = new C0143b[3];
            for (int i = 0; i < 3; i++) {
                C0143b[] bVarArr = f2628d1;
                bVarArr[i] = C0161h.m1494l("/e/w" + i + ".png");
            }
            int[] iArr = new int[2];
            f2626c1 = iArr;
            iArr[1] = -1;
            iArr[0] = -1;
        }
    }

    /* renamed from: N */
    public void mo725N(C0159f fVar) {
        String str;
        m1346T(fVar);
        fVar.mo772D(0);
        fVar.mo783l(0, 0, f2614V, f2616W);
        fVar.mo776e(C0170f.f2812Q, f2614V / 2, (f2616W / 2) - 24, C0117f0.f1677c);
        m1343P(f2621a0, (f2616W / 2) + 24, fVar);
        C0177m mVar = C0177m.f2948p;
        StringBuilder sb = new StringBuilder();
        sb.append(C0057d1.f724s0);
        if (C0170f.f2813R > 0) {
            str = " " + C0170f.f2813R + "s";
        } else {
            str = "";
        }
        sb.append(str);
        mVar.mo909a(fVar, sb.toString(), f2614V / 2, f2616W / 2, 2);
    }

    /* renamed from: S */
    public void mo726S() {
        this.f2672r = true;
    }

    /* renamed from: V */
    public boolean mo727V(int i, int i2, int i3) {
        if (f2649s) {
            return false;
        }
        char c = i == 1 ? (char) 0 : 1;
        int[] iArr = this.f2671q;
        if (iArr[c] != -1) {
            return false;
        }
        iArr[c] = 0;
        this.f2669o[c] = i2;
        this.f2670p[c] = i3;
        return true;
    }

    /* renamed from: d */
    public void mo728d(int i, int i2) {
        if (C0111c0.m574a(i - f2594L) >= 10 || C0111c0.m574a(i2 - f2596M) >= 10) {
            f2580E = false;
            f2578D = true;
            f2584G = true;
        }
        f2586H = i;
        f2588I = i2;
        int i3 = f2645o0 + 1;
        f2645o0 = i3;
        if (i3 > 3) {
            f2645o0 = 0;
        }
        f2598N[f2645o0] = new C0071k0(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e2, code lost:
        m1350Y(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b0, code lost:
        r8.mo283h0(r9, f2627d0.f2241c, 0);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3e(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            r0 = 999(0x3e7, float:1.4E-42)
            if (r8 == r0) goto L_0x02c9
            r0 = 9000(0x2328, float:1.2612E-41)
            r1 = 0
            r2 = 1
            if (r8 == r0) goto L_0x02a7
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r8 == r0) goto L_0x0294
            r0 = 88814(0x15aee, float:1.24455E-40)
            if (r8 == r0) goto L_0x0287
            r0 = 88839(0x15b07, float:1.2449E-40)
            r3 = 8882(0x22b2, float:1.2446E-41)
            r4 = 6
            java.lang.String r5 = ""
            if (r8 == r0) goto L_0x025e
            r0 = 888361(0xd8e29, float:1.244859E-39)
            if (r8 == r0) goto L_0x0239
            r6 = 8881(0x22b1, float:1.2445E-41)
            if (r8 == r6) goto L_0x022c
            if (r8 == r3) goto L_0x0225
            switch(r8) {
                case 8884: goto L_0x021b;
                case 8885: goto L_0x0214;
                case 8886: goto L_0x0206;
                case 8887: goto L_0x01f4;
                case 8888: goto L_0x01e5;
                case 8889: goto L_0x01d7;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r8) {
                case 88810: goto L_0x01c5;
                case 88811: goto L_0x01b9;
                default: goto L_0x002e;
            }
        L_0x002e:
            r3 = 0
            switch(r8) {
                case 88817: goto L_0x0199;
                case 88818: goto L_0x0182;
                case 88819: goto L_0x0173;
                case 88820: goto L_0x0117;
                case 88821: goto L_0x00f1;
                case 88822: goto L_0x0199;
                case 88823: goto L_0x00ea;
                case 88824: goto L_0x00e7;
                case 88825: goto L_0x00e0;
                case 88826: goto L_0x00dd;
                case 88827: goto L_0x00da;
                case 88828: goto L_0x00d7;
                case 88829: goto L_0x00b6;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r8) {
                case 88836: goto L_0x009e;
                case 88837: goto L_0x0082;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r8) {
                case 888391: goto L_0x0070;
                case 888392: goto L_0x0069;
                case 888393: goto L_0x02a1;
                case 888394: goto L_0x02cc;
                case 888395: goto L_0x0046;
                case 888396: goto L_0x0040;
                case 888397: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x02cf
        L_0x003a:
            g.s r8 = f2641k0
            r8.mo578c()
            throw r1
        L_0x0040:
            g.s r8 = f2641k0
            r8.mo578c()
            throw r1
        L_0x0046:
            k.n r8 = f2625c0
            g.e0 r9 = p013g.C0115e0.f1661m
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0062
            k.n r8 = f2625c0
            g.d0 r9 = f2638i1
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            k.f r8 = f2633g0
            r8.mo342f()
            goto L_0x02cc
        L_0x0062:
            g.d0 r8 = f2638i1
            r8.mo342f()
            goto L_0x02cc
        L_0x0069:
            f.d r8 = p012f.C0105d.m365M()
            r9 = 4
            goto L_0x01b0
        L_0x0070:
            java.lang.String r9 = (java.lang.String) r9
            m1366v()
            f.d r8 = p012f.C0105d.m365M()
            int r9 = java.lang.Integer.parseInt(r9)
            r8.mo212B(r9)
            goto L_0x02cf
        L_0x0082:
            g.s r8 = f2641k0
            k.l r8 = r8.f2211d
            java.lang.String r8 = r8.mo899f()
            m1366v()
            f.d r9 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x02cf }
            java.lang.String r8 = r8.trim()     // Catch:{ Exception -> 0x02cf }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x02cf }
            r9.mo296o0(r8)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02cf
        L_0x009e:
            g.s r8 = f2641k0
            k.l r8 = r8.f2211d
            r8.mo904o(r4)
            g.s r8 = f2641k0
            java.lang.String r9 = p011e.C0057d1.f489K
            e.d r3 = new e.d
            java.lang.String r4 = p011e.C0057d1.f683m1
            i.a r5 = f2572A
            r3.<init>((java.lang.String) r4, (p011e.C0072l) r5, (int) r0, (java.lang.Object) r1)
            r8.mo579d(r9, r3, r2)
            throw r1
        L_0x00b6:
            g.s r8 = f2641k0
            k.l r8 = r8.f2211d
            java.lang.String r8 = r8.mo899f()
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x00c5
            return
        L_0x00c5:
            f.d r0 = p012f.C0105d.m365M()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.mo292m(r8, r9)
            p013g.C0130o.m1008d()
            goto L_0x02cf
        L_0x00d7:
            java.lang.String r8 = p011e.C0057d1.f468H
            goto L_0x00ec
        L_0x00da:
            java.lang.String r8 = p011e.C0057d1.f461G
            goto L_0x00ec
        L_0x00dd:
            java.lang.String r8 = p011e.C0057d1.f454F
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r8 = p011e.C0057d1.f447E
        L_0x00e2:
            m1350Y(r8, r3)
            goto L_0x02cf
        L_0x00e7:
            java.lang.String r8 = p011e.C0057d1.f440D
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r8 = p011e.C0057d1.f433C
        L_0x00ec:
            m1349X(r8)
            goto L_0x02cf
        L_0x00f1:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            g.e r9 = p013g.C0114e.m647e0()
            e.b0 r9 = r9.f1467O0
            p001b.C0006b.m33d(r5, r2, r9)
            f.d r9 = p012f.C0105d.m365M()
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            e.c0 r0 = r0.f362A4
            int r0 = r0.f381a
            g.u r1 = f2627d0
            int r1 = r1.f2241c
            r9.mo283h0(r0, r8, r1)
            goto L_0x02cf
        L_0x0117:
            java.lang.String[] r9 = (java.lang.String[]) r9
            g.e r8 = p013g.C0114e.m647e0()
            e.b0 r8 = r8.f1467O0
            if (r8 != 0) goto L_0x0122
            return
        L_0x0122:
            java.lang.Integer r8 = new java.lang.Integer
            g.u r0 = f2627d0
            int r0 = r0.f2241c
            r8.<init>(r0)
            int r0 = r9.length
            if (r0 <= r2) goto L_0x0153
            k.i r0 = new k.i
            java.lang.String r1 = "vSub"
            r0.<init>(r1)
        L_0x0135:
            int r1 = r9.length
            int r1 = r1 - r2
            if (r3 >= r1) goto L_0x014b
            e.d r1 = new e.d
            int r3 = r3 + 1
            r4 = r9[r3]
            i.a r5 = f2572A
            r6 = 88821(0x15af5, float:1.24465E-40)
            r1.<init>((java.lang.String) r4, (p011e.C0072l) r5, (int) r6, (java.lang.Object) r8)
            r0.addElement(r1)
            goto L_0x0135
        L_0x014b:
            g.u r8 = f2627d0
            r9 = 3
            r8.mo590g(r0, r9)
            goto L_0x02cf
        L_0x0153:
            g.e r9 = p013g.C0114e.m647e0()
            e.b0 r9 = r9.f1467O0
            p001b.C0006b.m33d(r5, r2, r9)
            f.d r9 = p012f.C0105d.m365M()
            g.e r0 = p013g.C0114e.m647e0()
            e.b0 r0 = r0.f1467O0
            e.c0 r0 = r0.f362A4
            int r0 = r0.f381a
            int r8 = r8.intValue()
            r9.mo283h0(r0, r8, r3)
            goto L_0x02cf
        L_0x0173:
            java.lang.Short r9 = (java.lang.Short) r9
            short r8 = r9.shortValue()
            f.d r9 = p012f.C0105d.m365M()
            r9.mo285i0(r8)
            goto L_0x02cf
        L_0x0182:
            java.lang.Short r9 = (java.lang.Short) r9
            short r8 = r9.shortValue()
            f.d r9 = p012f.C0105d.m365M()
            g.s r0 = f2641k0
            k.l r0 = r0.f2211d
            java.lang.String r0 = r0.mo899f()
            r9.mo256X0(r8, r0)
            goto L_0x02cc
        L_0x0199:
            g.e r8 = p013g.C0114e.m647e0()
            e.b0 r8 = r8.f1467O0
            p001b.C0006b.m33d(r5, r2, r8)
            f.d r8 = p012f.C0105d.m365M()
            g.e r9 = p013g.C0114e.m647e0()
            e.b0 r9 = r9.f1467O0
            e.c0 r9 = r9.f362A4
            int r9 = r9.f381a
        L_0x01b0:
            g.u r0 = f2627d0
            int r0 = r0.f2241c
            r8.mo283h0(r9, r0, r3)
            goto L_0x02cf
        L_0x01b9:
            m1366v()
            f.d r8 = p012f.C0105d.m365M()
            r8.mo290l()
            goto L_0x02cf
        L_0x01c5:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            m1366v()
            f.d r9 = p012f.C0105d.m365M()
            r9.mo267c(r8)
            goto L_0x02cf
        L_0x01d7:
            java.lang.String r9 = (java.lang.String) r9
            m1366v()
            f.d r8 = p012f.C0105d.m365M()
            r8.mo270d(r9)
            goto L_0x02cf
        L_0x01e5:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            f.d r9 = p012f.C0105d.m365M()
            r9.mo282h(r8)
            goto L_0x02cc
        L_0x01f4:
            m1366v()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            f.d r9 = p012f.C0105d.m365M()
            r9.mo279g(r8)
            goto L_0x02cf
        L_0x0206:
            m1366v()
            java.lang.String r9 = (java.lang.String) r9
            f.d r8 = p012f.C0105d.m365M()
            r8.mo276f(r9)
            goto L_0x02cf
        L_0x0214:
            i.b r8 = p018i.C0146b.f2678f
            r8.mo736c()
            goto L_0x02cf
        L_0x021b:
            m1366v()
            k.f r8 = f2633g0
            r8.mo342f()
            goto L_0x02cf
        L_0x0225:
            p013g.C0130o.m1005a()
        L_0x0228:
            f2637i0 = r1
            goto L_0x02cf
        L_0x022c:
            java.lang.String r9 = (java.lang.String) r9
            i.b r8 = p018i.C0146b.f2678f     // Catch:{ Exception -> 0x0234 }
            r8.mo721b(r9)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0228
        L_0x0234:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0228
        L_0x0239:
            g.s r8 = f2641k0
            k.l r8 = r8.f2211d
            java.lang.String r8 = r8.mo899f()
            m1366v()
            int r9 = r8.length()
            if (r9 < r4) goto L_0x0283
            boolean r9 = r8.equals(r5)
            if (r9 == 0) goto L_0x0251
            goto L_0x0283
        L_0x0251:
            f.d r9 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x027f }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x027f }
            r9.mo273e(r8)     // Catch:{ Exception -> 0x027f }
            goto L_0x02cf
        L_0x025e:
            g.s r8 = f2641k0
            k.l r8 = r8.f2211d
            java.lang.String r8 = r8.mo899f()
            m1366v()
            int r9 = r8.length()
            if (r9 < r4) goto L_0x0283
            boolean r9 = r8.equals(r5)
            if (r9 == 0) goto L_0x0276
            goto L_0x0283
        L_0x0276:
            java.lang.String r9 = p011e.C0057d1.f585Y     // Catch:{ Exception -> 0x027f }
            r0 = 888391(0xd8e47, float:1.244901E-39)
            m1353b0(r9, r0, r8, r3, r1)     // Catch:{ Exception -> 0x027f }
            goto L_0x02cf
        L_0x027f:
            java.lang.String r8 = p011e.C0057d1.f482J
            goto L_0x00ec
        L_0x0283:
            java.lang.String r8 = p011e.C0057d1.f475I
            goto L_0x00ec
        L_0x0287:
            e.n[] r9 = (p011e.C0076n[]) r9
            m1366v()
            f.d r8 = p012f.C0105d.m365M()
            r8.mo222G(r9)
            goto L_0x02cf
        L_0x0294:
            m1366v()
            m1360o()
            f.d r8 = p012f.C0105d.m365M()
            r8.mo246S0()
        L_0x02a1:
            k.f r8 = f2633g0
            r8.mo834n()
            goto L_0x02cf
        L_0x02a7:
            m1366v()
            p013g.C0115e0.f1662n = r1
            p020k.C0174j.m1560h()
            java.lang.System.gc()
            p013g.C0113d0.f1345F = r2
            p013g.C0113d0.f1353N = r2
            g.k r8 = p013g.C0126k.m893c0()
            r8.mo487D0()
            k.n r8 = f2625c0
            k.f r9 = f2633g0
            if (r8 == r9) goto L_0x02cf
            g.d0 r8 = f2638i1
            r8.mo368u()
            goto L_0x02cf
        L_0x02c9:
            p019j.C0161h.m1488f()
        L_0x02cc:
            m1366v()
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.mo3e(int, java.lang.Object):void");
    }

    /* renamed from: e0 */
    public void mo729e0() {
        if (!f2649s) {
            for (int i = 0; i < 2; i++) {
                int[] iArr = this.f2671q;
                if (iArr[i] != -1) {
                    iArr[i] = iArr[i] + 1;
                    if (iArr[i] >= 5) {
                        iArr[i] = -1;
                    }
                    int[] iArr2 = this.f2669o;
                    if (i == 0) {
                        iArr2[i] = iArr2[i] - 1;
                    } else {
                        iArr2[i] = iArr2[i] + 1;
                    }
                    int[] iArr3 = this.f2670p;
                    iArr3[i] = iArr3[i] - 1;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo730f(int i, int i2) {
        f2582F = false;
        f2624b1 = true;
        f2578D = true;
        f2580E = true;
        f2584G = false;
        f2613U0 = System.currentTimeMillis();
        f2590J = i;
        f2592K = i2;
        f2594L = i;
        f2596M = i2;
        f2586H = i;
        f2588I = i2;
    }

    /* renamed from: g */
    public void mo731g(int i, int i2) {
        f2578D = false;
        f2582F = true;
        f2584G = false;
        C0178n.f2969g = -1;
        f2586H = i;
        f2588I = i2;
    }

    /* renamed from: h */
    public void mo732h(C0142a aVar) {
        C0167c cVar;
        this.f2665k.f2751a = aVar;
        long h = C0161h.m1490h();
        long j = this.f2667m;
        if (h > j) {
            this.f2667m = j + 1000;
            f2618X0 = 0;
        }
        f2618X0++;
        try {
            f2654u0.removeAllElements();
            m1363r("PA", 1);
            C0178n nVar = f2625c0;
            if (nVar != null) {
                nVar.mo341d(this.f2665k);
            }
            m1363r("PB", 1);
            C0159f fVar = this.f2665k;
            fVar.mo773E(-fVar.mo791x(), -this.f2665k.mo792y());
            this.f2665k.mo771C(0, 0, f2614V, f2616W);
            this.f2665k.mo770B();
            this.f2665k.mo774a(0, 0, f2614V, f2616W);
            C0140y yVar = f2629e0;
            if (yVar.f2467a) {
                yVar.mo673q0(this.f2665k);
                C0140y yVar2 = f2631f0;
                if (yVar2 != null && yVar2.f2467a) {
                    yVar2.mo673q0(this.f2665k);
                }
                C0167c cVar2 = f2629e0.f2395C;
                if (cVar2 != null && cVar2.f2790b) {
                    cVar2.mo823f(this.f2665k);
                }
                C0140y yVar3 = f2631f0;
                if (!(yVar3 == null || (cVar = yVar3.f2395C) == null || !cVar.f2790b)) {
                    cVar.mo823f(this.f2665k);
                }
            }
            if (C0126k.f1999m5) {
                C0111c0.m585l(this.f2665k);
            }
            C0130o.m1006b(this.f2665k);
            if (f2637i0 != null) {
                m1363r("PC", 1);
                f2637i0.mo484a(this.f2665k);
            } else if (f2627d0.f2239a) {
                m1363r("PD", 1);
                f2627d0.mo587d(this.f2665k);
            }
            C0126k.f1862G3.mo567f(this.f2665k);
            C0126k.f1866H3.mo567f(this.f2665k);
            if (C0126k.m893c0().f2081M0 != null) {
                C0126k.m893c0().f2081M0.mo154a(this.f2665k);
            }
            C0006b bVar = C0006b.f95C;
            if (bVar != null) {
                bVar.mo12a(this.f2665k);
            }
            C0070k.m260g(this.f2665k);
            C0006b bVar2 = C0006b.f96D;
            if (bVar2 != null) {
                bVar2.mo12a(this.f2665k);
            }
            for (int i = 0; i < C0008d.f124b.size(); i++) {
                C0008d dVar = (C0008d) C0008d.f124b.elementAt(i);
                if ((dVar instanceof C0006b) && !dVar.equals(C0006b.f95C) && !dVar.equals(C0006b.f96D)) {
                    dVar.mo12a(this.f2665k);
                }
            }
            m1363r("PE", 1);
            if (C0114e.f1394y4 || C0170f.f2805J || C0113d0.f1340A || C0113d0.f1360r) {
                mo725N(this.f2665k);
            }
            C0159f.m1454z(this.f2665k);
            this.f2665k.mo769A();
            m1346T(this.f2665k);
            C0007c.m49g(this.f2665k);
            if (f2640j1 && !f2657w) {
                C0178n nVar2 = f2625c0;
                if (nVar2 == f2633g0 || nVar2 == f2638i1) {
                    this.f2665k.mo776e(f2617W0, 5, 5, 0);
                }
                if (f2625c0 == C0120h.f1747o) {
                    this.f2665k.mo776e(f2617W0, 5, 20, 0);
                }
            }
        } catch (Exception unused) {
        }
        for (int i2 = 0; i2 < f2622a1.size(); i2++) {
            String str = (String) f2622a1.elementAt(i2);
            int i3 = (i2 * 15) + 20;
            C0177m.f2951s.mo909a(this.f2665k, str, f2614V - 20, i3, 1);
            C0177m.f2948p.mo909a(this.f2665k, str, (f2614V - 20) - 1, i3 - 1, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        java.lang.Thread.sleep(1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x01c6 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0182 A[Catch:{ Exception -> 0x01c6 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo733j() {
        /*
            r11 = this;
            int r0 = r11.f2666l     // Catch:{ InterruptedException -> 0x0007 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0007 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0007 }
            goto L_0x0008
        L_0x0007:
        L_0x0008:
            int r0 = f2600O
            int r0 = r0 % 5
            if (r0 != 0) goto L_0x0014
            long r0 = java.lang.System.currentTimeMillis()
            f2653u = r0
        L_0x0014:
            long r0 = p019j.C0161h.m1490h()
            long r2 = r11.f2668n
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 1
            r7 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            long r2 = r2 + r4
            r11.f2668n = r2
            int r0 = f2619Y0
            f2620Z0 = r0
            r1 = 34
            if (r0 <= r1) goto L_0x0033
            int r0 = r11.f2666l
            int r0 = r0 + r6
        L_0x0030:
            r11.f2666l = r0
            goto L_0x0039
        L_0x0033:
            int r0 = r11.f2666l
            if (r0 <= r6) goto L_0x0039
            int r0 = r0 - r6
            goto L_0x0030
        L_0x0039:
            f2619Y0 = r7
        L_0x003b:
            int r0 = f2619Y0
            int r0 = r0 + r6
            f2619Y0 = r0
            k.i r0 = f2652t0
            r0.removeAllElements()
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = p013g.C0126k.f1999m5
            if (r2 == 0) goto L_0x0050
            p013g.C0111c0.m592s()
        L_0x0050:
            long r2 = f2610T     // Catch:{ Exception -> 0x01c6 }
            long r2 = r0 - r2
            r8 = 780(0x30c, double:3.854E-321)
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0063
            boolean r2 = f2606R     // Catch:{ Exception -> 0x01c6 }
            if (r2 != 0) goto L_0x0063
            f2610T = r0     // Catch:{ Exception -> 0x01c6 }
            f2606R = r6     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0065
        L_0x0063:
            f2606R = r7     // Catch:{ Exception -> 0x01c6 }
        L_0x0065:
            long r2 = f2612U     // Catch:{ Exception -> 0x01c6 }
            long r2 = r0 - r2
            r8 = 7800(0x1e78, double:3.8537E-320)
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0078
            boolean r2 = f2608S     // Catch:{ Exception -> 0x01c6 }
            if (r2 != 0) goto L_0x0078
            f2612U = r0     // Catch:{ Exception -> 0x01c6 }
            f2608S = r6     // Catch:{ Exception -> 0x01c6 }
            goto L_0x007a
        L_0x0078:
            f2608S = r7     // Catch:{ Exception -> 0x01c6 }
        L_0x007a:
            int r0 = f2602P     // Catch:{ Exception -> 0x01c6 }
            if (r0 <= 0) goto L_0x0081
            int r0 = r0 - r6
            f2602P = r0     // Catch:{ Exception -> 0x01c6 }
        L_0x0081:
            int r0 = f2600O     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0 + r6
            f2600O = r0     // Catch:{ Exception -> 0x01c6 }
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r1) goto L_0x00a4
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01c6 }
            long r2 = f2613U0     // Catch:{ Exception -> 0x01c6 }
            long r0 = r0 - r2
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a2
            k.n r0 = f2625c0     // Catch:{ Exception -> 0x01c6 }
            k.f r1 = f2633g0     // Catch:{ Exception -> 0x01c6 }
            if (r0 != r1) goto L_0x00a2
            i.b r0 = p018i.C0146b.f2678f     // Catch:{ Exception -> 0x01c6 }
            r0.mo736c()     // Catch:{ Exception -> 0x01c6 }
        L_0x00a2:
            f2600O = r7     // Catch:{ Exception -> 0x01c6 }
        L_0x00a4:
            java.lang.String r0 = "A"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            k.n r0 = f2625c0     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x01a5
            b.b r0 = p001b.C0006b.f96D     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00bb
            r0.mo13b()     // Catch:{ Exception -> 0x01c6 }
            b.b r0 = p001b.C0006b.f96D     // Catch:{ Exception -> 0x01c6 }
        L_0x00b6:
            r0.mo16k()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0179
        L_0x00bb:
            b.b r0 = p001b.C0006b.f95C     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00c5
            r0.mo13b()     // Catch:{ Exception -> 0x01c6 }
            b.b r0 = p001b.C0006b.f95C     // Catch:{ Exception -> 0x01c6 }
            goto L_0x00b6
        L_0x00c5:
            g.i r0 = f2637i0     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "B"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            g.i r0 = f2637i0     // Catch:{ Exception -> 0x01c6 }
            r0.mo485b()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0179
        L_0x00d5:
            g.u r0 = f2627d0     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r0.f2239a     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "C"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            g.u r0 = f2627d0     // Catch:{ Exception -> 0x01c6 }
            r0.mo593j()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = "D"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            g.u r0 = f2627d0     // Catch:{ Exception -> 0x01c6 }
            r0.mo594k()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0179
        L_0x00f1:
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
            boolean r1 = r0.f2467a     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0179
            r0.mo690y2()     // Catch:{ Exception -> 0x01c6 }
            g.y r0 = f2631f0     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0105
            boolean r1 = r0.f2467a     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0105
            r0.mo690y2()     // Catch:{ Exception -> 0x01c6 }
        L_0x0105:
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
            k.c r1 = r0.f2395C     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0113
            boolean r1 = r1.f2790b     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0113
            r0.mo676r()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0156
        L_0x0113:
            g.y r1 = f2631f0     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0123
            k.c r2 = r1.f2395C     // Catch:{ Exception -> 0x01c6 }
            if (r2 == 0) goto L_0x0123
            boolean r2 = r2.f2790b     // Catch:{ Exception -> 0x01c6 }
            if (r2 == 0) goto L_0x0123
            r1.mo676r()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0156
        L_0x0123:
            int r1 = r0.f2470b     // Catch:{ Exception -> 0x01c6 }
            int r2 = r0.f2473c     // Catch:{ Exception -> 0x01c6 }
            int r3 = r0.f2476d     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0.f2479e     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = m1335E(r1, r2, r3, r0)     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0135
            g.y r0 = f2631f0     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x0139
        L_0x0135:
            g.y r0 = f2631f0     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x013f
        L_0x0139:
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
        L_0x013b:
            r0.mo608A2()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0156
        L_0x013f:
            if (r0 == 0) goto L_0x0156
            boolean r1 = r0.f2467a     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0156
            int r1 = r0.f2470b     // Catch:{ Exception -> 0x01c6 }
            int r2 = r0.f2473c     // Catch:{ Exception -> 0x01c6 }
            int r3 = r0.f2476d     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0.f2479e     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = m1335E(r1, r2, r3, r0)     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0156
            g.y r0 = f2631f0     // Catch:{ Exception -> 0x01c6 }
            goto L_0x013b
        L_0x0156:
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
            int r1 = r0.f2470b     // Catch:{ Exception -> 0x01c6 }
            int r2 = r0.f2476d     // Catch:{ Exception -> 0x01c6 }
            int r1 = r1 + r2
            int r3 = r0.f2473c     // Catch:{ Exception -> 0x01c6 }
            int r6 = f2614V     // Catch:{ Exception -> 0x01c6 }
            int r2 = r2 * 2
            int r6 = r6 - r2
            int r0 = r0.f2479e     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = m1335E(r1, r3, r6, r0)     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0179
            boolean r0 = f2582F     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0179
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
            boolean r1 = r0.f2454V1     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x0179
            r0.mo649h0()     // Catch:{ Exception -> 0x01c6 }
        L_0x0179:
            java.lang.String r0 = "E"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = f2657w     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x0187
            k.n r0 = f2625c0     // Catch:{ Exception -> 0x01c6 }
            r0.mo343h()     // Catch:{ Exception -> 0x01c6 }
        L_0x0187:
            java.lang.String r0 = "F"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            g.y r0 = f2629e0     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r0.f2467a     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x019b
            b.b r0 = p001b.C0006b.f96D     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x019b
            k.n r0 = f2625c0     // Catch:{ Exception -> 0x01c6 }
            r0.mo344i()     // Catch:{ Exception -> 0x01c6 }
        L_0x019b:
            p011e.C0070k.m262i()     // Catch:{ Exception -> 0x01c6 }
            k.k r0 = p020k.C0175k.m1563p()     // Catch:{ Exception -> 0x01c6 }
            r0.mo869T()     // Catch:{ Exception -> 0x01c6 }
        L_0x01a5:
            java.lang.String r0 = "Ix"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            p013g.C0123i0.m847a()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = "Hx"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            p013g.C0130o.m1009e()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = "G"
            m1363r(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r11.f2672r     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x01c9
            r11.f2672r = r7     // Catch:{ Exception -> 0x01c6 }
            g.d0 r0 = f2638i1     // Catch:{ Exception -> 0x01c6 }
            r11.mo734s(r0)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01c9
        L_0x01c6:
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x01c9 }
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018i.C0145a.mo733j():void");
    }

    /* renamed from: s */
    public void mo734s(C0178n nVar) {
        try {
            C0114e.f1394y4 = false;
            C0114e.f1392w4 = false;
            C0175k.m1563p().mo865P();
            C0170f.f2805J = false;
            C0121h0.f1807z = 0;
            C0121h0.f1762A = 0;
            C0114e.m662u();
            C0126k.m875K();
            C0126k.m898j1();
            C0130o.m1005a();
            C0126k.f1862G3.mo565d();
            C0126k.f1866H3.mo565d();
            C0126k.f1866H3.f2191r = null;
            C0006b.f95C = null;
            C0103b.f1145e = false;
            int i = -1;
            C0126k.m855A0(true, -1, -1);
            C0126k.f2035u4.removeAllElements();
            C0126k.f2028t1 = 100;
            C0140y yVar = f2629e0;
            yVar.f2404F = 0;
            if (!f2659x) {
                i = 0;
            }
            yVar.f2537x0 = i;
            yVar.mo653j0();
            f2631f0 = null;
            C0126k.f2018q4 = true;
            C0002c.f18m.removeAllElements();
            C0126k.f1896P1.removeAllElements();
            C0126k.f1900Q1.removeAllElements();
            C0126k.f1904R1.removeAllElements();
            C0121h0.f1768G.removeAllElements();
            C0005a.f67z.removeAllElements();
            C0007c.f122a.removeAllElements();
            C0009e.f131x.removeAllElements();
            f2627d0.f2239a = false;
            C0140y yVar2 = f2629e0;
            yVar2.f2467a = false;
            yVar2.f2530v.removeAllElements();
            C0119g0 g0Var = f2629e0.f2527u;
            if (g0Var != null) {
                g0Var.f1740o = false;
            }
            if (C0159f.f2750b == 1) {
                C0174j.m1553a();
            }
            C0150c.m1414n().mo744k();
            C0150c.m1415o().mo744k();
            nVar.mo342f();
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public void mo735z() {
        f2614V = getWidthz();
        f2616W = getHeightz();
        C0178n.f2966d = C0177m.f2930G.mo913e() + 8;
        f2627d0 = new C0136u();
        f2629e0 = new C0140y();
        new C0173i("vCurrPopup");
        f2621a0 = f2614V / 2;
        f2623b0 = f2616W / 2;
        boolean z = true;
        if (mo756c()) {
            f2659x = true;
            int i = f2614V;
            if (i >= 240) {
                f2661y = true;
            }
            if (i < 320) {
                f2663z = true;
            }
        }
        f2639j0 = new C0139x();
        if (f2616W <= 160) {
            C0059e0.f791c = 15;
            C0178n.f2968f = 17;
        }
        int i2 = f2614V;
        int i3 = f2616W;
        if (i2 <= i3) {
            i2 = i3;
        }
        C0126k.f1864H1 = i2 + 20;
        f2572A = this;
        System.gc();
        mo722A();
        mo723I();
        mo724J();
        f2630e1 = C0161h.m1494l("/mainImage/myTexture2df.png");
        int d = C0149b.m1399d("clienttype");
        if (d != -1) {
            if (d > 7) {
                C0149b.m1403h("clienttype", C0161h.f2758f);
            } else {
                C0161h.f2758f = d;
            }
        }
        if (C0161h.f2758f == 7 && (C0149b.m1400e("fake") == null || C0149b.m1400e("fake") == "")) {
            f2630e1 = C0161h.m1494l("/mainImage/wait.png");
        }
        f2652t0 = new C0173i("vDebugUpdate");
        f2654u0 = new C0173i("vDeBugPait");
        f2656v0 = new C0173i("vDebugSesion");
        for (int i4 = 0; i4 < 3; i4++) {
            C0143b[] bVarArr = f2664z0;
            bVarArr[i4] = C0161h.m1494l("/mainImage/myTexture2dbd" + i4 + ".png");
        }
        C0159f.m1451u(f2664z0[0]);
        C0159f.m1450t(f2664z0[0]);
        C0159f.m1451u(f2664z0[1]);
        C0159f.m1450t(f2664z0[1]);
        C0140y.f2374l2 = C0149b.m1399d("lowGraphic");
        f2649s = C0149b.m1399d("lowGraphic") == 1;
        boolean z2 = C0149b.m1399d("lowGraphic") == 2;
        f2651t = z2;
        if (z2) {
            f2649s = true;
        }
        if (C0149b.m1399d("serverchat") == 1) {
            z = false;
        }
        C0126k.f2009o5 = z;
        C0111c0.m583j();
        C0174j.m1559g();
        C0067i0.m241c();
        C0140y.f2350E2 = 176;
        int i5 = f2614V;
        if (176 > i5) {
            C0140y.f2350E2 = i5;
        }
        f2638i1 = new C0113d0();
        f2617W0 = C0161h.m1494l("/mainImage/12+.png");
        for (int i6 = 0; i6 < 7; i6++) {
            C0143b[] bVarArr2 = f2648r0;
            bVarArr2[i6] = C0161h.m1494l("/effectdata/blue/" + i6 + ".png");
            C0143b[] bVarArr3 = f2650s0;
            bVarArr3[i6] = C0161h.m1494l("/effectdata/violet/" + i6 + ".png");
        }
    }
}
