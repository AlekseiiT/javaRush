package com.company.stackTraceAndExceptions.task930;


import java.util.ArrayList;

/*
Страшная сказка
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        Grandmother grandmother = new Grandmother();
        LittleRedRidingHood redHood = new LittleRedRidingHood();

        Wolf wolf = new Wolf();
        wolf.ate.add(grandmother);
        wolf.ate.add(redHood);

        Woodman woodman = new Woodman();
        woodman.killed.add(wolf);

        Patty patty = new Patty();
    }

    // Красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    // Бабушка
    public static class Grandmother extends StoryItem {
    }

    // Пирожок
    public static class Patty extends StoryItem {
    }

    // Дровосек
    public static class Woodman extends StoryItem {
    }

    // Волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}

