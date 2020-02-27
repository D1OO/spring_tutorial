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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    public enum GENRES {
        TRAP,
        ROCK
    }

    private Music trapMusic;
    private Music rockMusic;

    @Autowired
    MusicPlayer(@Qualifier("trapMusic") Music trapMusic,
                @Qualifier("rockMusic") Music rockMusic) {
        this.trapMusic = trapMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(GENRES genre) {
        int rnd = new Random().nextInt(3);
        if (genre == GENRES.TRAP) {
            return trapMusic.getMusic()[rnd];
        } else if (genre == GENRES.ROCK) {
            return rockMusic.getMusic()[rnd];
        }
        return "empty";
    }
}
