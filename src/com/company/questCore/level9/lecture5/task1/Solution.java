package com.company.questCore.level9.lecture5.task1;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileReader inputReader = new FileReader(reader.readLine());
                FileWriter outputWriter = new FileWriter(reader.readLine());
                ){
            int counter = 1;

            while (inputReader.ready()){
                int readByte = inputReader.read();
                if (counter % 2 == 0){
                    outputWriter.write(readByte);
                }
                counter++;
            }
        }
    }
}
