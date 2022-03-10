package feb22.maven.demo.col;

import java.util.ArrayList;
import java.util.Collection;

import feb22.maven.demo.personal.Product;

public class ColDemo3 {

	public static void main(String[] args) {

		Product door = new Product("Door", 200);
		Product window = new Product("WIndow", 400);
		Product panel = new Product("Panel", 800);
		Product table = new Product("Table", 1000);

//		Collection<Product> products = new ArrayList<>(); // Collection is the senior most interface
		ArrayList<Product> products = new ArrayList<>();
		products.add(door);
		products.add(window);
		products.add(panel);
		products.add(table);

//		System.out.println(Products);

		for (Product product : products) {
			System.out.println(product);
		}

//		Iterator<Product> iterator = products.iterator();
//
//		while (iterator.hasNext()) {
//			Product product = iterator.next();
//			System.out.println(product.getPrice());
//		}

		System.out.println(products.size());
		System.out.println(products.isEmpty());

		Collection<Product> toRemove = new ArrayList<>();
		toRemove.add(table);
		toRemove.add(panel);

		products.removeAll(toRemove);

		for (Product product : products) {
			System.out.println(product);
		}
	}
}
