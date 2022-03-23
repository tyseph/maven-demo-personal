package feb22.maven.demo.dp;

public class SingletonDemo {

	public static void main(String[] args) {

//		Single sing = new Single();

		Single obj = Single.getInstance();
		Single obj2 = Single.getInstance();

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}
}
