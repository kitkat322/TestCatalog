package org.example.topic_8.topic_8_4;

public class Sun {
    //флаг для синхронізації роботи класів Day і Night
    private boolean isSun = true;

    //реалізація логіки для класу Day
    public synchronized void isDay(){
        for (int i = 0; i < 5; i++) {
            while(!isSun){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + " is now");
            isSun = false;
            notify();

        }
    }

    //реалізація логіки для класу Night
    public synchronized void isNight(){
        for (int i = 0; i < 5; i++) {
            while(isSun){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + " is now");
            isSun = true;
            notify();

        }
    }
}
