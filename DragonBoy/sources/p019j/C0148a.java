package p019j;

import com.blue.dragonball.MainActivity;
import java.io.IOException;
import java.io.InputStream;
import p014h.p015a.p016a.C0143b;

/* renamed from: j.a */
public class C0148a {
    /* renamed from: a */
    public static InputStream m1395a(String str) {
        try {
            return MainActivity.f302g.open(C0143b.m1324f(str));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
