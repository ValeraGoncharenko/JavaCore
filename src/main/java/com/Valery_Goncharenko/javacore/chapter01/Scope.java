package com.Valery_Goncharenko.javacore.chapter01;

/**
 * Продемонстрировать область действия блока кода
 * */
public class Scope {
    public static void main(String[] args) {
        /* переменная доступна всему коду из метода main() */
        int x;

        x = 10;
        if (x == 10) { // начало новой области действия,
            int y = 20;    // доступнойй только этому блоку кода

            // обе переменные доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; Ошибка! y недоступна
        // в этой области, тогда как x доступна и здесь
        System.out.println("x равно " + x);
    }
}
