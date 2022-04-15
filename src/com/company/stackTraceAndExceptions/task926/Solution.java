package com.company.stackTraceAndExceptions.task926;

/*
Перехват выборочных исключений
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void divideByZero(){
        System.out.println(12/0);
    }
}
