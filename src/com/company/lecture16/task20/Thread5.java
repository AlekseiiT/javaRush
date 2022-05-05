package com.company.lecture16.task20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Thread5 extends Thread{
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>();

        while (true){
            String str = null;
            try {
                str = reader.readLine();
                if (str.equals("N")) break;
                ints.add(Integer.parseInt(str));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int sum = 0;
        for (Integer num : ints){
            sum+=num;
        }
        System.out.println(sum);
    }
}
