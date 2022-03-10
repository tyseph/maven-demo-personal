package feb22.maven.demo.col.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 15; i++) {
			list.add(i);
		}

		for (int i : list) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(list);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

//		System.out.println();
//		iterator.forEachRemaining(e -> System.out.println(e));

		System.out.println();
		list.forEach(e -> System.out.print(e));
	}
}
