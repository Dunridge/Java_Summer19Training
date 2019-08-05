package com.max.training;

import java.util.ArrayList;
import java.util.List;

//here's a tutorial on how to create beans for Spring:
//https://stackoverflow.com/questions/2416056/how-to-define-a-list-bean-in-spring

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    //
    private String name;
    private int volume = 60;

    public void playMusic() {
        for (Music musicPiece:musicList) {
         System.out.println("Playing: " + musicPiece.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Inversion of control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    //setting the value with a setter
    public void setMusic(Music music) {
        this.music = music;
    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

}
