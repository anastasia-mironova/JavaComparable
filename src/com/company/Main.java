package com.company;

import java.util.Set;
import java.util.TreeSet;
/*
 * основной класс
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */
public class Main {

    public static void main(final String[] args) {
		ProductNameComparator pnComparator = new ProductNameComparator();
		ProductCountComparator pcComparator = new ProductCountComparator();

    	Set<Product> products1 = new TreeSet<>(pnComparator);
    	Set<Product> products2 = new TreeSet<>(pcComparator);


	    products1.add(new Product("Microwave", 20));
	    products1.add(new Product("Washing Machine", 15));
		products1.add(new Product("Fridge", 12));
		products1.add(new Product("Dishwasher", 3));

	    products2.add(new Product("Phone", 27));
	    products2.add(new Product("Computer", 13));
	    products2.add(new Product("TV", 17));
	    products2.add(new Product("Printer", 5));

	    System.out.println("products1: ");
	    for (Product s : products1) {
	    	System.out.println(s.getName());
		}
		for (Product s : products2) {
			System.out.println(s.getName());
		}

}
}
