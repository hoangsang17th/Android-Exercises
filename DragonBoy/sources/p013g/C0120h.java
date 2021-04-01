package p013g;

import java.io.DataInputStream;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0061f0;
import p011e.C0063g0;
import p011e.C0072l;
import p011e.C0094w;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0148a;
import p019j.C0150c;
import p019j.C0159f;
import p020k.C0165a;
import p020k.C0170f;
import p020k.C0174j;
import p020k.C0176l;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.h */
public class C0120h extends C0178n implements C0072l {

    /* renamed from: o */
    public static C0120h f1747o = null;

    /* renamed from: p */
    public static boolean f1748p = false;

    /* renamed from: q */
    public static C0176l f1749q;

    /* renamed from: r */
    public static int f1750r;

    /* renamed from: s */
    public static int f1751s;

    /* renamed from: t */
    public static int f1752t;

    /* renamed from: u */
    public static int[][] f1753u = {new int[]{64, 30, 31}, new int[]{9, 29, 32}, new int[]{6, 27, 28}};

    /* renamed from: v */
    public static int[] f1754v = {2, 13, 8};

    /* renamed from: w */
    public static int[] f1755w = {1, 12, 7};

    /* renamed from: i */
    int[] f1756i = {0, 4, 8};

    /* renamed from: j */
    int f1757j = 168;

    /* renamed from: k */
    int f1758k = 350;

    /* renamed from: l */
    int f1759l = 45;

    /* renamed from: m */
    int f1760m;

    /* renamed from: n */
    int f1761n;

    public C0120h() {
        try {
            if (!C0145a.m1339K()) {
                mo483m(new byte[]{39, 40, 41});
            }
            m813l(new byte[]{39, 40, 41});
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C0145a.f2614V <= 200) {
            C0126k.m902q1(128, 100);
            C0126k.f1955d5 = (C0145a.f2614V - 128) / 2;
            C0126k.f1951c5 = 10;
            this.f1758k += 15;
            this.f1759l -= 15;
        }
        f1750r = 1;
        C0176l lVar = new C0176l();
        f1749q = lVar;
        lVar.f2901c = C0145a.f2633g0.f2826i.f2901c;
        int i = C0145a.f2614V;
        if (i < 200) {
            f1749q.f2901c = 60;
        }
        C0176l lVar2 = f1749q;
        lVar2.f2902d = 26;
        if (i < 200) {
            lVar2.f2899a = C0126k.f1955d5 + 45;
            f1749q.f2900b = C0126k.f1951c5 + 12;
        } else {
            lVar2.f2899a = (i / 2) - (lVar2.f2901c / 2);
            lVar2.f2900b = 35;
        }
        if (!C0145a.f2659x) {
            f1749q.f2903e = true;
        }
        f1749q.mo903n(0);
        f1749q.f2905g = C0057d1.f689n0;
        if (f1749q.mo899f().equals("@")) {
            f1749q.mo906r(C0145a.f2633g0.f2826i.mo899f().substring(0, C0145a.f2633g0.f2826i.mo899f().indexOf("@")));
        }
        f1750r = 1;
        f1751s = 0;
        this.f2972b = new C0055d(C0057d1.f725s1, (C0072l) this, 8000, (Object) null);
        this.f2971a = new C0055d(C0057d1.f732t1, (C0072l) this, 8001, (Object) null);
        if (!C0145a.f2659x) {
            this.f2973c = f1749q.f2922x;
        }
    }

    /* renamed from: k */
    public static C0120h m812k() {
        if (f1747o == null) {
            f1747o = new C0120h();
        }
        return f1747o;
    }

