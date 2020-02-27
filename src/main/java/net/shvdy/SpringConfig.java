/**
 * SpringConfig
 * <p>
 * version 1.0
 * <p>
 * 27.02.2020
 * <p>
 * Copyright(r) shvdy.net
 */

package net.shvdy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public TrapMusic trapMusic() {
        return new TrapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PhonkMusic phonkMusic() {
        return new PhonkMusic();
    }

    @Bean
    public List<Music> musiclist() {
        return Arrays.asList(trapMusic(), rockMusic(), phonkMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musiclist());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
