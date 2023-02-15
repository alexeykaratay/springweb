package org.example.springhouse;

import org.springframework.stereotype.Component;

@Component("musicRock")
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Jimi Hendrix- Wind cries Mary";
    }
}
