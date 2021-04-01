package p019j;

import java.util.Vector;

/* renamed from: j.i */
public class C0162i {

    /* renamed from: a */
    private Vector f2760a = new Vector();

    /* renamed from: a */
    public void mo797a(Object obj) {
        this.f2760a.addElement(obj);
    }

    /* renamed from: b */
    public Object mo798b(int i) {
        if (i <= -1 || i >= this.f2760a.size()) {
            return null;
        }
        return this.f2760a.elementAt(i);
    }

    /* renamed from: c */
    public void mo799c() {
        this.f2760a.removeAllElements();
    }

    /* renamed from: d */
    public int mo800d() {
        Vector vector = this.f2760a;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }
}
