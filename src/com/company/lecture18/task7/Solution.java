package com.company.lecture18.task7;

import java.io.*;

/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path1 = reader.readLine();
        String path2 = reader.readLine();
        String path3 = reader.readLine();

        try(
                FileInputStream inputStream = new FileInputStream(path1);
                FileOutputStream file2 = new FileOutputStream(path2);
                FileOutputStream file3 = new FileOutputStream(path3)
           ){
            int half = (inputStream.available() + 1) / 2;
            int numberOfBytes = 0;

            while (inputStream.available() > 0) {
                if (numberOfBytes < half){
                    file2.write(inputStream.read());
                    numberOfBytes++;
                }
                else {
                    file3.write(inputStream.read());
                }
            }
        }
    }
}

