package com.company.questCore.level8.lecture11.task2;

import com.company.questCore.level8.lecture11.task2.constants.TaskConstants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

        switch (args[0]) {
            case "-c": {
                int id = 0;
                for (Product product : products) {
                    if (product.id > id) {
                        id = product.id;
                    }
                }
                Product product = new Product(++id, args[1], args[2], args[3]);
                products.add(product);
                break;
            }
            case "-u": {
                Product productToUpdate = null;
                for (Product product : products) {
                    if (product.id == Integer.parseInt(args[1])) {
                        productToUpdate = product;
                        product.name = args[2];
                        product.price = args[3];
                        product.quantity = args[4];
                    }
                }
                if (productToUpdate == null) {
                    System.out.println("There's no such product available!");
                    return;
                }
                break;
            }
            case "-d": {
                int id = Integer.parseInt(args[1]);
                Product productToDelete = null;
                for (Product product : products) {
                    if (id == product.id) {
                        productToDelete = product;
                    }
                }
                if (productToDelete == null) {
                    System.out.println("There's no such product to delete!");
                    break;
                }
                products.remove(productToDelete);
            }
        }
        try(FileWriter fileWriter = new FileWriter(path)) {
            for (Product product : products){
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
