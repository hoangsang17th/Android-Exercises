package p013g;

import p001b.C0006b;
import p001b.C0008d;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0159f;
import p020k.C0173i;
import p020k.C0175k;
import p020k.C0176l;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.b0 */
public class C0109b0 extends C0178n implements C0072l {

    /* renamed from: M */
    public static boolean f1240M = false;

    /* renamed from: N */
    public static boolean f1241N;

    /* renamed from: O */
    public static boolean f1242O;

    /* renamed from: P */
    public static boolean f1243P;

    /* renamed from: Q */
    public static boolean f1244Q;

    /* renamed from: R */
    public static boolean f1245R;

    /* renamed from: S */
    public static String f1246S;

    /* renamed from: T */
    public static C0143b f1247T;

    /* renamed from: U */
    public static boolean f1248U;

    /* renamed from: A */
    C0055d f1249A;

    /* renamed from: B */
    int f1250B;

    /* renamed from: C */
    C0055d f1251C;

    /* renamed from: D */
    int f1252D;

    /* renamed from: E */
    int f1253E = 130;

    /* renamed from: F */
    int f1254F;

    /* renamed from: G */
    int f1255G = -1;

    /* renamed from: H */
    public boolean f1256H = false;

    /* renamed from: I */
    int f1257I = 2;

    /* renamed from: J */
    int f1258J = 0;

    /* renamed from: K */
    int f1259K = -40;

    /* renamed from: L */
    int f1260L = 1;

    /* renamed from: i */
    public C0176l f1261i;

    /* renamed from: j */
    public C0176l f1262j;

    /* renamed from: k */
    public C0176l f1263k;

    /* renamed from: l */
    public C0176l f1264l;

    /* renamed from: m */
    public C0176l f1265m;

    /* renamed from: n */
    public C0176l f1266n;

    /* renamed from: o */
    public C0176l f1267o;

    /* renamed from: p */
    public C0176l f1268p;

    /* renamed from: q */
    public C0176l f1269q;

    /* renamed from: r */
    int f1270r;

    /* renamed from: s */
    int f1271s;

    /* renamed from: t */
    int f1272t;

    /* renamed from: u */
    public boolean f1273u = false;

    /* renamed from: v */
    public boolean f1274v = false;

    /* renamed from: w */
    C0055d f1275w;

    /* renamed from: x */
    C0055d f1276x;

    /* renamed from: y */
    C0055d f1277y;

    /* renamed from: z */
    C0055d f1278z;

