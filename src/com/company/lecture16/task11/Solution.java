package com.company.lecture16.task11;

/*
Big Ben clock
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.HOUR_OF_DAY, hours);
            calendar.set(Calendar.MINUTE, minutes);
            calendar.set(Calendar.SECOND, seconds);
            calendar.add(Calendar.SECOND, 1);

            if (calendar.get(Calendar.HOUR) == 0 &&
                    calendar.get(Calendar.MINUTE) == 0 &&
                    calendar.get(Calendar.SECOND) == 0)
            {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!",
                        cityName,
                        calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE),
                        calendar.get(Calendar.SECOND)));
            }
            Thread.sleep(1000);
            this.hours = calendar.get(Calendar.HOUR_OF_DAY);
            this.minutes = calendar.get(Calendar.MINUTE);
            this.seconds = calendar.get(Calendar.SECOND);
        }
    }
}