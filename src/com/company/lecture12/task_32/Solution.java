package com.company.lecture12.task_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> nums = getTwoDigits();

        System.out.println(getNod(nums));
    }

    public static ArrayList<Integer> getTwoDigits() throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        nums.add(Integer.parseInt(reader.readLine()));
        nums.add(Integer.parseInt(reader.readLine()));
        nums.sort(Collections.reverseOrder());
        return nums;
    }

    public static int getNod(ArrayList<Integer> arrayList){
        int num1 = arrayList.get(0);
        int num2 = arrayList.get(1);

        if (num1 < 1 || num2 < 1) {
            throw new IllegalArgumentException();
        }

        int result;
        while (true) {
            int del = num1 % num2;
            if (del == 0) {
                result = num2;
                break;
            }
            else {
                num1 = num2;
                num2 = del;
            }
        }

        return result;
    }
}



