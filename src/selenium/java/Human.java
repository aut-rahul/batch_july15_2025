package selenium.java;

public class Human {

	static String gender;
	static String name;
	int age; // non static variable
	boolean isMarried;
	boolean isWorking;

	public static void gender() {

		System.out.println("Gender is " + gender);

	}

	public static void name() {

		System.out.println("name is " + name);

	}

	public void maritialStatus() { // non static method

		System.out.println("maritial Status is " + isMarried);

	}

	public void workingStatus() { // non static method

		System.out.println("working Status is " + isWorking);

	}

}
