/**
 * TrapMusic
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

public class TrapMusic implements Music {

    private TrapMusic(){}

    public static TrapMusic getTrapMusic(){
        return new TrapMusic();
    }

    public void doMyInit(){
        System.out.println("Initialization...");
    }

    public void doMyDestroy(){
        System.out.println("Destruction...");
    }
    @Override
    public String getMusic() {
        return "Inferno";
    }
}
