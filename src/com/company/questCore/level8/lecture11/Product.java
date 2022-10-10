package com.company.questCore.level8.lecture11;

public class Product {
    int id;
    String name;
    String price;
    String quantity;

    public Product(int id, String name, String productName, String quantity){
        this.id = id;
        this.name = name;
        this.price = productName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%08d %s %s %s%n", id, name, price, quantity);
    }
}
