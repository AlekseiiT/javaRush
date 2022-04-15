package com.company.stackTraceAndExceptions.task927;

/*
Перехват выборочных исключений
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while (true){
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e) {
            for (Integer num : arrayList){
                System.out.println(num);
            }
        }
    }
}
