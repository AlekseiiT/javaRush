package com.company.CollectionPractice.task186;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> al = new ArrayList<Integer>();

        getFullArrayList(al);

        System.out.println(getMaxSequence(al));
    }

    public static void getFullArrayList(ArrayList<Integer> al) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            al.add(num);
        }
    }

    public static int getMaxSequence(ArrayList<Integer> al){
        int maxSequence = 1;
        int count = 1;
        if (al.isEmpty()) return maxSequence;

        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i).equals(al.get(i+1))) {
                maxSequence++;
            } else if (maxSequence > count) {
                count = maxSequence;
                maxSequence = 1;
            } else {
                maxSequence = 1;
            }
        }

        if (maxSequence > count)
            count = maxSequence;

        return count;
    }
}
