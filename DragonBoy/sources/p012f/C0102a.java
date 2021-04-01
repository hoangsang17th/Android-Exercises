package p012f;

import p010d.C0045c;
import p011e.C0082q;
import p013g.C0107a0;
import p013g.C0114e;
import p013g.C0118g;
import p013g.C0133r;
import p020k.C0173i;

/* renamed from: f.a */
public class C0102a {
    /* renamed from: a */
    private static void m332a(C0045c cVar) {
        short s;
        C0114e eVar;
        int i;
        short s2;
        byte b;
        byte b2;
        byte b3;
        C0082q[] qVarArr;
        byte b4;
        try {
            byte readByte = cVar.mo128d().readByte();
            if (readByte == 0) {
                C0107a0.m517s();
                C0173i iVar = new C0173i("");
                short readShort = cVar.mo128d().readShort();
                short s3 = 0;
                int i2 = 0;
                while (s3 < readShort) {
                    C0133r rVar = new C0133r();
                    short readShort2 = cVar.mo128d().readShort();
                    int i3 = s3 + 1;
                    short readShort3 = cVar.mo128d().readShort();
                    byte readByte2 = cVar.mo128d().readByte();
                    byte readByte3 = cVar.mo128d().readByte();
                    byte readByte4 = cVar.mo128d().readByte();
                    byte readByte5 = cVar.mo128d().readByte();
                    if (readByte5 == 0) {
                        s = cVar.mo128d().readShort();
                        eVar = null;
                    } else {
                        eVar = C0133r.m1018c(cVar.mo128d().readShort(), cVar.mo128d().readShort(), cVar.mo128d().readShort(), cVar.mo128d().readShort());
                        s = -1;
                    }
                    String readUTF = cVar.mo128d().readUTF();
                    String readUTF2 = cVar.mo128d().readUTF();
                    byte readByte6 = cVar.mo128d().readByte();
                    byte readByte7 = cVar.mo128d().readByte();
                    byte b5 = readByte6;
                    int readByte8 = cVar.mo128d().readByte();
                    if (readByte8 != 0) {
                        b3 = readByte7;
                        C0082q[] qVarArr2 = new C0082q[readByte8];
                        b2 = readByte4;
                        int i4 = 0;
                        while (i4 < readByte8) {
                            int i5 = readByte8;
                            int readUnsignedByte = cVar.mo128d().readUnsignedByte();
                            byte b6 = readByte3;
                            int readUnsignedShort = cVar.mo128d().readUnsignedShort();
                            short s4 = readShort;
                            byte readByte9 = cVar.mo128d().readByte();
                            int i6 = i2;
                            if (readUnsignedByte != -1) {
                                qVarArr2[i4] = new C0082q(readUnsignedByte, readUnsignedShort);
                                qVarArr2[i4].f1007b = readByte9;
                            }
                            i4++;
                            readByte8 = i5;
                            readByte3 = b6;
                            readShort = s4;
                            i2 = i6;
                        }
                        s2 = readShort;
                        i = i2;
                        b = readByte3;
                        qVarArr = qVarArr2;
                        b4 = b5;
                    } else {
                        s2 = readShort;
                        i = i2;
                        b3 = readByte7;
                        b2 = readByte4;
                        b = readByte3;
                        b4 = b5;
                        qVarArr = null;
                    }
                    byte b7 = b3;
                    String str = readUTF2;
                    short s5 = i3;
                    C0114e eVar2 = eVar;
                    C0133r rVar2 = rVar;
                    rVar.mo571e(readShort2, i3, readShort3, readByte2, readByte5, s, readUTF, str, eVar2, qVarArr);
                    rVar2.mo572f(b4);
                    rVar2.mo573g(b7);
                    rVar2.mo569b(b, b2);
                    iVar = iVar;
                    iVar.addElement(rVar2);
                    i2 = b4 > 0 ? i + 1 : i;
                    s3 = s5;
                    readShort = s2;
                }
                short s6 = readShort;
                int i7 = i2;
                C0107a0.m517s().mo345l(iVar, i2, readShort);
                C0107a0.m517s().mo342f();
            } else if (readByte == 1) {
                short readShort4 = cVar.mo128d().readShort();
                byte readByte10 = cVar.mo128d().readByte();
                if (C0133r.m1017a(C0107a0.f1206e0, readShort4) != null) {
                    C0133r.m1017a(C0107a0.f1206e0, readShort4).mo573g(readByte10);
                }
                C0107a0.m509j();
            } else if (readByte == 2) {
                short readShort5 = cVar.mo128d().readShort();
                byte readByte11 = cVar.mo128d().readByte();
                int i8 = 0;
                for (int i9 = 0; i9 < C0107a0.f1206e0.size(); i9++) {
                    C0133r rVar3 = (C0133r) C0107a0.f1206e0.elementAt(i9);
                    if (rVar3 != null) {
                        if (rVar3.f2196e == readShort5) {
                            rVar3.mo572f(readByte11);
                        }
                        if (rVar3.f2201j > 0) {
                            i8++;
                        }
                    }
                }
                C0107a0.m510k(i8, C0107a0.f1206e0.size());
                if (C0133r.m1017a(C0107a0.f1207f0, readShort5) != null) {
                    C0133r.m1017a(C0107a0.f1207f0, readShort5).mo572f(readByte11);
                }
            } else if (readByte == 3) {
                short readShort6 = cVar.mo128d().readShort();
                byte readByte12 = cVar.mo128d().readByte();
                byte readByte13 = cVar.mo128d().readByte();
                if (C0133r.m1017a(C0107a0.f1206e0, readShort6) != null) {
                    C0133r.m1017a(C0107a0.f1206e0, readShort6).mo569b(readByte12, readByte13);
                }
                if (C0133r.m1017a(C0107a0.f1207f0, readShort6) != null) {
                    C0133r.m1017a(C0107a0.f1207f0, readShort6).mo569b(readByte12, readByte13);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m333b(C0045c cVar) {
        try {
            byte readByte = cVar.mo128d().readByte();
            int i = 0;
            if (readByte == 0) {
                int readByte2 = cVar.mo128d().readByte();
                short[] sArr = new short[readByte2];
                while (i < readByte2) {
                    sArr[i] = cVar.mo128d().readShort();
                    i++;
                }
                C0118g.m792q().mo473k(sArr, cVar.mo128d().readByte(), cVar.mo128d().readInt(), cVar.mo128d().readShort());
            } else if (readByte == 1) {
                int readByte3 = cVar.mo128d().readByte();
                short[] sArr2 = new short[readByte3];
                while (i < readByte3) {
                    sArr2[i] = cVar.mo128d().readShort();
                    i++;
                }
                C0118g.m792q().mo472j(sArr2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: e.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: e.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: e.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: g.e} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [int] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v10, types: [int] */
    /* JADX WARNING: type inference failed for: r4v12, types: [int] */
    /* JADX WARNING: type inference failed for: r4v23, types: [int] */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v29, types: [int] */
    /* JADX WARNING: type inference failed for: r4v31, types: [int] */
    /* JADX WARNING: type inference failed for: r4v33, types: [int] */
    /* JADX WARNING: type inference failed for: r4v39, types: [int] */
    /* JADX WARNING: type inference failed for: r7v33, types: [g.e] */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r7v37 */
    /* JADX WARNING: type inference failed for: r7v38 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r4v50 */
    /* JADX WARNING: type inference failed for: r4v51 */
    /* JADX WARNING: type inference failed for: r4v52 */
    /* JADX WARNING: type inference failed for: r7v41 */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r4v54 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0efd A[Catch:{ Exception -> 0x0f9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0f1d A[Catch:{ Exception -> 0x0f9c }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m334c(p010d.C0045c r17) {
        /*
            r0 = r17
            byte r1 = r0.f327a     // Catch:{ Exception -> 0x0f9c }
            r2 = -113(0xffffffffffffff8f, float:NaN)
            r3 = 5
            r4 = 0
            if (r1 == r2) goto L_0x0f60
            r2 = -89
            r5 = 1
            if (r1 == r2) goto L_0x0f52
            r2 = 31
            r6 = -1
            r7 = 0
            if (r1 == r2) goto L_0x0ea1
            r2 = 42
            if (r1 == r2) goto L_0x0e80
            r8 = 48
            if (r1 == r8) goto L_0x0e61
            r8 = 93
            if (r1 == r8) goto L_0x0e4c
            r8 = 127(0x7f, float:1.78E-43)
            if (r1 == r8) goto L_0x0e47
            r8 = -111(0xffffffffffffff91, float:NaN)
            java.lang.String r9 = ""
            if (r1 == r8) goto L_0x0e0c
            r8 = -110(0xffffffffffffff92, float:NaN)
            if (r1 == r8) goto L_0x0da7
            r8 = -106(0xffffffffffffff96, float:NaN)
            if (r1 == r8) goto L_0x0d7c
            r8 = -105(0xffffffffffffff97, float:NaN)
            if (r1 == r8) goto L_0x0d41
            r8 = 51
            java.lang.String r10 = "char ID="
            if (r1 == r8) goto L_0x0cc7
            r8 = 52
            r11 = 3
            r12 = 2
            if (r1 == r8) goto L_0x0c27
            r8 = 113(0x71, float:1.58E-43)
            if (r1 == r8) goto L_0x0bec
            r8 = 114(0x72, float:1.6E-43)
            if (r1 == r8) goto L_0x0be7
            switch(r1) {
                case -127: goto L_0x0be2;
                case -126: goto L_0x0b93;
                case -125: goto L_0x0b1b;
                case -124: goto L_0x0894;
                case -123: goto L_0x0876;
                case -122: goto L_0x0838;
                case -121: goto L_0x0826;
                case -120: goto L_0x0814;
                case -119: goto L_0x0804;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r1) {
                case -117: goto L_0x07d2;
                case -116: goto L_0x07c3;
                case -115: goto L_0x079a;
                default: goto L_0x0051;
            }
        L_0x0051:
            java.lang.String r2 = "1.9.3"
            switch(r1) {
                case -103: goto L_0x0635;
                case -102: goto L_0x060c;
                case -101: goto L_0x05d7;
                case -100: goto L_0x03f4;
                default: goto L_0x0056;
            }
        L_0x0056:
            r2 = 7
            r8 = 4
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            r13 = 6
            switch(r1) {
                case 100: goto L_0x035d;
                case 101: goto L_0x0266;
                case 102: goto L_0x0194;
                default: goto L_0x005e;
            }
        L_0x005e:
            switch(r1) {
                case 121: goto L_0x0165;
                case 122: goto L_0x013a;
                case 123: goto L_0x00c6;
                case 124: goto L_0x008f;
                case 125: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0f9c
        L_0x0063:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r0 = r0.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r0 != r2) goto L_0x0084
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x007f:
            r0.mo392L0(r1)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0084:
            g.e r2 = p013g.C0126k.m881V(r0)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0f9c
            g.e r0 = p013g.C0126k.m881V(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x007f
        L_0x008f:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r1 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "noi chuyen = "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r0)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "npc ID= "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            e.b0 r1 = p013g.C0126k.m891b0(r1)     // Catch:{ Exception -> 0x0f9c }
            if (r1 == 0) goto L_0x0f9c
            r1.mo431j(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x00c6:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r2 = r2.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r4.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= "
            r4.append(r6)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r2)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = " y= "
            r4.append(r6)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r3)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "chaPos= "
            r4.append(r6)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "type Pos= "
            r4.append(r6)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r0)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0f9c }
            g.e r4 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r4) goto L_0x011f
            g.e r7 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0129
        L_0x011f:
            g.e r4 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            if (r4 == 0) goto L_0x0129
            g.e r7 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
        L_0x0129:
            if (r7 == 0) goto L_0x0f9c
            if (r0 != 0) goto L_0x0130
            r1 = 60
            goto L_0x0132
        L_0x0130:
            r1 = 173(0xad, float:2.42E-43)
        L_0x0132:
            p001b.C0020p.m98f(r1, r7, r5)     // Catch:{ Exception -> 0x0f9c }
            r7.mo408U0(r2, r3, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x013a:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r1.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = "second login = "
            r1.append(r2)     // Catch:{ Exception -> 0x0f9c }
            r1.append(r0)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r1)     // Catch:{ Exception -> 0x0f9c }
            p020k.C0170f.f2813R = r0     // Catch:{ Exception -> 0x0f9c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0f9c }
            p020k.C0170f.f2814S = r0     // Catch:{ Exception -> 0x0f9c }
            p020k.C0170f.f2815T = r0     // Catch:{ Exception -> 0x0f9c }
            p018i.C0145a.m1366v()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0165:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.readUTF()     // Catch:{ Exception -> 0x0f9c }
            p019j.C0161h.f2754b = r1     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x0f9c }
            p019j.C0161h.f2755c = r0     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r0.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = "SHOW AD public ID= "
            r0.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = p019j.C0161h.f2754b     // Catch:{ Exception -> 0x0f9c }
            r0.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r0)     // Catch:{ Exception -> 0x0f9c }
            p019j.C0161h.m1489g()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0194:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r1 == 0) goto L_0x01a4
            if (r1 == r5) goto L_0x01a4
            if (r1 == r12) goto L_0x01a4
            if (r1 != r13) goto L_0x01f8
        L_0x01a4:
            g.c r5 = p013g.C0137v.m1053n()     // Catch:{ Exception -> 0x0f9c }
            if (r5 != 0) goto L_0x01ab
            return
        L_0x01ab:
            if (r1 != r13) goto L_0x01ba
            r5.f2326t = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2325s = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f1295r0 = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f1294q0 = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2317l = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2315k = r9     // Catch:{ Exception -> 0x0f9c }
            return
        L_0x01ba:
            java.io.DataInputStream r6 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r6 = r6.readByte()     // Catch:{ Exception -> 0x0f9c }
            g.e[] r10 = new p013g.C0114e[r6]     // Catch:{ Exception -> 0x0f9c }
            int[] r12 = new int[r6]     // Catch:{ Exception -> 0x0f9c }
            r13 = 0
        L_0x01c7:
            if (r13 >= r6) goto L_0x01f5
            java.io.DataInputStream r14 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r14 = r14.readInt()     // Catch:{ Exception -> 0x0f9c }
            r10[r13] = r7     // Catch:{ Exception -> 0x0f9c }
            g.e r15 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r15 = r15.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r14 == r15) goto L_0x01e2
            g.e r14 = p013g.C0126k.m881V(r14)     // Catch:{ Exception -> 0x0f9c }
            r10[r13] = r14     // Catch:{ Exception -> 0x0f9c }
            goto L_0x01e8
        L_0x01e2:
            g.e r14 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r10[r13] = r14     // Catch:{ Exception -> 0x0f9c }
        L_0x01e8:
            java.io.DataInputStream r14 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r14 = r14.readInt()     // Catch:{ Exception -> 0x0f9c }
            r12[r13] = r14     // Catch:{ Exception -> 0x0f9c }
            int r13 = r13 + 1
            goto L_0x01c7
        L_0x01f5:
            r5.mo358O(r10, r12, r1)     // Catch:{ Exception -> 0x0f9c }
        L_0x01f8:
            if (r1 == r11) goto L_0x0200
            if (r1 == r8) goto L_0x0200
            if (r1 == r3) goto L_0x0200
            if (r1 != r2) goto L_0x0f9c
        L_0x0200:
            g.a r5 = p013g.C0137v.m1051l()     // Catch:{ Exception -> 0x0f9c }
            if (r5 != 0) goto L_0x0207
            return
        L_0x0207:
            if (r1 != r2) goto L_0x0216
            r5.f2326t = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2325s = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f1167r0 = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f1166q0 = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2317l = r9     // Catch:{ Exception -> 0x0f9c }
            r5.f2315k = r9     // Catch:{ Exception -> 0x0f9c }
            return
        L_0x0216:
            if (r1 == r11) goto L_0x021a
            if (r1 != r8) goto L_0x0257
        L_0x021a:
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            g.e[] r6 = new p013g.C0114e[r2]     // Catch:{ Exception -> 0x0f9c }
            int[] r8 = new int[r2]     // Catch:{ Exception -> 0x0f9c }
        L_0x0226:
            if (r4 >= r2) goto L_0x0254
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readInt()     // Catch:{ Exception -> 0x0f9c }
            r6[r4] = r7     // Catch:{ Exception -> 0x0f9c }
            g.e r10 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r10 = r10.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r9 == r10) goto L_0x0241
            g.e r9 = p013g.C0126k.m881V(r9)     // Catch:{ Exception -> 0x0f9c }
            r6[r4] = r9     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0247
        L_0x0241:
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r6[r4] = r9     // Catch:{ Exception -> 0x0f9c }
        L_0x0247:
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readInt()     // Catch:{ Exception -> 0x0f9c }
            r8[r4] = r9     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            goto L_0x0226
        L_0x0254:
            r5.mo331P(r6, r8, r1)     // Catch:{ Exception -> 0x0f9c }
        L_0x0257:
            if (r1 != r3) goto L_0x0f9c
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            r5.mo330O(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0266:
            java.lang.String r1 = "big boss--------------------------------------------------"
            p013g.C0111c0.m584k(r1)     // Catch:{ Exception -> 0x0f9c }
            g.d r1 = p013g.C0137v.m1052m()     // Catch:{ Exception -> 0x0f9c }
            if (r1 != 0) goto L_0x0272
            return
        L_0x0272:
            java.io.DataInputStream r6 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r6 = r6.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r6 == 0) goto L_0x0284
            if (r6 == r5) goto L_0x0284
            if (r6 == r12) goto L_0x0284
            if (r6 == r8) goto L_0x0284
            if (r6 != r11) goto L_0x0307
        L_0x0284:
            if (r6 != r11) goto L_0x02a2
            java.io.DataInputStream r4 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2325s = r4     // Catch:{ Exception -> 0x0f9c }
            r1.f1330q0 = r4     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r4 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2326t = r4     // Catch:{ Exception -> 0x0f9c }
            r1.f1331r0 = r4     // Catch:{ Exception -> 0x0f9c }
            r1.mo362Q()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0307
        L_0x02a2:
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r8 = r8.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r11.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r14 = "CHUONG nChar= "
            r11.append(r14)     // Catch:{ Exception -> 0x0f9c }
            r11.append(r8)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r11)     // Catch:{ Exception -> 0x0f9c }
            g.e[] r11 = new p013g.C0114e[r8]     // Catch:{ Exception -> 0x0f9c }
            int[] r14 = new int[r8]     // Catch:{ Exception -> 0x0f9c }
        L_0x02c2:
            if (r4 >= r8) goto L_0x0304
            java.io.DataInputStream r15 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r15 = r15.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r9.<init>()     // Catch:{ Exception -> 0x0f9c }
            r9.append(r10)     // Catch:{ Exception -> 0x0f9c }
            r9.append(r15)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r9)     // Catch:{ Exception -> 0x0f9c }
            r11[r4] = r7     // Catch:{ Exception -> 0x0f9c }
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r15 == r9) goto L_0x02ef
            g.e r9 = p013g.C0126k.m881V(r15)     // Catch:{ Exception -> 0x0f9c }
            r11[r4] = r9     // Catch:{ Exception -> 0x0f9c }
            goto L_0x02f5
        L_0x02ef:
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r11[r4] = r9     // Catch:{ Exception -> 0x0f9c }
        L_0x02f5:
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readInt()     // Catch:{ Exception -> 0x0f9c }
            r14[r4] = r9     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x02c2
        L_0x0304:
            r1.mo361P(r11, r14, r6)     // Catch:{ Exception -> 0x0f9c }
        L_0x0307:
            if (r6 != r3) goto L_0x030d
            r1.f1332s0 = r5     // Catch:{ Exception -> 0x0f9c }
            r1.f2321o = r12     // Catch:{ Exception -> 0x0f9c }
        L_0x030d:
            if (r6 != r13) goto L_0x0326
            r1.mo360O()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2315k = r3     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2317l = r3     // Catch:{ Exception -> 0x0f9c }
        L_0x0326:
            if (r6 != r2) goto L_0x032b
            r1.mo361P(r7, r7, r6)     // Catch:{ Exception -> 0x0f9c }
        L_0x032b:
            r2 = 8
            if (r6 != r2) goto L_0x0349
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r2 = r2.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2325s = r2     // Catch:{ Exception -> 0x0f9c }
            r1.f1330q0 = r2     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f2326t = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f1331r0 = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f2321o = r12     // Catch:{ Exception -> 0x0f9c }
        L_0x0349:
            r0 = 9
            if (r6 != r0) goto L_0x0f9c
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r1.f2326t = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f2325s = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f1331r0 = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f1330q0 = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f2317l = r0     // Catch:{ Exception -> 0x0f9c }
            r1.f2315k = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x035d:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r1 != 0) goto L_0x0377
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[] r3 = r3.f1407C0     // Catch:{ Exception -> 0x0f9c }
            r7 = r3[r2]     // Catch:{ Exception -> 0x0f9c }
        L_0x0377:
            if (r1 != r5) goto L_0x0381
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[] r1 = r1.f1397A0     // Catch:{ Exception -> 0x0f9c }
            r7 = r1[r2]     // Catch:{ Exception -> 0x0f9c }
        L_0x0381:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r1 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            if (r1 == r6) goto L_0x0f9c
            e.s r1 = p011e.C0088t.m305b(r1)     // Catch:{ Exception -> 0x0f9c }
            r7.f923b = r1     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            r7.f929h = r1     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.readUTF()     // Catch:{ Exception -> 0x0f9c }
            r7.f946y = r1     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.readUTF()     // Catch:{ Exception -> 0x0f9c }
            r7.f947z = r1     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r1 == 0) goto L_0x0f9c
            e.q[] r1 = new p011e.C0082q[r1]     // Catch:{ Exception -> 0x0f9c }
            r7.f922a = r1     // Catch:{ Exception -> 0x0f9c }
        L_0x03bd:
            e.q[] r1 = r7.f922a     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.length     // Catch:{ Exception -> 0x0f9c }
            if (r4 >= r1) goto L_0x0f9c
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "id o= "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readUnsignedShort()     // Catch:{ Exception -> 0x0f9c }
            if (r1 == r6) goto L_0x03f1
            e.q[] r3 = r7.f922a     // Catch:{ Exception -> 0x0f9c }
            e.q r5 = new e.q     // Catch:{ Exception -> 0x0f9c }
            r5.<init>(r1, r2)     // Catch:{ Exception -> 0x0f9c }
            r3[r4] = r5     // Catch:{ Exception -> 0x0f9c }
        L_0x03f1:
            int r4 = r4 + 1
            goto L_0x03bd
        L_0x03f4:
            p013g.C0130o.m1005a()     // Catch:{ Exception -> 0x0f9c }
            int r1 = p018i.C0145a.f2614V     // Catch:{ Exception -> 0x0f9c }
            int r2 = p013g.C0140y.f2350E2     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2 * 2
            if (r1 <= r2) goto L_0x0401
            r1 = 1
            goto L_0x0402
        L_0x0401:
            r1 = 0
        L_0x0402:
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r7 = "t Indxe= "
            r3.append(r7)     // Catch:{ Exception -> 0x0f9c }
            r3.append(r2)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r3)     // Catch:{ Exception -> 0x0f9c }
            g.y r3 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            int[] r3 = r3.f2431O     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r7 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r7 = r7.readByte()     // Catch:{ Exception -> 0x0f9c }
            r3[r2] = r7     // Catch:{ Exception -> 0x0f9c }
            g.y r3 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            int[] r3 = r3.f2434P     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r7 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r7 = r7.readByte()     // Catch:{ Exception -> 0x0f9c }
            r3[r2] = r7     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r7 = "max page= "
            r3.append(r7)     // Catch:{ Exception -> 0x0f9c }
            g.y r7 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            int[] r7 = r7.f2431O     // Catch:{ Exception -> 0x0f9c }
            r7 = r7[r2]     // Catch:{ Exception -> 0x0f9c }
            r3.append(r7)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r7 = " curr page= "
            r3.append(r7)     // Catch:{ Exception -> 0x0f9c }
            g.y r7 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            int[] r7 = r7.f2434P     // Catch:{ Exception -> 0x0f9c }
            r7 = r7[r2]     // Catch:{ Exception -> 0x0f9c }
            r3.append(r7)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r3)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = p011e.C0057d1.f630e4     // Catch:{ Exception -> 0x0f9c }
            p013g.C0140y.f2359N2 = r3     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            g.e r7 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r7 = r7.f1417E0     // Catch:{ Exception -> 0x0f9c }
            e.n[] r8 = new p011e.C0076n[r3]     // Catch:{ Exception -> 0x0f9c }
            r7[r2] = r8     // Catch:{ Exception -> 0x0f9c }
            r7 = 0
        L_0x0479:
            if (r7 >= r3) goto L_0x05c3
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r8 = r8.readShort()     // Catch:{ Exception -> 0x0f9c }
            if (r8 == r6) goto L_0x05bf
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r9 = r9.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r2]     // Catch:{ Exception -> 0x0f9c }
            e.n r10 = new e.n     // Catch:{ Exception -> 0x0f9c }
            r10.<init>()     // Catch:{ Exception -> 0x0f9c }
            r9[r7] = r10     // Catch:{ Exception -> 0x0f9c }
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r9 = r9.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r2]     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r7]     // Catch:{ Exception -> 0x0f9c }
            e.s r8 = p011e.C0088t.m305b(r8)     // Catch:{ Exception -> 0x0f9c }
            r9.f923b = r8     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r9 = r9.readShort()     // Catch:{ Exception -> 0x0f9c }
            r8.f925d = r9     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readInt()     // Catch:{ Exception -> 0x0f9c }
            r8.f935n = r9     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readInt()     // Catch:{ Exception -> 0x0f9c }
            r8.f937p = r9     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r9 = r9.readByte()     // Catch:{ Exception -> 0x0f9c }
            r8.f942u = r9     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r9 = r9.readByte()     // Catch:{ Exception -> 0x0f9c }
            r8.f929h = r9     // Catch:{ Exception -> 0x0f9c }
            g.e r8 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r8 = r8.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0f9c }
            r8 = r8[r7]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r9 = r9.readByte()     // Catch:{ Exception -> 0x0f9c }
            r8.f916C = r9     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r8 = r8.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r8 == r6) goto L_0x0588
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r9 = r9.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r2]     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r7]     // Catch:{ Exception -> 0x0f9c }
            e.q[] r8 = new p011e.C0082q[r8]     // Catch:{ Exception -> 0x0f9c }
            r9.f922a = r8     // Catch:{ Exception -> 0x0f9c }
            r8 = 0
        L_0x0535:
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r9 = r9.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r2]     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r7]     // Catch:{ Exception -> 0x0f9c }
            e.q[] r9 = r9.f922a     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.length     // Catch:{ Exception -> 0x0f9c }
            if (r8 >= r9) goto L_0x0588
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r9 = r9.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r10 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r10 = r10.readUnsignedShort()     // Catch:{ Exception -> 0x0f9c }
            if (r9 == r6) goto L_0x0585
            g.e r11 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r11 = r11.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r11 = r11[r2]     // Catch:{ Exception -> 0x0f9c }
            r11 = r11[r7]     // Catch:{ Exception -> 0x0f9c }
            e.q[] r11 = r11.f922a     // Catch:{ Exception -> 0x0f9c }
            e.q r12 = new e.q     // Catch:{ Exception -> 0x0f9c }
            r12.<init>(r9, r10)     // Catch:{ Exception -> 0x0f9c }
            r11[r8] = r12     // Catch:{ Exception -> 0x0f9c }
            g.e r9 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r9 = r9.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r2]     // Catch:{ Exception -> 0x0f9c }
            r9 = r9[r7]     // Catch:{ Exception -> 0x0f9c }
            g.y r10 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            g.e r11 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r11 = r11.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r11 = r11[r2]     // Catch:{ Exception -> 0x0f9c }
            r11 = r11[r7]     // Catch:{ Exception -> 0x0f9c }
            int r10 = r10.mo627Y(r11)     // Catch:{ Exception -> 0x0f9c }
            r9.f915B = r10     // Catch:{ Exception -> 0x0f9c }
        L_0x0585:
            int r8 = r8 + 1
            goto L_0x0535
        L_0x0588:
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r8 = r8.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r8 != r5) goto L_0x05bf
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r8 = r8.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r9 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r9 = r9.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r10 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r10 = r10.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r11 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r11 = r11.readShort()     // Catch:{ Exception -> 0x0f9c }
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            e.n[][] r12 = r12.f1417E0     // Catch:{ Exception -> 0x0f9c }
            r12 = r12[r2]     // Catch:{ Exception -> 0x0f9c }
            r12 = r12[r7]     // Catch:{ Exception -> 0x0f9c }
            r12.mo172e(r8, r9, r10, r11)     // Catch:{ Exception -> 0x0f9c }
        L_0x05bf:
            int r7 = r7 + 1
            goto L_0x0479
        L_0x05c3:
            if (r1 == 0) goto L_0x05ca
            g.y r0 = p018i.C0145a.f2631f0     // Catch:{ Exception -> 0x0f9c }
            r0.mo616H1()     // Catch:{ Exception -> 0x0f9c }
        L_0x05ca:
            g.y r0 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            r0.mo622Q1()     // Catch:{ Exception -> 0x0f9c }
            g.y r0 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            r0.f2488h = r4     // Catch:{ Exception -> 0x0f9c }
            r0.f2491i = r4     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x05d7:
            k.f r1 = p018i.C0145a.f2633g0     // Catch:{ Exception -> 0x0f9c }
            r1.f2821E = r5     // Catch:{ Exception -> 0x0f9c }
            p018i.C0145a.m1360o()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r1.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "userAo"
            r1.append(r3)     // Catch:{ Exception -> 0x0f9c }
            int r3 = p013g.C0113d0.f1343D     // Catch:{ Exception -> 0x0f9c }
            r1.append(r3)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0f9c }
            p019j.C0149b.m1404i(r1, r0)     // Catch:{ Exception -> 0x0f9c }
            f.d r1 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r1.mo246S0()     // Catch:{ Exception -> 0x0f9c }
            f.d r1 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r1.mo274e0(r0, r9, r2, r5)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x060c:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r0 != 0) goto L_0x0618
            goto L_0x0f9c
        L_0x0618:
            if (r0 != r5) goto L_0x0f9c
            k.f r0 = p018i.C0145a.f2633g0     // Catch:{ Exception -> 0x0f9c }
            r0.f2821E = r4     // Catch:{ Exception -> 0x0f9c }
            f.d r0 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = "acc"
            java.lang.String r1 = p019j.C0149b.m1400e(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "pass"
            java.lang.String r3 = p019j.C0149b.m1400e(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.mo274e0(r1, r3, r2, r4)     // Catch:{ Exception -> 0x0f9c }
            p020k.C0170f.f2816U = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0635:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "server gui ve actionFlag = "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            if (r1 != 0) goto L_0x06c2
            g.y r1 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            k.i r1 = r1.f2492i0     // Catch:{ Exception -> 0x0f9c }
            r1.removeAllElements()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            r2 = 0
        L_0x0663:
            if (r2 >= r1) goto L_0x06b6
            e.n r3 = new e.n     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r5 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r5 = r5.readShort()     // Catch:{ Exception -> 0x0f9c }
            if (r5 == r6) goto L_0x06ac
            e.s r5 = p011e.C0088t.m305b(r5)     // Catch:{ Exception -> 0x0f9c }
            r3.f923b = r5     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r5 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r5 = r5.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r5 == r6) goto L_0x06ac
            e.q[] r5 = new p011e.C0082q[r5]     // Catch:{ Exception -> 0x0f9c }
            r3.f922a = r5     // Catch:{ Exception -> 0x0f9c }
            r5 = 0
        L_0x0689:
            e.q[] r7 = r3.f922a     // Catch:{ Exception -> 0x0f9c }
            int r7 = r7.length     // Catch:{ Exception -> 0x0f9c }
            if (r5 >= r7) goto L_0x06ac
            java.io.DataInputStream r7 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r7 = r7.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r8 = r8.readUnsignedShort()     // Catch:{ Exception -> 0x0f9c }
            if (r7 == r6) goto L_0x06a9
            e.q[] r9 = r3.f922a     // Catch:{ Exception -> 0x0f9c }
            e.q r10 = new e.q     // Catch:{ Exception -> 0x0f9c }
            r10.<init>(r7, r8)     // Catch:{ Exception -> 0x0f9c }
            r9[r5] = r10     // Catch:{ Exception -> 0x0f9c }
        L_0x06a9:
            int r5 = r5 + 1
            goto L_0x0689
        L_0x06ac:
            g.y r5 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            k.i r5 = r5.f2492i0     // Catch:{ Exception -> 0x0f9c }
            r5.addElement(r3)     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2 + 1
            goto L_0x0663
        L_0x06b6:
            g.y r0 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            r0.mo645f2()     // Catch:{ Exception -> 0x0f9c }
            g.y r0 = p018i.C0145a.f2629e0     // Catch:{ Exception -> 0x0f9c }
            r0.mo689x2()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x06c2:
            if (r1 != r5) goto L_0x0713
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "---------------actionFlag1:  "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = " : "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r0)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r2) goto L_0x06ff
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x06fc:
            r2.f1443J1 = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x070a
        L_0x06ff:
            g.e r2 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x070a
            g.e r2 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x06fc
        L_0x070a:
            g.k r2 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r2.mo517d0(r1, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0713:
            if (r1 != r12) goto L_0x0f9c
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            e.d0 r2 = new e.d0     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            r2.f417a = r1     // Catch:{ Exception -> 0x0f9c }
            r2.f418b = r0     // Catch:{ Exception -> 0x0f9c }
            k.i r3 = p013g.C0126k.f1928X1     // Catch:{ Exception -> 0x0f9c }
            r3.addElement(r2)     // Catch:{ Exception -> 0x0f9c }
            r2 = 0
        L_0x0734:
            k.i r3 = p013g.C0126k.f1928X1     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0f9c }
            if (r2 >= r3) goto L_0x076f
            k.i r3 = p013g.C0126k.f1928X1     // Catch:{ Exception -> 0x0f9c }
            java.lang.Object r3 = r3.elementAt(r2)     // Catch:{ Exception -> 0x0f9c }
            e.d0 r3 = (p011e.C0056d0) r3     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r5.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "i: "
            r5.append(r6)     // Catch:{ Exception -> 0x0f9c }
            r5.append(r2)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "  cflag: "
            r5.append(r6)     // Catch:{ Exception -> 0x0f9c }
            byte r6 = r3.f417a     // Catch:{ Exception -> 0x0f9c }
            r5.append(r6)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = "   IDimageFlag: "
            r5.append(r6)     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.f418b     // Catch:{ Exception -> 0x0f9c }
            r5.append(r3)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r3)     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2 + 1
            goto L_0x0734
        L_0x076f:
            k.i r2 = p013g.C0126k.f1908S1     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0f9c }
            if (r4 >= r2) goto L_0x078a
            k.i r2 = p013g.C0126k.f1908S1     // Catch:{ Exception -> 0x0f9c }
            java.lang.Object r2 = r2.elementAt(r4)     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = (p013g.C0114e) r2     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0787
            byte r3 = r2.f1443J1     // Catch:{ Exception -> 0x0f9c }
            if (r3 != r1) goto L_0x0787
            r2.f1448K1 = r0     // Catch:{ Exception -> 0x0f9c }
        L_0x0787:
            int r4 = r4 + 1
            goto L_0x076f
        L_0x078a:
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.f1443J1     // Catch:{ Exception -> 0x0f9c }
            if (r2 != r1) goto L_0x0f9c
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r1.f1448K1 = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x079a:
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r4 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.mo410V0(r2, r3, r4, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x07c3:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r0 != r5) goto L_0x07ce
            r4 = 1
        L_0x07ce:
            p013g.C0126k.f1954d4 = r4     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x07d2:
            g.k r1 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r1.f2111b1 = r4     // Catch:{ Exception -> 0x0f9c }
            g.k r1 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            r1.f2107Z0 = r0     // Catch:{ Exception -> 0x0f9c }
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.f2107Z0     // Catch:{ Exception -> 0x0f9c }
            r1 = 100
            if (r0 != r1) goto L_0x07f6
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r0.f2109a1 = r5     // Catch:{ Exception -> 0x0f9c }
        L_0x07f6:
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.f2107Z0     // Catch:{ Exception -> 0x0f9c }
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L_0x0f9c
            p011e.C0050b0.f360K4 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0804:
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r0 = r0.readInt()     // Catch:{ Exception -> 0x0f9c }
            r1.f1573j = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0814:
            long r0 = p019j.C0161h.m1490h()     // Catch:{ Exception -> 0x0f9c }
            long r2 = p012f.C0105d.f1149c     // Catch:{ Exception -> 0x0f9c }
            long r0 = r0 - r2
            p012f.C0105d.f1151e = r0     // Catch:{ Exception -> 0x0f9c }
            f.d r0 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r0.mo231K0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0826:
            long r0 = p019j.C0161h.m1490h()     // Catch:{ Exception -> 0x0f9c }
            long r2 = p012f.C0105d.f1150d     // Catch:{ Exception -> 0x0f9c }
            long r0 = r0 - r2
            p012f.C0105d.f1152f = r0     // Catch:{ Exception -> 0x0f9c }
            f.d r0 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r0.mo233L0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0838:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r1 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            e.b0 r1 = p013g.C0126k.m891b0(r1)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            int[] r3 = new int[r2]     // Catch:{ Exception -> 0x0f9c }
            r1.f366E4 = r3     // Catch:{ Exception -> 0x0f9c }
        L_0x0850:
            if (r4 >= r2) goto L_0x0861
            int[] r3 = r1.f366E4     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r5 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r5 = r5.readShort()     // Catch:{ Exception -> 0x0f9c }
            r3[r4] = r5     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            goto L_0x0850
        L_0x0861:
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r0 = r0.readInt()     // Catch:{ Exception -> 0x0f9c }
            r1.mo133C1(r2, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0876:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0f9c
            g.e r1 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            r1.f1510W3 = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0894:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r3 = r3.readByte()     // Catch:{ Exception -> 0x0f9c }
            r6 = 41
            r7 = 40
            r8 = 32
            java.lang.String r9 = " skillID= "
            if (r3 != 0) goto L_0x0a82
            if (r1 != r12) goto L_0x08d3
            java.io.DataInputStream r10 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r10 = r10.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r11 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r11 = r11.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r10 != r11) goto L_0x08c8
            g.e r10 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x08c4:
            r10.mo456v0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x08d3
        L_0x08c8:
            g.e r11 = p013g.C0126k.m881V(r10)     // Catch:{ Exception -> 0x0f9c }
            if (r11 == 0) goto L_0x08d3
            g.e r10 = p013g.C0126k.m881V(r10)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x08c4
        L_0x08d3:
            java.io.DataInputStream r10 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r10 = r10.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r11 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r11 = r11.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r12.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r13 = "playerID= "
            r12.append(r13)     // Catch:{ Exception -> 0x0f9c }
            r12.append(r11)     // Catch:{ Exception -> 0x0f9c }
            r12.append(r9)     // Catch:{ Exception -> 0x0f9c }
            r12.append(r10)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r12)     // Catch:{ Exception -> 0x0f9c }
            if (r10 != r8) goto L_0x0974
            if (r1 != r5) goto L_0x0959
            java.io.DataInputStream r12 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r13 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r13 = r13.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r13) goto L_0x0923
            g.e r13 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r13.f1435H3 = r10     // Catch:{ Exception -> 0x0f9c }
            g.e r12 = p013g.C0126k.m881V(r12)     // Catch:{ Exception -> 0x0f9c }
            g.e r13 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x091f:
            r12.mo393M0(r13)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0974
        L_0x0923:
            g.e r13 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r13 == 0) goto L_0x0940
            g.e r13 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r13 = r13.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r12 == r13) goto L_0x0940
            g.e r13 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            r13.f1435H3 = r10     // Catch:{ Exception -> 0x0f9c }
            g.e r12 = p013g.C0126k.m881V(r12)     // Catch:{ Exception -> 0x0f9c }
        L_0x093b:
            g.e r13 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x091f
        L_0x0940:
            g.e r13 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r13 == 0) goto L_0x0974
            g.e r13 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r13 = r13.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r12 != r13) goto L_0x0974
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            r12.f1435H3 = r10     // Catch:{ Exception -> 0x0f9c }
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x093b
        L_0x0959:
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x0969
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0965:
            r12.mo459w0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0974
        L_0x0969:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x0974
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0965
        L_0x0974:
            r12 = 33
            if (r10 != r12) goto L_0x09af
            if (r1 != r5) goto L_0x0994
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x0989
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0986:
            r12.f1445J3 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09af
        L_0x0989:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x09af
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0986
        L_0x0994:
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x09a4
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x09a0:
            r12.mo465y0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09af
        L_0x09a4:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x09af
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09a0
        L_0x09af:
            r12 = 39
            if (r10 != r12) goto L_0x09ea
            if (r1 != r5) goto L_0x09cf
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x09c4
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x09c1:
            r12.f1485R3 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09ea
        L_0x09c4:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x09ea
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09c1
        L_0x09cf:
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x09df
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x09db:
            r12.mo462x0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09ea
        L_0x09df:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x09ea
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09db
        L_0x09ea:
            if (r10 != r7) goto L_0x0a23
            if (r1 != r5) goto L_0x0a08
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x09fd
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x09fa:
            r12.f1490S3 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a23
        L_0x09fd:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x0a23
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x09fa
        L_0x0a08:
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x0a18
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0a14:
            r12.mo454u0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a23
        L_0x0a18:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x0a23
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a14
        L_0x0a23:
            if (r10 != r6) goto L_0x0a5c
            if (r1 != r5) goto L_0x0a41
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x0a36
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0a33:
            r12.f1500U3 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a5c
        L_0x0a36:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x0a5c
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a33
        L_0x0a41:
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r12 = r12.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r12) goto L_0x0a51
            g.e r12 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0a4d:
            r12.mo468z0()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a5c
        L_0x0a51:
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            if (r12 == 0) goto L_0x0a5c
            g.e r12 = p013g.C0126k.m881V(r11)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a4d
        L_0x0a5c:
            if (r10 != r2) goto L_0x0a82
            if (r1 != r5) goto L_0x0a6f
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r2) goto L_0x0a82
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r2.f1505V3 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0a82
        L_0x0a6f:
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r11 != r2) goto L_0x0a82
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r2.f1505V3 = r4     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = "tra ve huy chieu 2"
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
        L_0x0a82:
            if (r3 != r5) goto L_0x0f9c
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r3 = r3.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r4.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r10 = "modbHoldID= "
            r4.append(r10)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r9)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r2)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r9 = "eff ID= "
            r4.append(r9)     // Catch:{ Exception -> 0x0f9c }
            r4.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r4)     // Catch:{ Exception -> 0x0f9c }
            if (r2 != r8) goto L_0x0af4
            if (r1 != r5) goto L_0x0aed
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r0 = r0.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r4 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r0 != r4) goto L_0x0adc
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.f2309h = r2     // Catch:{ Exception -> 0x0f9c }
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0ad4:
            g.v r4 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.mo395N0(r4)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0af4
        L_0x0adc:
            g.e r4 = p013g.C0126k.m881V(r0)     // Catch:{ Exception -> 0x0f9c }
            if (r4 == 0) goto L_0x0af4
            g.v r4 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r4.f2309h = r2     // Catch:{ Exception -> 0x0f9c }
            g.e r0 = p013g.C0126k.m881V(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0ad4
        L_0x0aed:
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.mo319A()     // Catch:{ Exception -> 0x0f9c }
        L_0x0af4:
            if (r2 != r7) goto L_0x0b06
            if (r1 != r5) goto L_0x0aff
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.f2316k0 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0b06
        L_0x0aff:
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.mo340z()     // Catch:{ Exception -> 0x0f9c }
        L_0x0b06:
            if (r2 != r6) goto L_0x0f9c
            if (r1 != r5) goto L_0x0b12
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.f2318l0 = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0b12:
            g.v r0 = p013g.C0126k.m887Z(r3)     // Catch:{ Exception -> 0x0f9c }
            r0.mo320B()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0b1b:
            k.c r1 = p020k.C0167c.m1522b()     // Catch:{ Exception -> 0x0f9c }
            r1.f2790b = r4     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r1 = r1.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "titile= "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            g.f r3 = p013g.C0116f.m778k()     // Catch:{ Exception -> 0x0f9c }
            r3.mo471m(r2, r1)     // Catch:{ Exception -> 0x0f9c }
            r1 = 0
        L_0x0b4d:
            if (r1 >= r2) goto L_0x0f9c
            g.f r3 = p013g.C0116f.m778k()     // Catch:{ Exception -> 0x0f9c }
            k.l[] r3 = r3.f1665i     // Catch:{ Exception -> 0x0f9c }
            r3 = r3[r1]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r6 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r6 = r6.readUTF()     // Catch:{ Exception -> 0x0f9c }
            r3.f2905g = r6     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r3 = r3.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r3 != 0) goto L_0x0b76
            g.f r6 = p013g.C0116f.m778k()     // Catch:{ Exception -> 0x0f9c }
            k.l[] r6 = r6.f1665i     // Catch:{ Exception -> 0x0f9c }
            r6 = r6[r1]     // Catch:{ Exception -> 0x0f9c }
            r6.mo903n(r5)     // Catch:{ Exception -> 0x0f9c }
        L_0x0b76:
            if (r3 != r5) goto L_0x0b83
            g.f r6 = p013g.C0116f.m778k()     // Catch:{ Exception -> 0x0f9c }
            k.l[] r6 = r6.f1665i     // Catch:{ Exception -> 0x0f9c }
            r6 = r6[r1]     // Catch:{ Exception -> 0x0f9c }
            r6.mo903n(r4)     // Catch:{ Exception -> 0x0f9c }
        L_0x0b83:
            if (r3 != r12) goto L_0x0b90
            g.f r3 = p013g.C0116f.m778k()     // Catch:{ Exception -> 0x0f9c }
            k.l[] r3 = r3.f1665i     // Catch:{ Exception -> 0x0f9c }
            r3 = r3[r1]     // Catch:{ Exception -> 0x0f9c }
            r3.mo903n(r12)     // Catch:{ Exception -> 0x0f9c }
        L_0x0b90:
            int r1 = r1 + 1
            goto L_0x0b4d
        L_0x0b93:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = "type quay= "
            r2.append(r3)     // Catch:{ Exception -> 0x0f9c }
            r2.append(r1)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r5) goto L_0x0bcf
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = r3.readUTF()     // Catch:{ Exception -> 0x0f9c }
            g.k r4 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r4.mo549t1(r2, r3)     // Catch:{ Exception -> 0x0f9c }
        L_0x0bcf:
            if (r1 != 0) goto L_0x0f9c
            g.k r1 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x0f9c }
            r1.mo552u1(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0be2:
            m333b(r17)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0be7:
            com.blue.dragonball.MainActivity.m193e(r17)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0bec:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r7 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r6 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r1.readUnsignedByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r4 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r5 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r8 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            b.e r0 = new b.e     // Catch:{ Exception -> 0x0f9c }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0f9c }
            p001b.C0007c.m43a(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0c27:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r5) goto L_0x0c7d
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r2 != r3) goto L_0x0c65
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r2.mo397O0(r5)     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            r2.f1593n = r3     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
        L_0x0c5e:
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            r2.f1598o = r3     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0c7d
        L_0x0c65:
            g.e r2 = p013g.C0126k.m881V(r2)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0c7d
            r2.mo397O0(r5)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0f9c }
            r2.f1593n = r3     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0c5e
        L_0x0c7d:
            if (r1 != 0) goto L_0x0c9e
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r2 != r3) goto L_0x0c97
            g.e r2 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0c93:
            r2.mo397O0(r4)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0c9e
        L_0x0c97:
            g.e r2 = p013g.C0126k.m881V(r2)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0c9e
            goto L_0x0c93
        L_0x0c9e:
            if (r1 != r12) goto L_0x0cb9
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r2 = p013g.C0126k.m881V(r2)     // Catch:{ Exception -> 0x0f9c }
            g.t r2 = (p013g.C0135t) r2     // Catch:{ Exception -> 0x0f9c }
            r2.mo580A1(r3)     // Catch:{ Exception -> 0x0f9c }
        L_0x0cb9:
            if (r1 != r11) goto L_0x0f9c
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0126k.f2014p5 = r0     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0cc7:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            g.e r1 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            r11 = r1
            g.t r11 = (p013g.C0135t) r11     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r12 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r13 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r14 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            g.e[] r15 = new p013g.C0114e[r1]     // Catch:{ Exception -> 0x0f9c }
            int[] r2 = new int[r1]     // Catch:{ Exception -> 0x0f9c }
        L_0x0cfa:
            if (r4 >= r1) goto L_0x0d3a
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r5.<init>()     // Catch:{ Exception -> 0x0f9c }
            r5.append(r10)     // Catch:{ Exception -> 0x0f9c }
            r5.append(r3)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r5)     // Catch:{ Exception -> 0x0f9c }
            r15[r4] = r7     // Catch:{ Exception -> 0x0f9c }
            g.e r5 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r5 = r5.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r3 == r5) goto L_0x0d27
            g.e r3 = p013g.C0126k.m881V(r3)     // Catch:{ Exception -> 0x0f9c }
            r15[r4] = r3     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0d2d
        L_0x0d27:
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            r15[r4] = r3     // Catch:{ Exception -> 0x0f9c }
        L_0x0d2d:
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.readInt()     // Catch:{ Exception -> 0x0f9c }
            r2[r4] = r3     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            goto L_0x0cfa
        L_0x0d3a:
            r16 = r2
            r11.mo583D1(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0d41:
            g.j0 r1 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            r1.f1829q = r4     // Catch:{ Exception -> 0x0f9c }
            g.j0 r1 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r2 = r2.readShort()     // Catch:{ Exception -> 0x0f9c }
            r1.f1830r = r2     // Catch:{ Exception -> 0x0f9c }
            g.j0 r1 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            g.j0 r2 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0f9c }
            r2.f1832t = r3     // Catch:{ Exception -> 0x0f9c }
            r1.f1831s = r3     // Catch:{ Exception -> 0x0f9c }
            g.j0 r1 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            r1.f1821i = r0     // Catch:{ Exception -> 0x0f9c }
            g.j0 r0 = p013g.C0125j0.m848j()     // Catch:{ Exception -> 0x0f9c }
            r0.mo342f()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0d7c:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r1 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0f9c }
            boolean r2 = p011e.C0090u.m313e(r1)     // Catch:{ Exception -> 0x0f9c }
            if (r2 == 0) goto L_0x0d9b
            e.u r1 = p011e.C0090u.m311a(r1)     // Catch:{ Exception -> 0x0f9c }
            r1.mo193c(r0, r4)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0d9b:
            e.u r2 = new e.u     // Catch:{ Exception -> 0x0f9c }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0f9c }
            java.util.Vector r0 = p013g.C0114e.f1377h4     // Catch:{ Exception -> 0x0f9c }
            r0.addElement(r2)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0da7:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r1 = r1.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r5) goto L_0x0ddd
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r2 = r2.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            r3.append(r2)     // Catch:{ Exception -> 0x0f9c }
            r3.append(r9)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0f9c }
            byte[] r3 = p019j.C0149b.m1398c(r3)     // Catch:{ Exception -> 0x0f9c }
            if (r3 != 0) goto L_0x0dd6
            f.d r2 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r2.mo238O0(r5, r6, r7)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0ddd
        L_0x0dd6:
            f.d r6 = p012f.C0105d.m365M()     // Catch:{ Exception -> 0x0f9c }
            r6.mo238O0(r5, r2, r3)     // Catch:{ Exception -> 0x0f9c }
        L_0x0ddd:
            if (r1 != 0) goto L_0x0f9c
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r2 = r2.readShort()     // Catch:{ Exception -> 0x0f9c }
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            r0.read(r3, r4, r2)     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r0.<init>()     // Catch:{ Exception -> 0x0f9c }
            r0.append(r1)     // Catch:{ Exception -> 0x0f9c }
            r0.append(r9)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0f9c }
            p019j.C0149b.m1402g(r0, r3)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0e0c:
            java.lang.String r1 = "LAY HINH"
            p013g.C0111c0.m584k(r1)     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r1 = r1.readShort()     // Catch:{ Exception -> 0x0f9c }
            k.i r2 = new k.i     // Catch:{ Exception -> 0x0f9c }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0f9c }
            p013g.C0129n.f2157c = r2     // Catch:{ Exception -> 0x0f9c }
        L_0x0e20:
            if (r4 >= r1) goto L_0x0e3f
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r3 = r3.readByte()     // Catch:{ Exception -> 0x0f9c }
            k.i r5 = p013g.C0129n.f2157c     // Catch:{ Exception -> 0x0f9c }
            g.n r6 = new g.n     // Catch:{ Exception -> 0x0f9c }
            r6.<init>(r2, r3)     // Catch:{ Exception -> 0x0f9c }
            r5.addElement(r6)     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            goto L_0x0e20
        L_0x0e3f:
            p013g.C0129n.m1000a()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0129n.m1004e()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0e47:
            m332a(r17)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0e4c:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = r0.readUTF()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r0 = p013g.C0111c0.m577d(r0)     // Catch:{ Exception -> 0x0f9c }
            g.k r1 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r1.mo546s(r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0e61:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0113d0.f1343D = r0     // Catch:{ Exception -> 0x0f9c }
            i.a r0 = p018i.C0145a.f2572A     // Catch:{ Exception -> 0x0f9c }
            g.d0 r1 = p018i.C0145a.f2638i1     // Catch:{ Exception -> 0x0f9c }
            r0.mo734s(r1)     // Catch:{ Exception -> 0x0f9c }
            j.c r0 = p019j.C0150c.m1414n()     // Catch:{ Exception -> 0x0f9c }
            r0.mo744k()     // Catch:{ Exception -> 0x0f9c }
            p018i.C0145a.m1366v()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0113d0.f1340A = r5     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0e80:
            p018i.C0145a.m1366v()     // Catch:{ Exception -> 0x0f9c }
            p020k.C0170f.f2805J = r4     // Catch:{ Exception -> 0x0f9c }
            p013g.C0114e.f1394y4 = r4     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            g.b0 r1 = p018i.C0145a.f2635h0     // Catch:{ Exception -> 0x0f9c }
            if (r1 != 0) goto L_0x0e9a
            g.b0 r1 = new g.b0     // Catch:{ Exception -> 0x0f9c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0f9c }
            p018i.C0145a.f2635h0 = r1     // Catch:{ Exception -> 0x0f9c }
        L_0x0e9a:
            g.b0 r0 = p018i.C0145a.f2635h0     // Catch:{ Exception -> 0x0f9c }
            r0.mo342f()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0ea1:
            java.io.DataInputStream r1 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            int r1 = r1.readInt()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r2 != r5) goto L_0x0f30
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            short r2 = r2.readShort()     // Catch:{ Exception -> 0x0f9c }
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0ef2 }
            byte r6 = r3.readByte()     // Catch:{ Exception -> 0x0ef2 }
            if (r6 <= 0) goto L_0x0ef4
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0ef2 }
            byte r3 = r3.readByte()     // Catch:{ Exception -> 0x0ef2 }
            int[] r7 = new int[r3]     // Catch:{ Exception -> 0x0ef2 }
            r5 = 0
        L_0x0ed0:
            if (r5 >= r3) goto L_0x0edf
            java.io.DataInputStream r8 = r17.mo128d()     // Catch:{ Exception -> 0x0ef2 }
            byte r8 = r8.readByte()     // Catch:{ Exception -> 0x0ef2 }
            r7[r5] = r8     // Catch:{ Exception -> 0x0ef2 }
            int r5 = r5 + 1
            goto L_0x0ed0
        L_0x0edf:
            java.io.DataInputStream r3 = r17.mo128d()     // Catch:{ Exception -> 0x0ef2 }
            short r3 = r3.readShort()     // Catch:{ Exception -> 0x0ef2 }
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0ef3 }
            short r4 = r0.readShort()     // Catch:{ Exception -> 0x0ef3 }
            r0 = r4
            r4 = r3
            goto L_0x0ef5
        L_0x0ef2:
            r3 = 0
        L_0x0ef3:
            r4 = r3
        L_0x0ef4:
            r0 = 0
        L_0x0ef5:
            g.e r3 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r3 = r3.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r3) goto L_0x0f1d
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            g.z r3 = new g.z     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            r1.f1568i = r3     // Catch:{ Exception -> 0x0f9c }
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            g.z r1 = r1.f1568i     // Catch:{ Exception -> 0x0f9c }
            r1.f2545a = r2     // Catch:{ Exception -> 0x0f9c }
            if (r6 <= 0) goto L_0x0f9c
            g.e r1 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            g.z r1 = r1.f1568i     // Catch:{ Exception -> 0x0f9c }
            r1.mo691a(r6, r7, r4, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0f1d:
            g.e r1 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            g.z r3 = new g.z     // Catch:{ Exception -> 0x0f9c }
            r3.<init>()     // Catch:{ Exception -> 0x0f9c }
            r1.f1568i = r3     // Catch:{ Exception -> 0x0f9c }
            r3.f2545a = r2     // Catch:{ Exception -> 0x0f9c }
            if (r6 <= 0) goto L_0x0f9c
            r3.mo691a(r6, r7, r4, r0)     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0f30:
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            int r0 = r0.f1638w     // Catch:{ Exception -> 0x0f9c }
            if (r1 != r0) goto L_0x0f48
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
            g.z r0 = r0.f1568i     // Catch:{ Exception -> 0x0f9c }
            r0.mo694d()     // Catch:{ Exception -> 0x0f9c }
            g.e r0 = p013g.C0114e.m647e0()     // Catch:{ Exception -> 0x0f9c }
        L_0x0f45:
            r0.f1568i = r7     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0f48:
            g.e r0 = p013g.C0126k.m881V(r1)     // Catch:{ Exception -> 0x0f9c }
            g.z r1 = r0.f1568i     // Catch:{ Exception -> 0x0f9c }
            r1.mo694d()     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f45
        L_0x0f52:
            java.io.DataInputStream r0 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r0 = r0.readByte()     // Catch:{ Exception -> 0x0f9c }
            if (r0 != r5) goto L_0x0f5d
            r4 = 1
        L_0x0f5d:
            p018i.C0145a.f2640j1 = r4     // Catch:{ Exception -> 0x0f9c }
            goto L_0x0f9c
        L_0x0f60:
            byte[] r1 = new byte[r3]     // Catch:{ Exception -> 0x0f9c }
        L_0x0f62:
            if (r4 >= r3) goto L_0x0f87
            java.io.DataInputStream r2 = r17.mo128d()     // Catch:{ Exception -> 0x0f9c }
            byte r2 = r2.readByte()     // Catch:{ Exception -> 0x0f9c }
            r1[r4] = r2     // Catch:{ Exception -> 0x0f9c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f9c }
            r2.<init>()     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r5 = "vlue i= "
            r2.append(r5)     // Catch:{ Exception -> 0x0f9c }
            byte r5 = r1[r4]     // Catch:{ Exception -> 0x0f9c }
            r2.append(r5)     // Catch:{ Exception -> 0x0f9c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0f9c }
            p013g.C0111c0.m584k(r2)     // Catch:{ Exception -> 0x0f9c }
            int r4 = r4 + 1
            goto L_0x0f62
        L_0x0f87:
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r0.mo494J0(r1)     // Catch:{ Exception -> 0x0f9c }
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r0.mo495K0(r1)     // Catch:{ Exception -> 0x0f9c }
            g.k r0 = p013g.C0126k.m893c0()     // Catch:{ Exception -> 0x0f9c }
            r0.mo491I0(r1)     // Catch:{ Exception -> 0x0f9c }
        L_0x0f9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012f.C0102a.m334c(d.c):void");
    }
}
