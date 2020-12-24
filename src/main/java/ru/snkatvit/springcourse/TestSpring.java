package ru.snkatvit.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();

        context.close();

    }
}
