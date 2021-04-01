package p001b;

import p014h.p015a.p016a.C0143b;
import p019j.C0159f;

/* renamed from: b.l */
public class C0016l {

    /* renamed from: a */
    public int f210a;

    /* renamed from: b */
    public int f211b;

    /* renamed from: c */
    public int f212c;

    /* renamed from: d */
    public C0143b f213d;

    public C0016l(C0143b bVar, int i, int i2) {
        if (bVar != null) {
            this.f213d = bVar;
            this.f210a = i;
            this.f211b = i2;
            int e = bVar.mo716e() / i2;
            this.f212c = e;
            if (e < 1) {
                this.f212c = 1;
            }
        }
    }

    /* renamed from: a */
    public void mo35a(int i, int i2, int i3, int i4, int i5, C0159f fVar) {
        try {
            C0143b bVar = this.f213d;
            if (bVar != null) {
                int i6 = this.f212c;
                int i7 = i;
                if (i7 <= i6) {
                    i6 = i7;
                }
                int i8 = this.f211b;
                fVar.mo779h(bVar, 0, i6 * i8, this.f210a, i8, i4, i2, i3, i5);
            }
        } catch (Exception unused) {
        }
    }
}
