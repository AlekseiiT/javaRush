package com.company.lecture12.task_47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/*
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList al = getList();

        for (Object el : al){
            if (el instanceof Double)
                print((Double) el);
            else if (el instanceof Short)
                print((short) el);
            else if (el instanceof Integer)
                print((int) el);
            else
                print((String)el);
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static ArrayList getList() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList al = new ArrayList();
        while (true){
            String str = reader.readLine();
            if (str.equals("exit")) break;

            if (isDouble(str)){
                al.add(Double.parseDouble(str));
                continue;
            }

            if (isInteger(str)){
                int num = Integer.parseInt(str);
                if (num > 0 && num < 128)
                    al.add((short)num);
                else
                    al.add(num);
            }
            else
                al.add(str);
        }
        return al;
    }

    public static boolean isDouble( String input) {
        return input.contains(".");
    }

    private static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}







