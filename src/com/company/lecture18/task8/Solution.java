package com.company.lecture18.task8;

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

        while (true){
            String path1 = reader.readLine();

            try ( FileInputStream inputStream = new FileInputStream(path1) ){
                if (inputStream.available() < 1000) throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {}
}

