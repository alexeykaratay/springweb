package org.example.springhouse;

import java.util.*;

public class MusicPlayer {
    public void doMyinit(){
        System.out.println("initialization");
    }
    public void doMyDestroy(){
        System.out.println("Destruction");
    }

    private List<Music> musicList = new ArrayList<>();

    private MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    private MusicPlayer(){
    }

    public static  MusicPlayer getMusicPlayer(){
        return new MusicPlayer();
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playSong() {
        for (Music mus: musicList) {
            System.out.println("Playing: " + mus.getSong());
        }

    }

}
