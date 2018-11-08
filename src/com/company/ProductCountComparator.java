package com.company;

import java.util.Comparator;

public class ProductCountComparator implements Comparator<Product> {
    @Override /* переопределение метода compare*/
    public int compare(Product o1, Product o2) {
        return o1.count - o2.count;
    }
}
