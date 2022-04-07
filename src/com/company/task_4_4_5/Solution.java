package com.company.task_4_4_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    Ввести с клавиатуры число.
    Если число положительное, то увеличить его в два раза.
    Если число отрицательное, то прибавить единицу.
    Если введенное число равно нулю, необходимо вывести ноль.
    Вывести результат на экран.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if(num > 0)
            System.out.println(num * 2);
        else if (num < 0)
            System.out.println(num +1);
        else
            System.out.println(num);


    }
}
