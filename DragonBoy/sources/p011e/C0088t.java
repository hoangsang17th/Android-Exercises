package p011e;

import p020k.C0172h;

/* renamed from: e.t */
public class C0088t {

    /* renamed from: a */
    public static C0172h f1036a = new C0172h("item template");

    /* renamed from: a */
    public static void m304a(C0086s sVar) {
        f1036a.put(new Short(sVar.f1026a), sVar);
    }

    /* renamed from: b */
    public static C0086s m305b(short s) {
        return (C0086s) f1036a.get(new Short(s));
    }
}
