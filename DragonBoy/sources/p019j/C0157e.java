package p019j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.blue.dragonball.MainActivity;
import p014h.p015a.p016a.C0142a;

@SuppressLint({"WrongCall", "NewApi"})
/* renamed from: j.e */
public abstract class C0157e extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    /* renamed from: e */
    public static int f2736e;

    /* renamed from: f */
    public static int f2737f;

    /* renamed from: g */
    public static boolean f2738g;

    /* renamed from: h */
    public static Activity f2739h;

    /* renamed from: i */
    public static Context f2740i;

    /* renamed from: j */
    public static boolean f2741j;

    /* renamed from: a */
    public Display f2742a;

    /* renamed from: b */
    C0142a f2743b = new C0142a();

    /* renamed from: c */
    public SurfaceHolder f2744c;

    /* renamed from: d */
    public C0158a f2745d;

    /* renamed from: j.e$a */
    public class C0158a extends Thread {

        /* renamed from: a */
        private C0157e f2746a;

        /* renamed from: b */
        private SurfaceHolder f2747b;

        /* renamed from: c */
        private boolean f2748c = false;

        public C0158a(C0157e eVar) {
            this.f2746a = eVar;
            this.f2747b = eVar.getHolder();
        }

        /* renamed from: a */
        public void mo767a(boolean z) {
            this.f2748c = z;
        }

        public void run() {
            Looper.prepare();
            long j = 0;
            while (this.f2748c) {
                long currentTimeMillis = System.currentTimeMillis();
                if (j < 30) {
                    try {
                        Thread.sleep(30 - j);
                    } catch (Exception unused) {
                    }
                } else {
                    Thread.sleep(1);
                }
                Canvas lockCanvas = this.f2747b.lockCanvas();
                if (lockCanvas != null) {
                    C0157e.this.mo733j();
                    this.f2746a.onDraw(lockCanvas);
                    this.f2747b.unlockCanvasAndPost(lockCanvas);
                }
                j = System.currentTimeMillis() - currentTimeMillis;
            }
        }
    }

    public C0157e() {
        super(MainActivity.f303h);
    }

    public C0157e(Context context) {
        super(context);
        getResources();
        this.f2744c = getHolder();
        f2740i = context;
        this.f2745d = new C0158a(this);
        Display defaultDisplay = MainActivity.f303h.getWindowManager().getDefaultDisplay();
        this.f2742a = defaultDisplay;
        f2736e = defaultDisplay.getWidth();
        int height = this.f2742a.getHeight();
        f2737f = height;
        m1438a(f2736e, height);
        setFocusable(true);
        setFocusableInTouchMode(true);
        getHolder().addCallback(this);
    }

    /* renamed from: a */
    private void m1438a(int i, int i2) {
        if ((i >= 1280 && i2 >= 960) || (i >= 1280 && i2 >= 960)) {
            i /= 4;
            i2 /= 4;
            C0159f.f2750b = 4;
        }
        if ((i >= 720 && i2 >= 960) || (i >= 960 && i2 >= 720)) {
            i /= 3;
            i2 /= 3;
            C0159f.f2750b = 3;
        }
        if ((i > 400 && i2 > 600) || (i > 600 && i2 > 400)) {
            int i3 = i / 2;
            int i4 = i2 / 2;
            C0159f.f2750b = 2;
        }
        C0161h.f2757e = mo755b(f2740i);
    }

    public static String getPlatformName() {
        return "AndroidDevice";
    }

    /* renamed from: b */
    public String mo755b(Context context) {
        return context.getPackageName();
    }

    /* renamed from: c */
    public boolean mo756c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo728d(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo730f(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo731g(int i, int i2);

    public int getHeightz() {
        int i = f2737f;
        int i2 = C0159f.f2750b;
        return (i / i2) + (f2737f % i2);
    }

    public int getWidthz() {
        int i = f2736e;
        int i2 = C0159f.f2750b;
        return (i / i2) + (f2736e % i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo732h(C0142a aVar);

    /* renamed from: i */
    public void mo759i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo733j();

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f2743b.mo711p(canvas);
        mo732h(this.f2743b);
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            mo731g(((int) motionEvent.getX()) / C0159f.f2750b, ((int) motionEvent.getY()) / C0159f.f2750b);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            mo730f(((int) motionEvent.getX()) / C0159f.f2750b, ((int) motionEvent.getY()) / C0159f.f2750b);
        } else if (action == 1) {
            mo731g(((int) motionEvent.getX()) / C0159f.f2750b, ((int) motionEvent.getY()) / C0159f.f2750b);
        } else if (action == 2) {
            mo728d(((int) motionEvent.getX()) / C0159f.f2750b, ((int) motionEvent.getY()) / C0159f.f2750b);
        }
        return true;
    }

    public void run() {
        Looper.prepare();
        f2738g = true;
        while (f2738g) {
            long currentTimeMillis = System.currentTimeMillis();
            Canvas lockCanvas = this.f2744c.lockCanvas();
            if (lockCanvas != null) {
                mo733j();
                onDraw(lockCanvas);
                this.f2744c.unlockCanvasAndPost(lockCanvas);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 < 30) {
                try {
                    Thread.sleep(30 - currentTimeMillis2);
                } catch (Exception unused) {
                }
            } else {
                Thread.sleep(1);
            }
        }
    }

    public void setFullScreenMode(boolean z) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.f2745d.isAlive()) {
            C0158a aVar = new C0158a(this);
            this.f2745d = aVar;
            aVar.mo767a(true);
            this.f2745d.start();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f2738g = false;
    }
}
