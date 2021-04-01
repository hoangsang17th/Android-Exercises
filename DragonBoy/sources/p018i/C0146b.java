package p018i;

import android.content.Context;
import android.os.Build;
import p012f.C0103b;
import p013g.C0115e0;
import p014h.p015a.p017b.C0144a;
import p019j.C0150c;
import p019j.C0157e;

/* renamed from: i.b */
public class C0146b extends C0144a {

    /* renamed from: a */
    public static String f2673a = "112.213.94.23";

    /* renamed from: b */
    public static int f2674b = 14445;

    /* renamed from: c */
    public static String f2675c;

    /* renamed from: d */
    public static int f2676d;

    /* renamed from: e */
    public static C0145a f2677e;

    /* renamed from: f */
    public static C0146b f2678f;

    public C0146b() {
        f2678f = this;
    }

    /* renamed from: f */
    public static boolean m1385f() {
        return Build.VERSION.SDK_INT > 26;
    }

    /* renamed from: c */
    public void mo736c() {
        C0157e.f2738g = false;
        System.gc();
        mo720a();
    }

    /* renamed from: d */
    public void mo737d(Context context) {
        f2677e = new C0145a(context);
        mo738e();
    }

    /* renamed from: e */
    public void mo738e() {
        f2677e.mo759i();
        C0150c.m1414n().mo747r(C0103b.m340j());
        C0150c.m1415o().mo747r(C0103b.m340j());
        C0150c.m1415o().f2721r = false;
        C0115e0.m775k();
        C0145a.f2625c0 = new C0115e0();
    }
}