    /* renamed from: l */
    public static void m813l(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            DataInputStream dataInputStream = new DataInputStream(C0148a.m1395a("/mymap/" + bArr[i]));
            C0094w.f1072a[i] = (char) dataInputStream.read();
            C0094w.f1073b[i] = (char) dataInputStream.read();
            C0094w.f1076e[i] = new int[dataInputStream.available()];
            for (int i2 = 0; i2 < C0094w.f1072a[i] * C0094w.f1073b[i]; i2++) {
                C0094w.f1076e[i][i2] = dataInputStream.read();
            }
            C0094w.f1077f[i] = new int[C0094w.f1076e[i].length];
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C0159f fVar2 = fVar;
        if (!C0114e.f1394y4) {
            C0145a.m1340L(fVar);
            fVar2.mo773E(-C0126k.f2028t1, -C0126k.f2032u1);
            int i5 = 1;
            if (!C0145a.m1339K()) {
                for (int i6 = 0; i6 < C0094w.f1078g[f1750r].size(); i6++) {
                    C0165a aVar = (C0165a) C0094w.f1078g[f1750r].elementAt(i6);
                    if (aVar.f2777c != -1 && aVar.f2782h == 1) {
                        aVar.mo819f(fVar2);
                    }
                }
            }
            C0121h0.m837q(fVar);
            int i7 = C0145a.f2614V == 128 ? 20 : 30;
            int[][] iArr = f1753u;
            int i8 = f1750r;
            int i9 = iArr[i8][f1751s];
            int i10 = f1754v[i8];
            int i11 = f1755w[i8];
            int i12 = 3;
            fVar2.mo776e(C0121h0.f1770I, this.f1757j, this.f1758k + this.f1759l, 3);
            C0061f0[] f0VarArr = C0126k.f1884M1;
            C0061f0 f0Var = f0VarArr[i9];
            C0061f0 f0Var2 = f0VarArr[i10];
            C0061f0 f0Var3 = f0VarArr[i11];
            C0063g0[] g0VarArr = f0Var.f796a;
            int[][][] iArr2 = C0114e.f1389t4;
            int i13 = this.f1761n;
            C0061f0 f0Var4 = f0Var3;
            C0174j.m1555c(fVar, g0VarArr[iArr2[i13][0][0]].f799a, this.f1757j + iArr2[i13][0][1] + g0VarArr[iArr2[i13][0][0]].f800b, (this.f1758k - iArr2[i13][0][2]) + g0VarArr[iArr2[i13][0][0]].f801c + this.f1759l, 0, 0);
            C0063g0[] g0VarArr2 = f0Var2.f796a;
            int i14 = this.f1761n;
            C0174j.m1555c(fVar, g0VarArr2[iArr2[i14][1][0]].f799a, this.f1757j + iArr2[i14][1][1] + g0VarArr2[iArr2[i14][1][0]].f800b, (this.f1758k - iArr2[i14][1][2]) + g0VarArr2[iArr2[i14][1][0]].f801c + this.f1759l, 0, 0);
            C0063g0[] g0VarArr3 = f0Var4.f796a;
            int i15 = this.f1761n;
            C0174j.m1555c(fVar, g0VarArr3[iArr2[i15][2][0]].f799a, this.f1757j + iArr2[i15][2][1] + g0VarArr3[iArr2[i15][2][0]].f800b, (this.f1758k - iArr2[i15][2][2]) + g0VarArr3[iArr2[i15][2][0]].f801c + this.f1759l, 0, 0);
            if (!C0145a.m1339K()) {
                for (int i16 = 0; i16 < C0094w.f1078g[f1750r].size(); i16++) {
                    C0165a aVar2 = (C0165a) C0094w.f1078g[f1750r].elementAt(i16);
                    if (aVar2.f2777c != -1 && aVar2.f2782h == 3) {
                        aVar2.mo819f(fVar2);
                    }
                }
            }
            fVar2.mo773E(-fVar.mo791x(), -fVar.mo792y());
            int i17 = C0145a.f2614V;
            if (i17 < 200) {
                C0145a.f2642l0.mo142b(C0126k.f1955d5, C0126k.f1951c5, C0126k.f1959e5, C0126k.f1964f5, fVar);
                C0063g0[] g0VarArr4 = f0Var.f796a;
                int[][][] iArr3 = C0114e.f1389t4;
                int i18 = i7 * 3;
                C0174j.m1555c(fVar, g0VarArr4[iArr3[0][0][0]].f799a, (C0145a.f2614V / 2) + iArr3[0][0][1] + g0VarArr4[iArr3[0][0][0]].f800b, (((C0126k.f1951c5 + 30) + i18) - iArr3[0][0][2]) + g0VarArr4[iArr3[0][0][0]].f801c + this.f1759l, 0, 0);
                C0063g0[] g0VarArr5 = f0Var2.f796a;
                C0174j.m1555c(fVar, g0VarArr5[iArr3[0][1][0]].f799a, (C0145a.f2614V / 2) + iArr3[0][1][1] + g0VarArr5[iArr3[0][1][0]].f800b, (((C0126k.f1951c5 + 30) + i18) - iArr3[0][1][2]) + g0VarArr5[iArr3[0][1][0]].f801c + this.f1759l, 0, 0);
                C0063g0[] g0VarArr6 = f0Var4.f796a;
                C0174j.m1555c(fVar, g0VarArr6[iArr3[0][2][0]].f799a, (C0145a.f2614V / 2) + iArr3[0][2][1] + g0VarArr6[iArr3[0][2][0]].f800b, (((C0126k.f1951c5 + 30) + i18) - iArr3[0][2][2]) + g0VarArr6[iArr3[0][2][0]].f801c + this.f1759l, 0, 0);
                int i19 = 0;
                while (i19 < C0057d1.f434C0.length) {
                    if (f1752t == i19) {
                        int i20 = i19 * i7;
                        fVar.mo779h(C0126k.f2039v4, 0, 0, 13, 16, 2, (C0145a.f2600O % 7 > i12 ? 1 : 0) + C0126k.f1955d5 + 10, C0126k.f1951c5 + 35 + i20, C0117f0.f1680f);
                        fVar.mo779h(C0126k.f2039v4, 0, 0, 13, 16, 0, ((C0126k.f1955d5 + C0126k.f1959e5) - 10) - (C0145a.f2600O % 7 > 3 ? 1 : 0), C0126k.f1951c5 + 35 + i20, C0117f0.f1680f);
                    }
                    C0177m.f2951s.mo909a(fVar, C0057d1.f434C0[i19], C0126k.f1955d5 + 20, C0126k.f1951c5 + 30 + (i19 * i7), 0);
                    i19++;
                    i12 = 3;
                }
                C0177m.f2951s.mo909a(fVar, C0057d1.f441D0[f1750r], C0126k.f1955d5 + 70, (i7 * 1) + C0126k.f1951c5 + 30, 0);
                C0177m.f2951s.mo909a(fVar, C0057d1.f610b5[f1750r][f1751s], C0126k.f1955d5 + 55, C0126k.f1951c5 + 30 + (i7 * 2), 0);
            } else {
                if (i17 > C0145a.f2616W) {
                    i2 = 100;
                    i = 45;
                } else {
                    i2 = 110;
                    i = 60;
                }
                int i21 = 0;
                while (i21 < 3) {
                    if (i21 != f1750r) {
                        fVar2.mo776e(C0126k.f2054z3, ((C0145a.f2614V / 2) - 78) + (i21 * 78), i2, 3);
                        i4 = i21;
                    } else {
                        if (f1752t == 1) {
                            i4 = i21;
                            fVar.mo779h(C0126k.f2039v4, 0, 0, 13, 16, 4, (i21 * 78) + ((C0145a.f2614V / 2) - 78), (C0145a.f2600O % 7 > 3 ? 1 : 0) + (i2 - 20), C0117f0.f1680f);
                        } else {
                            i4 = i21;
                        }
                        fVar2.mo776e(C0126k.f1838A3, ((C0145a.f2614V / 2) - 78) + (i4 * 78), i2, 3);
                    }
                    C0177m.f2951s.mo909a(fVar, C0057d1.f441D0[i4], ((C0145a.f2614V / 2) - 78) + (i4 * 78), i2 - 5, 2);
                    i21 = i4 + 1;
                }
                int i22 = 0;
                while (i22 < 3) {
                    if (i22 != f1751s) {
                        fVar2.mo776e(C0126k.f2054z3, ((C0145a.f2614V / 2) - 78) + (i22 * 78), i2 + i, 3);
                        i3 = i22;
                    } else {
                        if (f1752t == 2) {
                            i3 = i22;
                            fVar.mo779h(C0126k.f2039v4, 0, 0, 13, 16, 4, (i22 * 78) + ((C0145a.f2614V / 2) - 78), (C0145a.f2600O % 7 > 3 ? 1 : 0) + ((i2 + i) - 20), C0117f0.f1680f);
                        } else {
                            i3 = i22;
                        }
                        fVar2.mo776e(C0126k.f1838A3, ((C0145a.f2614V / 2) - 78) + (i3 * 78), i2 + i, 3);
                    }
                    C0177m.f2951s.mo909a(fVar, C0057d1.f610b5[f1750r][i3], ((C0145a.f2614V / 2) - 78) + (i3 * 78), (i2 + i) - 5, 2);
                    i22 = i3 + 1;
                }
                if (f1752t == 0) {
                    C0143b bVar = C0126k.f2039v4;
                    int i23 = C0145a.f2614V / 2;
                    if (C0145a.f2600O % 7 <= 3) {
                        i5 = 0;
                    }
                    fVar.mo779h(bVar, 0, 0, 13, 16, 4, i23, i5 + 20, C0117f0.f1680f);
                }
            }
            f1749q.mo901l(fVar2);
            fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            C0177m mVar = C0177m.f2948p;
            mVar.mo910b(fVar, C0057d1.f420A0 + " " + C0170f.f2811P, 5, 5, 0, C0177m.f2951s);
            super.mo341d(fVar);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i != 8000) {
            if (i != 8001) {
                if (i == 10019) {
                    C0150c.m1414n().mo744k();
                    C0145a.m1366v();
                } else if (i == 10020) {
                    C0145a.m1366v();
                    return;
                } else {
                    return;
                }
            } else if (C0145a.f2633g0.f2821E) {
                C0145a.m1354c0(C0057d1.f460F5, new C0055d(C0057d1.f634f1, (C0072l) this, 10019, (Object) null), new C0055d(C0057d1.f641g1, (C0072l) this, 10020, (Object) null));
                return;
            } else {
                C0150c.m1414n().mo744k();
            }
            C0145a.f2638i1.mo342f();
        } else if (f1749q.mo899f().equals("")) {
            C0145a.m1349X(C0057d1.f661j0);
        } else if (f1749q.mo899f().length() < 5) {
            C0145a.m1349X(C0057d1.f668k0);
        } else if (f1749q.mo899f().length() > 15) {
            C0145a.m1349X(C0057d1.f675l0);
        } else {
            C0130o.m1008d();
            C0105d M = C0105d.m365M();
            String f = f1749q.mo899f();
            int i2 = f1750r;
            M.mo220F(f, i2, f1753u[i2][f1751s]);
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0170f.f2805J = false;
        C0145a.f2627d0.f2239a = false;
        C0145a.m1366v();
        super.mo342f();
        f1750r = C0111c0.m587n(0, 3);
        f1751s = C0111c0.m587n(0, 3);
        mo482j();
        C0114e.f1394y4 = false;
        C0176l lVar = f1749q;
        if (lVar != null) {
            lVar.f2905g = C0057d1.f689n0;
        }
    }

    /* renamed from: h */
    public void mo343h() {
        int i = this.f1760m + 1;
        this.f1760m = i;
        if (i > 30) {
            this.f1760m = 0;
        }
        if (this.f1760m % 15 < 5) {
            this.f1761n = 0;
        } else {
            this.f1761n = 1;
        }
        f1749q.mo908t();
        if (f1752t != 0) {
            f1749q.f2903e = false;
        }
    }

    /* renamed from: i */
    public void mo344i() {
        if (C0145a.f2574B[2]) {
            int i = f1752t - 1;
            f1752t = i;
            if (i < 0) {
                f1752t = C0057d1.f434C0.length - 1;
            }
        }
        if (C0145a.f2574B[8]) {
            int i2 = f1752t + 1;
            f1752t = i2;
            if (i2 >= C0057d1.f434C0.length) {
                f1752t = 0;
            }
        }
        if (f1752t == 0) {
            if (!C0145a.f2659x) {
                this.f2973c = f1749q.f2922x;
            }
            f1749q.mo908t();
        }
        if (f1752t == 1) {
            if (C0145a.f2574B[4]) {
                int i3 = f1750r - 1;
                f1750r = i3;
                if (i3 < 0) {
                    f1750r = C0057d1.f441D0.length - 1;
                }
                mo482j();
            }
            if (C0145a.f2574B[6]) {
                int i4 = f1750r + 1;
                f1750r = i4;
                if (i4 > C0057d1.f441D0.length - 1) {
                    f1750r = 0;
                }
                mo482j();
            }
            this.f2973c = null;
        }
        if (f1752t == 2) {
            if (C0145a.f2574B[4]) {
                int i5 = f1751s - 1;
                f1751s = i5;
                if (i5 < 0) {
                    f1751s = C0057d1.f610b5[0].length - 1;
                }
            }
            if (C0145a.f2574B[6]) {
                int i6 = f1751s + 1;
                f1751s = i6;
                if (i6 > C0057d1.f610b5[0].length - 1) {
                    f1751s = 0;
                }
            }
            this.f2973c = null;
        }
        if (C0145a.f2582F) {
            int i7 = 110;
            int i8 = 60;
            if (C0145a.f2614V > C0145a.f2616W) {
                i7 = 100;
                i8 = 40;
            }
            if (C0145a.m1336F((C0145a.f2614V / 2) - 117, 15, 234, 80)) {
                f1752t = 0;
                f1749q.f2903e = true;
            }
            int i9 = i7 - 30;
            if (C0145a.m1336F((C0145a.f2614V / 2) - 117, i9, 234, i8 + 5)) {
                f1752t = 1;
                int i10 = f1750r;
                int i11 = (C0145a.f2586H - ((C0145a.f2614V / 2) - 117)) / 78;
                f1750r = i11;
                if (i11 < 0) {
                    f1750r = 0;
                }
                int i12 = f1750r;
                String[] strArr = C0057d1.f441D0;
                if (i12 > strArr.length - 1) {
                    f1750r = strArr.length - 1;
                }
                if (i10 != f1750r) {
                    mo482j();
                }
            }
            if (C0145a.m1336F((C0145a.f2614V / 2) - 117, i9 + i8 + 5, 234, 65)) {
                f1752t = 2;
                int i13 = f1751s;
                int i14 = (C0145a.f2586H - ((C0145a.f2614V / 2) - 117)) / 78;
                f1751s = i14;
                if (i14 < 0) {
                    f1751s = 0;
                }
                int i15 = f1751s;
                String[][] strArr2 = C0057d1.f610b5;
                if (i15 > strArr2[0].length - 1) {
                    f1751s = strArr2[0].length - 1;
                }
                if (i13 != f1752t) {
                    mo482j();
                }
            }
        }
        super.mo344i();
        C0145a.m1358m();
        C0145a.m1359n();
    }

    /* renamed from: j */
    public void mo482j() {
        C0121h0.f1788g = new int[C0094w.f1076e[f1750r].length];
        for (int i = 0; i < C0094w.f1076e[f1750r].length; i++) {
            C0121h0.f1788g[i] = C0094w.f1076e[f1750r][i];
        }
        C0121h0.f1789h = C0094w.f1077f[f1750r];
        C0121h0.f1785d = C0094w.f1075d[f1750r];
        C0121h0.f1784c = C0094w.f1074c[f1750r];
        C0121h0.f1786e = C0094w.f1074c[f1750r];
        C0121h0.f1782a = C0094w.f1072a[f1750r];
        C0121h0.f1783b = C0094w.f1073b[f1750r];
        C0121h0.f1786e = this.f1756i[f1750r] + 1;
        C0121h0.m830j();
        C0145a.m1338H(this.f1756i[f1750r]);
        C0126k.m855A0(false, this.f1757j, this.f1758k);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|(1:18)|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0158, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0159, code lost:
        r14.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00c6 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e0 A[Catch:{ Exception -> 0x0158 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo483m(byte[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = ".png"
            java.lang.String r1 = "/mapBackGround/"
            java.lang.String r2 = ""
            boolean r3 = p018i.C0145a.m1339K()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            r3 = 0
            r4 = 0
        L_0x000f:
            int r5 = r14.length     // Catch:{ Exception -> 0x0158 }
            if (r4 >= r5) goto L_0x015c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r5.<init>()     // Catch:{ Exception -> 0x0158 }
            java.lang.String r6 = "/mymap/mapTable"
            r5.append(r6)     // Catch:{ Exception -> 0x0158 }
            byte r6 = r14[r4]     // Catch:{ Exception -> 0x0158 }
            r5.append(r6)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0158 }
            java.io.InputStream r5 = p019j.C0148a.m1395a(r5)     // Catch:{ Exception -> 0x0158 }
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0158 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0158 }
            short r5 = r6.readShort()     // Catch:{ Exception -> 0x0158 }
            k.i[] r7 = p011e.C0094w.f1078g     // Catch:{ Exception -> 0x0158 }
            k.i r8 = new k.i     // Catch:{ Exception -> 0x0158 }
            java.lang.String r9 = "MapTemplate.vCurrItem[a] "
            r8.<init>(r9)     // Catch:{ Exception -> 0x0158 }
            r7[r4] = r8     // Catch:{ Exception -> 0x0158 }
            r7 = 0
        L_0x003e:
            if (r7 >= r5) goto L_0x0154
            short r8 = r6.readShort()     // Catch:{ Exception -> 0x0158 }
            short r9 = r6.readShort()     // Catch:{ Exception -> 0x0158 }
            short r10 = r6.readShort()     // Catch:{ Exception -> 0x0158 }
            k.a r11 = p013g.C0121h0.m821a(r8)     // Catch:{ Exception -> 0x0158 }
            if (r11 == 0) goto L_0x0150
            k.a r11 = p013g.C0121h0.m821a(r8)     // Catch:{ Exception -> 0x0158 }
            k.a r12 = new k.a     // Catch:{ Exception -> 0x0158 }
            r12.<init>()     // Catch:{ Exception -> 0x0158 }
            r12.f2775a = r8     // Catch:{ Exception -> 0x0158 }
            short r8 = r11.f2777c     // Catch:{ Exception -> 0x0158 }
            r12.f2777c = r8     // Catch:{ Exception -> 0x0158 }
            int r8 = r11.f2780f     // Catch:{ Exception -> 0x0158 }
            r12.f2780f = r8     // Catch:{ Exception -> 0x0158 }
            int r8 = r11.f2781g     // Catch:{ Exception -> 0x0158 }
            r12.f2781g = r8     // Catch:{ Exception -> 0x0158 }
            byte r8 = p013g.C0121h0.f1796o     // Catch:{ Exception -> 0x0158 }
            int r9 = r9 * r8
            r12.f2778d = r9     // Catch:{ Exception -> 0x0158 }
            int r10 = r10 * r8
            r12.f2779e = r10     // Catch:{ Exception -> 0x0158 }
            byte r8 = r11.f2782h     // Catch:{ Exception -> 0x0158 }
            r12.f2782h = r8     // Catch:{ Exception -> 0x0158 }
            k.i[] r8 = p011e.C0094w.f1078g     // Catch:{ Exception -> 0x0158 }
            r8 = r8[r4]     // Catch:{ Exception -> 0x0158 }
            r8.addElement(r12)     // Catch:{ Exception -> 0x0158 }
            k.h r8 = p020k.C0165a.f2769m     // Catch:{ Exception -> 0x0158 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r9.<init>()     // Catch:{ Exception -> 0x0158 }
            short r10 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r9.append(r10)     // Catch:{ Exception -> 0x0158 }
            r9.append(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0158 }
            boolean r8 = r8.containsKey(r9)     // Catch:{ Exception -> 0x0158 }
            if (r8 != 0) goto L_0x0120
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r8.<init>()     // Catch:{ Exception -> 0x00c6 }
            r8.append(r1)     // Catch:{ Exception -> 0x00c6 }
            short r9 = r12.f2777c     // Catch:{ Exception -> 0x00c6 }
            r8.append(r9)     // Catch:{ Exception -> 0x00c6 }
            r8.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00c6 }
            h.a.a.b r8 = p019j.C0161h.m1494l(r8)     // Catch:{ Exception -> 0x00c6 }
            k.h r9 = p020k.C0165a.f2769m     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r10.<init>()     // Catch:{ Exception -> 0x00c6 }
            short r11 = r12.f2777c     // Catch:{ Exception -> 0x00c6 }
            r10.append(r11)     // Catch:{ Exception -> 0x00c6 }
            r10.append(r2)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00c6 }
            r9.put(r10, r8)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x010a
        L_0x00c6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r8.<init>()     // Catch:{ Exception -> 0x0158 }
            r8.append(r1)     // Catch:{ Exception -> 0x0158 }
            short r9 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r8.append(r9)     // Catch:{ Exception -> 0x0158 }
            r8.append(r0)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0158 }
            h.a.a.b r8 = p019j.C0161h.m1495m(r8)     // Catch:{ Exception -> 0x0158 }
            if (r8 != 0) goto L_0x00f4
            r8 = 1
            int[] r9 = new int[r8]     // Catch:{ Exception -> 0x0158 }
            r10 = -2013265920(0xffffffff88000000, float:-3.85186E-34)
            r9[r3] = r10     // Catch:{ Exception -> 0x0158 }
            h.a.a.b r8 = p014h.p015a.p016a.C0143b.m1323c(r9, r8, r8, r8)     // Catch:{ Exception -> 0x0158 }
            f.d r9 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0158 }
            short r10 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r9.mo237O(r10)     // Catch:{ Exception -> 0x0158 }
        L_0x00f4:
            k.h r9 = p020k.C0165a.f2769m     // Catch:{ Exception -> 0x0158 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r10.<init>()     // Catch:{ Exception -> 0x0158 }
            short r11 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r10.append(r11)     // Catch:{ Exception -> 0x0158 }
            r10.append(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0158 }
            r9.put(r10, r8)     // Catch:{ Exception -> 0x0158 }
        L_0x010a:
            k.i r8 = p020k.C0165a.f2771o     // Catch:{ Exception -> 0x0158 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r9.<init>()     // Catch:{ Exception -> 0x0158 }
            short r10 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r9.append(r10)     // Catch:{ Exception -> 0x0158 }
            r9.append(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0158 }
            r8.addElement(r9)     // Catch:{ Exception -> 0x0158 }
        L_0x0120:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r8.<init>()     // Catch:{ Exception -> 0x0158 }
            short r9 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r8.append(r9)     // Catch:{ Exception -> 0x0158 }
            r8.append(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0158 }
            boolean r8 = p020k.C0165a.m1514c(r8)     // Catch:{ Exception -> 0x0158 }
            if (r8 != 0) goto L_0x014d
            k.i r8 = p020k.C0165a.f2770n     // Catch:{ Exception -> 0x0158 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
            r9.<init>()     // Catch:{ Exception -> 0x0158 }
            short r10 = r12.f2777c     // Catch:{ Exception -> 0x0158 }
            r9.append(r10)     // Catch:{ Exception -> 0x0158 }
            r9.append(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0158 }
            r8.addElement(r9)     // Catch:{ Exception -> 0x0158 }
        L_0x014d:
            r12.mo816a()     // Catch:{ Exception -> 0x0158 }
        L_0x0150:
            int r7 = r7 + 1
            goto L_0x003e
        L_0x0154:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0158:
            r14 = move-exception
            r14.printStackTrace()
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0120h.mo483m(byte[]):void");
    }
}
