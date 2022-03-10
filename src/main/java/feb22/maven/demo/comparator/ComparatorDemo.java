package feb22.maven.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(new Emp(103, "Sajal", 10000.50));
		empList.add(new Emp(101, "Gatha", 10000.25));
		empList.add(new Emp(104, "Deepak", 10000.75));
		empList.add(new Emp(102, "Hemplata", 10000));

		System.out.println("-----INITIAL-----");
		empList.forEach(e -> System.out.println(e.toString()));

//		EmpCmpr comparator = new EmpCmpr();
//
////		Collections.sort(empList);
//		Collections.sort(empList, comparator);
//
//		System.out.println("after sorting empList");
//		empList.forEach(e -> System.out.println(e.toString()));

		EmpEidCmpr cmp2 = new EmpEidCmpr();

		Collections.sort(empList, cmp2);

		System.out.println("-----BY EID-----");
		empList.forEach(e -> System.out.println(e.toString()));

		EmpSalaryCmpr cmp3 = new EmpSalaryCmpr();

		Collections.sort(empList, cmp3);

		System.out.println("-----BY SALARY-----");
		empList.forEach(e -> System.out.println(e.toString()));

		EmpNameCmpr cmp4 = new EmpNameCmpr();

		Collections.sort(empList, cmp4);

		System.out.println("-----BY NAME-----");
		empList.forEach(e -> System.out.println(e.toString()));

	}

}
