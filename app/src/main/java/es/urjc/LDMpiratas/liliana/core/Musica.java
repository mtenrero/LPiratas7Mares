package es.urjc.LDMpiratas.liliana.core;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

public interface Musica {
    public void play();

    public void stop();

    public void pause();

    public void setVolume(float volume);

    public boolean isPlaying();

    public boolean isStopped();

    public boolean isLooping();

    public void setLooping(boolean looping);

    public void dispose();
}
