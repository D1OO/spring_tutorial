/**
 * Computer
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
public class Computer {
    private int id;
    private MusicPlayer mp;

    @Autowired
    public Computer(MusicPlayer mp){
        id = 1;
        this.mp = mp;
    }

    public void playMusic(){
        System.out.println("Computer #" + id + " playing: " + mp.playMusic(MusicPlayer.GENRES.TRAP));
    }
}
