package com.company.lecture18.task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String path = new BufferedReader(new InputStreamReader(System.in)).readLine();

        int[] byteCountArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            while (fileInputStream.available() > 0){
                byteCountArray[fileInputStream.read()] += 1;
            }
        }

        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && minCount > byteCount) minCount = byteCount;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount) result.add(i);
        }

        for (int resultItem : result) System.out.print(resultItem + " ");
    }
}
