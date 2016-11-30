package es.urjc.LDMpiratas.juego;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import es.urjc.LDMpiratas.liliana.core.Graficos;
import es.urjc.LDMpiratas.liliana.core.Input;
import es.urjc.LDMpiratas.liliana.core.Juego;
import es.urjc.LDMpiratas.liliana.core.Pantalla;

import java.util.List;

public class PantallaAyuda extends Pantalla {
    public PantallaAyuda(Juego juego) {
        super(juego);
    }

    @Override
    public void update(float deltaTime) {
        List<Input.TouchEvent> touchEvents = juego.getInput().getTouchEvents();
        juego.getInput().getKeyEvents();

        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            Input.TouchEvent event = touchEvents.get(i);
            if (event.type == Input.TouchEvent.TOUCH_UP) {
                if (event.x > 256 && event.y > 416) {
                    juego.setScreen(new PantallaAyuda2(juego));
                    if (Configuraciones.sonidoHabilitado)
                        Assets.pulsar.play(1);
                    return;
                }
            }
        }
    }

    @Override
    public void present(float deltaTime) {
        Graficos g = juego.getGraphics();
        g.drawPixmap(Assets.fondo, 0, 0);
        g.drawPixmap(Assets.ayuda1, 64, 100);
        g.drawPixmap(Assets.botones, 256, 416, 0, 64, 64, 64);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
