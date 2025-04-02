package org.example.topic_8.topic_8_3;

//Демонстрація пріоритетів. Створити 2 класи PriorityRunner та PriorityThread. Запустити 3 потоки із пріоритетами (min, max, norm).
// За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.

public class PriorityRunner {
    public static void main(String[] args) {
        Thread th1 = new Thread(new PriorityThread());
        Thread th2 = new Thread(new PriorityThread());
        Thread th3 = new Thread(new PriorityThread());

        th1.setName("min");
        th2.setName("norm");
        th3.setName("max");

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
        th3.start();
    }
}
