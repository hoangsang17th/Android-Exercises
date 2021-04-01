package p013g;

import p001b.C0006b;
import p001b.C0016l;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0167c;
import p020k.C0173i;
import p020k.C0174j;
import p020k.C0175k;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.a0 */
public class C0107a0 extends C0178n {

    /* renamed from: A */
    static C0143b f1176A;

    /* renamed from: B */
    static C0143b f1177B;

    /* renamed from: C */
    static C0143b f1178C;

    /* renamed from: D */
    static C0143b f1179D;

    /* renamed from: E */
    static C0143b f1180E;

    /* renamed from: F */
    static C0143b f1181F;

    /* renamed from: G */
    static C0143b f1182G;

    /* renamed from: H */
    static C0143b f1183H;

    /* renamed from: I */
    static C0143b f1184I;

    /* renamed from: J */
    static C0143b f1185J;

    /* renamed from: K */
    static C0143b f1186K;

    /* renamed from: L */
    static C0143b f1187L;

    /* renamed from: M */
    static C0143b[] f1188M;

    /* renamed from: N */
    public static int f1189N;

    /* renamed from: O */
    public static int f1190O;

    /* renamed from: P */
    public static int f1191P;

    /* renamed from: Q */
    public static int f1192Q;

    /* renamed from: R */
    public static int f1193R;

    /* renamed from: S */
    public static int f1194S;

    /* renamed from: T */
    public static int f1195T;

    /* renamed from: U */
    public static int f1196U;

    /* renamed from: V */
    public static int f1197V;

    /* renamed from: W */
    public static int f1198W;

    /* renamed from: X */
    public static int f1199X;

    /* renamed from: Y */
    public static int f1200Y;

    /* renamed from: Z */
    public static int[] f1201Z = new int[0];

    /* renamed from: a0 */
    public static int[] f1202a0 = new int[0];

    /* renamed from: b0 */
    static int[][] f1203b0;

    /* renamed from: c0 */
    static int[][] f1204c0;

    /* renamed from: d0 */
    static int[] f1205d0 = {-2, -1, 0, 1, 2};

    /* renamed from: e0 */
    public static C0173i f1206e0;

    /* renamed from: f0 */
    public static C0173i f1207f0;

    /* renamed from: g0 */
    static int f1208g0;

    /* renamed from: t */
    public static C0107a0 f1209t;

    /* renamed from: u */
    public static boolean f1210u;

    /* renamed from: v */
    public static C0016l f1211v;

    /* renamed from: w */
    public static C0016l f1212w;

    /* renamed from: x */
    public static C0016l f1213x;

    /* renamed from: y */
    static C0143b f1214y;

    /* renamed from: z */
    static C0143b f1215z;

    /* renamed from: i */
    int f1216i;

    /* renamed from: j */
    int[] f1217j;

    /* renamed from: k */
    int f1218k;

    /* renamed from: l */
    int f1219l;

    /* renamed from: m */
    int f1220m = 0;

    /* renamed from: n */
    C0133r f1221n;

    /* renamed from: o */
    int f1222o = 0;

    /* renamed from: p */
    int f1223p = 0;

    /* renamed from: q */
    int f1224q;

    /* renamed from: r */
    int f1225r;

    /* renamed from: s */
    int f1226s;

