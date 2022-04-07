package com.company;

public class Cat {

    /*
    Подсчитать суммарную стоимость яблок.
    За суммарную стоимость яблок отвечает переменная public static int applesPrice.
    */

    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
