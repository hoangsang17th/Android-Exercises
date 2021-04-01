package com.blue.dragonball;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import p002c.p003a.p004a.p005a.C0025b;
import p010d.C0045c;
import p011e.C0057d1;
import p012f.C0105d;
import p013g.C0140y;
import p018i.C0145a;
import p018i.C0146b;
import p019j.C0157e;
import p019j.C0161h;
import p019j.C0162i;
import p019j.C0163j;
import p020k.C0167c;
import p020k.C0170f;
import p020k.C0175k;
import p020k.C0176l;

public class MainActivity extends Activity implements Runnable {

    /* renamed from: d */
    public static RelativeLayout f299d;

    /* renamed from: e */
    public static ScrollView f300e;

    /* renamed from: f */
    public static RelativeLayout f301f;

    /* renamed from: g */
    public static AssetManager f302g;

    /* renamed from: h */
    public static MainActivity f303h;

    /* renamed from: i */
    public static C0146b f304i;

    /* renamed from: j */
    public static String[] f305j;

    /* renamed from: k */
    public static String[] f306k;

    /* renamed from: l */
    public static String[] f307l;

    /* renamed from: m */
    public static final String[] f308m;

    /* renamed from: n */
    public static final String[] f309n;

    /* renamed from: o */
    public static final String[][] f310o;

    /* renamed from: p */
    public static String[] f311p;

    /* renamed from: q */
    public static String[] f312q;

    /* renamed from: r */
    public static final String[][] f313r;

    /* renamed from: s */
    public static String[] f314s;

    /* renamed from: t */
    public static String[] f315t;

    /* renamed from: u */
    public static final String[][] f316u;

    /* renamed from: v */
    public static int f317v;

    /* renamed from: w */
    public static C0163j f318w;

    /* renamed from: x */
    public static C0162i f319x = new C0162i();

    /* renamed from: y */
    public static int f320y = 0;

    /* renamed from: a */
    public boolean f321a;

    /* renamed from: b */
    public boolean f322b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f323c = new C0042c();

    /* renamed from: com.blue.dragonball.MainActivity$a */
    class C0040a extends Thread {
        C0040a() {
        }

