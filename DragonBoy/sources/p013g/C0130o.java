package p013g;

import p011e.C0057d1;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0177m;

/* renamed from: g.o */
public class C0130o {

    /* renamed from: a */
    public static boolean f2161a;

    /* renamed from: b */
    private static String f2162b;

    /* renamed from: c */
    private static String f2163c;

    /* renamed from: d */
    public static int f2164d;

    /* renamed from: e */
    public static boolean f2165e;

    /* renamed from: a */
    public static void m1005a() {
        f2162b = "";
        f2163c = null;
        f2165e = false;
        f2164d = 0;
        f2161a = false;
    }

    /* renamed from: b */
    public static void m1006b(C0159f fVar) {
        if (f2161a) {
            if ((!f2165e || f2164d <= 4990) && !C0126k.f1966g2) {
                C0145a.f2642l0.mo144d(C0145a.f2621a0 - 75, 10, 150, 55, fVar);
                if (f2165e) {
                    C0145a.m1343P((C0145a.f2621a0 - (C0177m.f2930G.mo914f(f2162b) / 2)) - 10, 38, fVar);
                    C0177m.f2930G.mo909a(fVar, f2162b, C0145a.f2621a0 + 5, 31, 2);
                } else if (f2163c != null) {
                    C0177m.f2930G.mo909a(fVar, f2162b, C0145a.f2621a0, 23, 2);
                    C0177m.f2958z.mo909a(fVar, f2163c, C0145a.f2621a0, 40, 2);
                } else {
                    C0177m.f2930G.mo909a(fVar, f2162b, C0145a.f2621a0, 31, 2);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m1007c(String str, String str2, int i) {
        if (str != null) {
            f2161a = true;
            f2162b = str;
            f2163c = str2;
            f2164d = i;
        }
    }

    /* renamed from: d */
    public static void m1008d() {
        m1007c(C0057d1.f724s0, (String) null, 1000);
        f2165e = true;
    }

    /* renamed from: e */
    public static void m1009e() {
        int i = f2164d;
        if (i > 0) {
            int i2 = i - 1;
            f2164d = i2;
            if (i2 == 0) {
                m1005a();
            }
        }
    }
}
