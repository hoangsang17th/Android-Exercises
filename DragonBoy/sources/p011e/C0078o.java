package p011e;

import p001b.C0020p;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0128m;
import p013g.C0137v;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0174j;

/* renamed from: e.o */
public class C0078o implements C0128m {

    /* renamed from: w */
    public static C0143b f962w = C0161h.m1494l("/mainImage/myTexture2dflare.png");

    /* renamed from: x */
    public static C0143b f963x = C0161h.m1494l("/mainImage/myTexture2ditemaura1.png");

    /* renamed from: y */
    public static C0143b f964y = C0161h.m1494l("/mainImage/myTexture2ditemaura2.png");

    /* renamed from: z */
    public static C0143b f965z = C0161h.m1494l("/mainImage/myTexture2ditemaura3.png");

    /* renamed from: a */
    public int f966a;

    /* renamed from: b */
    public int f967b;

    /* renamed from: c */
    public int f968c;

    /* renamed from: d */
    public int f969d;

    /* renamed from: e */
    public int f970e;

    /* renamed from: f */
    public int f971f;

    /* renamed from: g */
    public int f972g;

    /* renamed from: h */
    public int f973h;

    /* renamed from: i */
    public C0086s f974i;

    /* renamed from: j */
    public byte f975j;

    /* renamed from: k */
    public int f976k;

    /* renamed from: l */
    public int f977l;

    /* renamed from: m */
    public int f978m;

    /* renamed from: n */
    public int f979n;

    /* renamed from: o */
    public int f980o;

    /* renamed from: p */
    public int f981p;

    /* renamed from: q */
    public int[] f982q;

    /* renamed from: r */
    public int[] f983r;

    /* renamed from: s */
    public int[] f984s;

    /* renamed from: t */
    public int[] f985t;

    /* renamed from: u */
    public int f986u;

    /* renamed from: v */
    public int f987v;

    public C0078o(int i, short s, short s2, int i2, int i3, short s3) {
        this.f973h = s;
        this.f974i = C0088t.m305b(s2);
        this.f968c = i2;
        this.f966a = i2;
        this.f969d = i3;
        this.f967b = i3;
        this.f975j = 1;
        this.f972g = i;
        if (m283e()) {
            this.f976k = s3;
            m285j();
        }
    }

    public C0078o(short s, short s2, int i, int i2, int i3, int i4) {
        this.f973h = s;
        this.f974i = C0088t.m305b(s2);
        this.f966a = i3;
        this.f967b = i2;
        this.f968c = i3;
        this.f969d = i4;
        this.f970e = (i3 - i) >> 2;
        this.f971f = 5;
    }

    /* renamed from: e */
    private boolean m283e() {
        return this.f974i.f1027b == 22;
    }

