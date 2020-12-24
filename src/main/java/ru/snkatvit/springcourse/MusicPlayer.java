package ru.snkatvit.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;
    List<String> musicList;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(Enum<musicEnum> enumEnum) {
        if (enumEnum==musicEnum.CLASSICAL) musicList=music2.getSong();
        if (enumEnum==musicEnum.ROCK) musicList=music1.getSong();
        Random random = new Random();
        random.nextInt(musicList.size());
        System.out.println("Playing: " + musicList.get(random.nextInt(musicList.size())));
    }


}
