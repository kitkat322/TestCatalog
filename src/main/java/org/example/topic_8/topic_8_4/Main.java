package org.example.topic_8.topic_8_4;

//Створити 2 довільні класи з полями та методами. Необхідно синхронізувати методи цих класів між собою, тобто,
// щоб виводило на екран значення один за одним (1 клас, 2 клас, 1, 2 тощо).


public class Main {
    public static void main(String[] args) {

        Sun sun = new Sun();

        Thread day = new Thread(new Day(sun));
        Thread night = new Thread(new Night(sun));

        day.setName("day");
        night.setName("night");

        day.start();
        night.start();
    }
}