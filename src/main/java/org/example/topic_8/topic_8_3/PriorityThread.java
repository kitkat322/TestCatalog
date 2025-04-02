package org.example.topic_8.topic_8_3;

public class PriorityThread implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
