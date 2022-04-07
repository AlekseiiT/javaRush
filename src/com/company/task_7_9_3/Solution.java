package com.company.task_7_9_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 30; i > 0; i--) {
            System.out.println(i);
            if (i == 1)
                System.out.println("Бум!");
            Thread.sleep(100);
        }


    }
}
