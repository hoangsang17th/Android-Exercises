package p001b;

import java.util.Random;
import java.util.Vector;
import p019j.C0159f;

/* renamed from: b.i */
public class C0013i {

    /* renamed from: a */
    Random f188a = new Random();

    /* renamed from: b */
    Vector f189b = new Vector();

    /* renamed from: c */
    int[] f190c = {16711680, 16776960, 65280, 16777215, 255, 65535, 15790320, 12632256};

    public C0013i(int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i;
            int i7 = i2;
            this.f189b.addElement(new C0014j(i6, i7, Math.abs(this.f188a.nextInt() % 8) + 3, i5 * i3, this.f190c[Math.abs(this.f188a.nextInt() % this.f190c.length)]));
        }
    }

    /* renamed from: a */
    public void mo30a(C0159f fVar) {
        for (int i = 0; i < this.f189b.size(); i++) {
            C0014j jVar = (C0014j) this.f189b.elementAt(i);
            if (jVar.f196f < -200) {
                this.f189b.removeElementAt(i);
            }
            jVar.mo32b(fVar);
        }
    }
}
