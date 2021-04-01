package p001b;

import p018i.C0145a;
import p019j.C0159f;

/* renamed from: b.j */
public class C0014j {

    /* renamed from: a */
    int f191a;

    /* renamed from: b */
    int f192b;

    /* renamed from: c */
    int f193c;

    /* renamed from: d */
    int f194d;

    /* renamed from: e */
    int f195e;

    /* renamed from: f */
    int f196f;

    /* renamed from: g */
    int f197g;

    /* renamed from: h */
    int f198h;

    /* renamed from: i */
    int f199i = 0;

    /* renamed from: j */
    int f200j = 16711680;

    /* renamed from: k */
    float f201k;

    /* renamed from: l */
    long f202l = 0;

    /* renamed from: m */
    long f203m = 150;

    /* renamed from: n */
    boolean f204n = true;

    /* renamed from: o */
    int[] f205o = new int[2];

    /* renamed from: p */
    int[] f206p = new int[2];

    public C0014j(int i, int i2, int i3, int i4, int i5) {
        this.f197g = i2;
        this.f194d = i;
        this.f201k = 1.0f;
        this.f193c = i3;
        this.f198h = i4;
        this.f191a = C0145a.f2614V;
        this.f192b = C0145a.f2616W;
        this.f202l = mo34d();
        for (int i6 = 0; i6 < 2; i6++) {
            this.f205o[i6] = i;
            this.f206p[i6] = i2;
        }
        this.f200j = i5;
    }

    /* renamed from: a */
    public void mo31a(C0159f fVar, int i, int i2, int i3) {
        fVar.mo772D(i3);
        fVar.mo783l(i, i2, 1, 2);
    }

    /* renamed from: b */
    public void mo32b(C0159f fVar) {
        mo31a(fVar, this.f191a - this.f195e, this.f192b - this.f196f, this.f200j);
        for (int i = 0; i < 2; i++) {
            mo31a(fVar, this.f191a - this.f205o[i], this.f192b - this.f206p[i], this.f200j);
        }
        if (this.f204n) {
            mo33c();
        }
    }

    /* renamed from: c */
    public void mo33c() {
        if (mo34d() - this.f202l >= this.f203m) {
            this.f199i++;
            this.f202l = mo34d();
            int[] iArr = this.f205o;
            iArr[1] = iArr[0];
            int[] iArr2 = this.f206p;
            iArr2[1] = iArr2[0];
            iArr[0] = this.f195e;
            iArr2[0] = this.f196f;
            double d = (double) this.f198h;
            Double.isNaN(d);
            double cos = Math.cos((d * 3.141592653589793d) / 180.0d);
            int i = this.f193c;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = cos * d2;
            double d4 = (double) this.f199i;
            Double.isNaN(d4);
            this.f195e = ((int) (d3 * d4)) + this.f194d;
            double d5 = (double) i;
            double d6 = (double) this.f198h;
            Double.isNaN(d6);
            double sin = Math.sin((d6 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d5);
            double d7 = d5 * sin;
            int i2 = this.f199i;
            double d8 = (double) i2;
            Double.isNaN(d8);
            double d9 = (double) (((this.f201k * ((float) i2)) * ((float) i2)) / 2.0f);
            Double.isNaN(d9);
            this.f196f = ((int) ((d7 * d8) - d9)) + this.f197g;
        }
    }

    /* renamed from: d */
    public long mo34d() {
        return System.currentTimeMillis();
    }
}
