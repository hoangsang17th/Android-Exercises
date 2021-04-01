package p002c.p003a.p004a.p005a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: c.a.a.a.a */
public interface C0022a extends IInterface {

    /* renamed from: c.a.a.a.a$a */
    public static abstract class C0023a extends Binder implements C0022a {

        /* renamed from: c.a.a.a.a$a$a */
        private static class C0024a implements C0022a {

            /* renamed from: b */
            public static C0022a f255b;

            /* renamed from: a */
            private IBinder f256a;

            C0024a(IBinder iBinder) {
                this.f256a = iBinder;
            }

            /* renamed from: a */
            public int mo37a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f256a.transact(5, obtain, obtain2, 0) && C0023a.m108g() != null) {
                        return C0023a.m108g().mo37a(i, str, str2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f256a;
            }

            /* renamed from: b */
            public Bundle mo38b(int i, String str, List<String> list, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    int i2 = i;
                    obtain.writeInt(i);
                    String str5 = str;
                    obtain.writeString(str);
                    List<String> list2 = list;
                    obtain.writeStringList(list);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    try {
                        if (this.f256a.transact(7, obtain, obtain2, 0) || C0023a.m108g() == null) {
                            obtain2.readException();
                            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                            obtain2.recycle();
                            obtain.recycle();
                            return bundle;
                        }
                        Bundle b = C0023a.m108g().mo38b(i, str, list, str2, str3, str4);
                        obtain2.recycle();
                        obtain.recycle();
                        return b;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* renamed from: c */
            public Bundle mo39c(int i, String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (!this.f256a.transact(3, obtain, obtain2, 0) && C0023a.m108g() != null) {
                        return C0023a.m108g().mo39c(i, str, str2, str3, str4);
                    }
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public Bundle mo40d(int i, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.f256a.transact(4, obtain, obtain2, 0) && C0023a.m108g() != null) {
                        return C0023a.m108g().mo40d(i, str, str2, str3);
                    }
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public Bundle mo41e(int i, String str, String str2, String str3, String str4, Bundle bundle) {
                Bundle bundle2 = bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    int i2 = i;
                    obtain.writeInt(i);
                    String str5 = str;
                    obtain.writeString(str);
                    String str6 = str2;
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    try {
                        if (this.f256a.transact(8, obtain, obtain2, 0) || C0023a.m108g() == null) {
                            obtain2.readException();
                            Bundle bundle3 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                            obtain2.recycle();
                            obtain.recycle();
                            return bundle3;
                        }
                        Bundle e = C0023a.m108g().mo41e(i, str, str2, str3, str4, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return e;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        /* renamed from: f */
        public static C0022a m107f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0022a)) ? new C0024a(iBinder) : (C0022a) queryLocalInterface;
        }

        /* renamed from: g */
        public static C0022a m108g() {
            return C0024a.f255b;
        }
    }

    /* renamed from: a */
    int mo37a(int i, String str, String str2);

    /* renamed from: b */
    Bundle mo38b(int i, String str, List<String> list, String str2, String str3, String str4);

    /* renamed from: c */
    Bundle mo39c(int i, String str, String str2, String str3, String str4);

    /* renamed from: d */
    Bundle mo40d(int i, String str, String str2, String str3);

    /* renamed from: e */
    Bundle mo41e(int i, String str, String str2, String str3, String str4, Bundle bundle);
}
