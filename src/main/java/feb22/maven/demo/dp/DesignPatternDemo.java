package feb22.maven.demo.dp;

/*
 * Design Pattens --
 * 1.  Creational Design Patterns
 * 2. Structural Design Patterns
 * 3. Behavioural Design Patterns
 */

class Employee {

}

class PM {

}

public class DesignPatternDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp2 = new Employee();

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));

		PM nm = new PM();
		PM ot = new PM();
		System.out.println(nm.equals(ot));

	}

}
