package es.urjc.LDMpiratas.liliana.core;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

public abstract class Pantalla {
    protected final Juego juego;

    public Pantalla(Juego juego) {
        this.juego = juego;
    }

    public abstract void update(float deltaTime);

    public abstract void present(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();
}
