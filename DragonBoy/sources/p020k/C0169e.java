package p020k;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.blue.dragonball.MainActivity;
import p019j.C0159f;

/* renamed from: k.e */
public class C0169e {

    /* renamed from: a */
    public Paint f2803a;

    /* renamed from: b */
    public int f2804b;

    public C0169e(String str, int i, int i2) {
        Paint paint = new Paint();
        this.f2803a = paint;
        paint.setTypeface(Typeface.createFromAsset(MainActivity.f302g, str));
        this.f2803a.setTextSize((float) (i * C0159f.f2750b));
        this.f2803a.setColor(i2);
        this.f2803a.setAntiAlias(true);
        this.f2804b = i2;
    }

    /* renamed from: a */
    public void mo828a(C0159f fVar, String str, int i, int i2, int i3) {
        fVar.mo781j(str, i, i2 + 9, i3, this.f2803a);
    }

    /* renamed from: b */
    public int mo829b() {
        Rect rect = new Rect();
        this.f2803a.getTextBounds("Âg", 0, 1, rect);
        return rect.height() / C0159f.f2750b;
    }

    /* renamed from: c */
    public int mo830c(String str) {
        return (int) (this.f2803a.measureText(str) / ((float) C0159f.f2750b));
    }
}
