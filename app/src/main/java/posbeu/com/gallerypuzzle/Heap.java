package posbeu.com.gallerypuzzle;

import android.graphics.Bitmap;

/**
 * Created by giovanni on 6/2/16.
 */
public class Heap {
    private static Bitmap bitmap = null;


    private static MainActivity activity;


    public static Bitmap getBitmap() {
        return bitmap;
    }

    public static void setBitmap(Bitmap m) {
        bitmap = m;
    }


    public static void setMainActivity(MainActivity m) {
        activity=m;
    }
    public static MainActivity getActivity() {
        return activity;
    }

}
