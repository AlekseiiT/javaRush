package com.company.lecture12.task_49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }

        if (str.equals("sun"))
            thePlanet = Sun.getInstance();
        else if (str.equals("moon"))
            thePlanet = Moon.getInstance();
        else if (str.equals("earth"))
            thePlanet = Earth.getInstance();
        else
            thePlanet = null;
    }
}








