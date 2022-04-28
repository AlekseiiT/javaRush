package com.company.lecture12.task_51;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String line;
        try {
            BufferedReader reader =  new BufferedReader(new FileReader(Statics.FILE_NAME));
            while ((line = reader.readLine()) != null){
                lines.add(line);
            }
            reader.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}







