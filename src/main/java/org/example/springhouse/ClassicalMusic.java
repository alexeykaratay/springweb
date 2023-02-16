package org.example.springhouse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component("musicClassical")
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Liszt- Hungarian Rhapsody");
        songs.add("Mozart – Eine kleine Nachtmusik");
        songs.add("J.S. Bach – Toccata and Fugue in D minor");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

}
