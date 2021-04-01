package p019j;

import android.graphics.Paint;
import p013g.C0111c0;
import p014h.p015a.p016a.C0142a;
import p014h.p015a.p016a.C0143b;
import p018i.C0146b;

/* renamed from: j.f */
public class C0159f {

    /* renamed from: b */
    public static int f2750b = 1;

    /* renamed from: a */
    public C0142a f2751a;

    /* renamed from: b */
    public static C0143b m1448b(C0143b bVar, float f, int i) {
        C0111c0.m584k("blend");
        int h = bVar.mo718h() * bVar.mo715d();
        int[] iArr = new int[h];
        bVar.mo717g(iArr, 0, bVar.mo718h(), 0, 0, bVar.mo718h(), bVar.mo715d());
        float f2 = (float) ((i >> 16) & 255);
        float f3 = (float) ((i >> 8) & 255);
        float f4 = (float) (i & 255);
        for (int i2 = 0; i2 < h; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                float f5 = (float) ((i3 >> 16) & 255);
                float f6 = ((f2 - f5) * f) + f5;
                float f7 = (float) ((i3 >> 8) & 255);
                float f8 = ((f3 - f7) * f) + f7;
                float f9 = (float) ((i3 >> 0) & 255);
                float f10 = ((f4 - f9) * f) + f9;
                float f11 = 255.0f;
                if (f6 > 255.0f) {
                    f6 = 255.0f;
                }
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f8 > 255.0f) {
                    f8 = 255.0f;
                }
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 <= 255.0f) {
                    f11 = f10;
                }
                iArr[i2] = (((int) f11) & 255) | -16777216 | (((int) f6) << 16) | (((int) f8) << 8);
            }
        }
        return C0143b.m1323c(iArr, bVar.mo718h(), bVar.mo715d(), true);
    }

    /* renamed from: c */
    public static int m1449c(float f, int i, int i2) {
        float f2 = (float) ((i >> 16) & 255);
        float f3 = ((((float) ((i2 >> 16) & 255)) + f2) * f) + f2;
        float f4 = (float) ((i >> 8) & 255);
        float f5 = ((((float) ((i2 >> 8) & 255)) + f4) * f) + f4;
        float f6 = (float) ((i >> 0) & 255);
        float f7 = ((((float) (i2 & 255)) + f6) * f) + f6;
        float f8 = 255.0f;
        if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f5 > 255.0f) {
            f5 = 255.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 <= 255.0f) {
            f8 = f7;
        }
        return (((int) f8) & 255) | -16777216 | (((int) f3) << 16) | (((int) f5) << 8);
    }

    /* renamed from: t */
    public static int m1450t(C0143b bVar) {
        return bVar.mo715d() / f2750b;
    }

    /* renamed from: u */
    public static int m1451u(C0143b bVar) {
        return bVar.mo718h() / f2750b;
    }

    /* renamed from: v */
    public static int m1452v(C0143b bVar) {
        return bVar.mo715d();
    }

    /* renamed from: w */
    public static int m1453w(C0143b bVar) {
        return bVar.mo718h();
    }

    /* renamed from: z */
    public static void m1454z(C0159f fVar) {
        if (C0146b.m1385f()) {
            fVar.mo773E(-fVar.mo791x(), -fVar.mo792y());
            fVar.mo773E(0, 0);
        }
    }

    /* renamed from: A */
    public void mo769A() {
        if (C0146b.m1385f()) {
            this.f2751a.f2567a.restore();
        }
    }

    /* renamed from: B */
    public void mo770B() {
        if (C0146b.m1385f()) {
            this.f2751a.f2567a.save();
        }
    }

    /* renamed from: C */
    public void mo771C(int i, int i2, int i3, int i4) {
        int i5 = f2750b;
        this.f2751a.mo712q(i * i5, i2 * i5, i3 * i5, i4 * i5);
    }

    /* renamed from: D */
    public void mo772D(int i) {
        this.f2751a.mo713r(i);
    }

    /* renamed from: E */
    public void mo773E(int i, int i2) {
        int i3 = f2750b;
        this.f2751a.mo714s(i * i3, i2 * i3);
    }

    /* renamed from: a */
    public void mo774a(int i, int i2, int i3, int i4) {
        if (C0146b.m1385f()) {
            int i5 = f2750b;
            int i6 = i * i5;
            int i7 = i2 * i5;
            this.f2751a.f2567a.clipRect(i6, i7, (i3 * i5) + i6, (i4 * i5) + i7);
        }
    }

    /* renamed from: d */
    public void mo775d(C0143b bVar, float f, float f2, int i, boolean z) {
        int i2 = f2750b;
        float f3 = f2 * ((float) i2);
        this.f2751a.mo696a(bVar.f2571a, f * ((float) i2), f3, i);
    }

    /* renamed from: e */
    public void mo776e(C0143b bVar, int i, int i2, int i3) {
        int i4 = f2750b;
        this.f2751a.mo697b(bVar.f2571a, i * i4, i2 * i4, i3);
    }

    /* renamed from: f */
    public void mo777f(int i, int i2, int i3, int i4) {
        int i5 = f2750b;
        int i6 = i * i5;
        int i7 = i2 * i5;
        int i8 = i3 * i5;
        int i9 = i4 * i5;
        for (int i10 = 0; i10 < f2750b; i10++) {
            int i11 = i6 + i10;
            int i12 = i7 + i10;
            int i13 = i8 + i10;
            int i14 = i9 + i10;
            this.f2751a.mo698c(i11, i12, i13, i14);
            if (i10 > 0) {
                this.f2751a.mo698c(i11, i7, i13, i9);
                this.f2751a.mo698c(i6, i12, i8, i14);
            }
        }
    }

    /* renamed from: g */
    public void mo778g(int i, int i2, int i3, int i4) {
        int i5 = f2750b;
        int i6 = i * i5;
        int i7 = i2 * i5;
        int i8 = i3 * i5;
        int i9 = i4 * i5;
        for (int i10 = 0; i10 < f2750b; i10++) {
            int i11 = i10 * 2;
            this.f2751a.mo699d(i6 + i10, i7 + i10, i8 - i11, i9 - i11);
        }
    }

    /* renamed from: h */
    public void mo779h(C0143b bVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = f2750b;
        int i10 = i * i9;
        int i11 = i2 * i9;
        int i12 = i3 * i9;
        int i13 = i4 * i9;
        this.f2751a.mo700e(bVar.f2571a, i10, i11, i12, i13, i5, i6 * i9, i7 * i9, i8);
    }

    /* renamed from: i */
    public void mo780i(C0143b bVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = f2750b;
        int i10 = i * i9;
        int i11 = i2 * i9;
        int i12 = i3 * i9;
        int i13 = i4 * i9;
        this.f2751a.mo700e(bVar.f2571a, i10, i11, i12, i13, i5, i6 * i9, i7 * i9, i8);
    }

    /* renamed from: j */
    public void mo781j(String str, int i, int i2, int i3, Paint paint) {
        int i4 = f2750b;
        this.f2751a.mo701f(str, i * i4, i2 * i4, i3, paint);
    }

    /* renamed from: k */
    public void mo782k(int i, int i2, int i3, int i4, int i5, int i6) {
        C0142a aVar = this.f2751a;
        int i7 = f2750b;
        aVar.mo702g(i * i7, i2 * i7, i3 * i7, i4 * i7, i5 * i7, i6 * i7);
    }

    /* renamed from: l */
    public void mo783l(int i, int i2, int i3, int i4) {
        int i5 = f2750b;
        this.f2751a.mo703h(i * i5, i2 * i5, i3 * i5, i4 * i5);
    }

    /* renamed from: m */
    public void mo784m(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = f2750b;
        this.f2751a.mo713r(i5);
        this.f2751a.mo710o(i6);
        this.f2751a.mo703h(i * i7, i2 * i7, i3 * i7, i4 * i7);
    }

    /* renamed from: n */
    public void mo785n(int i, int i2, int i3, int i4, boolean z) {
        int i5 = f2750b;
        this.f2751a.mo703h(i * i5, i2 * i5, i3 * i5, i4 * i5);
    }

    /* renamed from: o */
    public void mo786o(C0143b bVar, int i, int i2, int i3, int i4) {
        this.f2751a.mo713r(0);
        this.f2751a.mo710o(90);
        C0142a aVar = this.f2751a;
        int i5 = f2750b;
        aVar.mo703h(i * i5, i2 * i5, i3 * i5, i4 * i5);
    }

    /* renamed from: p */
    public int mo787p() {
        return this.f2751a.mo704i() / f2750b;
    }

    /* renamed from: q */
    public int mo788q() {
        return this.f2751a.mo705j() / f2750b;
    }

    /* renamed from: r */
    public int mo789r() {
        return this.f2751a.mo706k() / f2750b;
    }

    /* renamed from: s */
    public int mo790s() {
        return this.f2751a.mo707l() / f2750b;
    }

    /* renamed from: x */
    public int mo791x() {
        return this.f2751a.mo708m() / f2750b;
    }

    /* renamed from: y */
    public int mo792y() {
        return this.f2751a.mo709n() / f2750b;
    }
}
