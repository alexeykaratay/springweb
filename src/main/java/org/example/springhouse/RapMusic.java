package org.example.springhouse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component("musicRap")
public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("50 Cent- Candy Shop");
        songs.add("Eminem- Stan");
        songs.add("2Pak- I Get Around");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}