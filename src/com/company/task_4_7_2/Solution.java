package com.company.task_4_7_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
    "четное однозначное число" - если число четное и имеет одну цифру,
    "нечетное однозначное число" - если число нечетное и имеет одну цифру,
    "четное двузначное число" - если число четное и имеет две цифры,
    "нечетное двузначное число" - если число нечетное и имеет две цифры,
    "четное трехзначное число" - если число четное и имеет три цифры,
    "нечетное трехзначное число" - если число нечетное и имеет три цифры.
    Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int remeining = Integer.parseInt(str) % 2;

        if(str.length() == 1 && remeining != 0)
            System.out.println("нечетное однозначное число");
        else if(str.length() == 1 && remeining == 0)
            System.out.println("четное однозначное число");
        else if(str.length() == 2 && remeining != 0)
            System.out.println("нечетное двузначное число");
        else if(str.length() == 2 && remeining == 0)
            System.out.println("четное двузначное число");
        else if(str.length() == 3 && remeining != 0)
            System.out.println("нечетное трехзначное число");
        else if(str.length() == 3 && remeining == 0 && Integer.parseInt(str) < 1000 && Integer.parseInt(str) > 0)
            System.out.println("четное трехзначное число");


    }
}
