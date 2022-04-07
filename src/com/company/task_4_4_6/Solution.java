package com.company.task_4_4_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
    "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
    если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
     */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if(num == 1)
            print("понедельник");
        else if (num == 2)
            print("вторник");
        else if (num == 3)
            print("среда");
        else if (num == 4)
            print("четверг");
        else if (num == 5)
            print("пятница");
        else if (num == 6)
            print("суббота");
        else if (num == 7)
            print("воскресенье");
        else
            print("такого дня недели не существует");
    }

    public static void print(String str){
        System.out.println(str);
    }
}
