package p019j;

import com.blue.dragonball.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p013g.C0111c0;

/* renamed from: j.b */
public class C0149b {
    /* renamed from: a */
    public static void m1396a(String str) {
        try {
            new File(str).delete();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m1397b() {
        C0111c0.m584k("clear all");
        File[] listFiles = C0157e.f2740i.getFilesDir().listFiles();
        C0111c0.m584k("dir lent= " + listFiles.length);
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                C0111c0.m584k("dir name = " + listFiles[i].getName());
                C0157e.f2740i.getFileStreamPath(listFiles[i].getName()).delete();
                C0111c0.m584k("da xoa");
            }
        }
    }

    /* renamed from: c */
    public static final byte[] m1398c(String str) {
        try {
            MainActivity mainActivity = MainActivity.f303h;
            FileInputStream openFileInput = mainActivity.openFileInput(str + "1.9.3");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (openFileInput != null) {
                openFileInput.close();
                return byteArray;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: d */
    public static int m1399d(String str) {
        byte[] c = m1398c(str);
        if (c == null) {
            return -1;
        }
        return c[0];
    }

    /* renamed from: e */
    public static String m1400e(String str) {
        byte[] c = m1398c(str);
        if (c == null) {
            return null;
        }
        try {
            return new String(c, "UTF-8");
        } catch (Exception unused) {
            return new String(c);
        }
    }

    /* renamed from: f */
    public static void m1401f(String str) {
        m1402g("NRIP", str.getBytes());
    }

    /* renamed from: g */
    public static final void m1402g(String str, byte[] bArr) {
        C0111c0.m584k("save rms " + str);
        try {
            MainActivity mainActivity = MainActivity.f303h;
            FileOutputStream openFileOutput = mainActivity.openFileOutput(str + "1.9.3", 0);
            openFileOutput.write(bArr);
            if (openFileOutput != null) {
                openFileOutput.close();
            }
        } catch (Exception e) {
            C0111c0.m584k("bi loi " + e);
        }
    }

    /* renamed from: h */
    public static void m1403h(String str, int i) {
        try {
            m1402g(str, new byte[]{(byte) i});
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static void m1404i(String str, String str2) {
        try {
            m1402g(str, str2.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
