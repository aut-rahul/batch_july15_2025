package selenium.java;

public class Day_6_StringBuilder {

	public static void main(String[] args) {
		
		immutableString();
		mutableString();

	}

	public static void immutableString() {

		long start = System.currentTimeMillis();
		String result = "";
		for (int i = 0; i < 100000; i++) {
			result += "Hello"; // new string every time
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken with string " + (end - start) + " ms");

	}

	public static void mutableString() {

		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Hello"); // modifies same object
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken with string builder " + (end - start) + " ms");

	}

}
