package com.company.lecture12.task_9;

/*
Ненужные абстракции
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));

        StringBuilder builder = new StringBuilder();

        while (true) {
            String str = reader.readLine();
            builder.append(str).append("\n");
            if (str.equals("exit"))
                break;
        }

        writer.write(builder.toString());
        writer.close();
    }
}

