package feb22.maven.demo.personal;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Sajal!");

		Emp emp = new Emp(1, "Sajal", 10000);
		Emp emp2 = new Emp(1, "Sajal", 10000);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));

		emp2.setEid(2);
		emp2.setName("Sparsh");
		System.out.println(emp.getEid());
		System.out.println(emp.hashCode());

		System.out.println(emp.toString());
		System.out.println(emp2.toString());
	}
}
