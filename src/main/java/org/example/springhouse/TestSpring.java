package org.example.springhouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong(MusicEdge.RAP);
        System.out.println("Volume: " + musicPlayer.getVolume());
        System.out.println("Name: " + musicPlayer.getName());


        context.close();



    }
}
