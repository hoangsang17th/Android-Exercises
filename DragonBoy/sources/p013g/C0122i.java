package p013g;

import p011e.C0055d;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0178n;

/* renamed from: g.i */
public abstract class C0122i {

    /* renamed from: a */
    public C0055d f1808a;

    /* renamed from: b */
    public C0055d f1809b;

    /* renamed from: c */
    public C0055d f1810c;

    /* renamed from: a */
    public void mo484a(C0159f fVar) {
        fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
        fVar.mo771C(0, 0, C0145a.f2614V, C0145a.f2616W);
        C0145a.f2642l0.mo145e(fVar);
        C0145a.f2642l0.mo141a(fVar, this.f1808a, this.f1809b, this.f1810c);
    }

    /* renamed from: b */
    public void mo485b() {
        C0055d dVar = this.f1809b;
        if (dVar != null && (C0145a.f2574B[5] || C0178n.m1639c(dVar))) {
            C0145a.f2574B[5] = false;
            C0145a.f2580E = false;
            C0178n.f2969g = -1;
            C0145a.f2582F = false;
            C0055d dVar2 = this.f1809b;
            if (dVar2 != null) {
                dVar2.mo139d();
            }
            C0178n.f2969g = -1;
        }
        C0055d dVar3 = this.f1808a;
        if (dVar3 != null && (C0145a.f2574B[12] || C0178n.m1639c(dVar3))) {
            C0145a.f2574B[12] = false;
            C0145a.f2580E = false;
            C0178n.f2969g = -1;
            C0145a.f2582F = false;
            C0055d dVar4 = this.f1808a;
            if (dVar4 != null) {
                dVar4.mo139d();
            }
            C0178n.f2969g = -1;
        }
        C0055d dVar5 = this.f1810c;
        if (dVar5 != null && (C0145a.f2574B[13] || C0178n.m1639c(dVar5))) {
            C0145a.f2574B[13] = false;
            C0145a.f2580E = false;
            C0145a.f2582F = false;
            C0178n.f2969g = -1;
            C0055d dVar6 = this.f1810c;
            if (dVar6 != null) {
                dVar6.mo139d();
            }
            C0178n.f2969g = -1;
        }
        C0145a.m1359n();
        C0145a.m1358m();
    }
}
