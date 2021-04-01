package p001b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import p013g.C0111c0;
import p013g.C0117f0;
import p014h.p015a.p016a.C0143b;
import p018i.C0145a;
import p019j.C0148a;
import p019j.C0159f;

/* renamed from: b.f */
public class C0010f {

    /* renamed from: a */
    public C0143b f153a;

    /* renamed from: b */
    public C0017m[] f154b;

    /* renamed from: c */
    public C0015k[] f155c;

    /* renamed from: d */
    public short[] f156d;

    /* renamed from: e */
    public int f157e;

    /* renamed from: f */
    public int f158f;

    /* renamed from: g */
    public int f159g;

    /* renamed from: a */
    public C0017m mo22a(byte b) {
        int i = 0;
        while (true) {
            C0017m[] mVarArr = this.f154b;
            if (i >= mVarArr.length) {
                return null;
            }
            if (mVarArr[i].f214a == b) {
                return mVarArr[i];
            }
            i++;
        }
    }

    /* renamed from: b */
    public void mo23b(C0159f fVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = i4;
        int i7 = i5;
        C0015k[] kVarArr = this.f155c;
        if (kVarArr != null && kVarArr.length != 0) {
            C0015k kVar = kVarArr[i];
            for (int i8 = 0; i8 < kVar.f207a.length; i8++) {
                C0017m a = mo22a(kVar.f209c[i8]);
                if (i6 == 0) {
                    try {
                        fVar.mo779h(this.f153a, a.f215b, a.f216c, a.f217d, a.f218e, 0, i2 + kVar.f207a[i8], (i3 + kVar.f208b[i8]) - ((i7 >= 4 || i7 <= 0) ? 0 : C0145a.f2595L0), 0);
                    } catch (Exception unused) {
                    }
                }
                if (i6 == 1) {
                    fVar.mo779h(this.f153a, a.f215b, a.f216c, a.f217d, a.f218e, 2, i2 - kVar.f207a[i8], (i3 + kVar.f208b[i8]) - ((i7 >= 4 || i7 <= 0) ? 0 : C0145a.f2595L0), C0117f0.f1676b);
                }
                if (i6 == 2) {
                    fVar.mo779h(this.f153a, a.f215b, a.f216c, a.f217d, a.f218e, 7, i2 - kVar.f207a[i8], (i3 + kVar.f208b[i8]) - ((i7 >= 4 || i7 <= 0) ? 0 : C0145a.f2595L0), C0117f0.f1680f);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo24c(DataInputStream dataInputStream) {
        try {
            int readByte = dataInputStream.readByte();
            C0111c0.m584k("small num= " + readByte);
            this.f154b = new C0017m[readByte];
            for (int i = 0; i < readByte; i++) {
                C0017m[] mVarArr = this.f154b;
                mVarArr[i] = new C0017m();
                mVarArr[i].f214a = dataInputStream.readByte();
                this.f154b[i].f215b = dataInputStream.readByte();
                this.f154b[i].f216c = dataInputStream.readByte();
                this.f154b[i].f217d = dataInputStream.readByte();
                this.f154b[i].f218e = dataInputStream.readByte();
            }
            int readShort = dataInputStream.readShort();
            C0111c0.m584k("nFrame= " + readShort + "---------------------------");
            this.f155c = new C0015k[readShort];
            short s = 0;
            short s2 = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < readShort; i4++) {
                this.f155c[i4] = new C0015k();
                int readByte2 = dataInputStream.readByte();
                C0015k[] kVarArr = this.f155c;
                kVarArr[i4].f207a = new short[readByte2];
                kVarArr[i4].f208b = new short[readByte2];
                kVarArr[i4].f209c = new byte[readByte2];
                for (int i5 = 0; i5 < readByte2; i5++) {
                    this.f155c[i4].f207a[i5] = dataInputStream.readShort();
                    this.f155c[i4].f208b[i5] = dataInputStream.readShort();
                    this.f155c[i4].f209c[i5] = dataInputStream.readByte();
                    if (i4 == 0) {
                        C0015k[] kVarArr2 = this.f155c;
                        if (s > kVarArr2[i4].f207a[i5]) {
                            s = kVarArr2[i4].f207a[i5];
                        }
                        if (s2 > kVarArr2[i4].f208b[i5]) {
                            s2 = kVarArr2[i4].f208b[i5];
                        }
                        short s3 = kVarArr2[i4].f207a[i5];
                        C0017m[] mVarArr2 = this.f154b;
                        if (i2 < s3 + mVarArr2[kVarArr2[i4].f209c[i5]].f217d) {
                            i2 = kVarArr2[i4].f207a[i5] + mVarArr2[kVarArr2[i4].f209c[i5]].f217d;
                        }
                        if (i3 < kVarArr2[i4].f208b[i5] + mVarArr2[kVarArr2[i4].f209c[i5]].f218e) {
                            i3 = kVarArr2[i4].f208b[i5] + mVarArr2[kVarArr2[i4].f209c[i5]].f218e;
                        }
                        this.f158f = i2 - s;
                        this.f159g = i3 - s2;
                    }
                }
            }
            int readShort2 = dataInputStream.readShort();
            C0111c0.m584k("nFrame count = " + readShort2 + " ...........................................................");
            this.f156d = new short[readShort2];
            for (int i6 = 0; i6 < readShort2; i6++) {
                this.f156d[i6] = dataInputStream.readShort();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo25d(String str) {
        try {
            mo24c(new DataInputStream(C0148a.m1395a(str)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public void mo26e(byte[] bArr) {
        mo24c(new DataInputStream(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: f */
    public void mo27f(String str) {
        try {
            mo29h(new DataInputStream(C0148a.m1395a(str)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public void mo28g(byte[] bArr) {
        mo29h(new DataInputStream(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: h */
    public void mo29h(DataInputStream dataInputStream) {
        try {
            int readByte = dataInputStream.readByte();
            this.f154b = new C0017m[readByte];
            int i = 0;
            for (int i2 = 0; i2 < readByte; i2++) {
                C0017m[] mVarArr = this.f154b;
                mVarArr[i2] = new C0017m();
                mVarArr[i2].f214a = dataInputStream.readByte();
                this.f154b[i2].f215b = (short) dataInputStream.readUnsignedByte();
                this.f154b[i2].f216c = (short) dataInputStream.readUnsignedByte();
                this.f154b[i2].f217d = (short) dataInputStream.readUnsignedByte();
                this.f154b[i2].f218e = (short) dataInputStream.readUnsignedByte();
            }
            this.f155c = new C0015k[dataInputStream.readShort()];
            int i3 = 0;
            short s = 0;
            short s2 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                C0015k[] kVarArr = this.f155c;
                if (i3 >= kVarArr.length) {
                    break;
                }
                kVarArr[i3] = new C0015k();
                int readByte2 = dataInputStream.readByte();
                C0015k[] kVarArr2 = this.f155c;
                kVarArr2[i3].f207a = new short[readByte2];
                kVarArr2[i3].f208b = new short[readByte2];
                kVarArr2[i3].f209c = new byte[readByte2];
                for (int i6 = 0; i6 < readByte2; i6++) {
                    this.f155c[i3].f207a[i6] = dataInputStream.readShort();
                    this.f155c[i3].f208b[i6] = dataInputStream.readShort();
                    this.f155c[i3].f209c[i6] = dataInputStream.readByte();
                    if (i3 == 0) {
                        C0015k[] kVarArr3 = this.f155c;
                        if (s > kVarArr3[i3].f207a[i6]) {
                            s = kVarArr3[i3].f207a[i6];
                        }
                        if (s2 > kVarArr3[i3].f208b[i6]) {
                            s2 = kVarArr3[i3].f208b[i6];
                        }
                        short s3 = kVarArr3[i3].f207a[i6];
                        C0017m[] mVarArr2 = this.f154b;
                        if (i4 < s3 + mVarArr2[kVarArr3[i3].f209c[i6]].f217d) {
                            i4 = kVarArr3[i3].f207a[i6] + mVarArr2[kVarArr3[i3].f209c[i6]].f217d;
                        }
                        if (i5 < kVarArr3[i3].f208b[i6] + mVarArr2[kVarArr3[i3].f209c[i6]].f218e) {
                            i5 = kVarArr3[i3].f208b[i6] + mVarArr2[kVarArr3[i3].f209c[i6]].f218e;
                        }
                        this.f158f = i4 - s;
                        this.f159g = i5 - s2;
                    }
                }
                i3++;
            }
            this.f156d = new short[dataInputStream.readShort()];
            while (true) {
                short[] sArr = this.f156d;
                if (i < sArr.length) {
                    sArr[i] = dataInputStream.readShort();
                    i++;
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
