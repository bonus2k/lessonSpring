package ru.snkatvit.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>();

    @PostConstruct
    public void doMyInit() {
        System.out.println("Object init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Object destroy");
    }

    @Override
    public List<String> getSong() {
        musicList.add("Classical music1");
        musicList.add("Classical music2");
        musicList.add("Classical music3");

        return musicList;
    }
}
