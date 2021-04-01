package p020k;

import android.graphics.Color;
import java.io.DataInputStream;
import java.io.IOException;
import p014h.p015a.p016a.C0143b;
import p019j.C0148a;
import p019j.C0159f;
import p019j.C0161h;

/* renamed from: k.m */
public class C0177m {

    /* renamed from: A */
    public static C0177m f2924A = new C0177m(f2940h, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -256);

    /* renamed from: B */
    public static C0177m f2925B = new C0177m(f2940h, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -11184811);

    /* renamed from: C */
    public static C0177m f2926C = new C0177m(f2940h, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -34953);

    /* renamed from: D */
    public static C0177m f2927D = new C0177m(f2940h, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -16744193);

    /* renamed from: E */
    public static C0177m f2928E = new C0177m(f2940h, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -8075479);

    /* renamed from: F */
    public static C0177m f2929F = new C0177m(f2940h, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -1053713);

    /* renamed from: G */
    public static C0177m f2930G = new C0177m(f2940h, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1, "myfont/barmeneb.ttf", 11, -8777435);

    /* renamed from: H */
    public static C0177m f2931H = new C0177m(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0, "myfont/chelthm.ttf", 8, -12105913);

    /* renamed from: I */
    public static C0177m f2932I = new C0177m(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0, "myfont/staccato.ttf", 12, -65536);

    /* renamed from: J */
    public static C0177m f2933J = new C0177m(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0, "myfont/staccato.ttf", 20, -256);

    /* renamed from: K */
    public static C0177m f2934K = new C0177m(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0, "myfont/staccato.ttf", 12, -16724992);

    /* renamed from: L */
    public static C0177m f2935L = new C0177m(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0, "myfont/staccato.ttf", 12, -680904);

    /* renamed from: M */
    public static C0177m f2936M = new C0177m(f2940h, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -65536);

    /* renamed from: N */
    public static C0177m f2937N = new C0177m(f2940h, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -256);

    /* renamed from: O */
    public static C0177m f2938O = new C0177m(f2940h, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -8075479);

    /* renamed from: P */
    public static C0177m f2939P = new C0177m(f2940h, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -16711681);

    /* renamed from: h */
    public static String f2940h = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";

