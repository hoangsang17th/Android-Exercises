package p001b;

import java.util.Random;
import java.util.Vector;
import p013g.C0111c0;
import p018i.C0145a;
import p019j.C0159f;

/* renamed from: b.h */
public class C0012h {

    /* renamed from: a */
    static int f171a;

    /* renamed from: b */
    static int f172b;

    /* renamed from: c */
    static Random f173c = new Random();

    /* renamed from: d */
    static Vector f174d = new Vector();

    /* renamed from: e */
    static int f175e;

    /* renamed from: f */
    static int f176f;

    /* renamed from: g */
    static int f177g;

    /* renamed from: h */
    static int f178h;

    /* renamed from: i */
    static int f179i;

    /* renamed from: j */
    static int f180j;

    /* renamed from: k */
    static int f181k;

    /* renamed from: l */
    static float f182l;

    /* renamed from: m */
    static int[] f183m = new int[3];

    /* renamed from: n */
    static int[] f184n = new int[3];

    /* renamed from: o */
    static boolean f185o = false;

    /* renamed from: p */
    static long f186p = 0;

    /* renamed from: q */
    static long f187q = 150;

    /* renamed from: a */
    public static void m74a() {
        f179i = 0;
        f181k = 16;
        f180j = 0;
        f182l = 0.0f;
        for (int i = 0; i < 3; i++) {
            f184n[i] = 0;
            f183m[i] = f178h;
        }
        f185o = true;
    }

    /* renamed from: b */
    public static void m75b() {
        int[] iArr = f184n;
        iArr[2] = iArr[1];
        int[] iArr2 = f183m;
        iArr2[2] = iArr2[1];
        iArr[1] = iArr[0];
        iArr2[1] = iArr2[0];
        iArr[0] = f176f;
        iArr2[0] = f175e;
        double d = (double) f177g;
        Double.isNaN(d);
        double cos = Math.cos((d * 3.141592653589793d) / 180.0d);
        int i = f181k;
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = cos * d2;
        double d4 = (double) f180j;
        Double.isNaN(d4);
        f175e = ((int) (d3 * d4)) + f178h;
        double d5 = (double) i;
        double d6 = (double) f177g;
        Double.isNaN(d6);
        double sin = Math.sin((d6 * 3.141592653589793d) / 180.0d);
        Double.isNaN(d5);
        double d7 = d5 * sin;
        int i2 = f180j;
        double d8 = (double) i2;
        Double.isNaN(d8);
        double d9 = d7 * d8;
        double d10 = (double) (((f182l * ((float) i2)) * ((float) i2)) / 2.0f);
        Double.isNaN(d10);
        f176f = ((int) (d9 - d10)) + f179i;
        if (m79f() - f186p >= f187q) {
            f180j++;
            f186p = m79f();
        }
    }

    /* renamed from: c */
    public static void m76c(int i) {
        int i2;
        if (i != -5 || f185o) {
            if (i == -7 && !f185o) {
                f177g = 60;
                i2 = 0;
            } else if (i == -6 && !f185o) {
                f177g = 120;
                i2 = f171a;
            } else {
                return;
            }
            f178h = i2;
        } else {
            f178h = f171a / 2;
            f177g = 80;
        }
        f185o = true;
        m74a();
    }

    /* renamed from: d */
    public static void m77d(C0159f fVar) {
        m78e();
        fVar.mo772D(0);
        fVar.mo783l(0, 0, f171a, f172b);
        fVar.mo772D(16711680);
        for (int i = 0; i < f174d.size(); i++) {
            ((C0013i) f174d.elementAt(i)).mo30a(fVar);
        }
        if (!f185o) {
            m76c(-(Math.abs(f173c.nextInt() % 3) + 5));
        }
    }

    /* renamed from: e */
    public static void m78e() {
        if (f185o) {
            m75b();
        }
        if (f180j > 32 && f185o) {
            f185o = false;
            f174d.removeAllElements();
            Vector vector = f174d;
            int n = C0111c0.m587n(50, C0145a.f2614V - 50);
            int i = C0145a.f2616W;
            vector.addElement(new C0013i(n, C0111c0.m587n(i - 100, i), 5, 72));
        }
    }

    /* renamed from: f */
    public static long m79f() {
        return System.currentTimeMillis();
    }
}
