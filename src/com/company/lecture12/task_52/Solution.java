package com.company.lecture12.task_52;

import jdk.jshell.EvalException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] params = parseString(url);

        printParams(params);

        for (String str : params){
            if (str.contains("obj=")){
                String value = str.substring(str.indexOf("=") + 1);
                try {
                    alert(Double.parseDouble(value));
                } catch (Exception e) {
                    alert(value);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    private static String[] parseString(String input){
        return input.substring(input.indexOf("?")+1).split("&");
    }


    private static void printParams(String[] params){
        StringBuilder result = new StringBuilder();
        for (String param : params){
            if (param.contains("="))
                result.append(param.substring(0, param.indexOf("="))).append(" ");
            else
                result.append(param).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}






