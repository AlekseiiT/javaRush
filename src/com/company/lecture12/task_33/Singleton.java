package com.company.lecture12.task_33;

public class Singleton {

    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
