package com.company.questCore.level9.lecture11.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String oldFileName = reader.readLine();
        String newFileName = reader.readLine();

        List<String> oldFileLines = readFileLines(oldFileName);
        List<String> newFileLines = readFileLines(newFileName);

        int oldFileLine = 0;
        int newFileLine = 0;

        while ((oldFileLine < oldFileLines.size()) && (newFileLine < newFileLines.size())) {
            if (oldFileLines.get(oldFileLine).equals(newFileLines.get(newFileLine))) {
                lines.add(new LineItem(Type.SAME, oldFileLines.get(oldFileLine)));
                oldFileLine++;
                newFileLine++;
            } else if ((newFileLine + 1 < newFileLines.size()) && oldFileLines.get(oldFileLine).equals(newFileLines.get(newFileLine + 1))) {
                lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLine)));
                newFileLine++;
            } else if ((oldFileLine + 1 < oldFileLines.size()) && oldFileLines.get(oldFileLine + 1).equals(newFileLines.get(newFileLine))) {
                lines.add(new LineItem(Type.REMOVED, oldFileLines.get(oldFileLine)));
                oldFileLine++;
            }
        }

        while (oldFileLine < (oldFileLines.size())) {
            lines.add(new LineItem(Type.REMOVED, oldFileLines.get(oldFileLine)));
            oldFileLine++;
        }
        while (newFileLine < (newFileLines.size())) {
            lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLine)));
            newFileLine++;
        }

    }

    private static List<String> readFileLines(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        }
        return lines;
    }
}