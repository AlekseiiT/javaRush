package com.company.task_6_8_9;

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

        ArrayList<Integer> wholeList = new ArrayList<>();
        ArrayList<Integer> del3 = new ArrayList<>();
        ArrayList<Integer> del2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            wholeList.add(Integer.parseInt(reader.readLine()));
        }

        for (int num : wholeList) {
            if (num % 2 == 0 || num % 3 == 0) {
                if (num % 2 == 0) del2.add(num);
                if (num % 3 == 0) del3.add(num);
            } else {
                other.add(num);
            }
        }

        printList(del3);
        printList(del2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer num: list) {
            System.out.println(num);
        }
    }
}
