package com.company.lecture12.task_43;

import java.util.concurrent.Callable;

public class Solution {

    public static void main(String[] args) throws Exception {
        DeleteBool c = (i) -> i % 13 == 0;
        System.out.println(c.devide(13));
        System.out.println(c.devide(12));


        MaxLength ml = (String a, String b) -> {
            String result;
            if (a.length() >= b.length())
                result = a;
            else
                result = b;
            return result;
        };

        System.out.println(ml.maxLength("aaaa", "fffffff"));
    }

    public interface DeleteBool {
        boolean devide(int i);
    }

    public interface MaxLength {
        String maxLength(String a, String b);
    }
}







