package feb22.maven.demo.comp;

import java.util.ArrayList;
import java.util.Collections;

import feb22.maven.demo.personal.Emp;

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Emp> empList = new ArrayList<>();

		empList.add(new Emp(103, "Sajal", 10000.50));
		empList.add(new Emp(101, "Gatha", 10000.25));
		empList.add(new Emp(104, "Deepak", 10000.75));
		empList.add(new Emp(102, "Hemplata", 10000));

//		Before Sorting
		empList.forEach(e -> System.out.println(e));

		Collections.sort(empList);

//		After Sorting
		System.out.println();
		empList.forEach(e -> System.out.println(e));

	}
}
