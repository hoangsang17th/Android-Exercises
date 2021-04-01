package p011e;

import p018i.C0145a;
import p019j.C0159f;
import p020k.C0177m;

/* renamed from: e.a1 */
public class C0048a1 {

    /* renamed from: a */
    public static int f340a = 0;

    /* renamed from: b */
    public static int f341b = 0;

    /* renamed from: c */
    public static int f342c = 0;

    /* renamed from: d */
    public static boolean f343d = false;

    /* renamed from: e */
    public static String f344e = "";

    /* renamed from: a */
    public static void m211a(C0159f fVar, String str, int i, int i2, int i3, int i4, C0177m mVar) {
        int i5;
        int i6;
        if (f342c != mVar.mo914f(str) || !f344e.equals(str)) {
            f344e = str;
            f340a = 0;
            f342c = mVar.mo914f(str);
            f343d = false;
            f341b = 0;
        }
        fVar.mo771C(i, i2, i3, i4);
        fVar.mo770B();
        fVar.mo774a(i, i2, i3, i4);
        if (f342c > i3) {
            i6 = i - f340a;
            i5 = 0;
        } else {
            i6 = i + (i3 / 2);
            i5 = 2;
        }
        mVar.mo909a(fVar, str, i6, i2, i5);
        C0159f.m1454z(fVar);
        fVar.mo769A();
        C0145a.m1346T(fVar);
        int i7 = f342c;
        if (i7 <= i3) {
            return;
        }
        if (!f343d) {
            int i8 = f341b + 1;
            f341b = i8;
            if (i8 > 50) {
                int i9 = f340a + 1;
                f340a = i9;
                if (i9 >= i7) {
                    f341b = 0;
                    f340a = (-i3) + 30;
                    f343d = true;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = f340a;
        if (i10 < 0) {
            f340a = i10 + ((i3 + i10) >> 1);
        }
        if (f340a > 0) {
            f340a = 0;
        }
        if (f340a == 0) {
            int i11 = f341b + 1;
            f341b = i11;
            if (i11 == 50) {
                f341b = 0;
                f343d = false;
            }
        }
    }

    /* renamed from: b */
    public static void m212b() {
        f340a = 0;
        f341b = 0;
        f343d = false;
    }
}
