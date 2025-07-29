package selenium.java;

public class ForEachLoop {
	
	public static void forEachLoop() {
		
		int[] numbers= {10,5,20,30,40,50};
		//for (int num:numbers) {
		//	System.out.println(+num);
		//}
		System.out.println(+numbers[1]);
	
		for(int i=0; i<numbers.length; i++) {
			System.out.println(+numbers[i]);
		}
		
		
	}

}
