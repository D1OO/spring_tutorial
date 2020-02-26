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

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music m : musicList){
            System.out.println(m.getMusic());
        }
    }
}
