package org.example.topic_8.topic_8_2;

//Затримка потоку. Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
// і коли ці потоки успішно відпрацюють – вивести на екран повідомлення (завершення потім first, second і main).

public class MyThread implements Runnable {

    @Override
    public synchronized void run() {
        synchronized (MyThread.class){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            System.out.println(Thread.currentThread().getName() + " завершив роботу");
        }

    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.setName("first");
        t2.setName("second");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " завершив роботу");

    }
}
