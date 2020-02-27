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

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> music;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic() {
        Random rnd = new Random();
        String[] songs = music.get(rnd.nextInt(music.size())).getMusic();
        return songs[rnd.nextInt(songs.length - 1)];
    }
}
