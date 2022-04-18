package com.company.lecture10.task_6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        while (true){
            String num = reader.readLine();
            if (num.isEmpty())
                break;
            int id = Integer.parseInt(num);
            String str = reader.readLine();
            map.put(str, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}

