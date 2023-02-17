package org.example.springhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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

    private List<MusicEdge> musicEdges = new  ArrayList();
    {
        musicEdges.add(MusicEdge.RAP);
        musicEdges.add(MusicEdge.CLASSICAL);
        musicEdges.add(MusicEdge.ROCK);
    }



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
    public MusicPlayer(List<MusicEdge> musicEdges) {
        this.musicEdges = musicEdges;
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

