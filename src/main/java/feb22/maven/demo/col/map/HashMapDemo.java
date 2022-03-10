package feb22.maven.demo.col.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "First");
		map.put(2, "Second");
		map.put(3, "Third");
		map.put(4, "Fourth");
		System.out.println(map);

		map.replace(1, "one");
		System.out.println(map);

		map.replaceAll((key, value) -> {
			return value.toUpperCase();
		});
		System.out.println(map);
		System.out.println();
	}
}
