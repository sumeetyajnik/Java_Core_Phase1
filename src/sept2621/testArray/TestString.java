package sept2621.testArray;

public class TestString {

	public static String t = "Delhi";
	public static String o = "Mumbai";
	public static String k = "delhi";
	public static String y = new String("Mumbai");
	public static String l = new String("delhi");
	public static String p = new String("Hello");

	public static void main(String[] args) {
		if (o == l) {
			System.out.println("o == l is true");
		} else {
			System.out.println("o == l is false");
		}

		if (o.equalsIgnoreCase(l)) {
			System.out.println("o.equalsIgnoreCase(l) is true");
		} else {
			System.out.println("o.equalsIgnoreCase(l) is false");
		}
		
		
		if (y == p) {
			System.out.println("y == p is true");
		} else {
			System.out.println("y == p is false");
		}

		if (y.equalsIgnoreCase(p)) {
			System.out.println("y.equalsIgnoreCase(p) is true");
		} else {
			System.out.println("y.equalsIgnoreCase(p) is false");
		}
		
		
		if (t == o) {
			System.out.println("t == o is true");
		} else {
			System.out.println("t == o is false");
		}

		if (t.equalsIgnoreCase(l)) {
			System.out.println("t.equalsIgnoreCase(o) is true");
		} else {
			System.out.println("t.equalsIgnoreCase(o) is false");
		}
		
		
		if (k == y) {
			System.out.println("k == y is true");
		} else {
			System.out.println("k == y is false");
		}

		if (k.equalsIgnoreCase(l)) {
			System.out.println("k.equalsIgnoreCase(y) is true");
		} else {
			System.out.println("k.equalsIgnoreCase(y) is false");
		}
		
		
		if (p == y) {
			System.out.println("p == y is true");
		} else {
			System.out.println("p == y is false");
		}

		if (p.equalsIgnoreCase(l)) {
			System.out.println("p.equalsIgnoreCase(y) is true");
		} else {
			System.out.println("p.equalsIgnoreCase(y) is false");
		}

	}
}
