package org.example.topic_8.topic_8_5;

public class Main {
    public static void main(String[] args) {
        Resource res1 = new Resource("Ресурс 1");
        Resource res2 = new Resource("Ресурс 2");

        Thread t1 = new Thread(new DeadlockExample(res1, res2), "Поток 1");
        Thread t2 = new Thread(new DeadlockExample(res2, res1), "Поток 2"); // Здесь порядок ресурсов меняется!

        t1.start();
        t2.start();
    }
}
