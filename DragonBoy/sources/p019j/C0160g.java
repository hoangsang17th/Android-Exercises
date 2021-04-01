package p019j;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/* renamed from: j.g */
public class C0160g {

    /* renamed from: a */
    Socket f2752a;

    public C0160g(String str, int i) {
        try {
            this.f2752a = new Socket(str, i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo793a() {
        try {
            this.f2752a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public DataInputStream mo794b() {
        try {
            return new DataInputStream(this.f2752a.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public DataOutputStream mo795c() {
        try {
            return new DataOutputStream(this.f2752a.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public void mo796d(boolean z) {
        try {
            this.f2752a.setKeepAlive(z);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
