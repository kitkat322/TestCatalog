package org.example.topic_8.topic_8_5;

public class DeadlockExample implements Runnable {
    private final Resource resource1;
    private final Resource resource2;

    public DeadlockExample(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " захватил ресурс: " + resource1.getName());

            try {
                Thread.sleep(50); // Имитация работы с ресурсом
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " пытается захватить ресурс: " + resource1.getName());
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " захватил оба ресурса: " + resource1.getName() + " и " + resource2.getName());
            }
        }
    }
}