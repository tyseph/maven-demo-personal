package feb22.maven.demo.col;

import java.awt.List;
import java.util.ArrayList;

/*
 * Collection Interfaces - 
 * Collections, List, Set, Map, Queue, ....
 * 
 * Collection Classes - 
 * ArrayList, LinkedList, Stack, Vector, HashSet, ....
 */

public class ColDemo {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("abc");
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add(5.50);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.remove(0);
		System.out.println(a1);
		System.out.println(a1.size());
		
		
//		List myList = new ArrayList();
//		myList.addKeyListener('a');
	}
}
