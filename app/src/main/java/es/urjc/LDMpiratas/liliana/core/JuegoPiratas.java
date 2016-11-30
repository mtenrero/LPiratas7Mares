package es.urjc.LDMpiratas.liliana.core;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import es.urjc.LDMpiratas.androidimpl.AndroidJuego;

public class JuegoPiratas extends AndroidJuego {
    @Override
    public Pantalla getStartScreen() {
        return new LoadingScreen(this);
    }
}

