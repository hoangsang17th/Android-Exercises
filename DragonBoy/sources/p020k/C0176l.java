package p020k;

import com.blue.dragonball.MainActivity;
import p011e.C0055d;
import p011e.C0057d1;
import p011e.C0072l;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p019j.C0163j;

/* renamed from: k.l */
public class C0176l implements C0072l {

    /* renamed from: A */
    private static final int[] f2890A = {18, 14, 11, 9, 6, 4, 2};

    /* renamed from: B */
    private static int f2891B = 0;

    /* renamed from: C */
    public static boolean f2892C = false;

    /* renamed from: D */
    public static int f2893D = 0;

    /* renamed from: E */
    public static int f2894E = 11;

    /* renamed from: F */
    public static C0143b f2895F = C0161h.m1494l("/mainImage/myTexture2der.png");

    /* renamed from: G */
    public static C0143b f2896G = C0161h.m1494l("/mainImage/myTexture2dtf.png");

    /* renamed from: H */
    static int f2897H = 0;

    /* renamed from: z */
    public static int f2898z = 2;

    /* renamed from: a */
    public int f2899a;

    /* renamed from: b */
    public int f2900b;

    /* renamed from: c */
    public int f2901c;

    /* renamed from: d */
    public int f2902d;

    /* renamed from: e */
    public boolean f2903e;

    /* renamed from: f */
    public boolean f2904f;

    /* renamed from: g */
    public String f2905g;

    /* renamed from: h */
    public String f2906h;

    /* renamed from: i */
    private String f2907i;

    /* renamed from: j */
    private String f2908j;

    /* renamed from: k */
    private String f2909k;

    /* renamed from: l */
    private int f2910l;

    /* renamed from: m */
    private int f2911m;

    /* renamed from: n */
    private int f2912n;

    /* renamed from: o */
    private int f2913o;

    /* renamed from: p */
    private int f2914p;

    /* renamed from: q */
    private int f2915q;

    /* renamed from: r */
    private int f2916r;

    /* renamed from: s */
    public int f2917s;

    /* renamed from: t */
    public int f2918t;

    /* renamed from: u */
    public boolean f2919u;

    /* renamed from: v */
    public int f2920v;

    /* renamed from: w */
    public C0163j f2921w;

    /* renamed from: x */
    public C0055d f2922x;

    /* renamed from: y */
    public boolean f2923y;

    static {
        C0177m mVar = C0177m.f2930G;
    }

    public C0176l() {
        this.f2904f = false;
        this.f2905g = "";
        this.f2906h = "";
        this.f2907i = "";
        this.f2908j = "";
        this.f2909k = "";
        this.f2910l = 0;
        this.f2911m = 0;
        this.f2912n = 500;
        this.f2913o = 0;
        this.f2914p = -1984;
        this.f2915q = 0;
        this.f2916r = 10;
        this.f2917s = 0;
        this.f2918t = 0;
        this.f2907i = "";
        m1610g();
    }

    /* renamed from: g */
    private void m1610g() {
        f2891B = 20;
        this.f2922x = new C0055d(C0057d1.f613c1, (C0072l) this, 1000, (Object) null);
        f2893D = 0;
        MainActivity.f319x.mo797a(this);
        this.f2920v = MainActivity.m191c();
    }

    /* renamed from: h */
    private boolean m1611h() {
        return this.f2903e;
    }

    /* renamed from: j */
    private void m1612j(int i) {
    }

    /* renamed from: k */
    private void m1613k(int i) {
    }

