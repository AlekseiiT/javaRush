package com.company.task_6_8_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < ints.length; i++) {
            if(i == 0 || i % 2 == 0)
                even += ints[i];
            else
                odd += ints[i];
        }

        if(even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (even < odd)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

        Object[] a = new Object[5];


    }
}
