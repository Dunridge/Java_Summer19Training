package com.max.training;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public void init() {
        System.out.println("Doing my init for classical music...");
    }

    @Override
    public void destroy() {
        System.out.println("Doing my destruction for classical music...");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";//
    }
}
