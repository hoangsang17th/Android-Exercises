package p001b;

import p019j.C0159f;
import p020k.C0173i;

/* renamed from: b.c */
public class C0007c {

    /* renamed from: a */
    public static C0173i f122a = new C0173i("vEff");

    /* renamed from: a */
    public static void m43a(C0009e eVar) {
        f122a.addElement(eVar);
    }

    /* renamed from: b */
    public static C0009e m44b(int i) {
        for (int i2 = 0; i2 < f122a.size(); i2++) {
            C0009e eVar = (C0009e) f122a.elementAt(i2);
            if (eVar.f132a == i) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m45c(C0159f fVar, int i, int i2, int i3) {
        for (int i4 = 0; i4 < f122a.size(); i4++) {
            if (((C0009e) f122a.elementAt(i4)).f145n == (-i3)) {
                ((C0009e) f122a.elementAt(i4)).mo20g(fVar, i, i2);
            }
        }
    }

    /* renamed from: d */
    public static void m46d(C0159f fVar) {
        for (int i = 0; i < f122a.size(); i++) {
            if (((C0009e) f122a.elementAt(i)).f145n == 1) {
                ((C0009e) f122a.elementAt(i)).mo19f(fVar);
            }
        }
    }

    /* renamed from: e */
    public static void m47e(C0159f fVar) {
        for (int i = 0; i < f122a.size(); i++) {
            if (((C0009e) f122a.elementAt(i)).f145n == 2) {
                ((C0009e) f122a.elementAt(i)).mo19f(fVar);
            }
        }
    }

    /* renamed from: f */
    public static void m48f(C0159f fVar) {
        for (int i = 0; i < f122a.size(); i++) {
            if (((C0009e) f122a.elementAt(i)).f145n == 3) {
                ((C0009e) f122a.elementAt(i)).mo19f(fVar);
            }
        }
    }

    /* renamed from: g */
    public static void m49g(C0159f fVar) {
        for (int i = 0; i < f122a.size(); i++) {
            if (((C0009e) f122a.elementAt(i)).f145n == 4) {
                ((C0009e) f122a.elementAt(i)).mo19f(fVar);
            }
        }
    }

    /* renamed from: h */
    public static void m50h(int i) {
        if (m44b(i) != null) {
            f122a.removeElement(m44b(i));
        }
    }

    /* renamed from: i */
    public static void m51i() {
        for (int i = 0; i < f122a.size(); i++) {
            ((C0009e) f122a.elementAt(i)).mo21i();
        }
    }
}
