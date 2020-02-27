/**
 * RockMusic
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    String[] heat = {"sic", "toxicity", "chop suey"};
    @Override
    public String[] getMusic() {
        return heat;
    }
}
