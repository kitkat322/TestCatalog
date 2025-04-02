package org.example.topic_8.topic_8_5;

public class Worker extends Thread{

    private String name;
    public Room room;

    public Worker(String name){
        this.name = name;
    }

    @Override
    public void run(){
        synchronized (room){

        }

    }
}
