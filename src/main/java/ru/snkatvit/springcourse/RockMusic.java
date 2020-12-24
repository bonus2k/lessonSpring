package ru.snkatvit.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> musicList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        musicList.add("Rock music1");
        musicList.add("Rock music2");
        musicList.add("Rock music3");
        return musicList;
    }
}
