package com.company.lecture12.task_44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args){
        if (result instanceof Plane)
            System.out.println(((Plane) result).passengers);
    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        if (str.equals("helicopter")) result = new Helicopter();
        if (str.equals("plane")) {
            int passengers = Integer.parseInt(reader.readLine());
            result = new Plane(passengers);
        }

        reader.close();
    }
}