    /* renamed from: i */
    private void m284i(C0159f fVar) {
        if (!C0145a.m1339K()) {
            for (int i = 0; i < this.f983r.length; i++) {
                if (this.f986u == i) {
                    if (this.f987v <= 20) {
                        fVar.mo776e(f965z, this.f984s[i], this.f985t[i] + 3, 33);
                    } else {
                        C0174j.m1555c(fVar, this.f974i.f1031f, this.f984s[i], this.f985t[i] + 3, 0, 33);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private void m285j() {
        this.f977l = this.f966a;
        this.f978m = this.f967b;
        this.f981p = 120;
        this.f979n = 0;
        if (!C0145a.m1339K()) {
            int i = this.f981p;
            this.f980o = 360 / i;
            this.f982q = new int[i];
            this.f983r = new int[i];
            this.f984s = new int[i];
            this.f985t = new int[i];
            m286k();
        }
    }

    /* renamed from: k */
    private void m286k() {
        if (!C0145a.m1339K()) {
            int i = 0;
            while (true) {
                int[] iArr = this.f983r;
                if (i < iArr.length) {
                    iArr[i] = C0111c0.m574a((this.f976k * C0111c0.m589p(this.f979n)) / 1024);
                    this.f982q[i] = C0111c0.m574a((this.f976k * C0111c0.m578e(this.f979n)) / 1024);
                    int i2 = this.f979n;
                    if (i2 < 90) {
                        this.f984s[i] = this.f977l + this.f982q[i];
                        this.f985t[i] = this.f978m - this.f983r[i];
                    } else if (i2 >= 90 && i2 < 180) {
                        this.f984s[i] = this.f977l - this.f982q[i];
                        this.f985t[i] = this.f978m - this.f983r[i];
                    } else if (i2 < 180 || i2 >= 270) {
                        this.f984s[i] = this.f977l + this.f982q[i];
                        this.f985t[i] = this.f978m + this.f983r[i];
                    } else {
                        this.f984s[i] = this.f977l - this.f982q[i];
                        this.f985t[i] = this.f978m + this.f983r[i];
                    }
                    this.f979n = i2 + this.f980o;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    private void m287n() {
        int i = this.f986u + 1;
        this.f986u = i;
        int i2 = this.f987v + 1;
        this.f987v = i2;
        if (i2 >= 40) {
            this.f987v = 0;
        }
        if (i >= this.f981p) {
            this.f986u = 0;
        }
        if (this.f986u % 10 == 0 && !C0145a.m1339K()) {
            C0020p.m96c(114, this.f966a - 5, this.f967b - 30, 1);
        }
    }

    /* renamed from: a */
    public int mo174a() {
        return 20;
    }

    /* renamed from: b */
    public void mo175b() {
    }

    /* renamed from: c */
    public int mo176c() {
        return this.f966a;
    }

    /* renamed from: d */
    public boolean mo177d() {
        return false;
    }

    /* renamed from: f */
    public int mo178f() {
        return 20;
    }

    /* renamed from: g */
    public int mo179g() {
        return this.f967b;
    }

    /* renamed from: h */
    public void mo180h(C0159f fVar) {
        int i;
        int i2;
        short s;
        if (m283e()) {
            fVar.mo776e(C0121h0.f1770I, this.f966a + 3, this.f967b, 3);
            byte b = this.f975j;
            if (b <= 0) {
                fVar.mo776e(this.f987v < 10 ? f963x : f964y, this.f966a, this.f967b + b + 3, 33);
            } else {
                fVar.mo776e(this.f987v < 10 ? f963x : f964y, this.f966a, this.f967b + 3, 33);
            }
            m284i(fVar);
        } else if (!m283e()) {
            if (C0145a.f2600O % 4 == 0) {
                fVar.mo776e(f962w, this.f966a, this.f967b + this.f975j + 13, 33);
            }
            byte b2 = this.f975j;
            if (b2 <= 0) {
                s = this.f974i.f1031f;
                i2 = this.f966a;
                i = this.f967b + b2 + 3;
            } else {
                s = this.f974i.f1031f;
                i2 = this.f966a;
                i = this.f967b + 3;
            }
            C0174j.m1555c(fVar, s, i2, i, 0, 33);
            if (C0114e.m647e0().f1477Q0 != null && C0114e.m647e0().f1477Q0.equals(this) && this.f975j != 2) {
                fVar.mo779h(C0137v.f2268p0, 0, 24, 9, 6, 0, this.f966a, this.f967b - 17, 3);
            }
        }
    }

    /* renamed from: l */
    public void mo181l(int i, int i2) {
        this.f968c = i;
        this.f969d = i2;
        this.f970e = (i - this.f966a) >> 2;
        this.f971f = (i2 - this.f967b) >> 2;
        this.f975j = 2;
    }

    /* renamed from: m */
    public void mo182m() {
        byte b = this.f975j;
        if (b == 2 && this.f966a == this.f968c && this.f967b == this.f969d) {
            C0126k.f1912T1.removeElement(this);
            if (C0114e.m647e0().f1477Q0 != null && C0114e.m647e0().f1477Q0.equals(this)) {
                C0114e.m647e0().f1477Q0 = null;
                return;
            }
            return;
        }
        if (b > 0) {
            int i = this.f970e;
            if (i == 0) {
                this.f966a = this.f968c;
            }
            int i2 = this.f971f;
            if (i2 == 0) {
                this.f967b = this.f969d;
            }
            int i3 = this.f966a;
            int i4 = this.f968c;
            if (i3 != i4) {
                int i5 = i3 + i;
                this.f966a = i5;
                if ((i > 0 && i5 > i4) || (i < 0 && i5 < i4)) {
                    this.f966a = i4;
                }
            }
            int i6 = this.f967b;
            int i7 = this.f969d;
            if (i6 != i7) {
                int i8 = i6 + i2;
                this.f967b = i8;
                if ((i2 > 0 && i8 > i7) || (i2 < 0 && i8 < i7)) {
                    this.f967b = i7;
                }
            }
        } else {
            byte b2 = (byte) (b - 4);
            this.f975j = b2;
            if (b2 < -12) {
                this.f967b -= 12;
                this.f975j = 1;
            }
        }
        if (m283e()) {
            m287n();
        }
    }
}
