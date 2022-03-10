package feb22.maven.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import feb22.maven.demo.personal.Product;

public class MapDemo {
	public static void main(String[] args) {

		Product door = new Product("Door", 200);
		Product window = new Product("WIndow", 400);
		Product panel = new Product("Panel", 800);
		Product table = new Product("Table", 1000);
		Product chair = new Product("Chair", 1200);
		Product sofa = new Product("SOfa", 1000);
		Product bed = new Product("Bed", 800);

//		Collection<Product> products = new ArrayList<>();
//		products.add(door);
//		products.add(window);
//		products.add(panel);
//		products.add(table);
//		products.add(chair);
//		products.add(sofa);
//		products.add(bed);
//
//		for (Product product : products) {
//			System.out.println(product);
//		}

		final Map<Integer, Product> idToProduct = new HashMap<>();
		idToProduct.put(1, door);
		idToProduct.put(2, panel);
		idToProduct.put(3, window);
		idToProduct.put(4, table);
		idToProduct.put(5, chair);
		idToProduct.put(6, sofa);
		idToProduct.put(3, bed);

		Set<Integer> ids = idToProduct.keySet();

		System.out.println(ids);
		System.out.println(idToProduct);
		System.out.println();

		Collection<Product> products = idToProduct.values();

		System.out.println(products);

	}
}
