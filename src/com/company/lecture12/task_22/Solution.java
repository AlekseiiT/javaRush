package com.company.lecture12.task_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Player and Dancer
*/

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            switch (country) {
                case Country.RUSSIA:
                    hen =new RussianHen();
                    break;
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }
            return hen;
        }
    }
}

