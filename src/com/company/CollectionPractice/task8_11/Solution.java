package com.company.CollectionPractice.task8_11;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat :  cats)
            System.out.println(cat);
    }

    public static class Cat
    {

        @Override
        public String toString(){
            return "This method is overwritten";
        }
    }
}


