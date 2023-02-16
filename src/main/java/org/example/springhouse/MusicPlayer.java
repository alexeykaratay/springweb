package org.example.springhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;


@Component("musicPlayer")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;


    public String getName() {
        return  name;
    }

    public String getVolume() {
        return volume;
    }

    @PostConstruct
    public void doMyinit(){
        System.out.println("initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruction");
    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    private MusicPlayer(){

   }

    public static  MusicPlayer getMusicPlayer(){
        return new MusicPlayer();
    }


    public void playSong(MusicEdge edge) {
        Random random = new Random();
        int ranNum = random.nextInt(4);

        if(edge == MusicEdge.CLASSICAL ){
            System.out.println(classicalMusic.getSong().get(ranNum));
        }
        else if (edge == MusicEdge.RAP){
            System.out.println(rapMusic.getSong().get(ranNum));
        }
        else {
            System.out.println(rockMusic.getSong().get(ranNum));
        }


    }

}

