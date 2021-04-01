package p020k;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import p011e.C0057d1;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0140y;
import p018i.C0145a;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0155d;
import p019j.C0161h;

/* renamed from: k.k */
public class C0175k {

    /* renamed from: A */
    public static int f2855A = 21;

    /* renamed from: B */
    public static int f2856B = 22;

    /* renamed from: C */
    public static int f2857C = 23;

    /* renamed from: D */
    public static int f2858D = 24;

    /* renamed from: E */
    public static int f2859E = 25;

    /* renamed from: F */
    public static int f2860F = 26;

    /* renamed from: G */
    public static int f2861G = 27;

    /* renamed from: H */
    public static int f2862H = 28;

    /* renamed from: I */
    public static int f2863I = 29;

    /* renamed from: b */
    public static C0175k f2864b = null;

    /* renamed from: c */
    public static int f2865c = 0;

    /* renamed from: d */
    public static int f2866d = 1;

    /* renamed from: e */
    public static int f2867e = 2;

    /* renamed from: f */
    public static int f2868f = 0;

    /* renamed from: g */
    public static int f2869g = 1;

    /* renamed from: h */
    public static int f2870h = 2;

    /* renamed from: i */
    public static int f2871i = 3;

    /* renamed from: j */
    public static int f2872j = 4;

    /* renamed from: k */
    public static int f2873k = 5;

    /* renamed from: l */
    public static int f2874l = 6;

    /* renamed from: m */
    public static int f2875m = 7;

    /* renamed from: n */
    public static int f2876n = 8;

    /* renamed from: o */
    public static int f2877o = 9;

    /* renamed from: p */
    public static int f2878p = 10;

    /* renamed from: q */
    public static int f2879q = 11;

    /* renamed from: r */
    public static int f2880r = 12;

    /* renamed from: s */
    public static int f2881s = 13;

    /* renamed from: t */
    public static int f2882t = 14;

    /* renamed from: u */
    public static int f2883u = 15;

    /* renamed from: v */
    public static int f2884v = 16;

    /* renamed from: w */
    public static int f2885w = 17;

    /* renamed from: x */
    public static int f2886x = 18;

    /* renamed from: y */
    public static int f2887y = 19;

    /* renamed from: z */
    public static int f2888z = 20;

    /* renamed from: a */
    public int f2889a = 0;

