package ru.snkatvit.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic music";
    }
//
//    public void doMyInit(){
//        System.out.println("Init object");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Destroy object");
//    }
}
