package selenium.java;

public class Day_6_String {

	public static void main(String[] args) {
		
		// String : is class as well as variable
		// Sequence of character: "abc", "123", "abc@123", "12ab", "850"
			
		stringMethod();
	}
	
	public static void stringMethod() {
		
		String name= "Java Programming";
		
		// String methods
		System.out.println("Length of the string :"+name.length()); // Length
		System.out.println("Upper case :"+name.toUpperCase()); // In upper case
		System.out.println("Lower case :"+name.toLowerCase()); // Lower case
		System.out.println("First letter of the string is :" +name.charAt(0) ); // Character find based on Position 
		
		// Find the position of A: When A finds first, will display the result. Not go to check another A
		// Find the character which is on 2nd Position: Pass the index value
		System.out.println("Substring :"+name.substring(5));
		System.out.println("substring 2 :"+name.substring(5, 16));		
		System.out.println("substring 3 :"+name.substring(5, 15));
		
		System.out.println("Replace Java with 'Python' :"+name.replace("Java", "Python"));
		
		System.out.println("Replace : "+name.replace('a', 'b'));
		
		
	}
}
