package com.company.stackTraceAndExceptions.task922;

public class Solution {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }


        System.out.println("I'm here!");

    }
}