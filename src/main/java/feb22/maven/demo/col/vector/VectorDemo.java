package feb22.maven.demo.col.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
//		List<Integer> vector2 = new Vector<>(); // Will give us list methods also

		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
		System.out.println("Vector: " + vector);
		System.out.println();

		for (int i = 0; i < 15; i++) {
			vector.add(i);
		}

		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
		System.out.println("Vector: " + vector);
		System.out.println();
	}
}
