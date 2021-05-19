package com.Valery_Goncharenko.javacore.chapter01;

/**
 * Вычислить расстояное проходимое светом.
 * Используя переменные типа long
 * */
public class Light {

    public static void main(String[] args) {

        int lightSpeed;
        long days, seconds, distance;

        /* Приблизительная скорость света, миль в сек */
        lightSpeed = 186000;

        /* Количество дней */
        days = 1000;

        /* Преобразуем в секунды */
        seconds = days * 24 * 60 * 60;

        /* Вычислим расстояние */
        distance = lightSpeed * seconds;

        System.out.println("За " + days);
        System.out.println("дней свет пройдет около ");
        System.out.println((distance + " миль."));
    }
}
