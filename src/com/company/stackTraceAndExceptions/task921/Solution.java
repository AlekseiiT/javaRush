package com.company.stackTraceAndExceptions.task921;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        method1();
    }

    public static String method1() {
        method2();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}