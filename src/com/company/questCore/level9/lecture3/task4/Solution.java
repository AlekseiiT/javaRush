package com.company.questCore.level9.lecture3.task4;


import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] details = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(details[5]), Integer.parseInt(details[4]) - 1, Integer.parseInt(details[3]));
            Date date = calendar.getTime();
            return new Person(details[1], details[2], details[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
