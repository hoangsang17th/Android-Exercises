package p019j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.blue.dragonball.MainActivity;
import p013g.C0111c0;
import p013g.C0140y;
import p018i.C0145a;
import p020k.C0167c;
import p020k.C0176l;

/* renamed from: j.j */
public class C0163j extends EditText {

    /* renamed from: d */
    public static int f2761d;

    /* renamed from: e */
    public static int f2762e;

    /* renamed from: f */
    public static int f2763f = (C0159f.f2750b * 35);

    /* renamed from: g */
    public static boolean f2764g = false;

    /* renamed from: a */
    public int f2765a;

    /* renamed from: b */
    public RelativeLayout.LayoutParams f2766b;

    /* renamed from: c */
    String f2767c = "";

    /* renamed from: j.j$a */
    class C0164a implements TextView.OnEditorActionListener {
        C0164a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C0163j.this.mo801a(textView, i, keyEvent);
            return true;
        }
    }

    public C0163j(Context context, int i, int i2) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
        mo804e(i, i2);
    }

    /* renamed from: d */
    private void m1506d() {
        ((InputMethodManager) C0157e.f2740i.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* renamed from: g */
    private void m1507g() {
        if (C0145a.f2637i0 == null) {
            ((InputMethodManager) C0157e.f2740i.getSystemService("input_method")).showSoftInput(this, 0);
        }
    }

    /* renamed from: a */
    public void mo801a(TextView textView, int i, KeyEvent keyEvent) {
        C0167c cVar;
        C0167c cVar2;
        C0111c0.m584k("actionId= " + i);
        if (i == 6 || i == 5 || i == 4) {
            m1506d();
            for (int i2 = 0; i2 < MainActivity.f319x.mo800d(); i2++) {
                if (((C0176l) MainActivity.f319x.mo798b(i2)).f2920v == this.f2765a) {
                    ((C0176l) MainActivity.f319x.mo798b(i2)).mo906r(getString());
                    ((C0176l) MainActivity.f319x.mo798b(i2)).f2903e = false;
                    ((MainActivity) C0157e.f2739h).mo109j(2, this);
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
                    if (!(yVar2 == null || !yVar2.f2467a || (cVar = yVar2.f2395C) == null)) {
                        cVar.f2793e.mo139d();
                        C0145a.f2631f0.f2395C.f2789a.mo896b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo802b() {
        setText("", TextView.BufferType.EDITABLE);
    }

    /* renamed from: c */
    public void mo803c() {
        m1506d();
        for (int i = 0; i < MainActivity.f319x.mo800d(); i++) {
            if (((C0176l) MainActivity.f319x.mo798b(i)).f2920v == this.f2765a) {
                ((C0176l) MainActivity.f319x.mo798b(i)).mo906r("");
                ((C0176l) MainActivity.f319x.mo798b(i)).f2903e = false;
                ((MainActivity) C0157e.f2739h).mo109j(2, this);
            }
        }
    }

    /* renamed from: e */
    public void mo804e(int i, int i2) {
        setImeOptions(268435462);
        setOnEditorActionListener(new C0164a());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        this.f2766b = layoutParams;
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setTextColor(-256);
        setTypeface(Typeface.DEFAULT_BOLD);
        setSingleLine();
        setTextSize(C0145a.f2616W < 400 ? 14.0f : 16.0f);
    }

    /* renamed from: f */
    public void mo805f(int i, int i2) {
        f2761d = i;
        f2762e = i2;
        RelativeLayout.LayoutParams layoutParams = this.f2766b;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
    }

    public String getString() {
        return getText().toString();
    }

    public void onDraw(Canvas canvas) {
        if (this.f2767c.compareTo(getString()) != 0) {
            this.f2767c = getString();
            for (int i = 0; i < MainActivity.f319x.mo800d(); i++) {
                if (((C0176l) MainActivity.f319x.mo798b(i)).f2920v == this.f2765a) {
                    ((C0176l) MainActivity.f319x.mo798b(i)).mo906r(getString());
                }
            }
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        C0111c0.m584k("change focus");
        if (!z) {
            m1506d();
            for (int i2 = 0; i2 < MainActivity.f319x.mo800d(); i2++) {
                if (((C0176l) MainActivity.f319x.mo798b(i2)).f2920v == this.f2765a) {
                    ((C0176l) MainActivity.f319x.mo798b(i2)).mo906r(getString());
                    ((MainActivity) C0157e.f2739h).mo109j(2, this);
                }
            }
            setVisible(false);
        } else {
            m1507g();
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0167c cVar;
        C0167c cVar2;
        if (i == 66 || i == 4) {
            m1506d();
            for (int i2 = 0; i2 < MainActivity.f319x.mo800d(); i2++) {
                if (((C0176l) MainActivity.f319x.mo798b(i2)).f2920v == this.f2765a) {
                    ((C0176l) MainActivity.f319x.mo798b(i2)).mo906r(getString());
                    ((MainActivity) C0157e.f2739h).mo109j(2, this);
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
                    if (!(yVar2 == null || !yVar2.f2467a || (cVar = yVar2.f2395C) == null)) {
                        cVar.f2793e.mo139d();
                        C0145a.f2631f0.f2395C.f2789a.mo896b();
                    }
                }
            }
            setVisible(false);
        }
        if (i == 176) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int i = 0; i < MainActivity.f319x.mo800d(); i++) {
            if (((C0176l) MainActivity.f319x.mo798b(i)).f2920v == this.f2765a) {
                int i2 = C0159f.f2750b;
                if (C0111c0.m582i((((C0176l) MainActivity.f319x.mo798b(i)).f2901c - 35) * i2, 0, i2 * 35, i2 * 35, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ((C0176l) MainActivity.f319x.mo798b(i)).mo896b();
                    mo802b();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMaxTextInput(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setText(String str) {
        setText(str, TextView.BufferType.EDITABLE);
        this.f2767c = str;
    }

    public void setVisible(boolean z) {
        f2764g = z;
        setVisibility(z ? 0 : 4);
    }

    public void setmyInputType(int i) {
        if (i != 0) {
            if (i == 1) {
                setInputType(2);
                return;
            } else if (i == 2) {
                setInputType(1);
                setTransformationMethod(PasswordTransformationMethod.getInstance());
                return;
            } else if (i != 3) {
                return;
            }
        }
        setInputType(1);
    }
}
