package org.example.springhouse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong(MusicEdge.RAP);
        System.out.println("Volume: " + musicPlayer.getVolume());
        System.out.println("Name: " + musicPlayer.getName());


        context.close();



    }
}
