package com.company.task_4_7_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        /*
        Вводить с клавиатуры числа и вычислить среднее арифметическое.
        Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
        -1 не должно учитываться.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int sumNum = 0;


        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number != -1){
                sum += number;
                sumNum++;}
            else
                break;
        }

        Double avg = sum/sumNum;

        System.out.println(avg);
    }
}
