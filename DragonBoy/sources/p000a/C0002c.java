package p000a;

import p011e.C0072l;
import p020k.C0173i;

/* renamed from: a.c */
public class C0002c implements C0072l {

    /* renamed from: m */
    public static C0173i f18m = new C0173i("v Message");

    /* renamed from: a */
    public int f19a;

    /* renamed from: b */
    public int f20b;

    /* renamed from: c */
    public int f21c;

    /* renamed from: d */
    public String f22d;

    /* renamed from: e */
    public long f23e;

    /* renamed from: f */
    public String[] f24f;

    /* renamed from: g */
    public byte f25g;

    /* renamed from: h */
    public byte f26h;

    /* renamed from: i */
    private int f27i;

    /* renamed from: j */
    public int f28j;

    /* renamed from: k */
    public int f29k;

    /* renamed from: l */
    public String[] f30l;

    /* renamed from: a */
    public static void m3a(C0002c cVar, int i, boolean z) {
        int i2 = 0;
        while (i2 < f18m.size()) {
            C0002c cVar2 = (C0002c) f18m.elementAt(i2);
            if (cVar2.f19a == cVar.f19a) {
                f18m.removeElement(cVar2);
                C0173i iVar = f18m;
                if (!z) {
                    iVar.insertElementAt(cVar, i2);
                    return;
                } else {
                    iVar.insertElementAt(cVar, 0);
                    return;
                }
            } else {
                int i3 = cVar2.f29k;
                if (i3 != 0 && cVar2.f28j == i3) {
                    f18m.removeElement(cVar2);
                }
                i2++;
            }
        }
        if (i == -1) {
            f18m.addElement(cVar);
        } else {
            f18m.insertElementAt(cVar, 0);
        }
        if (f18m.size() > 20) {
            C0173i iVar2 = f18m;
            iVar2.removeElementAt(iVar2.size() - 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r0.f24f.length > 1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r0.f24f.length > 1) goto L_0x005e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1b(p019j.C0159f r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            k.m r1 = p020k.C0177m.f2951s
            byte r2 = r0.f26h
            r3 = 2
            r4 = 1
            if (r2 != 0) goto L_0x000d
            k.m r1 = p020k.C0177m.f2946n
            goto L_0x0016
        L_0x000d:
            if (r2 != r4) goto L_0x0012
            k.m r1 = p020k.C0177m.f2953u
            goto L_0x0016
        L_0x0012:
            if (r2 != r3) goto L_0x0016
            k.m r1 = p020k.C0177m.f2952t
        L_0x0016:
            int r2 = r0.f20b
            java.lang.String r11 = " "
            if (r2 != 0) goto L_0x0099
            java.lang.String r7 = r0.f22d
            int r15 = r24 + 3
            int r20 = r25 + 1
            r10 = 0
            r5 = r1
            r6 = r23
            r8 = r15
            r9 = r20
            r5.mo909a(r6, r7, r8, r9, r10)
            byte r2 = r0.f25g
            java.lang.String r5 = "..."
            java.lang.String r6 = ""
            r7 = 0
            if (r2 != 0) goto L_0x0049
            k.m r12 = p020k.C0177m.f2925B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String[] r8 = r0.f24f
            r7 = r8[r7]
            r2.append(r7)
            java.lang.String[] r7 = r0.f24f
            int r7 = r7.length
            if (r7 <= r4) goto L_0x005d
            goto L_0x005e
        L_0x0049:
            k.m r12 = p020k.C0177m.f2926C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String[] r8 = r0.f24f
            r7 = r8[r7]
            r2.append(r7)
            java.lang.String[] r7 = r0.f24f
            int r7 = r7.length
            if (r7 <= r4) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r5 = r6
        L_0x005e:
            r2.append(r5)
            java.lang.String r14 = r2.toString()
            int r16 = r25 + 11
            r17 = 0
            r13 = r23
            r12.mo909a(r13, r14, r15, r16, r17)
            k.m r16 = p020k.C0177m.f2925B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r5 = r0.f27i
            java.lang.String r5 = p012f.C0104c.m360e(r5)
            r2.append(r5)
            r2.append(r11)
            java.lang.String r5 = p011e.C0057d1.f748v3
            r2.append(r5)
            java.lang.String r18 = r2.toString()
            g.y r2 = p018i.C0145a.f2629e0
            int r2 = r2.f2516q0
            int r2 = r24 + r2
            int r19 = r2 + -3
            r21 = 1
            r17 = r23
            r16.mo909a(r17, r18, r19, r20, r21)
        L_0x0099:
            int r2 = r0.f20b
            if (r2 != r4) goto L_0x00fd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r0.f22d
            r2.append(r4)
            java.lang.String r4 = " ("
            r2.append(r4)
            int r4 = r0.f28j
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            int r4 = r0.f29k
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r7 = r2.toString()
            int r15 = r24 + 3
            int r9 = r25 + 1
            r10 = 0
            r5 = r1
            r6 = r23
            r8 = r15
            r5.mo909a(r6, r7, r8, r9, r10)
            k.m r12 = p020k.C0177m.f2927D
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = p011e.C0057d1.f485J2
            r2.append(r4)
            r2.append(r11)
            int r4 = r0.f27i
            java.lang.String r4 = p012f.C0104c.m360e(r4)
            r2.append(r4)
            r2.append(r11)
            java.lang.String r4 = p011e.C0057d1.f748v3
            r2.append(r4)
            java.lang.String r14 = r2.toString()
            int r16 = r25 + 11
            r17 = 0
            r13 = r23
            r12.mo909a(r13, r14, r15, r16, r17)
        L_0x00fd:
            int r2 = r0.f20b
            if (r2 != r3) goto L_0x011b
            java.lang.String r7 = r0.f22d
            int r11 = r24 + 3
            int r9 = r25 + 1
            r10 = 0
            r5 = r1
            r6 = r23
            r8 = r11
            r5.mo909a(r6, r7, r8, r9, r10)
            k.m r8 = p020k.C0177m.f2927D
            java.lang.String r10 = p011e.C0057d1.f685m3
            int r12 = r25 + 11
            r13 = 0
            r9 = r23
            r8.mo909a(r9, r10, r11, r12, r13)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0002c.mo1b(j.f, int, int):void");
    }

    /* renamed from: c */
    public void mo2c() {
        if (this.f23e != 0) {
            this.f27i = (int) ((System.currentTimeMillis() / 1000) - this.f23e);
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
    }
}
