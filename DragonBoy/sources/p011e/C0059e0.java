package p011e;

import p013g.C0117f0;
import p013g.C0126k;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0159f;
import p019j.C0161h;
import p020k.C0177m;
import p020k.C0178n;

/* renamed from: e.e0 */
public class C0059e0 {

    /* renamed from: a */
    public static int f789a = 15787715;

    /* renamed from: b */
    public static C0143b[] f790b = new C0143b[6];

    /* renamed from: c */
    public static int f791c = 24;

    /* renamed from: d */
    public static int f792d = 0;

    static {
        int i = 0;
        while (true) {
            C0143b[] bVarArr = f790b;
            if (i < bVarArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("/mainImage/myTexture2dgoc");
                int i2 = i + 1;
                sb.append(i2);
                sb.append(".png");
                bVarArr[i] = C0161h.m1494l(sb.toString());
                i = i2;
            } else {
                C0161h.m1494l("/mainImage/myTexture2dcheck.png");
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo141a(C0159f fVar, C0055d dVar, C0055d dVar2, C0055d dVar3) {
        boolean z = C0145a.f2659x;
        C0177m mVar = C0177m.f2951s;
        if (dVar != null) {
            int f = mVar.mo914f(dVar.f400a);
            f792d = f;
            if (f > 0) {
                if (dVar.f407h < 0 || dVar.f408i <= 0) {
                    fVar.mo776e(C0178n.f2969g == 0 ? C0126k.f1838A3 : C0126k.f2054z3, 1, (C0145a.f2616W - C0178n.f2968f) - 1, 0);
                    mVar.mo909a(fVar, dVar.f400a, 35, (C0145a.f2616W - C0178n.f2968f) + 3 + 3, 2);
                } else {
                    dVar.mo138b(fVar);
                }
            }
        }
        if (dVar2 != null) {
            int f2 = mVar.mo914f(dVar2.f400a);
            f792d = f2;
            if (f2 > 0) {
                if (dVar2.f407h <= 0 || dVar2.f408i <= 0) {
                    fVar.mo776e(C0178n.f2969g == 1 ? C0126k.f1838A3 : C0126k.f2054z3, C0145a.f2621a0 - 35, (C0145a.f2616W - C0178n.f2968f) - 1, 0);
                    mVar.mo909a(fVar, dVar2.f400a, C0145a.f2621a0, (C0145a.f2616W - C0178n.f2968f) + 3 + 3, 2);
                } else {
                    dVar2.mo138b(fVar);
                }
            }
        }
        if (dVar3 != null) {
            int f3 = mVar.mo914f(dVar3.f400a);
            f792d = f3;
            if (f3 <= 0) {
                return;
            }
            if (dVar3.f407h <= 0 || dVar3.f408i <= 0) {
                fVar.mo776e(C0178n.f2969g == 2 ? C0126k.f1838A3 : C0126k.f2054z3, C0145a.f2614V - 71, (C0145a.f2616W - C0178n.f2968f) - 1, 0);
                mVar.mo909a(fVar, dVar3.f400a, C0145a.f2614V - 35, (C0145a.f2616W - C0178n.f2968f) + 3 + 3, 2);
                return;
            }
            dVar3.mo138b(fVar);
        }
    }

    /* renamed from: b */
    public void mo142b(int i, int i2, int i3, int i4, C0159f fVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        C0159f fVar2 = fVar;
        fVar2.mo772D(13524492);
        fVar2.mo778g(i5 + 6, i6, i7 - 12, i8);
        fVar2.mo778g(i5, i6 + 6, i7, i8 - 12);
        fVar2.mo778g(i5 + 7, i6 + 1, i7 - 14, i8 - 2);
        int i9 = i8 - 14;
        fVar2.mo778g(i5 + 1, i6 + 7, i7 - 2, i9);
        fVar2.mo772D(14338484);
        fVar2.mo783l(i5 + 8, i6 + 2, i7 - 16, i8 - 3);
        fVar2.mo783l(i5 + 2, i6 + 8, i7 - 3, i9);
        fVar2.mo776e(C0145a.f2664z0[2], i5, i6, 20);
        int i10 = i7 + i5 + 1;
        fVar.mo779h(C0145a.f2664z0[2], 0, 0, 16, 16, 2, i10, i2, C0117f0.f1676b);
        int i11 = i6 + i8 + 1;
        fVar.mo779h(C0145a.f2664z0[2], 0, 0, 16, 16, 1, i5, i11, C0117f0.f1678d);
        fVar.mo779h(C0145a.f2664z0[2], 0, 0, 16, 16, 3, i10, i11, C0117f0.f1679e);
    }

    /* renamed from: c */
    public void mo143c(int i, int i2, int i3, int i4, C0159f fVar) {
        fVar.mo772D(6702080);
        fVar.mo783l(i, i2, i3, i4);
        fVar.mo772D(14338484);
        fVar.mo783l(i + 1, i2 + 1, i3 - 2, i4 - 2);
    }

    /* renamed from: d */
    public void mo144d(int i, int i2, int i3, int i4, C0159f fVar) {
        fVar.mo772D(9340251);
        int i5 = i + 18;
        int i6 = (i3 - 36) / 2;
        int i7 = i6 - 32;
        fVar.mo778g(i5, i2, i7, i4);
        int i8 = i5 + i6;
        int i9 = i8 + 32;
        fVar.mo778g(i9, i2, i6 - 22, i4);
        fVar.mo778g(i, i2 + 8, i3, i4 - 17);
        fVar.mo772D(f789a);
        int i10 = i2 + 3;
        int i11 = i4 - 4;
        fVar.mo783l(i5, i10, i7, i11);
        fVar.mo783l(i8 + 31, i10, ((i3 - 38) / 2) - 22, i11);
        int i12 = i + 1;
        fVar.mo783l(i12, i2 + 6, i3 - 1, i4 - 11);
        fVar.mo772D(14667919);
        int i13 = i2 + 1;
        fVar.mo783l(i5, i13, i7, 2);
        fVar.mo783l(i9, i13, i6 - 12, 2);
        int i14 = i2 + i4;
        int i15 = i14 - 2;
        int i16 = i6 - 31;
        fVar.mo783l(i5, i15, i16, 2);
        fVar.mo783l(i9, i15, i16, 2);
        int i17 = i2 + 11;
        int i18 = i4 - 18;
        fVar.mo783l(i12, i17, 2, i18);
        int i19 = i + i3;
        fVar.mo783l(i19 - 2, i17, 2, i18);
        int i20 = i - 3;
        int i21 = i2 - 2;
        fVar.mo776e(f790b[0], i20, i21, 20);
        fVar.mo776e(f790b[2], i19 + 3, i21, C0117f0.f1676b);
        fVar.mo776e(f790b[1], i20, i14 + 3, C0117f0.f1678d);
        fVar.mo776e(f790b[3], i19 + 4, i14 + 2, C0117f0.f1679e);
        int i22 = i + (i3 / 2);
        fVar.mo776e(f790b[4], i22, i2, C0117f0.f1675a);
        fVar.mo776e(f790b[5], i22, i14 + 1, C0117f0.f1677c);
    }

    /* renamed from: e */
    public void mo145e(C0159f fVar) {
    }
}
