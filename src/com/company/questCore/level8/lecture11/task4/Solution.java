package com.company.questCore.level8.lecture11.task4;

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        int countOfSpaces = 0;
        int countOfChars = 0;

        try(FileReader reader = new FileReader(args[0])){
            while (reader.ready()){
                countOfChars++;
                char readedChar = (char)reader.read();
                if (readedChar == ' ') countOfSpaces++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (countOfChars != 0){
            double result = (double)countOfSpaces/countOfChars * 100;
            System.out.printf("%.2f", result);
        }
    }
}
