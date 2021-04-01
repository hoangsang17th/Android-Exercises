package p001b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import p012f.C0105d;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0149b;
import p019j.C0159f;
import p020k.C0171g;
import p020k.C0172h;
import p020k.C0173i;

/* renamed from: b.n */
public class C0018n {

    /* renamed from: a */
    public static C0172h f219a = new C0172h("h ImgByName");

    /* renamed from: a */
    public static void m86a(String str, C0143b bVar, byte b) {
        C0172h hVar = f219a;
        hVar.put("" + str, new C0171g(bVar, b));
    }

    /* renamed from: b */
    public static void m87b(C0172h hVar, int i, boolean z) {
        C0173i iVar = new C0173i("checkDelHash");
        Enumeration keys = hVar.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if ((C0145a.f2653u / 1000) - ((C0171g) hVar.get(str)).f2845b > ((long) (i * 60))) {
                iVar.addElement(str);
            }
        }
        for (int i2 = 0; i2 < iVar.size(); i2++) {
            hVar.remove((String) iVar.elementAt(i2));
        }
    }

    /* renamed from: c */
    public static C0171g m88c(String str) {
        byte[] c = C0149b.m1398c(C0159f.f2750b + "ImgByName_Erree" + str);
        if (c == null) {
            return null;
        }
        try {
            C0171g gVar = new C0171g();
            gVar.f2847d = c[0];
            gVar.f2844a = C0143b.m1322b(c, 1, c.length);
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static C0171g m89d(String str, C0172h hVar) {
        C0171g gVar = (C0171g) hVar.get("" + str);
        if (gVar == null) {
            gVar = new C0171g();
            C0171g c = m88c(str);
            if (c != null) {
                gVar.f2844a = c.f2844a;
                gVar.f2847d = c.f2847d;
            }
            hVar.put("" + str, gVar);
        }
        gVar.f2845b = C0145a.f2653u / 1000;
        if (gVar.f2844a == null) {
            int i = gVar.f2846c - 1;
            gVar.f2846c = i;
            if (i <= 0) {
                C0105d.m365M().mo245S(str);
                gVar.f2846c = 200;
            }
        }
        return gVar;
    }

    /* renamed from: e */
    public static void m90e(String str, byte b, byte[] bArr) {
        String str2 = C0159f.f2750b + "ImgByName_" + str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(b);
            for (byte writeByte : bArr) {
                dataOutputStream.writeByte(writeByte);
            }
            C0149b.m1402g(str2, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
