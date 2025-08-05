package selenium.java;

public class Day_11_MethodOverloading {

	public static void main(String[] args) {
		
		Addition add= new Addition();
		add.sum();
		add.sum(3, 5);
		add.sum(4, 5, 6);
		add.sum(4, 5, 6, 7);

		add.sum(100, 200, 300, "Rahul");

	}

}
