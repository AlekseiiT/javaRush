package com.company.task_5_5_1;

/*
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создай геттеры и сеттеры для всех переменных класса Person.
*/

public class Person {
    String name;
    int age;
    char sex;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(char sex){
        this.sex = sex;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public char getSex(){
        return this.sex;
    }

    public static void main(String[] args) {

    }
}

