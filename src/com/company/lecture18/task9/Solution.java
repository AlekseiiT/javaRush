package com.company.lecture18.task9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path1 = reader.readLine();
        String path2 = reader.readLine();

        try(
                FileInputStream inputStream = new FileInputStream(path1);
                FileOutputStream outputStream = new FileOutputStream(path2);
        ){
            ArrayList<Integer> bytes = new ArrayList<>();

            while (inputStream.available() > 0) {
                bytes.add(inputStream.read());
            }
            Collections.reverse(bytes);

            for (int el : bytes) {
                outputStream.write(el);
            }
        }
    }
}

