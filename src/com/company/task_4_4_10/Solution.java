package com.company.task_4_4_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /*
    Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
    Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
    Если имена и длины имен разные - ничего не выводить.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a>0 && b>0)
            System.out.println(1);
        else if (a<0 && b>0)
            System.out.println(2);
        else if (a<0 && b<0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
