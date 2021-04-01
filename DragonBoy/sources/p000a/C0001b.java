package p000a;

import p012f.C0105d;
import p020k.C0172h;
import p020k.C0173i;

/* renamed from: a.b */
public class C0001b {

    /* renamed from: f */
    public static C0173i f11f = new C0173i("vClanImage");

    /* renamed from: g */
    public static C0172h f12g = new C0172h("h id images");

    /* renamed from: a */
    public int f13a;

    /* renamed from: b */
    public String f14b;

    /* renamed from: c */
    public short[] f15c;

    /* renamed from: d */
    public int f16d;

    /* renamed from: e */
    public int f17e;

    /* renamed from: a */
    public static void m0a(C0001b bVar) {
        C0105d.m365M().mo311w((byte) bVar.f13a);
        f11f.addElement(bVar);
    }

    /* renamed from: b */
    public static C0001b m1b(byte b) {
        for (int i = 0; i < f11f.size(); i++) {
            C0001b bVar = (C0001b) f11f.elementAt(i);
            if (bVar.f13a == b) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m2c(int i) {
        for (int i2 = 0; i2 < f11f.size(); i2++) {
            if (((C0001b) f11f.elementAt(i2)).f13a == i) {
                return true;
            }
        }
        return false;
    }
}
