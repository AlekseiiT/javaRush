package com.company.lecture12.task_37;


import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        @Override
        public int getWeight() {
            return 79;
        }

        @Override
        public int getHeight() {
            return 175;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    }
}





