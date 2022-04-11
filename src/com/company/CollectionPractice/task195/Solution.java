package com.company.CollectionPractice.task195;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Смирнов", 500);
        map1.put("Иванов", 300);
        map1.put("Кузнецов", 2000);
        map1.put("Соколов", 550);
        map1.put("Попов", 200);
        map1.put("Лебедев", 600);
        map1.put("Новиков", 700);
        map1.put("Козлов", 850);
        map1.put("Морозов", 725);
        map1.put("Петров", 530);
        return map1;
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

