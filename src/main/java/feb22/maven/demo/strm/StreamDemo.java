package feb22.maven.demo.strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import feb22.maven.demo.personal.Emp;

public class StreamDemo {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(101, "Sonu", 50000));
		empList.add(new Emp(102, "Monu", 60000));
		empList.add(new Emp(103, "Ponu", 45000));
		empList.add(new Emp(104, "Tonu", 55000));
		empList.add(new Emp(105, "Gonu", 65000));

		System.out.println("Iterate and print elements with forEach and lambda: ");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("Emps list with higher salary:");
		List<Emp> empWithHigherSal = empList.stream().filter(e -> e.getSalary() >= 60000).collect(Collectors.toList());

		empWithHigherSal.forEach(e -> System.out.println(e.toString()));

		System.out.println("Emps list with higher salary:");
//		List<Emp> empWithHigherSal = empList.stream().filter(e -> e.getSalary() >= 60000)
//				.collect(Collectors.toList());
//		empWithHigherSal.forEach(e -> System.out.println(e.toString()));

		empList.stream().filter(e -> e.getSalary() >= 60000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.toString()));

		System.out.println("Emps list of first 3 Emps: ");
		empList.stream().limit(3).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));

		System.out.println("Emps list of last 3 Emps: ");
		empList.stream().skip(2).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));

		System.out.println("Emps list of 2nd, 3 rd Emps: ");
		empList.stream().skip(1).limit(2).collect(Collectors.toList()).forEach(e -> System.out.println(e.toString()));
//		List<String> empUpper = empList.stream().map(e -> e.getFirstName().toUpperCase()));
		System.out.println("\nUsing map() to change case");
		List<Emp> nameInUpperCase = empList.stream().map(emp2 -> emp2 = null).collect((Collectors.toList()));

		System.out.println(nameInUpperCase);

		System.out.println("\nUsing map() to change case");
//		List<String> nameInUpperCase2 = empList.stream().map(emp -> emp.getFirstName().toUpperCase())
//				.collect((Collectors.toList()));

		List<String> nameInUpperCase2 = empList.stream().map(emp -> {
			return emp.getName().toUpperCase();
		}).collect((Collectors.toList()));

		nameInUpperCase2.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("\nUsing map() to change emp data");
		empList.stream().map((e) -> {
			e.setName(e.getName().toUpperCase());
			e.setSalary(e.getSalary() * 2);
			return e;
		}).collect((Collectors.toList())).forEach((e) -> System.out.println(e));

//		updatedEmps.forEach(e -> System.out.println(e.toString()));

//		List<Emp> updatedEmps = empList.stream().map((e) -> {
//			e.setFirstName(e.getFirstName().toUpperCase());
//			e.setSalary(e.getSalary() * 2);
//		}).collect((Collectors.toList()));

	}
}
