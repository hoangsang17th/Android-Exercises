package p002c.p006b.p007a.p008a.p009a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: c.b.a.a.a.g */
class C0037g {
    /* renamed from: a */
    public static PublicKey m185a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        } catch (IllegalArgumentException e3) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw e3;
        }
    }

    /* renamed from: b */
    public static boolean m186b(PublicKey publicKey, String str, String str2) {
        String str3;
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            Log.e("IABUtil/Security", "Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException unused) {
            str3 = "NoSuchAlgorithmException.";
            Log.e("IABUtil/Security", str3);
            return false;
        } catch (InvalidKeyException unused2) {
            str3 = "Invalid key specification.";
            Log.e("IABUtil/Security", str3);
            return false;
        } catch (SignatureException unused3) {
            str3 = "Signature exception.";
            Log.e("IABUtil/Security", str3);
            return false;
        } catch (IllegalArgumentException unused4) {
            str3 = "Base64 decoding failed.";
            Log.e("IABUtil/Security", str3);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m187c(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str4)) {
            return m186b(m185a(str2), str3, str4);
        }
        if (str.equals("android.test.purchased") || str.equals("android.test.canceled") || str.equals("android.test.refunded") || str.equals("android.test.item_unavailable")) {
            return true;
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }
}
