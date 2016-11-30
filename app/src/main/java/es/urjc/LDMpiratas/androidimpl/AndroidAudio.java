package es.urjc.LDMpiratas.androidimpl;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import es.urjc.LDMpiratas.liliana.core.Audio;
import es.urjc.LDMpiratas.liliana.core.Musica;
import es.urjc.LDMpiratas.liliana.core.Sonido;

import java.io.IOException;

public class AndroidAudio implements Audio {
    AssetManager assets;
    SoundPool soundPool;

    public AndroidAudio(Activity activity) {
        activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        this.assets = activity.getAssets();
        this.soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
    }

    @Override
    public Musica nuevaMusica(String nombrearchivo) {
        try {
            AssetFileDescriptor assetDescriptor = assets.openFd(nombrearchivo);
            return new AndroidMusica(assetDescriptor);
        } catch (IOException e) {
            throw new RuntimeException("no se ha podido cargar archivo '" + nombrearchivo + "'");
        }
    }

    @Override
    public Sonido nuevoSonido(String nombrearchivo) {
        try {
            AssetFileDescriptor assetDescriptor = assets.openFd(nombrearchivo);
            int soundId = soundPool.load(assetDescriptor, 0);
            return new AndroidSonido(soundPool, soundId);
        } catch (IOException e) {
            throw new RuntimeException("No se ha podido cargar archivo '" + nombrearchivo + "'");
        }
    }
}








