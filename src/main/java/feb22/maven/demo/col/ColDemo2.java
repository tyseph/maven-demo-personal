package feb22.maven.demo.col;

import java.util.ArrayList;
import java.util.List;

import feb22.maven.demo.personal.Emp;

public class ColDemo2 {

	public static void main(String[] args) {

		Emp emp = new Emp(1, "Sajal", 20000);
		Emp emp2 = new Emp(2, "Saj", 30000);

		List<Integer> marks = new ArrayList<>();
		marks.add(98);
//		marks.add(emp); //Not allowed
//		marks.add("abc"); //Not allowed
		marks.add(93);
		marks.add(94);
		System.out.println(marks);
		System.out.println(marks.get(1));
		System.out.println(marks);

		List<Emp> empLists = new ArrayList<>();
		empLists.add(emp);
		empLists.add(emp2);

		System.out.println(empLists);
		for (Emp i : empLists) {
			System.out.println(i.getEid());
		}
	}

}
