package com.company.lecture12.task_42;

import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "name";
        System.out.println(cat.name);
    }

    public static void main(String[] args) throws Exception {
        Callable<String> c = () -> "42";
        System.out.println(c.call());
    }

    public static class Cat {
        public String name;
    }
}