    /* renamed from: i */
    public static C0177m f2941i = new C0177m(" 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW", "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -11184811);

    /* renamed from: j */
    public static C0177m f2942j = new C0177m(f2940h, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 7, -22016);

    /* renamed from: k */
    public static C0177m f2943k = new C0177m(f2940h, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 7, -16724992);

    /* renamed from: l */
    public static C0177m f2944l = new C0177m(f2940h, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 7, -16755931);

    /* renamed from: m */
    public static C0177m f2945m = new C0177m(f2940h, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 7, -1053713);

    /* renamed from: n */
    public static C0177m f2946n = new C0177m(f2940h, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -65536);

    /* renamed from: o */
    public static C0177m f2947o = new C0177m(f2940h, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -10256897);

    /* renamed from: p */
    public static C0177m f2948p = new C0177m(f2940h, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -1);

    /* renamed from: q */
    public static C0177m f2949q = new C0177m(f2940h, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -22016);

    /* renamed from: r */
    public static C0177m f2950r = new C0177m(f2940h, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 8, -22016);

    /* renamed from: s */
    public static C0177m f2951s = new C0177m(f2940h, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -11327227);

    /* renamed from: t */
    public static C0177m f2952t = new C0177m(f2940h, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -16755931);

    /* renamed from: u */
    public static C0177m f2953u = new C0177m(f2940h, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -16724992);

    /* renamed from: v */
    public static C0177m f2954v = new C0177m(f2940h, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -9390988);

    /* renamed from: w */
    public static C0177m f2955w = new C0177m(f2940h, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0, "myfont/barmeneb.ttf", 11, -5428);

    /* renamed from: x */
    public static C0177m f2956x = new C0177m(f2940h, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -16777216);

    /* renamed from: y */
    public static C0177m f2957y = new C0177m(f2940h, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -16711681);

    /* renamed from: z */
    public static C0177m f2958z = new C0177m(f2940h, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0, "myfont/chelthm.ttf", 9, -16755931);

    /* renamed from: a */
    private int f2959a;

    /* renamed from: b */
    private int f2960b;

    /* renamed from: c */
    private C0143b f2961c;

    /* renamed from: d */
    private String f2962d;

    /* renamed from: e */
    private int[][] f2963e;

    /* renamed from: f */
    String f2964f;

    /* renamed from: g */
    public C0169e f2965g;

    static {
        new C0177m(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0, "myfont/chelthm.ttf", 8, -8401);
        new C0177m(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0, "myfont/chelthm.ttf", 8, -1815979);
        new C0177m(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0, "myfont/chelthm.ttf", 8, -12652317);
        new C0177m(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0, "myfont/chelthm.ttf", 8, -680904);
        new C0177m(f2940h, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0, "myfont/staccato.ttf", 12, -1);
        new C0177m(f2940h, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0, "myfont/staccato.ttf", 12, -10256897);
    }

    public C0177m(String str, String str2, String str3, int i, String str4, int i2, int i3) {
        DataInputStream dataInputStream;
        Exception e;
        if (C0159f.f2750b > 1) {
            this.f2965g = new C0169e(str4, i2, i3);
            return;
        }
        try {
            this.f2962d = str;
            this.f2959a = i;
            this.f2964f = str2;
            mo915g();
            try {
                dataInputStream = new DataInputStream(C0148a.m1395a(str3));
                try {
                    this.f2963e = new int[dataInputStream.readShort()][];
                    int i4 = 0;
                    while (true) {
                        int[][] iArr = this.f2963e;
                        if (i4 < iArr.length) {
                            iArr[i4] = new int[4];
                            iArr[i4][0] = dataInputStream.readShort();
                            this.f2963e[i4][1] = dataInputStream.readShort();
                            this.f2963e[i4][2] = dataInputStream.readShort();
                            this.f2963e[i4][3] = dataInputStream.readShort();
                            this.f2960b = this.f2963e[i4][3];
                            i4++;
                        } else {
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                Exception exc = e4;
                dataInputStream = null;
                e = exc;
                e.printStackTrace();
                dataInputStream.close();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo909a(C0159f fVar, String str, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        String str2 = str;
        int i7 = i3;
        C0169e eVar = this.f2965g;
        if (eVar != null) {
            eVar.mo828a(fVar, str, i, i2, i3);
            return;
        }
        int length = str.length();
        if (i7 == 0) {
            i4 = i;
        } else {
            int f = mo914f(str2);
            if (i7 != 1) {
                f >>= 1;
            }
            i4 = i - f;
        }
        int i8 = 0;
        while (i8 < length) {
            int indexOf = this.f2962d.indexOf(str2.charAt(i8));
            int i9 = indexOf == -1 ? 0 : indexOf;
            if (i9 > -1) {
                C0143b bVar = this.f2961c;
                int[][] iArr = this.f2963e;
                i6 = i9;
                i5 = i8;
                fVar.mo779h(bVar, iArr[i9][0], iArr[i9][1], iArr[i9][2], iArr[i9][3], 0, i4, i2, 20);
            } else {
                i6 = i9;
                i5 = i8;
            }
            i4 += this.f2963e[i6][2] + this.f2959a;
            i8 = i5 + 1;
        }
    }

    /* renamed from: b */
    public void mo910b(C0159f fVar, String str, int i, int i2, int i3, C0177m mVar) {
        if (mVar != null) {
            C0177m mVar2 = mVar;
            C0159f fVar2 = fVar;
            String str2 = str;
            int i4 = i3;
            mVar2.mo909a(fVar2, str2, i + 1, i2, i4);
            mVar2.mo909a(fVar2, str2, i, i2 + 1, i4);
        }
        mo909a(fVar, str, i, i2, i3);
    }

    /* renamed from: c */
    public void mo911c(C0159f fVar, String str, int i, int i2, int i3) {
        C0169e eVar = this.f2965g;
        if (eVar != null) {
            float[] fArr = new float[3];
            Color.colorToHSV(eVar.f2804b, fArr);
            fArr[2] = fArr[2] * 0.4f;
            this.f2965g.f2803a.setColor(Color.HSVToColor(fArr));
            int i4 = i - 1;
            int i5 = i2 - 1;
            this.f2965g.mo828a(fVar, str, i4, i5, i3);
            int i6 = i2 + 1;
            C0159f fVar2 = fVar;
            String str2 = str;
            int i7 = i3;
            this.f2965g.mo828a(fVar2, str2, i4, i6, i7);
            int i8 = i + 1;
            this.f2965g.mo828a(fVar2, str2, i8, i5, i7);
            this.f2965g.mo828a(fVar, str, i8, i6, i3);
            C0159f fVar3 = fVar;
            String str3 = str;
            int i9 = i;
            int i10 = i3;
            this.f2965g.mo828a(fVar3, str3, i9, i5, i10);
            this.f2965g.mo828a(fVar3, str3, i9, i6, i10);
            int i11 = i2;
            this.f2965g.mo828a(fVar3, str3, i8, i11, i10);
            this.f2965g.mo828a(fVar3, str3, i4, i11, i10);
            C0169e eVar2 = this.f2965g;
            eVar2.f2803a.setColor(eVar2.f2804b);
            this.f2965g.mo828a(fVar, str3, i, i11, i10);
            return;
        }
        mo909a(fVar, str, i, i2, i3);
    }

    /* renamed from: d */
    public void mo912d(C0159f fVar, String str, int i, int i2, int i3, C0177m mVar) {
        mo911c(fVar, str, i, i2, i3);
    }

    /* renamed from: e */
    public int mo913e() {
        C0169e eVar = this.f2965g;
        return eVar != null ? eVar.mo829b() : this.f2960b;
    }

    /* renamed from: f */
    public int mo914f(String str) {
        C0169e eVar = this.f2965g;
        if (eVar != null) {
            return eVar.mo830c(str);
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int indexOf = this.f2962d.indexOf(str.charAt(i2));
            if (indexOf == -1) {
                indexOf = 0;
            }
            i += this.f2963e[indexOf][2] + this.f2959a;
        }
        return i;
    }

    /* renamed from: g */
    public void mo915g() {
        this.f2961c = C0161h.m1494l(this.f2964f);
    }

    /* renamed from: h */
    public String[] mo916h(String str, int i) {
        C0173i i2 = mo917i(str, i);
        String[] strArr = new String[i2.size()];
        for (int i3 = 0; i3 < i2.size(); i3++) {
            strArr[i3] = i2.elementAt(i3).toString();
        }
        return strArr;
    }

    /* renamed from: i */
    public C0173i mo917i(String str, int i) {
        C0173i iVar = new C0173i("v Line");
        String str2 = "";
        int i2 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == 10 || str.charAt(i2) == 8) {
                iVar.addElement(str2);
                str2 = "";
            } else {
                str2 = str2 + str.charAt(i2);
                if (mo914f(str2) > i) {
                    int length = str2.length() - 1;
                    while (length >= 0 && str2.charAt(length) != ' ') {
                        length--;
                    }
                    if (length < 0) {
                        length = str2.length() - 1;
                    }
                    iVar.addElement(str2.substring(0, length));
                    i2 = (i2 - (str2.length() - length)) + 1;
                    str2 = "";
                }
                if (i2 == str.length() - 1 && !str2.trim().equals("")) {
                    iVar.addElement(str2);
                }
            }
            i2++;
        }
        return iVar;
    }
}
