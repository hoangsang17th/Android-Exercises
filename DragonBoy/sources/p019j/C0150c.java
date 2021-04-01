package p019j;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import p010d.C0043a;
import p010d.C0044b;
import p010d.C0045c;
import p018i.C0145a;
import p018i.C0146b;

/* renamed from: j.c */
public class C0150c implements C0044b {

    /* renamed from: s */
    protected static C0150c f2701s = new C0150c();

    /* renamed from: t */
    protected static C0150c f2702t = new C0150c();

    /* renamed from: u */
    public static boolean f2703u;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public DataOutputStream f2704a;

    /* renamed from: b */
    public DataInputStream f2705b;

    /* renamed from: c */
    public C0043a f2706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0160g f2707d;

    /* renamed from: e */
    public boolean f2708e;

    /* renamed from: f */
    public boolean f2709f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0154c f2710g = new C0154c();

    /* renamed from: h */
    public Thread f2711h;

    /* renamed from: i */
    public Thread f2712i;

    /* renamed from: j */
    public int f2713j;

    /* renamed from: k */
    public int f2714k;

    /* renamed from: l */
    boolean f2715l;

    /* renamed from: m */
    public byte[] f2716m = null;

    /* renamed from: n */
    private byte f2717n;

    /* renamed from: o */
    private byte f2718o;

    /* renamed from: p */
    long f2719p;

    /* renamed from: q */
    public String f2720q = "";

    /* renamed from: r */
    public boolean f2721r = true;

    /* renamed from: j.c$a */
    class C0151a implements Runnable {
        C0151a() {
        }

        /* renamed from: a */
        private void m1424a(C0045c cVar) {
            C0150c cVar2;
            int readByte = cVar.mo128d().readByte();
            C0150c.this.f2716m = new byte[readByte];
            int i = 0;
            for (int i2 = 0; i2 < readByte; i2++) {
                C0150c.this.f2716m[i2] = cVar.mo128d().readByte();
            }
            while (true) {
                cVar2 = C0150c.this;
                byte[] bArr = cVar2.f2716m;
                if (i >= bArr.length - 1) {
                    break;
                }
                int i3 = i + 1;
                bArr[i3] = (byte) (bArr[i] ^ bArr[i3]);
                i = i3;
            }
            cVar2.f2715l = true;
            C0146b.f2675c = cVar.mo128d().readUTF();
            C0146b.f2676d = cVar.mo128d().readInt();
            if (C0150c.this.f2721r) {
                C0145a.m1362q();
            }
        }

        /* renamed from: b */
        private C0045c m1425b() {
            int i;
            byte readByte = C0150c.this.f2705b.readByte();
            C0150c cVar = C0150c.this;
            if (cVar.f2715l) {
                readByte = cVar.m1416q(readByte);
            }
            if (readByte == -32 || readByte == -66 || readByte == 11 || readByte == -67 || readByte == -74 || readByte == -87 || readByte == 66) {
                return m1426c(readByte);
            }
            C0150c cVar2 = C0150c.this;
            boolean z = cVar2.f2715l;
            DataInputStream dataInputStream = cVar2.f2705b;
            if (z) {
                i = ((C0150c.this.m1416q(dataInputStream.readByte()) & 255) << 8) | (C0150c.this.m1416q(C0150c.this.f2705b.readByte()) & 255);
            } else {
                i = dataInputStream.readUnsignedShort();
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && i3 < i) {
                i2 = C0150c.this.f2705b.read(bArr, i3, i - i3);
                if (i2 > 0) {
                    i3 += i2;
                    C0150c.this.f2714k += i3 + 5;
                    int i4 = C0150c.m1414n().f2714k + C0150c.m1414n().f2713j;
                    C0150c.this.f2720q = (i4 / 1024) + "." + ((i4 % 1024) / 102) + "Kb";
                }
            }
            if (C0150c.this.f2715l) {
                for (int i5 = 0; i5 < i; i5++) {
                    bArr[i5] = C0150c.this.m1416q(bArr[i5]);
                }
            }
            return new C0045c(readByte, bArr);
        }

