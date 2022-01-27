package com.codegym;

public class Main {

    public static void main(String[] args) {
        PrintNumber printOddNumber = new PrintNumber(1, 10, 2, 10, "Đếm số lẻ");
        PrintNumber printEvenNumber = new PrintNumber(0, 10, 2, 15, "Đếm số chẵn");

        Thread thread1 = new Thread(printEvenNumber);
        Thread thread2 = new Thread(printOddNumber);

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}
