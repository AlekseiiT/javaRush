package com.company.task_6_8_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double)a / (double)b;
    }

    public static double percent(int a, int b) {
        return (double)a / 100 * b;
    }

    public static void main(String[] args) {

    }
}
