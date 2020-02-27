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

        Computer c = context.getBean("computer", Computer.class);
        c.playMusic();

        TrapMusic m = context.getBean("trapMusic", TrapMusic.class);
        TrapMusic m2 = context.getBean("trapMusic", TrapMusic.class);
        System.out.println(m == m2);

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(mp.getVolume() + " " + mp.getName());
        context.close();
    }
}
