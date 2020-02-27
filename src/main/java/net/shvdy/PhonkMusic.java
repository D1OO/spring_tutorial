/**
 * PhonkMusic
 * <p>
 * version 1.0
 * <p>
 * 27.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

public class PhonkMusic implements Music {

    private String[] heat = {"Dangerous Mixx", "Esprit", "Motorola Flip"};

    @Override
    public String[] getMusic() {
        return heat;
    }
}
