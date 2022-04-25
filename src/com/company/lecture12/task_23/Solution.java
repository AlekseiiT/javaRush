package com.company.lecture12.task_23;


/*
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}

