package ru.snkatvit.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        musicList.add("Classical music1");
        musicList.add("Classical music2");
        musicList.add("Classical music3");

        return musicList;
    }
}
