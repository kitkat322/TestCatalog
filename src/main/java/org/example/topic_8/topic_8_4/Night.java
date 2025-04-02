package org.example.topic_8.topic_8_4;

public class Night implements Runnable{

    private Sun sun;

    public Night(Sun sun){
        this.sun = sun;
    }

    @Override
    public void run(){
        sun.isNight();
    }
}
