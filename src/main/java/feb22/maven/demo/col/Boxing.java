package feb22.maven.demo.col;

import java.util.ArrayList;
import java.util.List;

public class Boxing {

	public static void main(String[] args) {

//		--------------------BOXING--------------------

//		10; //int or Integer

		Integer num = Integer.valueOf(1); // boxing
		System.out.println(num);

		Integer num2 = 2;
		System.out.println(num2); // Autoboxing

		int num3 = num2 + 1; // Unboxing
		System.out.println(num3);

		int num4 = num2.intValue() + 2; // Auto Unboxing
		System.out.println(num4);
		System.out.println();

//		--------------------HASHMAP--------------------

		

//		--------------------LIST/ARRAYLIST--------------------

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		System.out.println(list);

		List<Integer> subList = list.subList(4, 14);
		System.out.println(subList);
		System.out.println();

//		--------------------VECTORS--------------------

		

	}
}
