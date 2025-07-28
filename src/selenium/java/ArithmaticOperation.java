package selenium.java;

public class ArithmaticOperation {

	public static void sum() {

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum of a and b is " + c);

	}

	public static void sum(int a, int b) {

		int c = a + b;
		System.out.println("Sum of a and b is " + c);

	}

	public static void sum(int a, int b, int c) {

		System.out.println("Sum of a and b is " + (a + b + c));

	}
	public static void sum(int a, String b) {

		System.out.println("Sum of a and b is " + a+b);

	}
}
