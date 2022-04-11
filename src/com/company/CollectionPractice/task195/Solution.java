package com.company.CollectionPractice.task195;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Смирнов", 500);
        map.put("Иванов", 300);
        map.put("Кузнецов", 2000);
        map.put("Соколов", 550);
        map.put("Попов", 200);
        map.put("Лебедев", 600);
        map.put("Новиков", 700);
        map.put("Козлов", 850);
        map.put("Морозов", 725);
        map.put("Петров", 530);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> temp = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : temp.entrySet()){
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);
    }
}

