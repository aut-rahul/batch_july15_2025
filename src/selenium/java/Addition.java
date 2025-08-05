package selenium.java;

public class Addition {

	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println("Sum is " + (a + b));
	}

	public static void sum(int a, int b) {
		System.out.println("Two input " + (a + b));

	}

	public static void sum(int a, int b, int c) {
		System.out.println("Three input " + (a + b + c));

	}

	public static void sum(int a, int b, int c, int d) {
		System.out.println("Four input " + (a + b + c + d));

	}

	public static void sum(int a, int b, int c, String d) {
		System.out.println("I have given $ " + (a + b + c) + " to " + d);

	}
}
