package selenium.java;

public class Day_7_LogicalOperators {

	public static void main(String[] args) {

		// Logical Operators: && (Logical AND), ` (Logical OR), ! (Logical Not)
		int age = 25;
		String country = "India";

		// Logical AND
		if (age < 18 && country.equals("India")) {
			System.out.println("You are elegible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}

		// Logical OR
		if (age < 18 || country.equals("India")) {
			System.out.println("You are elegible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		// Logical NOT(!)
		boolean isStudent = true;
		if (!isStudent) {
			System.out.println("He is not student");
		} else {
			System.out.println("He is student");
		}
	}

}
