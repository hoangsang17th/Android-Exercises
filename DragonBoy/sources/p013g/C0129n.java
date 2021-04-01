package p013g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import p012f.C0105d;
import p019j.C0149b;
import p020k.C0173i;

/* renamed from: g.n */
public class C0129n {

    /* renamed from: c */
    public static C0173i f2157c = new C0173i("");

    /* renamed from: d */
    public static C0173i f2158d = new C0173i("");

    /* renamed from: a */
    public byte f2159a;

    /* renamed from: b */
    public String f2160b;

    public C0129n(String str, byte b) {
        this.f2160b = str;
        this.f2159a = b;
    }

    /* renamed from: a */
    public static void m1000a() {
        C0173i iVar = new C0173i("");
        byte[] c = C0149b.m1398c("ImageSource");
        if (c != null) {
            f2158d = new C0173i("");
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(c));
            try {
                int readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                byte[] bArr = new byte[readShort];
                for (int i = 0; i < readShort; i++) {
                    strArr[i] = dataInputStream.readUTF();
                    bArr[i] = dataInputStream.readByte();
                    f2158d.addElement(new C0129n(strArr[i], bArr[i]));
                }
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            C0111c0.m584k("vS size= " + f2157c.size() + " vRMS size= " + f2158d.size());
            for (int i2 = 0; i2 < f2157c.size(); i2++) {
                C0129n nVar = (C0129n) f2157c.elementAt(i2);
                if (!m1003d(nVar.f2160b)) {
                    iVar.addElement(nVar);
                }
            }
            for (int i3 = 0; i3 < f2158d.size(); i3++) {
                C0129n nVar2 = (C0129n) f2158d.elementAt(i3);
                if (m1002c(nVar2.f2160b) != m1001b(nVar2.f2160b)) {
                    iVar.addElement(nVar2);
                }
            }
        }
        C0105d.m365M().mo262a0(iVar);
    }

    /* renamed from: b */
    public static byte m1001b(String str) {
        for (int i = 0; i < f2157c.size(); i++) {
            if (str.equals(((C0129n) f2157c.elementAt(i)).f2160b)) {
                return ((C0129n) f2157c.elementAt(i)).f2159a;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static byte m1002c(String str) {
        for (int i = 0; i < f2158d.size(); i++) {
            if (str.equals(((C0129n) f2158d.elementAt(i)).f2160b)) {
                return ((C0129n) f2158d.elementAt(i)).f2159a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m1003d(String str) {
        for (int i = 0; i < f2158d.size(); i++) {
            if (str.equals(((C0129n) f2158d.elementAt(i)).f2160b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m1004e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(f2157c.size());
            for (int i = 0; i < f2157c.size(); i++) {
                dataOutputStream.writeUTF(((C0129n) f2157c.elementAt(i)).f2160b);
                dataOutputStream.writeByte(((C0129n) f2157c.elementAt(i)).f2159a);
            }
            C0149b.m1402g("ImageSource", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
