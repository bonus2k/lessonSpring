package ru.snkatvit.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
         this.musicList.add(music);
    }

    public MusicPlayer() {
    }

    public void playMusic(){
        musicList.forEach(o-> System.out.println("Playing: " + o.getSong()));
    }

    public void setMusic(List<Music> musicList) {
        this.musicList=musicList;
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
}
