package p013g;

import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p012f.C0105d;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0159f;
import p020k.C0176l;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: g.w */
public class C0138w extends C0178n implements C0072l {

    /* renamed from: q */
    public static C0138w f2333q;

    /* renamed from: i */
    public C0176l f2334i;

    /* renamed from: j */
    public C0176l f2335j;

    /* renamed from: k */
    private int f2336k;

    /* renamed from: l */
    private int f2337l;

    /* renamed from: m */
    private int f2338m;

    /* renamed from: n */
    private int f2339n;

    /* renamed from: o */
    String[] f2340o;

    /* renamed from: p */
    int f2341p;

    public C0138w() {
        int i = C0145a.f2614V - 20;
        this.f2338m = i;
        if (i > 320) {
            this.f2338m = 320;
        }
        String[] h = C0177m.f2952t.mo916h(C0057d1.f560U0, this.f2338m - 20);
        this.f2340o = h;
        this.f2336k = (C0145a.f2614V - this.f2338m) / 2;
        this.f2337l = (C0145a.f2616W - 150) - ((h.length - 1) * 20);
        this.f2339n = ((h.length - 1) * 20) + 110;
        C0176l lVar = new C0176l();
        this.f2334i = lVar;
        lVar.f2905g = C0057d1.f546S0;
        lVar.f2899a = this.f2336k + 10;
        lVar.f2900b = this.f2337l + 35 + ((this.f2340o.length - 1) * 20);
        lVar.f2901c = this.f2338m - 20;
        lVar.f2902d = C0178n.f2966d + 2;
        if (C0145a.f2659x) {
            lVar.f2903e = false;
        } else {
            lVar.f2903e = true;
        }
        lVar.mo903n(0);
        if (!C0145a.f2659x) {
            this.f2973c = this.f2334i.f2922x;
        }
        C0176l lVar2 = new C0176l();
        this.f2335j = lVar2;
        lVar2.f2905g = C0057d1.f553T0;
        lVar2.f2899a = this.f2336k + 10;
        lVar2.f2900b = this.f2334i.f2900b + 35;
        lVar2.f2901c = this.f2338m - 20;
        lVar2.f2902d = C0178n.f2966d + 2;
        lVar2.f2903e = false;
        lVar2.mo903n(0);
        this.f2971a = new C0055d(C0057d1.f606b1, (C0072l) this, 1, (Object) null);
        C0055d dVar = new C0055d(C0057d1.f567V0, (C0072l) this, 2, (Object) null);
        this.f2972b = dVar;
        if (C0145a.f2659x) {
            int i2 = C0145a.f2614V;
            dVar.f407h = (i2 / 2) + 18;
            C0055d dVar2 = this.f2971a;
            dVar2.f407h = (i2 / 2) - 85;
            int i3 = this.f2337l + this.f2339n + 5;
            dVar2.f408i = i3;
            dVar.f408i = i3;
        }
    }

    /* renamed from: k */
    public static C0138w m1087k() {
        if (f2333q == null) {
            f2333q = new C0138w();
        }
        return f2333q;
    }

