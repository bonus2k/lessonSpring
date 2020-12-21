package ru.snkatvit.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic music";
    }

    public void doMyInit(){
        System.out.println("Init object");
    }

    public void doMyDestroy(){
        System.out.println("Destroy object");
    }
}
