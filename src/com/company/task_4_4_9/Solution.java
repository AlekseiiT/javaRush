package com.company.task_4_4_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class Solution {

    /*
    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    Выведенные числа должны быть разделены пробелом.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());

        int[] arr = {num1, num2, num3};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
