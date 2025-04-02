package org.example.topic_8.topic_8_4;

public class Day implements Runnable{

    private Sun sun;

    public Day(Sun sun){
        this.sun = sun;
    }

    @Override
    public void run(){
        sun.isDay();
    }
}
