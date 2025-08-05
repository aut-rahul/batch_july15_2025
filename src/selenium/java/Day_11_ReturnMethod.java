package selenium.java;

public class Day_11_ReturnMethod {

	public static void main(String[] args) {
		
		Day_11_ReturnMethod rm= new Day_11_ReturnMethod();
		int sum= rm.example1(10, 12);
		//System.out.println(sum);
		System.out.println(sum+1);
		String g=rm.greet("Rahul");
		System.out.println(g);
		String g1=rm.greet1("rahul","singh");
		System.out.println(g1);
		double sum1=rm.example2(10, 12.0677);
		System.out.println(sum1);
		float sum2=rm.example3(12, 3.5f);
		System.out.println(sum1);
		
		float a=0.0f;
		a=12.123456789f;
		double b= 0.0d;
		b=12.1234567890123456;
		System.out.println(a);
		System.out.println(b);

	}

	public int example1(int a, int b) {

		return a + b;

	}
	public String  greet(String name) {
		return "Hello "+name + " how are you !";
		
	}
	
	public String  greet1(String fname, String lName) {
		return "Hello "+fname +" "+ lName +".. "+" how are you!";
		
	}
	
	public  double example2(int a, double d) {

		return a + d;

	}
	public  float example3(int a, float d) {

		return a + d;

	}
	
	
}
