package com.company.task_5_6_1;

import java.util.ArrayList;

public class Cat {
    /*
    1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
    2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
    3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
     */

    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
        Cat.cats.add(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }

        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

    }
}