    public C0107a0() {
        f1210u = true;
        C0143b l = C0161h.m1494l("/radar/17.png");
        C0143b l2 = C0161h.m1494l("/radar/3.png");
        C0143b l3 = C0161h.m1494l("/radar/23.png");
        f1211v = new C0016l(l, 28, 28);
        f1212w = new C0016l(l2, 30, 30);
        f1213x = new C0016l(l3, 11, 11);
        f1214y = C0161h.m1494l("/radar/0.png");
        f1176A = C0161h.m1494l("/radar/1.png");
        f1177B = C0161h.m1494l("/radar/2.png");
        f1215z = C0161h.m1494l("/radar/17.png");
        f1178C = C0161h.m1494l("/radar/4.png");
        f1179D = C0161h.m1494l("/radar/5.png");
        f1180E = C0161h.m1494l("/radar/6.png");
        f1188M = new C0143b[7];
        for (int i = 0; i < 7; i++) {
            C0143b[] bVarArr = f1188M;
            bVarArr[i] = C0161h.m1494l("/radar/" + (i + 7) + ".png");
        }
        f1181F = C0161h.m1494l("/radar/14.png");
        f1182G = C0161h.m1494l("/radar/15.png");
        f1183H = C0161h.m1494l("/radar/16.png");
        f1215z = C0161h.m1494l("/radar/18.png");
        f1185J = C0161h.m1494l("/radar/19.png");
        f1186K = C0161h.m1494l("/radar/20.png");
        f1187L = C0161h.m1494l("/radar/21.png");
        f1184I = C0161h.m1494l("/radar/22.png");
        f1191P = 200;
        f1192Q = 219;
        f1189N = C0145a.f2621a0 - ((f1191P + 40) / 2);
        int i2 = C0145a.f2623b0;
        int i3 = f1192Q;
        int i4 = i2 - (i3 / 2);
        f1190O = i4;
        int i5 = f1189N;
        int i6 = f1191P;
        f1195T = (i5 + i6) - 81;
        f1196U = i4 + 29;
        f1197V = 120;
        f1199X = 80;
        int[] iArr = {i5 + 34, (i4 + i3) - 42};
        int i7 = f1190O;
        int i8 = f1192Q;
        int[] iArr2 = {(i5 + (i6 / 2)) - (f1178C.mo719i() / 2), (i8 / 2) + i7 + 33};
        int i9 = f1189N;
        int i10 = f1191P;
        f1203b0 = new int[][]{iArr, iArr2, new int[]{(i9 + i10) - 41, (i7 + i8) - 42}};
        f1204c0 = new int[][]{new int[]{i9 + 25, (i7 + i8) - 82}, new int[]{i9 + 57, (i7 + i8) - 62}, new int[]{((i10 / 2) + i9) - 14, (i7 + i8) - 102}, new int[]{((i9 + i10) - 57) - 28, (i7 + i8) - 62}, new int[]{((i9 + i10) - 25) - 28, (i7 + i8) - 82}};
        this.f1217j = new int[]{0, 0};
        this.f1216i = 0;
        f1193R = i9 + 73;
        f1194S = (i8 / 2) + i7 + 5;
        f1200Y = (i7 + i8) - 22;
        f1201Z = new int[]{(((i10 / 2) + i9) - 8) - 80, ((i10 / 2) + i9) - 8, ((i9 + (i10 / 2)) - 8) + 80};
        f1202a0 = new int[]{0, 0, 0};
        this.f1225r = f1196U + 10 + 70;
        this.f1226s = 0;
        f1206e0 = new C0173i("");
        f1207f0 = new C0173i("");
        this.f1218k = 1;
        this.f1219l = 2;
    }

    /* renamed from: j */
    public static void m509j() {
        f1207f0 = new C0173i("");
        for (int i = 0; i < f1206e0.size(); i++) {
            C0133r rVar = (C0133r) f1206e0.elementAt(i);
            if (rVar != null && rVar.f2202k == 1) {
                f1207f0.addElement(rVar);
            }
        }
    }

