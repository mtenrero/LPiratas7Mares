package es.urjc.LDMpiratas.liliana.core;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

public interface Juego {
    public Input getInput();

    public FileIO getFileIO();

    public Graficos getGraphics();

    public Audio getAudio();

    public void setScreen(Pantalla pantalla);

    public Pantalla getCurrentScreen();

    public Pantalla getStartScreen();
}