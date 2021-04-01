package p011e;

import p018i.C0145a;
import p020k.C0173i;

/* renamed from: e.n */
public class C0076n {

    /* renamed from: A */
    public String f914A = "";

    /* renamed from: B */
    public int f915B;

    /* renamed from: C */
    public byte f916C;

    /* renamed from: D */
    public boolean f917D;

    /* renamed from: E */
    public int f918E = -1;

    /* renamed from: F */
    public int f919F = -1;

    /* renamed from: G */
    public int f920G = -1;

    /* renamed from: H */
    public int f921H = -1;

    /* renamed from: a */
    public C0082q[] f922a;

    /* renamed from: b */
    public C0086s f923b;

    /* renamed from: c */
    public C0173i f924c;

    /* renamed from: d */
    public int f925d;

    /* renamed from: e */
    public int f926e;

    /* renamed from: f */
    public boolean f927f;

    /* renamed from: g */
    public int f928g;

    /* renamed from: h */
    public int f929h;

    /* renamed from: i */
    public int f930i;

    /* renamed from: j */
    public long f931j;

    /* renamed from: k */
    public boolean f932k;

    /* renamed from: l */
    public int f933l;

    /* renamed from: m */
    public int f934m;

    /* renamed from: n */
    public int f935n;

    /* renamed from: o */
    public int f936o;

    /* renamed from: p */
    public int f937p;

    /* renamed from: q */
    public int f938q;

    /* renamed from: r */
    public int f939r;

    /* renamed from: s */
    public int f940s;

    /* renamed from: t */
    public short f941t = -1;

    /* renamed from: u */
    public byte f942u = -1;

    /* renamed from: v */
    public int f943v;

    /* renamed from: w */
    public boolean f944w;

    /* renamed from: x */
    public boolean f945x = false;

    /* renamed from: y */
    public String f946y;

    /* renamed from: z */
    public String f947z;

    /* renamed from: a */
    public C0076n clone() {
        C0076n nVar = new C0076n();
        nVar.f923b = this.f923b;
        if (this.f924c != null) {
            nVar.f924c = new C0173i("item.options");
            for (int i = 0; i < this.f924c.size(); i++) {
                C0082q qVar = new C0082q();
                qVar.f1008c = ((C0082q) this.f924c.elementAt(i)).f1008c;
                qVar.f1006a = ((C0082q) this.f924c.elementAt(i)).f1006a;
                nVar.f924c.addElement(qVar);
            }
        }
        nVar.f925d = this.f925d;
        nVar.f926e = this.f926e;
        nVar.f928g = this.f928g;
        nVar.f929h = this.f929h;
        nVar.f932k = this.f932k;
        nVar.f933l = this.f933l;
        nVar.f934m = this.f934m;
        nVar.f935n = this.f935n;
        nVar.f936o = this.f936o;
        nVar.f937p = this.f937p;
        nVar.f938q = this.f938q;
        nVar.f939r = this.f939r;
        nVar.f943v = this.f943v;
        nVar.f944w = this.f944w;
        return nVar;
    }

    /* renamed from: b */
    public void mo168b() {
        this.f915B = C0145a.f2629e0.mo627Y(this);
    }

    /* renamed from: c */
    public boolean mo169c(int i) {
        int i2 = 0;
        while (true) {
            C0082q[] qVarArr = this.f922a;
            if (i2 >= qVarArr.length) {
                return false;
            }
            C0082q qVar = qVarArr[i2];
            if (qVar != null && qVar.f1008c.f1014a == i) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public boolean mo171d() {
        byte b = this.f923b.f1027b;
        return (b >= 0 && b < 6) || b == 32;
    }

    /* renamed from: e */
    public void mo172e(int i, int i2, int i3, int i4) {
        this.f918E = i;
        this.f919F = i2;
        this.f920G = i3;
        this.f921H = i4;
    }
}
