package p002c.p006b.p007a.p008a.p009a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.b.a.a.a.e */
public class C0034e implements Parcelable {
    public static final Parcelable.Creator<C0034e> CREATOR = new C0035a();

    /* renamed from: a */
    public final String f286a;

    /* renamed from: b */
    public final String f287b;

    /* renamed from: c */
    public final C0032d f288c = mo88a();

    /* renamed from: c.b.a.a.a.e$a */
    class C0035a implements Parcelable.Creator<C0034e> {
        C0035a() {
        }

        /* renamed from: a */
        public C0034e createFromParcel(Parcel parcel) {
            return new C0034e(parcel);
        }

        /* renamed from: b */
        public C0034e[] newArray(int i) {
            return new C0034e[i];
        }
    }

    protected C0034e(Parcel parcel) {
        this.f286a = parcel.readString();
        this.f287b = parcel.readString();
    }

    public C0034e(String str, String str2) {
        this.f286a = str;
        this.f287b = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0032d mo88a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f286a);
            C0032d dVar = new C0032d();
            dVar.f278a = jSONObject.optString("orderId");
            dVar.f279b = jSONObject.optString("packageName");
            dVar.f280c = jSONObject.optString("productId");
            long optLong = jSONObject.optLong("purchaseTime", 0);
            dVar.f281d = optLong != 0 ? new Date(optLong) : null;
            dVar.f282e = C0036f.values()[jSONObject.optInt("purchaseState", 1)];
            dVar.f283f = jSONObject.optString("developerPayload");
            dVar.f284g = jSONObject.getString("purchaseToken");
            dVar.f285h = jSONObject.optBoolean("autoRenewing");
            return dVar;
        } catch (JSONException e) {
            Log.e("iabv3.purchaseInfo", "Failed to parse response data", e);
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0034e)) {
            return false;
        }
        C0034e eVar = (C0034e) obj;
        return this.f286a.equals(eVar.f286a) && this.f287b.equals(eVar.f287b) && this.f288c.f284g.equals(eVar.f288c.f284g) && this.f288c.f281d.equals(eVar.f288c.f281d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286a);
        parcel.writeString(this.f287b);
    }
}
