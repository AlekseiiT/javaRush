package com.company.CollectionPractice.task193;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("JULY 1 2012"));
        map.put("Соколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Попов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лебедев", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUNE 1 2012"));
        map.put("Козлов", dateFormat.parse("JUNE 1 2012"));
        map.put("Морозов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Pattern pattern = Pattern.compile("(JUNE|JULY|AUGUST) \\d+ \\d{4}");
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> copy = new HashMap<>(map);
        for ( Map.Entry<String, Date> pair : copy.entrySet()){
            String key = pair.getKey();
            String value = dateFormat.format(pair.getValue()).toUpperCase();
            if (pattern.matcher(value).matches()){
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}

