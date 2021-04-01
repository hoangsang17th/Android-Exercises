package p002c.p006b.p007a.p008a.p009a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.Locale;

/* renamed from: c.b.a.a.a.h */
public class C0038h implements Parcelable {
    public static final Parcelable.Creator<C0038h> CREATOR = new C0039a();
    @Deprecated

    /* renamed from: a */
    public final String f294a;
    @Deprecated

    /* renamed from: b */
    public final String f295b;
    @Deprecated

    /* renamed from: c */
    public final String f296c;
    @Deprecated

    /* renamed from: d */
    public final Date f297d;

    /* renamed from: e */
    public final C0034e f298e;

    /* renamed from: c.b.a.a.a.h$a */
    class C0039a implements Parcelable.Creator<C0038h> {
        C0039a() {
        }

        /* renamed from: a */
        public C0038h createFromParcel(Parcel parcel) {
            return new C0038h(parcel);
        }

        /* renamed from: b */
        public C0038h[] newArray(int i) {
            return new C0038h[i];
        }
    }

    protected C0038h(Parcel parcel) {
        C0034e eVar = (C0034e) parcel.readParcelable(C0034e.class.getClassLoader());
        this.f298e = eVar;
        C0032d dVar = eVar.f288c;
        this.f294a = dVar.f280c;
        this.f295b = dVar.f278a;
        this.f296c = dVar.f284g;
        this.f297d = dVar.f281d;
    }

    public C0038h(C0034e eVar) {
        this.f298e = eVar;
        C0032d dVar = eVar.f288c;
        this.f294a = dVar.f280c;
        this.f295b = dVar.f278a;
        this.f296c = dVar.f284g;
        this.f297d = dVar.f281d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0038h.class != obj.getClass()) {
            return false;
        }
        String str = this.f295b;
        String str2 = ((C0038h) obj).f295b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f295b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "%s purchased at %s(%s). Token: %s, Signature: %s", new Object[]{this.f294a, this.f297d, this.f295b, this.f296c, this.f298e.f287b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f298e, i);
    }
}
