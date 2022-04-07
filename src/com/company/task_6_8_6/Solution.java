package com.company.task_6_8_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandadName = reader.readLine();
        Cat catGrandad = new Cat(grandadName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat fatherCat = new Cat(fatherName, null, catGrandad);

        String motherName = reader.readLine();
        Cat motherCat = new Cat(motherName, catGrandma, null);

        String sonName = reader.readLine();
        Cat sonCat = new Cat(sonName, motherCat, fatherCat);

        String daughterName = reader.readLine();
        Cat daughterCat = new Cat(daughterName, motherCat, fatherCat);

        System.out.println(catGrandad);
        System.out.println(catGrandma);
        System.out.println(fatherCat);
        System.out.println(motherCat);
        System.out.println(sonCat);
        System.out.println(daughterCat);
    }

    public static class Cat {
        private String name;
        private Cat mom;
        private Cat dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }

        @Override
        public String toString() {
            if (mom == null && dad == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if ( mom == null )
                return "The cat's name is " + name + ", no mother, father is " + dad.name;
            else if ( dad == null)
                return "The cat's name is " + name + ", mother is " + mom.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
        }
    }

}
