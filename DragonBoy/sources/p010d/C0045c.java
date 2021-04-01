package p010d;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: d.c */
public class C0045c {

    /* renamed from: a */
    public byte f327a;

    /* renamed from: b */
    private ByteArrayOutputStream f328b = null;

    /* renamed from: c */
    private DataOutputStream f329c = null;

    /* renamed from: d */
    public ByteArrayInputStream f330d = null;

    /* renamed from: e */
    private DataInputStream f331e = null;

    public C0045c() {
    }

    public C0045c(byte b) {
        this.f327a = b;
        this.f328b = new ByteArrayOutputStream(1024);
        this.f329c = new DataOutputStream(this.f328b);
    }

    public C0045c(byte b, byte[] bArr) {
        this.f327a = b;
        this.f330d = new ByteArrayInputStream(bArr);
        this.f331e = new DataInputStream(this.f330d);
    }

    /* renamed from: a */
    public void mo125a() {
        try {
            DataInputStream dataInputStream = this.f331e;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            DataOutputStream dataOutputStream = this.f329c;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public byte[] mo126b() {
        return this.f328b.toByteArray();
    }

    /* renamed from: c */
    public int mo127c() {
        return this.f331e.readInt();
    }

    /* renamed from: d */
    public DataInputStream mo128d() {
        return this.f331e;
    }

    /* renamed from: e */
    public DataOutputStream mo129e() {
        return this.f329c;
    }
}