    public C0109b0(byte b) {
        byte currentTimeMillis = (byte) ((int) (System.currentTimeMillis() % 9));
        C0121h0.f1806y = currentTimeMillis;
        if (currentTimeMillis == 5 || currentTimeMillis == 6) {
            C0121h0.f1806y = 4;
        }
        C0126k.m855A0(true, -1, -1);
        C0126k.f2028t1 = 100;
        C0126k.f2032u1 = 200;
        this.f1272t = C0145a.f2616W > 200 ? C0145a.f2623b0 - 80 : C0145a.f2623b0 - 65;
        mo355q();
        int i = C0145a.f2614V;
        this.f1250B = (C0145a.f2623b0 - C0178n.f2966d) - 5;
        if (C0145a.f2616W <= 160) {
            this.f1250B = 20;
        }
        C0176l lVar = new C0176l();
        this.f1269q = lVar;
        lVar.mo903n(1);
        C0176l lVar2 = this.f1269q;
        lVar2.f2901c = 220;
        lVar2.f2902d = C0178n.f2966d + 2;
        lVar2.f2905g = "Số điện thoại/ địa chỉ email";
        if (b == 1) {
            lVar2.mo906r("01234567890");
        }
        C0176l lVar3 = new C0176l();
        this.f1261i = lVar3;
        lVar3.f2901c = 220;
        lVar3.f2902d = C0178n.f2966d + 2;
        lVar3.f2903e = true;
        lVar3.f2905g = "Họ và tên";
        if (b == 1) {
            lVar3.mo906r("Nguyễn Văn A");
        }
        this.f1261i.mo903n(0);
        C0176l lVar4 = new C0176l();
        this.f1262j = lVar4;
        lVar4.mo903n(1);
        C0176l lVar5 = this.f1262j;
        lVar5.f2901c = 70;
        lVar5.f2902d = C0178n.f2966d + 2;
        lVar5.f2905g = "Ngày sinh";
        if (b == 1) {
            lVar5.mo906r("01");
        }
        C0176l lVar6 = new C0176l();
        this.f1263k = lVar6;
        lVar6.mo903n(1);
        C0176l lVar7 = this.f1263k;
        lVar7.f2901c = 70;
        lVar7.f2902d = C0178n.f2966d + 2;
        lVar7.f2905g = "Tháng sinh";
        if (b == 1) {
            lVar7.mo906r("01");
        }
        C0176l lVar8 = new C0176l();
        this.f1264l = lVar8;
        lVar8.mo903n(1);
        C0176l lVar9 = this.f1264l;
        lVar9.f2901c = 70;
        lVar9.f2902d = C0178n.f2966d + 2;
        lVar9.f2905g = "Năm sinh";
        if (b == 1) {
            lVar9.mo906r("1980");
        }
        C0176l lVar10 = new C0176l();
        this.f1265m = lVar10;
        lVar10.mo903n(0);
        C0176l lVar11 = this.f1265m;
        lVar11.f2901c = 220;
        lVar11.f2902d = C0178n.f2966d + 2;
        lVar11.f2905g = "Địa chỉ đăng ký thường trú";
        if (b == 1) {
            lVar11.mo906r("123 đường số 1, Quận 1, TP.HCM");
        }
        C0176l lVar12 = new C0176l();
        this.f1266n = lVar12;
        lVar12.mo903n(1);
        C0176l lVar13 = this.f1266n;
        lVar13.f2901c = 220;
        lVar13.f2902d = C0178n.f2966d + 2;
        lVar13.f2905g = "Số Chứng minh nhân dân hoặc số hộ chiếu";
        if (b == 1) {
            lVar13.mo906r("123456789");
        }
        C0176l lVar14 = new C0176l();
        this.f1267o = lVar14;
        lVar14.mo903n(1);
        C0176l lVar15 = this.f1267o;
        lVar15.f2901c = 220;
        lVar15.f2902d = C0178n.f2966d + 2;
        lVar15.f2905g = "Ngày cấp";
        if (b == 1) {
            lVar15.mo906r("01/01/1990");
        }
        C0176l lVar16 = new C0176l();
        this.f1268p = lVar16;
        lVar16.mo903n(0);
        C0176l lVar17 = this.f1268p;
        lVar17.f2901c = 220;
        lVar17.f2902d = C0178n.f2966d + 2;
        lVar17.f2905g = "Nơi cấp";
        if (b == 1) {
            lVar17.mo906r("TP.HCM");
        }
        this.f1250B += 35;
        this.f1273u = true;
        this.f1270r = 0;
        this.f1275w = new C0055d(C0145a.f2614V > 200 ? C0057d1.f696o0 : C0057d1.f703p0, (C0072l) C0145a.f2572A, 888393, (Object) null);
        new C0055d(C0057d1.f676l1, (C0072l) this, 2001, (Object) null);
        this.f1277y = new C0055d(C0057d1.f710q0, (C0072l) this, 2002, (Object) null);
        this.f1249A = new C0055d(C0057d1.f690n1, (C0072l) this, 10021, (Object) null);
        C0055d dVar = new C0055d(C0057d1.f599a1, (C0072l) this, 2003, (Object) null);
        this.f1278z = dVar;
        this.f2971a = dVar;
        if (C0145a.f2659x) {
            C0055d dVar2 = this.f1275w;
            int i2 = C0145a.f2614V;
            dVar2.f407h = (i2 / 2) - 100;
            dVar.f407h = ((i2 / 2) - C0178n.f2967e) - 8;
            int i3 = C0145a.f2616W;
            if (i3 >= 200) {
                dVar2.f408i = (i3 / 2) - 40;
                dVar.f408i = this.f1253E + 110;
            }
            C0055d dVar3 = this.f1249A;
            int i4 = C0145a.f2614V;
            dVar3.f407h = (i4 / 2) + 3;
            dVar3.f408i = this.f1253E + 110;
            C0055d dVar4 = this.f1277y;
            dVar4.f407h = (i4 / 2) - 84;
            dVar4.f408i = dVar.f408i;
        }
        this.f1254F = 170;
        int i5 = C0145a.f2621a0;
        int i6 = 170 / 2;
        C0176l lVar18 = this.f1261i;
        int i7 = lVar18.f2900b;
        int i8 = 184;
        int i9 = C0145a.f2614V;
        int i10 = (i9 / 2) - ((184 >= i9 ? 152 : i8) / 2);
        this.f1252D = i10;
        this.f1253E = 5;
        lVar18.f2899a = i10 + 10;
        lVar18.f2900b = 5 + 20;
        C0055d dVar5 = new C0055d(C0057d1.f669k1, (C0072l) this, 2008, (Object) null);
        this.f1251C = dVar5;
        dVar5.f407h = 260;
        dVar5.f408i = C0145a.f2616W - 60;
        C0055d dVar6 = new C0055d("Thoát", (C0072l) this, 1003, (Object) null);
        this.f1276x = dVar6;
        dVar6.f407h = 260;
        dVar6.f408i = C0145a.f2616W - 30;
        int i11 = C0145a.f2614V;
        if (i11 < 250) {
            C0055d dVar7 = this.f1251C;
            dVar7.f407h = (i11 / 2) - 80;
            dVar6.f407h = (i11 / 2) + 10;
            int i12 = C0145a.f2616W - 25;
            dVar7.f408i = i12;
            dVar6.f408i = i12;
        }
        this.f2972b = this.f1251C;
        this.f2971a = dVar6;
    }