    /* renamed from: p */
    public static C0175k m1563p() {
        if (f2864b == null) {
            f2864b = new C0175k();
        }
        return f2864b;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: w */
    public static void m1564w(AssetManager assetManager) {
        C0155d.m1436g(assetManager);
    }

    /* renamed from: A */
    public void mo850A(int i) {
        int i2 = f2884v;
        if (i == 13) {
            i2 = f2882t;
        }
        C0155d.m1434e(i2, 0.2f);
        this.f2889a++;
    }

    /* renamed from: B */
    public void mo851B(float f) {
        if (C0145a.f2600O % 8 == 0) {
            C0155d.m1434e(f2858D, 0.2f);
            this.f2889a++;
        }
    }

    /* renamed from: C */
    public void mo852C() {
        C0155d.m1434e(f2860F, 0.3f);
        this.f2889a++;
    }

    /* renamed from: D */
    public void mo853D() {
        C0155d.m1434e(f2883u, 0.3f);
        this.f2889a++;
    }

    /* renamed from: E */
    public void mo854E() {
        int i = this.f2889a + 1;
        this.f2889a = i;
        if (i % 15 == 0) {
            C0155d.m1434e(f2887y, 0.5f);
        }
    }

    /* renamed from: F */
    public void mo855F() {
        C0155d.m1434e(f2881s, 0.5f);
        this.f2889a++;
    }

    /* renamed from: G */
    public void mo856G() {
        C0155d.m1434e(f2875m, 0.5f);
        this.f2889a++;
    }

    /* renamed from: H */
    public void mo857H() {
        C0155d.m1434e(f2879q, 0.5f);
        this.f2889a++;
    }

    /* renamed from: I */
    public void mo858I() {
        C0155d.m1434e(f2874l, 0.5f);
        this.f2889a++;
    }

    /* renamed from: J */
    public void mo859J() {
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        if (mediaPlayerArr != null && mediaPlayerArr[f2865c].isPlaying()) {
            C0155d.f2730b[f2865c].pause();
        }
    }

    /* renamed from: K */
    public void mo860K() {
        C0155d.m1434e(f2862H, 0.5f);
    }

    /* renamed from: L */
    public void mo861L() {
        C0155d.m1434e(f2863I, 0.5f);
    }

    /* renamed from: M */
    public void mo862M() {
        if (C0155d.f2730b != null) {
            C0155d.m1433d(f2866d, 0.3f, true);
        }
    }

    /* renamed from: N */
    public void mo863N() {
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        if (mediaPlayerArr != null && !mediaPlayerArr[f2865c].isPlaying()) {
            C0155d.f2730b[f2865c].start();
        }
    }

    /* renamed from: O */
    public void mo864O() {
        boolean z = !C0145a.f2636h1;
        C0145a.f2636h1 = z;
        if (z) {
            C0140y.f2371i2[0] = C0057d1.f687m5;
            m1563p().mo894z(C0121h0.f1803v);
            C0149b.m1403h("isPlaySound", 1);
            return;
        }
        C0140y.f2371i2[0] = C0057d1.f694n5;
        m1563p().mo882l();
        C0149b.m1403h("isPlaySound", 0);
    }

    /* renamed from: P */
    public void mo865P() {
        C0155d.m1437h();
    }

    /* renamed from: Q */
    public void mo866Q() {
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        if (mediaPlayerArr != null && mediaPlayerArr[f2867e].isPlaying()) {
            C0155d.f2730b[f2867e].pause();
        }
    }

    /* renamed from: R */
    public void mo867R() {
        C0155d.m1434e(f2855A, 0.5f);
        this.f2889a++;
    }

    /* renamed from: S */
    public void mo868S() {
        C0155d.m1434e(f2887y, 1.0f);
        this.f2889a++;
    }

    /* renamed from: T */
    public void mo869T() {
        int i = this.f2889a;
        if (i >= 10 && !C0155d.f2735g) {
            C0155d.f2735g = true;
        }
        if (C0155d.f2735g) {
            int i2 = i + 1;
            this.f2889a = i2;
            if (i2 >= 20) {
                this.f2889a = 0;
                C0155d.f2735g = false;
            }
        }
    }

    /* renamed from: U */
    public void mo870U() {
        C0155d.m1434e(f2884v, 0.3f);
        this.f2889a++;
    }

    /* renamed from: a */
    public void mo871a() {
        C0155d.m1434e(f2888z, 0.5f);
        this.f2889a++;
    }

    /* renamed from: b */
    public void mo872b() {
        C0111c0.m584k("play air");
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        if (mediaPlayerArr != null && !mediaPlayerArr[f2865c].isPlaying()) {
            C0155d.m1433d(f2865c, 0.3f, false);
        }
    }

    /* renamed from: c */
    public void mo873c() {
        C0150c.m1414n().mo744k();
        C0145a.f2629e0.mo649h0();
        if (C0145a.f2633g0 == null) {
            C0145a.f2633g0 = new C0170f();
        }
        C0145a.f2633g0.mo831j();
        C0145a.f2633g0.mo342f();
    }

    /* renamed from: d */
    public void mo874d() {
        C0155d.m1434e(f2859E, 0.5f);
        this.f2889a++;
    }

    /* renamed from: e */
    public void mo875e() {
        C0155d.m1434e(f2876n, 0.5f);
        this.f2889a++;
    }

    /* renamed from: f */
    public void mo876f() {
        C0155d.m1434e(f2875m, 0.5f);
        this.f2889a++;
    }

    /* renamed from: g */
    public void mo877g() {
        C0155d.m1434e(f2869g, 0.2f);
        this.f2889a++;
    }

    /* renamed from: h */
    public void mo878h() {
        C0155d.m1434e(f2872j, 0.2f);
        this.f2889a++;
    }

    /* renamed from: i */
    public void mo879i() {
        C0155d.m1434e(f2869g, 0.2f);
        this.f2889a++;
    }

    /* renamed from: j */
    public void mo880j(boolean z, float f) {
        if (C0155d.f2731c != null) {
            int n = C0111c0.m587n(0, 3);
            C0155d.m1434e(z ? n == 0 ? f2871i : f2878p : n == 0 ? f2870h : f2877o, 0.1f);
            this.f2889a++;
        }
    }

    /* renamed from: k */
    public void mo881k(float f) {
        if (C0145a.f2600O % 8 == 0) {
            C0155d.m1434e(f2869g, f);
            this.f2889a++;
        }
    }

    /* renamed from: l */
    public void mo882l() {
        C0155d.f2734f = true;
        C0155d.m1437h();
        C0155d.m1435f();
        C0155d.f2731c = null;
        C0155d.f2730b = null;
    }

    /* renamed from: m */
    public void mo883m() {
        C0155d.m1434e(f2880r, 0.5f);
        this.f2889a++;
    }

    /* renamed from: n */
    public void mo884n() {
        C0155d.m1434e(f2885w, 0.5f);
        this.f2889a++;
    }

    /* renamed from: o */
    public void mo885o() {
        C0155d.m1434e(f2885w, 0.5f);
        this.f2889a++;
    }

    /* renamed from: q */
    public void mo886q() {
        C0155d.m1434e(f2868f, 0.3f);
        this.f2889a++;
    }

    /* renamed from: r */
    public void mo887r() {
        if (!C0161h.f2759g) {
            if (C0145a.f2633g0.f2821E) {
                C0140y.f2370h2 = new String[]{C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L, C0057d1.f419A};
                if (C0114e.m647e0().f1535b2) {
                    C0140y.f2370h2 = new String[]{C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f709q, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L, C0057d1.f419A};
                    return;
                }
                return;
            }
            C0140y.f2370h2 = new String[]{C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L};
            if (C0114e.m647e0().f1535b2) {
                C0140y.f2370h2 = new String[]{C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f709q, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L};
            }
        } else if (C0145a.f2633g0.f2821E) {
            C0140y.f2370h2 = new String[]{C0057d1.f427B0, C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L, C0057d1.f419A};
            if (C0114e.m647e0().f1535b2) {
                C0140y.f2370h2 = new String[]{C0057d1.f427B0, C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f709q, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L, C0057d1.f419A};
            }
        } else {
            C0140y.f2370h2 = new String[]{C0057d1.f427B0, C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L};
            if (C0114e.m647e0().f1535b2) {
                C0140y.f2370h2 = new String[]{C0057d1.f427B0, C0057d1.f611c, C0057d1.f498L1, C0057d1.f491K1, C0057d1.f709q, C0057d1.f484J1, C0057d1.f759x0, C0057d1.f477I1, C0057d1.f647h0, C0057d1.f505M1, C0057d1.f496L};
            }
        }
    }

    /* renamed from: s */
    public void mo888s() {
        String[] strArr = new String[3];
        strArr[0] = C0145a.f2636h1 ? C0057d1.f687m5 : C0057d1.f694n5;
        strArr[1] = C0126k.f1906R3 == 0 ? C0057d1.f765y : C0057d1.f772z;
        strArr[2] = C0145a.f2649s ? C0057d1.f737u : C0057d1.f723s;
        C0140y.f2371i2 = strArr;
    }

    /* renamed from: t */
    public void mo889t() {
        C0155d.m1434e(f2857C, 0.2f);
        this.f2889a++;
    }

    /* renamed from: u */
    public void mo890u() {
        C0155d.m1434e(f2861G, 0.3f);
        this.f2889a++;
    }

    /* renamed from: v */
    public void mo891v() {
        C0155d.m1434e(f2856B, 0.5f);
        this.f2889a++;
    }

    /* renamed from: x */
    public boolean mo892x() {
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        return mediaPlayerArr != null && mediaPlayerArr[f2865c].isPlaying();
    }

    /* renamed from: y */
    public boolean mo893y() {
        MediaPlayer[] mediaPlayerArr = C0155d.f2730b;
        return mediaPlayerArr != null && mediaPlayerArr[f2866d].isPlaying();
    }

    /* renamed from: z */
    public void mo894z(int i) {
        int[] iArr = {f2865c, f2866d, f2867e};
        int i2 = f2874l;
        C0155d.m1432c(iArr, new int[]{f2868f, f2869g, f2870h, f2871i, f2872j, f2873k, i2, f2875m, f2876n, f2877o, f2878p, i2, f2880r, f2881s, f2882t, f2883u, f2884v, f2885w, f2886x, f2887y, f2888z, f2855A, f2856B, f2857C, f2858D, f2859E, f2860F, f2861G, f2862H, f2863I});
    }
}
