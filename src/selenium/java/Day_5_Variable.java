package selenium.java;

public class Day_5_Variable {

	int a=67 ; // Global Variable: Class Level Variable

	public static void main(String[] args) {

		int a = 1;
		System.out.println("Main method value of a is " + a);
		sum();
		Day_5_Variable obj = new Day_5_Variable();
		obj.sum1();

	}

	public static void sum() {
		int a = 15;
		System.out.println("Sum is " + a);
	}

	public void sum1() {
		a=12;
		a=66;
		System.out.println("Sum1 is " + a);
	}

}
