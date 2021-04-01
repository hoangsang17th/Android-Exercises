package p013g;

import p011e.C0057d1;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0149b;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0170f;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.e0 */
public class C0115e0 extends C0178n {

    /* renamed from: j */
    public static int f1658j = 0;

    /* renamed from: k */
    public static int f1659k = -1;

    /* renamed from: l */
    public static int f1660l = -1;

    /* renamed from: m */
    public static C0115e0 f1661m;

    /* renamed from: n */
    public static C0143b f1662n = C0161h.m1494l("/gamelogo.png");

    /* renamed from: i */
    boolean f1663i = false;

    public C0115e0() {
        f1661m = this;
    }

    /* renamed from: j */
    public static void m774j() {
        String str;
        int i;
        int i2;
        if (C0149b.m1399d("svselect") == -1) {
            if (C0057d1.f680l5 > 0) {
                i2 = 0;
                for (int i3 = 0; i3 < C0057d1.f680l5; i3++) {
                    i2 += C0113d0.f1342C[i3];
                }
            } else {
                i2 = 0;
            }
            byte b = C0113d0.f1356n;
            if (b == -1) {
                C0113d0.f1343D = i2 + C0111c0.m587n(0, C0113d0.f1342C[C0057d1.f680l5]);
            } else {
                C0113d0.f1343D = b;
            }
            C0149b.m1403h("svselect", C0113d0.f1343D);
            C0146b.f2673a = C0113d0.f1355m[C0113d0.f1343D];
            C0146b.f2674b = C0113d0.f1358p[C0113d0.f1343D];
            C0057d1.m229a(C0113d0.f1361s[C0113d0.f1343D]);
            str = C0113d0.f1354l[C0113d0.f1343D];
        } else {
            int d = C0149b.m1399d("svselect");
            C0113d0.f1343D = d;
            String[] strArr = C0113d0.f1354l;
            if (d > strArr.length - 1) {
                int length = strArr.length - 1;
                C0113d0.f1343D = length;
                C0149b.m1403h("svselect", length);
            }
            String e = C0149b.m1400e("acc");
            String e2 = C0149b.m1400e("userAo" + C0113d0.f1343D);
            if ((e == null || e.equals("")) && (e2 == null || e2.equals(""))) {
                if (C0057d1.f680l5 > 0) {
                    i = 0;
                    for (int i4 = 0; i4 < C0057d1.f680l5; i4++) {
                        i += C0113d0.f1342C[i4];
                    }
                } else {
                    i = 0;
                }
                if (C0113d0.f1356n == -1) {
                    C0113d0.f1343D = i + C0111c0.m587n(0, C0113d0.f1342C[C0057d1.f680l5]);
                }
            }
            C0146b.f2673a = C0113d0.f1355m[C0113d0.f1343D];
            C0146b.f2674b = C0113d0.f1358p[C0113d0.f1343D];
            C0057d1.m229a(C0113d0.f1361s[C0113d0.f1343D]);
            str = C0113d0.f1354l[C0113d0.f1343D];
        }
        C0170f.f2811P = str;
        C0145a.m1360o();
    }

    /* renamed from: k */
    public static void m775k() {
        f1658j = 0;
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        fVar.mo772D(0);
        fVar.mo783l(0, 0, C0145a.f2614V, C0145a.f2616W);
        if (f1662n != null && f1658j < 30) {
            int i = C0161h.f2758f;
            if (i == 3 || i == 5) {
                fVar.mo772D(16777215);
                fVar.mo783l(0, 0, C0145a.f2614V, C0145a.f2616W);
            }
            fVar.mo776e(f1662n, C0145a.f2614V / 2, C0145a.f2616W / 2, 3);
        }
        if (f1659k != -1) {
            fVar.mo776e(C0170f.f2812Q, C0145a.f2614V / 2, (C0145a.f2616W / 2) - 24, C0117f0.f1677c);
            C0145a.m1343P(C0145a.f2621a0, (C0145a.f2616W / 2) + 24, fVar);
            C0177m mVar = C0177m.f2948p;
            mVar.mo909a(fVar, C0057d1.f738u0 + ((f1659k * 100) / f1660l) + "%", C0145a.f2614V / 2, C0145a.f2616W / 2, 2);
        } else if (f1658j >= 30) {
            C0145a.m1343P(C0145a.f2621a0, C0145a.f2623b0, fVar);
        }
    }

    /* renamed from: h */
    public void mo343h() {
        if (f1658j == 30 && !this.f1663i) {
            this.f1663i = true;
            if (C0149b.m1399d("isPlaySound") != -1) {
                C0145a.f2636h1 = C0149b.m1399d("isPlaySound") == 1;
            }
            if (C0145a.f2636h1) {
                C0175k.m1563p().mo894z(C0121h0.f1803v);
            }
            C0175k.m1563p().mo888s();
            C0113d0.m631o();
        }
        f1658j++;
    }
}
