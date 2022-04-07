package com.company.task_4_4_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
    Если такая пара существует, вывести на экран числа через пробел.
    Если все три числа равны между собой, то вывести все три.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int num4 = Integer.parseInt(bufferedReader.readLine());

        int max1 = num1 > num2 ? num1 : num2;
        int max2 = num3 > num4 ? num3 : num4;
        int maxFinal = max1 > max2 ? max1 : max2;

        System.out.println(maxFinal);
    }
}
