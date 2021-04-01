package p013g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0072l;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0170f;
import p020k.C0173i;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.d0 */
public class C0113d0 extends C0178n implements C0072l {

    /* renamed from: A */
    public static boolean f1340A = false;

    /* renamed from: B */
    public static int f1341B = 0;

    /* renamed from: C */
    public static int[] f1342C = new int[3];

    /* renamed from: D */
    public static int f1343D = 0;

    /* renamed from: E */
    public static int f1344E = 0;

    /* renamed from: F */
    public static boolean f1345F = false;

    /* renamed from: G */
    public static int f1346G = 0;

    /* renamed from: H */
    public static String f1347H = null;

    /* renamed from: I */
    public static int f1348I = 0;

    /* renamed from: J */
    public static int f1349J = 0;

    /* renamed from: K */
    public static boolean f1350K = false;

    /* renamed from: L */
    public static C0055d f1351L = null;

    /* renamed from: M */
    public static int f1352M = -1;

    /* renamed from: N */
    public static boolean f1353N = false;

    /* renamed from: l */
    public static String[] f1354l = null;

    /* renamed from: m */
    public static String[] f1355m = null;

    /* renamed from: n */
    public static byte f1356n = 0;

    /* renamed from: o */
    public static boolean[] f1357o = null;

    /* renamed from: p */
    public static short[] f1358p = null;

    /* renamed from: q */
    public static int f1359q = 0;

    /* renamed from: r */
    public static boolean f1360r = false;

    /* renamed from: s */
    public static byte[] f1361s = null;

    /* renamed from: t */
    public static String f1362t = null;

    /* renamed from: u */
    public static short f1363u = 0;

    /* renamed from: v */
    public static String f1364v = "Vũ trụ 1:dragon1.teamobi.com:14445:0,Vũ trụ 2:dragon2.teamobi.com:14445:0,Vũ trụ 3:dragon3.teamobi.com:14445:0,Vũ trụ 4:dragon4.teamobi.com:14445:0,Vũ trụ 5:dragon5.teamobi.com:14445:0,Vũ trụ 6:dragon6.teamobi.com:14445:0,Vũ trụ 7:dragon7.teamobi.com:14445:0,Võ đài liên vũ trụ:dragonwar.teamobi.com:20000:0,Universe 1:dragon.indonaga.com:14445:1,0,6";

    /* renamed from: w */
    public static String f1365w = "Vũ trụ 1:112.213.94.23:14445:0,Vũ trụ 2:210.211.109.199:14445:0,Vũ trụ 3:112.213.85.88:14445:0,Vũ trụ 4:27.0.12.164:14445:0,Vũ trụ 5:27.0.12.16:14445:0,Vũ trụ 6:27.0.12.173:14445:0,Vũ trụ 7:112.213.94.223:14445:0,Võ đài liên vũ trụ:27.0.12.173:20000:0,Universe 1:54.179.255.27:14445:1,0,6";

    /* renamed from: x */
    public static String f1366x = "Vũ trụ 1:dragon1.teamobi.com:14445:0,Vũ trụ 2:dragon2.teamobi.com:14445:0,Vũ trụ 3:dragon3.teamobi.com:14445:0,Vũ trụ 4:dragon4.teamobi.com:14445:0,Vũ trụ 5:dragon5.teamobi.com:14445:0,Vũ trụ 6:dragon6.teamobi.com:14445:0,Vũ trụ 7:dragon7.teamobi.com:14445:0,Võ đài liên vũ trụ:dragonwar.teamobi.com:20000:0,Universe 1:dragon.indonaga.com:14445:1,0,6";

    /* renamed from: y */
    public static boolean f1367y;

    /* renamed from: z */
    public static String f1368z;

    /* renamed from: i */
    C0055d[] f1369i;

    /* renamed from: j */
    C0055d f1370j;

    /* renamed from: k */
    int f1371k;

