package selenium.java;

public class DoWhileLoop {
	
	public static void doWhileLoop() {
		
		
		//First executes the do block (increment or decrement) then checks the condition
		int i=1;
		do {
			System.out.println(+i);  //1, 2, 3, 4, 5
			i++; //2, 3, 4, 5, 6
		}while(i<=5); // 3<=5, 4<=5, 5<=5, 6<=5
		
	}

}
