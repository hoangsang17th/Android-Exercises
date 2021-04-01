package p002c.p003a.p004a.p005a;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.blue.dragonball.MainActivity;
import p002c.p006b.p007a.p008a.p009a.C0028c;
import p002c.p006b.p007a.p008a.p009a.C0038h;
import p012f.C0105d;

/* renamed from: c.a.a.a.b */
public class C0025b implements C0028c.C0031c {

    /* renamed from: e */
    public static C0025b f257e;

    /* renamed from: a */
    private boolean f258a = false;

    /* renamed from: b */
    private C0028c f259b;

    /* renamed from: c */
    Activity f260c;

    /* renamed from: d */
    String f261d = "";

    /* renamed from: k */
    public static C0025b m114k() {
        if (f257e == null) {
            f257e = new C0025b();
        }
        return f257e;
    }

    /* renamed from: l */
    private void m115l(String str) {
        Toast.makeText(this.f260c, str, 1).show();
    }

    /* renamed from: a */
    public void mo43a(int i, Throwable th) {
    }

    /* renamed from: b */
    public void mo44b() {
    }

    /* renamed from: c */
    public void mo45c() {
        this.f258a = true;
    }

    /* renamed from: d */
    public void mo46d(String str, C0038h hVar) {
        C0038h r = this.f259b.mo70r(this.f261d);
        if (r != null) {
            C0105d.m365M().mo244R0(r.f294a, r.f296c, "");
        }
    }

    /* renamed from: e */
    public void mo47e() {
        C0028c cVar = this.f259b;
        if (cVar != null) {
            cVar.mo68G();
        }
    }

    /* renamed from: f */
    public void mo48f(String str) {
        if (this.f258a) {
            this.f261d = str;
            this.f259b.mo67D(this.f260c, str);
        }
    }

    /* renamed from: g */
    public boolean mo49g(int i, int i2, Intent intent) {
        return this.f259b.mo72u(i, i2, intent);
    }

    /* renamed from: h */
    public void mo50h(String str) {
        C0028c cVar = this.f259b;
        if (cVar != null) {
            cVar.mo69n(str);
        }
    }

    /* renamed from: i */
    public void mo51i() {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = MainActivity.f308m;
            if (i2 >= strArr.length) {
                break;
            }
            mo50h(strArr[i2]);
            i2++;
        }
        while (true) {
            String[] strArr2 = MainActivity.f309n;
            if (i < strArr2.length) {
                mo50h(strArr2[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public void mo52j(Activity activity) {
        this.f260c = activity;
        if (!C0028c.m161w(activity)) {
            m115l("In-app billing service is unavailable, please upgrade Android Market/Play to version >= 3.9.16");
        }
        C0028c cVar = new C0028c(this.f260c, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApgslP0nh/wZqFu3aple3STf7jcrjam/R9i2/ncZvKz0sBADcBR+BRBJYQjs0XnolEI/Y4D5xVZnIdYaZoQpBCvA230T1nln3gl8Mg+/kS4TUw5Hgy+AYLUsTTBhVJ9j77DxaTkFRppjaCu5CgQ2bjM0qOk1bvtm0yKv4s/EIv+VpLdIFG5x4mG2ajvDZnQB4IdNd0J8YJ+nHR4kIGE87/bzXztpZ1bqHMDuJ+MmX4Hb4UmoYOVMbUxLcw6SXz6sUDivj9+2YNWG4fpHyn0B2mDXgHaySSc+EHdDUSYcT08Aweh772vlPVT/lAVC/H29ShjTwe/wd0YLrge2FgqnVPwIDAQAB", this);
        this.f259b = cVar;
        cVar.mo73v();
    }
}
