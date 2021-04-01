package p011e;

import p020k.C0172h;

/* renamed from: e.s0 */
public class C0087s0 {

    /* renamed from: a */
    public static C0172h f1035a = new C0172h("VSKILL");

    /* renamed from: a */
    public static void m302a(C0077n0 n0Var) {
        f1035a.put(new Short(n0Var.f949b), n0Var);
    }

    /* renamed from: b */
    public static C0077n0 m303b(short s) {
        return (C0077n0) f1035a.get(new Short(s));
    }
}
