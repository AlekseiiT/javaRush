package com.company.lecture18.task6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        final int ASCII_COMMA = 44;

        String path = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream inputStream = new FileInputStream(path);

        int count = 0;
        while (inputStream.available() > 0){
            if (inputStream.read() == ASCII_COMMA) count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}

