package com.company.task_7_9_2;

import java.util.ArrayList;

/*
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if ( strings.get(i).contains("р") && strings.get(i).contains("л"))
                continue;
            else if (strings.get(i).contains("р")){
                strings.remove(i);
                i--;
            } else if (strings.get(i).contains("л")){
                strings.add(i, strings.get(i));
                i++;
            }
        }
        return strings;
    }
}
