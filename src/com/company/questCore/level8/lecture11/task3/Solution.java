package com.company.questCore.level8.lecture11.task3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Solution {

    private final static Character[] ENGLISH_CHAR_ARR = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
            , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final static Set<Character> ENGLISH_CHARACTERS = new HashSet<>(Arrays.asList(ENGLISH_CHAR_ARR));

    public static void main(String[] args) {
        int countOfEnglishChars = 0;

        try(FileReader fr = new FileReader(args[0])) {
            while (fr.ready()){
                char readChar = (char) fr.read();
                if (ENGLISH_CHARACTERS.contains(readChar))
                    countOfEnglishChars++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(countOfEnglishChars);
    }
}
