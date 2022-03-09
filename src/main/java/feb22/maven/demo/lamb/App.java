package feb22.maven.demo.lamb;

@FunctionalInterface
interface Int1 {
	public abstract void m1(int i);

}

/*
 * Using lambda expression (only for functional interface) functional interface
 * - only with one abstract method
 * 
 * Lambda ()->{};
 */

interface Int2 {
	public abstract int m2();
	// NO METHOD BODY ALLOWED
}

class Class1 implements Int1, Int2 {

//	@Override
//	public void m1() {
//		System.out.println("VOid M1");
//	}

	@Override
	public int m2() {
		System.out.print("INT M2: ");
		return 10 + 10;
	}

	@Override
	public void m1(int i) {
		// TODO Auto-generated method stub

	}
}

public class App {

	public static void main(String[] args) {

		Class1 obj = new Class1();
		obj.m1(10);
		System.out.println(obj.m2());

		Int2 obj2 = new Int2() {
			// THIS IS THE ANONYMOUS CLASS
			@Override
			public int m2() {
				System.out.print("Anonymous Class: ");
				return 5 + 5;
			}
		};
		System.out.println(obj2.m2());

		Int1 obj3 = (i) -> {
			System.out.println("Lamda method body: " + i);
		};

		Int1 obj4 = i -> System.out.println("Lambda body 2: " + i);

		obj3.m1(15);
		obj4.m1(20);

	}
}
