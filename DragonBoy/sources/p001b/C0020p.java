package p001b;

import p011e.C0062g;
import p011e.C0064h;
import p013g.C0114e;
import p013g.C0126k;
import p013g.C0137v;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: b.p */
public class C0020p extends C0008d {

    /* renamed from: g */
    public C0062g f241g;

    /* renamed from: h */
    int f242h;

    /* renamed from: i */
    int f243i;

    /* renamed from: j */
    int f244j;

    /* renamed from: k */
    int f245k;

    /* renamed from: l */
    int f246l;

    /* renamed from: m */
    C0114e f247m;

    /* renamed from: n */
    C0137v f248n;

    /* renamed from: o */
    short f249o = 0;

    /* renamed from: p */
    private long f250p = 0;

    /* renamed from: q */
    private int f251q;

    /* renamed from: c */
    public static void m96c(int i, int i2, int i3, int i4) {
        C0020p pVar = new C0020p();
        pVar.f241g = C0126k.f1888N1[i - 1];
        pVar.f245k = i2;
        pVar.f246l = i3;
        pVar.f249o = (short) i4;
        C0008d.f124b.addElement(pVar);
    }

    /* renamed from: d */
    public static void m97d(int i, int i2, int i3, int i4, int i5) {
        C0020p pVar = new C0020p();
        pVar.f241g = C0126k.f1888N1[i - 1];
        pVar.f245k = i2;
        pVar.f246l = i3;
        pVar.f249o = (short) i4;
        pVar.f251q = i5;
        C0008d.f124b.addElement(pVar);
    }

    /* renamed from: f */
    public static void m98f(int i, C0114e eVar, int i2) {
        C0020p pVar = new C0020p();
        pVar.f241g = C0126k.f1888N1[i - 1];
        pVar.f247m = eVar;
        pVar.f249o = (short) i2;
        C0008d.f124b.addElement(pVar);
    }

    /* renamed from: g */
    public static void m99g(int i, C0137v vVar, int i2) {
        C0020p pVar = new C0020p();
        pVar.f241g = C0126k.f1888N1[i - 1];
        pVar.f248n = vVar;
        pVar.f249o = (short) i2;
        C0008d.f124b.addElement(pVar);
    }

    /* renamed from: a */
    public void mo12a(C0159f fVar) {
        if (C0159f.f2750b == 1) {
            C0126k.f1898P3++;
        }
        if (C0126k.f1898P3 < 11) {
            C0114e eVar = this.f247m;
            if (eVar != null) {
                this.f245k = eVar.f1593n;
                this.f246l = eVar.f1598o + C0145a.f2595L0;
            }
            C0137v vVar = this.f248n;
            if (vVar != null) {
                this.f245k = vVar.f2315k;
                this.f246l = vVar.f2317l + C0145a.f2595L0;
            }
            int i = this.f245k + this.f243i;
            C0064h[] hVarArr = this.f241g.f798b;
            int i2 = this.f242h;
            int i3 = i + hVarArr[i2].f802a;
            int i4 = this.f246l + this.f244j + hVarArr[i2].f803b;
            if (C0145a.m1334D(i3, i4)) {
                C0174j.m1555c(fVar, this.f241g.f798b[this.f242h].f804c, i3, i4, this.f251q, 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.f250p) > 0) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13b() {
        /*
            r7 = this;
            long r0 = r7.f250p
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            int r0 = r7.f242h
            int r0 = r0 + 1
            r7.f242h = r0
            e.g r1 = r7.f241g
            e.h[] r1 = r1.f798b
            if (r5 == 0) goto L_0x0024
            int r1 = r1.length
            if (r0 < r1) goto L_0x0018
            r7.f242h = r2
        L_0x0018:
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r7.f250p
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0038
            goto L_0x0030
        L_0x0024:
            int r1 = r1.length
            if (r0 < r1) goto L_0x0038
            short r0 = r7.f249o
            int r0 = r0 + -1
            short r0 = (short) r0
            r7.f249o = r0
            if (r0 > 0) goto L_0x0036
        L_0x0030:
            k.i r0 = p001b.C0008d.f124b
            r0.removeElement(r7)
            goto L_0x0038
        L_0x0036:
            r7.f242h = r2
        L_0x0038:
            int r0 = p018i.C0145a.f2600O
            int r0 = r0 % 11
            if (r0 != 0) goto L_0x0057
            g.e r0 = r7.f247m
            if (r0 == 0) goto L_0x0057
            g.e r1 = p013g.C0114e.m647e0()
            if (r0 == r1) goto L_0x0057
            k.i r0 = p013g.C0126k.f1908S1
            g.e r1 = r7.f247m
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0057
            k.i r0 = p001b.C0008d.f124b
            r0.removeElement(r7)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0020p.mo13b():void");
    }
}
