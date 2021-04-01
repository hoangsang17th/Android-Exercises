package p012f;

import java.io.DataOutputStream;
import java.io.IOException;
import p010d.C0044b;
import p010d.C0045c;
import p011e.C0076n;
import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0121h0;
import p013g.C0126k;
import p013g.C0129n;
import p013g.C0137v;
import p018i.C0145a;
import p019j.C0149b;
import p019j.C0150c;
import p019j.C0157e;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0176l;

/* renamed from: f.d */
public class C0105d {

    /* renamed from: b */
    protected static C0105d f1148b;

    /* renamed from: c */
    public static long f1149c;

    /* renamed from: d */
    public static long f1150d;

    /* renamed from: e */
    public static long f1151e;

    /* renamed from: f */
    public static long f1152f;

    /* renamed from: g */
    public static boolean f1153g;

    /* renamed from: a */
    C0044b f1154a = C0150c.m1414n();

    /* renamed from: M */
    public static C0105d m365M() {
        if (f1148b == null) {
            f1148b = new C0105d();
        }
        return f1148b;
    }

    /* renamed from: m0 */
    public static C0045c m366m0(byte b) {
        C0045c cVar = new C0045c((byte) -30);
        cVar.mo129e().writeByte(b);
        return cVar;
    }

    /* renamed from: A */
    public void mo210A(int i, byte b) {
        C0111c0.m584k("REMOTE CLAN id = " + i + " role= " + b);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -56);
            try {
                cVar2.mo129e().writeInt(i);
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: A0 */
    public void mo211A0(int i) {
        C0111c0.m584k("request magic tree");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -91);
            try {
                cVar2.mo129e().writeByte(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: B */
    public void mo212B(int i) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 41);
            cVar.mo129e().writeInt(i);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: B0 */
    public void mo213B0(int i) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 10);
            cVar.mo129e().writeByte(i);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: C */
    public void mo214C() {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 13);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: C0 */
    public void mo215C0(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 11);
            try {
                cVar2.mo129e().writeByte(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: D */
    public void mo216D(byte b, C0173i iVar) {
        C0111c0.m584k("combine");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -81);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 1) {
                    cVar2.mo129e().writeByte(iVar.size());
                    for (int i = 0; i < iVar.size(); i++) {
                        cVar2.mo129e().writeByte(((C0076n) iVar.elementAt(i)).f928g);
                        C0111c0.m584k("gui id " + ((C0076n) iVar.elementAt(i)).f928g);
                    }
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: D0 */
    public void mo217D0() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -114);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: E */
    public void mo218E(short s, byte b) {
        C0111c0.m584k("confirme menu=" + b + " npc= " + s);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 32);
            try {
                cVar2.mo129e().writeShort(s);
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: E0 */
    public void mo219E0(String str, String str2, String str3, String str4, String str5) {
        C0111c0.m584k("Request Register " + str + " " + str2 + " " + str5);
        try {
            C0045c j0 = mo287j0((byte) 1);
            j0.mo129e().writeUTF(str);
            j0.mo129e().writeUTF(str2);
            if (str3 != null && !str3.equals("")) {
                j0.mo129e().writeUTF(str3);
                j0.mo129e().writeUTF("a");
            }
            this.f1154a.mo124a(j0);
            j0.mo125a();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: F */
    public void mo220F(String str, int i, int i2) {
        C0045c cVar = new C0045c((byte) -28);
        try {
            cVar.mo129e().writeByte(2);
            cVar.mo129e().writeUTF(str);
            cVar.mo129e().writeByte(i);
            cVar.mo129e().writeByte(i2);
            C0111c0.m584k("name= " + str + " gender= " + i + " hair=" + i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f1154a.mo124a(cVar);
    }

    /* renamed from: F0 */
    public void mo221F0() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -15);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: G */
    public void mo222G(C0076n[] nVarArr) {
        C0145a.f2639j0.mo602c();
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 13);
            int i = 0;
            while (i < nVarArr.length) {
                try {
                    if (nVarArr[i] != null) {
                        cVar2.mo129e().writeByte(nVarArr[i].f928g);
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    try {
                        e.printStackTrace();
                        cVar.mo125a();
                    } catch (Throwable th) {
                        th = th;
                        cVar.mo125a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = cVar2;
                    cVar.mo125a();
                    throw th;
                }
            }
            this.f1154a.mo124a(cVar2);
            cVar2.mo125a();
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: G0 */
    public void mo223G0(byte b, byte b2, short s) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 7);
            try {
                cVar2.mo129e().writeByte(b);
                cVar2.mo129e().writeByte(b2);
                cVar2.mo129e().writeShort(s);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: H */
    public void mo224H(byte b, int i) {
        C0111c0.m584k("add friend");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -99);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 1 || b == 2) {
                    cVar2.mo129e().writeInt(i);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: H0 */
    public void mo225H0(String str) {
        C0111c0.m584k("send SEARCH CLAN " + str);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -47);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: I */
    public void mo226I() {
        C0045c cVar;
        Exception e;
        C0111c0.m584k("finishLoadMap");
        try {
            cVar = new C0045c((byte) -39);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: I0 */
    public void mo227I0(int i) {
        C0111c0.m584k(C0114e.m647e0().f1511X + " SELECT SKILL " + i);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 34);
            try {
                cVar2.mo129e().writeShort(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: J */
    public void mo228J() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -38);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: J0 */
    public void mo229J0(String str, String str2) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 16);
            cVar.mo129e().writeUTF(str);
            cVar.mo129e().writeUTF(str2);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: K */
    public void mo230K(byte b, int i) {
        C0111c0.m584k("add friend");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -80);
            try {
                cVar2.mo129e().writeByte(b);
                if (i != -1) {
                    cVar2.mo129e().writeInt(i);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: K0 */
    public void mo231K0() {
        C0045c cVar;
        Throwable th;
        C0045c cVar2 = null;
        try {
            cVar = new C0045c((byte) -120);
            try {
                this.f1154a.mo124a(cVar);
                f1149c = C0161h.m1490h();
                cVar.mo125a();
            } catch (Exception unused) {
                cVar2 = cVar;
                f1149c = C0161h.m1490h();
                cVar2.mo125a();
            } catch (Throwable th2) {
                th = th2;
                f1149c = C0161h.m1490h();
                cVar.mo125a();
                throw th;
            }
        } catch (Exception unused2) {
            f1149c = C0161h.m1490h();
            cVar2.mo125a();
        } catch (Throwable th3) {
            Throwable th4 = th3;
            cVar = null;
            th = th4;
            f1149c = C0161h.m1490h();
            cVar.mo125a();
            throw th;
        }
    }

    /* renamed from: L */
    public void mo232L(byte b) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("FUNSION");
            C0045c cVar2 = new C0045c((byte) 125);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: L0 */
    public void mo233L0() {
        C0045c cVar;
        Throwable th;
        C0045c cVar2 = null;
        try {
            cVar = new C0045c((byte) -121);
            try {
                this.f1154a.mo124a(cVar);
                f1150d = C0161h.m1490h();
                cVar.mo125a();
            } catch (Exception unused) {
                cVar2 = cVar;
                f1150d = C0161h.m1490h();
                cVar2.mo125a();
            } catch (Throwable th2) {
                th = th2;
                f1150d = C0161h.m1490h();
                cVar.mo125a();
                throw th;
            }
        } catch (Exception unused2) {
            f1150d = C0161h.m1490h();
            cVar2.mo125a();
        } catch (Throwable th3) {
            Throwable th4 = th3;
            cVar = null;
            th = th4;
            f1150d = C0161h.m1490h();
            cVar.mo125a();
            throw th;
        }
    }

    /* renamed from: M0 */
    public void mo234M0(C0176l[] lVarArr) {
        C0045c cVar = null;
        try {
            C0111c0.m584k(" gui input ");
            C0045c cVar2 = new C0045c((byte) -125);
            try {
                C0111c0.m584k("byte lent = " + lVarArr.length);
                cVar2.mo129e().writeByte(lVarArr.length);
                for (C0176l f : lVarArr) {
                    cVar2.mo129e().writeUTF(f.mo899f());
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: N */
    public void mo235N(int i) {
        C0111c0.m584k("get ngoc");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -76);
            try {
                cVar2.mo129e().writeByte(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: N0 */
    public void mo236N0(C0173i iVar, C0173i iVar2, int i) {
        try {
            C0111c0.m584k("SEND ATTACT vChar=  " + iVar2.size());
            C0045c cVar = null;
            if (i != 0) {
                int i2 = 0;
                if (iVar.size() > 0 && iVar2.size() > 0) {
                    if (i == 1) {
                        cVar = new C0045c((byte) -4);
                    } else if (i == 2) {
                        cVar = new C0045c((byte) 67);
                    }
                    cVar.mo129e().writeByte(iVar.size());
                    for (int i3 = 0; i3 < iVar.size(); i3++) {
                        cVar.mo129e().writeByte(((C0137v) iVar.elementAt(i3)).f2331y);
                    }
                    while (i2 < iVar2.size()) {
                        C0114e eVar = (C0114e) iVar2.elementAt(i2);
                        if (eVar != null) {
                            cVar.mo129e().writeInt(eVar.f1638w);
                        } else {
                            cVar.mo129e().writeInt(-1);
                        }
                        i2++;
                    }
                } else if (iVar.size() > 0) {
                    C0111c0.m584k("PLAYER ATTACK NPC");
                    cVar = new C0045c((byte) 54);
                    while (i2 < iVar.size()) {
                        C0137v vVar = (C0137v) iVar.elementAt(i2);
                        if (!vVar.f2282N) {
                            cVar.mo129e().writeByte(vVar.f2331y);
                        } else {
                            cVar.mo129e().writeByte(-1);
                            cVar.mo129e().writeInt(vVar.f2331y);
                        }
                        i2++;
                    }
                } else if (iVar2.size() > 0) {
                    C0111c0.m584k("player attack player ");
                    cVar = new C0045c((byte) -60);
                    while (i2 < iVar2.size()) {
                        cVar.mo129e().writeInt(((C0114e) iVar2.elementAt(i2)).f1638w);
                        i2++;
                    }
                }
                if (cVar != null) {
                    this.f1154a.mo124a(cVar);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    public void mo237O(short s) {
        C0111c0.m584k("get image id= " + s);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -32);
            try {
                cVar2.mo129e().writeShort(s);
                this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
                this.f1154a.mo124a(cVar2);
                this.f1154a = C0150c.m1414n();
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: O0 */
    public void mo238O0(byte b, int i, byte[] bArr) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("SERVER DATA");
            C0045c cVar2 = new C0045c((byte) -110);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 1) {
                    cVar2.mo129e().writeInt(i);
                    if (bArr != null) {
                        int length = bArr.length;
                        cVar2.mo129e().writeShort(length);
                        cVar2.mo129e().write(bArr, 0, length);
                    }
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: P */
    public void mo239P(byte b, byte b2, String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -46);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 2 || b == 4) {
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeUTF(str);
                    C0111c0.m584k("SEND SLOGAN= " + str);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: P0 */
    public void mo240P0(int i) {
        C0111c0.m584k("GUI THACH DAUA");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -118);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: Q */
    public void mo241Q(short s) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -66);
            try {
                cVar2.mo129e().writeShort(s);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: Q0 */
    public void mo242Q0(String str, byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -96);
            try {
                cVar2.mo129e().writeUTF(str);
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: R */
    public void mo243R(byte b, byte b2) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -103);
            try {
                cVar2.mo129e().writeByte(b);
                C0111c0.m584k("------------service--  " + b + "   " + b2);
                if (b != 0) {
                    cVar2.mo129e().writeByte(b2);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: R0 */
    public void mo244R0(String str, String str2, String str3) {
        C0045c cVar = new C0045c((byte) 114);
        try {
            cVar.mo129e().writeUTF(str);
            cVar.mo129e().writeUTF(str2);
            cVar.mo129e().writeUTF(str3);
            this.f1154a.mo124a(cVar);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: S */
    public void mo245S(String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 66);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: S0 */
    public void mo246S0() {
        C0111c0.m584k("SET CLIENT TYPE");
        if (C0149b.m1399d("clienttype") != -1) {
            C0161h.f2758f = C0149b.m1399d("clienttype");
        }
        try {
            C0111c0.m584k("setType");
            C0045c j0 = mo287j0((byte) 2);
            j0.mo129e().writeByte(C0161h.f2758f);
            j0.mo129e().writeByte(C0159f.f2750b);
            C0111c0.m584k("gui zoomlevel = " + C0159f.f2750b);
            j0.mo129e().writeBoolean(false);
            j0.mo129e().writeInt(C0145a.f2614V);
            j0.mo129e().writeInt(C0145a.f2616W);
            j0.mo129e().writeBoolean(C0176l.f2892C);
            j0.mo129e().writeBoolean(C0145a.f2659x);
            DataOutputStream e = j0.mo129e();
            e.writeUTF(C0157e.getPlatformName() + "|" + "1.9.3");
            this.f1154a.mo124a(j0);
            j0.mo125a();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: T */
    public void mo247T(byte b, byte b2) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -40);
            try {
                cVar2.mo129e().writeByte(b);
                cVar2.mo129e().writeByte(b2);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: T0 */
    public void mo248T0() {
        C0111c0.m584k("SET CLIENT TYPE");
        if (C0149b.m1399d("clienttype") != -1) {
            C0161h.f2758f = C0149b.m1399d("clienttype");
        }
        try {
            C0111c0.m584k("setType");
            C0045c j0 = mo287j0((byte) 2);
            j0.mo129e().writeByte(C0161h.f2758f);
            j0.mo129e().writeByte(C0159f.f2750b);
            C0111c0.m584k("gui zoomlevel = " + C0159f.f2750b);
            j0.mo129e().writeBoolean(false);
            j0.mo129e().writeInt(C0145a.f2614V);
            j0.mo129e().writeInt(C0145a.f2616W);
            j0.mo129e().writeBoolean(C0176l.f2892C);
            j0.mo129e().writeBoolean(C0145a.f2659x);
            DataOutputStream e = j0.mo129e();
            e.writeUTF(C0157e.getPlatformName() + "|" + "1.9.3");
            C0150c o = C0150c.m1415o();
            this.f1154a = o;
            o.mo124a(j0);
            this.f1154a = C0150c.m1414n();
            j0.mo125a();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: U */
    public void mo249U(byte b) {
        C0111c0.m584k("request magic tree");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -34);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: U0 */
    public void mo250U0(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -104);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: V */
    public void mo251V() {
        C0045c cVar;
        Exception e;
        C0111c0.m584k("send map offline");
        try {
            cVar = new C0045c((byte) -33);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: V0 */
    public void mo252V0(byte b) {
        C0111c0.m584k("Skill not focus so " + b);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -45);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: W */
    public void mo253W(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -79);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: W0 */
    public void mo254W0(byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 112);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: X */
    public void mo255X(byte b, C0173i iVar) {
        C0150c n;
        C0111c0.m584k("request resource action= " + b);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -74);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 2 && iVar != null) {
                    cVar2.mo129e().writeShort(iVar.size());
                    for (int i = 0; i < iVar.size(); i++) {
                        cVar2.mo129e().writeShort(Short.parseShort((String) iVar.elementAt(i)));
                    }
                }
                if (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) {
                    f1153g = true;
                    n = C0150c.m1414n();
                } else {
                    n = C0150c.m1415o();
                }
                this.f1154a = n;
                this.f1154a.mo124a(cVar2);
                this.f1154a = C0150c.m1414n();
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: X0 */
    public void mo256X0(short s, String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 88);
            try {
                cVar2.mo129e().writeShort(s);
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: Y */
    public void mo257Y(byte b, int i, byte b2, int i2) {
        C0111c0.m584k("giao dich action = " + b);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -86);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 0 || b == 1) {
                    cVar2.mo129e().writeInt(i);
                }
                if (b == 2) {
                    C0111c0.m584k("gui len indxe =" + b2 + " num= " + i2);
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeInt(i2);
                }
                if (b == 4) {
                    cVar2.mo129e().writeByte(b2);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: Y0 */
    public void mo258Y0() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -105);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: Z */
    public void mo259Z(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 18);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: Z0 */
    public void mo260Z0(int i, int i2) {
        C0045c cVar = null;
        try {
            cVar = m366m0((byte) 16);
            cVar.mo129e().writeByte(i);
            cVar.mo129e().writeShort(i2);
            C0111c0.m584k("gửi tăng tiềm năng NUM= " + i2 + " type= " + i);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: a */
    public void mo261a(byte b, byte b2) {
        C0045c cVar = new C0045c((byte) -127);
        try {
            cVar.mo129e().writeByte(b);
            if (b2 > 0) {
                cVar.mo129e().writeByte(b2);
            }
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: a0 */
    public void mo262a0(C0173i iVar) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("IMAGE SOURCE size= " + iVar.size());
            C0045c cVar2 = new C0045c((byte) -111);
            try {
                cVar2.mo129e().writeShort(iVar.size());
                if (iVar.size() > 0) {
                    for (int i = 0; i < iVar.size(); i++) {
                        C0111c0.m584k("gui len str " + ((C0129n) iVar.elementAt(i)).f2160b);
                        cVar2.mo129e().writeUTF(((C0129n) iVar.elementAt(i)).f2160b);
                    }
                }
                if (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) {
                    this.f1154a = C0150c.m1414n();
                    f1153g = true;
                } else {
                    this.f1154a = C0150c.m1415o();
                }
                this.f1154a.mo124a(cVar2);
                this.f1154a = C0150c.m1414n();
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: a1 */
    public void mo263a1(byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -41);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: b */
    public void mo264b(int i, int i2) {
        C0045c cVar = new C0045c(Byte.MAX_VALUE);
        try {
            cVar.mo129e().writeByte(i);
            if (i2 != -1) {
                cVar.mo129e().writeShort(i2);
            }
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: b0 */
    public void mo265b0(int i, byte b) {
        C0111c0.m584k("JOIN CLAN " + i);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -49);
            try {
                cVar2.mo129e().writeInt(i);
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: b1 */
    public void mo266b1() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -87);
            try {
                this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
                this.f1154a.mo124a(cVar);
                this.f1154a = C0150c.m1414n();
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            e.printStackTrace();
            cVar.mo125a();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: c */
    public void mo267c(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 37);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: c0 */
    public void mo268c0(byte b, int i, byte b2, int i2, int i3) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("ki gui action= " + b + " item id= " + i);
            C0045c cVar2 = new C0045c((byte) -100);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 0) {
                    cVar2.mo129e().writeShort(i);
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeInt(i2);
                    cVar2.mo129e().writeByte((byte) i3);
                    C0111c0.m584k("ki gui so luong " + i3);
                }
                if (b == 1 || b == 2) {
                    cVar2.mo129e().writeShort(i);
                }
                if (b == 3) {
                    cVar2.mo129e().writeShort(i);
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeInt(i2);
                }
                if (b == 4) {
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeByte(i2);
                    C0111c0.m584k("currTab= " + b2 + " page= " + i2);
                }
                if (b == 5) {
                    cVar2.mo129e().writeShort(i);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: c1 */
    public void mo269c1() {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 8);
            this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
            this.f1154a.mo124a(cVar);
            this.f1154a = C0150c.m1414n();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: d */
    public void mo270d(String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 17);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: d0 */
    public void mo271d0() {
        C0045c cVar;
        Exception e;
        C0111c0.m584k("LEAVE CLAN");
        try {
            cVar = new C0045c((byte) -55);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: d1 */
    public void mo272d1() {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 6);
            this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
            this.f1154a.mo124a(cVar);
            this.f1154a = C0150c.m1414n();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: e */
    public void mo273e(int i) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 37);
            cVar.mo129e().writeInt(i);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: e0 */
    public void mo274e0(String str, String str2, String str3, byte b) {
        C0111c0.m584k("Login " + str + " " + str2 + " " + str3);
        try {
            C0045c j0 = mo287j0((byte) 0);
            j0.mo129e().writeUTF(str);
            j0.mo129e().writeUTF(str2);
            j0.mo129e().writeUTF(str3);
            j0.mo129e().writeByte(b);
            this.f1154a.mo124a(j0);
            j0.mo125a();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e1 */
    public void mo275e1() {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 7);
            this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
            this.f1154a.mo124a(cVar);
            this.f1154a = C0150c.m1414n();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: f */
    public void mo276f(String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 53);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: f0 */
    public void mo277f0(String str) {
        C0111c0.m584k("Login 2");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -101);
            try {
                cVar2.mo129e().writeUTF(str);
                cVar2.mo129e().writeByte(1);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: f1 */
    public void mo278f1(byte b, byte b2, byte b3, short s) {
        if (C0114e.m647e0().f1628u != 14) {
            C0045c cVar = null;
            try {
                C0045c cVar2 = new C0045c((byte) -43);
                try {
                    cVar2.mo129e().writeByte(b);
                    cVar2.mo129e().writeByte(b2);
                    cVar2.mo129e().writeByte(b3);
                    if (b3 == -1) {
                        cVar2.mo129e().writeShort(s);
                    }
                    this.f1154a.mo124a(cVar2);
                    cVar2.mo125a();
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    try {
                        e.printStackTrace();
                        cVar.mo125a();
                    } catch (Throwable th) {
                        th = th;
                        cVar.mo125a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = cVar2;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                cVar.mo125a();
            }
        }
    }

    /* renamed from: g */
    public void mo279g(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 76);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: g0 */
    public void mo280g0(byte b) {
        C0045c cVar = new C0045c((byte) -34);
        try {
            cVar.mo129e().writeByte(b);
            this.f1154a.mo124a(cVar);
            cVar.mo125a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: g1 */
    public void mo281g1() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -16);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: h */
    public void mo282h(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 77);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: h0 */
    public void mo283h0(int i, int i2, int i3) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 22);
            try {
                cVar2.mo129e().writeByte(i);
                cVar2.mo129e().writeByte(i2);
                cVar2.mo129e().writeByte(i3);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: i */
    public void mo284i() {
        C0045c cVar;
        Exception e;
        if (C0161h.f2757e != null) {
            try {
                cVar = new C0045c((byte) 126);
                try {
                    cVar.mo129e().writeUTF(C0161h.f2757e);
                    this.f1154a.mo124a(cVar);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                Exception exc = e3;
                cVar = null;
                e = exc;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                cVar = null;
                th = th3;
                cVar.mo125a();
                throw th;
            }
            cVar.mo125a();
        }
    }

    /* renamed from: i0 */
    public void mo285i0(short s) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 27);
            try {
                cVar2.mo129e().writeShort(s);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: j */
    public void mo286j() {
        C0045c cVar;
        Exception e;
        if (C0161h.f2757e != null) {
            try {
                cVar = new C0045c((byte) 126);
                try {
                    cVar.mo129e().writeUTF(C0161h.f2757e);
                    this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
                    this.f1154a.mo124a(cVar);
                    this.f1154a = C0150c.m1414n();
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        cVar.mo125a();
                    } catch (Throwable th) {
                        th = th;
                        cVar.mo125a();
                        throw th;
                    }
                }
            } catch (Exception e3) {
                Exception exc = e3;
                cVar = null;
                e = exc;
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                cVar = null;
                th = th3;
                cVar.mo125a();
                throw th;
            }
            cVar.mo125a();
        }
    }

    /* renamed from: j0 */
    public C0045c mo287j0(byte b) {
        C0045c cVar = new C0045c((byte) -29);
        cVar.mo129e().writeByte(b);
        return cVar;
    }

    /* renamed from: k */
    public void mo288k(byte b, int i, int i2) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 6);
            try {
                cVar2.mo129e().writeByte(b);
                cVar2.mo129e().writeShort(i);
                if (i2 > 1) {
                    cVar2.mo129e().writeShort(i2);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: k0 */
    public C0045c mo289k0(byte b) {
        C0045c cVar = new C0045c((byte) -28);
        cVar.mo129e().writeByte(b);
        return cVar;
    }

    /* renamed from: l */
    public void mo290l() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) 50);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: l0 */
    public void mo291l0(int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -30);
            try {
                cVar2.mo129e().writeByte(63);
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: m */
    public void mo292m(String str, int i) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 18);
            cVar.mo129e().writeInt(i);
            cVar.mo129e().writeUTF(str);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: n */
    public void mo293n(byte[] bArr) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -113);
            int i = 0;
            while (i < 5) {
                try {
                    cVar2.mo129e().writeByte(bArr[i]);
                    i++;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    try {
                        e.printStackTrace();
                        cVar.mo125a();
                    } catch (Throwable th) {
                        th = th;
                        cVar.mo125a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = cVar2;
                    cVar.mo125a();
                    throw th;
                }
            }
            this.f1154a.mo124a(cVar2);
            cVar2.mo125a();
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: n0 */
    public void mo294n0(char c) {
        C0111c0.m584k("cap char c= " + c);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -85);
            try {
                cVar2.mo129e().writeChar(c);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: o */
    public void mo295o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 42);
            try {
                cVar2.mo129e().writeUTF(str);
                cVar2.mo129e().writeUTF(str2);
                cVar2.mo129e().writeUTF(str3);
                cVar2.mo129e().writeUTF(str4);
                cVar2.mo129e().writeUTF(str5);
                cVar2.mo129e().writeUTF(str6);
                cVar2.mo129e().writeUTF(str7);
                cVar2.mo129e().writeUTF(str8);
                cVar2.mo129e().writeUTF(str9);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: o0 */
    public void mo296o0(int i) {
        C0045c cVar = null;
        try {
            cVar = mo289k0((byte) 39);
            cVar.mo129e().writeInt(i);
            this.f1154a.mo124a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: p */
    public void mo297p() {
        C0111c0.m584k("SEND MOVE" + C0114e.m647e0().f1593n + "," + C0114e.m647e0().f1598o);
        int i = C0114e.m647e0().f1593n - C0114e.m647e0().f1458M1;
        int i2 = C0114e.m647e0().f1598o - C0114e.m647e0().f1463N1;
        if (C0114e.f1392w4) {
            return;
        }
        if (!(i == 0 && i2 == 0) && !C0103b.f1145e && !C0114e.m647e0().f1538c && C0114e.m647e0().f1598o > 0 && !C0114e.m647e0().f1495T3) {
            try {
                C0045c cVar = new C0045c((byte) -7);
                C0114e.m647e0().f1458M1 = C0114e.m647e0().f1593n;
                C0114e.m647e0().f1463N1 = C0114e.m647e0().f1598o;
                C0114e.m647e0().f1468O1 = C0114e.m647e0().f1633v;
                C0114e.m647e0().f1483R1 = C0114e.m647e0().f1628u;
                if (C0121h0.m840t(C0114e.m647e0().f1593n / C0121h0.f1796o, C0114e.m647e0().f1598o / C0121h0.f1796o) == 0) {
                    cVar.mo129e().writeByte(1);
                    if (C0114e.m647e0().f1559g0) {
                        if (!C0114e.m647e0().f1610q1) {
                            C0114e.m647e0().f1426G -= (C0114e.m647e0().f1627t3 / 100) * (C0114e.m647e0().f1415D3 == 1 ? 2 : 1);
                        }
                        if (C0114e.m647e0().f1426G < 0) {
                            C0114e.m647e0().f1426G = 0;
                        }
                        C0126k.m893c0().f2061C0 = true;
                        C0126k.m893c0().f2059B0 = 0;
                    }
                } else {
                    cVar.mo129e().writeByte(0);
                }
                cVar.mo129e().writeShort(C0114e.m647e0().f1593n);
                if (i2 != 0) {
                    cVar.mo129e().writeShort(C0114e.m647e0().f1598o);
                }
                this.f1154a.mo124a(cVar);
                C0126k.f1961f2++;
                cVar.mo125a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p0 */
    public void mo298p0(int i) {
        C0111c0.m584k("npc id" + i);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) 33);
            try {
                cVar2.mo129e().writeShort(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: q */
    public void mo299q(String str) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("Send chat " + str);
            C0045c cVar2 = new C0045c((byte) 44);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: q0 */
    public void mo300q0() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) 29);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: r */
    public void mo301r(String str) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -71);
            try {
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: r0 */
    public void mo302r0() {
        C0045c cVar;
        Exception e;
        try {
            cVar = new C0045c((byte) -107);
            try {
                this.f1154a.mo124a(cVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            cVar = null;
            e = exc;
            try {
                e.printStackTrace();
                cVar.mo125a();
            } catch (Throwable th) {
                th = th;
                cVar.mo125a();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable th3 = th2;
            cVar = null;
            th = th3;
            cVar.mo125a();
            throw th;
        }
        cVar.mo125a();
    }

    /* renamed from: s */
    public void mo303s(String str, int i) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -72);
            try {
                cVar2.mo129e().writeInt(i);
                cVar2.mo129e().writeUTF(str);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: s0 */
    public void mo304s0(byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -108);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: t */
    public void mo305t(byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -44);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: t0 */
    public void mo306t0(int i) {
        if (C0126k.f1963f4 <= 0) {
            C0045c cVar = null;
            try {
                C0045c cVar2 = new C0045c((byte) -20);
                try {
                    cVar2.mo129e().writeShort(i);
                    this.f1154a.mo124a(cVar2);
                    C0126k.f1963f4 = 60;
                    cVar2.mo125a();
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    try {
                        e.printStackTrace();
                        cVar.mo125a();
                    } catch (Throwable th) {
                        th = th;
                        cVar.mo125a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = cVar2;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                cVar.mo125a();
            }
        }
    }

    /* renamed from: u */
    public void mo307u(int i) {
        C0045c cVar = new C0045c((byte) -78);
        try {
            cVar.mo129e().writeInt(i);
            this.f1154a.mo124a(cVar);
            cVar.mo125a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: u0 */
    public void mo308u0(int i, short s) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -30);
            try {
                cVar2.mo129e().writeByte(64);
                cVar2.mo129e().writeInt(i);
                cVar2.mo129e().writeShort(s);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: v */
    public void mo309v(int i) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("CLAN DONATE");
            C0045c cVar2 = new C0045c((byte) -54);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: v0 */
    public void mo310v0(byte b, byte b2, int i) {
        C0111c0.m584k("PLAYER VS PLAYER");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -59);
            try {
                cVar2.mo129e().writeByte(b);
                cVar2.mo129e().writeByte(b2);
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: w */
    public void mo311w(byte b) {
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -62);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: w0 */
    public void mo312w0(byte b) {
        C0111c0.m584k("request bag image");
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -63);
            try {
                cVar2.mo129e().writeByte(b);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: x */
    public void mo313x(byte b, int i, int i2, int i3) {
        C0111c0.m584k("invite action = " + b + "layerid= " + i + " clanID= " + i2 + " code= " + i3);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -57);
            try {
                cVar2.mo129e().writeByte(b);
                if (b == 0) {
                    cVar2.mo129e().writeInt(i);
                }
                if (b == 1 || b == 2) {
                    cVar2.mo129e().writeInt(i2);
                    cVar2.mo129e().writeInt(i3);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: x0 */
    public void mo314x0() {
        C0045c cVar = new C0045c((byte) -23);
        this.f1154a.mo124a(cVar);
        cVar.mo125a();
    }

    /* renamed from: y */
    public void mo315y(int i) {
        C0111c0.m584k("MEMBER CLAN " + i);
        C0045c cVar = null;
        try {
            C0045c cVar2 = new C0045c((byte) -50);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: y0 */
    public void mo316y0(int i, int i2) {
        C0045c cVar = new C0045c((byte) 21);
        try {
            cVar.mo129e().writeByte(i);
            this.f1154a.mo124a(cVar);
            cVar.mo125a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public void mo317z(int i, String str, int i2) {
        C0045c cVar = null;
        try {
            C0111c0.m584k("CLAN MESSAGE");
            C0045c cVar2 = new C0045c((byte) -51);
            try {
                cVar2.mo129e().writeByte(i);
                if (i == 0) {
                    cVar2.mo129e().writeUTF(str);
                }
                if (i == 2) {
                    cVar2.mo129e().writeInt(i2);
                }
                this.f1154a.mo124a(cVar2);
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }

    /* renamed from: z0 */
    public void mo318z0(int i) {
        C0145a.m1360o();
        C0045c cVar = null;
        try {
            C0111c0.m584k("REQUEST ICON " + i);
            C0045c cVar2 = new C0045c((byte) -67);
            try {
                cVar2.mo129e().writeInt(i);
                this.f1154a = (!C0150c.m1415o().mo746p() || C0150c.m1415o().f2709f) ? C0150c.m1414n() : C0150c.m1415o();
                this.f1154a.mo124a(cVar2);
                this.f1154a = C0150c.m1414n();
                cVar2.mo125a();
            } catch (Exception e) {
                e = e;
                cVar = cVar2;
                try {
                    e.printStackTrace();
                    cVar.mo125a();
                } catch (Throwable th) {
                    th = th;
                    cVar.mo125a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                cVar.mo125a();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            cVar.mo125a();
        }
    }
}
