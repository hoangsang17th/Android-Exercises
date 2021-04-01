package p013g;

import p001b.C0020p;
import p011e.C0074m;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: g.z */
public class C0141z {

    /* renamed from: a */
    public short f2545a;

    /* renamed from: b */
    public int f2546b;

    /* renamed from: c */
    public int f2547c = C0111c0.m587n(0, 3);

    /* renamed from: d */
    public int f2548d;

    /* renamed from: e */
    public int f2549e;

    /* renamed from: f */
    public int f2550f;

    /* renamed from: g */
    public int f2551g;

    /* renamed from: h */
    public int f2552h;

    /* renamed from: i */
    public int f2553i;

    /* renamed from: j */
    public int f2554j;

    /* renamed from: k */
    public int f2555k;

    /* renamed from: l */
    public int f2556l = -1;

    /* renamed from: m */
    public int f2557m = 0;

    /* renamed from: n */
    public int f2558n = 0;

    /* renamed from: o */
    int[] f2559o = {0, 1, 2, 1};

    /* renamed from: p */
    int f2560p;

    public C0141z() {
        new C0074m();
    }

    /* renamed from: a */
    public void mo691a(int i, int[] iArr, int i2, int i3) {
        if (i >= 1) {
            this.f2556l = i;
            this.f2559o = iArr;
            this.f2557m = i2;
            this.f2558n = i3;
        }
    }

    /* renamed from: b */
    public void mo692b() {
        int i = this.f2549e;
        int i2 = this.f2548d;
        if (i != i2) {
            int i3 = (i2 - i) << 2;
            this.f2551g = i3;
            int i4 = this.f2550f + i3;
            this.f2550f = i4;
            this.f2549e = i + (i4 >> 4);
            this.f2550f = i4 & 15;
        }
        int i5 = this.f2553i;
        int i6 = this.f2552h;
        if (i5 != i6) {
            int i7 = (i6 - i5) << 2;
            this.f2555k = i7;
            int i8 = this.f2554j + i7;
            this.f2554j = i8;
            this.f2553i = i5 + (i8 >> 4);
            this.f2554j = i8 & 15;
        }
    }

    /* renamed from: c */
    public void mo693c(C0159f fVar) {
        int i;
        int i2;
        int i3 = C0145a.f2600O % 10 > 5 ? 1 : 0;
        if (this.f2556l > 0) {
            int i4 = this.f2557m;
            i = this.f2558n;
            i2 = i4;
            i3 = 0;
        } else {
            i2 = 32;
            i = 32;
        }
        C0174j.m1556d(fVar, this.f2545a, this.f2547c, this.f2553i, this.f2549e + 3 + i3, i2, i, this.f2546b == 1 ? 0 : 2, C0117f0.f1680f);
    }

    /* renamed from: d */
    public void mo694d() {
        C0020p.m96c(60, this.f2553i, this.f2549e + 3 + (C0145a.f2600O % 10 > 5 ? 1 : 0), 1);
    }

    /* renamed from: e */
    public void mo695e() {
        mo692b();
        if (C0145a.f2600O % 3 == 0) {
            int[] iArr = this.f2559o;
            int i = this.f2560p;
            this.f2547c = iArr[i];
            this.f2560p = i + 1;
        }
        if (this.f2560p >= this.f2559o.length) {
            this.f2560p = 0;
        }
    }
}
