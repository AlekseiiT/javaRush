package com.company.lecture12.task_49;

public class Sun implements Planet{
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance(){
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