    public C0113d0() {
        int i;
        String property = System.getProperty("com.sonyericsson.imei");
        int i2 = C0145a.f2614V;
        m630n();
        if (!C0145a.f2659x) {
            f1359q = 0;
            m632p();
        }
        C0126k.m855A0(true, -1, -1);
        C0126k.f2028t1 = 100;
        C0126k.f2032u1 = 200;
        if (this.f1370j == null) {
            C0055d dVar = new C0055d("Gọi hotline", (C0072l) this, 13, (Object) null);
            this.f1370j = dVar;
            dVar.f407h = C0145a.f2614V - 75;
            if (C0161h.f2758f != 1 || C0145a.f2659x) {
                i = (C0161h.f2753a ? 19 : 2) + 6;
            } else {
                i = C0145a.f2616W - 20;
            }
            dVar.f408i = i;
        }
        f1366x = C0161h.f2758f == 1 ? f1365w : f1364v;
    }

    /* renamed from: k */
    public static void m628k() {
        m629l(f1366x);
    }

    /* renamed from: l */
    public static void m629l(String str) {
        f1342C = new int[3];
        String[] q = C0111c0.m590q(str.trim(), ",", 0);
        C0057d1.m229a(Byte.parseByte(q[q.length - 2]));
        f1354l = new String[(q.length - 2)];
        f1355m = new String[(q.length - 2)];
        f1358p = new short[(q.length - 2)];
        f1361s = new byte[(q.length - 2)];
        f1357o = new boolean[2];
        for (int i = 0; i < q.length - 2; i++) {
            String[] q2 = C0111c0.m590q(q[i].trim(), ":", 0);
            f1354l[i] = q2[0];
            f1355m[i] = q2[1];
            f1358p[i] = Short.parseShort(q2[2]);
            f1361s[i] = Byte.parseByte(q2[3].trim());
            int[] iArr = f1342C;
            byte b = f1361s[i];
            iArr[b] = iArr[b] + 1;
        }
        f1356n = Byte.parseByte(q[q.length - 1]);
        m633q();
        C0145a.m1366v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (p019j.C0149b.m1398c("userAo" + f1343D) != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (p019j.C0149b.m1398c("userAo" + f1343D) != null) goto L_0x0045;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m630n() {
        /*
            r15 = this;
            r0 = 0
            r15.f1371k = r0
            java.lang.String r1 = "acc"
            java.lang.String r1 = p019j.C0149b.m1400e(r1)
            java.lang.String r2 = "userAo"
            java.lang.String r3 = ""
            r4 = 1
            if (r1 != 0) goto L_0x0028
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            int r6 = f1343D
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            byte[] r5 = p019j.C0149b.m1398c(r5)
            if (r5 == 0) goto L_0x0047
            goto L_0x0045
        L_0x0028:
            boolean r5 = r1.equals(r3)
            if (r5 == 0) goto L_0x0045
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            int r6 = f1343D
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            byte[] r5 = p019j.C0149b.m1398c(r5)
            if (r5 == 0) goto L_0x0047
        L_0x0045:
            r15.f1371k = r4
        L_0x0047:
            int r5 = p019j.C0159f.f2750b
            r6 = 4
            if (r5 <= r4) goto L_0x004e
            boolean r5 = p019j.C0157e.f2741j
        L_0x004e:
            int r5 = r15.f1371k
            int r5 = r5 + r6
            e.d[] r5 = new p011e.C0055d[r5]
            r15.f1369i = r5
            int r7 = p018i.C0145a.f2623b0
            int r5 = r5.length
            int r5 = r5 * 15
            int r7 = r7 - r5
            int r7 = r7 + 28
            r5 = 0
        L_0x005e:
            e.d[] r8 = r15.f1369i
            int r9 = r8.length
            if (r5 >= r9) goto L_0x019c
            r9 = 3
            r10 = 2
            r11 = 0
            if (r5 == 0) goto L_0x00d3
            r12 = 7
            if (r5 == r4) goto L_0x00b1
            r13 = 5
            if (r5 == r10) goto L_0x0099
            r12 = 8
            if (r5 == r9) goto L_0x0081
            if (r5 == r6) goto L_0x0076
            goto L_0x017d
        L_0x0076:
            e.d r9 = new e.d
            java.lang.String r13 = p011e.C0057d1.f505M1
            r9.<init>((java.lang.String) r13, (p011e.C0072l) r15, (int) r12, (java.lang.Object) r11)
            r8[r6] = r9
            goto L_0x017d
        L_0x0081:
            int r14 = r15.f1371k
            if (r14 != r4) goto L_0x008e
            e.d r12 = new e.d
            r12.<init>((java.lang.String) r3, (p011e.C0072l) r15, (int) r13, (java.lang.Object) r11)
            r8[r9] = r12
            goto L_0x017d
        L_0x008e:
            e.d r13 = new e.d
            java.lang.String r14 = p011e.C0057d1.f505M1
            r13.<init>((java.lang.String) r14, (p011e.C0072l) r15, (int) r12, (java.lang.Object) r11)
            r8[r9] = r13
            goto L_0x017d
        L_0x0099:
            int r9 = r15.f1371k
            if (r9 != r4) goto L_0x00a8
            e.d r9 = new e.d
            java.lang.String r13 = p011e.C0057d1.f496L
            r9.<init>((java.lang.String) r13, (p011e.C0072l) r15, (int) r12, (java.lang.Object) r11)
            r8[r10] = r9
            goto L_0x017d
        L_0x00a8:
            e.d r9 = new e.d
            r9.<init>((java.lang.String) r3, (p011e.C0072l) r15, (int) r13, (java.lang.Object) r11)
            r8[r10] = r9
            goto L_0x017d
        L_0x00b1:
            int r9 = r15.f1371k
            if (r9 != r4) goto L_0x00c8
            e.d r9 = new e.d
            r12 = 10100(0x2774, float:1.4153E-41)
            r9.<init>((java.lang.String) r3, (p011e.C0072l) r15, (int) r12, (java.lang.Object) r11)
            r8[r4] = r9
            e.d[] r8 = r15.f1369i
            r8 = r8[r4]
            java.lang.String r9 = p011e.C0057d1.f530P5
        L_0x00c4:
            r8.f400a = r9
            goto L_0x017d
        L_0x00c8:
            e.d r9 = new e.d
            java.lang.String r13 = p011e.C0057d1.f496L
            r9.<init>((java.lang.String) r13, (p011e.C0072l) r15, (int) r12, (java.lang.Object) r11)
            r8[r4] = r9
            goto L_0x017d
        L_0x00d3:
            e.d r12 = new e.d
            r12.<init>((java.lang.String) r3, (p011e.C0072l) r15, (int) r9, (java.lang.Object) r11)
            r8[r0] = r12
            if (r1 != 0) goto L_0x0102
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
            java.lang.String r9 = p011e.C0057d1.f530P5
            r8.f400a = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            int r9 = f1343D
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            byte[] r8 = p019j.C0149b.m1398c(r8)
            if (r8 == 0) goto L_0x017d
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
        L_0x00ff:
            java.lang.String r9 = p011e.C0057d1.f667k
            goto L_0x00c4
        L_0x0102:
            boolean r8 = r1.equals(r3)
            if (r8 == 0) goto L_0x012c
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
            java.lang.String r9 = p011e.C0057d1.f530P5
            r8.f400a = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            int r9 = f1343D
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            byte[] r8 = p019j.C0149b.m1398c(r8)
            if (r8 == 0) goto L_0x017d
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
            goto L_0x00ff
        L_0x012c:
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = p011e.C0057d1.f537Q5
            r9.append(r11)
            java.lang.String r11 = ": "
            r9.append(r11)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.f400a = r9
            e.d[] r8 = r15.f1369i
            r8 = r8[r0]
            java.lang.String r8 = r8.f400a
            int r8 = r8.length()
            r9 = 23
            if (r8 <= r9) goto L_0x017d
            e.d[] r8 = r15.f1369i
            r11 = r8[r0]
            r8 = r8[r0]
            java.lang.String r8 = r8.f400a
            java.lang.String r8 = r8.substring(r0, r9)
            r11.f400a = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            e.d[] r9 = r15.f1369i
            r9 = r9[r0]
            java.lang.String r11 = r9.f400a
            r8.append(r11)
            java.lang.String r11 = "..."
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r9.f400a = r8
        L_0x017d:
            e.d[] r8 = r15.f1369i
            r9 = r8[r5]
            r9.f408i = r7
            r8 = r8[r5]
            r8.mo140e()
            e.d[] r8 = r15.f1369i
            r9 = r8[r5]
            int r11 = p018i.C0145a.f2614V
            r8 = r8[r5]
            int r8 = r8.f409j
            int r11 = r11 - r8
            int r11 = r11 / r10
            r9.f407h = r11
            int r7 = r7 + 30
            int r5 = r5 + 1
            goto L_0x005e
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0113d0.m630n():void");
    }

    /* renamed from: o */
    public static void m631o() {
        byte[] c = C0149b.m1398c("NRlink");
        if (c == null) {
            m629l(f1366x);
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(c));
        try {
            f1342C = new int[3];
            C0057d1.m229a(dataInputStream.readByte());
            int readByte = dataInputStream.readByte();
            f1354l = new String[readByte];
            f1355m = new String[readByte];
            f1358p = new short[readByte];
            f1361s = new byte[readByte];
            for (int i = 0; i < readByte; i++) {
                f1354l[i] = dataInputStream.readUTF();
                f1355m[i] = dataInputStream.readUTF();
                f1358p[i] = dataInputStream.readShort();
                f1361s[i] = dataInputStream.readByte();
                int[] iArr = f1342C;
                byte b = f1361s[i];
                iArr[b] = iArr[b] + 1;
            }
            f1356n = dataInputStream.readByte();
            dataInputStream.close();
            C0115e0.m774j();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m632p() {
        C0111c0.m584k("load Screen= " + f1353N + " select= " + f1359q);
        this.f2972b = f1353N ? new C0055d("", (C0072l) this, this.f1369i[f1359q].f403d, (Object) null) : f1351L;
    }

    /* renamed from: q */
    public static void m633q() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(C0057d1.f680l5);
            dataOutputStream.writeByte(f1354l.length);
            int i = 0;
            while (true) {
                String[] strArr = f1354l;
                if (i < strArr.length) {
                    dataOutputStream.writeUTF(strArr[i]);
                    dataOutputStream.writeUTF(f1355m[i]);
                    dataOutputStream.writeShort(f1358p[i]);
                    dataOutputStream.writeByte(f1361s[i]);
                    i++;
                } else {
                    dataOutputStream.writeByte(f1356n);
                    C0149b.m1402g("NRlink", byteArrayOutputStream.toByteArray());
                    dataOutputStream.close();
                    C0115e0.m774j();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        int i;
        C0177m mVar;
        int i2;
        int i3;
        int i4;
        String str;
        C0159f fVar2;
        C0177m mVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0143b bVar;
        C0159f fVar3 = fVar;
        if (!f1353N) {
            fVar3.mo772D(0);
            fVar3.mo783l(0, 0, C0145a.f2614V, C0145a.f2616W);
            boolean z = f1345F;
        } else {
            C0145a.m1340L(fVar);
        }
        if (C0161h.f2753a) {
            C0177m.f2929F.mo910b(fVar, "in house test", C0145a.f2614V - 2, 2, 1, C0177m.f2925B);
            i = 17;
        } else {
            i = 2;
        }
        C0177m.f2929F.mo910b(fVar, "v1.9.3", C0145a.f2614V - 2, i + 15, 1, C0177m.f2925B);
        if ((!f1350K || f1353N) && C0161h.f2758f == 1 && !C0145a.f2659x) {
            mVar2 = C0177m.f2929F;
            str = f1368z;
            i4 = C0145a.f2614V - 2;
            i3 = C0145a.f2616W - 15;
            i2 = 1;
            mVar = C0177m.f2925B;
            fVar2 = fVar;
        } else {
            mVar2 = C0177m.f2929F;
            str = f1368z;
            i4 = C0145a.f2614V - 2;
            i2 = 1;
            mVar = C0177m.f2925B;
            fVar2 = fVar;
            i3 = i;
        }
        mVar2.mo910b(fVar2, str, i4, i3, i2, mVar);
        int i12 = C0145a.f2614V;
        if (C0145a.f2637i0 != null) {
            return;
        }
        if (f1353N) {
            int length = (C0145a.f2623b0 - (this.f1369i.length * 15)) - 15;
            if (length < 25) {
                length = 25;
            }
            C0143b bVar2 = C0170f.f2812Q;
            if (bVar2 != null) {
                fVar3.mo776e(bVar2, C0145a.f2621a0, length, 3);
            }
            int i13 = 0;
            while (true) {
                C0055d[] dVarArr = this.f1369i;
                if (i13 >= dVarArr.length) {
                    break;
                }
                dVarArr[i13].mo138b(fVar3);
                i13++;
            }
            fVar3.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            if (f1352M != -1) {
                bVar = C0126k.f1929X2;
                i11 = 0;
                i10 = f1352M * 7;
                i9 = 7;
                i8 = 7;
                i7 = 0;
                i5 = ((C0145a.f2614V - C0177m.f2951s.mo914f(this.f1369i[this.f1371k + 2].f400a)) >> 1) - 10;
                i6 = this.f1369i[this.f1371k + 2].f408i + 9;
            } else if (C0145a.f2600O % 20 > 10) {
                bVar = C0126k.f1929X2;
                i11 = 0;
                i10 = 14;
                i9 = 7;
                i8 = 7;
                i7 = 0;
                i5 = ((C0145a.f2614V - C0177m.f2951s.mo914f(this.f1369i[this.f1371k + 2].f400a)) >> 1) - 10;
                i6 = this.f1369i[this.f1371k + 2].f408i + 10;
            } else {
                return;
            }
            fVar.mo779h(bVar, i11, i10, i9, i8, i7, i5, i6, 0);
        } else if (!f1345F) {
            fVar3.mo776e(C0170f.f2812Q, C0145a.f2621a0, C0145a.f2623b0 - 32, 3);
            if (!f1350K) {
                C0177m.f2948p.mo909a(fVar, C0057d1.f509M5, C0145a.f2621a0, C0145a.f2623b0 + 24, 2);
                C0055d dVar = f1351L;
                if (dVar != null) {
                    dVar.mo138b(fVar3);
                    return;
                }
                return;
            }
            C0055d dVar2 = f1351L;
            if (dVar2 != null) {
                dVar2.mo138b(fVar3);
            }
            fVar3.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
            C0177m.f2948p.mo909a(fVar, C0057d1.f738u0 + f1346G + "%", C0145a.f2614V / 2, C0145a.f2623b0 + 24, 2);
            C0159f fVar4 = fVar;
            C0126k.m883W0(C0126k.f1945b3, C0126k.f1949c3, C0126k.f1953d3, (float) ((C0145a.f2614V / 2) + -50), (float) (C0145a.f2623b0 + 45), 100, 100.0f, fVar4);
            C0126k.m883W0(C0126k.f1933Y2, C0126k.f1937Z2, C0126k.f1941a3, (float) ((C0145a.f2614V / 2) + -50), (float) (C0145a.f2623b0 + 45), 100, (float) f1346G, fVar4);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        boolean z;
        int i2 = i;
        C0111c0.m584k("perform " + i2);
        if (i2 == 1000) {
            C0145a.m1360o();
        }
        int i3 = 1;
        if (i2 == 1 || i2 == 4) {
            mo363j();
        }
        if (i2 == 2) {
            f1367y = false;
            C0055d dVar = new C0055d(C0057d1.f516N5, (C0072l) this, 4, (Object) null);
            f1351L = dVar;
            dVar.f407h = (C0145a.f2614V / 2) - (C0178n.f2967e / 2);
            f1351L.f408i = C0145a.f2623b0 + 65;
            this.f2973c = null;
            if (!C0145a.f2659x) {
                f1351L.f407h = (C0145a.f2614V / 2) - (C0178n.f2967e / 2);
                f1351L.f408i = (C0145a.f2616W - C0178n.f2968f) - 1;
            }
            this.f2972b = new C0055d("", (C0072l) this, 4, (Object) null);
            if (!f1350K) {
                C0105d.m365M().mo255X((byte) 1, (C0173i) null);
                if (!C0145a.f2659x) {
                    f1351L.f412m = true;
                    this.f2972b = new C0055d("", (C0072l) this, 4, (Object) null);
                }
                f1350K = true;
            }
        }
        if (i2 == 3) {
            if (C0145a.f2633g0 == null) {
                C0145a.f2633g0 = new C0170f();
            }
            C0145a.f2633g0.mo342f();
            C0111c0.m584k("toi day");
            boolean z2 = C0149b.m1400e("acc") != null && !C0149b.m1400e("acc").equals("");
            if (C0149b.m1400e("userAo" + f1343D) != null) {
                if (!C0149b.m1400e("userAo" + f1343D).equals("")) {
                    z = true;
                    if (!z2 || z) {
                        C0145a.f2633g0.mo834n();
                    } else {
                        C0145a.m1360o();
                        String e = C0149b.m1400e("userAo" + f1343D);
                        if (e == null || e.equals("")) {
                            C0105d.m365M().mo277f0("");
                            C0111c0.m584k("tao user ao");
                        } else {
                            C0145a.f2633g0.f2821E = true;
                            C0145a.m1360o();
                            C0105d.m365M().mo246S0();
                            C0105d.m365M().mo274e0(e, "", "1.9.3", (byte) 1);
                        }
                        C0145a.m1351Z();
                    }
                    C0170f.f2811P = f1354l[f1343D];
                }
            }
            z = false;
            if (!z2) {
            }
            C0145a.f2633g0.mo834n();
            C0170f.f2811P = f1354l[f1343D];
        }
        if (i2 == 10100) {
            if (C0145a.f2633g0 == null) {
                C0145a.f2633g0 = new C0170f();
            }
            C0145a.f2633g0.mo342f();
            C0145a.m1360o();
            C0105d.m365M().mo277f0("");
            C0111c0.m584k("tao user ao");
            C0145a.m1351Z();
            C0170f.f2811P = f1354l[f1343D];
        }
        if (i2 == 5) {
            m628k();
            if (f1354l.length != 1) {
                C0173i iVar = new C0173i("");
                for (String dVar2 : f1354l) {
                    iVar.addElement(new C0055d(dVar2, (C0072l) this, 6, (Object) null));
                }
                C0145a.f2627d0.mo590g(iVar, 0);
                if (!C0145a.f2659x) {
                    C0145a.f2627d0.f2241c = f1343D;
                }
            } else {
                return;
            }
        }
        if (i2 == 6) {
            f1343D = C0145a.f2627d0.f2241c;
            mo365r();
        }
        if (i2 == 7) {
            if (C0145a.f2633g0 == null) {
                C0145a.f2633g0 = new C0170f();
            }
            C0145a.f2633g0.mo342f();
        }
        if (i2 == 8) {
            int d = C0149b.m1399d("lowGraphic");
            C0173i iVar2 = new C0173i("cau hinh");
            iVar2.addElement(new C0055d(C0057d1.f723s, (C0072l) this, 9, (Object) null));
            iVar2.addElement(new C0055d(C0057d1.f730t, (C0072l) this, 10, (Object) null));
            iVar2.addElement(new C0055d(C0057d1.f737u, (C0072l) this, 14, (Object) null));
            C0145a.f2627d0.mo590g(iVar2, 0);
            i3 = 1;
            C0136u uVar = C0145a.f2627d0;
            if (d == 1) {
                uVar.f2241c = 0;
            } else if (d == 0) {
                uVar.f2241c = 2;
            } else {
                uVar.f2241c = 1;
            }
        }
        if (i2 == 9) {
            C0149b.m1403h("lowGraphic", i3);
            C0145a.m1348W(C0057d1.f768y2, 8885, (Object) null);
        }
        if (i2 == 10) {
            C0149b.m1403h("lowGraphic", 2);
            C0145a.m1348W(C0057d1.f768y2, 8885, (Object) null);
        }
        if (i2 == 14) {
            C0149b.m1403h("lowGraphic", 0);
            C0145a.m1348W(C0057d1.f768y2, 8885, (Object) null);
        }
        if (i2 == 11) {
            if (C0145a.f2633g0 == null) {
                C0145a.f2633g0 = new C0170f();
            }
            C0145a.f2633g0.mo342f();
            String e2 = C0149b.m1400e("userAo" + f1343D);
            if (e2 == null || e2.equals("")) {
                C0105d.m365M().mo277f0("");
            } else {
                C0145a.f2633g0.f2821E = true;
                C0145a.m1360o();
                C0105d.m365M().mo246S0();
                C0105d.m365M().mo274e0(e2, "", "1.9.3", (byte) 1);
            }
            C0145a.m1352a0(C0057d1.f724s0);
            C0111c0.m584k("tao user ao");
        }
        if (i2 == 12) {
            C0146b.f2678f.mo736c();
        }
        if (i2 != 13) {
            return;
        }
        if (!f1350K || f1353N) {
            int i4 = C0161h.f2758f;
            if (i4 == 1) {
                C0161h.m1485c();
            } else if (i4 == 2) {
                C0161h.m1483a();
            } else if (i4 == 3 || i4 == 5) {
                C0161h.m1484b();
            } else if (i4 == 6) {
                C0161h.m1486d();
            }
        }
    }

    /* renamed from: f */
    public void mo342f() {
        C0145a.m1360o();
        C0126k.f2032u1 = 0;
        C0126k.f2028t1 = 0;
        m630n();
        f1360r = false;
        C0145a.f2633g0 = null;
        String e = C0149b.m1400e("ResVersion");
        if (((e == null || e == "") ? -1 : Integer.parseInt(e)) > 0) {
            f1353N = true;
            C0145a.m1338H(0);
        }
        f1345F = true;
        C0055d dVar = this.f1369i[this.f1371k + 2];
        dVar.f400a = C0057d1.f420A0 + ": " + f1354l[f1343D];
        this.f2972b = new C0055d("", (C0072l) this, this.f1369i[f1359q].f403d, (Object) null);
        C0055d[] dVarArr = this.f1369i;
        int i = this.f1371k;
        dVarArr[i + 1].f400a = C0057d1.f496L;
        if (dVarArr.length == i + 4) {
            dVarArr[i + 3].f400a = C0057d1.f505M1;
        }
        super.mo342f();
    }

    /* renamed from: h */
    public void mo343h() {
        if (f1340A) {
            int i = f1341B + 1;
            f1341B = i;
            if (i == 50) {
                C0145a.f2638i1.mo366s(f1362t, f1363u);
            }
            if (f1341B >= 100 && C0150c.m1414n().mo746p()) {
                if (C0145a.f2633g0 == null) {
                    C0145a.f2633g0 = new C0170f();
                }
                C0145a.f2633g0.mo834n();
                C0105d.m365M().mo228J();
                f1340A = false;
            }
        }
        int i2 = f1344E;
        if (i2 > 0) {
            int i3 = i2 - 1;
            f1344E = i3;
            if (i3 == 0) {
                C0145a.m1366v();
            }
        }
        int i4 = 0;
        while (true) {
            C0055d[] dVarArr = this.f1369i;
            if (i4 >= dVarArr.length) {
                break;
            }
            if (i4 == f1359q) {
                dVarArr[i4].f412m = true;
            } else {
                dVarArr[i4].f412m = false;
            }
            i4++;
        }
        C0126k.f2028t1++;
        if (!f1353N && (f1345F || f1346G == 100)) {
            f1351L = null;
        }
        super.mo343h();
    }

    /* renamed from: i */
    public void mo344i() {
        int i = 0;
        if (C0145a.f2659x) {
            C0055d dVar = this.f1370j;
            if (dVar != null && dVar.mo137a()) {
                this.f1370j.mo139d();
            }
            if (f1353N) {
                while (true) {
                    C0055d[] dVarArr = this.f1369i;
                    if (i >= dVarArr.length) {
                        break;
                    }
                    if (dVarArr[i] != null && dVarArr[i].mo137a()) {
                        this.f1369i[i].mo139d();
                    }
                    i++;
                }
            } else {
                C0055d dVar2 = f1351L;
                if (dVar2 != null && dVar2.mo137a()) {
                    f1351L.mo139d();
                }
                super.mo344i();
                return;
            }
        } else {
            if (C0161h.f2758f == 1) {
                boolean[] zArr = C0145a.f2574B;
                if (zArr[13]) {
                    zArr[13] = false;
                    this.f1370j.mo139d();
                }
            }
            if (f1353N) {
                boolean[] zArr2 = C0145a.f2574B;
                if (zArr2[8]) {
                    int length = this.f1369i.length - 1;
                    zArr2[8] = false;
                    int i2 = f1359q + 1;
                    f1359q = i2;
                    if (i2 > length) {
                        f1359q = 0;
                    }
                    m632p();
                }
                boolean[] zArr3 = C0145a.f2574B;
                if (zArr3[2]) {
                    int length2 = this.f1369i.length - 1;
                    zArr3[2] = false;
                    int i3 = f1359q - 1;
                    f1359q = i3;
                    if (i3 < 0) {
                        f1359q = length2;
                    }
                    m632p();
                }
            }
        }
        if (!f1360r) {
            super.mo344i();
        }
    }

    /* renamed from: j */
    public void mo363j() {
        if (C0145a.f2638i1 == null) {
            C0145a.f2638i1 = new C0113d0();
        }
        f1349J = 0;
        f1346G = 0;
        f1367y = true;
        C0145a.f2638i1.mo367t();
        f1350K = false;
        f1351L.f412m = true;
        this.f2972b = new C0055d("", (C0072l) this, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo364m() {
        if (!f1353N) {
            C0055d dVar = new C0055d(C0057d1.f523O5, (C0072l) this, 2, (Object) null);
            f1351L = dVar;
            dVar.f412m = true;
            dVar.f407h = (C0145a.f2614V / 2) - (C0178n.f2967e / 2);
            f1351L.f408i = C0145a.f2623b0 + 45;
            int i = f1351L.f408i;
            int i2 = C0145a.f2616W;
            if (i > i2 - 26) {
                f1351L.f408i = i2 - 26;
            }
        }
        if (!C0145a.f2659x) {
            f1359q = 0;
            m632p();
        }
    }

    /* renamed from: r */
    public void mo365r() {
        f1344E = 30;
        C0145a.m1352a0(C0057d1.f724s0);
        if (C0150c.m1414n().mo746p()) {
            C0150c.m1414n().mo744k();
        }
        C0146b.f2673a = f1355m[f1343D];
        C0146b.f2674b = f1358p[f1343D];
        if (f1361s[f1343D] != C0057d1.f680l5) {
            C0057d1.m229a(f1361s[f1343D]);
        }
        C0170f.f2811P = f1354l[f1343D];
        m630n();
        C0145a.m1360o();
    }

    /* renamed from: s */
    public void mo366s(String str, short s) {
        f1344E = 30;
        C0145a.m1352a0(C0057d1.f724s0);
        C0146b.f2673a = str;
        C0146b.f2674b = s;
        m630n();
        C0145a.m1361p(str, s);
    }

    /* renamed from: t */
    public void mo367t() {
        C0126k.f2028t1 = 0;
        C0126k.f2032u1 = 0;
        m630n();
        f1353N = false;
        f1346G = 0;
        f1345F = false;
        f1350K = false;
        f1349J = 0;
        String str = C0057d1.f724s0;
        mo364m();
        super.mo342f();
    }

    /* renamed from: u */
    public void mo368u() {
        C0126k.f2032u1 = 0;
        C0126k.f2028t1 = 0;
        m630n();
        f1360r = false;
        C0145a.f2633g0 = null;
        String e = C0149b.m1400e("ResVersion");
        if (((e == null || e == "") ? -1 : Integer.parseInt(e)) > 0) {
            f1353N = true;
            C0145a.m1338H(0);
        }
        f1345F = true;
        C0055d dVar = this.f1369i[this.f1371k + 2];
        dVar.f400a = C0057d1.f420A0 + ": " + f1354l[f1343D];
        this.f2972b = new C0055d("", (C0072l) this, this.f1369i[f1359q].f403d, (Object) null);
        C0055d[] dVarArr = this.f1369i;
        int i = this.f1371k;
        dVarArr[i + 1].f400a = C0057d1.f496L;
        if (dVarArr.length == i + 4) {
            dVarArr[i + 3].f400a = C0057d1.f505M1;
        }
        super.mo342f();
    }
}
