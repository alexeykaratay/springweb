package org.example.springhouse;

import org.springframework.stereotype.Component;

@Component("musicClassical")
public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Liszt- Hungarian Rhapsody";
    }

}
