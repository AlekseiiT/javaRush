package com.company.lecture17.task7;

/*
Предложения
*/

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        if ( args == null || args.length < 1) {
            throw new RuntimeException();
        }

        Date birthDate;
        Person person;
        switch (args[0]) {
            case "-c":
                if (args[2].equals("м"))
                    person = Person.createMale(args[1], simpleDateFormat.parse(args[3]));
                else
                    person = Person.createFemale(args[1], simpleDateFormat.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                person = allPeople.get(Integer.parseInt(args[1]));
                if(person != null)
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                break;
            case "-u":
                birthDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);

                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null)
                    throw new IllegalArgumentException();

                person.setName(args[2]);
                person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setBirthDate(birthDate);
                allPeople.set(id, person);
                break;
            case "-d":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null)
                    throw new IllegalArgumentException();
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
        }
    }
}