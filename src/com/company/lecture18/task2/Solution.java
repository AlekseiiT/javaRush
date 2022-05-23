package com.company.lecture18.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String path = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(path);

        int minByte = 255;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            minByte = Math.min(data, minByte);
        }
        fileInputStream.close();
        System.out.println(minByte);
    }
}
