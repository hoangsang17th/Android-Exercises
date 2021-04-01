package p020k;

import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0067i0;
import p011e.C0072l;
import p013g.C0111c0;
import p013g.C0127l;
import p013g.C0140y;
import p018i.C0145a;
import p019j.C0159f;

/* renamed from: k.c */
public class C0167c implements C0072l {

    /* renamed from: m */
    private static C0167c f2787m = null;

    /* renamed from: n */
    public static String f2788n = "Chat ";

    /* renamed from: a */
    public C0176l f2789a;

    /* renamed from: b */
    public boolean f2790b = false;

    /* renamed from: c */
    public C0127l f2791c;

    /* renamed from: d */
    long f2792d = 0;

    /* renamed from: e */
    public C0055d f2793e;

    /* renamed from: f */
    public C0055d f2794f;

    /* renamed from: g */
    public C0055d f2795g = null;

    /* renamed from: h */
    int f2796h;

    /* renamed from: i */
    int f2797i;

    /* renamed from: j */
    int f2798j;

    /* renamed from: k */
    int f2799k;

    /* renamed from: l */
    public String f2800l;

    public C0167c() {
        C0176l lVar = new C0176l();
        this.f2789a = lVar;
        lVar.f2905g = "chat";
        int i = C0145a.f2614V;
        lVar.f2901c = i;
        lVar.f2902d = C0178n.f2966d + 2;
        lVar.f2899a = (C0145a.f2614V / 2) - (i / 2);
        lVar.f2903e = true;
        lVar.mo904o(40);
    }

    /* renamed from: b */
    public static C0167c m1522b() {
        C0167c cVar = f2787m;
        if (cVar != null) {
            return cVar;
        }
        C0167c cVar2 = new C0167c();
        f2787m = cVar2;
        return cVar2;
    }

    /* renamed from: a */
    public void mo820a() {
        this.f2789a.mo906r("");
        this.f2790b = false;
    }

    /* renamed from: c */
    public void mo821c() {
        this.f2793e = new C0055d(C0057d1.f669k1, this, 8000, (Object) null, 1, (C0145a.f2616W - C0178n.f2968f) + 1);
        C0055d dVar = new C0055d(C0057d1.f613c1, this, 8001, (Object) null, C0145a.f2614V - 70, (C0145a.f2616W - C0178n.f2968f) + 1);
        this.f2794f = dVar;
        this.f2795g = null;
        C0176l lVar = this.f2789a;
        int i = lVar.f2901c + 10;
        this.f2798j = i;
        int i2 = lVar.f2902d + 10;
        this.f2799k = i2;
        int i3 = (C0145a.f2614V / 2) - (i / 2);
        this.f2796h = i3;
        int i4 = lVar.f2900b;
        this.f2797i = i4;
        C0055d dVar2 = this.f2793e;
        dVar2.f407h = i3;
        dVar.f407h = (i3 + i) - 68;
        if (C0145a.f2659x) {
            lVar.f2900b = i4 - 5;
            this.f2797i = i4 - 20;
            this.f2799k = i2 + 30;
            int i5 = C0145a.f2614V;
            dVar2.f407h = ((i5 / 2) - 68) - 5;
            dVar.f407h = (i5 / 2) + 5;
            int i6 = C0145a.f2616W;
            dVar2.f408i = i6 - 30;
            dVar.f408i = i6 - 30;
        }
    }

    /* renamed from: d */
    public void mo822d(int i) {
        C0055d dVar;
        String str;
        if (this.f2790b) {
            this.f2789a.mo900i(i);
        }
        if (this.f2789a.mo899f().equals("")) {
            dVar = this.f2794f;
            str = C0057d1.f606b1;
        } else {
            dVar = this.f2794f;
            str = C0057d1.f613c1;
        }
        dVar.f400a = str;
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 8000) {
            C0111c0.m584k("perform chat 1");
            if (this.f2791c != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f2792d >= 1000) {
                    this.f2792d = currentTimeMillis;
                    this.f2791c.mo514a(this.f2789a.mo899f(), this.f2800l);
                    this.f2789a.mo896b();
                    this.f2794f.f400a = C0057d1.f606b1;
                }
            }
        } else if (i == 8001) {
            C0111c0.m584k("perform chat 2");
            this.f2789a.mo895a();
            if (this.f2789a.mo899f().equals("")) {
                this.f2790b = false;
                this.f2791c.mo515b();
            }
        }
    }

    /* renamed from: f */
    public void mo823f(C0159f fVar) {
        if (this.f2790b) {
            C0067i0.m243g(fVar, this.f2796h, this.f2797i + 12, this.f2798j, this.f2799k + 100, -1, true);
            this.f2789a.mo901l(fVar);
        }
    }

    /* renamed from: g */
    public void mo824g(int i, C0127l lVar, String str) {
        this.f2794f.f400a = C0057d1.f606b1;
        this.f2800l = str;
        this.f2789a.mo900i(i);
        if (!this.f2789a.mo899f().equals("") && C0145a.f2637i0 == null) {
            this.f2791c = lVar;
            this.f2790b = true;
        }
    }

    /* renamed from: h */
    public void mo825h(C0127l lVar, String str) {
        C0167c cVar;
        C0167c cVar2;
        this.f2794f.f400a = C0057d1.f606b1;
        this.f2800l = str;
        if (C0145a.f2637i0 == null) {
            if (m1522b().f2790b) {
                m1522b().f2790b = false;
            }
            C0140y yVar = C0145a.f2629e0;
            if (!(yVar == null || (cVar2 = yVar.f2395C) == null || !cVar2.f2790b)) {
                cVar2.f2790b = false;
            }
            C0140y yVar2 = C0145a.f2631f0;
            if (!(yVar2 == null || (cVar = yVar2.f2395C) == null || !cVar.f2790b)) {
                cVar.f2790b = false;
            }
            this.f2790b = true;
            if (C0145a.f2659x) {
                this.f2789a.mo897c();
            }
        }
    }

    /* renamed from: i */
    public void mo826i() {
        if (this.f2790b) {
            this.f2789a.mo908t();
            C0176l lVar = this.f2789a;
            if (lVar.f2919u) {
                lVar.f2919u = false;
                this.f2791c.mo514a(lVar.mo899f(), this.f2800l);
                this.f2789a.mo906r("");
                this.f2794f.f400a = C0057d1.f606b1;
            }
        }
    }
}
