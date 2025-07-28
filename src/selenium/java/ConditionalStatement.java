package selenium.java;

public class ConditionalStatement {

	public static void ifCondition1() {

		int a = 3;

		if (a > 0) {
			System.out.println("if Cond: Number is positive.");
		}

	}

	public static void ifElseCondition() {

		int a = 4;

		if (a > 0) {
			System.out.println("if else cond: Number is positive.");
		} else {
			System.out.println("if else cond: Number is negative.");
		}

	}

	public static void ifElseIfCondition() {

		int marks = 75;

		if (marks >= 90) {
			System.out.println("A+ grade");
		} else if (marks >= 75) {
			System.out.println("A grade");
		} else if (marks >= 60) {
			System.out.println("B+ grade");
		} else if (marks >= 33) {
			System.out.println("B grade");
		} else {
			System.out.println("See you next year");
		}

	}

	public static void switchCondition() {

		int day = 58;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day ");

		}

	}

}