        public void run() {
            Looper.prepare();
            MainActivity.this.f323c.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.blue.dragonball.MainActivity$b */
    class C0041b extends Thread {
        C0041b() {
        }

        public void run() {
            Looper.prepare();
            MainActivity.this.f323c.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.blue.dragonball.MainActivity$c */
    class C0042c extends Handler {
        C0042c() {
        }

        public void handleMessage(Message message) {
            MainActivity.this.mo110k();
        }
    }

    static {
        String[] strArr = {"nr_nap_25", "nr_nap_150", "nr_nap_350", "nr_nap_800", "nr_nap_2500"};
        f308m = strArr;
        String[] strArr2 = {"dbw_gold_1", "dbw_gold_2", "dbw_gold_5", "dbw_gold_10", "dbw_gold_20", "dbw_gold_50"};
        f309n = strArr2;
        f310o = new String[][]{strArr, strArr2};
        String[] strArr3 = {"Nạp 25 ngọc", "Nạp 150 ngọc", "Nạp 350 ngọc", "Nạp 800 ngọc", "Nạp 2500 ngọc"};
        f311p = strArr3;
        String[] strArr4 = {"HANDFUL OF GEMS - 40 GEMS ", "2 HANDFULS OF GEMS - 100 GEMS ", "BAG OF GEMS - 300 GEMS", "BUCKET OF GEMS - 650 GEMS", "BARREL OF GEMS - 1,400 GEMS", "CRATE OF GEMS - 3,750 GEMS"};
        f312q = strArr4;
        f313r = new String[][]{strArr3, strArr4};
        String[] strArr5 = {"22.000 VND", "109.000 VND", "219.000 VND", "449.000 VND", "1.099.000 VND"};
        f314s = strArr5;
        String[] strArr6 = {"$0.99", "$1.99", "$4.99", "$9.99", "$19.99", "$49.99"};
        f315t = strArr6;
        f316u = new String[][]{strArr5, strArr6};
    }

    /* renamed from: c */
    public static int m191c() {
        int i = f320y + 1;
        f320y = i;
        return i;
    }

    /* renamed from: d */
    public static void m192d() {
        try {
            C0025b.m114k().mo51i();
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m193e(C0045c cVar) {
        try {
            if (C0161h.f2759g) {
                C0025b.m114k().mo50h(cVar.mo128d().readUTF());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static void m194f(String str) {
        if (C0161h.f2759g) {
            C0025b.m114k().mo48f(str);
        }
    }

    /* renamed from: h */
    public static void m195h() {
        String[][] strArr = f310o;
        byte b = C0057d1.f680l5;
        f305j = strArr[b];
        f306k = f313r[b];
        f307l = f316u[b];
    }

    /* renamed from: b */
    public void mo105b() {
        if (this.f321a) {
            C0161h.f2756d = true;
            C0105d.m365M().mo305t((byte) 0);
            this.f321a = false;
            if (C0161h.f2756d) {
                C0145a.m1348W(C0161h.f2755c, 999, (Object) null);
                C0161h.m1501s();
            } else {
                C0145a.m1349X("Vui lòng thử lại sau 5 giây");
            }
        }
        if (this.f322b) {
            C0105d.m365M().mo305t((byte) 1);
            this.f322b = false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0167c cVar;
        C0167c cVar2;
        if (C0163j.f2764g) {
            for (int i = 0; i < f319x.mo800d(); i++) {
                if (((C0176l) f319x.mo798b(i)).f2920v == f318w.f2765a && motionEvent.getY() < ((float) (C0163j.f2762e - C0163j.f2763f))) {
                    C0163j.f2764g = false;
                    f303h.mo107g();
                    if (C0167c.m1522b().f2790b) {
                        C0167c.m1522b().f2790b = false;
                    }
                    C0140y yVar = C0145a.f2629e0;
                    if (!(yVar == null || (cVar2 = yVar.f2395C) == null)) {
                        cVar2.f2790b = false;
                    }
                    C0140y yVar2 = C0145a.f2631f0;
                    if (!(yVar2 == null || (cVar = yVar2.f2395C) == null)) {
                        cVar.f2790b = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: g */
    public void mo107g() {
        if (f318w != null) {
            f317v = 2;
            new C0041b().start();
        }
    }

    /* renamed from: i */
    public void mo108i(C0157e eVar) {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        f299d = relativeLayout;
        relativeLayout.addView(eVar);
        f300e = new ScrollView(this);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        f301f = relativeLayout2;
        f300e.addView(relativeLayout2);
        f299d.addView(f300e);
        setContentView(f299d);
        f299d.setFocusable(true);
        f299d.setFocusableInTouchMode(true);
        f300e.setFocusable(true);
        f300e.setFocusableInTouchMode(true);
        f301f.setFocusable(true);
        f301f.setFocusableInTouchMode(true);
    }

    /* renamed from: j */
    public void mo109j(int i, C0163j jVar) {
        f317v = i;
        f318w = jVar;
        new C0040a().start();
    }

    /* renamed from: k */
    public void mo110k() {
        int i = f317v;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            f301f.addView(f318w);
            f317v = 0;
            f318w.requestFocus();
            f318w.setFocusable(true);
            f318w.setFocusableInTouchMode(true);
            ((InputMethodManager) f303h.getSystemService("input_method")).showSoftInput(f318w, 0);
        } else if (i == 2) {
            f301f.removeView(f318w);
            f317v = 0;
            f318w = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C0025b.m114k().mo49g(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        f302g = getAssets();
        f303h = this;
        C0146b bVar = new C0146b();
        f304i = bVar;
        bVar.mo737d(this);
        mo108i(C0146b.f2677e);
        C0157e.f2739h = this;
        C0175k.m1564w(f302g);
        ((KeyguardManager) getSystemService("keyguard")).newKeyguardLock("keyguard").disableKeyguard();
        C0025b.m114k().mo52j(this);
    }

    public void onDestroy() {
        f319x.mo799c();
        Process.killProcess(Process.myPid());
        super.onDestroy();
        C0025b.m114k().mo47e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0167c cVar;
        C0167c cVar2;
        if (i != 82 && i != 4 && i != 176) {
            if (i == 3 && C0145a.m1337G()) {
                C0146b.f2678f.mo736c();
            }
            return super.onKeyDown(i, keyEvent);
        } else if (C0145a.f2637i0 != null) {
            return false;
        } else {
            if (C0163j.f2764g) {
                C0163j.f2764g = false;
                f303h.mo107g();
                ((MainActivity) C0157e.f2739h).mo109j(2, f318w);
                if (C0167c.m1522b().f2790b) {
                    C0167c.m1522b().f2793e.mo139d();
                    C0167c.m1522b().f2789a.mo896b();
                }
                C0140y yVar = C0145a.f2629e0;
                if (!(yVar == null || !yVar.f2467a || (cVar2 = yVar.f2395C) == null)) {
                    cVar2.f2793e.mo139d();
                    C0145a.f2629e0.f2395C.f2789a.mo896b();
                }
                C0140y yVar2 = C0145a.f2631f0;
                if (yVar2 == null || !yVar2.f2467a || (cVar = yVar2.f2395C) == null) {
                    return true;
                }
                cVar.f2793e.mo139d();
                C0145a.f2631f0.f2395C.f2789a.mo896b();
                return true;
            }
            C0145a.m1356k();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (C0145a.f2634g1) {
            if (C0145a.f2633g0 == null) {
                C0145a.f2633g0 = new C0170f();
            }
            C0145a.f2634g1 = false;
            C0170f.f2805J = true;
            C0145a.m1366v();
            C0145a.f2633g0.mo834n();
        }
        super.onResume();
    }

    public void run() {
    }
}
