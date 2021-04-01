package p011e;

import p013g.C0111c0;
import p013g.C0114e;
import p013g.C0137v;
import p019j.C0159f;
import p020k.C0174j;

/* renamed from: e.b */
public class C0049b {

    /* renamed from: l */
    public static final byte[] f345l = {0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};

    /* renamed from: m */
    public static final int[] f346m = {0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};

    /* renamed from: n */
    public static final int[] f347n = {0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};

    /* renamed from: a */
    public int f348a = 0;

    /* renamed from: b */
    public int f349b;

    /* renamed from: c */
    public int f350c;

    /* renamed from: d */
    public int f351d;

    /* renamed from: e */
    public int f352e;

    /* renamed from: f */
    public int f353f;

    /* renamed from: g */
    public int f354g;

    /* renamed from: h */
    public int f355h;

    /* renamed from: i */
    public int f356i;

    /* renamed from: j */
    public C0114e f357j;

    /* renamed from: k */
    public C0052c f358k = null;

    public C0049b(C0114e eVar, C0052c cVar) {
        this.f357j = eVar;
        this.f358k = cVar;
    }

    /* renamed from: a */
    private void m213a() {
        C0114e eVar = this.f357j;
        eVar.f1464N2 = null;
        this.f356i = 0;
        this.f355h = 0;
        this.f354g = 0;
        this.f353f = 0;
        this.f352e = 0;
        this.f351d = 0;
        this.f350c = 0;
        this.f349b = 0;
        eVar.mo378E0();
        C0114e eVar2 = this.f357j;
        if (eVar2.f1569i0) {
            eVar2.mo372B0();
        }
    }

    /* renamed from: b */
    public static int m214b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f346m;
            if (i2 >= iArr.length - 1) {
                return 0;
            }
            if (i < iArr[i2] || i > iArr[i2 + 1]) {
                i2++;
            } else if (i2 >= 16) {
                return 0;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    public void mo130c(C0159f fVar) {
        int b = m214b(C0111c0.m575b(this.f351d - this.f349b, -(this.f352e - this.f350c)));
        C0174j.m1555c(fVar, this.f358k.f380b[f345l[b]], this.f349b, this.f350c, f347n[b], 3);
    }

    /* renamed from: d */
    public void mo131d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0114e eVar = this.f357j;
        C0137v vVar = eVar.f1452L0;
        if (!(vVar == null && eVar.f1472P0 == null)) {
            if (vVar != null) {
                this.f351d = vVar.f2315k;
                this.f352e = vVar.f2317l - (vVar.f2328v / 4);
            } else {
                C0114e eVar2 = eVar.f1472P0;
                if (eVar2 != null) {
                    this.f351d = eVar2.f1593n;
                    this.f352e = eVar2.f1598o - (eVar2.f1539c0 / 4);
                }
            }
            int i6 = this.f351d;
            int i7 = this.f349b;
            int i8 = i6 - i7;
            int i9 = this.f352e;
            int i10 = this.f350c;
            int i11 = i9 - i10;
            int i12 = i8 + i11;
            int i13 = i12 < 60 ? 3 : i12 < 30 ? 2 : 4;
            if (i7 != i6) {
                if ((i8 <= 0 || i8 >= 5) && (i8 >= 0 || i8 <= -5)) {
                    int i14 = (i6 - i7) << 2;
                    this.f353f = i14;
                    int i15 = this.f355h + i14;
                    this.f355h = i15;
                    this.f349b = i7 + (i15 >> i13);
                    this.f355h = i15 & 15;
                } else {
                    this.f349b = i6;
                }
            }
            if (i10 != i9) {
                if ((i11 <= 0 || i11 >= 5) && (i11 >= 0 || i11 <= -5)) {
                    int i16 = (i9 - i10) << 2;
                    this.f354g = i16;
                    int i17 = this.f356i + i16;
                    this.f356i = i17;
                    this.f350c = i10 + (i17 >> i13);
                    this.f356i = i17 & 15;
                } else {
                    this.f350c = i9;
                }
            }
            int i18 = 0;
            if (vVar != null) {
                int i19 = vVar.f2327u;
                i18 = i6 - (i19 / 4);
                i3 = (i19 / 4) + i6;
                int i20 = vVar.f2328v;
                i = i9 - (i20 / 4);
                i2 = (i20 / 4) + i9;
            } else {
                C0114e eVar3 = eVar.f1472P0;
                if (eVar3 != null) {
                    int i21 = eVar3.f1533b0;
                    i18 = i6 - (i21 / 4);
                    int i22 = (i21 / 4) + i6;
                    int i23 = eVar3.f1539c0;
                    i = i9 - (i23 / 4);
                    int i24 = i22;
                    i2 = (i23 / 4) + i9;
                    i3 = i24;
                } else {
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
            }
            int i25 = this.f348a;
            if (i25 > 0) {
                this.f348a = i25 - 1;
            }
            if (this.f348a != 0 && ((i4 = this.f349b) < i18 || i4 > i3 || (i5 = this.f350c) < i || i5 > i2)) {
                return;
            }
        }
        m213a();
    }
}
