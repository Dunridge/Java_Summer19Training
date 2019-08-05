package com.max.training;

public class RockMusic implements Music {

    public RockMusic() {}//

    public RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Override
    public void init() {
        System.out.println("Doing my init for rock music...");
    }

    @Override
    public void destroy() {
        System.out.println("Doing my destruction for rock music...");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
