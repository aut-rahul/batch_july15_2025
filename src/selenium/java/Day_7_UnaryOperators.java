package selenium.java;

public class Day_7_UnaryOperators {

	public static void main(String[] args) {

		// Unary Operators: + (+a), - (-a), ++ (increment), --(decrement), ! (Logical
		// Not: !true= false)

		int a = 10;
		int b = 2;
		/*
		 * System.out.println("value of a is : "+(+a));
		 * System.out.println("value of a is : "+(-a));
		 * System.out.println("value of a is : "+(++a));
		 * System.out.println("value of a is : "+(--a));
		 * 
		 * System.out.println(+a - a + ++a );
		 */
		System.out.println(++a - a + ++a + b - b - --b); //11 -11+12+2-2-1 :11

	}

}
