package es.urjc.LDMpiratas.liliana.core;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public Graficos.PixmapFormat getFormat();

    public void dispose();
}