    /* renamed from: l */
    private void m526l() {
        int i = this.f1255G + 1;
        this.f1255G = i;
        if (i >= C0057d1.f532Q0.length) {
            this.f1255G = 0;
        }
        C0122i iVar = C0145a.f2637i0;
        C0139x xVar = C0145a.f2639j0;
        if (iVar == xVar && xVar.f2343e) {
            xVar.mo603d(C0057d1.f532Q0[this.f1255G]);
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        C0177m mVar;
        int i;
        int i2;
        int i3;
        String str;
        C0159f fVar2;
        C0177m mVar2;
        C0143b bVar;
        C0145a.m1363r("PLG1", 1);
        C0145a.m1340L(fVar);
        C0145a.m1363r("PLG2", 2);
        int i4 = this.f1261i.f2900b - 50;
        if (C0145a.f2616W <= 220) {
            i4 += 5;
        }
        int i5 = i4;
        if (C0006b.f95C == null && C0006b.f96D == null) {
            if (C0145a.f2637i0 == null) {
                this.f1252D = 5;
                int i6 = C0145a.f2614V;
                if (i6 < 260) {
                    this.f1252D = (i6 - 240) / 2;
                }
                int i7 = (C0145a.f2616W - 233) / 2;
                this.f1253E = i7;
                int i8 = C0145a.f2614V;
                C0067i0.m243g(fVar, this.f1252D, i7, 240, 233, -1, true);
                if (C0145a.f2616W > 160 && (bVar = f1247T) != null) {
                    fVar.mo776e(bVar, C0145a.f2621a0, i5, 3);
                }
                C0145a.m1363r("PLG4", 1);
                int i9 = C0145a.f2614V;
                C0176l lVar = this.f1269q;
                int i10 = this.f1252D;
                int i11 = i10 + 10;
                lVar.f2899a = i11;
                int i12 = this.f1253E + 15;
                lVar.f2900b = i12;
                C0176l lVar2 = this.f1261i;
                lVar2.f2899a = i11;
                int i13 = i12 + 30;
                lVar2.f2900b = i13;
                C0176l lVar3 = this.f1262j;
                int i14 = i10 + 10;
                lVar3.f2899a = i14;
                int i15 = i13 + 30;
                lVar3.f2900b = i15;
                C0176l lVar4 = this.f1263k;
                int i16 = i14 + 75;
                lVar4.f2899a = i16;
                lVar4.f2900b = i15;
                C0176l lVar5 = this.f1264l;
                lVar5.f2899a = i16 + 75;
                lVar5.f2900b = i15;
                C0176l lVar6 = this.f1265m;
                lVar6.f2899a = lVar2.f2899a;
                int i17 = lVar3.f2900b + 30;
                lVar6.f2900b = i17;
                C0176l lVar7 = this.f1266n;
                lVar7.f2899a = lVar2.f2899a;
                int i18 = i17 + 30;
                lVar7.f2900b = i18;
                C0176l lVar8 = this.f1267o;
                lVar8.f2899a = lVar2.f2899a;
                int i19 = i18 + 30;
                lVar8.f2900b = i19;
                C0176l lVar9 = this.f1268p;
                lVar9.f2899a = lVar2.f2899a;
                lVar9.f2900b = i19 + 30;
                lVar2.mo901l(fVar);
                this.f1262j.mo901l(fVar);
                this.f1263k.mo901l(fVar);
                this.f1264l.mo901l(fVar);
                this.f1265m.mo901l(fVar);
                this.f1266n.mo901l(fVar);
                this.f1267o.mo901l(fVar);
                this.f1268p.mo901l(fVar);
                this.f1269q.mo901l(fVar);
                if (C0145a.f2614V < 176) {
                    C0176l lVar10 = this.f1261i;
                    C0177m.f2952t.mo909a(fVar, C0057d1.f612c0 + ":", lVar10.f2899a - 35, lVar10.f2900b + 7, 0);
                    C0176l lVar11 = this.f1262j;
                    C0177m.f2952t.mo909a(fVar, C0057d1.f619d0 + ":", lVar11.f2899a - 35, lVar11.f2900b + 7, 0);
                    C0177m.f2952t.mo909a(fVar, C0057d1.f420A0 + ": " + f1246S, C0145a.f2614V / 2, this.f1262j.f2900b + 32, 2);
                }
            }
            String str2 = f1248U ? C0150c.m1414n().f2720q : "1.9.3";
            fVar.mo772D(C0145a.f2644n0);
            fVar.mo783l(C0145a.f2614V - 40, 4, 36, 11);
            C0177m.f2925B.mo909a(fVar, str2, C0145a.f2614V - 22, 4, 2);
            C0145a.m1346T(fVar);
            if (C0145a.f2637i0 == null) {
                if (C0145a.f2614V > 250) {
                    i3 = 260;
                    i = 0;
                    fVar2 = fVar;
                    C0177m.f2948p.mo910b(fVar2, "Dưới 18 tuổi", 260, 10, 0, C0177m.f2951s);
                    C0177m.f2948p.mo910b(fVar2, "chỉ có thể chơi", 260, 25, 0, C0177m.f2951s);
                    mVar2 = C0177m.f2948p;
                    i2 = 40;
                    mVar = C0177m.f2951s;
                    str = "180p 1 ngày";
                } else {
                    i = 2;
                    C0177m.f2948p.mo910b(fVar, "Dưới 18 tuổi chỉ có thể chơi", C0145a.f2614V / 2, 5, 2, C0177m.f2951s);
                    mVar2 = C0177m.f2948p;
                    i3 = C0145a.f2614V / 2;
                    i2 = 15;
                    mVar = C0177m.f2951s;
                    str = "180p 1 ngày";
                    fVar2 = fVar;
                }
                mVar2.mo910b(fVar2, str, i3, i2, i, mVar);
            }
            super.mo341d(fVar);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1000) {
            try {
                C0146b.f2678f.mo721b((String) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C0145a.m1366v();
        } else if (i == 1001) {
            C0145a.m1366v();
            this.f1274v = false;
        } else if (i != 2008) {
            if (i == 4000) {
                mo354p(this.f1261i.mo899f());
            } else if (i != 10021) {
                switch (i) {
                    case 1003:
                        C0145a.f2638i1.mo342f();
                        C0150c.m1414n().mo744k();
                        return;
                    case 1004:
                        C0113d0.m628k();
                        C0145a.f2638i1.mo342f();
                        return;
                    case 1005:
                        try {
                            C0146b.f2678f.mo721b("http://ngocrongonline.com");
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    default:
                        switch (i) {
                            case 2001:
                                if (this.f1273u) {
                                    this.f1273u = false;
                                    return;
                                } else {
                                    this.f1273u = true;
                                    return;
                                }
                            case 2002:
                                mo353o();
                                return;
                            case 2003:
                                mo352n();
                                return;
                            case 2004:
                                mo349j();
                                return;
                            default:
                                return;
                        }
                }
            } else {
                mo350k();
            }
        } else if (this.f1262j.mo899f().equals("") || this.f1263k.mo899f().equals("") || this.f1264l.mo899f().equals("") || this.f1265m.mo899f().equals("") || this.f1266n.mo899f().equals("") || this.f1267o.mo899f().equals("") || this.f1268p.mo899f().equals("") || this.f1269q.mo899f().equals("") || this.f1261i.mo899f().equals("")) {
            C0145a.m1349X("Vui lòng điền đầy đủ thông tin");
        } else {
            C0145a.m1349X(C0057d1.f724s0);
            C0105d.m365M().mo295o(this.f1262j.mo899f(), this.f1263k.mo899f(), this.f1264l.mo899f(), this.f1265m.mo899f(), this.f1266n.mo899f(), this.f1267o.mo899f(), this.f1268p.mo899f(), this.f1269q.mo899f(), this.f1261i.mo899f());
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0175k.m1563p().mo865P();
        C0176l lVar = this.f1261i;
        lVar.f2903e = true;
        this.f1262j.f2903e = false;
        if (C0145a.f2659x) {
            lVar.f2903e = false;
        }
        super.mo342f();
    }

    /* renamed from: g */
    public void mo348g() {
        super.mo348g();
    }

    /* renamed from: h */
    public void mo343h() {
        C0055d dVar;
        this.f1261i.mo908t();
        this.f1262j.mo908t();
        this.f1263k.mo908t();
        this.f1264l.mo908t();
        this.f1265m.mo908t();
        this.f1266n.mo908t();
        this.f1268p.mo908t();
        this.f1269q.mo908t();
        this.f1267o.mo908t();
        for (int i = 0; i < C0008d.f124b.size(); i++) {
            ((C0008d) C0008d.f124b.elementAt(i)).mo13b();
        }
        if (f1241N && !f1242O && !f1245R && !f1243P && !f1244Q) {
            f1241N = false;
            System.gc();
            C0105d.m365M().mo228J();
        }
        int i2 = C0126k.f2028t1 + 1;
        C0126k.f2028t1 = i2;
        if (i2 > (C0145a.f2614V * 3) + 100) {
            C0126k.f2028t1 = 100;
        }
        if (C0006b.f95C == null) {
            C0145a.m1363r("LGU1", 0);
            C0145a.m1363r("LGU2", 0);
            C0145a.m1363r("LGU3", 0);
            mo356r();
            C0145a.m1363r("LGU4", 0);
            C0145a.m1363r("LGU5", 0);
            int i3 = this.f1258J;
            if (i3 >= 0) {
                int i4 = this.f1259K;
                int i5 = this.f1260L;
                int i6 = i4 + (i5 * i3);
                this.f1259K = i6;
                int i7 = this.f1257I;
                int i8 = i3 + (i5 * i7);
                this.f1258J = i8;
                if (i8 <= 0) {
                    this.f1260L = i5 * -1;
                }
                if (i6 > 0) {
                    this.f1260L *= -1;
                    this.f1258J = i8 - (i7 * 2);
                }
            }
            C0145a.m1363r("LGU6", 0);
            if (this.f1255G >= 0 && C0145a.f2600O % 100 == 0) {
                m526l();
            }
            if (!C0145a.f2659x ? !this.f1274v : !this.f1274v) {
                this.f2972b = this.f1251C;
                dVar = this.f1276x;
            } else {
                this.f2972b = this.f1277y;
                dVar = this.f1249A;
            }
            this.f2971a = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2 < 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r2 > 1) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a3  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo344i() {
        /*
            r6 = this;
            boolean r0 = f1240M
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 != 0) goto L_0x0016
            k.l r0 = r6.f1261i
            boolean r1 = r0.f2903e
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            k.l r0 = r6.f1262j
        L_0x0012:
            e.d r0 = r0.f2922x
            r6.f2973c = r0
        L_0x0016:
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 2
            boolean r2 = r0[r1]
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L_0x002a
            int r2 = r6.f1270r
            int r2 = r2 - r4
            r6.f1270r = r2
            if (r2 >= 0) goto L_0x0036
        L_0x0027:
            r6.f1270r = r4
            goto L_0x0036
        L_0x002a:
            boolean r2 = r0[r3]
            if (r2 == 0) goto L_0x0036
            int r2 = r6.f1270r
            int r2 = r2 + r4
            r6.f1270r = r2
            if (r2 <= r4) goto L_0x0036
            goto L_0x0027
        L_0x0036:
            boolean r1 = r0[r1]
            r2 = 0
            if (r1 != 0) goto L_0x003f
            boolean r0 = r0[r3]
            if (r0 == 0) goto L_0x0067
        L_0x003f:
            p018i.C0145a.m1359n()
            boolean r0 = r6.f1256H
            if (r0 == 0) goto L_0x004b
            boolean r0 = r6.f1274v
            if (r0 != 0) goto L_0x004b
            goto L_0x0067
        L_0x004b:
            int r0 = r6.f1270r
            if (r0 != r4) goto L_0x0058
            k.l r0 = r6.f1261i
            r0.f2903e = r2
            k.l r0 = r6.f1262j
            r0.f2903e = r4
            goto L_0x0067
        L_0x0058:
            if (r0 != 0) goto L_0x005f
            k.l r0 = r6.f1261i
            r0.f2903e = r4
            goto L_0x0063
        L_0x005f:
            k.l r0 = r6.f1261i
            r0.f2903e = r2
        L_0x0063:
            k.l r0 = r6.f1262j
            r0.f2903e = r2
        L_0x0067:
            boolean r0 = p018i.C0145a.f2659x
            if (r0 == 0) goto L_0x0070
            boolean r0 = r6.f1274v
            if (r0 == 0) goto L_0x007b
            goto L_0x0074
        L_0x0070:
            boolean r0 = r6.f1274v
            if (r0 == 0) goto L_0x007b
        L_0x0074:
            e.d r0 = r6.f1277y
            r6.f2972b = r0
            e.d r0 = r6.f1249A
            goto L_0x0081
        L_0x007b:
            e.d r0 = r6.f1251C
            r6.f2972b = r0
            e.d r0 = r6.f1276x
        L_0x0081:
            r6.f2971a = r0
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r6.f1256H
            if (r0 == 0) goto L_0x0090
            boolean r0 = r6.f1274v
            if (r0 != 0) goto L_0x0090
            goto L_0x00b5
        L_0x0090:
            k.l r0 = r6.f1261i
            int r1 = r0.f2899a
            int r3 = r0.f2900b
            int r5 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r3, r5, r0)
            if (r0 == 0) goto L_0x00a3
            r6.f1270r = r2
            goto L_0x00b5
        L_0x00a3:
            k.l r0 = r6.f1262j
            int r1 = r0.f2899a
            int r2 = r0.f2900b
            int r3 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x00b5
            r6.f1270r = r4
        L_0x00b5:
            super.mo344i()
            p018i.C0145a.m1359n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0109b0.mo344i():void");
    }

    /* renamed from: j */
    public void mo349j() {
        C0145a.m1366v();
        C0145a.m1349X(C0057d1.f467G5);
        this.f1274v = true;
        this.f1262j.f2903e = false;
        this.f1261i.f2903e = true;
    }

    /* renamed from: k */
    public void mo350k() {
        if (this.f1256H) {
            mo351m();
            return;
        }
        this.f1274v = false;
        this.f1262j.f2903e = false;
        this.f1261i.f2903e = true;
        this.f2971a = this.f1278z;
    }

    /* renamed from: m */
    public void mo351m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo352n() {
        C0173i iVar = new C0173i("vMenu Login");
        iVar.addElement(new C0055d(C0057d1.f538R, (C0072l) this, 2004, (Object) null));
        if (!this.f1256H) {
            iVar.addElement(new C0055d(C0057d1.f545S, (C0072l) this, 1004, (Object) null));
        }
        iVar.addElement(new C0055d(C0057d1.f552T, (C0072l) this, 1003, (Object) null));
        iVar.addElement(new C0055d(C0057d1.f773z0, (C0072l) this, 1005, (Object) null));
        iVar.addElement(C0149b.m1399d("lowGraphic") == 1 ? new C0055d(C0057d1.f512N1, (C0072l) this, 10041, (Object) null) : new C0055d(C0057d1.f519O1, (C0072l) this, 10042, (Object) null));
        iVar.addElement(new C0055d(C0057d1.f648h1, (C0072l) C0145a.f2572A, 8885, (Object) null));
        C0145a.f2627d0.mo590g(iVar, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r8.f1261i.mo899f().indexOf(".") != -1) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r8.f1261i.mo899f().indexOf(".") != -1) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo353o() {
        /*
            r8 = this;
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = p011e.C0057d1.f503M
            p018i.C0145a.m1349X(r0)
            return
        L_0x0014:
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            r0.toCharArray()
            k.l r0 = r8.f1262j
            java.lang.String r0 = r0.mo899f()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = p011e.C0057d1.f510N
            p018i.C0145a.m1349X(r0)
            return
        L_0x002f:
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.length()
            r1 = 5
            if (r0 >= r1) goto L_0x0042
            java.lang.String r0 = p011e.C0057d1.f517O
            p018i.C0145a.m1349X(r0)
            return
        L_0x0042:
            byte r0 = p011e.C0057d1.f680l5
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = "."
            java.lang.String r5 = "@"
            r6 = -1
            r7 = 0
            if (r0 != r1) goto L_0x006d
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.indexOf(r5)
            if (r0 == r6) goto L_0x006a
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.indexOf(r4)
            if (r0 != r6) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r0 = r7
            goto L_0x00cf
        L_0x006a:
            java.lang.String r0 = p011e.C0057d1.f531Q
            goto L_0x00cf
        L_0x006d:
            k.l r0 = r8.f1261i     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = r0.mo899f()     // Catch:{ Exception -> 0x00b5 }
            java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00b5 }
            k.l r0 = r8.f1261i     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = r0.mo899f()     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            r1 = 8
            if (r0 < r1) goto L_0x00b1
            k.l r0 = r8.f1261i     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = r0.mo899f()     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            r1 = 12
            if (r0 > r1) goto L_0x00b1
            k.l r0 = r8.f1261i     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = r0.mo899f()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = "0"
            boolean r0 = r0.startsWith(r1)     // Catch:{ Exception -> 0x00b5 }
            if (r0 != 0) goto L_0x00af
            k.l r0 = r8.f1261i     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = r0.mo899f()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = "84"
            boolean r0 = r0.startsWith(r1)     // Catch:{ Exception -> 0x00b5 }
            if (r0 != 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r0 = r7
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r0 = p011e.C0057d1.f524P     // Catch:{ Exception -> 0x00b5 }
        L_0x00b3:
            r3 = 1
            goto L_0x00cf
        L_0x00b5:
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.indexOf(r5)
            if (r0 == r6) goto L_0x006a
            k.l r0 = r8.f1261i
            java.lang.String r0 = r0.mo899f()
            int r0 = r0.indexOf(r4)
            if (r0 != r6) goto L_0x0068
            goto L_0x006a
        L_0x00cf:
            if (r0 == 0) goto L_0x00d5
            p018i.C0145a.m1349X(r0)
            goto L_0x013b
        L_0x00d5:
            g.x r0 = p018i.C0145a.f2639j0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = p011e.C0057d1.f591Z
            r1.append(r4)
            java.lang.String r4 = ": "
            if (r3 != r2) goto L_0x00ed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p011e.C0057d1.f598a0
            goto L_0x00f4
        L_0x00ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p011e.C0057d1.f605b0
        L_0x00f4:
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            k.l r2 = r8.f1261i
            java.lang.String r2 = r2.mo899f()
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r2 = p011e.C0057d1.f559U
            r1.append(r2)
            r1.append(r4)
            k.l r2 = r8.f1262j
            java.lang.String r2 = r2.mo899f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            e.d r2 = new e.d
            java.lang.String r3 = p011e.C0057d1.f683m1
            r4 = 4000(0xfa0, float:5.605E-42)
            r2.<init>((java.lang.String) r3, (p011e.C0072l) r8, (int) r4, (java.lang.Object) r7)
            e.d r3 = new e.d
            java.lang.String r4 = p011e.C0057d1.f641g1
            i.a r5 = p018i.C0145a.f2572A
            r6 = 8882(0x22b2, float:1.2446E-41)
            r3.<init>((java.lang.String) r4, (p011e.C0072l) r5, (int) r6, (java.lang.Object) r7)
            r0.mo604e(r1, r2, r7, r3)
        L_0x013b:
            g.x r0 = p018i.C0145a.f2639j0
            p018i.C0145a.f2637i0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0109b0.mo353o():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo354p(String str) {
    }

    /* renamed from: q */
    public void mo355q() {
        this.f1271s = -50;
    }

    /* renamed from: r */
    public void mo356r() {
        int i = this.f1272t;
        int i2 = this.f1271s;
        if (i != i2) {
            this.f1271s = i2 + ((i - i2) >> 1);
        }
    }
}
