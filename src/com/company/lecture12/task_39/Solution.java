package com.company.lecture12.task_39;


/*
Максимально простой код-1
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static
    {
        labels.put(12.1,"h");
        labels.put(12.2,"h");
        labels.put(12.3,"h");
        labels.put(12.4,"h");
        labels.put(12.5,"h");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}








