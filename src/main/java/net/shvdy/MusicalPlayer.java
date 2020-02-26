/**
 * MusicalPlayer
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

public class MusicalPlayer {
    Music music;

    MusicalPlayer(Music music){
        this.music = music;
    }

    public String playMusic(){
        return music.getMusic();
    }
}
