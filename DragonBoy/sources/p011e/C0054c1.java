package p011e;

import p012f.C0105d;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0130o;
import p018i.C0145a;

/* renamed from: e.c1 */
public class C0054c1 implements C0072l {

    /* renamed from: a */
    public short f387a;

    /* renamed from: b */
    public short f388b;

    /* renamed from: c */
    public short f389c;

    /* renamed from: d */
    public short f390d;

    /* renamed from: e */
    public boolean f391e;

    /* renamed from: f */
    public boolean f392f;

    /* renamed from: g */
    public C0067i0 f393g;

    public C0054c1(short s, short s2, short s3, short s4, boolean z, boolean z2, String str) {
        C0067i0 i0Var;
        short s5;
        this.f387a = s;
        this.f388b = s2;
        this.f389c = s3;
        this.f390d = s4;
        String d = C0111c0.m577d(str);
        this.f391e = z;
        this.f392f = z2;
        int i = C0121h0.f1803v;
        short s6 = 24;
        if ((i != 21 && i != 22 && i != 23) || (s5 = this.f387a) < 0 || s5 > 24) {
            if (((i != 0 || C0114e.m647e0().f1643x == 0) && ((C0121h0.f1803v != 7 || C0114e.m647e0().f1643x == 1) && (C0121h0.f1803v != 14 || C0114e.m647e0().f1643x == 2))) || !z2) {
                if (C0121h0.m825e() || C0121h0.f1803v == 47) {
                    if (s2 <= 150 || !C0121h0.m825e()) {
                        C0067i0 i0Var2 = new C0067i0(d, ((s3 - s) / 2) + s, s4 - (s <= 100 ? 48 : s6));
                        this.f393g = i0Var2;
                        i0Var2.f840k = new C0055d((String) null, (C0072l) this, 1, (Object) this);
                    } else {
                        return;
                    }
                } else if (z || z2) {
                    short s7 = 16;
                    if (C0121h0.m827g()) {
                        i0Var = new C0067i0(d, s, s2 - 16);
                    } else {
                        i0Var = new C0067i0(d, s + ((s3 - s) / 2), s2 - (s2 == 0 ? -32 : s7));
                    }
                    this.f393g = i0Var;
                    this.f393g.f840k = new C0055d((String) null, (C0072l) this, 2, (Object) this);
                } else {
                    C0067i0 i0Var3 = new C0067i0(d, s, s2 - 24);
                    this.f393g = i0Var3;
                    i0Var3.f840k = new C0055d((String) null, (C0072l) this, 1, (Object) this);
                }
                C0067i0 i0Var4 = this.f393g;
                i0Var4.f837h = true;
                i0Var4.f841l = false;
                C0067i0.m240a(i0Var4);
                C0121h0.f1766E.addElement(this);
            }
        }
    }

    /* renamed from: e */
    public void mo3e(int i, Object obj) {
        int i2 = -1;
        if (i == 1) {
            int i3 = (this.f387a + this.f389c) / 2;
            int i4 = this.f390d;
            short s = this.f388b;
            if (i4 > s + 24) {
                i4 = (s + i4) / 2;
            }
            C0126k.m893c0().f2098V = 0;
            C0114e.m647e0().f1541c2 = new C0100z(i3, i4);
            C0114e e0 = C0114e.m647e0();
            if (C0114e.m647e0().f1593n - C0114e.m647e0().f1541c2.f1117a <= 0) {
                i2 = 1;
            }
            e0.f1633v = i2;
            C0105d.m365M().mo297p();
        } else if (i == 2) {
            C0126k.m893c0().f2098V = 0;
            if (C0114e.m647e0().mo401R() != null) {
                C0105d.m365M().mo297p();
                C0130o.m1008d();
                C0105d.m365M().mo251V();
                C0114e.f1392w4 = true;
            } else if (C0114e.m647e0().mo403S() != null) {
                C0105d.m365M().mo297p();
                C0105d.m365M().mo314x0();
                C0114e.f1393x4 = true;
                C0114e.f1392w4 = true;
                C0145a.m1358m();
                C0145a.m1359n();
                C0130o.m1008d();
            } else {
                short s2 = this.f390d;
                C0114e.m647e0().f1541c2 = new C0100z((this.f387a + this.f389c) / 2, s2);
                C0114e e02 = C0114e.m647e0();
                if (C0114e.m647e0().f1593n - C0114e.m647e0().f1541c2.f1117a <= 0) {
                    i2 = 1;
                }
                e02.f1633v = i2;
                C0114e.m647e0().f1619s0 = new C0055d((String) null, (C0072l) this, 2, (Object) null);
            }
        }
    }
}
