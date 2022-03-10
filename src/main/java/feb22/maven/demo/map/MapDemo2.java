package feb22.maven.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import feb22.maven.demo.personal.Product;

public class MapDemo2 {

	public static void main(String[] args) {
		Product door = new Product("Door", 200);
		Product window = new Product("WIndow", 400);
		Product panel = new Product("Panel", 800);
		Product table = new Product("Table", 1000);
		Product chair = new Product("Chair", 1200);
		Product sofa = new Product("SOfa", 1000);
		Product bed = new Product("Bed", 800);

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

		ids.remove(1);
		System.out.println(ids);
		System.out.println(idToProduct);

//	        ids.add(5);

		Collection<Product> products = idToProduct.values();
		System.out.println(products);
		System.out.println(idToProduct);

		products.remove(window);

		System.out.println(products);
		System.out.println(idToProduct);

//	        products.add(window);

		Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
		for (Map.Entry<Integer, Product> entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

//	            entry.setValue(window);
		}

		Map.Entry<Integer, Product> entry = Map.entry(3, window);
//		entries.add(entry);

		System.out.println(entry);
	}
}