    /* renamed from: d */
    public void mo341d(C0159f fVar) {
        C0126k.m893c0().mo341d(fVar);
        C0067i0.m243g(fVar, this.f2336k, this.f2337l, this.f2338m, this.f2339n, -1, true);
        int i = 0;
        while (true) {
            String[] strArr = this.f2340o;
            if (i < strArr.length) {
                C0177m.f2952t.mo909a(fVar, strArr[i], C0145a.f2614V / 2, this.f2337l + 15 + (i * 20), 2);
                i++;
            } else {
                this.f2334i.mo901l(fVar);
                this.f2335j.mo901l(fVar);
                super.mo341d(fVar);
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        String str;
        if (i == 1) {
            C0126k.f1970h1.mo342f();
            mo601j();
        }
        if (i == 2) {
            if (this.f2334i.mo899f() == null || this.f2334i.mo899f().equals("")) {
                str = C0057d1.f574W0;
            } else if (this.f2335j.mo899f() == null || this.f2335j.mo899f().equals("")) {
                str = C0057d1.f580X0;
            } else {
                C0105d.m365M().mo229J0(this.f2334i.mo899f(), this.f2335j.mo899f());
                C0126k.f1970h1.mo342f();
                mo601j();
                return;
            }
            C0145a.m1349X(str);
        }
    }

    /* renamed from: f */
    public void mo342f() {
        this.f2341p = 0;
        try {
            if (C0057d1.f680l5 == 0) {
                C0146b.f2678f.mo721b("http://ngocrongonline.com/");
            }
            if (C0057d1.f680l5 == 2) {
                C0146b.f2678f.mo721b("http://dragonball.indonaga.com/");
            }
            if (C0057d1.f680l5 == 1) {
                C0146b.f2678f.mo721b("http://world.teamobi.com/games-page-0.html");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo343h() {
        C0126k.m893c0().mo343h();
        this.f2334i.mo908t();
        this.f2335j.mo908t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (p018i.C0145a.f2659x == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (p018i.C0145a.f2659x == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2 < 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r2 > 1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo344i() {
        /*
            r6 = this;
            boolean[] r0 = p018i.C0145a.f2574B
            r1 = 2
            boolean r2 = r0[r1]
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L_0x0014
            int r2 = r6.f2341p
            int r2 = r2 - r4
            r6.f2341p = r2
            if (r2 >= 0) goto L_0x0020
        L_0x0011:
            r6.f2341p = r4
            goto L_0x0020
        L_0x0014:
            boolean r2 = r0[r3]
            if (r2 == 0) goto L_0x0020
            int r2 = r6.f2341p
            int r2 = r2 + r4
            r6.f2341p = r2
            if (r2 <= r4) goto L_0x0020
            goto L_0x0011
        L_0x0020:
            boolean r1 = r0[r1]
            r2 = 0
            if (r1 != 0) goto L_0x0029
            boolean r0 = r0[r3]
            if (r0 == 0) goto L_0x0058
        L_0x0029:
            p018i.C0145a.m1359n()
            int r0 = r6.f2341p
            if (r0 != r4) goto L_0x0041
            k.l r0 = r6.f2334i
            r0.f2903e = r2
            k.l r0 = r6.f2335j
            r0.f2903e = r4
            boolean r1 = p018i.C0145a.f2659x
            if (r1 != 0) goto L_0x0058
        L_0x003c:
            e.d r0 = r0.f2922x
            r6.f2973c = r0
            goto L_0x0058
        L_0x0041:
            if (r0 != 0) goto L_0x0050
            k.l r0 = r6.f2334i
            r0.f2903e = r4
            k.l r1 = r6.f2335j
            r1.f2903e = r2
            boolean r1 = p018i.C0145a.f2659x
            if (r1 != 0) goto L_0x0058
            goto L_0x003c
        L_0x0050:
            k.l r0 = r6.f2334i
            r0.f2903e = r2
            k.l r0 = r6.f2335j
            r0.f2903e = r2
        L_0x0058:
            boolean r0 = p018i.C0145a.f2582F
            if (r0 == 0) goto L_0x0081
            k.l r0 = r6.f2334i
            int r1 = r0.f2899a
            int r3 = r0.f2900b
            int r5 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r3, r5, r0)
            if (r0 == 0) goto L_0x006f
            r6.f2341p = r2
            goto L_0x0081
        L_0x006f:
            k.l r0 = r6.f2335j
            int r1 = r0.f2899a
            int r2 = r0.f2900b
            int r3 = r0.f2901c
            int r0 = r0.f2902d
            boolean r0 = p018i.C0145a.m1336F(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x0081
            r6.f2341p = r4
        L_0x0081:
            super.mo344i()
            p018i.C0145a.m1359n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013g.C0138w.mo344i():void");
    }

    /* renamed from: j */
    public void mo601j() {
        f2333q = null;
    }
}
