package ru.snkatvit.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.ROCK);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);
        musicPlayer.playMusic(musicEnum.CLASSICAL);

        context.close();

    }
}
