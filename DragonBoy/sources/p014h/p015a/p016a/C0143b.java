package p014h.p015a.p016a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.blue.dragonball.MainActivity;
import p019j.C0159f;

/* renamed from: h.a.a.b */
public class C0143b {

    /* renamed from: a */
    public Bitmap f2571a;

    /* renamed from: a */
    public static C0143b m1321a(String str) {
        C0143b bVar = new C0143b();
        bVar.f2571a = BitmapFactory.decodeStream(MainActivity.f302g.open(m1324f(str)));
        return bVar;
    }

    /* renamed from: b */
    public static C0143b m1322b(byte[] bArr, int i, int i2) {
        C0143b bVar = new C0143b();
        bVar.f2571a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        return bVar;
    }

    /* renamed from: c */
    public static C0143b m1323c(int[] iArr, int i, int i2, boolean z) {
        C0143b bVar = new C0143b();
        bVar.f2571a = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        return bVar;
    }

    /* renamed from: f */
    public static String m1324f(String str) {
        return str.charAt(0) == '/' ? str.substring(1) : str;
    }

    /* renamed from: d */
    public int mo715d() {
        return this.f2571a.getHeight();
    }

    /* renamed from: e */
    public int mo716e() {
        return this.f2571a.getHeight() / C0159f.f2750b;
    }

    /* renamed from: g */
    public void mo717g(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2571a.getPixels(iArr, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: h */
    public int mo718h() {
        return this.f2571a.getWidth();
    }

    /* renamed from: i */
    public int mo719i() {
        return this.f2571a.getWidth() / C0159f.f2750b;
    }
}
