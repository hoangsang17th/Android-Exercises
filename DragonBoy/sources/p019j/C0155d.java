package p019j;

import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

/* renamed from: j.d */
public class C0155d {

    /* renamed from: a */
    public static int f2729a = 0;

    /* renamed from: b */
    public static MediaPlayer[] f2730b = null;

    /* renamed from: c */
    public static SoundPool[] f2731c = null;

    /* renamed from: d */
    public static int[] f2732d = null;

    /* renamed from: e */
    public static AssetManager f2733e = null;

    /* renamed from: f */
    public static boolean f2734f = false;

    /* renamed from: g */
    public static boolean f2735g = false;

    /* renamed from: j.d$a */
    static class C0156a implements SoundPool.OnLoadCompleteListener {
        C0156a() {
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        java.lang.System.gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r1 = f2733e;
        r8 = r1.openFd("music/" + r8 + ".wav");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r8.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaPlayer m1430a(java.lang.String r8) {
        /*
            java.lang.String r0 = "music/"
            android.media.MediaPlayer r7 = new android.media.MediaPlayer
            r7.<init>()
            android.content.res.AssetManager r1 = f2733e     // Catch:{ Exception -> 0x0024 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0024 }
            r2.<init>()     // Catch:{ Exception -> 0x0024 }
            r2.append(r0)     // Catch:{ Exception -> 0x0024 }
            r2.append(r8)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r3 = ".mp3"
            r2.append(r3)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0024 }
            android.content.res.AssetFileDescriptor r8 = r1.openFd(r2)     // Catch:{ Exception -> 0x0024 }
            goto L_0x003e
        L_0x0022:
            r8 = move-exception
            goto L_0x005a
        L_0x0024:
            android.content.res.AssetManager r1 = f2733e     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            r2.<init>()     // Catch:{ IOException -> 0x0052 }
            r2.append(r0)     // Catch:{ IOException -> 0x0052 }
            r2.append(r8)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r8 = ".wav"
            r2.append(r8)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r8 = r2.toString()     // Catch:{ IOException -> 0x0052 }
            android.content.res.AssetFileDescriptor r8 = r1.openFd(r8)     // Catch:{ IOException -> 0x0052 }
        L_0x003e:
            java.io.FileDescriptor r2 = r8.getFileDescriptor()     // Catch:{ IOException -> 0x0052 }
            long r3 = r8.getStartOffset()     // Catch:{ IOException -> 0x0052 }
            long r5 = r8.getLength()     // Catch:{ IOException -> 0x0052 }
            r1 = r7
            r1.setDataSource(r2, r3, r5)     // Catch:{ IOException -> 0x0052 }
            r7.prepare()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0022 }
        L_0x0056:
            java.lang.System.gc()
            return r7
        L_0x005a:
            java.lang.System.gc()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p019j.C0155d.m1430a(java.lang.String):android.media.MediaPlayer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = f2733e;
        r9 = r1.openFd("sound/" + r9 + ".mp3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        return -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1431b(int r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "sound/"
            android.content.res.AssetManager r1 = f2733e     // Catch:{ Exception -> 0x001d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001d }
            r2.<init>()     // Catch:{ Exception -> 0x001d }
            r2.append(r0)     // Catch:{ Exception -> 0x001d }
            r2.append(r9)     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = ".wav"
            r2.append(r3)     // Catch:{ Exception -> 0x001d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x001d }
            android.content.res.AssetFileDescriptor r9 = r1.openFd(r2)     // Catch:{ Exception -> 0x001d }
            goto L_0x0037
        L_0x001d:
            android.content.res.AssetManager r1 = f2733e     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            r2.<init>()     // Catch:{ IOException -> 0x0052 }
            r2.append(r0)     // Catch:{ IOException -> 0x0052 }
            r2.append(r9)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r9 = ".mp3"
            r2.append(r9)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r9 = r2.toString()     // Catch:{ IOException -> 0x0052 }
            android.content.res.AssetFileDescriptor r9 = r1.openFd(r9)     // Catch:{ IOException -> 0x0052 }
        L_0x0037:
            java.lang.String r0 = "load am thanh thanh cong"
            p013g.C0111c0.m584k(r0)     // Catch:{ IOException -> 0x0052 }
            android.media.SoundPool[] r0 = f2731c     // Catch:{ IOException -> 0x0052 }
            r1 = r0[r8]     // Catch:{ IOException -> 0x0052 }
            java.io.FileDescriptor r2 = r9.getFileDescriptor()     // Catch:{ IOException -> 0x0052 }
            long r3 = r9.getStartOffset()     // Catch:{ IOException -> 0x0052 }
            long r5 = r9.getLength()     // Catch:{ IOException -> 0x0052 }
            r7 = 0
            int r8 = r1.load(r2, r3, r5, r7)     // Catch:{ IOException -> 0x0052 }
            return r8
        L_0x0052:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p019j.C0155d.m1431b(int, java.lang.String):int");
    }

    /* renamed from: c */
    public static void m1432c(int[] iArr, int[] iArr2) {
        if (iArr != null) {
            f2730b = new MediaPlayer[iArr.length];
            int i = 0;
            while (true) {
                MediaPlayer[] mediaPlayerArr = f2730b;
                if (i >= mediaPlayerArr.length) {
                    break;
                }
                mediaPlayerArr[i] = m1430a(i + "");
                i++;
            }
        }
        if (iArr2 != null) {
            f2732d = new int[iArr2.length];
            f2731c = new SoundPool[iArr2.length];
            int i2 = 0;
            while (true) {
                SoundPool[] soundPoolArr = f2731c;
                if (i2 >= soundPoolArr.length) {
                    break;
                }
                soundPoolArr[i2] = new SoundPool(1, 3, 0);
                f2731c[i2].setOnLoadCompleteListener(new C0156a());
                int[] iArr3 = f2732d;
                iArr3[i2] = m1431b(i2, i2 + "");
                i2++;
            }
        }
        System.gc();
    }

    /* renamed from: d */
    public static void m1433d(int i, float f, boolean z) {
        if (f2730b != null) {
            int i2 = 0;
            while (true) {
                MediaPlayer[] mediaPlayerArr = f2730b;
                if (i2 < mediaPlayerArr.length) {
                    if (mediaPlayerArr[i2] != null && mediaPlayerArr[i2].isPlaying()) {
                        f2730b[i2].pause();
                    }
                    i2++;
                }
            }
            f2730b[i].setVolume(f, f);
            f2730b[i].setLooping(z);
            f2730b[i].seekTo(0);
            f2730b[i].start();
        }
        try {
            f2730b[i].setVolume(f, f);
            f2730b[i].setLooping(z);
            f2730b[i].seekTo(0);
            f2730b[i].start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m1434e(int i, float f) {
        SoundPool[] soundPoolArr = f2731c;
        if (soundPoolArr != null && !f2735g) {
            try {
                soundPoolArr[i].play(f2732d[i], f, f, 0, 0, 1.0f);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static void m1435f() {
        int i = 0;
        while (true) {
            MediaPlayer[] mediaPlayerArr = f2730b;
            if (i < mediaPlayerArr.length) {
                if (mediaPlayerArr[i] != null) {
                    mediaPlayerArr[i].release();
                    f2730b[i] = null;
                }
                i++;
            } else {
                System.gc();
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m1436g(AssetManager assetManager) {
        f2733e = assetManager;
    }

    /* renamed from: h */
    public static void m1437h() {
        int i = 0;
        if (f2730b != null) {
            int i2 = 0;
            while (true) {
                MediaPlayer[] mediaPlayerArr = f2730b;
                if (i2 >= mediaPlayerArr.length) {
                    break;
                }
                if (mediaPlayerArr[i2] != null && mediaPlayerArr[i2].isPlaying()) {
                    f2730b[i2].pause();
                }
                i2++;
            }
        }
        if (f2731c != null) {
            while (true) {
                SoundPool[] soundPoolArr = f2731c;
                if (i >= soundPoolArr.length) {
                    break;
                }
                if (soundPoolArr[i] != null) {
                    soundPoolArr[i].stop(f2729a);
                }
                i++;
            }
        }
        System.gc();
    }
}
