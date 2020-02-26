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

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);
        Music m = context.getBean("trapMusicBean", Music.class);
        Music m2 = context.getBean("trapMusicBean", Music.class);


        System.out.println(mp == mp2);

        mp.playMusic();

        mp.setVolume(10);
        System.out.println(mp.getName());
        System.out.println(mp.getVolume());
        System.out.println(mp2.getVolume());

        context.close();
    }
}
