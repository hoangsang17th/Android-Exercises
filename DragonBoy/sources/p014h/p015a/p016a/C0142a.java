package p014h.p015a.p016a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import p018i.C0146b;
import p019j.C0159f;

/* renamed from: h.a.a.a */
public class C0142a {

    /* renamed from: e */
    public static int f2561e = 16;

    /* renamed from: f */
    public static int f2562f = 32;

    /* renamed from: g */
    public static int f2563g = 2;

    /* renamed from: h */
    public static int f2564h = 4;

    /* renamed from: i */
    public static int f2565i = 8;

    /* renamed from: j */
    public static int f2566j = 1;

    /* renamed from: a */
    public Canvas f2567a;

    /* renamed from: b */
    public int f2568b = 0;

    /* renamed from: c */
    public int f2569c = 0;

    /* renamed from: d */
    public Paint f2570d = new Paint();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r8 != 40) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo696a(android.graphics.Bitmap r5, float r6, float r7, int r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r2 = 3
            r3 = 0
            if (r8 == r2) goto L_0x003b
            r2 = 6
            if (r8 == r2) goto L_0x0037
            r2 = 10
            if (r8 == r2) goto L_0x003d
            r2 = 17
            if (r8 == r2) goto L_0x0034
            r2 = 20
            if (r8 == r2) goto L_0x002e
            r2 = 24
            if (r8 == r2) goto L_0x002f
            r2 = 33
            if (r8 == r2) goto L_0x0031
            r2 = 36
            if (r8 == r2) goto L_0x0039
            r2 = 40
            if (r8 == r2) goto L_0x003f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r1 = 0
            goto L_0x003f
        L_0x0031:
            int r0 = r0 / 2
            goto L_0x003f
        L_0x0034:
            int r0 = r0 / 2
            goto L_0x002f
        L_0x0037:
            int r1 = r1 / 2
        L_0x0039:
            r0 = 0
            goto L_0x003f
        L_0x003b:
            int r0 = r0 / 2
        L_0x003d:
            int r1 = r1 / 2
        L_0x003f:
            android.graphics.Canvas r8 = r4.f2567a
            float r0 = (float) r0
            float r6 = r6 - r0
            float r0 = (float) r1
            float r7 = r7 - r0
            r0 = 0
            r8.drawBitmap(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p014h.p015a.p016a.C0142a.mo696a(android.graphics.Bitmap, float, float, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r8 != 40) goto L_0x002e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo697b(android.graphics.Bitmap r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r2 = 3
            r3 = 0
            if (r8 == r2) goto L_0x003b
            r2 = 6
            if (r8 == r2) goto L_0x0037
            r2 = 10
            if (r8 == r2) goto L_0x003d
            r2 = 17
            if (r8 == r2) goto L_0x0034
            r2 = 20
            if (r8 == r2) goto L_0x002e
            r2 = 24
            if (r8 == r2) goto L_0x002f
            r2 = 33
            if (r8 == r2) goto L_0x0031
            r2 = 36
            if (r8 == r2) goto L_0x0039
            r2 = 40
            if (r8 == r2) goto L_0x003f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r1 = 0
            goto L_0x003f
        L_0x0031:
            int r0 = r0 / 2
            goto L_0x003f
        L_0x0034:
            int r0 = r0 / 2
            goto L_0x002f
        L_0x0037:
            int r1 = r1 / 2
        L_0x0039:
            r0 = 0
            goto L_0x003f
        L_0x003b:
            int r0 = r0 / 2
        L_0x003d:
            int r1 = r1 / 2
        L_0x003f:
            android.graphics.Canvas r8 = r4.f2567a
            int r6 = r6 - r0
            float r6 = (float) r6
            int r7 = r7 - r1
            float r7 = (float) r7
            r0 = 0
            r8.drawBitmap(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p014h.p015a.p016a.C0142a.mo697b(android.graphics.Bitmap, int, int, int):void");
    }

    /* renamed from: c */
    public void mo698c(int i, int i2, int i3, int i4) {
        this.f2567a.drawLine((float) i, (float) i2, (float) i3, (float) i4, this.f2570d);
    }

    /* renamed from: d */
    public void mo699d(int i, int i2, int i3, int i4) {
        this.f2570d.setStyle(Paint.Style.STROKE);
        this.f2567a.drawRect((float) i, (float) i2, (float) (i3 + i), (float) (i4 + i2), this.f2570d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        if (r14 != 40) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        r12 = r12 - r4;
        r13 = r13 - r11;
        r5.f2567a.clipRect(r12, r13, r9 + r12, r10 + r13);
        r5.f2567a.drawBitmap(r6, (float) (r12 - r7), (float) (r13 - r8), (android.graphics.Paint) null);
        r5.f2567a.restore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo700e(android.graphics.Bitmap r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.graphics.Canvas r0 = r5.f2567a
            r0.save()
            r0 = 4
            r1 = 6
            if (r11 == r0) goto L_0x0017
            r0 = 5
            if (r11 == r0) goto L_0x0017
            if (r11 == r1) goto L_0x0017
            r0 = 7
            if (r11 == r0) goto L_0x0017
            r0 = r9
            r2 = r10
            goto L_0x0019
        L_0x0017:
            r2 = r9
            r0 = r10
        L_0x0019:
            r3 = 3
            r4 = 0
            if (r14 == r3) goto L_0x0048
            if (r14 == r1) goto L_0x0044
            r1 = 10
            if (r14 == r1) goto L_0x004a
            r1 = 17
            if (r14 == r1) goto L_0x0041
            r1 = 20
            if (r14 == r1) goto L_0x003b
            r1 = 24
            if (r14 == r1) goto L_0x003c
            r1 = 33
            if (r14 == r1) goto L_0x003e
            r1 = 36
            if (r14 == r1) goto L_0x0046
            r1 = 40
            if (r14 == r1) goto L_0x004c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r2 = 0
            goto L_0x004c
        L_0x003e:
            int r0 = r0 / 2
            goto L_0x004c
        L_0x0041:
            int r0 = r0 / 2
            goto L_0x003c
        L_0x0044:
            int r2 = r2 / 2
        L_0x0046:
            r0 = 0
            goto L_0x004c
        L_0x0048:
            int r0 = r0 / 2
        L_0x004a:
            int r2 = r2 / 2
        L_0x004c:
            int r12 = r12 - r0
            int r13 = r13 - r2
            r14 = 1132920832(0x43870000, float:270.0)
            r0 = 1119092736(0x42b40000, float:90.0)
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r11) {
                case 1: goto L_0x0098;
                case 2: goto L_0x008f;
                case 3: goto L_0x0086;
                case 4: goto L_0x0079;
                case 5: goto L_0x0071;
                case 6: goto L_0x0069;
                case 7: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x00a6
        L_0x005c:
            android.graphics.Canvas r11 = r5.f2567a
            float r0 = (float) r12
            float r1 = (float) r13
            r11.scale(r3, r2, r0, r1)
            android.graphics.Canvas r11 = r5.f2567a
            r11.rotate(r14, r0, r1)
            goto L_0x008d
        L_0x0069:
            android.graphics.Canvas r11 = r5.f2567a
            float r0 = (float) r12
            float r1 = (float) r13
            r11.rotate(r14, r0, r1)
            goto L_0x0096
        L_0x0071:
            android.graphics.Canvas r11 = r5.f2567a
            float r14 = (float) r12
            float r1 = (float) r13
            r11.rotate(r0, r14, r1)
            goto L_0x00a4
        L_0x0079:
            android.graphics.Canvas r11 = r5.f2567a
            float r14 = (float) r12
            float r1 = (float) r13
            r11.scale(r3, r2, r14, r1)
            android.graphics.Canvas r11 = r5.f2567a
            r11.rotate(r0, r14, r1)
            goto L_0x00a6
        L_0x0086:
            android.graphics.Canvas r11 = r5.f2567a
            float r14 = (float) r12
            float r0 = (float) r13
            r11.rotate(r1, r14, r0)
        L_0x008d:
            r4 = r9
            goto L_0x00a4
        L_0x008f:
            android.graphics.Canvas r11 = r5.f2567a
            float r14 = (float) r12
            float r0 = (float) r13
            r11.scale(r3, r2, r14, r0)
        L_0x0096:
            r4 = r9
            goto L_0x00a6
        L_0x0098:
            android.graphics.Canvas r11 = r5.f2567a
            float r14 = (float) r12
            float r0 = (float) r13
            r11.scale(r3, r2, r14, r0)
            android.graphics.Canvas r11 = r5.f2567a
            r11.rotate(r1, r14, r0)
        L_0x00a4:
            r11 = r10
            goto L_0x00a7
        L_0x00a6:
            r11 = 0
        L_0x00a7:
            android.graphics.Canvas r14 = r5.f2567a
            int r12 = r12 - r4
            int r13 = r13 - r11
            int r9 = r9 + r12
            int r10 = r10 + r13
            r14.clipRect(r12, r13, r9, r10)
            android.graphics.Canvas r9 = r5.f2567a
            int r12 = r12 - r7
            float r7 = (float) r12
            int r13 = r13 - r8
            float r8 = (float) r13
            r10 = 0
            r9.drawBitmap(r6, r7, r8, r10)
            android.graphics.Canvas r6 = r5.f2567a
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p014h.p015a.p016a.C0142a.mo700e(android.graphics.Bitmap, int, int, int, int, int, int, int, int):void");
    }

    /* renamed from: f */
    public void mo701f(String str, int i, int i2, int i3, Paint paint) {
        Paint.Align align;
        if (i3 != 0) {
            if (i3 == 1) {
                align = Paint.Align.RIGHT;
            } else if (i3 == 2) {
                align = Paint.Align.CENTER;
            }
            paint.setTextAlign(align);
            this.f2567a.drawText(str, (float) i, (float) i2, paint);
        }
        align = Paint.Align.LEFT;
        paint.setTextAlign(align);
        this.f2567a.drawText(str, (float) i, (float) i2, paint);
    }

    /* renamed from: g */
    public void mo702g(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2570d.setStyle(Paint.Style.FILL);
        this.f2567a.drawArc(C0159f.f2750b == 2 ? new RectF((float) (i + 1), (float) i2, (float) (i + i3), (float) (i2 + i4)) : new RectF((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4)), (float) i5, (float) i6, false, this.f2570d);
    }

    /* renamed from: h */
    public void mo703h(int i, int i2, int i3, int i4) {
        this.f2570d.setStyle(Paint.Style.FILL);
        this.f2567a.drawRect((float) i, (float) i2, (float) (i3 + i), (float) (i4 + i2), this.f2570d);
    }

    /* renamed from: i */
    public int mo704i() {
        Rect clipBounds = this.f2567a.getClipBounds();
        if (clipBounds != null) {
            return clipBounds.height();
        }
        return 0;
    }

    /* renamed from: j */
    public int mo705j() {
        Rect clipBounds = this.f2567a.getClipBounds();
        if (clipBounds != null) {
            return clipBounds.width();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo706k() {
        Rect clipBounds = this.f2567a.getClipBounds();
        if (clipBounds != null) {
            return clipBounds.left;
        }
        return 0;
    }

    /* renamed from: l */
    public int mo707l() {
        Rect clipBounds = this.f2567a.getClipBounds();
        if (clipBounds != null) {
            return clipBounds.top;
        }
        return 0;
    }

    /* renamed from: m */
    public int mo708m() {
        return this.f2568b;
    }

    /* renamed from: n */
    public int mo709n() {
        return this.f2569c;
    }

    /* renamed from: o */
    public void mo710o(int i) {
        this.f2570d.setAlpha(i);
    }

    /* renamed from: p */
    public void mo711p(Canvas canvas) {
        this.f2567a = canvas;
    }

    /* renamed from: q */
    public void mo712q(int i, int i2, int i3, int i4) {
        if (!C0146b.m1385f()) {
            this.f2567a.clipRect((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4), Region.Op.REPLACE);
        }
    }

    /* renamed from: r */
    public void mo713r(int i) {
        if (i == 0) {
            i = -16777216;
        } else if (i == 1) {
            i = -1;
        }
        this.f2570d.setColor(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)));
    }

    /* renamed from: s */
    public void mo714s(int i, int i2) {
        this.f2567a.translate((float) i, (float) i2);
        this.f2568b += i;
        this.f2569c += i2;
    }
}
