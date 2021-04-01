package p001b;

import java.io.InputStream;
import p012f.C0105d;
import p013g.C0121h0;
import p019j.C0148a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;

/* renamed from: b.e */
public class C0009e {

    /* renamed from: v */
    public static C0173i f129v = new C0173i("vEffData");

    /* renamed from: w */
    public static C0173i f130w = new C0173i("vLastEff");

    /* renamed from: x */
    public static C0173i f131x = new C0173i("vNewEff");

    /* renamed from: a */
    public int f132a;

    /* renamed from: b */
    public int f133b;

    /* renamed from: c */
    public int f134c;

    /* renamed from: d */
    public int f135d;

    /* renamed from: e */
    public boolean f136e;

    /* renamed from: f */
    public int f137f;

    /* renamed from: g */
    public int f138g;

    /* renamed from: h */
    public int f139h;

    /* renamed from: i */
    public int f140i;

    /* renamed from: j */
    public int f141j;

    /* renamed from: k */
    public int f142k;

    /* renamed from: l */
    public int f143l;

    /* renamed from: m */
    private boolean f144m = true;

    /* renamed from: n */
    public int f145n;

    /* renamed from: o */
    public int f146o = 0;

    /* renamed from: p */
    int[] f147p = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

    /* renamed from: q */
    int[] f148q = {2, 2, 2, 2, 2, 3, 3, 3, 3, 3};

    /* renamed from: r */
    int[] f149r = {4, 4, 4, 4, 4, 5, 5, 5, 5, 5};

    /* renamed from: s */
    int[] f150s = {6, 6, 6, 6, 6, 7, 7, 7, 7, 7};

    /* renamed from: t */
    int[] f151t = {8, 8, 8, 8, 8, 9, 9, 9, 9, 9};

    /* renamed from: u */
    private boolean f152u = false;

    public C0009e() {
    }

