package selenium.java;

public class BuyProduct {

	static String custName;
	static String prodName;
	static int qty;
	static int price;
	static String city;
	static String state;
	static String address;

	public static void buyProduct() {

		int invoicePrice = qty * price;
		System.out.println(custName + " bought " + prodName + " of " + qty + " having total price is " + invoicePrice
				+ " prodcuct need to be delivered at " + state);

	}

	public static void buyProduct1() {

		int invoicePrice = qty * price;
		System.out.println(custName + " bought " + prodName + " of " + qty + " having total price is " + invoicePrice
				+ " prodcuct need to be delivered at " + city);

	}
}
