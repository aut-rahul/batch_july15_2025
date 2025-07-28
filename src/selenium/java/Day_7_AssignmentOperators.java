package selenium.java;

public class Day_7_AssignmentOperators {

	public static void main(String[] args) {
		
		// Assign: = (a=5)
		// Add and assign: +=  (a+=5) means (a=a+5)
		// Subtract and assign: -= (a-=5) means (a=a-5)
		// Multiply and assign: *= (a*=5) means (a=a*5)
		// Division and assign: /= (a/=5) means (a=a/5)
		// Modulus and assign: %= (a%=5) means (a=a%5)
		
		int a= 10;
		System.out.println("initial value of a is :"+a);//10
		
		a=10;
		System.out.println("a= "+a); //10
		
		a=a+5;
		//a+=5; // a=a+5
		System.out.println("value of a+=5 is :"+a); //15
		
		a-=3; //a=a-3
		System.out.println("value of a-=3 is :"+a); //12
		
		a*=5; //a=a*3
		System.out.println("value of a*=5 is :"+a); //60
		
		a/=5; //a=a/5
		System.out.println("value of a/5 is :"+a); //12
		
		a%=5; //a=a%5
		System.out.println("value of a%=5 is :"+a); //2

	}
	
	public static void val() {
		
		int a=10;
		System.out.println("value of a is "+a); //10
		a=a+20;
		System.out.println("value of a is +a"); //30
		a=20;
		System.out.println("value of a is +a"); //20
		
	}

}
