package p001b;

import p011e.C0062g;
import p011e.C0064h;
import p013g.C0114e;
import p013g.C0126k;
import p013g.C0137v;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: b.g */
public class C0011g extends C0008d {

    /* renamed from: g */
    public C0062g f160g;

    /* renamed from: h */
    int f161h;

    /* renamed from: i */
    int f162i;

    /* renamed from: j */
    int f163j;

    /* renamed from: k */
    int f164k;

    /* renamed from: l */
    int f165l;

    /* renamed from: m */
    C0114e f166m;

    /* renamed from: n */
    C0137v f167n;

    /* renamed from: o */
    short f168o = 0;

    /* renamed from: p */
    private long f169p = 0;

    /* renamed from: q */
    private int f170q;

    /* renamed from: c */
    public static void m71c(int i, int i2, int i3, int i4) {
        C0011g gVar = new C0011g();
        gVar.f160g = C0126k.f1888N1[i - 1];
        gVar.f164k = i2;
        gVar.f165l = i3;
        gVar.f168o = (short) i4;
        C0008d.f123a.addElement(gVar);
    }

    /* renamed from: a */
    public void mo12a(C0159f fVar) {
        if (C0159f.f2750b == 1) {
            C0126k.f1898P3++;
        }
        if (C0126k.f1898P3 < 8) {
            C0114e eVar = this.f166m;
            if (eVar != null) {
                this.f164k = eVar.f1593n;
                this.f165l = eVar.f1598o + C0145a.f2595L0;
            }
            C0137v vVar = this.f167n;
            if (vVar != null) {
                this.f164k = vVar.f2315k;
                this.f165l = vVar.f2317l + C0145a.f2595L0;
            }
            int i = this.f164k + this.f162i;
            C0064h[] hVarArr = this.f160g.f798b;
            int i2 = this.f161h;
            C0174j.m1555c(fVar, hVarArr[i2].f804c, i + hVarArr[i2].f802a, this.f165l + this.f163j + hVarArr[i2].f803b, this.f170q, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.f169p) > 0) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13b() {
        /*
            r7 = this;
            long r0 = r7.f169p
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            int r0 = r7.f161h
            int r0 = r0 + 1
            r7.f161h = r0
            e.g r1 = r7.f160g
            e.h[] r1 = r1.f798b
            if (r5 == 0) goto L_0x0024
            int r1 = r1.length
            if (r0 < r1) goto L_0x0018
            r7.f161h = r2
        L_0x0018:
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r7.f169p
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0038
            goto L_0x0030
        L_0x0024:
            int r1 = r1.length
            if (r0 < r1) goto L_0x0038
            short r0 = r7.f168o
            int r0 = r0 + -1
            short r0 = (short) r0
            r7.f168o = r0
            if (r0 > 0) goto L_0x0036
        L_0x0030:
            k.i r0 = p001b.C0008d.f123a
            r0.removeElement(r7)
            goto L_0x0038
        L_0x0036:
            r7.f161h = r2
        L_0x0038:
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % 11
            if (r0 != 0) goto L_0x0057
            g.e r0 = r7.f166m
            if (r0 == 0) goto L_0x0057
            g.e r1 = p013g.C0114e.m647e0()
            if (r0 == r1) goto L_0x0057
            k.i r0 = p013g.C0126k.f1908S1
            g.e r1 = r7.f166m
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0057
            k.i r0 = p001b.C0008d.f123a
            r0.removeElement(r7)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0011g.mo13b():void");
    }
}
