package p020k;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p013g.C0111c0;
import p013g.C0121h0;
import p014h.p015a.p016a.C0143b;
import p019j.C0149b;
import p019j.C0159f;

/* renamed from: k.b */
public class C0166b {
    /* renamed from: a */
    public static C0143b m1519a(C0143b bVar, int i, int i2) {
        C0111c0.m584k("blend image");
        int i3 = C0121h0.f1786e - 1;
        C0143b b = (i3 == 0 && i == 1) ? C0159f.m1448b(bVar, 0.3f, 807956) : bVar;
        if (i3 == 1 && i == 1) {
            b = C0159f.m1448b(bVar, 0.35f, 739339);
        }
        if (i3 == 2 && i == 1) {
            b = C0159f.m1448b(bVar, 0.1f, 3977975);
        }
        if (i3 == 3) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.2f, 15265992);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.1f, 15265992);
            }
        }
        if (i3 == 4) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.3f, 1330178);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.1f, 1330178);
            }
        }
        if (i3 == 6) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.3f, 420382);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 420382);
            }
        }
        if (i3 == 5) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.35f, 3270903);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 3270903);
            }
        }
        if (i3 == 8) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.3f, 7094528);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 7094528);
            }
        }
        if (i3 == 9) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.3f, 12113627);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 12113627);
            }
        }
        if (i3 == 10 && i == 1) {
            b = C0159f.m1448b(bVar, 0.3f, 14938312);
        }
        if (i3 == 10 && i == 1) {
            b = C0159f.m1448b(bVar, 0.2f, 14938312);
        }
        if (i3 == 11) {
            if (i == 1) {
                b = C0159f.m1448b(bVar, 0.3f, 0);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 0);
            }
        }
        if (i3 > 11) {
            if (i == 1 || i == 2) {
                b = C0159f.m1448b(bVar, 0.3f, 0);
            }
            if (i == 3) {
                b = C0159f.m1448b(bVar, 0.15f, 0);
            }
        }
        byte[] c = m1521c(b);
        C0149b.m1402g("x" + C0159f.f2750b + "blend" + i2 + "layer" + i, c);
        C0111c0.m584k("str save = " + "blend" + i2 + "layer" + i + "data blend lent = " + c.length);
        return b;
    }

    /* renamed from: b */
    public static void m1520b(short s, C0143b bVar) {
        byte b;
        for (int i = 0; i < C0121h0.f1768G.size(); i++) {
            C0165a aVar = (C0165a) C0121h0.f1768G.elementAt(i);
            if (aVar.f2777c == s && !aVar.mo818e() && (b = aVar.f2782h) != 2 && b != 4) {
                C0172h hVar = C0165a.f2769m;
                if (!hVar.containsKey(aVar.f2777c + "blend" + aVar.f2782h)) {
                    byte[] c = C0149b.m1398c("x" + C0159f.f2750b + "blend" + s + "layer" + aVar.f2782h);
                    StringBuilder sb = new StringBuilder();
                    sb.append("str load 2= blend");
                    sb.append(s);
                    sb.append("layer");
                    sb.append(aVar.f2782h);
                    C0111c0.m584k(sb.toString());
                    if (c == null) {
                        C0111c0.m584k("datablend null");
                        C0172h hVar2 = C0165a.f2769m;
                        hVar2.put(aVar.f2777c + "blend" + aVar.f2782h, m1519a(bVar, aVar.f2782h, aVar.f2777c));
                    } else {
                        C0111c0.m584k("load rms blend lent= " + c.length);
                        C0143b b2 = C0143b.m1322b(c, 0, c.length);
                        C0172h hVar3 = C0165a.f2769m;
                        hVar3.put(aVar.f2777c + "blend" + aVar.f2782h, b2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static byte[] m1521c(C0143b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bVar.f2571a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
