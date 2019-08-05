package com.max.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Maksym Polinka
 */
public class TestSpring {
    //here we'll test the Spring Framework
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", PopMusic.class);
        System.out.println(music.getSong());

        Music music2 = context.getBean("musicBean2", ClassicalMusic.class);
        System.out.println(music2.getSong());

        //destruction method is not called when we use prototype scope

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);


//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean compareTwo = musicPlayer == musicPlayer1; //they point to the same object
//        System.out.println(compareTwo); //prints true
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer1); //they're the same
//        musicPlayer.setVolume(55);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
