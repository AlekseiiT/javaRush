package com.company.task_4_4_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
    количество дней в году: x
    , где
    х - 366 для високосного года,
    х - 365 для обычного года.

    Подсказка:
    В високосном году - 366 дней, тогда как в обычном - 365.
    1) если год делится без остатка на 400 это високосный год;
    2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
    3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
    4) все оставшиеся года невисокосные.
    Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    Годы 2100, 2200 и 2300 - не високосные.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine());
        int days;

        if (year % 400 == 0)
            days = 366;
        else if (year % 100 == 0)
            days = 365;
        else if (year % 4 == 0)
            days = 366;
        else
            days = 365;

        System.out.println("количество дней в году: " + days);
    }
}