    /* renamed from: q */
    private void m1614q() {
        if (this.f2917s == 2) {
            this.f2908j = "";
            for (int i = 0; i < this.f2907i.length(); i++) {
                this.f2908j += "*";
            }
            if (this.f2915q > 0 && this.f2910l > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2908j.substring(0, this.f2910l - 1));
                sb.append(this.f2907i.charAt(this.f2910l - 1));
                String str = this.f2908j;
                sb.append(str.substring(this.f2910l, str.length()));
                this.f2908j = sb.toString();
            }
        }
    }

    /* renamed from: a */
    public void mo895a() {
        if (this.f2910l > 0 && this.f2907i.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2907i.substring(0, this.f2910l - 1));
            String str = this.f2907i;
            sb.append(str.substring(this.f2910l, str.length()));
            this.f2907i = sb.toString();
            this.f2910l--;
            mo905p();
            m1614q();
        }
    }

    /* renamed from: b */
    public void mo896b() {
        this.f2907i = "";
        this.f2910l = 0;
        mo905p();
        m1614q();
    }

    /* renamed from: c */
    public void mo897c() {
        mo896b();
        this.f2903e = true;
        C0163j.f2764g = true;
        MainActivity mainActivity = MainActivity.f303h;
        int i = this.f2901c;
        int i2 = C0159f.f2750b;
        C0163j jVar = new C0163j(mainActivity, i * i2, i2 * 30);
        this.f2921w = jVar;
        int i3 = this.f2899a;
        int i4 = C0159f.f2750b;
        jVar.mo805f(i3 * i4, this.f2900b * i4);
        if (mo899f() != null) {
            this.f2921w.setText(mo899f());
        }
        this.f2921w.setmyInputType(this.f2917s);
        this.f2921w.setMaxTextInput(this.f2912n);
        this.f2921w.setVisible(true);
        this.f2921w.setEnabled(true);
        C0163j jVar2 = this.f2921w;
        jVar2.f2765a = this.f2920v;
        MainActivity.f303h.mo109j(1, jVar2);
    }

    /* renamed from: d */
    public void mo898d() {
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        if (i == 1000) {
            mo895a();
        }
    }

    /* renamed from: f */
    public String mo899f() {
        return this.f2907i;
    }

    /* renamed from: i */
    public boolean mo900i(int i) {
        if (i == 8 || i == -8 || i == 204) {
            mo895a();
            return true;
        }
        if (i >= 65 && i <= 122) {
            f2892C = true;
            f2893D = 0;
        }
        if (f2892C) {
            if (i == 45) {
                if (i != this.f2914p || this.f2915q >= f2890A[f2898z]) {
                    this.f2914p = 45;
                } else {
                    String str = this.f2907i.substring(0, this.f2910l - 1) + '_';
                    this.f2907i = str;
                    this.f2909k = str;
                    m1614q();
                    mo905p();
                    this.f2914p = -1984;
                    return false;
                }
            }
            if (i >= 32) {
                m1613k(i);
                return false;
            }
        }
        if (i == f2894E) {
            int i2 = this.f2918t + 1;
            this.f2918t = i2;
            if (i2 > 3) {
                this.f2918t = 0;
            }
            this.f2915q = 1;
            this.f2914p = i;
            return false;
        }
        if (i == 42) {
            i = 58;
        }
        if (i == 35) {
            i = 59;
        }
        if (i < 48 || i > 59) {
            this.f2914p = -1984;
            if (i == 14 && !this.f2904f) {
                int i3 = this.f2910l;
                if (i3 > 0) {
                    this.f2910l = i3 - 1;
                    mo905p();
                    this.f2916r = 10;
                    return false;
                }
            } else if (i != 15 || this.f2904f) {
                if (i == 19) {
                    mo895a();
                    return false;
                }
                this.f2914p = i;
            } else if (this.f2910l < this.f2907i.length()) {
                this.f2910l++;
                mo905p();
                this.f2916r = 10;
                return false;
            }
        } else {
            int i4 = this.f2917s;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                m1612j(i);
            } else if (i4 == 1) {
                m1613k(i);
                this.f2915q = 1;
            }
        }
        return true;
    }

    /* renamed from: l */
    public void mo901l(C0159f fVar) {
        C0159f fVar2 = fVar;
        fVar2.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        boolean h = m1611h();
        this.f2909k = this.f2917s == 2 ? this.f2908j : this.f2907i;
        int i = this.f2899a;
        int i2 = this.f2900b;
        mo902m(fVar, h, i, i2, this.f2901c, 23, this.f2913o + 4 + i, ((23 - C0177m.f2930G.mo913e()) / 2) + i2 + 2, this.f2909k, this.f2905g);
        fVar2.mo771C(this.f2899a + 3, this.f2900b + 1, this.f2901c - 4, 21);
        fVar.mo770B();
        fVar2.mo774a(this.f2899a + 3, this.f2900b + 1, this.f2901c - 4, 21);
        fVar2.mo772D(0);
        if (m1611h() && this.f2923y && this.f2915q == 0 && (this.f2916r > 0 || (this.f2911m / 5) % 3 == 0)) {
            fVar2.mo772D(-7833737);
            int i3 = this.f2900b;
            int i4 = f2891B;
            fVar2.mo783l((((this.f2913o + 5) + this.f2899a) + C0177m.f2930G.mo914f(this.f2909k.substring(0, this.f2910l))) - 1, i3 + ((23 - i4) / 2) + 3, 1, i4);
        }
        C0159f.m1454z(fVar);
        fVar.mo769A();
        C0145a.m1346T(fVar);
        String str = this.f2907i;
        if (str != null && str.length() > 0 && C0145a.f2659x && h) {
            fVar2.mo776e(f2895F, (this.f2899a + this.f2901c) - 13, this.f2900b + 11 + 3, 3);
        }
    }

    /* renamed from: m */
    public void mo902m(C0159f fVar, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str, String str2) {
        C0177m mVar;
        int i7;
        C0159f fVar2;
        String str3;
        C0159f fVar3 = fVar;
        int i8 = i4;
        String str4 = str;
        int i9 = 0;
        fVar3.mo772D(0);
        C0143b bVar = f2896G;
        if (z) {
            C0159f fVar4 = fVar;
            int i10 = i2;
            fVar4.mo779h(bVar, 0, 81, 29, 27, 0, i, i10, 0);
            int i11 = i + i3;
            fVar4.mo779h(f2896G, 0, 135, 29, 27, 0, i11 - 29, i10, 0);
            fVar4.mo779h(f2896G, 0, 108, 29, 27, 0, i11 - 58, i10, 0);
            while (i9 < (i3 - 58) / 29) {
                fVar.mo779h(f2896G, 0, 108, 29, 27, 0, (i9 * 29) + i + 29, i2, 0);
                i9++;
            }
        } else {
            C0159f fVar5 = fVar;
            int i12 = i2;
            fVar5.mo779h(bVar, 0, 0, 29, 27, 0, i, i12, 0);
            int i13 = i + i3;
            fVar5.mo779h(f2896G, 0, 54, 29, 27, 0, i13 - 29, i12, 0);
            fVar5.mo779h(f2896G, 0, 27, 29, 27, 0, i13 - 58, i12, 0);
            while (i9 < (i3 - 58) / 29) {
                fVar.mo779h(f2896G, 0, 27, 29, 27, 0, (i9 * 29) + i + 29, i2, 0);
                i9++;
            }
        }
        int i14 = i + 3;
        int i15 = i2 + 1;
        int i16 = i3 - 4;
        fVar3.mo771C(i14, i15, i16, i8);
        fVar.mo770B();
        fVar3.mo774a(i14, i15, i16, i8);
        if (str4 == null || str4.equals("")) {
            if (str2 != null) {
                mVar = z ? C0177m.f2954v : C0177m.f2955w;
                i7 = 0;
                fVar2 = fVar;
                str3 = str2;
            }
            C0159f.m1454z(fVar);
            fVar.mo769A();
        }
        mVar = C0177m.f2930G;
        i7 = 0;
        fVar2 = fVar;
        str3 = str;
        mVar.mo909a(fVar2, str3, i5, i6, i7);
        C0159f.m1454z(fVar);
        fVar.mo769A();
    }

    /* renamed from: n */
    public void mo903n(int i) {
        this.f2917s = i;
        mo904o(500);
    }

    /* renamed from: o */
    public void mo904o(int i) {
        this.f2912n = i;
    }

    /* renamed from: p */
    public void mo905p() {
        this.f2909k = this.f2917s == 2 ? this.f2908j : this.f2907i;
        if (this.f2913o < 0) {
            int f = C0177m.f2930G.mo914f(this.f2909k) + this.f2913o;
            int i = this.f2901c;
            int i2 = f2893D;
            if (f < ((i - 4) - 13) - i2) {
                this.f2913o = ((i - 10) - i2) - C0177m.f2930G.mo914f(this.f2909k);
            }
        }
        if (this.f2913o + C0177m.f2930G.mo914f(this.f2909k.substring(0, this.f2910l)) <= 0) {
            int i3 = -C0177m.f2930G.mo914f(this.f2909k.substring(0, this.f2910l));
            this.f2913o = i3;
            this.f2913o = i3 + 40;
        } else {
            int f2 = this.f2913o + C0177m.f2930G.mo914f(this.f2909k.substring(0, this.f2910l));
            int i4 = this.f2901c;
            int i5 = f2893D;
            if (f2 >= (i4 - 32) - i5) {
                this.f2913o = (((i4 - 20) - i5) - C0177m.f2930G.mo914f(this.f2909k.substring(0, this.f2910l))) - 8;
            }
        }
        if (this.f2913o > 0) {
            this.f2913o = 0;
        }
    }

    /* renamed from: r */
    public void mo906r(String str) {
        if (str != null) {
            this.f2907i = str;
            this.f2909k = str;
            m1614q();
            this.f2910l = str.length();
            mo905p();
        }
    }

    /* renamed from: s */
    public void mo907s() {
        if (C0145a.m1336F(this.f2899a, this.f2900b, this.f2901c, this.f2902d)) {
            mo897c();
            C0163j.f2764g = true;
            this.f2903e = true;
        }
    }

    /* renamed from: t */
    public void mo908t() {
        this.f2923y = true;
        this.f2911m++;
        int i = this.f2915q;
        if (i > 0) {
            int i2 = i - 1;
            this.f2915q = i2;
            if (i2 == 0) {
                if (this.f2918t == 1 && this.f2914p != f2894E) {
                    this.f2918t = 0;
                }
                this.f2914p = -1984;
                m1614q();
            }
        }
        int i3 = this.f2916r;
        if (i3 > 0) {
            this.f2916r = i3 - 1;
        }
        if (C0145a.f2582F && C0145a.f2580E) {
            this.f2903e = false;
            if (f2897H != C0145a.f2600O && C0145a.m1336F(this.f2899a, this.f2900b, this.f2901c, this.f2902d)) {
                mo907s();
                f2897H = C0145a.f2600O;
            }
        }
    }
}
