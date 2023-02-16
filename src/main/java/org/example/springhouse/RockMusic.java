package org.example.springhouse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicRock")
public class RockMusic implements Music{
    private  List<String> songs = new ArrayList<>();

    {
        songs.add("Jimi Hendrix- Wind cries Mary");
        songs.add("Nirvana- Smells Like Teen Spirit");
        songs.add("AC/DC- highway to hell ");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
