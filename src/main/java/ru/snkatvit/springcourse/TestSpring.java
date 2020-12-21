package ru.snkatvit.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
    //Music music = context.getBean("musicBean", Music.class);
    //MusicPlayer musicPlayer = new MusicPlayer(music);
    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        System.out.println("Context open");
        context.close();
        System.out.println("Context close");
        musicPlayer.playMusic();
        System.out.println("Stop program");
    }
}
