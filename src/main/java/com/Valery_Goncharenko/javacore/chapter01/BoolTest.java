package com.Valery_Goncharenko.javacore.chapter01;

/**
 * Продемонстрировать применение значений типа boolean
 * */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(" b равно " + b);

        b = true;
        System.out.println(" b равно " + b);

        /* значение типа boolean может управлять оператором if */
        if(b) System.out.println(" код выполнится");

        b = false;
        if(b) System.out.println(" код не выполнится");

        /* рез-т сравнения - значение типа boolean */
        System.out.println("10 > 9 равно " + (10 > 9));

    }
}
