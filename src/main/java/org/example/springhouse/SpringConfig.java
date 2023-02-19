package org.example.springhouse;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.springhouse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {


    @Bean
    @Scope("prototype")
    public static  MusicPlayer getMusicPlayer(){
        return new MusicPlayer();
    }

}
