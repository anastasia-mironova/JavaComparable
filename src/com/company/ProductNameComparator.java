package com.company;

import java.util.Comparator;
/*
 * Comparator для класса Product
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */
public class ProductNameComparator implements Comparator<Product> {
    @Override /* ереопределение метода compare*/
    public int compare(final Product o1, final Product o2) {
        return o1.name.length() - o2.name.length();
    }
}