        /* renamed from: c */
        private C0045c m1426c(byte b) {
            C0150c cVar = C0150c.this;
            C0150c cVar2 = C0150c.this;
            C0150c cVar3 = C0150c.this;
            int h = ((((cVar3.m1416q(cVar3.f2705b.readByte()) + 128) * 256) + cVar2.m1416q(cVar2.f2705b.readByte()) + 128) * 256) + cVar.m1416q(cVar.f2705b.readByte()) + 128;
            byte[] bArr = new byte[h];
            int i = 0;
            int i2 = 0;
            while (i != -1 && i2 < h) {
                i = C0150c.this.f2705b.read(bArr, i2, h - i2);
                if (i > 0) {
                    i2 += i;
                    C0150c.this.f2714k += i2 + 5;
                    int i3 = C0150c.m1414n().f2714k + C0150c.m1414n().f2713j;
                    C0150c.this.f2720q = (i3 / 1024) + "." + ((i3 % 1024) / 102) + "Kb";
                }
            }
            if (C0150c.this.f2715l) {
                for (int i4 = 0; i4 < h; i4++) {
                    bArr[i4] = C0150c.this.m1416q(bArr[i4]);
                }
            }
            return new C0045c(b, bArr);
        }

        public void run() {
            C0045c b;
            while (C0150c.this.mo746p() && (b = m1425b()) != null) {
                try {
                    try {
                        if (b.f327a == -27) {
                            m1424a(b);
                        } else {
                            C0150c.this.f2706c.mo122c(b);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception unused) {
                }
            }
            C0150c cVar = C0150c.this;
            if (cVar.f2708e) {
                if (cVar.f2706c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C0150c cVar2 = C0150c.this;
                    int i = ((currentTimeMillis - cVar2.f2719p) > 500 ? 1 : ((currentTimeMillis - cVar2.f2719p) == 500 ? 0 : -1));
                    C0043a aVar = cVar2.f2706c;
                    boolean z = cVar2.f2721r;
                    if (i > 0) {
                        aVar.mo123d(z);
                    } else {
                        aVar.mo120a(z);
                    }
                }
                if (C0150c.this.f2707d != null) {
                    C0150c.this.m1412i();
                }
            }
        }
    }

    /* renamed from: j.c$b */
    class C0152b implements Runnable {

        /* renamed from: a */
        private final String f2723a;

        /* renamed from: b */
        int f2724b;

        /* renamed from: j.c$b$a */
        class C0153a implements Runnable {
            C0153a() {
            }

            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (Exception unused) {
                }
                C0150c cVar = C0150c.this;
                if (cVar.f2709f) {
                    try {
                        cVar.f2707d.mo793a();
                    } catch (Exception unused2) {
                    }
                    C0150c.f2703u = true;
                    C0150c cVar2 = C0150c.this;
                    cVar2.f2709f = false;
                    cVar2.f2708e = false;
                    cVar2.f2706c.mo120a(cVar2.f2721r);
                }
            }
        }

        C0152b(String str, int i) {
            this.f2723a = str;
            this.f2724b = i;
        }

        /* renamed from: a */
        public void mo749a(String str, int i) {
            C0160g unused = C0150c.this.f2707d = new C0160g(str, i);
            C0150c.this.f2707d.mo796d(true);
            C0150c cVar = C0150c.this;
            DataOutputStream unused2 = cVar.f2704a = cVar.f2707d.mo795c();
            C0150c cVar2 = C0150c.this;
            cVar2.f2705b = cVar2.f2707d.mo794b();
            new Thread(C0150c.this.f2710g).start();
            C0150c.this.f2712i = new Thread(new C0151a());
            C0150c.this.f2712i.start();
            C0150c.this.f2719p = System.currentTimeMillis();
            C0150c.this.m1413m(new C0045c((byte) -27));
            C0150c.this.f2709f = false;
        }

        public void run() {
            C0150c.f2703u = false;
            new Thread(new C0153a()).start();
            C0150c cVar = C0150c.this;
            cVar.f2709f = true;
            cVar.f2708e = true;
            try {
                mo749a(this.f2723a, this.f2724b);
                C0150c cVar2 = C0150c.this;
                cVar2.f2706c.mo121b(cVar2.f2721r);
            } catch (Exception unused) {
                try {
                    Thread.sleep(500);
                } catch (Exception unused2) {
                }
                if (!C0150c.f2703u) {
                    C0043a aVar = C0150c.this.f2706c;
                }
            }
        }
    }

