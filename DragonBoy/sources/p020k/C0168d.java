package p020k;

import com.blue.dragonball.MainActivity;
import java.io.DataInputStream;
import java.io.IOException;
import p014h.p015a.p016a.C0143b;
import p019j.C0159f;

/* renamed from: k.d */
public class C0168d {

    /* renamed from: b */
    public static byte[] f2801b = {-22, 2, 12, 4, 5, 2, -10};

    /* renamed from: a */
    public int f2802a = 0;

    /* renamed from: a */
    public static C0143b m1531a(String str) {
        C0143b bVar = new C0143b();
        String str2 = "/x" + C0159f.f2750b + str;
        try {
            DataInputStream dataInputStream = new DataInputStream(MainActivity.f302g.open(C0143b.m1324f(str2)));
            int available = dataInputStream.available();
            byte[] bArr = new byte[available];
            dataInputStream.read(bArr, 0, available);
            C0168d dVar = new C0168d();
            dVar.f2802a = 0;
            for (int i = 0; i < available; i++) {
                bArr[i] = dVar.mo827b(bArr[i]);
            }
            bVar = C0143b.m1322b(bArr, 0, available);
        } catch (IOException | IllegalArgumentException | NullPointerException unused) {
        }
        if (bVar.f2571a == null) {
            try {
                bVar = C0143b.m1321a(str2);
            } catch (IOException unused2) {
            }
            if (bVar == null) {
                return null;
            }
            if (bVar == null || bVar.f2571a != null) {
                return bVar;
            }
            return null;
        }
        return bVar;
    }

    /* renamed from: b */
    public byte mo827b(byte b) {
        byte[] bArr = f2801b;
        int i = this.f2802a;
        int i2 = i + 1;
        this.f2802a = i2;
        byte b2 = (byte) ((b & 255) ^ (bArr[i] & 255));
        if (i2 >= bArr.length) {
            this.f2802a = i2 % bArr.length;
        }
        return b2;
    }
}
