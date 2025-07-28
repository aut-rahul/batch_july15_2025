package selenium.java;

public class Day_5_Object {

	public static void main(String[] args) {
		Class1.sum2(); // class.method() because both are static
		sum3();
		Class1 obj1= new Class1();
		obj1.sum1();
		Day_5_Object obj2= new Day_5_Object();
		obj2.sum4();
		

	}
	public static void sum3() {

		int a = 10;
		int b = 20;
		System.out.println("Static  method sum 3:"+(a + b));

	}
	public void sum4() {

		int a = 10;
		int b = 20;
		System.out.println("Non Static method sum 4: "+(a + b));

	}

}
