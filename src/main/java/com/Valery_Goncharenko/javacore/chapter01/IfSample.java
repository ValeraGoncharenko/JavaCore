package com.Valery_Goncharenko.javacore.chapter01;

/**
 * Продемонстрировать применение условного оператора if.
 * Присвоить исходному файлу имя "IfSample.java"
 * */
public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if(x < y) System.out.println("x меньше y");

        x = x * 2;
        if(x == y) System.out.println("x = y");

        x = x * 2;
        if(x > y) System.out.println("x > y");

        if(x == y) System.out.println("Вы не увидите этого");
    }
}
