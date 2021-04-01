package p013g;

/* renamed from: g.i0 */
public class C0123i0 {

    /* renamed from: a */
    public static int f1811a;

    /* renamed from: b */
    public static long f1812b;

    /* renamed from: c */
    public static boolean f1813c;

    /* renamed from: a */
    public static void m847a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f1813c && currentTimeMillis > f1812b) {
            f1813c = false;
            try {
                if (f1811a > 0) {
                    C0126k.m893c0().mo530m(f1811a, (Object) null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
