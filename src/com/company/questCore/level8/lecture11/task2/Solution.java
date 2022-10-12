package com.company.questCore.level8.lecture11.task2;

import com.company.questCore.level8.lecture11.task2.constants.TaskConstants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    /*
    * to add: -c productName price quantity
    * to update: -u id productName price quantity
    * to delete: -d id
    * */

    public static void main(String[] args) throws IOException {

        System.out.println(TaskConstants.getDataTxtPath());
        assertArgs(args);

        String path = getPathToTheFile();
        List<Product> products = getListOfProductsFromTheFile(path);

        switch (args[0]) {
            case "-c": {
                addNewProductToTheList(products, args);
                break;
            }
            case "-u": {
                updateProductInTheList(products, args);
                break;
            }
            case "-d": {
                deleteProductFromTheList(products, args);
                break;
            }
        }
        writeProductsIntoTheFile(products, path);
    }

    public static void assertArgs(String[] args){
        if(args.length == 0){
            System.out.println("Submit parameters!");
            System.exit(0);
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

    public static String getPathToTheFile() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        try {
            path = reader.readLine();
        } catch (IOException e){
            throw new RuntimeException();
        }
        return path;
    }

    public static List<Product> getListOfProductsFromTheFile(String path){
        List<Product> products = new ArrayList<>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return products;
    }

    public static void addNewProductToTheList(List<Product> products, String[] args){
        int id = 0;
        for (Product product : products) {
            if (product.id > id) {
                id = product.id;
            }
        }
        Product product = new Product(++id, args[1], args[2], args[3]);
        products.add(product);
    }

    public static void updateProductInTheList(List<Product> products, String[] args){
        boolean isUpdated = false;

        for (Product product : products) {
            if (product.id == Integer.parseInt(args[1])) {
                product.name = args[2];
                product.price = args[3];
                product.quantity = args[4];
                isUpdated = true;
            }
        }
        if (!isUpdated) {
            System.out.println("There's no such product available!");
            System.exit(0);
        }
    }

    public static void deleteProductFromTheList(List<Product> products, String[] args){
        int id = Integer.parseInt(args[1]);
        Product productToDelete = null;
        for (Product product : products) {
            if (id == product.id) {
                productToDelete = product;
            }
        }
        if (productToDelete == null) {
            System.out.println("There's no such product to delete!");
            System.exit(0);
        }
        products.remove(productToDelete);
    }

    public static void writeProductsIntoTheFile(List<Product> products, String path){
        try(FileWriter fileWriter = new FileWriter(path)) {
            for (Product product : products){
                fileWriter.write(product.toString());
            }
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}
