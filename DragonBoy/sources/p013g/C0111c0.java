package p013g;

import java.util.Random;
import p011e.C0057d1;
import p012f.C0105d;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0173i;
import p020k.C0177m;

/* renamed from: g.c0 */
public class C0111c0 {

    /* renamed from: a */
    private static short[] f1304a = {0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};

    /* renamed from: b */
    private static short[] f1305b;

    /* renamed from: c */
    private static int[] f1306c;

    /* renamed from: d */
    public static Random f1307d = new Random();

    /* renamed from: e */
    public static boolean f1308e;

    /* renamed from: f */
    public static boolean f1309f;

    static {
        new C0173i("");
    }

    /* renamed from: a */
    public static int m574a(int i) {
        return i > 0 ? i : -i;
    }

    /* renamed from: b */
    public static final int m575b(int i, int i2) {
        if (i == 0) {
            return i2 > 0 ? 90 : 270;
        }
        int c = m576c(Math.abs((i2 << 10) / i));
        if (i2 >= 0 && i < 0) {
            c = 180 - c;
        }
        if (i2 < 0 && i < 0) {
            c += 180;
        }
        return (i2 >= 0 || i < 0) ? c : 360 - c;
    }

    /* renamed from: c */
    public static final int m576c(int i) {
        for (int i2 = 0; i2 <= 90; i2++) {
            if (f1306c[i2] >= i) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static String m577d(String str) {
        if (C0161h.f2758f != 7) {
            return str;
        }
        if (C0114e.m647e0() != null && C0114e.m647e0().f1644x0 != null && C0114e.m647e0().f1644x0.f1097c >= 10) {
            return str;
        }
        if (str.indexOf("Gohan") != -1) {
            str = m588o(str, "Gohan", "Hango");
        }
        if (str.indexOf("Gôhan") != -1) {
            str = m588o(str, "Gôhan", "Hango");
        }
        if (str.indexOf("Bunma") != -1) {
            str = m588o(str, "Bunma", "Mabun");
        }
        if (str.indexOf("Bunman") != -1) {
            str = m588o(str, "Bunman", "Mabun");
        }
        if (str.indexOf("Bun ma") != -1) {
            str = m588o(str, "Bun ma", "Mabun");
        }
        if (str.indexOf("Đậu thần") != -1) {
            str = m588o(str, "Đậu thần", "Cây thần");
        }
        if (str.indexOf("Mabu") != -1) {
            str = m588o(str, "Mabu", "Buma");
        }
        if (str.indexOf("Ma bư") != -1) {
            str = m588o(str, "Ma bư", "Buma");
        }
        if (str.indexOf("Xayda") != -1) {
            str = m588o(str, "Xayda", "Dasay");
        }
        if (str.indexOf("Xay da") != -1) {
            str = m588o(str, "Xay da", "Dasay");
        }
        if (str.indexOf("Namếc") != -1) {
            str = m588o(str, "Namếc", "Mecda");
        }
        if (str.indexOf("Na mếc") != -1) {
            str = m588o(str, "Na mếc", "Mecda");
        }
        if (str.indexOf("Namek") != -1) {
            str = m588o(str, "Namek", "Mecda");
        }
        if (str.indexOf("Rồng thần") != -1) {
            str = m588o(str, "Rồng thần", "Rồng đất");
        }
        if (str.indexOf("Kame") != -1) {
            str = m588o(str, "Kame", "Meka");
        }
        if (str.indexOf("Vegeta") != -1) {
            str = m588o(str, "Vegeta", "Tageve");
        }
        if (str.indexOf("Kakalot") != -1) {
            str = m588o(str, "Kakalot", "Lotkaka");
        }
        if (str.indexOf("Broly") != -1) {
            str = m588o(str, "Broly", "Lybro");
        }
        if (str.indexOf("Ngọc rồng") != -1) {
            str = m588o(str, "Ngọc rồng", "Ngọc thần");
        }
        if (str.indexOf("ngọc rồng") != -1) {
            str = m588o(str, "ngọc rồng", "Ngọc thần");
        }
        if (str.indexOf("Radic") != -1) {
            str = m588o(str, "Radic", "Dicra");
        }
        if (str.indexOf("Ra dic") != -1) {
            str = m588o(str, "Ra dic", "Dicra");
        }
        if (str.indexOf("Ra đíc") != -1) {
            str = m588o(str, "Ra đíc", "Dicra");
        }
        if (str.indexOf("Cadic") != -1) {
            str = m588o(str, "Cadic", "Dicca");
        }
        if (str.indexOf("Ca dic") != -1) {
            str = m588o(str, "Ca dic", "Dicca");
        }
        if (str.indexOf("Ca đíc") != -1) {
            str = m588o(str, "Ca đíc", "Dicca");
        }
        if (str.indexOf("Quy lão") != -1) {
            str = m588o(str, "Quy lão", "Lão");
        }
        if (str.indexOf("quy lão") != -1) {
            str = m588o(str, "quy lão", "lão");
        }
        if (str.indexOf("QuyLão") != -1) {
            str = m588o(str, "Quy Lão", "Lão");
        }
        if (str.indexOf("Santa") != -1) {
            str = m588o(str, "Santa", "Tasan");
        }
        if (str.indexOf("Hạt Mít") != -1) {
            str = m588o(str, "Hạt Mít", "Hạt Dẻ");
        }
        if (str.indexOf("Hạt mít") != -1) {
            str = m588o(str, "Hạt mít", "Hạt dẻ");
        }
        if (str.indexOf("Tàu bảy bảy") != -1) {
            str = m588o(str, "Tàu bảy bảy", "Tàu tàu");
        }
        if (str.indexOf("Uron") != -1) {
            str = m588o(str, "Uron", "Onru");
        }
        if (str.indexOf("U ron") != -1) {
            str = m588o(str, "U ron", "Onru");
        }
        if (str.indexOf("Urôn") != -1) {
            str = m588o(str, "Urôn", "Onru");
        }
        if (str.indexOf("Ngọc Rồng") != -1) {
            str = m588o(str, "Ngọc Rồng", "Ngọc thần");
        }
        if (str.indexOf("Ngọc rồng") != -1) {
            str = m588o(str, "Ngọc rồng", "Ngọc thần");
        }
        if (str.indexOf("Fide") != -1) {
            str = m588o(str, "Fide", "Defi");
        }
        if (str.indexOf("Vegeta") != -1) {
            str = m588o(str, "Vegeta", "Tageve");
        }
        if (str.indexOf("Moori") != -1) {
            str = m588o(str, "Moori", "Rimoo");
        }
        if (str.indexOf("Aru") != -1) {
            str = m588o(str, "Aru", "Ura");
        }
        if (str.indexOf("Kamejoko") != -1) {
            str = m588o(str, "Kamejoko", "Kojomeka");
        }
        if (str.indexOf("kamejoko") != -1) {
            str = m588o(str, "kamejoko", "kojomeka");
        }
        if (str.indexOf("Kame") != -1) {
            str = m588o(str, "Kame", "Meka");
        }
        if (str.indexOf("kame") != -1) {
            str = m588o(str, "kame", "meka");
        }
        if (str.indexOf("Masenko") != -1) {
            str = m588o(str, "Masenko", "Kosenma");
        }
        if (str.indexOf("Thái Dương Hạ San") != -1) {
            str = m588o(str, "Thái Dương Hạ San", "Hạ Dương");
        }
        if (str.indexOf("Solar flare") != -1) {
            str = m588o(str, "Solar flare", "Solar");
        }
        if (str.indexOf("Quả cầu kênh khi") != -1) {
            str = m588o(str, "Quả cầu kênh khi", "Quả cầu");
        }
        if (str.indexOf("Genki-Dama") != -1) {
            str = m588o(str, "Genki-Dama", "Dama");
        }
        if (str.indexOf("Genki-Dama") != -1) {
            str = m588o(str, "Genki-Dama", "Dama");
        }
        return str.indexOf("Makankosappo") != -1 ? m588o(str, "Makankosappo", "Oppasoknakam") : str;
    }

    /* renamed from: e */
    public static final int m578e(int i) {
        int f = m579f(i);
        return (f < 0 || f >= 90) ? (f < 90 || f >= 180) ? (f < 180 || f >= 270) ? f1305b[360 - f] : -f1305b[f - 180] : -f1305b[180 - f] : f1305b[f];
    }

    /* renamed from: f */
    public static final int m579f(int i) {
        if (i >= 360) {
            i -= 360;
        }
        return i < 0 ? i + 360 : i;
    }

    /* renamed from: g */
    public static String m580g(long j) {
        String str;
        long j2;
        String str2;
        StringBuilder sb;
        StringBuilder sb2;
        if (j >= 1000000000) {
            str = C0057d1.f586Y0;
            j2 = (j % 1000000000) / 100000000;
            str2 = (j / 1000000000) + "";
            if (j2 > 0) {
                sb2 = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                return sb2.toString();
            }
        } else if (j >= 1000000) {
            str = C0057d1.f592Z0;
            j2 = (j % 1000000) / 100000;
            str2 = (j / 1000000) + "";
            if (j2 > 0) {
                sb2 = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                return sb2.toString();
            }
        } else {
            return j + "";
        }
        sb2.append(str2);
        sb2.append(",");
        sb2.append(j2);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m581h(long j) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        if (j >= 1000000000) {
            String str = C0057d1.f586Y0;
            long j2 = (j % 1000000000) / 10000000;
            String str2 = (j / 1000000000) + "";
            if (j2 >= 10) {
                if (j2 % 10 == 0) {
                    j2 /= 10;
                }
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(",");
            } else if (j2 > 0) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(",0");
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
            }
            sb.append(j2);
            sb.append(str);
        } else if (j >= 1000000) {
            String str3 = C0057d1.f592Z0;
            long j3 = (j % 1000000) / 10000;
            String str4 = (j / 1000000) + "";
            if (j3 >= 10) {
                if (j3 % 10 == 0) {
                    j3 /= 10;
                }
                sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(",");
            } else if (j3 > 0) {
                sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(",0");
            } else {
                sb3 = new StringBuilder();
                sb3.append(str4);
                sb.append(str3);
            }
            sb3.append(j3);
            sb.append(str3);
        } else if (j >= 10000) {
            long j4 = (j % 1000) / 10;
            String str5 = (j / 1000) + "";
            if (j4 >= 10) {
                if (j4 % 10 == 0) {
                    j4 /= 10;
                }
                sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(",");
            } else if (j4 > 0) {
                sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(",0");
            } else {
                sb2 = new StringBuilder();
                sb2.append(str5);
                sb.append("k");
            }
            sb2.append(j4);
            sb.append("k");
        } else {
            return j + "";
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static boolean m582i(int i, int i2, int i3, int i4, int i5, int i6) {
        return i5 >= i && i5 <= i + i3 && i6 >= i2 && i6 <= i2 + i4;
    }

    /* renamed from: j */
    public static void m583j() {
        f1305b = new short[91];
        f1306c = new int[91];
        for (int i = 0; i <= 90; i++) {
            short[] sArr = f1305b;
            short[] sArr2 = f1304a;
            sArr[i] = sArr2[90 - i];
            if (sArr[i] == 0) {
                f1306c[i] = Integer.MAX_VALUE;
            } else {
                f1306c[i] = (sArr2[i] << 10) / sArr[i];
            }
        }
    }

    /* renamed from: k */
    public static void m584k(String str) {
    }

    /* renamed from: l */
    public static void m585l(C0159f fVar) {
        C0177m mVar = C0177m.f2951s;
        mVar.mo909a(fVar, "check Controller= " + C0105d.f1151e, 3, 55, 0);
        C0177m mVar2 = C0177m.f2951s;
        mVar2.mo909a(fVar, "check Map= " + C0105d.f1152f, 3, 75, 0);
    }

    /* renamed from: m */
    public static int m586m(int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 *= i;
        }
        return i3;
    }

    /* renamed from: n */
    public static int m587n(int i, int i2) {
        return i == i2 ? i : i + f1307d.nextInt(i2 - i);
    }

    /* renamed from: o */
    public static String m588o(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        int indexOf = str.indexOf(str2);
        int length = str2.length();
        int i = 0;
        while (indexOf != -1) {
            stringBuffer.append(str.substring(i, indexOf));
            stringBuffer.append(str3);
            i = indexOf + length;
            indexOf = str.indexOf(str2, i);
        }
        stringBuffer.append(str.substring(i, str.length()));
        return stringBuffer.toString();
    }

    /* renamed from: p */
    public static final int m589p(int i) {
        int f = m579f(i);
        return (f < 0 || f >= 90) ? (f < 90 || f >= 180) ? (f < 180 || f >= 270) ? -f1304a[360 - f] : -f1304a[f - 180] : f1304a[180 - f] : f1304a[f];
    }

    /* renamed from: q */
    public static String[] m590q(String str, String str2, int i) {
        String[] strArr;
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0) {
            strArr = m590q(str.substring(str2.length() + indexOf), str2, i + 1);
        } else {
            strArr = new String[(i + 1)];
            indexOf = str.length();
        }
        strArr[i] = str.substring(0, indexOf);
        return strArr;
    }

    /* renamed from: r */
    public static int m591r(int i) {
        if (i <= 0) {
            return 0;
        }
        int i2 = (i + 1) / 2;
        while (true) {
            int i3 = (i2 / 2) + (i / (i2 * 2));
            if (Math.abs(i2 - i3) <= 1) {
                return i3;
            }
            i2 = i3;
        }
    }

    /* renamed from: s */
    public static void m592s() {
        long h = C0161h.m1490h();
        if (C0105d.f1149c - h > 5000) {
            C0105d.m365M().mo231K0();
        }
        if (C0105d.f1150d - h > 5000) {
            C0105d.m365M().mo233L0();
        }
    }
}