    /* renamed from: j.c$c */
    private class C0154c implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Vector f2727a = new Vector();

        public C0154c() {
        }

        /* renamed from: a */
        public void mo752a(C0045c cVar) {
            this.f2727a.addElement(cVar);
        }

        public void run() {
            while (true) {
                C0150c cVar = C0150c.this;
                if (cVar.f2708e) {
                    try {
                        if (cVar.f2715l) {
                            while (this.f2727a.size() > 0) {
                                this.f2727a.removeElementAt(0);
                                C0150c.this.m1413m((C0045c) this.f2727a.elementAt(0));
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m1412i() {
        this.f2716m = null;
        this.f2717n = 0;
        this.f2718o = 0;
        try {
            this.f2708e = false;
            this.f2709f = false;
            C0160g gVar = this.f2707d;
            if (gVar != null) {
                gVar.mo793a();
                this.f2707d = null;
            }
            DataOutputStream dataOutputStream = this.f2704a;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.f2704a = null;
            }
            DataInputStream dataInputStream = this.f2705b;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.f2705b = null;
            }
            this.f2712i = null;
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public synchronized void m1413m(C0045c cVar) {
        DataOutputStream dataOutputStream;
        byte b;
        byte[] b2 = cVar.mo126b();
        try {
            if (this.f2715l) {
                b = m1417s(cVar.f327a);
                dataOutputStream = this.f2704a;
            } else {
                dataOutputStream = this.f2704a;
                b = cVar.f327a;
            }
            dataOutputStream.writeByte(b);
            if (b2 != null) {
                int length = b2.length;
                if (this.f2715l) {
                    this.f2704a.writeByte(m1417s((byte) (length >> 8)));
                    this.f2704a.writeByte(m1417s((byte) (length & 255)));
                } else {
                    this.f2704a.writeShort(length);
                }
                if (this.f2715l) {
                    for (int i = 0; i < b2.length; i++) {
                        b2[i] = m1417s(b2[i]);
                    }
                }
                this.f2704a.write(b2);
                this.f2713j += b2.length + 5;
            } else {
                this.f2704a.writeShort(0);
                this.f2713j += 5;
            }
            this.f2704a.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: n */
    public static C0150c m1414n() {
        return f2701s;
    }

    /* renamed from: o */
    public static C0150c m1415o() {
        return f2702t;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public byte m1416q(byte b) {
        byte[] bArr = this.f2716m;
        byte b2 = this.f2717n;
        byte b3 = (byte) (b2 + 1);
        this.f2717n = b3;
        byte b4 = (byte) ((b & 255) ^ (bArr[b2] & 255));
        if (b3 >= bArr.length) {
            this.f2717n = (byte) (b3 % bArr.length);
        }
        return b4;
    }

    /* renamed from: s */
    private byte m1417s(byte b) {
        byte[] bArr = this.f2716m;
        byte b2 = this.f2718o;
        byte b3 = (byte) (b2 + 1);
        this.f2718o = b3;
        byte b4 = (byte) ((b & 255) ^ (bArr[b2] & 255));
        if (b3 >= bArr.length) {
            this.f2718o = (byte) (b3 % bArr.length);
        }
        return b4;
    }

    /* renamed from: a */
    public void mo124a(C0045c cVar) {
        this.f2710g.mo752a(cVar);
    }

    /* renamed from: j */
    public void mo743j() {
        synchronized (this) {
            this.f2710g.f2727a.removeAllElements();
        }
    }

    /* renamed from: k */
    public void mo744k() {
        m1412i();
    }

    /* renamed from: l */
    public void mo745l(String str, int i) {
        if (!this.f2708e && !this.f2709f) {
            this.f2715l = false;
            this.f2707d = null;
            Thread thread = new Thread(new C0152b(str, i));
            this.f2711h = thread;
            thread.start();
        }
    }

    /* renamed from: p */
    public boolean mo746p() {
        return this.f2708e;
    }

    /* renamed from: r */
    public void mo747r(C0043a aVar) {
        this.f2706c = aVar;
    }
}
