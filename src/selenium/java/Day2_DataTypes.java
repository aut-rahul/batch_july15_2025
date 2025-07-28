package selenium.java;

public class Day2_DataTypes {

	public static void main(String[] args) {
		
		//byte age; // variable declaration
		//age=25;  // variable initialization
		
		byte age= 25;
		int salary=10000;
		float pi= 3.14f;
		char grade ='a';
		boolean isActive= true;
		
		String course1="Selenium";
		String course2=course1;
		int[] numbers= {1,2,3,4};
		
		salary=9000;
		course2= "API";
		
		System.out.println("age is "+age);
		System.out.println("salary is : "+salary);
		System.out.println("value of pi is "+pi);
		System.out.println("Grade is "+grade);
		System.out.println("User status "+isActive);
		System.out.println("Course is "+course1);
		System.out.println("value of numbers[2] is "+numbers[2] );
		
		
		
	}
	
}
