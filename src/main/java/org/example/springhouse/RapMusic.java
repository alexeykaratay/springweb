package org.example.springhouse;

import org.springframework.stereotype.Component;

@Component("musicRap")
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "50 Cent- Candy Shop";
    }
}
