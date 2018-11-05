package com.company;

public class Product extends ProductNameComparator {
    int count;
    String name;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public String getName(){
        return this.name;
    }
}
