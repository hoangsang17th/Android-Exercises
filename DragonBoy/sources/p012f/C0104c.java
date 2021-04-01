package p012f;

import java.io.DataInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import p010d.C0045c;
import p013g.C0111c0;

/* renamed from: f.c */
public class C0104c {
    /* renamed from: a */
    public static String m356a(int i) {
        Date date = new Date(((long) i) * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH");
        return simpleDateFormat.format(date) + "h";
    }

    /* renamed from: b */
    public static String m357b(long j) {
        return new SimpleDateFormat("HH:mm").format(new Date(j));
    }

    /* renamed from: c */
    public static String m358c(long j) {
        StringBuilder sb;
        String str;
        long j2 = (j / 1000) + 1;
        String str2 = "";
        int i = 0;
        while (((long) i) < j2) {
            if (j >= 1000) {
                long j3 = j % 1000;
                if (j3 == 0) {
                    str2 = ".000" + str2;
                } else {
                    if (j3 < 10) {
                        sb = new StringBuilder();
                        str = ".00";
                    } else if (j3 < 100) {
                        str = ".0";
                    } else {
                        sb = new StringBuilder();
                        str = ".";
                    }
                    sb.append(str);
                    sb.append(j3);
                    sb.append(str2);
                    str2 = sb.toString();
                }
                j /= 1000;
                i++;
            } else {
                return j + str2;
            }
        }
        return str2;
    }

    /* renamed from: d */
    public static String m359d(int i) {
        int i2;
        int i3;
        StringBuilder sb;
        StringBuilder sb2;
        int i4 = 0;
        if (i > 60) {
            i2 = i / 60;
            i %= 60;
        } else {
            i2 = 0;
        }
        if (i2 > 60) {
            i3 = i2 / 60;
            i2 %= 60;
        } else {
            i3 = 0;
        }
        if (i3 > 24) {
            i4 = i3 / 24;
            i3 %= 24;
        }
        if (i4 > 0) {
            sb2 = new StringBuilder();
            sb2.append(("" + i4) + "d");
            sb2.append(i3);
            sb2.append("h");
        } else if (i3 > 0) {
            sb2 = new StringBuilder();
            sb2.append(("" + i3) + "h");
            sb2.append(i2);
            sb2.append("'");
        } else {
            if (i2 > 9) {
                sb.append("");
            } else {
                sb = new StringBuilder();
                sb.append("");
                sb.append("0");
            }
            sb.append(i2);
            String str = sb.toString() + ":";
            if (i > 9) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
            } else {
                return str + "0" + i;
            }
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m360e(int i) {
        int i2;
        int i3;
        StringBuilder sb;
        String str;
        int i4 = 0;
        if (i > 60) {
            i2 = i / 60;
            int i5 = i % 60;
        } else {
            i2 = 0;
        }
        if (i2 > 60) {
            i3 = i2 / 60;
            i2 %= 60;
        } else {
            i3 = 0;
        }
        if (i3 > 24) {
            i4 = i3 / 24;
            i3 %= 24;
        }
        if (i4 > 0) {
            return (("" + i4) + "d") + i3 + "h";
        }
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(("" + i3) + "h");
            sb.append(i2);
            str = "'";
        } else {
            if (i2 == 0) {
                i2 = 1;
            }
            sb = new StringBuilder();
            sb.append("" + i2);
            str = "ph";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    public static int m361f(int i) {
        return new Random().nextInt(i);
    }

    /* renamed from: g */
    public static byte[] m362g(C0045c cVar) {
        try {
            int readInt = cVar.mo128d().readInt();
            C0111c0.m584k("lent = " + readInt);
            byte[] bArr = new byte[readInt];
            cVar.mo128d().read(bArr);
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m363h(DataInputStream dataInputStream) {
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static String m364i(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int indexOf = str.indexOf(str2);
            if (indexOf != -1) {
                stringBuffer.append(str.substring(0, indexOf) + str3);
                str = str.substring(indexOf + str2.length());
            } else {
                stringBuffer.append(str);
                return stringBuffer.toString();
            }
        }
    }
}
