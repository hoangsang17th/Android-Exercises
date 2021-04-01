package p011e;

import p013g.C0117f0;
import p018i.C0145a;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: e.n0 */
public class C0077n0 {

    /* renamed from: a */
    public C0085r0 f948a;

    /* renamed from: b */
    public short f949b;

    /* renamed from: c */
    public int f950c;

    /* renamed from: d */
    public long f951d;

    /* renamed from: e */
    public int f952e;

    /* renamed from: f */
    public long f953f;

    /* renamed from: g */
    public int f954g;

    /* renamed from: h */
    public int f955h;

    /* renamed from: i */
    public int f956i;

    /* renamed from: j */
    public int f957j;

    /* renamed from: k */
    public boolean f958k = false;

    /* renamed from: l */
    public short f959l;

    /* renamed from: m */
    public String f960m;

    /* renamed from: n */
    public short f961n;

    /* renamed from: a */
    public void mo173a(int i, int i2, C0159f fVar) {
        C0174j.m1555c(fVar, this.f948a.f1022f, i, i2, 0, C0117f0.f1680f);
        long currentTimeMillis = System.currentTimeMillis() - this.f953f;
        if (currentTimeMillis < ((long) this.f952e)) {
            fVar.mo772D(2721889);
            if (this.f958k && C0145a.f2600O % 6 > 2) {
                fVar.mo772D(876862);
            }
            int i3 = (int) ((currentTimeMillis * 20) / ((long) this.f952e));
            fVar.mo783l(i - 10, (i2 - 10) + i3, 20, 20 - i3);
            return;
        }
        this.f958k = false;
    }
}
