package com.company.lecture12.task_14;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(file));

        ArrayList<Integer> al = new ArrayList<>();
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            if (num % 2 == 0) al.add(num);
        }
        Collections.sort(al);
        for (int i : al){
            System.out.println(i);
        }

        scanner.close();
    }
}





