package es.urjc.LDMpiratas.androidimpl;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import android.graphics.Bitmap;
import es.urjc.LDMpiratas.liliana.core.Graficos;
import es.urjc.LDMpiratas.liliana.core.Pixmap;

public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    Graficos.PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, Graficos.PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graficos.PixmapFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}

