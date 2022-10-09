package com.company.questCore.level8.lecture11;

import com.company.questCore.level8.lecture11.constants.TaskConstants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {

        System.out.println(TaskConstants.getDataTxtPath());
        if(args.length == 0){
            System.out.println("Submit parameters!");
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        List<Product> products = new ArrayList<>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]){
            case "-c":
                int id = 0;
                for (Product product : products){
                    if (product.id > id) {
                        id = product.id;
                    }
                }
                Product product = new Product(++id, args[1], args[2], args[3]);
                try(FileWriter fileWriter = new FileWriter(path, true)){
                    fileWriter.write(product.toString());
                }
        }
    }

    public static Product getProduct(String product){
        String[] productInfo = product.split(" ");
        String id = productInfo[0];
        String productName = productInfo[1];
        String price = productInfo[2];
        String quantity = productInfo[3];
        return new Product(Integer.parseInt(id), productName, price, quantity);
    }
}
