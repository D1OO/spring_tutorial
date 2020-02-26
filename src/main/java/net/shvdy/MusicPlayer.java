/**
 * MusicPlayer
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    ClassicalMusic classicalMusic;
    RockMusic rockMusic;

    @Autowired
    MusicPlayer(ClassicalMusic cm, RockMusic rm){
        classicalMusic = cm;
        rockMusic = rm;
    }

    public String playMusic() {
        return classicalMusic.getMusic();
    }
}