    public C0009e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f139h = i2;
        this.f140i = i3;
        this.f132a = i;
        this.f145n = i4;
        this.f141j = i5;
        this.f142k = i6;
        if (m55b(i) == null) {
            C0010f fVar = new C0010f();
            fVar.f157e = i;
            if (i >= 42 && i <= 46) {
                i = 106;
            }
            String str = "/x" + C0159f.f2750b + "/effectdata/" + i + "/data";
            InputStream inputStream = null;
            try {
                inputStream = C0148a.m1395a(str);
            } catch (Exception unused) {
            }
            if (inputStream != null) {
                if (i > 100) {
                    fVar.mo27f(str);
                } else {
                    fVar.mo25d(str);
                }
                fVar.f153a = C0161h.m1494l("/effectdata/" + i + "/img.png");
            } else {
                C0105d.m365M().mo241Q((short) i);
            }
            m54a(fVar);
            f130w.addElement(this.f132a + "");
        }
        this.f134c = -1;
        this.f135d = -1;
        this.f133b = 1;
        if (!m56d(this.f132a + "")) {
            f131x.addElement(this.f132a + "");
        }
    }

    /* renamed from: a */
    public static void m54a(C0010f fVar) {
        f129v.addElement(fVar);
        if (C0121h0.f1803v != 130 && f129v.size() > 10) {
            for (int i = 0; i < 5; i++) {
                f129v.removeElementAt(0);
            }
        }
    }

    /* renamed from: b */
    public static C0010f m55b(int i) {
        for (int i2 = 0; i2 < f129v.size(); i2++) {
            C0010f fVar = (C0010f) f129v.elementAt(i2);
            if (fVar.f157e == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m56d(String str) {
        for (int i = 0; i < f131x.size(); i++) {
            if (((String) f131x.elementAt(i)).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static void m57h(int i) {
        for (int i2 = 0; i2 < f129v.size(); i2++) {
            C0010f fVar = (C0010f) f129v.elementAt(i2);
            if (fVar.f157e == i) {
                f129v.removeElement(fVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo17c() {
        int i = this.f132a;
        if (i == 42) {
            this.f138g = this.f147p[this.f137f];
        }
        if (i == 43) {
            this.f138g = this.f148q[this.f137f];
        }
        if (i == 44) {
            this.f138g = this.f149r[this.f137f];
        }
        if (i == 45) {
            this.f138g = this.f150s[this.f137f];
        }
        if (i == 46) {
            this.f138g = this.f151t[this.f137f];
        }
        int i2 = this.f137f + 1;
        this.f137f = i2;
        if (i2 > this.f147p.length - 1) {
            this.f137f = 0;
        }
    }

    /* renamed from: e */
    public boolean mo18e() {
        return this.f144m;
    }

    /* renamed from: f */
    public void mo19f(C0159f fVar) {
        if (mo18e() && m55b(this.f132a) != null && m55b(this.f132a).f153a != null) {
            m55b(this.f132a).mo23b(fVar, this.f138g, this.f139h, this.f140i, this.f146o, this.f145n);
        }
    }

    /* renamed from: g */
    public void mo20g(C0159f fVar, int i, int i2) {
        if (mo18e() && m55b(this.f132a).f153a != null) {
            m55b(this.f132a).mo23b(fVar, this.f138g, this.f139h + i, this.f140i + i2, this.f146o, this.f145n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r0 != 3) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r11.f137f < m55b(r11.f132a).f156d.length) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r11.f137f < m55b(r11.f132a).f156d.length) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21i() {
        /*
            r11 = this;
            int r0 = r11.f132a
            r1 = 42
            if (r0 < r1) goto L_0x000e
            r1 = 46
            if (r0 > r1) goto L_0x000e
            r11.mo17c()
            return
        L_0x000e:
            b.f r0 = m55b(r0)
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            int r0 = r11.f132a
            b.f r0 = m55b(r0)
            h.a.a.b r0 = r0.f153a
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            int r0 = r11.f132a
            b.f r0 = m55b(r0)
            short[] r0 = r0.f156d
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0103
            boolean r0 = r11.f152u
            if (r0 != 0) goto L_0x0058
            r11.f152u = r4
            int r0 = r11.f132a
            b.f r0 = m55b(r0)
            short[] r0 = r0.f156d
            int r0 = r0.length
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x004a
            int r5 = r11.f133b
            if (r5 == r4) goto L_0x004a
            int r0 = p013g.C0111c0.m587n(r3, r0)
            r11.f137f = r0
        L_0x004a:
            int r0 = r11.f133b
            if (r0 != 0) goto L_0x0058
            int r0 = r11.f134c
            int r5 = r11.f135d
            int r0 = p013g.C0111c0.m587n(r0, r5)
            r11.f137f = r0
        L_0x0058:
            int r0 = r11.f133b
            if (r0 == 0) goto L_0x009b
            if (r0 == r4) goto L_0x0088
            if (r0 == r2) goto L_0x0064
            if (r0 == r1) goto L_0x0088
            goto L_0x00e7
        L_0x0064:
            int r0 = r11.f137f
            int r5 = r11.f132a
            b.f r5 = m55b(r5)
            short[] r5 = r5.f156d
            int r5 = r5.length
            if (r0 >= r5) goto L_0x0076
            int r0 = r11.f137f
            int r0 = r0 + r4
            r11.f137f = r0
        L_0x0076:
            int r0 = r11.f143l
            int r0 = r0 + r4
            r11.f143l = r0
            int r5 = r11.f142k
            if (r0 != r5) goto L_0x00e7
            r11.f143l = r3
            int r0 = p013g.C0111c0.m587n(r3, r2)
            r11.f146o = r0
            goto L_0x00e7
        L_0x0088:
            int r0 = r11.f137f
            int r5 = r11.f132a
            b.f r5 = m55b(r5)
            short[] r5 = r5.f156d
            int r5 = r5.length
            if (r0 >= r5) goto L_0x00e7
        L_0x0095:
            int r0 = r11.f137f
            int r0 = r0 + r4
        L_0x0098:
            r11.f137f = r0
            goto L_0x00e7
        L_0x009b:
            int r0 = r11.f139h
            int r5 = r0 + -50
            int r0 = r11.f140i
            int r6 = r0 + -50
            r7 = 100
            r8 = 100
            g.e r0 = p013g.C0114e.m647e0()
            int r9 = r0.f1593n
            g.e r0 = p013g.C0114e.m647e0()
            int r10 = r0.f1598o
            boolean r0 = p013g.C0111c0.m582i(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x00c9
            int r0 = r11.f137f
            int r5 = r11.f134c
            if (r0 <= r5) goto L_0x00c9
            int r5 = r11.f135d
            if (r0 >= r5) goto L_0x00c9
            if (r0 >= r5) goto L_0x00c7
            r11.f137f = r5
        L_0x00c7:
            r11.f136e = r4
        L_0x00c9:
            boolean r0 = r11.f136e
            if (r0 != 0) goto L_0x00d9
            int r0 = r11.f137f
            int r0 = r0 + r4
            r11.f137f = r0
            int r5 = r11.f135d
            if (r0 != r5) goto L_0x00e7
            int r0 = r11.f134c
            goto L_0x0098
        L_0x00d9:
            int r0 = r11.f137f
            int r5 = r11.f132a
            b.f r5 = m55b(r5)
            short[] r5 = r5.f156d
            int r5 = r5.length
            if (r0 >= r5) goto L_0x00e7
            goto L_0x0095
        L_0x00e7:
            int r0 = r11.f137f
            int r5 = r11.f132a
            b.f r5 = m55b(r5)
            short[] r5 = r5.f156d
            int r5 = r5.length
            int r5 = r5 - r4
            if (r0 > r5) goto L_0x0103
            int r0 = r11.f132a
            b.f r0 = m55b(r0)
            short[] r0 = r0.f156d
            int r5 = r11.f137f
            short r0 = r0[r5]
            r11.f138g = r0
        L_0x0103:
            int r0 = r11.f137f
            int r5 = r11.f132a
            b.f r5 = m55b(r5)
            short[] r5 = r5.f156d
            int r5 = r5.length
            int r5 = r5 - r4
            if (r0 < r5) goto L_0x015e
            int r0 = r11.f133b
            if (r0 == 0) goto L_0x0117
            if (r0 != r1) goto L_0x0119
        L_0x0117:
            r11.f144m = r3
        L_0x0119:
            int r0 = r11.f142k
            r1 = -1
            if (r0 != r1) goto L_0x0123
            k.i r0 = p001b.C0007c.f122a
            r0.removeElement(r11)
        L_0x0123:
            int r0 = r11.f133b
            if (r0 != r2) goto L_0x012a
            r11.f137f = r3
            return
        L_0x012a:
            r11.f136e = r3
            int r0 = r11.f141j
            if (r0 != r1) goto L_0x0146
            int r0 = r11.f143l
            int r0 = r0 + r4
            r11.f143l = r0
            int r1 = r11.f142k
            if (r0 != r1) goto L_0x0160
            r11.f143l = r3
            r11.f137f = r3
            if (r1 <= r4) goto L_0x0160
            int r0 = p013g.C0111c0.m587n(r3, r2)
            r11.f146o = r0
            goto L_0x0160
        L_0x0146:
            int r1 = r11.f143l
            int r1 = r1 + r4
            r11.f143l = r1
            int r2 = r11.f142k
            if (r1 != r2) goto L_0x0160
            r11.f143l = r3
            int r0 = r0 - r4
            r11.f141j = r0
            r11.f137f = r3
            if (r0 != 0) goto L_0x0160
            k.i r0 = p001b.C0007c.f122a
            r0.removeElement(r11)
            goto L_0x0160
        L_0x015e:
            r11.f144m = r4
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001b.C0009e.mo21i():void");
    }
}
