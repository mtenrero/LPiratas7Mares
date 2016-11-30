package es.urjc.LDMpiratas.androidimpl;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import android.view.View.OnTouchListener;
import es.urjc.LDMpiratas.liliana.core.Input;

import java.util.List;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}

