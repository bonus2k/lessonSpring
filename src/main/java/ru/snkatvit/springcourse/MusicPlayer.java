package ru.snkatvit.springcourse;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println("Playing: " + musicList.get(random.nextInt(musicList.size())).getSong());
    }


}
