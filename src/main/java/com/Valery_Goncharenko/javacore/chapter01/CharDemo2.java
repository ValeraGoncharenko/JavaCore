package com.Valery_Goncharenko.javacore.chapter01;

/**
 * Символьные переменные ведут себя как целочисленные значения
 * */
public class CharDemo2 {

    public static void main(String[] args) {
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        /* увеличим на еденицу значение переменной ch1 */
        ch1 ++;

        System.out.println("ch1 теперь содержит " + ch1);
    }
}
