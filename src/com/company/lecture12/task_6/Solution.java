package com.company.lecture12.task_6;

/*
Ненужные абстракции
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator {

        @Override
        public String getLanguage() {
            return "английского";
        }
    }
}


