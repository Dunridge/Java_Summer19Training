package com.max.training;

public class PopMusic implements Music {

    private PopMusic() {}

    public PopMusic getPopMusic() {
        return new PopMusic();
    }

    @Override
    public void init() {
        System.out.println("Doing my init for pop music...");
    }

    @Override
    public void destroy() {
        System.out.println("Doing my destruction for pop music...");
    }

    @Override
    public String getSong() {
        return "Take on me";
    }
}
