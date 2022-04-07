package com.company.task_7_9_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        while (true){
            String str = reader.readLine();
            if (str.equals("end"))
                break;
            else
                strings.add(str);
        }

        for (String str : strings){
            System.out.println(str);
        }




    }
}
