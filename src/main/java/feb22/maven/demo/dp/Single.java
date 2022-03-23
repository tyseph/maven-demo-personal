package feb22.maven.demo.dp;
/*
 * LAZY INITIALIZATION -- Better Memory Management
 */

//public class Single {
//
//	private static Single obj;
//
//	private Single() {
//
//	}
//
//	public static Single getInstance() {
//		if (obj == null)
//			obj = new Single();
//		return obj;
//	}
//}

/*
 * EARLY INITIALIZATION -- Faster execution
 */
public class Single {

	private static Single obj = new Single();

	private Single() {

	}

	public static Single getInstance() {
		return obj;
	}
}

//public class Single {
//
//	private static Single obj;
//
//	private Single() {
//
//	}
//
//	public static Single getInstance() {
//		if (obj == null) {
//			obj = new Single();
//			return obj;
//		} else
//			return obj;
//	}
//}
