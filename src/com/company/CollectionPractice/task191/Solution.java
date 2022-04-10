package com.company.CollectionPractice.task191;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        copy.removeIf(num -> num > 10);
        return copy;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        System.out.println(set);
        set = removeAllNumbersGreaterThan10(set);
        System.out.println(set);
    }
}
