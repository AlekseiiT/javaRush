package com.company.lecture12.task_49;

public class Earth implements Planet{
    private static Earth instance;

    private Earth(){}

    public static Earth getInstance(){
        if(instance == null)
            instance = new Earth();
        return instance;
    }
}
