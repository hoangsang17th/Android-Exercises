package p011e;

import p001b.C0007c;
import p001b.C0009e;
import p013g.C0114e;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0177m;

/* renamed from: e.x */
public class C0096x {

    /* renamed from: a */
    public static C0143b f1079a = C0161h.m1494l("/mainImage/myTexture2dmobCapcha.png");

    /* renamed from: b */
    public static int f1080b;

    /* renamed from: c */
    public static int f1081c;

    /* renamed from: d */
    public static int f1082d;

    /* renamed from: e */
    public static int f1083e;

    /* renamed from: f */
    public static int f1084f;

    /* renamed from: g */
    public static int f1085g;

    /* renamed from: h */
    public static int f1086h;

    /* renamed from: i */
    public static int f1087i;

    /* renamed from: j */
    public static boolean f1088j;

    /* renamed from: k */
    public static int f1089k = 0;

    /* renamed from: l */
    public static boolean f1090l;

    /* renamed from: m */
    public static int f1091m;

    /* renamed from: n */
    public static int f1092n;

    /* renamed from: o */
    public static int f1093o;

    /* renamed from: p */
    public static boolean f1094p;

    /* renamed from: a */
    public static void m326a() {
        int i = f1081c;
        int i2 = f1080b;
        if (i != i2) {
            int i3 = (i2 - i) << 2;
            f1083e = i3;
            int i4 = f1082d + i3;
            f1082d = i4;
            f1081c = i + (i4 >> 4);
            f1082d = i4 & 15;
        }
        int i5 = f1085g;
        int i6 = f1084f;
        if (i5 != i6) {
            int i7 = (i6 - i5) << 2;
            f1087i = i7;
            int i8 = f1086h + i7;
            f1086h = i8;
            f1085g = i5 + (i8 >> 4);
            f1086h = i8 & 15;
        }
        int i9 = f1091m + 1;
        f1091m = i9;
        if (i9 == 5) {
            f1091m = 0;
            int i10 = f1092n + 1;
            f1092n = i10;
            if (i10 > 2) {
                f1092n = 0;
            }
        }
    }

    /* renamed from: b */
    public static void m327b(C0159f fVar, int i, int i2) {
        int i3;
        int i4 = 1;
        if (!f1094p) {
            if (C0145a.f2600O % 3 == 0) {
                if (C0114e.m647e0().f1633v == 1) {
                    f1084f = (i - 20) - C0126k.f2028t1;
                }
                if (C0114e.m647e0().f1633v == -1) {
                    f1084f = (i + 20) - C0126k.f2028t1;
                }
            }
            i3 = (C0114e.m647e0().f1598o - 40) - C0126k.f2032u1;
        } else {
            int i5 = f1089k + 1;
            f1089k = i5;
            if (i5 == 5) {
                f1094p = false;
                f1089k = 0;
            }
            f1084f = i - C0126k.f2028t1;
            i3 = i2 - C0126k.f2032u1;
        }
        f1080b = i3;
        if (f1085g > i - C0126k.f2028t1) {
            f1093o = -1;
        } else {
            f1093o = 1;
        }
        fVar.mo776e(C0126k.f2008o4, f1085g, f1081c - 40, 3);
        C0067i0.m243g(fVar, f1085g - 25, f1081c - 70, 50, 20, 16777215, false);
        C0177m.f2951s.mo909a(fVar, C0126k.m893c0().f2154y0, f1085g, f1081c - 65, 2);
        if (f1090l) {
            f1090l = false;
            C0007c.m43a(new C0009e(18, f1085g + C0126k.f2028t1, f1081c + C0126k.f2032u1, 2, 10, -1));
        }
        if (f1088j) {
            f1088j = false;
            C0007c.m43a(new C0009e(18, f1085g + C0126k.f2028t1, f1081c + C0126k.f2032u1, 2, 10, -1));
            C0126k.m893c0().f2056A = null;
            f1084f = -C0126k.f2028t1;
            f1080b = -C0126k.f2032u1;
        }
        C0143b bVar = f1079a;
        int i6 = f1092n * 40;
        int i7 = f1093o == 1 ? 0 : 2;
        int i8 = f1085g;
        int i9 = f1081c + 3;
        if (C0145a.f2600O % 10 <= 5) {
            i4 = 0;
        }
        fVar.mo779h(bVar, 0, i6, 40, 40, i7, i8, i9 + i4, 3);
        m326a();
    }
}
