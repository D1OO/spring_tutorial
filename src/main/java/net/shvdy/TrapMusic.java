/**
 * ClassicalMusic
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TrapMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("hi");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("bye");
    }

    String[] heat = {"wonda", "BETRAYAL", "EMPEROR"};

    @Override
    public String[] getMusic() {
        return heat;
    }
}
