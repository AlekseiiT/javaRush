package com.company.lecture18.task5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String path = new BufferedReader(new InputStreamReader(System.in)).readLine();

        Set<Integer> set = new TreeSet<>();
        try(FileInputStream fileInputStream = new FileInputStream(path)) {
            while (fileInputStream.available() > 0) {
                set.add(fileInputStream.read());
            }
        }

        for (int element : set) System.out.print(element + " ");
    }
}

