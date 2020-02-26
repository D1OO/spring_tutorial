/**
 * TestSpring
 * <p>
 * version 1.0
 * <p>
 * 26.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicalPlayer mp = context.getBean("musicalPlayer", MusicalPlayer.class);
        mp.playMusic();
        System.out.println(mp.getName());
        System.out.println(mp.getVolume());

        context.close();
    }
}