    /* renamed from: k */
    public static void m510k(int i, int i2) {
        f1208g0 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if ((f1206e0.size() % 5) > 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if ((f1207f0.size() % 5) > 0) goto L_0x0034;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m511m() {
        /*
            r4 = this;
            boolean r0 = f1210u
            r1 = 1
            r0 = r0 ^ r1
            f1210u = r0
            r4.f1218k = r1
            r2 = 0
            r4.f1220m = r2
            if (r0 == 0) goto L_0x0020
            k.i r0 = f1206e0
            int r0 = r0.size()
            int r0 = r0 / 5
            k.i r3 = f1206e0
            int r3 = r3.size()
            int r3 = r3 % 5
            if (r3 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0020:
            k.i r0 = f1207f0
            int r0 = r0.size()
            int r0 = r0 / 5
            k.i r3 = f1207f0
            int r3 = r3.size()
            int r3 = r3 % 5
            if (r3 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            int r0 = r0 + r1
            r4.f1219l = r0
            r4.mo346t()
            f1199X = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0107a0.m511m():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r5 < 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r5 > r2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if ((f1206e0.size() % 5) > 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if ((f1207f0.size() % 5) > 0) goto L_0x002b;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m512n(int r5) {
        /*
            r4 = this;
            boolean r0 = f1210u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            k.i r0 = f1206e0
            int r0 = r0.size()
            int r0 = r0 / 5
            k.i r3 = f1206e0
            int r3 = r3.size()
            int r3 = r3 % 5
            if (r3 <= 0) goto L_0x002c
            goto L_0x002b
        L_0x0019:
            k.i r0 = f1207f0
            int r0 = r0.size()
            int r0 = r0 / 5
            k.i r3 = f1207f0
            int r3 = r3.size()
            int r3 = r3 % 5
            if (r3 <= 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            int r0 = r0 + r1
            r4.f1219l = r0
            int r0 = r4.f1218k
            if (r5 != 0) goto L_0x003b
            if (r0 != r2) goto L_0x0036
            return
        L_0x0036:
            int r5 = r0 + -1
            if (r5 >= r2) goto L_0x0045
            goto L_0x0046
        L_0x003b:
            int r2 = r4.f1219l
            if (r0 != r2) goto L_0x0040
            return
        L_0x0040:
            int r5 = r0 + 1
            if (r5 <= r2) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = r5
        L_0x0046:
            if (r2 == r0) goto L_0x004d
            r4.f1218k = r2
            r4.mo346t()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0107a0.m512n(int):void");
    }

    /* renamed from: o */
    private void m513o(int i) {
        this.f1220m = i;
        f1199X = 0;
    }

    /* renamed from: p */
    private void m514p(int i) {
        if (i == 0) {
            m511m();
        } else if (i == 1) {
            if (this.f1221n != null) {
                C0105d.m365M().mo264b(1, this.f1221n.f2196e);
            }
        } else if (i == 2) {
            C0126k.m893c0().mo342f();
        }
        C0175k.m1563p().mo860K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m515q(int r7) {
        /*
            r6 = this;
            int r0 = r6.f1220m
            int r1 = r6.f1218k
            if (r7 != 0) goto L_0x0009
            int r7 = r0 + 1
            goto L_0x000b
        L_0x0009:
            int r7 = r0 + -1
        L_0x000b:
            int[] r2 = f1205d0
            int r3 = r2.length
            r4 = 0
            r5 = 1
            if (r7 < r3) goto L_0x001d
            int r7 = r6.f1219l
            if (r1 >= r7) goto L_0x001b
            int r7 = r1 + 1
            r3 = r7
            r7 = 0
            goto L_0x001e
        L_0x001b:
            int r7 = r2.length
            int r7 = r7 - r5
        L_0x001d:
            r3 = r1
        L_0x001e:
            if (r7 >= 0) goto L_0x0028
            if (r1 <= r5) goto L_0x0027
            int r7 = r2.length
            int r7 = r7 - r5
            int r3 = r3 + -1
            goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            if (r7 == r0) goto L_0x0030
            r6.f1220m = r7
            f1198W = r4
            f1199X = r4
        L_0x0030:
            if (r3 == r1) goto L_0x0037
            r6.f1218k = r3
            r6.mo346t()
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0107a0.m515q(int):void");
    }

    /* renamed from: r */
    private void m516r(int i) {
        int i2 = f1198W + (i * 12);
        f1198W = i2;
        if (i2 < 0) {
            f1198W = 0;
        }
        int i3 = f1198W;
        int i4 = this.f1221n.f2209r.f109n;
        if (i3 > i4) {
            f1198W = i4;
        }
    }

    /* renamed from: s */
    public static C0107a0 m517s() {
        if (f1209t == null) {
            f1209t = new C0107a0();
        }
        return f1209t;
    }

    /* renamed from: u */
    private void m518u() {
        if (C0145a.f2580E) {
            for (int i = 0; i < 5; i++) {
                int[][] iArr = f1204c0;
                if (C0145a.m1336F(iArr[i][0], iArr[i][1], 30, 30) && C0145a.f2580E && C0145a.f2582F && i != this.f1220m) {
                    m513o(i);
                }
            }
            int[][] iArr2 = f1203b0;
            if (C0145a.m1336F(iArr2[0][0] - 5, iArr2[0][1] - 5, 20, 20)) {
                if (C0145a.f2578D) {
                    this.f1217j[0] = 1;
                }
                if (C0145a.f2580E && C0145a.f2582F) {
                    m512n(0);
                    this.f1217j[0] = 0;
                }
            }
            int[][] iArr3 = f1203b0;
            if (C0145a.m1336F(iArr3[2][0] - 5, iArr3[2][1] - 5, 20, 20)) {
                if (C0145a.f2578D) {
                    this.f1217j[1] = 1;
                }
                if (C0145a.f2580E && C0145a.f2582F) {
                    m512n(1);
                    this.f1217j[1] = 0;
                }
            }
            int i2 = 0;
            while (true) {
                int[] iArr4 = f1201Z;
                if (i2 >= iArr4.length) {
                    break;
                }
                if (C0145a.m1336F(iArr4[i2] - 5, f1200Y - 5, 20, 20)) {
                    if (C0145a.f2578D) {
                        f1202a0[i2] = 1;
                    }
                    if (C0145a.f2580E && C0145a.f2582F) {
                        m514p(i2);
                        f1202a0[i2] = 0;
                    }
                }
                i2++;
            }
        } else {
            int[] iArr5 = f1202a0;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr5[2] = 0;
            int[] iArr6 = this.f1217j;
            iArr6[0] = 0;
            iArr6[1] = 0;
        }
        if (!C0145a.m1336F(f1195T, 0, f1197V, f1196U + f1199X)) {
            return;
        }
        if (C0145a.f2584G) {
            if (this.f1223p == 0) {
                this.f1223p = C0145a.f2588I;
            }
            int i3 = this.f1223p;
            int i4 = C0145a.f2588I;
            int i5 = i3 - i4;
            this.f1222o = i5;
            if (i5 != 0) {
                f1198W += i5;
                this.f1223p = i4;
            }
            if (f1198W < 0) {
                f1198W = 0;
            }
            int i6 = f1198W;
            int i7 = this.f1221n.f2209r.f109n;
            if (i6 > i7) {
                f1198W = i7;
                return;
            }
            return;
        }
        this.f1223p = 0;
        this.f1223p = 0;
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        C0143b bVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0006b bVar2;
        String str;
        C0159f fVar2 = fVar;
        try {
            C0126k.m893c0().mo341d(fVar2);
            C0126k.m901l1(fVar);
            fVar2.mo776e(f1214y, f1189N, f1190O, 0);
            C0143b bVar3 = f1186K;
            fVar2.mo776e(bVar3, (f1189N + (f1191P / 2)) - (bVar3.mo719i() / 2), (f1190O + 1) - (f1186K.mo716e() / 2), 0);
            fVar2.mo771C(((f1189N + (f1191P / 2)) - (f1186K.mo719i() / 2)) + 13, ((f1190O + 1) - (f1186K.mo716e() / 2)) + 5, this.f1224q, f1186K.mo716e());
            fVar.mo770B();
            fVar2.mo774a(((f1189N + (f1191P / 2)) - (f1186K.mo719i() / 2)) + 13, ((f1190O + 1) - (f1186K.mo716e() / 2)) + 5, this.f1224q, f1186K.mo716e());
            fVar2.mo776e(f1187L, ((f1189N + (f1191P / 2)) - (f1186K.mo719i() / 2)) + 13, ((f1190O + 1) - (f1186K.mo716e() / 2)) + 5, 0);
            fVar.mo769A();
            C0159f.m1454z(fVar);
            C0126k.m901l1(fVar);
            fVar2.mo776e(f1183H, f1201Z[0], f1200Y + f1202a0[0], 0);
            fVar2.mo776e(f1180E, f1201Z[1], f1200Y + f1202a0[1], 0);
            fVar2.mo776e(f1182G, f1201Z[2], f1200Y + f1202a0[2], 0);
            if (f1210u) {
                bVar = f1181F;
                i = 0;
                i2 = 0;
                i3 = 17;
                i4 = 17;
                i5 = 0;
                i6 = f1201Z[1];
                i7 = f1200Y;
                i8 = f1202a0[1];
            } else {
                bVar = f1181F;
                i = 0;
                i2 = 0;
                i3 = 17;
                i4 = 17;
                i5 = 1;
                i6 = f1201Z[1];
                i7 = f1200Y;
                i8 = f1202a0[1];
            }
            fVar.mo779h(bVar, i, i2, i3, i4, i5, i6, i8 + i7, 0);
            if (this.f1221n != null) {
                fVar2.mo771C(f1189N + 30, f1190O + 13, f1191P - 60, f1192Q / 2);
                fVar.mo770B();
                fVar2.mo774a(f1189N + 30, f1190O + 13, f1191P - 60, f1192Q / 2);
                this.f1221n.mo576j(fVar2, f1193R, f1194S);
                fVar.mo769A();
                C0126k.m901l1(fVar);
                C0159f.m1454z(fVar);
                C0177m mVar = C0177m.f2949q;
                StringBuilder sb = new StringBuilder();
                if (this.f1221n.f2201j > 0) {
                    str = "Lv." + this.f1221n.f2201j + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(this.f1221n.f2199h);
                mVar.mo909a(fVar, sb.toString(), (f1191P / 2) + f1189N, f1190O + 15, 2);
                C0177m.f2929F.mo909a(fVar, "no." + this.f1221n.f2197f, f1189N + 30, f1196U - 2, 0);
                fVar2.mo776e(f1184I, f1189N + 36, f1196U + 10, 0);
                int i12 = this.f1225r;
                int i13 = this.f1226s;
                fVar2.mo771C(f1189N + 36, i12 - i13, 7, i13);
                fVar.mo770B();
                int i14 = this.f1225r;
                int i15 = this.f1226s;
                fVar2.mo774a(f1189N + 36, i14 - i15, 7, i15);
                fVar2.mo776e(f1185J, f1189N + 36, f1196U + 10, 0);
                fVar.mo769A();
                C0159f.m1454z(fVar);
                C0126k.m901l1(fVar);
                fVar2.mo776e(f1188M[this.f1221n.f2192a], ((f1189N + 39) - 5) + 14, f1196U + 12, 0);
            }
            fVar2.mo771C(f1195T, f1196U, f1197V + 5, f1199X + 8);
            fVar.mo770B();
            fVar2.mo774a(f1195T, f1196U, f1197V + 5, f1199X + 8);
            if (this.f1221n != null) {
                fVar2.mo776e(f1215z, f1195T, f1196U, 0);
            }
            fVar.mo769A();
            C0159f.m1454z(fVar);
            C0126k.m901l1(fVar);
            fVar2.mo771C(f1195T, f1196U + 1, f1197V, f1199X + 5);
            fVar.mo770B();
            fVar2.mo774a(f1195T, f1196U + 1, f1197V, f1199X + 5);
            C0133r rVar = this.f1221n;
            if (!(rVar == null || (bVar2 = rVar.f2209r) == null || bVar2.f105j == null)) {
                bVar2.mo15j(fVar2, f1198W);
            }
            fVar.mo769A();
            if ((!f1210u && f1207f0.size() > 5) || f1210u) {
                if (this.f1218k > 1) {
                    C0143b bVar4 = f1176A;
                    int[][] iArr = f1203b0;
                    fVar2.mo776e(bVar4, iArr[0][0], iArr[0][1] + this.f1217j[0], 0);
                }
                if (this.f1218k < this.f1219l) {
                    C0143b bVar5 = f1177B;
                    int[][] iArr2 = f1203b0;
                    fVar2.mo776e(bVar5, iArr2[2][0], iArr2[2][1] + this.f1217j[1], 0);
                }
            }
            for (int i16 = 0; i16 < f1205d0.length; i16++) {
                if (i16 == this.f1220m) {
                    int i17 = this.f1216i;
                    C0143b bVar6 = f1178C;
                    int[][] iArr3 = f1204c0;
                    fVar2.mo776e(bVar6, iArr3[i16][0] + 10, ((iArr3[i16][1] + i17) + 29) - 10, 0);
                    i10 = i17;
                    i11 = 1;
                    i9 = -10;
                } else {
                    i11 = 0;
                    i10 = 0;
                    i9 = 0;
                }
                C0133r a = C0133r.m1017a(f1207f0, f1205d0[i16]);
                if (f1210u) {
                    a = C0133r.m1017a(f1206e0, f1205d0[i16]);
                }
                C0133r rVar2 = a;
                if (rVar2 != null) {
                    C0016l lVar = f1211v;
                    byte b = rVar2.f2192a;
                    int[][] iArr4 = f1204c0;
                    lVar.mo35a(b, iArr4[i16][0], iArr4[i16][1] + i10 + i9, 0, 0, fVar);
                    int i18 = rVar2.f2198g;
                    int[][] iArr5 = f1204c0;
                    C0174j.m1555c(fVar, i18, iArr5[i16][0] + 14, iArr5[i16][1] + 14 + i10 + i9, 0, C0117f0.f1680f);
                    int[][] iArr6 = f1204c0;
                    rVar2.mo575i(fVar2, iArr6[i16][0], iArr6[i16][1] + i10 + i9);
                    if (rVar2.f2201j == 0) {
                        C0143b bVar7 = f1179D;
                        int[][] iArr7 = f1204c0;
                        fVar2.mo776e(bVar7, iArr7[i16][0], iArr7[i16][1] + i10 + i9, 0);
                    }
                    if (i16 == this.f1220m) {
                        C0016l lVar2 = f1211v;
                        int[][] iArr8 = f1204c0;
                        lVar2.mo35a(7, iArr8[i16][0], iArr8[i16][1] + i10 + i9, 0, 0, fVar);
                    }
                    if (rVar2.f2202k == 1) {
                        C0016l lVar3 = f1211v;
                        int[][] iArr9 = f1204c0;
                        lVar3.mo35a(8, iArr9[i16][0], iArr9[i16][1] + i10 + i9, 0, 0, fVar);
                    }
                } else {
                    C0016l lVar4 = f1212w;
                    int[][] iArr10 = f1204c0;
                    lVar4.mo35a(i11, iArr10[i16][0] - 1, (iArr10[i16][1] - 1) + i10 + i9, 0, 0, fVar);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0126k.f1960f1 = true;
        super.mo342f();
    }

    /* renamed from: h */
    public void mo343h() {
        try {
            int i = f1199X;
            if (i < 80) {
                int i2 = i + 4;
                f1199X = i2;
                if (i2 > 80) {
                    f1199X = 80;
                }
            }
            this.f1221n = C0133r.m1017a(f1207f0, f1205d0[this.f1220m]);
            if (f1210u) {
                this.f1221n = C0133r.m1017a(f1206e0, f1205d0[this.f1220m]);
            }
            C0126k.m893c0().mo343h();
            int i3 = C0145a.f2600O;
            if (i3 % 10 >= 6) {
                this.f1216i = 0;
            } else if (i3 % 2 == 0) {
                this.f1216i--;
            }
            C0133r rVar = this.f1221n;
            if (rVar != null) {
                this.f1226s = (((rVar.f2193b * 100) / rVar.f2194c) * f1185J.mo716e()) / 100;
                this.f1224q = (((f1208g0 * 100) / f1206e0.size()) * f1187L.mo719i()) / 100;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public void mo344i() {
        if (!C0130o.f2165e) {
            if (C0145a.f2659x && !C0167c.m1522b().f2790b && !C0145a.f2627d0.f2239a) {
                m518u();
            }
            boolean[] zArr = C0145a.f2574B;
            if (zArr[8]) {
                zArr[8] = false;
                m516r(1);
            }
            boolean[] zArr2 = C0145a.f2574B;
            if (zArr2[2]) {
                zArr2[2] = false;
                m516r(-1);
            }
            boolean[] zArr3 = C0145a.f2574B;
            if (zArr3[4]) {
                zArr3[4] = false;
                m515q(1);
            }
            boolean[] zArr4 = C0145a.f2574B;
            if (zArr4[6]) {
                zArr4[6] = false;
                m515q(0);
            }
            boolean[] zArr5 = C0145a.f2574B;
            if (zArr5[13]) {
                zArr5[13] = false;
                C0126k.m893c0().mo342f();
            }
            boolean[] zArr6 = C0145a.f2574B;
            if (zArr6[12]) {
                zArr6[12] = false;
                m511m();
            }
            C0145a.m1359n();
        }
    }

    /* renamed from: l */
    public void mo345l(C0173i iVar, int i, int i2) {
        f1206e0 = iVar;
        m510k(i, i2);
        int i3 = 1;
        this.f1218k = 1;
        this.f1220m = 2;
        mo346t();
        f1210u = true;
        m509j();
        if (f1210u) {
            int size = iVar.size() / 5;
            if (iVar.size() % 5 <= 0) {
                i3 = 0;
            }
            this.f1219l = size + i3;
            return;
        }
        int size2 = f1207f0.size() / 5;
        if (f1207f0.size() % 5 <= 0) {
            i3 = 0;
        }
        this.f1219l = size2 + i3;
    }

    /* renamed from: t */
    public void mo346t() {
        C0173i iVar = f1207f0;
        if (f1210u) {
            iVar = f1206e0;
        }
        int i = (this.f1218k - 1) * 5;
        int i2 = i + 5;
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 >= iVar.size()) {
                f1205d0[i3 - i] = -1;
            } else {
                C0133r rVar = (C0133r) iVar.elementAt(i3);
                if (rVar != null) {
                    f1205d0[i3 - i] = rVar.f2196e;
                }
            }
        }
        C0175k.m1563p().mo861L();
    }
}
