package com.company.stackTraceAndExceptions.task929;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        StringBuilder resultVowels = new StringBuilder();
        StringBuilder resultConsonant = new StringBuilder();

        for (char character : str.toCharArray()){
            boolean isVowel = isVowel(character);
            if (isVowel)
                resultVowels.append(character).append(" ");
            else if ( character != ' ')
                resultConsonant.append(character).append(" ");
        }

        System.out.println(resultVowels);
        System.out.println(resultConsonant);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}


