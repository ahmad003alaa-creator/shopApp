package com.example.shopapp;

public class Product {
    private final String name;
    private final String price;
    private final int imageRes;

    public Product(String name, String price, int imageRes) {
        this.name = name;
        this.price = price;
        this.imageRes = imageRes;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public int getImageRes() { return imageRes; }
}
