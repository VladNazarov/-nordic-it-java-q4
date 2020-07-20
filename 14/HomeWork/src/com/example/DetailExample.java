package com.example;

import java.util.ArrayList;

public class DetailExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Detail> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(new Detail(i));
        }

        for (var detail : list) {

            var thread1 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 1");
                }
            };
            var thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 2");
                }
            };
            var thread3 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 3");
                }
            };
            var thread4 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 4");
                }
            };
            var thread5 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 5");
                }
            };
            var thread6 = new Thread() {
                @Override
                public void run() {
                    System.out.println("Обработка детали № " + detail.getId()+", "+"Поток № 6");
                }
            };
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            thread3.start();
            thread3.join();

            thread4.start();
            thread5.start();
            thread4.join();
            thread5.join();

            thread6.start();
        }


    }
}
