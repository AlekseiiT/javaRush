package com.company.task_4_2_2;

public class Cat {

    /*
        Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
        За количество котов отвечает переменная catsCount.
    */

    private static int catsCount = 0;

    public static void addNewCat() {
        Cat.catsCount++;
    }

    public static void main(String[] args) {

    }
}
