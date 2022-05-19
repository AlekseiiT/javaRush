package com.company.lecture18.task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // /home/user/Desktop/text.txt
        String fileName = reader.readLine();

        int maxByte = 0;


        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > maxByte) maxByte = data;
        }

        System.out.println(maxByte);

        inputStream.close();
        reader.close();


    }
}
