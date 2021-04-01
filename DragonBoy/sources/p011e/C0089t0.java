package p011e;

import p013g.C0114e;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: e.t0 */
public class C0089t0 {

    /* renamed from: a */
    public C0143b f1037a;

    /* renamed from: b */
    public int f1038b;

    /* renamed from: c */
    public int f1039c = 0;

    /* renamed from: d */
    public int f1040d = 0;

    public C0089t0(C0143b bVar, int i) {
        this.f1037a = bVar;
        this.f1038b = i;
    }

    /* renamed from: a */
    public void mo188a(C0159f fVar, int i, int i2, int i3, int i4) {
        mo191d(fVar, i, i2, i3, i4, false);
    }

    /* renamed from: b */
    public void mo189b(C0159f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        mo190c(fVar, i, i2, i3, i4, i5, i6, i7, false);
    }

    /* renamed from: c */
    public void mo190c(C0159f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        if (C0159f.m1451u(this.f1037a) != 1) {
            fVar.mo780i(this.f1037a, 0, i2 * i5, i5, i6, i, i3, i4, i7, z);
            if (C0145a.f2600O % 1000 == 0) {
                int i8 = this.f1039c + 1;
                this.f1039c = i8;
                this.f1040d = i8;
            }
        }
    }

    /* renamed from: d */
    public void mo191d(C0159f fVar, int i, int i2, int i3, int i4, boolean z) {
        C0143b bVar = this.f1037a;
        fVar.mo780i(bVar, 0, 0, C0159f.m1451u(bVar), C0159f.m1450t(this.f1037a), i, i2, i3, i4, z);
        if (C0145a.f2600O % 1000 == 0) {
            int i5 = this.f1039c + 1;
            this.f1039c = i5;
            this.f1040d = i5;
        }
    }

    /* renamed from: e */
    public void mo192e() {
        int i = this.f1040d + 1;
        this.f1040d = i;
        if (i - this.f1039c > 1 && !C0114e.m647e0().mo396O(this.f1038b)) {
            C0174j.f2850c[this.f1038b] = null;
        }
    }
}
