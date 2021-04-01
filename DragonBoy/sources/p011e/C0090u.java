package p011e;

import p013g.C0114e;
import p013g.C0126k;
import p019j.C0159f;
import p020k.C0174j;
import p020k.C0177m;

/* renamed from: e.u */
public class C0090u {

    /* renamed from: a */
    public short f1041a;

    /* renamed from: b */
    public int f1042b = 0;

    /* renamed from: c */
    public int f1043c;

    /* renamed from: d */
    long f1044d;

    /* renamed from: e */
    long f1045e;

    /* renamed from: f */
    boolean f1046f;

    /* renamed from: g */
    boolean f1047g;

    /* renamed from: h */
    String f1048h;

    public C0090u() {
    }

    public C0090u(short s, int i) {
        this.f1041a = s;
        this.f1043c = i / 60;
        this.f1042b = i % 60;
        long currentTimeMillis = System.currentTimeMillis();
        this.f1045e = currentTimeMillis;
        this.f1044d = currentTimeMillis;
    }

    /* renamed from: a */
    public static C0090u m311a(int i) {
        for (int i2 = 0; i2 < C0114e.f1377h4.size(); i2++) {
            C0090u uVar = (C0090u) C0114e.f1377h4.elementAt(i2);
            if (uVar.f1041a == i) {
                return uVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0090u m312b(int i) {
        for (int i2 = 0; i2 < C0126k.f2035u4.size(); i2++) {
            C0090u uVar = (C0090u) C0126k.f2035u4.elementAt(i2);
            if (uVar.f1041a == i) {
                return uVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m313e(int i) {
        for (int i2 = 0; i2 < C0114e.f1377h4.size(); i2++) {
            if (((C0090u) C0114e.f1377h4.elementAt(i2)).f1041a == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m314f(int i) {
        for (int i2 = 0; i2 < C0126k.f2035u4.size(); i2++) {
            if (((C0090u) C0126k.f2035u4.elementAt(i2)).f1041a == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo193c(int i, boolean z) {
        this.f1043c = i / 60;
        this.f1042b = i % 60;
        long currentTimeMillis = System.currentTimeMillis();
        this.f1045e = currentTimeMillis;
        this.f1044d = currentTimeMillis;
        this.f1046f = z;
    }

    /* renamed from: d */
    public void mo194d(byte b, String str, int i) {
        if (i == -1) {
            this.f1047g = true;
        } else {
            this.f1047g = false;
        }
        this.f1046f = true;
        this.f1043c = i / 60;
        this.f1042b = i % 60;
        this.f1041a = (short) b;
        long currentTimeMillis = System.currentTimeMillis();
        this.f1045e = currentTimeMillis;
        this.f1044d = currentTimeMillis;
        this.f1048h = str;
    }

    /* renamed from: g */
    public void mo195g(C0159f fVar, int i, int i2) {
        C0174j.m1555c(fVar, this.f1041a, i, i2, 0, 3);
        String str = this.f1043c + "'";
        if (this.f1043c == 0) {
            str = this.f1042b + "s";
        }
        C0177m.f2948p.mo910b(fVar, str, i, i2 + 15, 2, C0177m.f2951s);
    }

    /* renamed from: h */
    public void mo196h(C0159f fVar, int i, int i2) {
        String str = this.f1043c + "'";
        if (this.f1043c < 1) {
            str = this.f1042b + "s";
        }
        String str2 = "";
        if (this.f1043c < 0) {
            str = str2;
        }
        if (!this.f1047g) {
            str2 = str;
        }
        C0177m.f2948p.mo910b(fVar, this.f1048h + " " + str2, i, i2, 0, C0177m.f2951s);
    }

    /* renamed from: i */
    public void mo197i() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f1044d = currentTimeMillis;
        if (currentTimeMillis - this.f1045e >= 1000) {
            this.f1045e = System.currentTimeMillis();
            int i = this.f1042b - 1;
            this.f1042b = i;
            if (i <= 0) {
                this.f1042b = 60;
                this.f1043c--;
            }
        }
        if (this.f1043c < 0 && !this.f1046f) {
            C0114e.f1377h4.removeElement(this);
        }
        if (this.f1043c < 0 && this.f1046f && !this.f1047g) {
            C0126k.f2035u4.removeElement(this);
        }
    }
}
