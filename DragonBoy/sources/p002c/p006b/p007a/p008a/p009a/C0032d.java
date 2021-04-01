package p002c.p006b.p007a.p008a.p009a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* renamed from: c.b.a.a.a.d */
public class C0032d implements Parcelable {
    public static final Parcelable.Creator<C0032d> CREATOR = new C0033a();

    /* renamed from: a */
    public String f278a;

    /* renamed from: b */
    public String f279b;

    /* renamed from: c */
    public String f280c;

    /* renamed from: d */
    public Date f281d;

    /* renamed from: e */
    public C0036f f282e;

    /* renamed from: f */
    public String f283f;

    /* renamed from: g */
    public String f284g;

    /* renamed from: h */
    public boolean f285h;

    /* renamed from: c.b.a.a.a.d$a */
    class C0033a implements Parcelable.Creator<C0032d> {
        C0033a() {
        }

        /* renamed from: a */
        public C0032d createFromParcel(Parcel parcel) {
            return new C0032d(parcel);
        }

        /* renamed from: b */
        public C0032d[] newArray(int i) {
            return new C0032d[i];
        }
    }

    public C0032d() {
    }

    protected C0032d(Parcel parcel) {
        this.f278a = parcel.readString();
        this.f279b = parcel.readString();
        this.f280c = parcel.readString();
        long readLong = parcel.readLong();
        C0036f fVar = null;
        this.f281d = readLong == -1 ? null : new Date(readLong);
        int readInt = parcel.readInt();
        this.f282e = readInt != -1 ? C0036f.values()[readInt] : fVar;
        this.f283f = parcel.readString();
        this.f284g = parcel.readString();
        this.f285h = parcel.readByte() != 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f278a);
        parcel.writeString(this.f279b);
        parcel.writeString(this.f280c);
        Date date = this.f281d;
        parcel.writeLong(date != null ? date.getTime() : -1);
        C0036f fVar = this.f282e;
        parcel.writeInt(fVar == null ? -1 : fVar.ordinal());
        parcel.writeString(this.f283f);
        parcel.writeString(this.f284g);
        parcel.writeByte(this.f285h ? (byte) 1 : 0);
    }
}
