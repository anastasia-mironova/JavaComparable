package com.company;
/*
 * класс для хранения товаров
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */

public class Product extends ProductNameComparator {

    public String name;
    public int count;

    public Product(final String _name, final int _count) {
        this.name = _name;
        this.count = _count;
    }
    public String getName() {
        return this.name;
    }
}
