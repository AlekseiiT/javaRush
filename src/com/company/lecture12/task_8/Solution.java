package com.company.lecture12.task_8;

/*
Ненужные абстракции
*/



import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();
        InputStream inputStream = new FileInputStream(path);
        while(inputStream.available()>0)
        {
            System.out.print((char)inputStream.read());
        }
        reader.close();
        inputStream.close();
    }
}
