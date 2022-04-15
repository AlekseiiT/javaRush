package com.company.task_7_9_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        String[] words = string.split("\\s+");

        StringBuilder finalString = new StringBuilder();
        for (String word : words){
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            if (finalString.length() == 0){
                finalString = new StringBuilder(capitalizedWord);
                continue;
            }
            finalString.append(" ").append(capitalizedWord);
        }

        System.out.println(finalString);
    }
}