package selenium.java;

public class Day_8_BitwiseOperators {

	public static void main(String[] args) {

		// Bitwise Operators:
		// &: a&b
		// OR:
		// XOR: ^ a^b
		// Bitwise complement: ~ ~a
		// Left shift: << a<<2
		// Right shift: >> a>>2

		int a = 5; //101  011 1
		int b = 3;
		String s1 = "Yojna";
		String s2 = "yojna";

		// Bitwise AND (&)

		int andResult = a & b; 
		System.out.println("andResult is " + andResult);

		// Bitwise OR (|)
		int orResult = a | b;
		System.out.println("orResult is " + orResult);

		// Bitwise XOR (^)
		int xorResult = a ^ b;
		System.out.println("xorResult is " + xorResult);

		// Bitwise NOT (~)
		int notResult = ~a;
		System.out.println("notResult is " + notResult);

		// Bitwise Leftshift (<<)
		int leftShiftResult = a << 1;
		System.out.println("leftShiftResult is " + leftShiftResult);

		// Bitwise Rightshift (<<)
		int rightShiftResult = a >> 1;
		System.out.println("rightShiftResult is " + rightShiftResult);
	}

}
